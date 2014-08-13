
package generated.gstreameraudio10.gstaudio;

import generated.gstreamerbase10.gstbase.GstBaseTransform;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioFilter
    extends GstBaseTransform
{


    public GstAudioFilter() {
        super();
    }

    public GstAudioFilter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseTransform field_basetransform() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioFilter field_basetransform(GstBaseTransform field_basetransform) {
        this.io.setNativeObjectField(this, 0, field_basetransform);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioFilter field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

    @Field(2)
    public GstAudioInfo field_info() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstAudioFilter field_info(GstAudioInfo field_info) {
        this.io.setNativeObjectField(this, 2, field_info);
        return this;
    }

}
