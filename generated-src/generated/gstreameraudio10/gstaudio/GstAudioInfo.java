
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstFormat;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioInfo
    extends StructObject
{


    public GstAudioInfo() {
        super();
    }

    public GstAudioInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstAudioFormatInfo> field_finfo() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstAudioInfo field_finfo(Pointer<GstAudioFormatInfo> field_finfo) {
        this.io.setPointerField(this, 0, field_finfo);
        return this;
    }

    @Field(1)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstAudioInfo field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 1, field_flags);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstAudioChannelPosition> field_position() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstAudioInfo field_position(IntValuedEnum<GstAudioChannelPosition> field_position) {
        this.io.setEnumField(this, 2, field_position);
        return this;
    }

    @Ptr
    protected native long gst_audio_info_copy(
        @Ptr
        long info);

    public Pointer<GstAudioInfo> copy() {
        return Pointer.pointerToAddress(this.gst_audio_info_copy(Pointer.pointerTo(this, GstAudioInfo.class)), Pointer.class);
    }

    @Field(3)
    public int field_rate() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioInfo field_rate(int field_rate) {
        this.io.setNativeObjectField(this, 3, field_rate);
        return this;
    }

    protected native boolean gst_audio_info_is_equal(
        @Ptr
        long info,
        @Ptr
        long other);

    public boolean is_equal(Pointer<GstAudioInfo> other) {
        return this.gst_audio_info_is_equal(Pointer.pointerTo(this, GstAudioInfo.class), Pointer.getPeer(other));
    }

    @Ptr
    protected native long gst_audio_info_to_caps(
        @Ptr
        long info);

    public Pointer<GstCaps> to_caps() {
        return Pointer.pointerToAddress(this.gst_audio_info_to_caps(Pointer.pointerTo(this, GstAudioInfo.class)), Pointer.class);
    }

    protected native void gst_audio_info_free(
        @Ptr
        long info);

    public void free() {
        this.gst_audio_info_free(Pointer.pointerTo(this, GstAudioInfo.class));
    }

    @Field(4)
    public int field_bpf() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioInfo field_bpf(int field_bpf) {
        this.io.setNativeObjectField(this, 4, field_bpf);
        return this;
    }

    protected native boolean gst_audio_info_from_caps(
        @Ptr
        long info,
        @Ptr
        long caps);

    public boolean from_caps(Pointer<GstCaps> caps) {
        return this.gst_audio_info_from_caps(Pointer.pointerTo(this, GstAudioInfo.class), Pointer.getPeer(caps));
    }

    @Field(5)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstAudioInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 5, field__gst_reserved);
        return this;
    }

    @Field(6)
    public IntValuedEnum<GstAudioLayout> field_layout() {
        return this.io.getEnumField(this, 6);
    }

    @Field(6)
    public GstAudioInfo field_layout(IntValuedEnum<GstAudioLayout> field_layout) {
        this.io.setEnumField(this, 6, field_layout);
        return this;
    }

    protected native void gst_audio_info_set_format(
        @Ptr
        long info, IntValuedEnum<GstAudioFormat> format, int rate, int channels,
        @Ptr
        long position);

    public void set_format(IntValuedEnum<GstAudioFormat> format, int rate, int channels, Pointer<IntValuedEnum<GstAudioChannelPosition>> position) {
        this.gst_audio_info_set_format(Pointer.pointerTo(this, GstAudioInfo.class), format, rate, channels, Pointer.getPeer(position));
    }

    protected native boolean gst_audio_info_convert(
        @Ptr
        long info, IntValuedEnum<GstFormat> src_fmt, long src_val, IntValuedEnum<GstFormat> dest_fmt,
        @Ptr
        long dest_val);

    public boolean convert(IntValuedEnum<GstFormat> src_fmt, long src_val, IntValuedEnum<GstFormat> dest_fmt, Pointer<Long> dest_val) {
        return this.gst_audio_info_convert(Pointer.pointerTo(this, GstAudioInfo.class), src_fmt, src_val, dest_fmt, Pointer.getPeer(dest_val));
    }

    protected native void gst_audio_info_init(
        @Ptr
        long info);

    public void init() {
        this.gst_audio_info_init(Pointer.pointerTo(this, GstAudioInfo.class));
    }

    @Field(7)
    public int field_channels() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstAudioInfo field_channels(int field_channels) {
        this.io.setNativeObjectField(this, 7, field_channels);
        return this;
    }

}
