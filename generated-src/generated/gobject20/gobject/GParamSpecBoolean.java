
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
    public boolean field_default_value() {
        return this.io.getBooleanField(this, 0);
    }

    @Field(0)
    public GParamSpecBoolean field_default_value(boolean field_default_value) {
        this.io.setBooleanField(this, 0, field_default_value);
        return this;
    }

    @Field(1)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecBoolean field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
