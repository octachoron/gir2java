
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusInterfaceSkeletonClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusInterfaceSkeletonClass() {
        super();
    }

    public GDBusInterfaceSkeletonClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceSkeletonClass field_parent_class(GObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer field_vfunc_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusInterfaceSkeletonClass field_vfunc_padding(Pointer field_vfunc_padding) {
        this.io.setPointerField(this, 1, field_vfunc_padding);
        return this;
    }

    @Field(2)
    private Pointer field_signal_padding() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GDBusInterfaceSkeletonClass field_signal_padding(Pointer field_signal_padding) {
        this.io.setPointerField(this, 2, field_signal_padding);
        return this;
    }

}
