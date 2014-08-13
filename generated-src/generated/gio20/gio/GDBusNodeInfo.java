
package generated.gio20.gio;

import generated.glib20.glib.GString;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusNodeInfo
    extends StructObject
{


    public GDBusNodeInfo() {
        super();
    }

    public GDBusNodeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_ref_count() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusNodeInfo field_ref_count(int field_ref_count) {
        this.io.setNativeObjectField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer field_path() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusNodeInfo field_path(Pointer field_path) {
        this.io.setPointerField(this, 1, field_path);
        return this;
    }

    @Field(2)
    public Pointer<GDBusInterfaceInfo> field_interfaces() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusNodeInfo field_interfaces(Pointer<GDBusInterfaceInfo> field_interfaces) {
        this.io.setPointerField(this, 2, field_interfaces);
        return this;
    }

    @Field(3)
    public Pointer field_nodes() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusNodeInfo field_nodes(Pointer field_nodes) {
        this.io.setPointerField(this, 3, field_nodes);
        return this;
    }

    @Field(4)
    public Pointer<GDBusAnnotationInfo> field_annotations() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GDBusNodeInfo field_annotations(Pointer<GDBusAnnotationInfo> field_annotations) {
        this.io.setPointerField(this, 4, field_annotations);
        return this;
    }

    protected native void g_dbus_node_info_generate_xml(
        @Ptr
        long info, long indent,
        @Ptr
        long string_builder);

    public void generate_xml(long indent, Pointer<GString> string_builder) {
        this.g_dbus_node_info_generate_xml(Pointer.pointerTo(this, GDBusNodeInfo.class), indent, Pointer.getPeer(string_builder));
    }

    @Ptr
    protected native long g_dbus_node_info_lookup_interface(
        @Ptr
        long info,
        @Ptr
        long name);

    public Pointer<GDBusInterfaceInfo> lookup_interface(Pointer name) {
        return Pointer.pointerToAddress(this.g_dbus_node_info_lookup_interface(Pointer.pointerTo(this, GDBusNodeInfo.class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_node_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_node_info_ref(Pointer.pointerTo(this, GDBusNodeInfo.class)));
    }

    protected native void g_dbus_node_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_node_info_unref(Pointer.pointerTo(this, GDBusNodeInfo.class));
    }

}
