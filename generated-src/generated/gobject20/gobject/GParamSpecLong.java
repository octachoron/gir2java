
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecLong
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecLong() {
        super();
    }

    public GParamSpecLong(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gparamspeclong_field_default_value() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecLong gparamspeclong_field_default_value(long gparamspeclong_field_default_value) {
        this.io.setLongField(this, 0, gparamspeclong_field_default_value);
        return this;
    }

    @Field(1)
    public GParamSpec gparamspeclong_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecLong gparamspeclong_field_parent_instance(GParamSpec gparamspeclong_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, gparamspeclong_field_parent_instance);
        return this;
    }

    @Field(2)
    public long gparamspeclong_field_minimum() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GParamSpecLong gparamspeclong_field_minimum(long gparamspeclong_field_minimum) {
        this.io.setLongField(this, 2, gparamspeclong_field_minimum);
        return this;
    }

    @Field(3)
    public long gparamspeclong_field_maximum() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GParamSpecLong gparamspeclong_field_maximum(long gparamspeclong_field_maximum) {
        this.io.setLongField(this, 3, gparamspeclong_field_maximum);
        return this;
    }

}
