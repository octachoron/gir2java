
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstSystemClockClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioClockClass
    extends StructObject
{


    public GstAudioClockClass() {
        super();
    }

    public GstAudioClockClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstSystemClockClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioClockClass field_parent_class(GstSystemClockClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioClockClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
