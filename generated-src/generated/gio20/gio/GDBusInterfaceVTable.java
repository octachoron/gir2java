
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusInterfaceVTable
    extends StructObject
{


    public GDBusInterfaceVTable() {
        super();
    }

    public GDBusInterfaceVTable(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_method_call() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceVTable field_method_call(Object field_method_call) {
        this.io.setNativeObjectField(this, 0, field_method_call);
        return this;
    }

    @Field(1)
    public Object field_get_property() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GDBusInterfaceVTable field_get_property(Object field_get_property) {
        this.io.setNativeObjectField(this, 1, field_get_property);
        return this;
    }

    @Field(2)
    public Object field_set_property() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GDBusInterfaceVTable field_set_property(Object field_set_property) {
        this.io.setNativeObjectField(this, 2, field_set_property);
        return this;
    }

    @Field(3)
    public Pointer field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GDBusInterfaceVTable field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 3, field_padding);
        return this;
    }

}
