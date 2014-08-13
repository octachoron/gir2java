
package generated.gstreamercontroller10.gstcontroller;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-controller-1.0")
public class GstInterpolationControlSource
    extends StructObject
{


    public GstInterpolationControlSource() {
        super();
    }

    public GstInterpolationControlSource(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstInterpolationControlSourcePrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstInterpolationControlSource field_priv(Pointer<GstInterpolationControlSourcePrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GstTimedValueControlSource field_parent() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstInterpolationControlSource field_parent(GstTimedValueControlSource field_parent) {
        this.io.setNativeObjectField(this, 1, field_parent);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstInterpolationControlSource field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
