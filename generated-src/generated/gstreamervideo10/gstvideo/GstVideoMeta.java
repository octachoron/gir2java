
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMapInfo;
import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoMeta
    extends StructObject
{


    public GstVideoMeta() {
        super();
    }

    public GstVideoMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoMeta field_meta(GstMeta field_meta) {
        this.io.setNativeObjectField(this, 0, field_meta);
        return this;
    }

    @Field(1)
    public Pointer<GstBuffer> field_buffer() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoMeta field_buffer(Pointer<GstBuffer> field_buffer) {
        this.io.setPointerField(this, 1, field_buffer);
        return this;
    }

    @Field(2)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoMeta field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 2, field_flags);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GstVideoFormat> field_format() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstVideoMeta field_format(IntValuedEnum<GstVideoFormat> field_format) {
        this.io.setEnumField(this, 3, field_format);
        return this;
    }

    @Field(4)
    public int field_id() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstVideoMeta field_id(int field_id) {
        this.io.setNativeObjectField(this, 4, field_id);
        return this;
    }

    @Field(5)
    public long field_width() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstVideoMeta field_width(long field_width) {
        this.io.setNativeObjectField(this, 5, field_width);
        return this;
    }

    @Field(6)
    public long field_height() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstVideoMeta field_height(long field_height) {
        this.io.setNativeObjectField(this, 6, field_height);
        return this;
    }

    @Field(7)
    public long field_n_planes() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstVideoMeta field_n_planes(long field_n_planes) {
        this.io.setNativeObjectField(this, 7, field_n_planes);
        return this;
    }

    @Field(8)
    public long field_offset() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstVideoMeta field_offset(long field_offset) {
        this.io.setPointerField(this, 8, field_offset);
        return this;
    }

    @Field(9)
    public int field_stride() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstVideoMeta field_stride(int field_stride) {
        this.io.setPointerField(this, 9, field_stride);
        return this;
    }

    protected native boolean gst_video_meta_map(
        @Ptr
        long meta, long plane,
        @Ptr
        long info, Pointer data,
        @Ptr
        long stride, Object flags);

    public boolean map(long plane, Pointer<GstMapInfo> info, Pointer data, Pointer<Integer> stride, Object flags) {
        return this.gst_video_meta_map(Pointer.pointerTo(this, GstVideoMeta.class), plane, Pointer.getPeer(info), data, Pointer.getPeer(stride), flags);
    }

    protected native boolean gst_video_meta_unmap(
        @Ptr
        long meta, long plane,
        @Ptr
        long info);

    public boolean unmap(long plane, Pointer<GstMapInfo> info) {
        return this.gst_video_meta_unmap(Pointer.pointerTo(this, GstVideoMeta.class), plane, Pointer.getPeer(info));
    }

    @Ptr
    protected native long gst_video_meta_get_info();

    public Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(this.gst_video_meta_get_info(), Pointer.class);
    }

}
