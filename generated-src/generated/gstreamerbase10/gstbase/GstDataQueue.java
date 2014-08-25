
package generated.gstreamerbase10.gstbase;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstDataQueue
    extends GObject
{


    static {
        BridJ.register();
    }

    public GstDataQueue() {
        super();
    }

    public GstDataQueue(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_data_queue_drop_head(
        @Ptr
        long queue, long type);

    public boolean drop_head(long type) {
        return this.gst_data_queue_drop_head(Pointer.pointerTo(this, GstDataQueue.class).getPeer(), type);
    }

    protected native void gst_data_queue_flush(
        @Ptr
        long queue);

    public void flush() {
        this.gst_data_queue_flush(Pointer.pointerTo(this, GstDataQueue.class).getPeer());
    }

    protected native void gst_data_queue_get_level(
        @Ptr
        long queue,
        @Ptr
        long level);

    public void get_level(Pointer level) {
        this.gst_data_queue_get_level(Pointer.pointerTo(this, GstDataQueue.class).getPeer(), Pointer.getPeer(level));
    }

    protected native boolean gst_data_queue_is_empty(
        @Ptr
        long queue);

    public boolean is_empty() {
        return this.gst_data_queue_is_empty(Pointer.pointerTo(this, GstDataQueue.class).getPeer());
    }

    protected native boolean gst_data_queue_is_full(
        @Ptr
        long queue);

    public boolean is_full() {
        return this.gst_data_queue_is_full(Pointer.pointerTo(this, GstDataQueue.class).getPeer());
    }

    protected native void gst_data_queue_limits_changed(
        @Ptr
        long queue);

    public void limits_changed() {
        this.gst_data_queue_limits_changed(Pointer.pointerTo(this, GstDataQueue.class).getPeer());
    }

    protected native boolean gst_data_queue_peek(
        @Ptr
        long queue,
        @Ptr
        long item);

    public boolean peek(Pointer item) {
        return this.gst_data_queue_peek(Pointer.pointerTo(this, GstDataQueue.class).getPeer(), Pointer.getPeer(item));
    }

    protected native boolean gst_data_queue_pop(
        @Ptr
        long queue,
        @Ptr
        long item);

    public boolean pop(Pointer item) {
        return this.gst_data_queue_pop(Pointer.pointerTo(this, GstDataQueue.class).getPeer(), Pointer.getPeer(item));
    }

    protected native boolean gst_data_queue_push(
        @Ptr
        long queue,
        @Ptr
        long item);

    public boolean push(Pointer item) {
        return this.gst_data_queue_push(Pointer.pointerTo(this, GstDataQueue.class).getPeer(), Pointer.getPeer(item));
    }

    protected native boolean gst_data_queue_push_force(
        @Ptr
        long queue,
        @Ptr
        long item);

    public boolean push_force(Pointer item) {
        return this.gst_data_queue_push_force(Pointer.pointerTo(this, GstDataQueue.class).getPeer(), Pointer.getPeer(item));
    }

    protected native void gst_data_queue_set_flushing(
        @Ptr
        long queue, boolean flushing);

    public void set_flushing(boolean flushing) {
        this.gst_data_queue_set_flushing(Pointer.pointerTo(this, GstDataQueue.class).getPeer(), flushing);
    }

    @Field(0)
    public GObject gstdataqueue_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstDataQueue gstdataqueue_field_object(GObject gstdataqueue_field_object) {
        this.io.setNativeObjectField(this, 0, gstdataqueue_field_object);
        return this;
    }

    @Field(1)
    private Pointer gstdataqueue_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstDataQueue gstdataqueue_field_priv(Pointer gstdataqueue_field_priv) {
        this.io.setPointerField(this, 1, gstdataqueue_field_priv);
        return this;
    }

    @Field(2)
    private Pointer gstdataqueue_field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstDataQueue gstdataqueue_field__gst_reserved(Pointer gstdataqueue_field__gst_reserved) {
        this.io.setPointerField(this, 2, gstdataqueue_field__gst_reserved);
        return this;
    }

    @Ptr
    protected static native long gst_data_queue_new(
        @Ptr
        long checkfull,
        @Ptr
        long fullcallback,
        @Ptr
        long emptycallback,
        @Ptr
        long checkdata);

    public static Pointer<GstDataQueue> gstdataqueue__new(Pointer checkfull, Pointer fullcallback, Pointer emptycallback, Pointer checkdata) {
        return Pointer.pointerToAddress(GstDataQueue.gst_data_queue_new(Pointer.getPeer(checkfull), Pointer.getPeer(fullcallback), Pointer.getPeer(emptycallback), Pointer.getPeer(checkdata)), GstDataQueue.class);
    }

}
