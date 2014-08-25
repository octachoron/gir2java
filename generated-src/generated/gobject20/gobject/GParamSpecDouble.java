
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecDouble
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecDouble() {
        super();
    }

    public GParamSpecDouble(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public double gparamspecdouble_field_epsilon() {
        return this.io.getDoubleField(this, 0);
    }

    @Field(0)
    public GParamSpecDouble gparamspecdouble_field_epsilon(double gparamspecdouble_field_epsilon) {
        this.io.setDoubleField(this, 0, gparamspecdouble_field_epsilon);
        return this;
    }

    @Field(1)
    public double gparamspecdouble_field_default_value() {
        return this.io.getDoubleField(this, 1);
    }

    @Field(1)
    public GParamSpecDouble gparamspecdouble_field_default_value(double gparamspecdouble_field_default_value) {
        this.io.setDoubleField(this, 1, gparamspecdouble_field_default_value);
        return this;
    }

    @Field(2)
    public double gparamspecdouble_field_maximum() {
        return this.io.getDoubleField(this, 2);
    }

    @Field(2)
    public GParamSpecDouble gparamspecdouble_field_maximum(double gparamspecdouble_field_maximum) {
        this.io.setDoubleField(this, 2, gparamspecdouble_field_maximum);
        return this;
    }

    @Field(3)
    public GParamSpec gparamspecdouble_field_parent_instance() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GParamSpecDouble gparamspecdouble_field_parent_instance(GParamSpec gparamspecdouble_field_parent_instance) {
        this.io.setNativeObjectField(this, 3, gparamspecdouble_field_parent_instance);
        return this;
    }

    @Field(4)
    public double gparamspecdouble_field_minimum() {
        return this.io.getDoubleField(this, 4);
    }

    @Field(4)
    public GParamSpecDouble gparamspecdouble_field_minimum(double gparamspecdouble_field_minimum) {
        this.io.setDoubleField(this, 4, gparamspecdouble_field_minimum);
        return this;
    }

}
