package gir2java.tests;

import generated.Gst;
import generated.glib20.glib.GMainLoop;
import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstBus;
import generated.gstreamer10.gst.GstBusFunc;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstElementFactory;
import generated.gstreamer10.gst.GstMessage;
import generated.gstreamer10.gst.GstMessageType;
import generated.gstreamer10.gst.GstPipeline;
import generated.gstreamer10.gst.GstState;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;

public class PlaybinTest {

	public static class BusWatch extends GstBusFunc {

		@Override
		public boolean apply(Pointer<GstBus> bus, Pointer message, Pointer user_data) {
			GMainLoop loop = (GMainLoop) user_data.as(GMainLoop.class).get();
			GstMessage gstMsg = (GstMessage) message.as(GstMessage.class).get();
			
			//Can we switch on enum values in a better way?
			IntValuedEnum<GstMessageType> msgType = gstMsg.gstmessage_field_type();
			
			if (msgType.value() == GstMessageType.GST_MESSAGE_TYPE_EOS.value()) {
				System.out.println("End of stream.");
				loop.quit();
			} else if (msgType.value() == GstMessageType.GST_MESSAGE_TYPE_ERROR.value()) {
				System.out.println("Error message received on pipeline bus.");
			}
			
			return true;
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
		
		GstBus bus = pipeline.get_bus().get();
		BusWatch busWatch = new BusWatch();
		bus.add_watch(Pointer.pointerTo(busWatch).as(GstBusFunc.class), mainLoopPointer);
		bus.gstobject_unref();
		
		mainLoop.run();
		//The fun stuff happens, then:
		System.out.println("Main loop finished");
		pipeline.set_state(GstState.GST_STATE_NULL);
		pipeline.gstobject_unref();
	}
}
