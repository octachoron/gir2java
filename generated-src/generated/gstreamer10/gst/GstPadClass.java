
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstPadClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPadClass() {
        super();
    }

    public GstPadClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPadClass field_parent_class(GstObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPadClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
