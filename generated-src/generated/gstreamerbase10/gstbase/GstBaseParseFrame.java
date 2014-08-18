
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstBuffer;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBaseParseFrame
    extends StructObject
{


    static {
        BridJ.register();
    }

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
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstBaseParseFrame field_flags(long field_flags) {
        this.io.setLongField(this, 2, field_flags);
        return this;
    }

    @Field(3)
    public long field_offset() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstBaseParseFrame field_offset(long field_offset) {
        this.io.setLongField(this, 3, field_offset);
        return this;
    }

    @Field(4)
    public int field_overhead() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public GstBaseParseFrame field_overhead(int field_overhead) {
        this.io.setIntField(this, 4, field_overhead);
        return this;
    }

    @Field(5)
    private int field_size() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    private GstBaseParseFrame field_size(int field_size) {
        this.io.setIntField(this, 5, field_size);
        return this;
    }

    @Field(6)
    private long field__gst_reserved_i() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    private GstBaseParseFrame field__gst_reserved_i(long field__gst_reserved_i) {
        this.io.setLongField(this, 6, field__gst_reserved_i);
        return this;
    }

    @Field(7)
    private Pointer field__gst_reserved_p() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GstBaseParseFrame field__gst_reserved_p(Pointer field__gst_reserved_p) {
        this.io.setPointerField(this, 7, field__gst_reserved_p);
        return this;
    }

    @Field(8)
    private long field__private_flags() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    private GstBaseParseFrame field__private_flags(long field__private_flags) {
        this.io.setLongField(this, 8, field__private_flags);
        return this;
    }

    protected native void gst_base_parse_frame_free(
        @Ptr
        long frame);

    public void free() {
        this.gst_base_parse_frame_free(Pointer.pointerTo(this, GstBaseParseFrame.class).getPeer());
    }

    protected native void gst_base_parse_frame_init(
        @Ptr
        long frame);

    public void init() {
        this.gst_base_parse_frame_init(Pointer.pointerTo(this, GstBaseParseFrame.class).getPeer());
    }

    @Ptr
    protected static native long gst_base_parse_frame_new(
        @Ptr
        long buffer, IntValuedEnum<GstBaseParseFrameFlags> flags, int overhead);

    public static Pointer<GstBaseParseFrame> _new(Pointer<GstBuffer> buffer, IntValuedEnum<GstBaseParseFrameFlags> flags, int overhead) {
        return Pointer.pointerToAddress(GstBaseParseFrame.gst_base_parse_frame_new(Pointer.getPeer(buffer), flags, overhead), GstBaseParseFrame.class);
    }

}
