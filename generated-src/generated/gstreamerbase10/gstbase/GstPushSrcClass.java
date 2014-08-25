
package generated.gstreamerbase10.gstbase;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstPushSrcClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPushSrcClass() {
        super();
    }

    public GstPushSrcClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSrcClass gstpushsrcclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPushSrcClass gstpushsrcclass_field_parent_class(GstBaseSrcClass gstpushsrcclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstpushsrcclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstpushsrcclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPushSrcClass gstpushsrcclass_field__gst_reserved(Pointer gstpushsrcclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstpushsrcclass_field__gst_reserved);
        return this;
    }

}
