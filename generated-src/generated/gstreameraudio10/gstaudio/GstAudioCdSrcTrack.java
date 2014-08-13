
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstTagList;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioCdSrcTrack
    extends StructObject
{


    public GstAudioCdSrcTrack() {
        super();
    }

    public GstAudioCdSrcTrack(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public boolean field_is_audio() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioCdSrcTrack field_is_audio(boolean field_is_audio) {
        this.io.setNativeObjectField(this, 0, field_is_audio);
        return this;
    }

    @Field(1)
    public long field_num() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstAudioCdSrcTrack field_num(long field_num) {
        this.io.setNativeObjectField(this, 1, field_num);
        return this;
    }

    @Field(2)
    public long field_start() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstAudioCdSrcTrack field_start(long field_start) {
        this.io.setNativeObjectField(this, 2, field_start);
        return this;
    }

    @Field(3)
    public long field_end() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioCdSrcTrack field_end(long field_end) {
        this.io.setNativeObjectField(this, 3, field_end);
        return this;
    }

    @Field(4)
    public Pointer<GstTagList> field_tags() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstAudioCdSrcTrack field_tags(Pointer<GstTagList> field_tags) {
        this.io.setPointerField(this, 4, field_tags);
        return this;
    }

    @Field(5)
    public long field__gst_reserved1() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstAudioCdSrcTrack field__gst_reserved1(long field__gst_reserved1) {
        this.io.setPointerField(this, 5, field__gst_reserved1);
        return this;
    }

    @Field(6)
    public Pointer field__gst_reserved2() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstAudioCdSrcTrack field__gst_reserved2(Pointer field__gst_reserved2) {
        this.io.setPointerField(this, 6, field__gst_reserved2);
        return this;
    }

}
