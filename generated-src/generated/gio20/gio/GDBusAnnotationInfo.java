
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusAnnotationInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusAnnotationInfo() {
        super();
    }

    public GDBusAnnotationInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gdbusannotationinfo_field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusAnnotationInfo gdbusannotationinfo_field_ref_count(int gdbusannotationinfo_field_ref_count) {
        this.io.setIntField(this, 0, gdbusannotationinfo_field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer gdbusannotationinfo_field_key() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusAnnotationInfo gdbusannotationinfo_field_key(Pointer gdbusannotationinfo_field_key) {
        this.io.setPointerField(this, 1, gdbusannotationinfo_field_key);
        return this;
    }

    @Field(2)
    public Pointer gdbusannotationinfo_field_value() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusAnnotationInfo gdbusannotationinfo_field_value(Pointer gdbusannotationinfo_field_value) {
        this.io.setPointerField(this, 2, gdbusannotationinfo_field_value);
        return this;
    }

    @Field(3)
    public Pointer gdbusannotationinfo_field_annotations() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusAnnotationInfo gdbusannotationinfo_field_annotations(Pointer gdbusannotationinfo_field_annotations) {
        this.io.setPointerField(this, 3, gdbusannotationinfo_field_annotations);
        return this;
    }

    @Ptr
    protected native long g_dbus_annotation_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_annotation_info_ref(Pointer.pointerTo(this, GDBusAnnotationInfo.class).getPeer()));
    }

    protected native void g_dbus_annotation_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_annotation_info_unref(Pointer.pointerTo(this, GDBusAnnotationInfo.class).getPeer());
    }

    @Ptr
    protected static native long g_dbus_annotation_info_lookup(
        @Ptr
        long annotations,
        @Ptr
        long name);

    public static Pointer lookup(Pointer annotations, Pointer name) {
        return Pointer.pointerToAddress(GDBusAnnotationInfo.g_dbus_annotation_info_lookup(Pointer.getPeer(annotations), Pointer.getPeer(name)));
    }

}
