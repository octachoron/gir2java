
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
    public Pointer field_method_call() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceVTable field_method_call(Pointer field_method_call) {
        this.io.setPointerField(this, 0, field_method_call);
        return this;
    }

    @Field(1)
    public Pointer field_get_property() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusInterfaceVTable field_get_property(Pointer field_get_property) {
        this.io.setPointerField(this, 1, field_get_property);
        return this;
    }

    @Field(2)
    public Pointer field_set_property() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusInterfaceVTable field_set_property(Pointer field_set_property) {
        this.io.setPointerField(this, 2, field_set_property);
        return this;
    }

    @Field(3)
    private Pointer field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GDBusInterfaceVTable field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 3, field_padding);
        return this;
    }

}
