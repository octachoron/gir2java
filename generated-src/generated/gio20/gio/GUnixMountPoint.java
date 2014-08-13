
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixMountPoint
    extends StructObject
{


    public GUnixMountPoint() {
        super();
    }

    public GUnixMountPoint(Pointer pointer) {
        super(pointer);
    }

    protected native int g_unix_mount_point_compare(
        @Ptr
        long mount1,
        @Ptr
        long mount2);

    public int compare(Pointer mount2) {
        return this.g_unix_mount_point_compare(Pointer.pointerTo(this, GUnixMountPoint.class), Pointer.getPeer(mount2));
    }

    protected native void g_unix_mount_point_free(
        @Ptr
        long mount_point);

    public void free() {
        this.g_unix_mount_point_free(Pointer.pointerTo(this, GUnixMountPoint.class));
    }

    @Ptr
    protected native long g_unix_mount_point_get_device_path(
        @Ptr
        long mount_point);

    public Pointer get_device_path() {
        return Pointer.pointerToAddress(this.g_unix_mount_point_get_device_path(Pointer.pointerTo(this, GUnixMountPoint.class)));
    }

    @Ptr
    protected native long g_unix_mount_point_get_fs_type(
        @Ptr
        long mount_point);

    public Pointer get_fs_type() {
        return Pointer.pointerToAddress(this.g_unix_mount_point_get_fs_type(Pointer.pointerTo(this, GUnixMountPoint.class)));
    }

    @Ptr
    protected native long g_unix_mount_point_get_mount_path(
        @Ptr
        long mount_point);

    public Pointer get_mount_path() {
        return Pointer.pointerToAddress(this.g_unix_mount_point_get_mount_path(Pointer.pointerTo(this, GUnixMountPoint.class)));
    }

    @Ptr
    protected native long g_unix_mount_point_get_options(
        @Ptr
        long mount_point);

    public Pointer get_options() {
        return Pointer.pointerToAddress(this.g_unix_mount_point_get_options(Pointer.pointerTo(this, GUnixMountPoint.class)));
    }

    protected native boolean g_unix_mount_point_guess_can_eject(
        @Ptr
        long mount_point);

    public boolean guess_can_eject() {
        return this.g_unix_mount_point_guess_can_eject(Pointer.pointerTo(this, GUnixMountPoint.class));
    }

    @Ptr
    protected native long g_unix_mount_point_guess_icon(
        @Ptr
        long mount_point);

    public Pointer<Object> guess_icon() {
        return Pointer.pointerToAddress(this.g_unix_mount_point_guess_icon(Pointer.pointerTo(this, GUnixMountPoint.class)), Pointer.class);
    }

    @Ptr
    protected native long g_unix_mount_point_guess_name(
        @Ptr
        long mount_point);

    public Pointer guess_name() {
        return Pointer.pointerToAddress(this.g_unix_mount_point_guess_name(Pointer.pointerTo(this, GUnixMountPoint.class)));
    }

    @Ptr
    protected native long g_unix_mount_point_guess_symbolic_icon(
        @Ptr
        long mount_point);

    public Pointer<Object> guess_symbolic_icon() {
        return Pointer.pointerToAddress(this.g_unix_mount_point_guess_symbolic_icon(Pointer.pointerTo(this, GUnixMountPoint.class)), Pointer.class);
    }

    protected native boolean g_unix_mount_point_is_loopback(
        @Ptr
        long mount_point);

    public boolean is_loopback() {
        return this.g_unix_mount_point_is_loopback(Pointer.pointerTo(this, GUnixMountPoint.class));
    }

    protected native boolean g_unix_mount_point_is_readonly(
        @Ptr
        long mount_point);

    public boolean is_readonly() {
        return this.g_unix_mount_point_is_readonly(Pointer.pointerTo(this, GUnixMountPoint.class));
    }

    protected native boolean g_unix_mount_point_is_user_mountable(
        @Ptr
        long mount_point);

    public boolean is_user_mountable() {
        return this.g_unix_mount_point_is_user_mountable(Pointer.pointerTo(this, GUnixMountPoint.class));
    }

}
