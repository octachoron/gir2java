
package generated.gstreamerrtp10.gstrtp;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-rtp-1.0")
public class GstRTPBaseAudioPayloadClass
    extends StructObject
{


    public GstRTPBaseAudioPayloadClass() {
        super();
    }

    public GstRTPBaseAudioPayloadClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstRTPBaseAudioPayloadClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 0, field__gst_reserved);
        return this;
    }

    @Field(1)
    public GstRTPBasePayloadClass field_parent_class() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTPBaseAudioPayloadClass field_parent_class(GstRTPBasePayloadClass field_parent_class) {
        this.io.setNativeObjectField(this, 1, field_parent_class);
        return this;
    }

}
