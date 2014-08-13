
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusSubtreeVTable
    extends StructObject
{


    public GDBusSubtreeVTable() {
        super();
    }

    public GDBusSubtreeVTable(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_enumerate() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusSubtreeVTable field_enumerate(Object field_enumerate) {
        this.io.setNativeObjectField(this, 0, field_enumerate);
        return this;
    }

    @Field(1)
    public Object field_introspect() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GDBusSubtreeVTable field_introspect(Object field_introspect) {
        this.io.setNativeObjectField(this, 1, field_introspect);
        return this;
    }

    @Field(2)
    public Object field_dispatch() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GDBusSubtreeVTable field_dispatch(Object field_dispatch) {
        this.io.setNativeObjectField(this, 2, field_dispatch);
        return this;
    }

    @Field(3)
    public Pointer field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusSubtreeVTable field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 3, field_padding);
        return this;
    }

}
