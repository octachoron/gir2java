
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstAllocatorClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstAllocatorClass() {
        super();
    }

    public GstAllocatorClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gstallocatorclass_field_object_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAllocatorClass gstallocatorclass_field_object_class(GstObjectClass gstallocatorclass_field_object_class) {
        this.io.setNativeObjectField(this, 0, gstallocatorclass_field_object_class);
        return this;
    }

    @Field(1)
    private Pointer gstallocatorclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstAllocatorClass gstallocatorclass_field__gst_reserved(Pointer gstallocatorclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstallocatorclass_field__gst_reserved);
        return this;
    }

}
