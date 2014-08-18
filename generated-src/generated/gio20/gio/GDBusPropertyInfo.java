
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
    public int field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusPropertyInfo field_ref_count(int field_ref_count) {
        this.io.setIntField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusPropertyInfo field_name(Pointer field_name) {
        this.io.setPointerField(this, 1, field_name);
        return this;
    }

    @Field(2)
    public Pointer field_signature() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusPropertyInfo field_signature(Pointer field_signature) {
        this.io.setPointerField(this, 2, field_signature);
        return this;
    }

    @Ptr
    protected native long g_dbus_property_info_ref(
        @Ptr
        long info);

    public Pointer<GDBusPropertyInfo> ref() {
        return Pointer.pointerToAddress(this.g_dbus_property_info_ref(Pointer.pointerTo(this, GDBusPropertyInfo.class).getPeer()), GDBusPropertyInfo.class);
    }

    protected native void g_dbus_property_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_property_info_unref(Pointer.pointerTo(this, GDBusPropertyInfo.class).getPeer());
    }

    @Field(3)
    public Pointer<Pointer<GDBusAnnotationInfo>> field_annotations() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusPropertyInfo field_annotations(Pointer<Pointer<GDBusAnnotationInfo>> field_annotations) {
        this.io.setPointerField(this, 3, field_annotations);
        return this;
    }

    @Field(4)
    public IntValuedEnum<GDBusPropertyInfoFlags> field_flags() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public GDBusPropertyInfo field_flags(IntValuedEnum<GDBusPropertyInfoFlags> field_flags) {
        this.io.setEnumField(this, 4, field_flags);
        return this;
    }

}
