
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstCaps;
import generated.gstreamerbase10.gstbase.GstBaseTransformClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioFilterClass
    extends StructObject
{


    public GstAudioFilterClass() {
        super();
    }

    public GstAudioFilterClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseTransformClass field_basetransformclass() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioFilterClass field_basetransformclass(GstBaseTransformClass field_basetransformclass) {
        this.io.setNativeObjectField(this, 0, field_basetransformclass);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioFilterClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

    protected native void gst_audio_filter_class_add_pad_templates(
        @Ptr
        long klass,
        @Ptr
        long allowed_caps);

    public void add_pad_templates(Pointer<GstCaps> allowed_caps) {
        this.gst_audio_filter_class_add_pad_templates(Pointer.pointerTo(this, GstAudioFilterClass.class), Pointer.getPeer(allowed_caps));
    }

}
