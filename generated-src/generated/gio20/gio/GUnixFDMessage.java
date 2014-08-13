
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixFDMessage
    extends GSocketControlMessage
{


    public GUnixFDMessage() {
        super();
    }

    public GUnixFDMessage(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_unix_fd_message_append_fd(
        @Ptr
        long message, int fd);

    public boolean append_fd(int fd) {
        return this.g_unix_fd_message_append_fd(Pointer.pointerTo(this, GUnixFDMessage.class), fd);
    }

    @Ptr
    protected native long g_unix_fd_message_get_fd_list(
        @Ptr
        long message);

    public Pointer<GUnixFDList> get_fd_list() {
        return Pointer.pointerToAddress(this.g_unix_fd_message_get_fd_list(Pointer.pointerTo(this, GUnixFDMessage.class)), Pointer.class);
    }

    @Ptr
    protected native long g_unix_fd_message_steal_fds(
        @Ptr
        long message,
        @Ptr
        long length);

    public int steal_fds(Pointer<Integer> length) {
        return Pointer.pointerToAddress(this.g_unix_fd_message_steal_fds(Pointer.pointerTo(this, GUnixFDMessage.class), Pointer.getPeer(length)), Integer.class);
    }

    @Field(0)
    public GSocketControlMessage field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixFDMessage field_parent_instance(GSocketControlMessage field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixFDMessage field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
