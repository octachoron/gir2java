
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstRegistryClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstRegistryClass() {
        super();
    }

    public GstRegistryClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gstregistryclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRegistryClass gstregistryclass_field_parent_class(GstObjectClass gstregistryclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstregistryclass_field_parent_class);
        return this;
    }

}
