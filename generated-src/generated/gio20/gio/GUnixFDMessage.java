
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixFDMessage
    extends GSocketControlMessage
{


    static {
        BridJ.register();
    }

    public GUnixFDMessage() {
        super();
    }

    public GUnixFDMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_unix_fd_message_new();

    public static Pointer<GSocketControlMessage> gunixfdmessage__new() {
        return Pointer.pointerToAddress(GUnixFDMessage.g_unix_fd_message_new(), GSocketControlMessage.class);
    }

    @Ptr
    protected static native long g_unix_fd_message_new_with_fd_list(
        @Ptr
        long fd_list);

    public static Pointer<GSocketControlMessage> new_with_fd_list(Pointer<GUnixFDList> fd_list) {
        return Pointer.pointerToAddress(GUnixFDMessage.g_unix_fd_message_new_with_fd_list(Pointer.getPeer(fd_list)), GSocketControlMessage.class);
    }

    protected native boolean g_unix_fd_message_append_fd(
        @Ptr
        long message, int fd);

    public boolean append_fd(int fd) {
        return this.g_unix_fd_message_append_fd(Pointer.pointerTo(this, GUnixFDMessage.class).getPeer(), fd);
    }

    @Ptr
    protected native long g_unix_fd_message_get_fd_list(
        @Ptr
        long message);

    public Pointer<GUnixFDList> get_fd_list() {
        return Pointer.pointerToAddress(this.g_unix_fd_message_get_fd_list(Pointer.pointerTo(this, GUnixFDMessage.class).getPeer()), GUnixFDList.class);
    }

    @Ptr
    protected native long g_unix_fd_message_steal_fds(
        @Ptr
        long message,
        @Ptr
        long length);

    public Pointer<Integer> steal_fds(Pointer<Integer> length) {
        return Pointer.pointerToAddress(this.g_unix_fd_message_steal_fds(Pointer.pointerTo(this, GUnixFDMessage.class).getPeer(), Pointer.getPeer(length)), Integer.class);
    }

    @Field(0)
    public GSocketControlMessage gunixfdmessage_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixFDMessage gunixfdmessage_field_parent_instance(GSocketControlMessage gunixfdmessage_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gunixfdmessage_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gunixfdmessage_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixFDMessage gunixfdmessage_field_priv(Pointer gunixfdmessage_field_priv) {
        this.io.setPointerField(this, 1, gunixfdmessage_field_priv);
        return this;
    }

}
