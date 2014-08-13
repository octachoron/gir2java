
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstCaps;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-audio-1.0")
public class GstAudioRingBufferSpec
    extends StructObject
{


    public GstAudioRingBufferSpec() {
        super();
    }

    public GstAudioRingBufferSpec(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstCaps> field_caps() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstAudioRingBufferSpec field_caps(Pointer<GstCaps> field_caps) {
        this.io.setPointerField(this, 0, field_caps);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstAudioRingBufferFormatType> field_type() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstAudioRingBufferSpec field_type(IntValuedEnum<GstAudioRingBufferFormatType> field_type) {
        this.io.setEnumField(this, 1, field_type);
        return this;
    }

    @Field(2)
    public GstAudioInfo field_info() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstAudioRingBufferSpec field_info(GstAudioInfo field_info) {
        this.io.setNativeObjectField(this, 2, field_info);
        return this;
    }

    @Field(3)
    public long field_latency_time() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioRingBufferSpec field_latency_time(long field_latency_time) {
        this.io.setNativeObjectField(this, 3, field_latency_time);
        return this;
    }

    @Field(4)
    public long field_buffer_time() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioRingBufferSpec field_buffer_time(long field_buffer_time) {
        this.io.setNativeObjectField(this, 4, field_buffer_time);
        return this;
    }

    @Field(5)
    public int field_segsize() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstAudioRingBufferSpec field_segsize(int field_segsize) {
        this.io.setNativeObjectField(this, 5, field_segsize);
        return this;
    }

    @Field(6)
    public int field_segtotal() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstAudioRingBufferSpec field_segtotal(int field_segtotal) {
        this.io.setNativeObjectField(this, 6, field_segtotal);
        return this;
    }

    @Field(7)
    public int field_seglatency() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstAudioRingBufferSpec field_seglatency(int field_seglatency) {
        this.io.setNativeObjectField(this, 7, field_seglatency);
        return this;
    }

    @Field(8)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstAudioRingBufferSpec field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 8, field__gst_reserved);
        return this;
    }

}
