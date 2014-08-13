
package generated.gstreameraudio10.gstaudio;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioFormatInfo
    extends StructObject
{


    public GstAudioFormatInfo() {
        super();
    }

    public GstAudioFormatInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstAudioFormat> field_format() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstAudioFormatInfo field_format(IntValuedEnum<GstAudioFormat> field_format) {
        this.io.setEnumField(this, 0, field_format);
        return this;
    }

    @Field(1)
    public Pointer field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioFormatInfo field_name(Pointer field_name) {
        this.io.setPointerField(this, 1, field_name);
        return this;
    }

    @Field(2)
    public Pointer field_description() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAudioFormatInfo field_description(Pointer field_description) {
        this.io.setPointerField(this, 2, field_description);
        return this;
    }

    @Field(3)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioFormatInfo field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 3, field_flags);
        return this;
    }

    @Field(4)
    public int field_endianness() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioFormatInfo field_endianness(int field_endianness) {
        this.io.setNativeObjectField(this, 4, field_endianness);
        return this;
    }

    @Field(5)
    public int field_width() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstAudioFormatInfo field_width(int field_width) {
        this.io.setNativeObjectField(this, 5, field_width);
        return this;
    }

    @Field(6)
    public int field_depth() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstAudioFormatInfo field_depth(int field_depth) {
        this.io.setNativeObjectField(this, 6, field_depth);
        return this;
    }

    @Field(7)
    public short field_silence() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstAudioFormatInfo field_silence(short field_silence) {
        this.io.setPointerField(this, 7, field_silence);
        return this;
    }

    @Field(8)
    public IntValuedEnum<GstAudioFormat> field_unpack_format() {
        return this.io.getEnumField(this, 8);
    }

    @Field(8)
    public GstAudioFormatInfo field_unpack_format(IntValuedEnum<GstAudioFormat> field_unpack_format) {
        this.io.setEnumField(this, 8, field_unpack_format);
        return this;
    }

    @Field(9)
    public Object field_unpack_func() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstAudioFormatInfo field_unpack_func(Object field_unpack_func) {
        this.io.setNativeObjectField(this, 9, field_unpack_func);
        return this;
    }

    @Field(10)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstAudioFormatInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 10, field__gst_reserved);
        return this;
    }

    @Field(11)
    public Object field_pack_func() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstAudioFormatInfo field_pack_func(Object field_pack_func) {
        this.io.setNativeObjectField(this, 11, field_pack_func);
        return this;
    }

}
