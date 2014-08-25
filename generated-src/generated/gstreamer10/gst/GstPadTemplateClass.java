
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstPadTemplateClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPadTemplateClass() {
        super();
    }

    public GstPadTemplateClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gstpadtemplateclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPadTemplateClass gstpadtemplateclass_field_parent_class(GstObjectClass gstpadtemplateclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstpadtemplateclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstpadtemplateclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPadTemplateClass gstpadtemplateclass_field__gst_reserved(Pointer gstpadtemplateclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstpadtemplateclass_field__gst_reserved);
        return this;
    }

}
