
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusSignalInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusSignalInfo() {
        super();
    }

    public GDBusSignalInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gdbussignalinfo_field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusSignalInfo gdbussignalinfo_field_ref_count(int gdbussignalinfo_field_ref_count) {
        this.io.setIntField(this, 0, gdbussignalinfo_field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer gdbussignalinfo_field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusSignalInfo gdbussignalinfo_field_name(Pointer gdbussignalinfo_field_name) {
        this.io.setPointerField(this, 1, gdbussignalinfo_field_name);
        return this;
    }

    @Field(2)
    public Pointer<Pointer<GDBusArgInfo>> gdbussignalinfo_field_args() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusSignalInfo gdbussignalinfo_field_args(Pointer<Pointer<GDBusArgInfo>> gdbussignalinfo_field_args) {
        this.io.setPointerField(this, 2, gdbussignalinfo_field_args);
        return this;
    }

    @Field(3)
    public Pointer<Pointer<GDBusAnnotationInfo>> gdbussignalinfo_field_annotations() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusSignalInfo gdbussignalinfo_field_annotations(Pointer<Pointer<GDBusAnnotationInfo>> gdbussignalinfo_field_annotations) {
        this.io.setPointerField(this, 3, gdbussignalinfo_field_annotations);
        return this;
    }

    @Ptr
    protected native long g_dbus_signal_info_ref(
        @Ptr
        long info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_dbus_signal_info_ref(Pointer.pointerTo(this, GDBusSignalInfo.class).getPeer()));
    }

    protected native void g_dbus_signal_info_unref(
        @Ptr
        long info);

    public void unref() {
        this.g_dbus_signal_info_unref(Pointer.pointerTo(this, GDBusSignalInfo.class).getPeer());
    }

}
