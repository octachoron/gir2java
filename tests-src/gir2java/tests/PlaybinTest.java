package gir2java.tests;

import generated.Gst;
import generated.glib20.glib.GMainLoop;
import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstElementFactory;
import generated.gstreamer10.gst.GstPipeline;
import generated.gstreamer10.gst.GstState;

import org.bridj.Pointer;

public class PlaybinTest {

	public static class Shutdown implements Runnable {
		private GMainLoop mainLoop;
		private long timeoutMillis;
		
		public Shutdown(GMainLoop mainLoop, long timeoutMillis) {
			this.mainLoop = mainLoop;
			this.timeoutMillis = timeoutMillis;
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(timeoutMillis);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mainLoop.quit();
		}
	}
	
	public static void main(String[] args) {
		Gst.init(null, null);
		
		Pointer<GMainLoop> mainLoopPointer = GMainLoop._new(null, false).as(GMainLoop.class);
		Pointer<GstElement> playbin = (Pointer<GstElement>)GstElementFactory.make(
				Pointer.pointerToCString("playbin"),
				Pointer.pointerToCString("the_playbin")
		);
		
		if (playbin == null) {
			System.err.println("The playbin could not be created.");
			return;
		}
		
		String uri = "file://" + System.getProperty("user.dir") + "/test.ogv";
		System.out.println("Trying to play " + uri);
		GObject.set(
				playbin,
				Pointer.pointerToCString("uri"),
				Pointer.pointerToCString(uri),
				null);
		
		GstPipeline pipeline = playbin.as(GstPipeline.class).get();
		pipeline.set_state(GstState.GST_STATE_PLAYING);
		GMainLoop mainLoop = mainLoopPointer.get();
		System.out.println("Everything seems OK so far, starting main loop");
		//TODO: use a proper bus watch to wait for EOS
		new Thread(new Shutdown(mainLoop, 5000), "Shutdown thread").start();
		mainLoop.run();
		//The fun stuff happens, then:
		System.out.println("Main loop finished");
		pipeline.set_state(GstState.GST_STATE_NULL);
		//FIXME: unref is not generated for some reason
	}
}
