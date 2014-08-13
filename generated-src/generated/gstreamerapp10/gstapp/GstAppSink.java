
package generated.gstreamerapp10.gstapp;

import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstSample;
import generated.gstreamerbase10.gstbase.GstBaseSink;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-app-1.0")
public class GstAppSink
    extends GstBaseSink
{


    public GstAppSink() {
        super();
    }

    public GstAppSink(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_app_sink_get_caps(
        @Ptr
        long appsink);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_app_sink_get_caps(Pointer.pointerTo(this, GstAppSink.class)), Pointer.class);
    }

    protected native boolean gst_app_sink_get_drop(
        @Ptr
        long appsink);

    public boolean get_drop() {
        return this.gst_app_sink_get_drop(Pointer.pointerTo(this, GstAppSink.class));
    }

    protected native boolean gst_app_sink_get_emit_signals(
        @Ptr
        long appsink);

    public boolean get_emit_signals() {
        return this.gst_app_sink_get_emit_signals(Pointer.pointerTo(this, GstAppSink.class));
    }

    protected native long gst_app_sink_get_max_buffers(
        @Ptr
        long appsink);

    public long get_max_buffers() {
        return this.gst_app_sink_get_max_buffers(Pointer.pointerTo(this, GstAppSink.class));
    }

    protected native boolean gst_app_sink_is_eos(
        @Ptr
        long appsink);

    public boolean is_eos() {
        return this.gst_app_sink_is_eos(Pointer.pointerTo(this, GstAppSink.class));
    }

    @Ptr
    protected native long gst_app_sink_pull_preroll(
        @Ptr
        long appsink);

    public Pointer<GstSample> pull_preroll() {
        return Pointer.pointerToAddress(this.gst_app_sink_pull_preroll(Pointer.pointerTo(this, GstAppSink.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_app_sink_pull_sample(
        @Ptr
        long appsink);

    public Pointer<GstSample> pull_sample() {
        return Pointer.pointerToAddress(this.gst_app_sink_pull_sample(Pointer.pointerTo(this, GstAppSink.class)), Pointer.class);
    }

    protected native void gst_app_sink_set_callbacks(
        @Ptr
        long appsink,
        @Ptr
        long callbacks, Pointer user_data, Object notify);

    public void set_callbacks(Pointer callbacks, Pointer user_data, Object notify) {
        this.gst_app_sink_set_callbacks(Pointer.pointerTo(this, GstAppSink.class), Pointer.getPeer(callbacks), user_data, notify);
    }

    protected native void gst_app_sink_set_caps(
        @Ptr
        long appsink,
        @Ptr
        long caps);

    public void set_caps(Pointer<GstCaps> caps) {
        this.gst_app_sink_set_caps(Pointer.pointerTo(this, GstAppSink.class), Pointer.getPeer(caps));
    }

    protected native void gst_app_sink_set_drop(
        @Ptr
        long appsink, boolean drop);

    public void set_drop(boolean drop) {
        this.gst_app_sink_set_drop(Pointer.pointerTo(this, GstAppSink.class), drop);
    }

    protected native void gst_app_sink_set_emit_signals(
        @Ptr
        long appsink, boolean emit);

    public void set_emit_signals(boolean emit) {
        this.gst_app_sink_set_emit_signals(Pointer.pointerTo(this, GstAppSink.class), emit);
    }

    protected native void gst_app_sink_set_max_buffers(
        @Ptr
        long appsink, long max);

    public void set_max_buffers(long max) {
        this.gst_app_sink_set_max_buffers(Pointer.pointerTo(this, GstAppSink.class), max);
    }

    @Field(0)
    public GstBaseSink field_basesink() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAppSink field_basesink(GstBaseSink field_basesink) {
        this.io.setNativeObjectField(this, 0, field_basesink);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAppSink field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAppSink field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
