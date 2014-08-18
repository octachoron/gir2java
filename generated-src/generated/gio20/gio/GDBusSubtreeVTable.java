
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
    public Pointer field_enumerate() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GDBusSubtreeVTable field_enumerate(Pointer field_enumerate) {
        this.io.setPointerField(this, 0, field_enumerate);
        return this;
    }

    @Field(1)
    public Pointer field_introspect() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusSubtreeVTable field_introspect(Pointer field_introspect) {
        this.io.setPointerField(this, 1, field_introspect);
        return this;
    }

    @Field(2)
    public Pointer field_dispatch() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GDBusSubtreeVTable field_dispatch(Pointer field_dispatch) {
        this.io.setPointerField(this, 2, field_dispatch);
        return this;
    }

    @Field(3)
    private Pointer field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GDBusSubtreeVTable field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 3, field_padding);
        return this;
    }

}
