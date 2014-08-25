package gir2java.tests;

import generated.Gst;
import generated.glib20.glib.GMainLoop;
import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstElementFactory;
import generated.gstreamer10.gst.GstPipeline;
import generated.gstreamer10.gst.GstState;
import gir2java.tests.PlaybinTest.Shutdown;

import org.bridj.Pointer;

public class PipelineTest {

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
		
		Pointer<GstElement> source = (Pointer<GstElement>)GstElementFactory.make(
				Pointer.pointerToCString("videotestsrc"),
				Pointer.pointerToCString("source")
		);
		
		Pointer<GstElement> capsfilter = (Pointer<GstElement>)GstElementFactory.make(
				Pointer.pointerToCString("capsfilter"),
				Pointer.pointerToCString("capsf")
		);
		
		Pointer<GstElement> textoverlay = (Pointer<GstElement>)GstElementFactory.make(
				Pointer.pointerToCString("textoverlay"),
				Pointer.pointerToCString("text")
		);
		
		Pointer<GstElement> sink = (Pointer<GstElement>)GstElementFactory.make(
				Pointer.pointerToCString("autovideosink"),
				Pointer.pointerToCString("sink")
		);
		
		if (source == null || textoverlay == null || sink == null) {
			System.err.println("An element could not be created, exiting.");
			return;
		}
		
		Pointer<GstCaps> caps = 
				GstCaps.from_string(Pointer.pointerToCString("video/x-raw,width=352,height=288,framerate=30/1"));
		
		GObject.set(
				capsfilter,
				Pointer.pointerToCString("caps"),
				caps,
				null);
		
		//FIXME: unref
		
		GObject.set(
				textoverlay,
				Pointer.pointerToCString("text"),
				Pointer.pointerToCString("Assembling pipelines works!"),
				Pointer.pointerToCString("font-desc"),
				Pointer.pointerToCString("25"),
				null);
		
		GstPipeline pipeline = 
				GstPipeline.gstpipeline__new(Pointer.pointerToCString("the_pipeline")).as(GstPipeline.class).get();
		pipeline.add_many(source, capsfilter, textoverlay, sink, null);
		
		source.get().link_many(capsfilter, textoverlay, sink, null);
		
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
