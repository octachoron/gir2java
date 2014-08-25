
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
    public GObjectClass gdbusinterfaceskeletonclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceSkeletonClass gdbusinterfaceskeletonclass_field_parent_class(GObjectClass gdbusinterfaceskeletonclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gdbusinterfaceskeletonclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gdbusinterfaceskeletonclass_field_vfunc_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusInterfaceSkeletonClass gdbusinterfaceskeletonclass_field_vfunc_padding(Pointer gdbusinterfaceskeletonclass_field_vfunc_padding) {
        this.io.setPointerField(this, 1, gdbusinterfaceskeletonclass_field_vfunc_padding);
        return this;
    }

    @Field(2)
    private Pointer gdbusinterfaceskeletonclass_field_signal_padding() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GDBusInterfaceSkeletonClass gdbusinterfaceskeletonclass_field_signal_padding(Pointer gdbusinterfaceskeletonclass_field_signal_padding) {
        this.io.setPointerField(this, 2, gdbusinterfaceskeletonclass_field_signal_padding);
        return this;
    }

}
