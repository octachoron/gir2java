
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
    public GstVideoInfo field_info() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoFrame field_info(GstVideoInfo field_info) {
        this.io.setNativeObjectField(this, 0, field_info);
        return this;
    }

    @Field(1)
    public Pointer<GstBuffer> field_buffer() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoFrame field_buffer(Pointer<GstBuffer> field_buffer) {
        this.io.setPointerField(this, 1, field_buffer);
        return this;
    }

    @Field(2)
    public Pointer field_meta() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstVideoFrame field_meta(Pointer field_meta) {
        this.io.setPointerField(this, 2, field_meta);
        return this;
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

    protected native boolean gst_video_frame_copy_plane(
        @Ptr
        long dest,
        @Ptr
        long src, long plane);

    public boolean copy_plane(Pointer<GstVideoFrame> src, long plane) {
        return this.gst_video_frame_copy_plane(Pointer.pointerTo(this, GstVideoFrame.class).getPeer(), Pointer.getPeer(src), plane);
    }

    @Field(3)
    public Pointer field_data() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstVideoFrame field_data(Pointer field_data) {
        this.io.setPointerField(this, 3, field_data);
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

    @Field(4)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstVideoFrame field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    @Field(5)
    public IntValuedEnum<GstVideoFrameFlags> field_flags() {
        return this.io.getEnumField(this, 5);
    }

    @Field(5)
    public GstVideoFrame field_flags(IntValuedEnum<GstVideoFrameFlags> field_flags) {
        this.io.setEnumField(this, 5, field_flags);
        return this;
    }

    @Field(6)
    public int field_id() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public GstVideoFrame field_id(int field_id) {
        this.io.setIntField(this, 6, field_id);
        return this;
    }

    @Field(7)
    public GstMapInfo field_map() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstVideoFrame field_map(GstMapInfo field_map) {
        this.io.setNativeObjectField(this, 7, field_map);
        return this;
    }

    protected native void gst_video_frame_unmap(
        @Ptr
        long frame);

    public void unmap() {
        this.gst_video_frame_unmap(Pointer.pointerTo(this, GstVideoFrame.class).getPeer());
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

}
