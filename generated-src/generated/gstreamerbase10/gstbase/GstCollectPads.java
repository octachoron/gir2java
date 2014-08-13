
package generated.gstreamerbase10.gstbase;

import generated.glib20.glib.GRecMutex;
import generated.glib20.glib.GSList;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstEvent;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstObject;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstQuery;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstCollectPads
    extends GstObject
{


    public GstCollectPads() {
        super();
    }

    public GstCollectPads(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_collect_pads_add_pad(
        @Ptr
        long pads,
        @Ptr
        long pad, long size, Object destroy_notify, boolean lock);

    public Pointer<GstCollectData> add_pad(Pointer<GstPad> pad, long size, Object destroy_notify, boolean lock) {
        return Pointer.pointerToAddress(this.gst_collect_pads_add_pad(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(pad), size, destroy_notify, lock), Pointer.class);
    }

    protected native long gst_collect_pads_available(
        @Ptr
        long pads);

    public long available() {
        return this.gst_collect_pads_available(Pointer.pointerTo(this, GstCollectPads.class));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_collect_pads_clip_running_time(
        @Ptr
        long pads,
        @Ptr
        long cdata,
        @Ptr
        long buf,
        @Ptr
        long outbuf, Pointer user_data);

    public IntValuedEnum<GstFlowReturn> clip_running_time(Pointer<GstCollectData> cdata, Pointer<GstBuffer> buf, Pointer<Pointer<GstBuffer>> outbuf, Pointer user_data) {
        return this.gst_collect_pads_clip_running_time(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(cdata), Pointer.getPeer(buf), Pointer.getPeer(outbuf), user_data);
    }

    protected native boolean gst_collect_pads_event_default(
        @Ptr
        long pads,
        @Ptr
        long data,
        @Ptr
        long event, boolean discard);

    public boolean event_default(Pointer<GstCollectData> data, Pointer<GstEvent> event, boolean discard) {
        return this.gst_collect_pads_event_default(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data), Pointer.getPeer(event), discard);
    }

    protected native long gst_collect_pads_flush(
        @Ptr
        long pads,
        @Ptr
        long data, long size);

    public long flush(Pointer<GstCollectData> data, long size) {
        return this.gst_collect_pads_flush(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data), size);
    }

    @Ptr
    protected native long gst_collect_pads_peek(
        @Ptr
        long pads,
        @Ptr
        long data);

    public Pointer<GstBuffer> peek(Pointer<GstCollectData> data) {
        return Pointer.pointerToAddress(this.gst_collect_pads_peek(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data)), Pointer.class);
    }

    @Ptr
    protected native long gst_collect_pads_pop(
        @Ptr
        long pads,
        @Ptr
        long data);

    public Pointer<GstBuffer> pop(Pointer<GstCollectData> data) {
        return Pointer.pointerToAddress(this.gst_collect_pads_pop(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data)), Pointer.class);
    }

    protected native boolean gst_collect_pads_query_default(
        @Ptr
        long pads,
        @Ptr
        long data,
        @Ptr
        long query, boolean discard);

    public boolean query_default(Pointer<GstCollectData> data, Pointer<GstQuery> query, boolean discard) {
        return this.gst_collect_pads_query_default(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data), Pointer.getPeer(query), discard);
    }

    @Ptr
    protected native long gst_collect_pads_read_buffer(
        @Ptr
        long pads,
        @Ptr
        long data, long size);

    public Pointer<GstBuffer> read_buffer(Pointer<GstCollectData> data, long size) {
        return Pointer.pointerToAddress(this.gst_collect_pads_read_buffer(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data), size), Pointer.class);
    }

    protected native boolean gst_collect_pads_remove_pad(
        @Ptr
        long pads,
        @Ptr
        long pad);

    public boolean remove_pad(Pointer<GstPad> pad) {
        return this.gst_collect_pads_remove_pad(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(pad));
    }

    protected native void gst_collect_pads_set_flushing(
        @Ptr
        long pads, boolean flushing);

    public void set_flushing(boolean flushing) {
        this.gst_collect_pads_set_flushing(Pointer.pointerTo(this, GstCollectPads.class), flushing);
    }

    protected native void gst_collect_pads_set_waiting(
        @Ptr
        long pads,
        @Ptr
        long data, boolean waiting);

    public void set_waiting(Pointer<GstCollectData> data, boolean waiting) {
        this.gst_collect_pads_set_waiting(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data), waiting);
    }

    protected native void gst_collect_pads_start(
        @Ptr
        long pads);

    public void start() {
        this.gst_collect_pads_start(Pointer.pointerTo(this, GstCollectPads.class));
    }

    protected native void gst_collect_pads_stop(
        @Ptr
        long pads);

    public void stop() {
        this.gst_collect_pads_stop(Pointer.pointerTo(this, GstCollectPads.class));
    }

    @Ptr
    protected native long gst_collect_pads_take_buffer(
        @Ptr
        long pads,
        @Ptr
        long data, long size);

    public Pointer<GstBuffer> take_buffer(Pointer<GstCollectData> data, long size) {
        return Pointer.pointerToAddress(this.gst_collect_pads_take_buffer(Pointer.pointerTo(this, GstCollectPads.class), Pointer.getPeer(data), size), Pointer.class);
    }

    @Field(0)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstCollectPads field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public Pointer<GSList> field_data() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstCollectPads field_data(Pointer<GSList> field_data) {
        this.io.setPointerField(this, 1, field_data);
        return this;
    }

    @Field(2)
    public GRecMutex field_stream_lock() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstCollectPads field_stream_lock(GRecMutex field_stream_lock) {
        this.io.setNativeObjectField(this, 2, field_stream_lock);
        return this;
    }

    @Field(3)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstCollectPads field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 3, field_priv);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstCollectPads field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    protected native void gst_collect_pads_set_query_function(
        @Ptr
        long pads, Object func, Pointer user_data);

    public void set_query_function(Object func, Pointer user_data) {
        this.gst_collect_pads_set_query_function(Pointer.pointerTo(this, GstCollectPads.class), func, user_data);
    }

    protected native void gst_collect_pads_set_compare_function(
        @Ptr
        long pads, Object func, Pointer user_data);

    public void set_compare_function(Object func, Pointer user_data) {
        this.gst_collect_pads_set_compare_function(Pointer.pointerTo(this, GstCollectPads.class), func, user_data);
    }

    protected native void gst_collect_pads_set_function(
        @Ptr
        long pads, Object func, Pointer user_data);

    public void set_function(Object func, Pointer user_data) {
        this.gst_collect_pads_set_function(Pointer.pointerTo(this, GstCollectPads.class), func, user_data);
    }

    protected native void gst_collect_pads_set_clip_function(
        @Ptr
        long pads, Object clipfunc, Pointer user_data);

    public void set_clip_function(Object clipfunc, Pointer user_data) {
        this.gst_collect_pads_set_clip_function(Pointer.pointerTo(this, GstCollectPads.class), clipfunc, user_data);
    }

    protected native void gst_collect_pads_set_event_function(
        @Ptr
        long pads, Object func, Pointer user_data);

    public void set_event_function(Object func, Pointer user_data) {
        this.gst_collect_pads_set_event_function(Pointer.pointerTo(this, GstCollectPads.class), func, user_data);
    }

    protected native void gst_collect_pads_set_buffer_function(
        @Ptr
        long pads, Object func, Pointer user_data);

    public void set_buffer_function(Object func, Pointer user_data) {
        this.gst_collect_pads_set_buffer_function(Pointer.pointerTo(this, GstCollectPads.class), func, user_data);
    }

}
