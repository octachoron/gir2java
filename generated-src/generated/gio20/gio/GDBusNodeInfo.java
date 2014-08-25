
package generated.gio20.gio;

import generated.glib20.glib.GString;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusNodeInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusNodeInfo() {
        super();
    }

    public GDBusNodeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gdbusnodeinfo_field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusNodeInfo gdbusnodeinfo_field_ref_count(int gdbusnodeinfo_field_ref_count) {
        this.io.setIntField(this, 0, gdbusnodeinfo_field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer gdbusnodeinfo_field_path() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusNodeInfo gdbusnodeinfo_field_path(Pointer gdbusnodeinfo_field_path) {
        this.io.setPointerField(this, 1, gdbusnodeinfo_field_path);
        return this;
    }

    @Field(2)
    public Pointer<Pointer<GDBusInterfaceInfo>> gdbusnodeinfo_field_interfaces() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusNodeInfo gdbusnodeinfo_field_interfaces(Pointer<Pointer<GDBusInterfaceInfo>> gdbusnodeinfo_field_interfaces) {
        this.io.setPointerField(this, 2, gdbusnodeinfo_field_interfaces);
        return this;
    }

    @Field(3)
    public Pointer gdbusnodeinfo_field_nodes() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusNodeInfo gdbusnodeinfo_field_nodes(Pointer gdbusnodeinfo_field_nodes) {
        this.io.setPointerField(this, 3, gdbusnodeinfo_field_nodes);
        return this;
    }

    @Field(4)
    public Pointer<Pointer<GDBusAnnotationInfo>> gdbusnodeinfo_field_annotations() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GDBusNodeInfo gdbusnodeinfo_field_annotations(Pointer<Pointer<GDBusAnnotationInfo>> gdbusnodeinfo_field_annotations) {
        this.io.setPointerField(this, 4, gdbusnodeinfo_field_annotations);
        return this;
    }

    @Ptr
    protected static native long g_dbus_node_info_new_for_xml(
        @Ptr
        long xml_data);

    public static Pointer new_for_xml(Pointer xml_data) {
        return Pointer.pointerToAddress(GDBusNodeInfo.g_dbus_node_info_new_for_xml(Pointer.getPeer(xml_data)));
    }

    protected native void g_dbus_node_info_generate_xml(
        @Ptr
        long info, long indent,
        @Ptr
        long string_builder);

    public void generate_xml(long indent, Pointer<GString> string_builder) {
        this.g_dbus_node_info_generate_xml(Pointer.pointerTo(this, GDBusNodeInfo.class).getPeer(), indent, Pointer.getPeer(string_builder));
    }

    @Ptr
    protected native long g_dbus_node_info_lookup_interface(
        @Ptr
        long info,
        @Ptr
        long name);

    public Pointer<GDBusInterfaceInfo> lookup_interface(Pointer name) {
        return Pointer.pointerToAddress(this.g_dbus_node_info_lookup_interface(Pointer.pointerTo(this, GDBusNodeInfo.class).getPeer(), Pointer.getPeer(name)), GDBusInterfaceInfo.class);
    }

    @Ptr
    protected native long g_dbus_node_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_node_info_ref(Pointer.pointerTo(this, GDBusNodeInfo.class).getPeer()));
    }

    protected native void g_dbus_node_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_node_info_unref(Pointer.pointerTo(this, GDBusNodeInfo.class).getPeer());
    }

}
