
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GParamSpecClass() {
        super();
    }

    public GParamSpecClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gparamspecclass_field_value_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecClass gparamspecclass_field_value_type(long gparamspecclass_field_value_type) {
        this.io.setLongField(this, 0, gparamspecclass_field_value_type);
        return this;
    }

    @Field(1)
    private Pointer gparamspecclass_field_dummy() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GParamSpecClass gparamspecclass_field_dummy(Pointer gparamspecclass_field_dummy) {
        this.io.setPointerField(this, 1, gparamspecclass_field_dummy);
        return this;
    }

    @Field(2)
    public GTypeClass gparamspecclass_field_g_type_class() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecClass gparamspecclass_field_g_type_class(GTypeClass gparamspecclass_field_g_type_class) {
        this.io.setNativeObjectField(this, 2, gparamspecclass_field_g_type_class);
        return this;
    }

}
