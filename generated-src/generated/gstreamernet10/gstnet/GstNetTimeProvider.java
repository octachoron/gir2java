
package generated.gstreamernet10.gstnet;

import generated.gstreamer10.gst.GstObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-net-1.0")
public class GstNetTimeProvider
    extends GstObject
{


    public GstNetTimeProvider() {
        super();
    }

    public GstNetTimeProvider(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObject field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstNetTimeProvider field_parent(GstObject field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstNetTimeProvider field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstNetTimeProvider field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
