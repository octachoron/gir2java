
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GVfs
    extends GObject
{


    public GVfs() {
        super();
    }

    public GVfs(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_vfs_get_default();

    public Pointer get_default() {
        return Pointer.pointerToAddress(this.g_vfs_get_default());
    }

    @Ptr
    protected native long g_vfs_get_local();

    public Pointer get_local() {
        return Pointer.pointerToAddress(this.g_vfs_get_local());
    }

    @Ptr
    protected native long g_vfs_get_file_for_path(
        @Ptr
        long vfs,
        @Ptr
        long path);

    public Pointer<Object> get_file_for_path(Pointer path) {
        return Pointer.pointerToAddress(this.g_vfs_get_file_for_path(Pointer.pointerTo(this, GVfs.class), Pointer.getPeer(path)), Pointer.class);
    }

    @Ptr
    protected native long g_vfs_get_file_for_uri(
        @Ptr
        long vfs,
        @Ptr
        long uri);

    public Pointer<Object> get_file_for_uri(Pointer uri) {
        return Pointer.pointerToAddress(this.g_vfs_get_file_for_uri(Pointer.pointerTo(this, GVfs.class), Pointer.getPeer(uri)), Pointer.class);
    }

    @Ptr
    protected native long g_vfs_get_supported_uri_schemes(
        @Ptr
        long vfs);

    public Pointer get_supported_uri_schemes() {
        return Pointer.pointerToAddress(this.g_vfs_get_supported_uri_schemes(Pointer.pointerTo(this, GVfs.class)));
    }

    protected native boolean g_vfs_is_active(
        @Ptr
        long vfs);

    public boolean is_active() {
        return this.g_vfs_is_active(Pointer.pointerTo(this, GVfs.class));
    }

    @Ptr
    protected native long g_vfs_parse_name(
        @Ptr
        long vfs,
        @Ptr
        long parse_name);

    public Pointer<Object> parse_name(Pointer parse_name) {
        return Pointer.pointerToAddress(this.g_vfs_parse_name(Pointer.pointerTo(this, GVfs.class), Pointer.getPeer(parse_name)), Pointer.class);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GVfs field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

}
