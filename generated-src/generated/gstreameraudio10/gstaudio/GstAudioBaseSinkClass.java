
package generated.gstreameraudio10.gstaudio;

import generated.gstreamerbase10.gstbase.GstBaseSinkClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioBaseSinkClass
    extends StructObject
{


    public GstAudioBaseSinkClass() {
        super();
    }

    public GstAudioBaseSinkClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSinkClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioBaseSinkClass field_parent_class(GstBaseSinkClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioBaseSinkClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
