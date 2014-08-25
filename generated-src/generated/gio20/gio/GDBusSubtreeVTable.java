
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusSubtreeVTable
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusSubtreeVTable() {
        super();
    }

    public GDBusSubtreeVTable(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gdbussubtreevtable_field_enumerate() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GDBusSubtreeVTable gdbussubtreevtable_field_enumerate(Pointer gdbussubtreevtable_field_enumerate) {
        this.io.setPointerField(this, 0, gdbussubtreevtable_field_enumerate);
        return this;
    }

    @Field(1)
    public Pointer gdbussubtreevtable_field_introspect() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusSubtreeVTable gdbussubtreevtable_field_introspect(Pointer gdbussubtreevtable_field_introspect) {
        this.io.setPointerField(this, 1, gdbussubtreevtable_field_introspect);
        return this;
    }

    @Field(2)
    public Pointer gdbussubtreevtable_field_dispatch() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusSubtreeVTable gdbussubtreevtable_field_dispatch(Pointer gdbussubtreevtable_field_dispatch) {
        this.io.setPointerField(this, 2, gdbussubtreevtable_field_dispatch);
        return this;
    }

    @Field(3)
    private Pointer gdbussubtreevtable_field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GDBusSubtreeVTable gdbussubtreevtable_field_padding(Pointer gdbussubtreevtable_field_padding) {
        this.io.setPointerField(this, 3, gdbussubtreevtable_field_padding);
        return this;
    }

}
