
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstProxyPadClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstProxyPadClass() {
        super();
    }

    public GstProxyPadClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstPadClass gstproxypadclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstProxyPadClass gstproxypadclass_field_parent_class(GstPadClass gstproxypadclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstproxypadclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstproxypadclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstProxyPadClass gstproxypadclass_field__gst_reserved(Pointer gstproxypadclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstproxypadclass_field__gst_reserved);
        return this;
    }

}
