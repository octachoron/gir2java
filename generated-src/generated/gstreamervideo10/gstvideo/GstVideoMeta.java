
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMapFlags;
import generated.gstreamer10.gst.GstMapInfo;
import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.BridJ;
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


    static {
        BridJ.register();
    }

    public GstVideoMeta() {
        super();
    }

    public GstVideoMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta gstvideometa_field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoMeta gstvideometa_field_meta(GstMeta gstvideometa_field_meta) {
        this.io.setNativeObjectField(this, 0, gstvideometa_field_meta);
        return this;
    }

    @Field(1)
    public Pointer<GstBuffer> gstvideometa_field_buffer() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoMeta gstvideometa_field_buffer(Pointer<GstBuffer> gstvideometa_field_buffer) {
        this.io.setPointerField(this, 1, gstvideometa_field_buffer);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstVideoFrameFlags> gstvideometa_field_flags() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstVideoMeta gstvideometa_field_flags(IntValuedEnum<GstVideoFrameFlags> gstvideometa_field_flags) {
        this.io.setEnumField(this, 2, gstvideometa_field_flags);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GstVideoFormat> gstvideometa_field_format() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstVideoMeta gstvideometa_field_format(IntValuedEnum<GstVideoFormat> gstvideometa_field_format) {
        this.io.setEnumField(this, 3, gstvideometa_field_format);
        return this;
    }

    @Field(4)
    public int gstvideometa_field_id() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public GstVideoMeta gstvideometa_field_id(int gstvideometa_field_id) {
        this.io.setIntField(this, 4, gstvideometa_field_id);
        return this;
    }

    @Field(5)
    public long gstvideometa_field_width() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstVideoMeta gstvideometa_field_width(long gstvideometa_field_width) {
        this.io.setLongField(this, 5, gstvideometa_field_width);
        return this;
    }

    @Field(6)
    public long gstvideometa_field_height() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GstVideoMeta gstvideometa_field_height(long gstvideometa_field_height) {
        this.io.setLongField(this, 6, gstvideometa_field_height);
        return this;
    }

    @Field(7)
    public long gstvideometa_field_n_planes() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstVideoMeta gstvideometa_field_n_planes(long gstvideometa_field_n_planes) {
        this.io.setLongField(this, 7, gstvideometa_field_n_planes);
        return this;
    }

    @Field(8)
    public long gstvideometa_field_offset() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public GstVideoMeta gstvideometa_field_offset(long gstvideometa_field_offset) {
        this.io.setLongField(this, 8, gstvideometa_field_offset);
        return this;
    }

    @Field(9)
    public int gstvideometa_field_stride() {
        return this.io.getIntField(this, 9);
    }

    @Field(9)
    public GstVideoMeta gstvideometa_field_stride(int gstvideometa_field_stride) {
        this.io.setIntField(this, 9, gstvideometa_field_stride);
        return this;
    }

    protected native boolean gst_video_meta_map(
        @Ptr
        long meta, long plane,
        @Ptr
        long info,
        @Ptr
        long data,
        @Ptr
        long stride, IntValuedEnum<GstMapFlags> flags);

    public boolean map(long plane, Pointer<GstMapInfo> info, Pointer data, Pointer<Integer> stride, IntValuedEnum<GstMapFlags> flags) {
        return this.gst_video_meta_map(Pointer.pointerTo(this, GstVideoMeta.class).getPeer(), plane, Pointer.getPeer(info), Pointer.getPeer(data), Pointer.getPeer(stride), flags);
    }

    protected native boolean gst_video_meta_unmap(
        @Ptr
        long meta, long plane,
        @Ptr
        long info);

    public boolean unmap(long plane, Pointer<GstMapInfo> info) {
        return this.gst_video_meta_unmap(Pointer.pointerTo(this, GstVideoMeta.class).getPeer(), plane, Pointer.getPeer(info));
    }

    @Ptr
    protected static native long gst_video_meta_get_info();

    public static Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(GstVideoMeta.gst_video_meta_get_info(), GstMetaInfo.class);
    }

}
