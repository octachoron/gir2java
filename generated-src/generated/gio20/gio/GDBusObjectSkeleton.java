
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusObjectSkeleton
    extends GObject
{


    public GDBusObjectSkeleton() {
        super();
    }

    public GDBusObjectSkeleton(Pointer pointer) {
        super(pointer);
    }

    protected native void g_dbus_object_skeleton_add_interface(
        @Ptr
        long object,
        @Ptr
        long interface_);

    public void add_interface(Pointer<GDBusInterfaceSkeleton> interface_) {
        this.g_dbus_object_skeleton_add_interface(Pointer.pointerTo(this, GDBusObjectSkeleton.class), Pointer.getPeer(interface_));
    }

    protected native void g_dbus_object_skeleton_flush(
        @Ptr
        long object);

    public void flush() {
        this.g_dbus_object_skeleton_flush(Pointer.pointerTo(this, GDBusObjectSkeleton.class));
    }

    protected native void g_dbus_object_skeleton_remove_interface(
        @Ptr
        long object,
        @Ptr
        long interface_);

    public void remove_interface(Pointer<GDBusInterfaceSkeleton> interface_) {
        this.g_dbus_object_skeleton_remove_interface(Pointer.pointerTo(this, GDBusObjectSkeleton.class), Pointer.getPeer(interface_));
    }

    protected native void g_dbus_object_skeleton_remove_interface_by_name(
        @Ptr
        long object,
        @Ptr
        long interface_name);

    public void remove_interface_by_name(Pointer interface_name) {
        this.g_dbus_object_skeleton_remove_interface_by_name(Pointer.pointerTo(this, GDBusObjectSkeleton.class), Pointer.getPeer(interface_name));
    }

    protected native void g_dbus_object_skeleton_set_object_path(
        @Ptr
        long object,
        @Ptr
        long object_path);

    public void set_object_path(Pointer object_path) {
        this.g_dbus_object_skeleton_set_object_path(Pointer.pointerTo(this, GDBusObjectSkeleton.class), Pointer.getPeer(object_path));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusObjectSkeleton field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusObjectSkeleton field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
