
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusInterfaceSkeleton
    extends GObject
{


    public GDBusInterfaceSkeleton() {
        super();
    }

    public GDBusInterfaceSkeleton(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_dbus_interface_skeleton_export(
        @Ptr
        long interface_,
        @Ptr
        long connection,
        @Ptr
        long object_path);

    public boolean export(Pointer<GDBusConnection> connection, Pointer object_path) {
        return this.g_dbus_interface_skeleton_export(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class), Pointer.getPeer(connection), Pointer.getPeer(object_path));
    }

    protected native void g_dbus_interface_skeleton_flush(
        @Ptr
        long interface_);

    public void flush() {
        this.g_dbus_interface_skeleton_flush(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class));
    }

    @Ptr
    protected native long g_dbus_interface_skeleton_get_connection(
        @Ptr
        long interface_);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_interface_skeleton_get_connection(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_interface_skeleton_get_connections(
        @Ptr
        long interface_);

    public Pointer<GList> get_connections() {
        return Pointer.pointerToAddress(this.g_dbus_interface_skeleton_get_connections(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_interface_skeleton_get_info(
        @Ptr
        long interface_);

    public Pointer<GDBusInterfaceInfo> get_info() {
        return Pointer.pointerToAddress(this.g_dbus_interface_skeleton_get_info(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_interface_skeleton_get_object_path(
        @Ptr
        long interface_);

    public Pointer get_object_path() {
        return Pointer.pointerToAddress(this.g_dbus_interface_skeleton_get_object_path(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class)));
    }

    @Ptr
    protected native long g_dbus_interface_skeleton_get_properties(
        @Ptr
        long interface_);

    public Pointer<GVariant> get_properties() {
        return Pointer.pointerToAddress(this.g_dbus_interface_skeleton_get_properties(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_interface_skeleton_get_vtable(
        @Ptr
        long interface_);

    public Pointer get_vtable() {
        return Pointer.pointerToAddress(this.g_dbus_interface_skeleton_get_vtable(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class)));
    }

    protected native boolean g_dbus_interface_skeleton_has_connection(
        @Ptr
        long interface_,
        @Ptr
        long connection);

    public boolean has_connection(Pointer<GDBusConnection> connection) {
        return this.g_dbus_interface_skeleton_has_connection(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class), Pointer.getPeer(connection));
    }

    protected native void g_dbus_interface_skeleton_unexport(
        @Ptr
        long interface_);

    public void unexport() {
        this.g_dbus_interface_skeleton_unexport(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class));
    }

    protected native void g_dbus_interface_skeleton_unexport_from_connection(
        @Ptr
        long interface_,
        @Ptr
        long connection);

    public void unexport_from_connection(Pointer<GDBusConnection> connection) {
        this.g_dbus_interface_skeleton_unexport_from_connection(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class), Pointer.getPeer(connection));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceSkeleton field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusInterfaceSkeleton field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native Object g_dbus_interface_skeleton_get_flags(
        @Ptr
        long interface_);

    public Object get_flags() {
        return this.g_dbus_interface_skeleton_get_flags(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class));
    }

    protected native void g_dbus_interface_skeleton_set_flags(
        @Ptr
        long interface_, Object flags);

    public void set_flags(Object flags) {
        this.g_dbus_interface_skeleton_set_flags(Pointer.pointerTo(this, GDBusInterfaceSkeleton.class), flags);
    }

}
