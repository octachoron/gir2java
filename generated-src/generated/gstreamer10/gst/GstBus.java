
package generated.gstreamer10.gst;

import generated.glib20.glib.GSource;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBus
    extends StructObject
{


    public GstBus() {
        super();
    }

    public GstBus(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_bus_add_signal_watch(
        @Ptr
        long bus);

    public void add_signal_watch() {
        this.gst_bus_add_signal_watch(Pointer.pointerTo(this, GstBus.class));
    }

    protected native void gst_bus_add_signal_watch_full(
        @Ptr
        long bus, int priority);

    public void add_signal_watch_full(int priority) {
        this.gst_bus_add_signal_watch_full(Pointer.pointerTo(this, GstBus.class), priority);
    }

    protected native boolean gst_bus_async_signal_func(
        @Ptr
        long bus,
        @Ptr
        long message, Pointer data);

    public boolean async_signal_func(Pointer message, Pointer data) {
        return this.gst_bus_async_signal_func(Pointer.pointerTo(this, GstBus.class), Pointer.getPeer(message), data);
    }

    @Ptr
    protected native long gst_bus_create_watch(
        @Ptr
        long bus);

    public Pointer<GSource> create_watch() {
        return Pointer.pointerToAddress(this.gst_bus_create_watch(Pointer.pointerTo(this, GstBus.class)), Pointer.class);
    }

    protected native void gst_bus_disable_sync_message_emission(
        @Ptr
        long bus);

    public void disable_sync_message_emission() {
        this.gst_bus_disable_sync_message_emission(Pointer.pointerTo(this, GstBus.class));
    }

    protected native void gst_bus_enable_sync_message_emission(
        @Ptr
        long bus);

    public void enable_sync_message_emission() {
        this.gst_bus_enable_sync_message_emission(Pointer.pointerTo(this, GstBus.class));
    }

    protected native boolean gst_bus_have_pending(
        @Ptr
        long bus);

    public boolean have_pending() {
        return this.gst_bus_have_pending(Pointer.pointerTo(this, GstBus.class));
    }

    @Ptr
    protected native long gst_bus_peek(
        @Ptr
        long bus);

    public Pointer peek() {
        return Pointer.pointerToAddress(this.gst_bus_peek(Pointer.pointerTo(this, GstBus.class)));
    }

    @Ptr
    protected native long gst_bus_pop(
        @Ptr
        long bus);

    public Pointer pop() {
        return Pointer.pointerToAddress(this.gst_bus_pop(Pointer.pointerTo(this, GstBus.class)));
    }

    protected native boolean gst_bus_post(
        @Ptr
        long bus,
        @Ptr
        long message);

    public boolean post(Pointer message) {
        return this.gst_bus_post(Pointer.pointerTo(this, GstBus.class), Pointer.getPeer(message));
    }

    protected native void gst_bus_remove_signal_watch(
        @Ptr
        long bus);

    public void remove_signal_watch() {
        this.gst_bus_remove_signal_watch(Pointer.pointerTo(this, GstBus.class));
    }

    protected native void gst_bus_set_flushing(
        @Ptr
        long bus, boolean flushing);

    public void set_flushing(boolean flushing) {
        this.gst_bus_set_flushing(Pointer.pointerTo(this, GstBus.class), flushing);
    }

    @Ptr
    protected native long gst_bus_timed_pop(
        @Ptr
        long bus, Object timeout);

    public Pointer timed_pop(Object timeout) {
        return Pointer.pointerToAddress(this.gst_bus_timed_pop(Pointer.pointerTo(this, GstBus.class), timeout));
    }

    protected native long gst_bus_add_watch(
        @Ptr
        long bus, Object func, Pointer user_data);

    public long add_watch(Object func, Pointer user_data) {
        return this.gst_bus_add_watch(Pointer.pointerTo(this, GstBus.class), func, user_data);
    }

    protected native long gst_bus_add_watch_full(
        @Ptr
        long bus, int priority, Object func, Pointer user_data, Object notify);

    public long add_watch_full(int priority, Object func, Pointer user_data, Object notify) {
        return this.gst_bus_add_watch_full(Pointer.pointerTo(this, GstBus.class), priority, func, user_data, notify);
    }

    @Ptr
    protected native long gst_bus_timed_pop_filtered(
        @Ptr
        long bus, Object timeout, Object types);

    public Pointer<GstMessage> timed_pop_filtered(Object timeout, Object types) {
        return Pointer.pointerToAddress(this.gst_bus_timed_pop_filtered(Pointer.pointerTo(this, GstBus.class), timeout, types), Pointer.class);
    }

    @Ptr
    protected native long gst_bus_poll(
        @Ptr
        long bus, Object events, Object timeout);

    public Pointer<GstMessage> poll(Object events, Object timeout) {
        return Pointer.pointerToAddress(this.gst_bus_poll(Pointer.pointerTo(this, GstBus.class), events, timeout), Pointer.class);
    }

    @Field(0)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBus field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public Pointer<GstBusPrivate> field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBus field_priv(Pointer<GstBusPrivate> field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstBus field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    protected native IntValuedEnum<GstBusSyncReply> gst_bus_sync_signal_handler(
        @Ptr
        long bus,
        @Ptr
        long message, Pointer data);

    public IntValuedEnum<GstBusSyncReply> sync_signal_handler(Pointer<GstMessage> message, Pointer data) {
        return this.gst_bus_sync_signal_handler(Pointer.pointerTo(this, GstBus.class), Pointer.getPeer(message), data);
    }

    @Ptr
    protected native long gst_bus_pop_filtered(
        @Ptr
        long bus, Object types);

    public Pointer<GstMessage> pop_filtered(Object types) {
        return Pointer.pointerToAddress(this.gst_bus_pop_filtered(Pointer.pointerTo(this, GstBus.class), types), Pointer.class);
    }

    protected native void gst_bus_set_sync_handler(
        @Ptr
        long bus, Object func, Pointer user_data, Object notify);

    public void set_sync_handler(Object func, Pointer user_data, Object notify) {
        this.gst_bus_set_sync_handler(Pointer.pointerTo(this, GstBus.class), func, user_data, notify);
    }

}
