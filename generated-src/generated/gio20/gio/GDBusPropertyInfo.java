
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusPropertyInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusPropertyInfo() {
        super();
    }

    public GDBusPropertyInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gdbuspropertyinfo_field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusPropertyInfo gdbuspropertyinfo_field_ref_count(int gdbuspropertyinfo_field_ref_count) {
        this.io.setIntField(this, 0, gdbuspropertyinfo_field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer gdbuspropertyinfo_field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusPropertyInfo gdbuspropertyinfo_field_name(Pointer gdbuspropertyinfo_field_name) {
        this.io.setPointerField(this, 1, gdbuspropertyinfo_field_name);
        return this;
    }

    @Field(2)
    public Pointer gdbuspropertyinfo_field_signature() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusPropertyInfo gdbuspropertyinfo_field_signature(Pointer gdbuspropertyinfo_field_signature) {
        this.io.setPointerField(this, 2, gdbuspropertyinfo_field_signature);
        return this;
    }

    @Ptr
    protected native long g_dbus_property_info_ref(
        @Ptr
        long info);

    public Pointer<GDBusPropertyInfo> ref() {
        return Pointer.pointerToAddress(this.g_dbus_property_info_ref(Pointer.pointerTo(this, GDBusPropertyInfo.class).getPeer()), GDBusPropertyInfo.class);
    }

    @Field(3)
    public IntValuedEnum<GDBusPropertyInfoFlags> gdbuspropertyinfo_field_flags() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GDBusPropertyInfo gdbuspropertyinfo_field_flags(IntValuedEnum<GDBusPropertyInfoFlags> gdbuspropertyinfo_field_flags) {
        this.io.setEnumField(this, 3, gdbuspropertyinfo_field_flags);
        return this;
    }

    protected native void g_dbus_property_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_property_info_unref(Pointer.pointerTo(this, GDBusPropertyInfo.class).getPeer());
    }

    @Field(4)
    public Pointer<Pointer<GDBusAnnotationInfo>> gdbuspropertyinfo_field_annotations() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GDBusPropertyInfo gdbuspropertyinfo_field_annotations(Pointer<Pointer<GDBusAnnotationInfo>> gdbuspropertyinfo_field_annotations) {
        this.io.setPointerField(this, 4, gdbuspropertyinfo_field_annotations);
        return this;
    }

}
