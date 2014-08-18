
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusMethodInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusMethodInfo() {
        super();
    }

    public GDBusMethodInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusMethodInfo field_ref_count(int field_ref_count) {
        this.io.setIntField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusMethodInfo field_name(Pointer field_name) {
        this.io.setPointerField(this, 1, field_name);
        return this;
    }

    @Field(2)
    public Pointer<Pointer<GDBusArgInfo>> field_in_args() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusMethodInfo field_in_args(Pointer<Pointer<GDBusArgInfo>> field_in_args) {
        this.io.setPointerField(this, 2, field_in_args);
        return this;
    }

    @Field(3)
    public Pointer<Pointer<GDBusArgInfo>> field_out_args() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusMethodInfo field_out_args(Pointer<Pointer<GDBusArgInfo>> field_out_args) {
        this.io.setPointerField(this, 3, field_out_args);
        return this;
    }

    @Field(4)
    public Pointer<Pointer<GDBusAnnotationInfo>> field_annotations() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GDBusMethodInfo field_annotations(Pointer<Pointer<GDBusAnnotationInfo>> field_annotations) {
        this.io.setPointerField(this, 4, field_annotations);
        return this;
    }

    @Ptr
    protected native long g_dbus_method_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_method_info_ref(Pointer.pointerTo(this, GDBusMethodInfo.class).getPeer()));
    }

    protected native void g_dbus_method_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_method_info_unref(Pointer.pointerTo(this, GDBusMethodInfo.class).getPeer());
    }

}
