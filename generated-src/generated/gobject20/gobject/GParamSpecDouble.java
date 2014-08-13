
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecDouble
    extends GParamSpec
{


    public GParamSpecDouble() {
        super();
    }

    public GParamSpecDouble(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecDouble field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public double field_minimum() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecDouble field_minimum(double field_minimum) {
        this.io.setNativeObjectField(this, 1, field_minimum);
        return this;
    }

    @Field(2)
    public double field_maximum() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecDouble field_maximum(double field_maximum) {
        this.io.setNativeObjectField(this, 2, field_maximum);
        return this;
    }

    @Field(3)
    public double field_default_value() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GParamSpecDouble field_default_value(double field_default_value) {
        this.io.setNativeObjectField(this, 3, field_default_value);
        return this;
    }

    @Field(4)
    public double field_epsilon() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GParamSpecDouble field_epsilon(double field_epsilon) {
        this.io.setNativeObjectField(this, 4, field_epsilon);
        return this;
    }

}
