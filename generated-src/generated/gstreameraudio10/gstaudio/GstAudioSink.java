
package generated.gstreameraudio10.gstaudio;

import generated.glib20.glib.GThread;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioSink
    extends GstAudioBaseSink
{


    public GstAudioSink() {
        super();
    }

    public GstAudioSink(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstAudioBaseSink field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioSink field_element(GstAudioBaseSink field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer<GThread> field_thread() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioSink field_thread(Pointer<GThread> field_thread) {
        this.io.setPointerField(this, 1, field_thread);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAudioSink field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
