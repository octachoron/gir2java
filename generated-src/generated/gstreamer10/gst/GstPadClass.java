
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
    public GstObjectClass gstpadclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPadClass gstpadclass_field_parent_class(GstObjectClass gstpadclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstpadclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstpadclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPadClass gstpadclass_field__gst_reserved(Pointer gstpadclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstpadclass_field__gst_reserved);
        return this;
    }

}
