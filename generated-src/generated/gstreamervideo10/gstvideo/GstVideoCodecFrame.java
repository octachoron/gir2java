
package generated.gstreamervideo10.gstvideo;

import generated.glib20.glib.GList;
import generated.gstreamer10.gst.GstBuffer;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoCodecFrame
    extends StructObject
{


    public GstVideoCodecFrame() {
        super();
    }

    public GstVideoCodecFrame(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_ref_count() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoCodecFrame field_ref_count(int field_ref_count) {
        this.io.setNativeObjectField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public long field_flags() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstVideoCodecFrame field_flags(long field_flags) {
        this.io.setNativeObjectField(this, 1, field_flags);
        return this;
    }

    @Field(2)
    public long field_system_frame_number() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoCodecFrame field_system_frame_number(long field_system_frame_number) {
        this.io.setNativeObjectField(this, 2, field_system_frame_number);
        return this;
    }

    @Field(3)
    public long field_decode_frame_number() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstVideoCodecFrame field_decode_frame_number(long field_decode_frame_number) {
        this.io.setNativeObjectField(this, 3, field_decode_frame_number);
        return this;
    }

    @Field(4)
    public long field_presentation_frame_number() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstVideoCodecFrame field_presentation_frame_number(long field_presentation_frame_number) {
        this.io.setNativeObjectField(this, 4, field_presentation_frame_number);
        return this;
    }

    @Field(5)
    public Object field_dts() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstVideoCodecFrame field_dts(Object field_dts) {
        this.io.setNativeObjectField(this, 5, field_dts);
        return this;
    }

    @Field(6)
    public Object field_pts() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstVideoCodecFrame field_pts(Object field_pts) {
        this.io.setNativeObjectField(this, 6, field_pts);
        return this;
    }

    @Field(7)
    public Object field_duration() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstVideoCodecFrame field_duration(Object field_duration) {
        this.io.setNativeObjectField(this, 7, field_duration);
        return this;
    }

    @Field(8)
    public int field_distance_from_sync() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstVideoCodecFrame field_distance_from_sync(int field_distance_from_sync) {
        this.io.setNativeObjectField(this, 8, field_distance_from_sync);
        return this;
    }

    @Field(9)
    public Pointer<GstBuffer> field_input_buffer() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstVideoCodecFrame field_input_buffer(Pointer<GstBuffer> field_input_buffer) {
        this.io.setPointerField(this, 9, field_input_buffer);
        return this;
    }

    @Field(10)
    public Pointer<GstBuffer> field_output_buffer() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstVideoCodecFrame field_output_buffer(Pointer<GstBuffer> field_output_buffer) {
        this.io.setPointerField(this, 10, field_output_buffer);
        return this;
    }

    @Field(11)
    public Object field_deadline() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstVideoCodecFrame field_deadline(Object field_deadline) {
        this.io.setNativeObjectField(this, 11, field_deadline);
        return this;
    }

    @Field(12)
    public Pointer<GList> field_events() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public GstVideoCodecFrame field_events(Pointer<GList> field_events) {
        this.io.setPointerField(this, 12, field_events);
        return this;
    }

    @Field(13)
    public Pointer field_user_data() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GstVideoCodecFrame field_user_data(Pointer field_user_data) {
        this.io.setNativeObjectField(this, 13, field_user_data);
        return this;
    }

    @Field(14)
    public Object field_user_data_destroy_notify() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GstVideoCodecFrame field_user_data_destroy_notify(Object field_user_data_destroy_notify) {
        this.io.setNativeObjectField(this, 14, field_user_data_destroy_notify);
        return this;
    }

    protected native Pointer gst_video_codec_frame_get_user_data(
        @Ptr
        long frame);

    public Pointer get_user_data() {
        return this.gst_video_codec_frame_get_user_data(Pointer.pointerTo(this, GstVideoCodecFrame.class));
    }

    @Ptr
    protected native long gst_video_codec_frame_ref(
        @Ptr
        long frame);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.gst_video_codec_frame_ref(Pointer.pointerTo(this, GstVideoCodecFrame.class)));
    }

    protected native void gst_video_codec_frame_set_user_data(
        @Ptr
        long frame, Pointer user_data, Object notify);

    public void set_user_data(Pointer user_data, Object notify) {
        this.gst_video_codec_frame_set_user_data(Pointer.pointerTo(this, GstVideoCodecFrame.class), user_data, notify);
    }

    protected native void gst_video_codec_frame_unref(
        @Ptr
        long frame);

    public void unref() {
        this.gst_video_codec_frame_unref(Pointer.pointerTo(this, GstVideoCodecFrame.class));
    }

}
