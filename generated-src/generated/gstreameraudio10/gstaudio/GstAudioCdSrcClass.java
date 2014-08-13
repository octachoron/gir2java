
package generated.gstreameraudio10.gstaudio;

import generated.gstreamerbase10.gstbase.GstPushSrcClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioCdSrcClass
    extends StructObject
{


    public GstAudioCdSrcClass() {
        super();
    }

    public GstAudioCdSrcClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstPushSrcClass field_pushsrc_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioCdSrcClass field_pushsrc_class(GstPushSrcClass field_pushsrc_class) {
        this.io.setNativeObjectField(this, 0, field_pushsrc_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioCdSrcClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
