
package generated.gstreamercontroller10.gstcontroller;

import generated.gstreamer10.gst.GstControlSource;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-controller-1.0")
public class GstLFOControlSource
    extends GstControlSource
{


    public GstLFOControlSource() {
        super();
    }

    public GstLFOControlSource(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstControlSource field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstLFOControlSource field_parent(GstControlSource field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstLFOControlSource field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Object field_lock() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstLFOControlSource field_lock(Object field_lock) {
        this.io.setNativeObjectField(this, 2, field_lock);
        return this;
    }

    @Field(3)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstLFOControlSource field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 3, field__gst_reserved);
        return this;
    }

}
