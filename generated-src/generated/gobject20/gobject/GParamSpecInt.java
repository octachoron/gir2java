
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecInt
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecInt() {
        super();
    }

    public GParamSpecInt(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gparamspecint_field_maximum() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GParamSpecInt gparamspecint_field_maximum(int gparamspecint_field_maximum) {
        this.io.setIntField(this, 0, gparamspecint_field_maximum);
        return this;
    }

    @Field(1)
    public GParamSpec gparamspecint_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecInt gparamspecint_field_parent_instance(GParamSpec gparamspecint_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, gparamspecint_field_parent_instance);
        return this;
    }

    @Field(2)
    public int gparamspecint_field_default_value() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GParamSpecInt gparamspecint_field_default_value(int gparamspecint_field_default_value) {
        this.io.setIntField(this, 2, gparamspecint_field_default_value);
        return this;
    }

    @Field(3)
    public int gparamspecint_field_minimum() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GParamSpecInt gparamspecint_field_minimum(int gparamspecint_field_minimum) {
        this.io.setIntField(this, 3, gparamspecint_field_minimum);
        return this;
    }

}
