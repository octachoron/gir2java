
package generated.gstreamerbase10.gstbase;

import generated.glib20.glib.GRecMutex;
import generated.glib20.glib.GSList;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstEvent;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstObject;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstQuery;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstCollectPads
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstCollectPads() {
        super();
    }

    public GstCollectPads(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_collect_pads_new();

    public static Pointer gstcollectpads__new() {
        return Pointer.pointerToAddress(GstCollectPads.gst_collect_pads_new());
    }

    @Ptr
    protected native long gst_collect_pads_add_pad(
        @Ptr
        long pads,
        @Ptr
        long pad, long size,
        @Ptr
        long destroy_notify, boolean lock);

    public Pointer<GstCollectData> add_pad(Pointer<GstPad> pad, long size, Pointer destroy_notify, boolean lock) {
        return Pointer.pointerToAddress(this.gst_collect_pads_add_pad(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(pad), size, Pointer.getPeer(destroy_notify), lock), GstCollectData.class);
    }

    protected native long gst_collect_pads_available(
        @Ptr
        long pads);

    public long available() {
        return this.gst_collect_pads_available(Pointer.pointerTo(this, GstCollectPads.class).getPeer());
    }

    protected native IntValuedEnum<GstFlowReturn> gst_collect_pads_clip_running_time(
        @Ptr
        long pads,
        @Ptr
        long cdata,
        @Ptr
        long buf,
        @Ptr
        long outbuf,
        @Ptr
        long user_data);

    public IntValuedEnum<GstFlowReturn> clip_running_time(Pointer<GstCollectData> cdata, Pointer<GstBuffer> buf, Pointer<Pointer<GstBuffer>> outbuf, Pointer user_data) {
        return this.gst_collect_pads_clip_running_time(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(cdata), Pointer.getPeer(buf), Pointer.getPeer(outbuf), Pointer.getPeer(user_data));
    }

    protected native boolean gst_collect_pads_event_default(
        @Ptr
        long pads,
        @Ptr
        long data,
        @Ptr
        long event, boolean discard);

    public boolean event_default(Pointer<GstCollectData> data, Pointer<GstEvent> event, boolean discard) {
        return this.gst_collect_pads_event_default(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(event), discard);
    }

    protected native long gst_collect_pads_flush(
        @Ptr
        long pads,
        @Ptr
        long data, long size);

    public long flush(Pointer<GstCollectData> data, long size) {
        return this.gst_collect_pads_flush(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data), size);
    }

    @Ptr
    protected native long gst_collect_pads_peek(
        @Ptr
        long pads,
        @Ptr
        long data);

    public Pointer<GstBuffer> peek(Pointer<GstCollectData> data) {
        return Pointer.pointerToAddress(this.gst_collect_pads_peek(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data)), GstBuffer.class);
    }

    @Ptr
    protected native long gst_collect_pads_pop(
        @Ptr
        long pads,
        @Ptr
        long data);

    public Pointer<GstBuffer> pop(Pointer<GstCollectData> data) {
        return Pointer.pointerToAddress(this.gst_collect_pads_pop(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data)), GstBuffer.class);
    }

    protected native boolean gst_collect_pads_query_default(
        @Ptr
        long pads,
        @Ptr
        long data,
        @Ptr
        long query, boolean discard);

    public boolean query_default(Pointer<GstCollectData> data, Pointer<GstQuery> query, boolean discard) {
        return this.gst_collect_pads_query_default(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(query), discard);
    }

    @Ptr
    protected native long gst_collect_pads_read_buffer(
        @Ptr
        long pads,
        @Ptr
        long data, long size);

    public Pointer<GstBuffer> read_buffer(Pointer<GstCollectData> data, long size) {
        return Pointer.pointerToAddress(this.gst_collect_pads_read_buffer(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data), size), GstBuffer.class);
    }

    protected native boolean gst_collect_pads_remove_pad(
        @Ptr
        long pads,
        @Ptr
        long pad);

    public boolean remove_pad(Pointer<GstPad> pad) {
        return this.gst_collect_pads_remove_pad(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(pad));
    }

    protected native void gst_collect_pads_set_flushing(
        @Ptr
        long pads, boolean flushing);

    public void set_flushing(boolean flushing) {
        this.gst_collect_pads_set_flushing(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), flushing);
    }

    protected native void gst_collect_pads_set_waiting(
        @Ptr
        long pads,
        @Ptr
        long data, boolean waiting);

    public void set_waiting(Pointer<GstCollectData> data, boolean waiting) {
        this.gst_collect_pads_set_waiting(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data), waiting);
    }

    protected native void gst_collect_pads_start(
        @Ptr
        long pads);

    public void start() {
        this.gst_collect_pads_start(Pointer.pointerTo(this, GstCollectPads.class).getPeer());
    }

    protected native void gst_collect_pads_stop(
        @Ptr
        long pads);

    public void stop() {
        this.gst_collect_pads_stop(Pointer.pointerTo(this, GstCollectPads.class).getPeer());
    }

    @Ptr
    protected native long gst_collect_pads_take_buffer(
        @Ptr
        long pads,
        @Ptr
        long data, long size);

    public Pointer<GstBuffer> take_buffer(Pointer<GstCollectData> data, long size) {
        return Pointer.pointerToAddress(this.gst_collect_pads_take_buffer(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(data), size), GstBuffer.class);
    }

    @Field(0)
    public GstObject gstcollectpads_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstCollectPads gstcollectpads_field_object(GstObject gstcollectpads_field_object) {
        this.io.setNativeObjectField(this, 0, gstcollectpads_field_object);
        return this;
    }

    @Field(1)
    public Pointer<GSList> gstcollectpads_field_data() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstCollectPads gstcollectpads_field_data(Pointer<GSList> gstcollectpads_field_data) {
        this.io.setPointerField(this, 1, gstcollectpads_field_data);
        return this;
    }

    @Field(2)
    private GRecMutex gstcollectpads_field_stream_lock() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    private GstCollectPads gstcollectpads_field_stream_lock(GRecMutex gstcollectpads_field_stream_lock) {
        this.io.setNativeObjectField(this, 2, gstcollectpads_field_stream_lock);
        return this;
    }

    @Field(3)
    private Pointer gstcollectpads_field_priv() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstCollectPads gstcollectpads_field_priv(Pointer gstcollectpads_field_priv) {
        this.io.setPointerField(this, 3, gstcollectpads_field_priv);
        return this;
    }

    @Field(4)
    private Pointer gstcollectpads_field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstCollectPads gstcollectpads_field__gst_reserved(Pointer gstcollectpads_field__gst_reserved) {
        this.io.setPointerField(this, 4, gstcollectpads_field__gst_reserved);
        return this;
    }

    protected native void gst_collect_pads_set_buffer_function(
        @Ptr
        long pads,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void set_buffer_function(Pointer func, Pointer user_data) {
        this.gst_collect_pads_set_buffer_function(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void gst_collect_pads_set_query_function(
        @Ptr
        long pads,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void set_query_function(Pointer func, Pointer user_data) {
        this.gst_collect_pads_set_query_function(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void gst_collect_pads_set_compare_function(
        @Ptr
        long pads,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void set_compare_function(Pointer func, Pointer user_data) {
        this.gst_collect_pads_set_compare_function(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void gst_collect_pads_set_event_function(
        @Ptr
        long pads,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void set_event_function(Pointer func, Pointer user_data) {
        this.gst_collect_pads_set_event_function(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void gst_collect_pads_set_function(
        @Ptr
        long pads,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void set_function(Pointer func, Pointer user_data) {
        this.gst_collect_pads_set_function(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void gst_collect_pads_set_clip_function(
        @Ptr
        long pads,
        @Ptr
        long clipfunc,
        @Ptr
        long user_data);

    public void set_clip_function(Pointer clipfunc, Pointer user_data) {
        this.gst_collect_pads_set_clip_function(Pointer.pointerTo(this, GstCollectPads.class).getPeer(), Pointer.getPeer(clipfunc), Pointer.getPeer(user_data));
    }

}
