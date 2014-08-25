
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecUnichar
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecUnichar() {
        super();
    }

    public GParamSpecUnichar(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gparamspecunichar_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecUnichar gparamspecunichar_field_parent_instance(GParamSpec gparamspecunichar_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecunichar_field_parent_instance);
        return this;
    }

    @Field(1)
    public long gparamspecunichar_field_default_value() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GParamSpecUnichar gparamspecunichar_field_default_value(long gparamspecunichar_field_default_value) {
        this.io.setLongField(this, 1, gparamspecunichar_field_default_value);
        return this;
    }

}
