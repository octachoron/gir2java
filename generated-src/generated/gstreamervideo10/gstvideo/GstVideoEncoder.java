
package generated.gstreamervideo10.gstvideo;

import generated.glib20.glib.GList;
import generated.glib20.glib.GRecMutex;
import generated.gstreamer10.gst.GstAllocationParams;
import generated.gstreamer10.gst.GstAllocator;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamer10.gst.GstTagMergeMode;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoEncoder
    extends GstElement
{


    static {
        BridJ.register();
    }

    public GstVideoEncoder() {
        super();
    }

    public GstVideoEncoder(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_video_encoder_allocate_output_buffer(
        @Ptr
        long encoder, long size);

    public Pointer<GstBuffer> allocate_output_buffer(long size) {
        return Pointer.pointerToAddress(this.gst_video_encoder_allocate_output_buffer(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), size), GstBuffer.class);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_video_encoder_allocate_output_frame(
        @Ptr
        long encoder,
        @Ptr
        long frame, long size);

    public IntValuedEnum<GstFlowReturn> allocate_output_frame(Pointer<GstVideoCodecFrame> frame, long size) {
        return this.gst_video_encoder_allocate_output_frame(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(frame), size);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_video_encoder_finish_frame(
        @Ptr
        long encoder,
        @Ptr
        long frame);

    public IntValuedEnum<GstFlowReturn> finish_frame(Pointer<GstVideoCodecFrame> frame) {
        return this.gst_video_encoder_finish_frame(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(frame));
    }

    protected native void gst_video_encoder_get_allocator(
        @Ptr
        long encoder,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void get_allocator(Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        this.gst_video_encoder_get_allocator(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    protected native boolean gst_video_encoder_get_discont(
        @Ptr
        long encoder);

    public boolean get_discont() {
        return this.gst_video_encoder_get_discont(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer());
    }

    @Ptr
    protected native long gst_video_encoder_get_frame(
        @Ptr
        long encoder, int frame_number);

    public Pointer<GstVideoCodecFrame> get_frame(int frame_number) {
        return Pointer.pointerToAddress(this.gst_video_encoder_get_frame(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), frame_number), GstVideoCodecFrame.class);
    }

    @Ptr
    protected native long gst_video_encoder_get_frames(
        @Ptr
        long encoder);

    public Pointer<GList> get_frames() {
        return Pointer.pointerToAddress(this.gst_video_encoder_get_frames(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer()), GList.class);
    }

    protected native void gst_video_encoder_get_latency(
        @Ptr
        long encoder,
        @Ptr
        long min_latency,
        @Ptr
        long max_latency);

    public void get_latency(Pointer<Long> min_latency, Pointer<Long> max_latency) {
        this.gst_video_encoder_get_latency(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(min_latency), Pointer.getPeer(max_latency));
    }

    @Ptr
    protected native long gst_video_encoder_get_oldest_frame(
        @Ptr
        long encoder);

    public Pointer<GstVideoCodecFrame> get_oldest_frame() {
        return Pointer.pointerToAddress(this.gst_video_encoder_get_oldest_frame(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer()), GstVideoCodecFrame.class);
    }

    @Ptr
    protected native long gst_video_encoder_get_output_state(
        @Ptr
        long encoder);

    public Pointer<GstVideoCodecState> get_output_state() {
        return Pointer.pointerToAddress(this.gst_video_encoder_get_output_state(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer()), GstVideoCodecState.class);
    }

    protected native void gst_video_encoder_merge_tags(
        @Ptr
        long encoder,
        @Ptr
        long tags, IntValuedEnum<GstTagMergeMode> mode);

    public void merge_tags(Pointer<GstTagList> tags, IntValuedEnum<GstTagMergeMode> mode) {
        this.gst_video_encoder_merge_tags(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(tags), mode);
    }

    protected native boolean gst_video_encoder_negotiate(
        @Ptr
        long encoder);

    public boolean negotiate() {
        return this.gst_video_encoder_negotiate(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer());
    }

    @Ptr
    protected native long gst_video_encoder_proxy_getcaps(
        @Ptr
        long enc,
        @Ptr
        long caps,
        @Ptr
        long filter);

    public Pointer<GstCaps> proxy_getcaps(Pointer<GstCaps> caps, Pointer<GstCaps> filter) {
        return Pointer.pointerToAddress(this.gst_video_encoder_proxy_getcaps(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(caps), Pointer.getPeer(filter)), GstCaps.class);
    }

    protected native void gst_video_encoder_set_discont(
        @Ptr
        long encoder);

    public void set_discont() {
        this.gst_video_encoder_set_discont(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer());
    }

    protected native void gst_video_encoder_set_headers(
        @Ptr
        long encoder,
        @Ptr
        long headers);

    public void set_headers(Pointer<GList> headers) {
        this.gst_video_encoder_set_headers(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(headers));
    }

    protected native void gst_video_encoder_set_latency(
        @Ptr
        long encoder, long min_latency, long max_latency);

    public void set_latency(long min_latency, long max_latency) {
        this.gst_video_encoder_set_latency(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), min_latency, max_latency);
    }

    @Ptr
    protected native long gst_video_encoder_set_output_state(
        @Ptr
        long encoder,
        @Ptr
        long caps,
        @Ptr
        long reference);

    public Pointer<GstVideoCodecState> set_output_state(Pointer<GstCaps> caps, Pointer<GstVideoCodecState> reference) {
        return Pointer.pointerToAddress(this.gst_video_encoder_set_output_state(Pointer.pointerTo(this, GstVideoEncoder.class).getPeer(), Pointer.getPeer(caps), Pointer.getPeer(reference)), GstVideoCodecState.class);
    }

    @Field(0)
    private GstElement gstvideoencoder_field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GstVideoEncoder gstvideoencoder_field_element(GstElement gstvideoencoder_field_element) {
        this.io.setNativeObjectField(this, 0, gstvideoencoder_field_element);
        return this;
    }

    @Field(1)
    private Pointer<GstPad> gstvideoencoder_field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoEncoder gstvideoencoder_field_sinkpad(Pointer<GstPad> gstvideoencoder_field_sinkpad) {
        this.io.setPointerField(this, 1, gstvideoencoder_field_sinkpad);
        return this;
    }

    @Field(2)
    private Pointer<GstPad> gstvideoencoder_field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstVideoEncoder gstvideoencoder_field_srcpad(Pointer<GstPad> gstvideoencoder_field_srcpad) {
        this.io.setPointerField(this, 2, gstvideoencoder_field_srcpad);
        return this;
    }

    @Field(3)
    private GRecMutex gstvideoencoder_field_stream_lock() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    private GstVideoEncoder gstvideoencoder_field_stream_lock(GRecMutex gstvideoencoder_field_stream_lock) {
        this.io.setNativeObjectField(this, 3, gstvideoencoder_field_stream_lock);
        return this;
    }

    @Field(4)
    private GstSegment gstvideoencoder_field_input_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    private GstVideoEncoder gstvideoencoder_field_input_segment(GstSegment gstvideoencoder_field_input_segment) {
        this.io.setNativeObjectField(this, 4, gstvideoencoder_field_input_segment);
        return this;
    }

    @Field(5)
    private GstSegment gstvideoencoder_field_output_segment() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    private GstVideoEncoder gstvideoencoder_field_output_segment(GstSegment gstvideoencoder_field_output_segment) {
        this.io.setNativeObjectField(this, 5, gstvideoencoder_field_output_segment);
        return this;
    }

    @Field(6)
    private Pointer gstvideoencoder_field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstVideoEncoder gstvideoencoder_field_priv(Pointer gstvideoencoder_field_priv) {
        this.io.setPointerField(this, 6, gstvideoencoder_field_priv);
        return this;
    }

    @Field(7)
    private Pointer gstvideoencoder_field_padding() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GstVideoEncoder gstvideoencoder_field_padding(Pointer gstvideoencoder_field_padding) {
        this.io.setPointerField(this, 7, gstvideoencoder_field_padding);
        return this;
    }

}
