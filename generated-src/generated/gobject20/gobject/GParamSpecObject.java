
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecObject
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecObject() {
        super();
    }

    public GParamSpecObject(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gparamspecobject_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecObject gparamspecobject_field_parent_instance(GParamSpec gparamspecobject_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecobject_field_parent_instance);
        return this;
    }

}
