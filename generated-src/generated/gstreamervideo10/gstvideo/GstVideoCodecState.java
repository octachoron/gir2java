
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoCodecState
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoCodecState() {
        super();
    }

    public GstVideoCodecState(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private int gstvideocodecstate_field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    private GstVideoCodecState gstvideocodecstate_field_ref_count(int gstvideocodecstate_field_ref_count) {
        this.io.setIntField(this, 0, gstvideocodecstate_field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer<GstCaps> gstvideocodecstate_field_caps() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoCodecState gstvideocodecstate_field_caps(Pointer<GstCaps> gstvideocodecstate_field_caps) {
        this.io.setPointerField(this, 1, gstvideocodecstate_field_caps);
        return this;
    }

    @Field(2)
    public GstVideoInfo gstvideocodecstate_field_info() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoCodecState gstvideocodecstate_field_info(GstVideoInfo gstvideocodecstate_field_info) {
        this.io.setNativeObjectField(this, 2, gstvideocodecstate_field_info);
        return this;
    }

    @Field(3)
    private Pointer gstvideocodecstate_field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstVideoCodecState gstvideocodecstate_field_padding(Pointer gstvideocodecstate_field_padding) {
        this.io.setPointerField(this, 3, gstvideocodecstate_field_padding);
        return this;
    }

    @Ptr
    protected native long gst_video_codec_state_ref(
        @Ptr
        long state);

    public Pointer<GstVideoCodecState> ref() {
        return Pointer.pointerToAddress(this.gst_video_codec_state_ref(Pointer.pointerTo(this, GstVideoCodecState.class).getPeer()), GstVideoCodecState.class);
    }

    protected native void gst_video_codec_state_unref(
        @Ptr
        long state);

    public void unref() {
        this.gst_video_codec_state_unref(Pointer.pointerTo(this, GstVideoCodecState.class).getPeer());
    }

    @Field(4)
    public Pointer<GstBuffer> gstvideocodecstate_field_codec_data() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstVideoCodecState gstvideocodecstate_field_codec_data(Pointer<GstBuffer> gstvideocodecstate_field_codec_data) {
        this.io.setPointerField(this, 4, gstvideocodecstate_field_codec_data);
        return this;
    }

}
