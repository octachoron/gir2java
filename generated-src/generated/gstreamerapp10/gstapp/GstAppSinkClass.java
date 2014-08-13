
package generated.gstreamerapp10.gstapp;

import generated.gstreamerbase10.gstbase.GstBaseSinkClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-app-1.0")
public class GstAppSinkClass
    extends StructObject
{


    public GstAppSinkClass() {
        super();
    }

    public GstAppSinkClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSinkClass field_basesink_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAppSinkClass field_basesink_class(GstBaseSinkClass field_basesink_class) {
        this.io.setNativeObjectField(this, 0, field_basesink_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAppSinkClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
