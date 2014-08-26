
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecBoolean
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecBoolean() {
        super();
    }

    public GParamSpecBoolean(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gparamspecboolean_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecBoolean gparamspecboolean_field_parent_instance(GParamSpec gparamspecboolean_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecboolean_field_parent_instance);
        return this;
    }

    @Field(1)
    public boolean gparamspecboolean_field_default_value() {
        return this.io.getBooleanField(this, 1);
    }

    @Field(1)
    public GParamSpecBoolean gparamspecboolean_field_default_value(boolean gparamspecboolean_field_default_value) {
        this.io.setBooleanField(this, 1, gparamspecboolean_field_default_value);
        return this;
    }

}
