
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPipeline
    extends GstBin
{


    public GstPipeline() {
        super();
    }

    public GstPipeline(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_pipeline_auto_clock(
        @Ptr
        long pipeline);

    public void auto_clock() {
        this.gst_pipeline_auto_clock(Pointer.pointerTo(this, GstPipeline.class));
    }

    protected native boolean gst_pipeline_get_auto_flush_bus(
        @Ptr
        long pipeline);

    public boolean get_auto_flush_bus() {
        return this.gst_pipeline_get_auto_flush_bus(Pointer.pointerTo(this, GstPipeline.class));
    }

    @Ptr
    protected native long gst_pipeline_get_bus(
        @Ptr
        long pipeline);

    public Pointer<GstBus> get_bus() {
        return Pointer.pointerToAddress(this.gst_pipeline_get_bus(Pointer.pointerTo(this, GstPipeline.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_pipeline_get_clock(
        @Ptr
        long pipeline);

    public Pointer<GstClock> get_clock() {
        return Pointer.pointerToAddress(this.gst_pipeline_get_clock(Pointer.pointerTo(this, GstPipeline.class)), Pointer.class);
    }

    protected native Object gst_pipeline_get_delay(
        @Ptr
        long pipeline);

    public Object get_delay() {
        return this.gst_pipeline_get_delay(Pointer.pointerTo(this, GstPipeline.class));
    }

    protected native void gst_pipeline_set_auto_flush_bus(
        @Ptr
        long pipeline, boolean auto_flush);

    public void set_auto_flush_bus(boolean auto_flush) {
        this.gst_pipeline_set_auto_flush_bus(Pointer.pointerTo(this, GstPipeline.class), auto_flush);
    }

    protected native boolean gst_pipeline_set_clock(
        @Ptr
        long pipeline,
        @Ptr
        long clock);

    public boolean set_clock(Pointer<GstClock> clock) {
        return this.gst_pipeline_set_clock(Pointer.pointerTo(this, GstPipeline.class), Pointer.getPeer(clock));
    }

    protected native void gst_pipeline_set_delay(
        @Ptr
        long pipeline, Object delay);

    public void set_delay(Object delay) {
        this.gst_pipeline_set_delay(Pointer.pointerTo(this, GstPipeline.class), delay);
    }

    protected native void gst_pipeline_use_clock(
        @Ptr
        long pipeline,
        @Ptr
        long clock);

    public void use_clock(Pointer<GstClock> clock) {
        this.gst_pipeline_use_clock(Pointer.pointerTo(this, GstPipeline.class), Pointer.getPeer(clock));
    }

    @Field(0)
    public GstBin field_bin() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPipeline field_bin(GstBin field_bin) {
        this.io.setNativeObjectField(this, 0, field_bin);
        return this;
    }

    @Field(1)
    public Pointer<GstClock> field_fixed_clock() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstPipeline field_fixed_clock(Pointer<GstClock> field_fixed_clock) {
        this.io.setPointerField(this, 1, field_fixed_clock);
        return this;
    }

    @Field(2)
    public Object field_stream_time() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstPipeline field_stream_time(Object field_stream_time) {
        this.io.setNativeObjectField(this, 2, field_stream_time);
        return this;
    }

    @Field(3)
    public Object field_delay() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstPipeline field_delay(Object field_delay) {
        this.io.setNativeObjectField(this, 3, field_delay);
        return this;
    }

    @Field(4)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstPipeline field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 4, field_priv);
        return this;
    }

    @Field(5)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstPipeline field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 5, field__gst_reserved);
        return this;
    }

}
