
package generated.gstreamervideo10.gstvideo;

import generated.gstreamerbase10.gstbase.GstBaseSinkClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoSinkClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoSinkClass() {
        super();
    }

    public GstVideoSinkClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSinkClass gstvideosinkclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoSinkClass gstvideosinkclass_field_parent_class(GstBaseSinkClass gstvideosinkclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstvideosinkclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstvideosinkclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoSinkClass gstvideosinkclass_field__gst_reserved(Pointer gstvideosinkclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstvideosinkclass_field__gst_reserved);
        return this;
    }

}
