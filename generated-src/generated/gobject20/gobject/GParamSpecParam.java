
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecParam
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecParam() {
        super();
    }

    public GParamSpecParam(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gparamspecparam_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecParam gparamspecparam_field_parent_instance(GParamSpec gparamspecparam_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecparam_field_parent_instance);
        return this;
    }

}
