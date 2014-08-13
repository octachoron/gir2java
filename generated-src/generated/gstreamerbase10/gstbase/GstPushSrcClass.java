
package generated.gstreamerbase10.gstbase;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstPushSrcClass
    extends StructObject
{


    public GstPushSrcClass() {
        super();
    }

    public GstPushSrcClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSrcClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPushSrcClass field_parent_class(GstBaseSrcClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstPushSrcClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
