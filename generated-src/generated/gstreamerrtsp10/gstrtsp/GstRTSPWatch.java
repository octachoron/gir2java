
package generated.gstreamerrtsp10.gstrtsp;

import generated.glib20.glib.GMainContext;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPWatch
    extends StructObject
{


    public GstRTSPWatch() {
        super();
    }

    public GstRTSPWatch(Pointer pointer) {
        super(pointer);
    }

    protected native long gst_rtsp_watch_attach(
        @Ptr
        long watch,
        @Ptr
        long context);

    public long attach(Pointer<GMainContext> context) {
        return this.gst_rtsp_watch_attach(Pointer.pointerTo(this, GstRTSPWatch.class), Pointer.getPeer(context));
    }

    protected native void gst_rtsp_watch_get_send_backlog(
        @Ptr
        long watch,
        @Ptr
        long bytes,
        @Ptr
        long messages);

    public void get_send_backlog(Pointer<Long> bytes, Pointer<Long> messages) {
        this.gst_rtsp_watch_get_send_backlog(Pointer.pointerTo(this, GstRTSPWatch.class), Pointer.getPeer(bytes), Pointer.getPeer(messages));
    }

    protected native void gst_rtsp_watch_reset(
        @Ptr
        long watch);

    public void reset() {
        this.gst_rtsp_watch_reset(Pointer.pointerTo(this, GstRTSPWatch.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_watch_send_message(
        @Ptr
        long watch,
        @Ptr
        long message,
        @Ptr
        long id);

    public IntValuedEnum<GstRTSPResult> send_message(Pointer<GstRTSPMessage> message, Pointer<Long> id) {
        return this.gst_rtsp_watch_send_message(Pointer.pointerTo(this, GstRTSPWatch.class), Pointer.getPeer(message), Pointer.getPeer(id));
    }

    protected native void gst_rtsp_watch_set_send_backlog(
        @Ptr
        long watch, long bytes, long messages);

    public void set_send_backlog(long bytes, long messages) {
        this.gst_rtsp_watch_set_send_backlog(Pointer.pointerTo(this, GstRTSPWatch.class), bytes, messages);
    }

    protected native void gst_rtsp_watch_unref(
        @Ptr
        long watch);

    public void unref() {
        this.gst_rtsp_watch_unref(Pointer.pointerTo(this, GstRTSPWatch.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_watch_write_data(
        @Ptr
        long watch,
        @Ptr
        long data, long size,
        @Ptr
        long id);

    public IntValuedEnum<GstRTSPResult> write_data(short data, long size, Pointer<Long> id) {
        return this.gst_rtsp_watch_write_data(Pointer.pointerTo(this, GstRTSPWatch.class), Pointer.getPeer(data), size, Pointer.getPeer(id));
    }

    @Ptr
    protected native long gst_rtsp_watch_new(
        @Ptr
        long conn,
        @Ptr
        long funcs, Pointer user_data, Object notify);

    public Pointer _new(Pointer<GstRTSPConnection> conn, Pointer funcs, Pointer user_data, Object notify) {
        return Pointer.pointerToAddress(this.gst_rtsp_watch_new(Pointer.getPeer(conn), Pointer.getPeer(funcs), user_data, notify));
    }

}
