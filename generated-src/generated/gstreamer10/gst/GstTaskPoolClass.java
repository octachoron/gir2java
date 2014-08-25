
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstTaskPoolClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstTaskPoolClass() {
        super();
    }

    public GstTaskPoolClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gsttaskpoolclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTaskPoolClass gsttaskpoolclass_field_parent_class(GstObjectClass gsttaskpoolclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gsttaskpoolclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gsttaskpoolclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstTaskPoolClass gsttaskpoolclass_field__gst_reserved(Pointer gsttaskpoolclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gsttaskpoolclass_field__gst_reserved);
        return this;
    }

}
