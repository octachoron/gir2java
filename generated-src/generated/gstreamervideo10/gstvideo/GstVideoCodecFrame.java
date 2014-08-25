
package generated.gstreamervideo10.gstvideo;

import generated.glib20.glib.GList;
import generated.gstreamer10.gst.GstBuffer;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoCodecFrame
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoCodecFrame() {
        super();
    }

    public GstVideoCodecFrame(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private int gstvideocodecframe_field_ref_count() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    private GstVideoCodecFrame gstvideocodecframe_field_ref_count(int gstvideocodecframe_field_ref_count) {
        this.io.setIntField(this, 0, gstvideocodecframe_field_ref_count);
        return this;
    }

    @Field(1)
    private long gstvideocodecframe_field_flags() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GstVideoCodecFrame gstvideocodecframe_field_flags(long gstvideocodecframe_field_flags) {
        this.io.setLongField(this, 1, gstvideocodecframe_field_flags);
        return this;
    }

    @Field(2)
    public long gstvideocodecframe_field_system_frame_number() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstVideoCodecFrame gstvideocodecframe_field_system_frame_number(long gstvideocodecframe_field_system_frame_number) {
        this.io.setLongField(this, 2, gstvideocodecframe_field_system_frame_number);
        return this;
    }

    @Field(3)
    public long gstvideocodecframe_field_decode_frame_number() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstVideoCodecFrame gstvideocodecframe_field_decode_frame_number(long gstvideocodecframe_field_decode_frame_number) {
        this.io.setLongField(this, 3, gstvideocodecframe_field_decode_frame_number);
        return this;
    }

    @Field(4)
    public long gstvideocodecframe_field_presentation_frame_number() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstVideoCodecFrame gstvideocodecframe_field_presentation_frame_number(long gstvideocodecframe_field_presentation_frame_number) {
        this.io.setLongField(this, 4, gstvideocodecframe_field_presentation_frame_number);
        return this;
    }

    @Field(5)
    public long gstvideocodecframe_field_dts() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstVideoCodecFrame gstvideocodecframe_field_dts(long gstvideocodecframe_field_dts) {
        this.io.setLongField(this, 5, gstvideocodecframe_field_dts);
        return this;
    }

    @Field(6)
    public long gstvideocodecframe_field_pts() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GstVideoCodecFrame gstvideocodecframe_field_pts(long gstvideocodecframe_field_pts) {
        this.io.setLongField(this, 6, gstvideocodecframe_field_pts);
        return this;
    }

    @Field(7)
    public long gstvideocodecframe_field_duration() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstVideoCodecFrame gstvideocodecframe_field_duration(long gstvideocodecframe_field_duration) {
        this.io.setLongField(this, 7, gstvideocodecframe_field_duration);
        return this;
    }

    @Field(8)
    public int gstvideocodecframe_field_distance_from_sync() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public GstVideoCodecFrame gstvideocodecframe_field_distance_from_sync(int gstvideocodecframe_field_distance_from_sync) {
        this.io.setIntField(this, 8, gstvideocodecframe_field_distance_from_sync);
        return this;
    }

    @Field(9)
    public Pointer<GstBuffer> gstvideocodecframe_field_input_buffer() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstVideoCodecFrame gstvideocodecframe_field_input_buffer(Pointer<GstBuffer> gstvideocodecframe_field_input_buffer) {
        this.io.setPointerField(this, 9, gstvideocodecframe_field_input_buffer);
        return this;
    }

    @Field(10)
    public Pointer<GstBuffer> gstvideocodecframe_field_output_buffer() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstVideoCodecFrame gstvideocodecframe_field_output_buffer(Pointer<GstBuffer> gstvideocodecframe_field_output_buffer) {
        this.io.setPointerField(this, 10, gstvideocodecframe_field_output_buffer);
        return this;
    }

    @Field(11)
    public long gstvideocodecframe_field_deadline() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GstVideoCodecFrame gstvideocodecframe_field_deadline(long gstvideocodecframe_field_deadline) {
        this.io.setLongField(this, 11, gstvideocodecframe_field_deadline);
        return this;
    }

    @Field(12)
    private Pointer<GList> gstvideocodecframe_field_events() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    private GstVideoCodecFrame gstvideocodecframe_field_events(Pointer<GList> gstvideocodecframe_field_events) {
        this.io.setPointerField(this, 12, gstvideocodecframe_field_events);
        return this;
    }

    @Field(13)
    private Pointer gstvideocodecframe_field_user_data() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    private GstVideoCodecFrame gstvideocodecframe_field_user_data(Pointer gstvideocodecframe_field_user_data) {
        this.io.setPointerField(this, 13, gstvideocodecframe_field_user_data);
        return this;
    }

    @Field(14)
    private Pointer gstvideocodecframe_field_user_data_destroy_notify() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    private GstVideoCodecFrame gstvideocodecframe_field_user_data_destroy_notify(Pointer gstvideocodecframe_field_user_data_destroy_notify) {
        this.io.setPointerField(this, 14, gstvideocodecframe_field_user_data_destroy_notify);
        return this;
    }

    @Ptr
    protected native long gst_video_codec_frame_get_user_data(
        @Ptr
        long frame);

    public Pointer get_user_data() {
        return Pointer.pointerToAddress(this.gst_video_codec_frame_get_user_data(Pointer.pointerTo(this, GstVideoCodecFrame.class).getPeer()));
    }

    @Ptr
    protected native long gst_video_codec_frame_ref(
        @Ptr
        long frame);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.gst_video_codec_frame_ref(Pointer.pointerTo(this, GstVideoCodecFrame.class).getPeer()));
    }

    protected native void gst_video_codec_frame_set_user_data(
        @Ptr
        long frame,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_user_data(Pointer user_data, Pointer notify) {
        this.gst_video_codec_frame_set_user_data(Pointer.pointerTo(this, GstVideoCodecFrame.class).getPeer(), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native void gst_video_codec_frame_unref(
        @Ptr
        long frame);

    public void unref() {
        this.gst_video_codec_frame_unref(Pointer.pointerTo(this, GstVideoCodecFrame.class).getPeer());
    }

}
