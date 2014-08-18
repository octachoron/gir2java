
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecUInt64
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecUInt64() {
        super();
    }

    public GParamSpecUInt64(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecUInt64 field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public long field_default_value() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GParamSpecUInt64 field_default_value(long field_default_value) {
        this.io.setLongField(this, 1, field_default_value);
        return this;
    }

    @Field(2)
    public long field_maximum() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GParamSpecUInt64 field_maximum(long field_maximum) {
        this.io.setLongField(this, 2, field_maximum);
        return this;
    }

    @Field(3)
    public long field_minimum() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GParamSpecUInt64 field_minimum(long field_minimum) {
        this.io.setLongField(this, 3, field_minimum);
        return this;
    }

}
