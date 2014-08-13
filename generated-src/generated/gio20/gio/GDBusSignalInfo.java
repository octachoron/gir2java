
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusSignalInfo
    extends StructObject
{


    public GDBusSignalInfo() {
        super();
    }

    public GDBusSignalInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_ref_count() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusSignalInfo field_ref_count(int field_ref_count) {
        this.io.setNativeObjectField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusSignalInfo field_name(Pointer field_name) {
        this.io.setPointerField(this, 1, field_name);
        return this;
    }

    @Field(2)
    public Pointer<GDBusArgInfo> field_args() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusSignalInfo field_args(Pointer<GDBusArgInfo> field_args) {
        this.io.setPointerField(this, 2, field_args);
        return this;
    }

    @Field(3)
    public Pointer<GDBusAnnotationInfo> field_annotations() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusSignalInfo field_annotations(Pointer<GDBusAnnotationInfo> field_annotations) {
        this.io.setPointerField(this, 3, field_annotations);
        return this;
    }

    @Ptr
    protected native long g_dbus_signal_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_signal_info_ref(Pointer.pointerTo(this, GDBusSignalInfo.class)));
    }

    protected native void g_dbus_signal_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_signal_info_unref(Pointer.pointerTo(this, GDBusSignalInfo.class));
    }

}
