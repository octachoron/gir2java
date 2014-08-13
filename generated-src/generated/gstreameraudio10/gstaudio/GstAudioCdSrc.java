
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstTagList;
import generated.gstreamerbase10.gstbase.GstPushSrc;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioCdSrc
    extends GstPushSrc
{


    public GstAudioCdSrc() {
        super();
    }

    public GstAudioCdSrc(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_audio_cd_src_add_track(
        @Ptr
        long src,
        @Ptr
        long track);

    public boolean add_track(Pointer track) {
        return this.gst_audio_cd_src_add_track(Pointer.pointerTo(this, GstAudioCdSrc.class), Pointer.getPeer(track));
    }

    @Field(0)
    public GstPushSrc field_pushsrc() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioCdSrc field_pushsrc(GstPushSrc field_pushsrc) {
        this.io.setNativeObjectField(this, 0, field_pushsrc);
        return this;
    }

    @Field(1)
    public Pointer<GstTagList> field_tags() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioCdSrc field_tags(Pointer<GstTagList> field_tags) {
        this.io.setPointerField(this, 1, field_tags);
        return this;
    }

    @Field(2)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAudioCdSrc field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 2, field_priv);
        return this;
    }

    @Field(3)
    public long field__gst_reserved1() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstAudioCdSrc field__gst_reserved1(long field__gst_reserved1) {
        this.io.setPointerField(this, 3, field__gst_reserved1);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved2() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstAudioCdSrc field__gst_reserved2(Pointer field__gst_reserved2) {
        this.io.setPointerField(this, 4, field__gst_reserved2);
        return this;
    }

}
