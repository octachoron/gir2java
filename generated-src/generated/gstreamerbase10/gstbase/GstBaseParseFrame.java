
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstBuffer;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBaseParseFrame
    extends StructObject
{


    public GstBaseParseFrame() {
        super();
    }

    public GstBaseParseFrame(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstBuffer> field_buffer() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstBaseParseFrame field_buffer(Pointer<GstBuffer> field_buffer) {
        this.io.setPointerField(this, 0, field_buffer);
        return this;
    }

    @Field(1)
    public Pointer<GstBuffer> field_out_buffer() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBaseParseFrame field_out_buffer(Pointer<GstBuffer> field_out_buffer) {
        this.io.setPointerField(this, 1, field_out_buffer);
        return this;
    }

    @Field(2)
    public long field_flags() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstBaseParseFrame field_flags(long field_flags) {
        this.io.setNativeObjectField(this, 2, field_flags);
        return this;
    }

    @Field(3)
    public long field_offset() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstBaseParseFrame field_offset(long field_offset) {
        this.io.setNativeObjectField(this, 3, field_offset);
        return this;
    }

    @Field(4)
    public int field_overhead() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstBaseParseFrame field_overhead(int field_overhead) {
        this.io.setNativeObjectField(this, 4, field_overhead);
        return this;
    }

    @Field(5)
    public int field_size() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstBaseParseFrame field_size(int field_size) {
        this.io.setNativeObjectField(this, 5, field_size);
        return this;
    }

    @Field(6)
    public long field__gst_reserved_i() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstBaseParseFrame field__gst_reserved_i(long field__gst_reserved_i) {
        this.io.setPointerField(this, 6, field__gst_reserved_i);
        return this;
    }

    @Field(7)
    public Pointer field__gst_reserved_p() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstBaseParseFrame field__gst_reserved_p(Pointer field__gst_reserved_p) {
        this.io.setPointerField(this, 7, field__gst_reserved_p);
        return this;
    }

    @Field(8)
    public long field__private_flags() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstBaseParseFrame field__private_flags(long field__private_flags) {
        this.io.setNativeObjectField(this, 8, field__private_flags);
        return this;
    }

    protected native void gst_base_parse_frame_free(
        @Ptr
        long frame);

    public void free() {
        this.gst_base_parse_frame_free(Pointer.pointerTo(this, GstBaseParseFrame.class));
    }

    protected native void gst_base_parse_frame_init(
        @Ptr
        long frame);

    public void init() {
        this.gst_base_parse_frame_init(Pointer.pointerTo(this, GstBaseParseFrame.class));
    }

}
