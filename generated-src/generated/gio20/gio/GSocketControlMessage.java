
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketControlMessage
    extends GObject
{


    public GSocketControlMessage() {
        super();
    }

    public GSocketControlMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_socket_control_message_deserialize(int level, int type, long size,
        @Ptr
        long data);

    public Pointer deserialize(int level, int type, long size, short data) {
        return Pointer.pointerToAddress(this.g_socket_control_message_deserialize(level, type, size, Pointer.getPeer(data)));
    }

    protected native int g_socket_control_message_get_level(
        @Ptr
        long message);

    public int get_level() {
        return this.g_socket_control_message_get_level(Pointer.pointerTo(this, GSocketControlMessage.class));
    }

    protected native int g_socket_control_message_get_msg_type(
        @Ptr
        long message);

    public int get_msg_type() {
        return this.g_socket_control_message_get_msg_type(Pointer.pointerTo(this, GSocketControlMessage.class));
    }

    protected native long g_socket_control_message_get_size(
        @Ptr
        long message);

    public long get_size() {
        return this.g_socket_control_message_get_size(Pointer.pointerTo(this, GSocketControlMessage.class));
    }

    protected native void g_socket_control_message_serialize(
        @Ptr
        long message, Pointer data);

    public void serialize(Pointer data) {
        this.g_socket_control_message_serialize(Pointer.pointerTo(this, GSocketControlMessage.class), data);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketControlMessage field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketControlMessage field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
