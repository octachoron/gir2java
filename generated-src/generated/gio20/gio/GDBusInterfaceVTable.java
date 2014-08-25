
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusInterfaceVTable
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusInterfaceVTable() {
        super();
    }

    public GDBusInterfaceVTable(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gdbusinterfacevtable_field_method_call() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceVTable gdbusinterfacevtable_field_method_call(Pointer gdbusinterfacevtable_field_method_call) {
        this.io.setPointerField(this, 0, gdbusinterfacevtable_field_method_call);
        return this;
    }

    @Field(1)
    public Pointer gdbusinterfacevtable_field_get_property() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusInterfaceVTable gdbusinterfacevtable_field_get_property(Pointer gdbusinterfacevtable_field_get_property) {
        this.io.setPointerField(this, 1, gdbusinterfacevtable_field_get_property);
        return this;
    }

    @Field(2)
    public Pointer gdbusinterfacevtable_field_set_property() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusInterfaceVTable gdbusinterfacevtable_field_set_property(Pointer gdbusinterfacevtable_field_set_property) {
        this.io.setPointerField(this, 2, gdbusinterfacevtable_field_set_property);
        return this;
    }

    @Field(3)
    private Pointer gdbusinterfacevtable_field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GDBusInterfaceVTable gdbusinterfacevtable_field_padding(Pointer gdbusinterfacevtable_field_padding) {
        this.io.setPointerField(this, 3, gdbusinterfacevtable_field_padding);
        return this;
    }

}
