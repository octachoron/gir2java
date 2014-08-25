
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstPipelineClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPipelineClass() {
        super();
    }

    public GstPipelineClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBinClass gstpipelineclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPipelineClass gstpipelineclass_field_parent_class(GstBinClass gstpipelineclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstpipelineclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstpipelineclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPipelineClass gstpipelineclass_field__gst_reserved(Pointer gstpipelineclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstpipelineclass_field__gst_reserved);
        return this;
    }

}
