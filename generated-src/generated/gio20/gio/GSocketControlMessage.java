
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketControlMessage
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSocketControlMessage() {
        super();
    }

    public GSocketControlMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_socket_control_message_deserialize(int level, int type, long size,
        @Ptr
        long data);

    public static Pointer deserialize(int level, int type, long size, Pointer<Short> data) {
        return Pointer.pointerToAddress(GSocketControlMessage.g_socket_control_message_deserialize(level, type, size, Pointer.getPeer(data)));
    }

    protected native int g_socket_control_message_get_level(
        @Ptr
        long message);

    public int get_level() {
        return this.g_socket_control_message_get_level(Pointer.pointerTo(this, GSocketControlMessage.class).getPeer());
    }

    protected native int g_socket_control_message_get_msg_type(
        @Ptr
        long message);

    public int get_msg_type() {
        return this.g_socket_control_message_get_msg_type(Pointer.pointerTo(this, GSocketControlMessage.class).getPeer());
    }

    protected native long g_socket_control_message_get_size(
        @Ptr
        long message);

    public long get_size() {
        return this.g_socket_control_message_get_size(Pointer.pointerTo(this, GSocketControlMessage.class).getPeer());
    }

    protected native void g_socket_control_message_serialize(
        @Ptr
        long message,
        @Ptr
        long data);

    public void serialize(Pointer data) {
        this.g_socket_control_message_serialize(Pointer.pointerTo(this, GSocketControlMessage.class).getPeer(), Pointer.getPeer(data));
    }

    @Field(0)
    public GObject gsocketcontrolmessage_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketControlMessage gsocketcontrolmessage_field_parent_instance(GObject gsocketcontrolmessage_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gsocketcontrolmessage_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gsocketcontrolmessage_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketControlMessage gsocketcontrolmessage_field_priv(Pointer gsocketcontrolmessage_field_priv) {
        this.io.setPointerField(this, 1, gsocketcontrolmessage_field_priv);
        return this;
    }

}
