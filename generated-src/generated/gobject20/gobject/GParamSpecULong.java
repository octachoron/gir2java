
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecULong
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecULong() {
        super();
    }

    public GParamSpecULong(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gparamspeculong_field_maximum() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecULong gparamspeculong_field_maximum(long gparamspeculong_field_maximum) {
        this.io.setLongField(this, 0, gparamspeculong_field_maximum);
        return this;
    }

    @Field(1)
    public long gparamspeculong_field_minimum() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GParamSpecULong gparamspeculong_field_minimum(long gparamspeculong_field_minimum) {
        this.io.setLongField(this, 1, gparamspeculong_field_minimum);
        return this;
    }

    @Field(2)
    public GParamSpec gparamspeculong_field_parent_instance() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecULong gparamspeculong_field_parent_instance(GParamSpec gparamspeculong_field_parent_instance) {
        this.io.setNativeObjectField(this, 2, gparamspeculong_field_parent_instance);
        return this;
    }

    @Field(3)
    public long gparamspeculong_field_default_value() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GParamSpecULong gparamspeculong_field_default_value(long gparamspeculong_field_default_value) {
        this.io.setLongField(this, 3, gparamspeculong_field_default_value);
        return this;
    }

}
