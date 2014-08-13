
package generated.gstreamerbase10.gstbase;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstPushSrc
    extends GstBaseSrc
{


    public GstPushSrc() {
        super();
    }

    public GstPushSrc(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSrc field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPushSrc field_parent(GstBaseSrc field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstPushSrc field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
