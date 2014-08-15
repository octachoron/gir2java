
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecUChar
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecUChar() {
        super();
    }

    public GParamSpecUChar(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public short field_minimum() {
        return this.io.getShortField(this, 0);
    }

    @Field(0)
    public GParamSpecUChar field_minimum(short field_minimum) {
        this.io.setShortField(this, 0, field_minimum);
        return this;
    }

    @Field(1)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecUChar field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

    @Field(2)
    public short field_maximum() {
        return this.io.getShortField(this, 2);
    }

    @Field(2)
    public GParamSpecUChar field_maximum(short field_maximum) {
        this.io.setShortField(this, 2, field_maximum);
        return this;
    }

    @Field(3)
    public short field_default_value() {
        return this.io.getShortField(this, 3);
    }

    @Field(3)
    public GParamSpecUChar field_default_value(short field_default_value) {
        this.io.setShortField(this, 3, field_default_value);
        return this;
    }

}
