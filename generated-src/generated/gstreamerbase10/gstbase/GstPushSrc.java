
package generated.gstreamerbase10.gstbase;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstPushSrc
    extends GstBaseSrc
{


    static {
        BridJ.register();
    }

    public GstPushSrc() {
        super();
    }

    public GstPushSrc(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSrc gstpushsrc_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPushSrc gstpushsrc_field_parent(GstBaseSrc gstpushsrc_field_parent) {
        this.io.setNativeObjectField(this, 0, gstpushsrc_field_parent);
        return this;
    }

    @Field(1)
    private Pointer gstpushsrc_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPushSrc gstpushsrc_field__gst_reserved(Pointer gstpushsrc_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstpushsrc_field__gst_reserved);
        return this;
    }

}
