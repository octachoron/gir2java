
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecUInt
    extends GParamSpec
{


    public GParamSpecUInt() {
        super();
    }

    public GParamSpecUInt(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecUInt field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public long field_minimum() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecUInt field_minimum(long field_minimum) {
        this.io.setNativeObjectField(this, 1, field_minimum);
        return this;
    }

    @Field(2)
    public long field_maximum() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecUInt field_maximum(long field_maximum) {
        this.io.setNativeObjectField(this, 2, field_maximum);
        return this;
    }

    @Field(3)
    public long field_default_value() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GParamSpecUInt field_default_value(long field_default_value) {
        this.io.setNativeObjectField(this, 3, field_default_value);
        return this;
    }

}
