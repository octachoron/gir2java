
package generated.gstreamertag10.gsttag;

import generated.gstreamer10.gst.GstElement;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-tag-1.0")
public class GstTagDemux
    extends GstElement
{


    public GstTagDemux() {
        super();
    }

    public GstTagDemux(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstElement field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTagDemux field_element(GstElement field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTagDemux field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstTagDemux field_reserved(Pointer field_reserved) {
        this.io.setPointerField(this, 2, field_reserved);
        return this;
    }

}
