
package generated.gstreamer10.gst;

import generated.glib20.glib.GSource;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBus
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstBus() {
        super();
    }

    public GstBus(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_bus_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GstBus.gst_bus_new());
    }

    protected native void gst_bus_add_signal_watch(
        @Ptr
        long bus);

    public void add_signal_watch() {
        this.gst_bus_add_signal_watch(Pointer.pointerTo(this, GstBus.class).getPeer());
    }

    protected native void gst_bus_add_signal_watch_full(
        @Ptr
        long bus, int priority);

    public void add_signal_watch_full(int priority) {
        this.gst_bus_add_signal_watch_full(Pointer.pointerTo(this, GstBus.class).getPeer(), priority);
    }

    protected native boolean gst_bus_async_signal_func(
        @Ptr
        long bus,
        @Ptr
        long message,
        @Ptr
        long data);

    public boolean async_signal_func(Pointer message, Pointer data) {
        return this.gst_bus_async_signal_func(Pointer.pointerTo(this, GstBus.class).getPeer(), Pointer.getPeer(message), Pointer.getPeer(data));
    }

    @Ptr
    protected native long gst_bus_create_watch(
        @Ptr
        long bus);

    public Pointer<GSource> create_watch() {
        return Pointer.pointerToAddress(this.gst_bus_create_watch(Pointer.pointerTo(this, GstBus.class).getPeer()), GSource.class);
    }

    protected native void gst_bus_disable_sync_message_emission(
        @Ptr
        long bus);

    public void disable_sync_message_emission() {
        this.gst_bus_disable_sync_message_emission(Pointer.pointerTo(this, GstBus.class).getPeer());
    }

    protected native void gst_bus_enable_sync_message_emission(
        @Ptr
        long bus);

    public void enable_sync_message_emission() {
        this.gst_bus_enable_sync_message_emission(Pointer.pointerTo(this, GstBus.class).getPeer());
    }

    protected native boolean gst_bus_have_pending(
        @Ptr
        long bus);

    public boolean have_pending() {
        return this.gst_bus_have_pending(Pointer.pointerTo(this, GstBus.class).getPeer());
    }

    @Ptr
    protected native long gst_bus_peek(
        @Ptr
        long bus);

    public Pointer peek() {
        return Pointer.pointerToAddress(this.gst_bus_peek(Pointer.pointerTo(this, GstBus.class).getPeer()));
    }

    @Ptr
    protected native long gst_bus_pop(
        @Ptr
        long bus);

    public Pointer pop() {
        return Pointer.pointerToAddress(this.gst_bus_pop(Pointer.pointerTo(this, GstBus.class).getPeer()));
    }

    protected native boolean gst_bus_post(
        @Ptr
        long bus,
        @Ptr
        long message);

    public boolean post(Pointer message) {
        return this.gst_bus_post(Pointer.pointerTo(this, GstBus.class).getPeer(), Pointer.getPeer(message));
    }

    protected native void gst_bus_remove_signal_watch(
        @Ptr
        long bus);

    public void remove_signal_watch() {
        this.gst_bus_remove_signal_watch(Pointer.pointerTo(this, GstBus.class).getPeer());
    }

    protected native void gst_bus_set_flushing(
        @Ptr
        long bus, boolean flushing);

    public void set_flushing(boolean flushing) {
        this.gst_bus_set_flushing(Pointer.pointerTo(this, GstBus.class).getPeer(), flushing);
    }

    @Ptr
    protected native long gst_bus_timed_pop(
        @Ptr
        long bus, long timeout);

    public Pointer timed_pop(long timeout) {
        return Pointer.pointerToAddress(this.gst_bus_timed_pop(Pointer.pointerTo(this, GstBus.class).getPeer(), timeout));
    }

    protected native long gst_bus_add_watch_full(
        @Ptr
        long bus, int priority,
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public long add_watch_full(int priority, Pointer func, Pointer user_data, Pointer notify) {
        return this.gst_bus_add_watch_full(Pointer.pointerTo(this, GstBus.class).getPeer(), priority, Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native long gst_bus_add_watch(
        @Ptr
        long bus,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public long add_watch(Pointer func, Pointer user_data) {
        return this.gst_bus_add_watch(Pointer.pointerTo(this, GstBus.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    @Field(0)
    private Pointer<GstBusPrivate> gstbus_field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GstBus gstbus_field_priv(Pointer<GstBusPrivate> gstbus_field_priv) {
        this.io.setPointerField(this, 0, gstbus_field_priv);
        return this;
    }

    protected native void gst_bus_set_sync_handler(
        @Ptr
        long bus,
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_sync_handler(Pointer func, Pointer user_data, Pointer notify) {
        this.gst_bus_set_sync_handler(Pointer.pointerTo(this, GstBus.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(1)
    private Pointer gstbus_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstBus gstbus_field__gst_reserved(Pointer gstbus_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstbus_field__gst_reserved);
        return this;
    }

    protected native IntValuedEnum<GstBusSyncReply> gst_bus_sync_signal_handler(
        @Ptr
        long bus,
        @Ptr
        long message,
        @Ptr
        long data);

    public IntValuedEnum<GstBusSyncReply> sync_signal_handler(Pointer<GstMessage> message, Pointer data) {
        return this.gst_bus_sync_signal_handler(Pointer.pointerTo(this, GstBus.class).getPeer(), Pointer.getPeer(message), Pointer.getPeer(data));
    }

    @Ptr
    protected native long gst_bus_timed_pop_filtered(
        @Ptr
        long bus, long timeout, IntValuedEnum<GstMessageType> types);

    public Pointer<GstMessage> timed_pop_filtered(long timeout, IntValuedEnum<GstMessageType> types) {
        return Pointer.pointerToAddress(this.gst_bus_timed_pop_filtered(Pointer.pointerTo(this, GstBus.class).getPeer(), timeout, types), GstMessage.class);
    }

    @Field(2)
    public GstObject gstbus_field_object() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstBus gstbus_field_object(GstObject gstbus_field_object) {
        this.io.setNativeObjectField(this, 2, gstbus_field_object);
        return this;
    }

    @Ptr
    protected native long gst_bus_pop_filtered(
        @Ptr
        long bus, IntValuedEnum<GstMessageType> types);

    public Pointer<GstMessage> pop_filtered(IntValuedEnum<GstMessageType> types) {
        return Pointer.pointerToAddress(this.gst_bus_pop_filtered(Pointer.pointerTo(this, GstBus.class).getPeer(), types), GstMessage.class);
    }

    @Ptr
    protected native long gst_bus_poll(
        @Ptr
        long bus, IntValuedEnum<GstMessageType> events, long timeout);

    public Pointer<GstMessage> poll(IntValuedEnum<GstMessageType> events, long timeout) {
        return Pointer.pointerToAddress(this.gst_bus_poll(Pointer.pointerTo(this, GstBus.class).getPeer(), events, timeout), GstMessage.class);
    }

}
