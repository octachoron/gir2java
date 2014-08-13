
package generated.gstreamerapp10.gstapp;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamerbase10.gstbase.GstBaseSrc;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-app-1.0")
public class GstAppSrc
    extends GstBaseSrc
{


    public GstAppSrc() {
        super();
    }

    public GstAppSrc(Pointer pointer) {
        super(pointer);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_app_src_end_of_stream(
        @Ptr
        long appsrc);

    public IntValuedEnum<GstFlowReturn> end_of_stream() {
        return this.gst_app_src_end_of_stream(Pointer.pointerTo(this, GstAppSrc.class));
    }

    @Ptr
    protected native long gst_app_src_get_caps(
        @Ptr
        long appsrc);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_app_src_get_caps(Pointer.pointerTo(this, GstAppSrc.class)), Pointer.class);
    }

    protected native long gst_app_src_get_current_level_bytes(
        @Ptr
        long appsrc);

    public long get_current_level_bytes() {
        return this.gst_app_src_get_current_level_bytes(Pointer.pointerTo(this, GstAppSrc.class));
    }

    protected native boolean gst_app_src_get_emit_signals(
        @Ptr
        long appsrc);

    public boolean get_emit_signals() {
        return this.gst_app_src_get_emit_signals(Pointer.pointerTo(this, GstAppSrc.class));
    }

    protected native void gst_app_src_get_latency(
        @Ptr
        long appsrc,
        @Ptr
        long min,
        @Ptr
        long max);

    public void get_latency(Pointer<Long> min, Pointer<Long> max) {
        this.gst_app_src_get_latency(Pointer.pointerTo(this, GstAppSrc.class), Pointer.getPeer(min), Pointer.getPeer(max));
    }

    protected native long gst_app_src_get_max_bytes(
        @Ptr
        long appsrc);

    public long get_max_bytes() {
        return this.gst_app_src_get_max_bytes(Pointer.pointerTo(this, GstAppSrc.class));
    }

    protected native long gst_app_src_get_size(
        @Ptr
        long appsrc);

    public long get_size() {
        return this.gst_app_src_get_size(Pointer.pointerTo(this, GstAppSrc.class));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_app_src_push_buffer(
        @Ptr
        long appsrc,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> push_buffer(Pointer<GstBuffer> buffer) {
        return this.gst_app_src_push_buffer(Pointer.pointerTo(this, GstAppSrc.class), Pointer.getPeer(buffer));
    }

    protected native void gst_app_src_set_callbacks(
        @Ptr
        long appsrc,
        @Ptr
        long callbacks, Pointer user_data, Object notify);

    public void set_callbacks(Pointer callbacks, Pointer user_data, Object notify) {
        this.gst_app_src_set_callbacks(Pointer.pointerTo(this, GstAppSrc.class), Pointer.getPeer(callbacks), user_data, notify);
    }

    protected native void gst_app_src_set_caps(
        @Ptr
        long appsrc,
        @Ptr
        long caps);

    public void set_caps(Pointer<GstCaps> caps) {
        this.gst_app_src_set_caps(Pointer.pointerTo(this, GstAppSrc.class), Pointer.getPeer(caps));
    }

    protected native void gst_app_src_set_emit_signals(
        @Ptr
        long appsrc, boolean emit);

    public void set_emit_signals(boolean emit) {
        this.gst_app_src_set_emit_signals(Pointer.pointerTo(this, GstAppSrc.class), emit);
    }

    protected native void gst_app_src_set_latency(
        @Ptr
        long appsrc, long min, long max);

    public void set_latency(long min, long max) {
        this.gst_app_src_set_latency(Pointer.pointerTo(this, GstAppSrc.class), min, max);
    }

    protected native void gst_app_src_set_max_bytes(
        @Ptr
        long appsrc, long max);

    public void set_max_bytes(long max) {
        this.gst_app_src_set_max_bytes(Pointer.pointerTo(this, GstAppSrc.class), max);
    }

    protected native void gst_app_src_set_size(
        @Ptr
        long appsrc, long size);

    public void set_size(long size) {
        this.gst_app_src_set_size(Pointer.pointerTo(this, GstAppSrc.class), size);
    }

    @Field(0)
    public GstBaseSrc field_basesrc() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAppSrc field_basesrc(GstBaseSrc field_basesrc) {
        this.io.setNativeObjectField(this, 0, field_basesrc);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAppSrc field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAppSrc field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    protected native void gst_app_src_set_stream_type(
        @Ptr
        long appsrc, IntValuedEnum<GstAppStreamType> type);

    public void set_stream_type(IntValuedEnum<GstAppStreamType> type) {
        this.gst_app_src_set_stream_type(Pointer.pointerTo(this, GstAppSrc.class), type);
    }

    protected native IntValuedEnum<GstAppStreamType> gst_app_src_get_stream_type(
        @Ptr
        long appsrc);

    public IntValuedEnum<GstAppStreamType> get_stream_type() {
        return this.gst_app_src_get_stream_type(Pointer.pointerTo(this, GstAppSrc.class));
    }

}
