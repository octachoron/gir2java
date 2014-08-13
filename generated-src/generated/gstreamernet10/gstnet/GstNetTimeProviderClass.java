
package generated.gstreamernet10.gstnet;

import generated.gstreamer10.gst.GstObjectClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-net-1.0")
public class GstNetTimeProviderClass
    extends StructObject
{


    public GstNetTimeProviderClass() {
        super();
    }

    public GstNetTimeProviderClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstNetTimeProviderClass field_parent_class(GstObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstNetTimeProviderClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
