
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
    private int field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    private GstVideoCodecState field_ref_count(int field_ref_count) {
        this.io.setIntField(this, 0, field_ref_count);
        return this;
    }

    @Ptr
    protected native long gst_video_codec_state_ref(
        @Ptr
        long state);

    public Pointer<GstVideoCodecState> ref() {
        return Pointer.pointerToAddress(this.gst_video_codec_state_ref(Pointer.pointerTo(this, GstVideoCodecState.class).getPeer()), GstVideoCodecState.class);
    }

    @Field(1)
    private Pointer field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoCodecState field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 1, field_padding);
        return this;
    }

    @Field(2)
    public Pointer<GstBuffer> field_codec_data() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstVideoCodecState field_codec_data(Pointer<GstBuffer> field_codec_data) {
        this.io.setPointerField(this, 2, field_codec_data);
        return this;
    }

    @Field(3)
    public GstVideoInfo field_info() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstVideoCodecState field_info(GstVideoInfo field_info) {
        this.io.setNativeObjectField(this, 3, field_info);
        return this;
    }

    @Field(4)
    public Pointer<GstCaps> field_caps() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstVideoCodecState field_caps(Pointer<GstCaps> field_caps) {
        this.io.setPointerField(this, 4, field_caps);
        return this;
    }

    protected native void gst_video_codec_state_unref(
        @Ptr
        long state);

    public void unref() {
        this.gst_video_codec_state_unref(Pointer.pointerTo(this, GstVideoCodecState.class).getPeer());
    }

}
