
package generated.gstreamerapp10.gstapp;

import generated.gstreamerbase10.gstbase.GstBaseSrcClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-app-1.0")
public class GstAppSrcClass
    extends StructObject
{


    public GstAppSrcClass() {
        super();
    }

    public GstAppSrcClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSrcClass field_basesrc_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAppSrcClass field_basesrc_class(GstBaseSrcClass field_basesrc_class) {
        this.io.setNativeObjectField(this, 0, field_basesrc_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAppSrcClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
