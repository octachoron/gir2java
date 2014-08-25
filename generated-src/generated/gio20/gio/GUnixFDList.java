
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixFDList
    extends GObject
{


    static {
        BridJ.register();
    }

    public GUnixFDList() {
        super();
    }

    public GUnixFDList(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_unix_fd_list_new();

    public static Pointer gunixfdlist__new() {
        return Pointer.pointerToAddress(GUnixFDList.g_unix_fd_list_new());
    }

    @Ptr
    protected static native long g_unix_fd_list_new_from_array(
        @Ptr
        long fds, int n_fds);

    public static Pointer new_from_array(Pointer<Integer> fds, int n_fds) {
        return Pointer.pointerToAddress(GUnixFDList.g_unix_fd_list_new_from_array(Pointer.getPeer(fds), n_fds));
    }

    protected native int g_unix_fd_list_append(
        @Ptr
        long list, int fd);

    public int append(int fd) {
        return this.g_unix_fd_list_append(Pointer.pointerTo(this, GUnixFDList.class).getPeer(), fd);
    }

    protected native int g_unix_fd_list_get(
        @Ptr
        long list, int index_);

    public int gunixfdlist_get(int index_) {
        return this.g_unix_fd_list_get(Pointer.pointerTo(this, GUnixFDList.class).getPeer(), index_);
    }

    protected native int g_unix_fd_list_get_length(
        @Ptr
        long list);

    public int get_length() {
        return this.g_unix_fd_list_get_length(Pointer.pointerTo(this, GUnixFDList.class).getPeer());
    }

    @Ptr
    protected native long g_unix_fd_list_peek_fds(
        @Ptr
        long list,
        @Ptr
        long length);

    public Pointer<Integer> peek_fds(Pointer<Integer> length) {
        return Pointer.pointerToAddress(this.g_unix_fd_list_peek_fds(Pointer.pointerTo(this, GUnixFDList.class).getPeer(), Pointer.getPeer(length)), Integer.class);
    }

    @Ptr
    protected native long g_unix_fd_list_steal_fds(
        @Ptr
        long list,
        @Ptr
        long length);

    public Pointer<Integer> steal_fds(Pointer<Integer> length) {
        return Pointer.pointerToAddress(this.g_unix_fd_list_steal_fds(Pointer.pointerTo(this, GUnixFDList.class).getPeer(), Pointer.getPeer(length)), Integer.class);
    }

    @Field(0)
    public GObject gunixfdlist_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixFDList gunixfdlist_field_parent_instance(GObject gunixfdlist_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gunixfdlist_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gunixfdlist_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixFDList gunixfdlist_field_priv(Pointer gunixfdlist_field_priv) {
        this.io.setPointerField(this, 1, gunixfdlist_field_priv);
        return this;
    }

}
