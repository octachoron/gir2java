
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioDownmixMeta
    extends StructObject
{


    public GstAudioDownmixMeta() {
        super();
    }

    public GstAudioDownmixMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioDownmixMeta field_meta(GstMeta field_meta) {
        this.io.setNativeObjectField(this, 0, field_meta);
        return this;
    }

    @Field(1)
    public Pointer<IntValuedEnum<GstAudioChannelPosition>> field_from_position() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstAudioDownmixMeta field_from_position(Pointer<IntValuedEnum<GstAudioChannelPosition>> field_from_position) {
        this.io.setEnumField(this, 1, field_from_position);
        return this;
    }

    @Field(2)
    public Pointer<IntValuedEnum<GstAudioChannelPosition>> field_to_position() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstAudioDownmixMeta field_to_position(Pointer<IntValuedEnum<GstAudioChannelPosition>> field_to_position) {
        this.io.setEnumField(this, 2, field_to_position);
        return this;
    }

    @Field(3)
    public int field_from_channels() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioDownmixMeta field_from_channels(int field_from_channels) {
        this.io.setNativeObjectField(this, 3, field_from_channels);
        return this;
    }

    @Field(4)
    public int field_to_channels() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioDownmixMeta field_to_channels(int field_to_channels) {
        this.io.setNativeObjectField(this, 4, field_to_channels);
        return this;
    }

    @Field(5)
    public Pointer<Pointer<Float>> field_matrix() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstAudioDownmixMeta field_matrix(Pointer<Pointer<Float>> field_matrix) {
        this.io.setPointerField(this, 5, field_matrix);
        return this;
    }

    @Ptr
    protected native long gst_audio_downmix_meta_get_info();

    public Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(this.gst_audio_downmix_meta_get_info(), Pointer.class);
    }

}
