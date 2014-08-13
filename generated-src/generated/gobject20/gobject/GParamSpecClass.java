
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecClass
    extends StructObject
{


    public GParamSpecClass() {
        super();
    }

    public GParamSpecClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_value_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecClass field_value_type(long field_value_type) {
        this.io.setNativeObjectField(this, 0, field_value_type);
        return this;
    }

    @Field(1)
    public GTypeClass field_g_type_class() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecClass field_g_type_class(GTypeClass field_g_type_class) {
        this.io.setNativeObjectField(this, 1, field_g_type_class);
        return this;
    }

    @Field(2)
    public Pointer field_dummy() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecClass field_dummy(Pointer field_dummy) {
        this.io.setPointerField(this, 2, field_dummy);
        return this;
    }

}
