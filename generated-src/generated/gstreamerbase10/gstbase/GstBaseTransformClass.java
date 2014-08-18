
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstElementClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstBaseTransformClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBaseTransformClass() {
        super();
    }

    public GstBaseTransformClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstElementClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseTransformClass field_parent_class(GstElementClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public boolean field_passthrough_on_same_caps() {
        return this.io.getBooleanField(this, 1);
    }

    @Field(1)
    public GstBaseTransformClass field_passthrough_on_same_caps(boolean field_passthrough_on_same_caps) {
        this.io.setBooleanField(this, 1, field_passthrough_on_same_caps);
        return this;
    }

    @Field(2)
    public boolean field_transform_ip_on_passthrough() {
        return this.io.getBooleanField(this, 2);
    }

    @Field(2)
    public GstBaseTransformClass field_transform_ip_on_passthrough(boolean field_transform_ip_on_passthrough) {
        this.io.setBooleanField(this, 2, field_transform_ip_on_passthrough);
        return this;
    }

    @Field(3)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstBaseTransformClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 3, field__gst_reserved);
        return this;
    }

}
