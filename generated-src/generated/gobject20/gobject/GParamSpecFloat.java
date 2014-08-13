
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecFloat
    extends GParamSpec
{


    public GParamSpecFloat() {
        super();
    }

    public GParamSpecFloat(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecFloat field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public float field_minimum() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecFloat field_minimum(float field_minimum) {
        this.io.setNativeObjectField(this, 1, field_minimum);
        return this;
    }

    @Field(2)
    public float field_maximum() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecFloat field_maximum(float field_maximum) {
        this.io.setNativeObjectField(this, 2, field_maximum);
        return this;
    }

    @Field(3)
    public float field_default_value() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GParamSpecFloat field_default_value(float field_default_value) {
        this.io.setNativeObjectField(this, 3, field_default_value);
        return this;
    }

    @Field(4)
    public float field_epsilon() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GParamSpecFloat field_epsilon(float field_epsilon) {
        this.io.setNativeObjectField(this, 4, field_epsilon);
        return this;
    }

}
