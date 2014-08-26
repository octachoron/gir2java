
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecUInt
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecUInt() {
        super();
    }

    public GParamSpecUInt(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gparamspecuint_field_maximum() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecUInt gparamspecuint_field_maximum(long gparamspecuint_field_maximum) {
        this.io.setLongField(this, 0, gparamspecuint_field_maximum);
        return this;
    }

    @Field(1)
    public GParamSpec gparamspecuint_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecUInt gparamspecuint_field_parent_instance(GParamSpec gparamspecuint_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, gparamspecuint_field_parent_instance);
        return this;
    }

    @Field(2)
    public long gparamspecuint_field_default_value() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GParamSpecUInt gparamspecuint_field_default_value(long gparamspecuint_field_default_value) {
        this.io.setLongField(this, 2, gparamspecuint_field_default_value);
        return this;
    }

    @Field(3)
    public long gparamspecuint_field_minimum() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GParamSpecUInt gparamspecuint_field_minimum(long gparamspecuint_field_minimum) {
        this.io.setLongField(this, 3, gparamspecuint_field_minimum);
        return this;
    }

}
