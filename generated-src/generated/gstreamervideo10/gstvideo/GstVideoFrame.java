
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMapFlags;
import generated.gstreamer10.gst.GstMapInfo;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoFrame
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoFrame() {
        super();
    }

    public GstVideoFrame(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstVideoFrameFlags> gstvideoframe_field_flags() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstVideoFrame gstvideoframe_field_flags(IntValuedEnum<GstVideoFrameFlags> gstvideoframe_field_flags) {
        this.io.setEnumField(this, 0, gstvideoframe_field_flags);
        return this;
    }

    protected native boolean gst_video_frame_copy(
        @Ptr
        long dest,
        @Ptr
        long src);

    public boolean copy(Pointer<GstVideoFrame> src) {
        return this.gst_video_frame_copy(Pointer.pointerTo(this, GstVideoFrame.class).getPeer(), Pointer.getPeer(src));
    }

    protected native boolean gst_video_frame_copy_plane(
        @Ptr
        long dest,
        @Ptr
        long src, long plane);

    public boolean copy_plane(Pointer<GstVideoFrame> src, long plane) {
        return this.gst_video_frame_copy_plane(Pointer.pointerTo(this, GstVideoFrame.class).getPeer(), Pointer.getPeer(src), plane);
    }

    protected native boolean gst_video_frame_map_id(
        @Ptr
        long frame,
        @Ptr
        long info,
        @Ptr
        long buffer, int id, IntValuedEnum<GstMapFlags> flags);

    public boolean map_id(Pointer<GstVideoInfo> info, Pointer<GstBuffer> buffer, int id, IntValuedEnum<GstMapFlags> flags) {
        return this.gst_video_frame_map_id(Pointer.pointerTo(this, GstVideoFrame.class).getPeer(), Pointer.getPeer(info), Pointer.getPeer(buffer), id, flags);
    }

    @Field(1)
    public int gstvideoframe_field_id() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GstVideoFrame gstvideoframe_field_id(int gstvideoframe_field_id) {
        this.io.setIntField(this, 1, gstvideoframe_field_id);
        return this;
    }

    @Field(2)
    public GstMapInfo gstvideoframe_field_map() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoFrame gstvideoframe_field_map(GstMapInfo gstvideoframe_field_map) {
        this.io.setNativeObjectField(this, 2, gstvideoframe_field_map);
        return this;
    }

    @Field(3)
    public Pointer<GstBuffer> gstvideoframe_field_buffer() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstVideoFrame gstvideoframe_field_buffer(Pointer<GstBuffer> gstvideoframe_field_buffer) {
        this.io.setPointerField(this, 3, gstvideoframe_field_buffer);
        return this;
    }

    protected native void gst_video_frame_unmap(
        @Ptr
        long frame);

    public void unmap() {
        this.gst_video_frame_unmap(Pointer.pointerTo(this, GstVideoFrame.class).getPeer());
    }

    @Field(4)
    public GstVideoInfo gstvideoframe_field_info() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstVideoFrame gstvideoframe_field_info(GstVideoInfo gstvideoframe_field_info) {
        this.io.setNativeObjectField(this, 4, gstvideoframe_field_info);
        return this;
    }

    @Field(5)
    private Pointer gstvideoframe_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstVideoFrame gstvideoframe_field__gst_reserved(Pointer gstvideoframe_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstvideoframe_field__gst_reserved);
        return this;
    }

    @Field(6)
    public Pointer gstvideoframe_field_data() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstVideoFrame gstvideoframe_field_data(Pointer gstvideoframe_field_data) {
        this.io.setPointerField(this, 6, gstvideoframe_field_data);
        return this;
    }

    protected native boolean gst_video_frame_map(
        @Ptr
        long frame,
        @Ptr
        long info,
        @Ptr
        long buffer, IntValuedEnum<GstMapFlags> flags);

    public boolean map(Pointer<GstVideoInfo> info, Pointer<GstBuffer> buffer, IntValuedEnum<GstMapFlags> flags) {
        return this.gst_video_frame_map(Pointer.pointerTo(this, GstVideoFrame.class).getPeer(), Pointer.getPeer(info), Pointer.getPeer(buffer), flags);
    }

    @Field(7)
    public Pointer gstvideoframe_field_meta() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstVideoFrame gstvideoframe_field_meta(Pointer gstvideoframe_field_meta) {
        this.io.setPointerField(this, 7, gstvideoframe_field_meta);
        return this;
    }

}
