
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixFDList
    extends GObject
{


    public GUnixFDList() {
        super();
    }

    public GUnixFDList(Pointer pointer) {
        super(pointer);
    }

    protected native int g_unix_fd_list_append(
        @Ptr
        long list, int fd);

    public int append(int fd) {
        return this.g_unix_fd_list_append(Pointer.pointerTo(this, GUnixFDList.class), fd);
    }

    protected native int g_unix_fd_list_get(
        @Ptr
        long list, int index_);

    public int get(int index_) {
        return this.g_unix_fd_list_get(Pointer.pointerTo(this, GUnixFDList.class), index_);
    }

    protected native int g_unix_fd_list_get_length(
        @Ptr
        long list);

    public int get_length() {
        return this.g_unix_fd_list_get_length(Pointer.pointerTo(this, GUnixFDList.class));
    }

    @Ptr
    protected native long g_unix_fd_list_peek_fds(
        @Ptr
        long list,
        @Ptr
        long length);

    public int peek_fds(Pointer<Integer> length) {
        return Pointer.pointerToAddress(this.g_unix_fd_list_peek_fds(Pointer.pointerTo(this, GUnixFDList.class), Pointer.getPeer(length)), Integer.class);
    }

    @Ptr
    protected native long g_unix_fd_list_steal_fds(
        @Ptr
        long list,
        @Ptr
        long length);

    public int steal_fds(Pointer<Integer> length) {
        return Pointer.pointerToAddress(this.g_unix_fd_list_steal_fds(Pointer.pointerTo(this, GUnixFDList.class), Pointer.getPeer(length)), Integer.class);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixFDList field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixFDList field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
