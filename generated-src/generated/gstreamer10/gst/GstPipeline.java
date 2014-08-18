
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPipeline
    extends GstBin
{


    static {
        BridJ.register();
    }

    public GstPipeline() {
        super();
    }

    public GstPipeline(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_pipeline_new(
        @Ptr
        long name);

    public static Pointer<GstElement> gstpipeline__new(Pointer name) {
        return Pointer.pointerToAddress(GstPipeline.gst_pipeline_new(Pointer.getPeer(name)), GstElement.class);
    }

    protected native void gst_pipeline_auto_clock(
        @Ptr
        long pipeline);

    public void auto_clock() {
        this.gst_pipeline_auto_clock(Pointer.pointerTo(this, GstPipeline.class).getPeer());
    }

    protected native boolean gst_pipeline_get_auto_flush_bus(
        @Ptr
        long pipeline);

    public boolean get_auto_flush_bus() {
        return this.gst_pipeline_get_auto_flush_bus(Pointer.pointerTo(this, GstPipeline.class).getPeer());
    }

    @Ptr
    protected native long gst_pipeline_get_bus(
        @Ptr
        long pipeline);

    public Pointer<GstBus> gstpipeline_get_bus() {
        return Pointer.pointerToAddress(this.gst_pipeline_get_bus(Pointer.pointerTo(this, GstPipeline.class).getPeer()), GstBus.class);
    }

    @Ptr
    protected native long gst_pipeline_get_clock(
        @Ptr
        long pipeline);

    public Pointer<GstClock> gstpipeline_get_clock() {
        return Pointer.pointerToAddress(this.gst_pipeline_get_clock(Pointer.pointerTo(this, GstPipeline.class).getPeer()), GstClock.class);
    }

    protected native long gst_pipeline_get_delay(
        @Ptr
        long pipeline);

    public long get_delay() {
        return this.gst_pipeline_get_delay(Pointer.pointerTo(this, GstPipeline.class).getPeer());
    }

    protected native void gst_pipeline_set_auto_flush_bus(
        @Ptr
        long pipeline, boolean auto_flush);

    public void set_auto_flush_bus(boolean auto_flush) {
        this.gst_pipeline_set_auto_flush_bus(Pointer.pointerTo(this, GstPipeline.class).getPeer(), auto_flush);
    }

    protected native boolean gst_pipeline_set_clock(
        @Ptr
        long pipeline,
        @Ptr
        long clock);

    public boolean gstpipeline_set_clock(Pointer<GstClock> clock) {
        return this.gst_pipeline_set_clock(Pointer.pointerTo(this, GstPipeline.class).getPeer(), Pointer.getPeer(clock));
    }

    protected native void gst_pipeline_set_delay(
        @Ptr
        long pipeline, long delay);

    public void set_delay(long delay) {
        this.gst_pipeline_set_delay(Pointer.pointerTo(this, GstPipeline.class).getPeer(), delay);
    }

    protected native void gst_pipeline_use_clock(
        @Ptr
        long pipeline,
        @Ptr
        long clock);

    public void use_clock(Pointer<GstClock> clock) {
        this.gst_pipeline_use_clock(Pointer.pointerTo(this, GstPipeline.class).getPeer(), Pointer.getPeer(clock));
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
    public long field_stream_time() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstPipeline field_stream_time(long field_stream_time) {
        this.io.setLongField(this, 2, field_stream_time);
        return this;
    }

    @Field(3)
    public long field_delay() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstPipeline field_delay(long field_delay) {
        this.io.setLongField(this, 3, field_delay);
        return this;
    }

    @Field(4)
    private Pointer<GstPipelinePrivate> gstpipeline_field_priv() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstPipeline gstpipeline_field_priv(Pointer<GstPipelinePrivate> gstpipeline_field_priv) {
        this.io.setPointerField(this, 4, gstpipeline_field_priv);
        return this;
    }

    @Field(5)
    private Pointer gstpipeline_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstPipeline gstpipeline_field__gst_reserved(Pointer gstpipeline_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstpipeline_field__gst_reserved);
        return this;
    }

}
