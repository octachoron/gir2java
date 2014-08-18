
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusArgInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusArgInfo() {
        super();
    }

    public GDBusArgInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusArgInfo field_ref_count(int field_ref_count) {
        this.io.setIntField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusArgInfo field_name(Pointer field_name) {
        this.io.setPointerField(this, 1, field_name);
        return this;
    }

    @Field(2)
    public Pointer field_signature() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusArgInfo field_signature(Pointer field_signature) {
        this.io.setPointerField(this, 2, field_signature);
        return this;
    }

    @Field(3)
    public Pointer<Pointer<GDBusAnnotationInfo>> field_annotations() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusArgInfo field_annotations(Pointer<Pointer<GDBusAnnotationInfo>> field_annotations) {
        this.io.setPointerField(this, 3, field_annotations);
        return this;
    }

    @Ptr
    protected native long g_dbus_arg_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_arg_info_ref(Pointer.pointerTo(this, GDBusArgInfo.class).getPeer()));
    }

    protected native void g_dbus_arg_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_arg_info_unref(Pointer.pointerTo(this, GDBusArgInfo.class).getPeer());
    }

}
