
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
    public int field_maximum() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GParamSpecInt field_maximum(int field_maximum) {
        this.io.setIntField(this, 0, field_maximum);
        return this;
    }

    @Field(1)
    public int field_default_value() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GParamSpecInt field_default_value(int field_default_value) {
        this.io.setIntField(this, 1, field_default_value);
        return this;
    }

    @Field(2)
    public int field_minimum() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GParamSpecInt field_minimum(int field_minimum) {
        this.io.setIntField(this, 2, field_minimum);
        return this;
    }

    @Field(3)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GParamSpecInt field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 3, field_parent_instance);
        return this;
    }

}
