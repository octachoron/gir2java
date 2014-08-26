
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
    public short gparamspecuchar_field_minimum() {
        return this.io.getShortField(this, 0);
    }

    @Field(0)
    public GParamSpecUChar gparamspecuchar_field_minimum(short gparamspecuchar_field_minimum) {
        this.io.setShortField(this, 0, gparamspecuchar_field_minimum);
        return this;
    }

    @Field(1)
    public short gparamspecuchar_field_default_value() {
        return this.io.getShortField(this, 1);
    }

    @Field(1)
    public GParamSpecUChar gparamspecuchar_field_default_value(short gparamspecuchar_field_default_value) {
        this.io.setShortField(this, 1, gparamspecuchar_field_default_value);
        return this;
    }

    @Field(2)
    public short gparamspecuchar_field_maximum() {
        return this.io.getShortField(this, 2);
    }

    @Field(2)
    public GParamSpecUChar gparamspecuchar_field_maximum(short gparamspecuchar_field_maximum) {
        this.io.setShortField(this, 2, gparamspecuchar_field_maximum);
        return this;
    }

    @Field(3)
    public GParamSpec gparamspecuchar_field_parent_instance() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GParamSpecUChar gparamspecuchar_field_parent_instance(GParamSpec gparamspecuchar_field_parent_instance) {
        this.io.setNativeObjectField(this, 3, gparamspecuchar_field_parent_instance);
        return this;
    }

}
