
package generated.gio20.gio;

import generated.glib20.glib.GString;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusInterfaceInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusInterfaceInfo() {
        super();
    }

    public GDBusInterfaceInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceInfo field_ref_count(int field_ref_count) {
        this.io.setIntField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusInterfaceInfo field_name(Pointer field_name) {
        this.io.setPointerField(this, 1, field_name);
        return this;
    }

    @Field(2)
    public Pointer field_methods() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusInterfaceInfo field_methods(Pointer field_methods) {
        this.io.setPointerField(this, 2, field_methods);
        return this;
    }

    @Field(3)
    public Pointer field_signals() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusInterfaceInfo field_signals(Pointer field_signals) {
        this.io.setPointerField(this, 3, field_signals);
        return this;
    }

    @Field(4)
    public Pointer field_properties() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GDBusInterfaceInfo field_properties(Pointer field_properties) {
        this.io.setPointerField(this, 4, field_properties);
        return this;
    }

    @Field(5)
    public Pointer<Pointer<GDBusAnnotationInfo>> field_annotations() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GDBusInterfaceInfo field_annotations(Pointer<Pointer<GDBusAnnotationInfo>> field_annotations) {
        this.io.setPointerField(this, 5, field_annotations);
        return this;
    }

    protected native void g_dbus_interface_info_cache_build(
        @Ptr
        long info);

    public void cache_build() {
        this.g_dbus_interface_info_cache_build(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer());
    }

    protected native void g_dbus_interface_info_cache_release(
        @Ptr
        long info);

    public void cache_release() {
        this.g_dbus_interface_info_cache_release(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer());
    }

    protected native void g_dbus_interface_info_generate_xml(
        @Ptr
        long info, long indent,
        @Ptr
        long string_builder);

    public void generate_xml(long indent, Pointer<GString> string_builder) {
        this.g_dbus_interface_info_generate_xml(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer(), indent, Pointer.getPeer(string_builder));
    }

    @Ptr
    protected native long g_dbus_interface_info_lookup_method(
        @Ptr
        long info,
        @Ptr
        long name);

    public Pointer lookup_method(Pointer name) {
        return Pointer.pointerToAddress(this.g_dbus_interface_info_lookup_method(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer(), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long g_dbus_interface_info_lookup_property(
        @Ptr
        long info,
        @Ptr
        long name);

    public Pointer lookup_property(Pointer name) {
        return Pointer.pointerToAddress(this.g_dbus_interface_info_lookup_property(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer(), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long g_dbus_interface_info_lookup_signal(
        @Ptr
        long info,
        @Ptr
        long name);

    public Pointer lookup_signal(Pointer name) {
        return Pointer.pointerToAddress(this.g_dbus_interface_info_lookup_signal(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer(), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long g_dbus_interface_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_interface_info_ref(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer()));
    }

    protected native void g_dbus_interface_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_interface_info_unref(Pointer.pointerTo(this, GDBusInterfaceInfo.class).getPeer());
    }

}
