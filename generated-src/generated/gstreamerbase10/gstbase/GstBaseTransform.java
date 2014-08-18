
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstAllocationParams;
import generated.gstreamer10.gst.GstAllocator;
import generated.gstreamer10.gst.GstBufferPool;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBaseTransform
    extends GstElement
{


    static {
        BridJ.register();
    }

    public GstBaseTransform() {
        super();
    }

    public GstBaseTransform(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_base_transform_get_allocator(
        @Ptr
        long trans,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void get_allocator(Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        this.gst_base_transform_get_allocator(Pointer.pointerTo(this, GstBaseTransform.class).getPeer(), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    @Ptr
    protected native long gst_base_transform_get_buffer_pool(
        @Ptr
        long trans);

    public Pointer<GstBufferPool> get_buffer_pool() {
        return Pointer.pointerToAddress(this.gst_base_transform_get_buffer_pool(Pointer.pointerTo(this, GstBaseTransform.class).getPeer()), GstBufferPool.class);
    }

    protected native boolean gst_base_transform_is_in_place(
        @Ptr
        long trans);

    public boolean is_in_place() {
        return this.gst_base_transform_is_in_place(Pointer.pointerTo(this, GstBaseTransform.class).getPeer());
    }

    protected native boolean gst_base_transform_is_passthrough(
        @Ptr
        long trans);

    public boolean is_passthrough() {
        return this.gst_base_transform_is_passthrough(Pointer.pointerTo(this, GstBaseTransform.class).getPeer());
    }

    protected native boolean gst_base_transform_is_qos_enabled(
        @Ptr
        long trans);

    public boolean is_qos_enabled() {
        return this.gst_base_transform_is_qos_enabled(Pointer.pointerTo(this, GstBaseTransform.class).getPeer());
    }

    protected native void gst_base_transform_reconfigure_sink(
        @Ptr
        long trans);

    public void reconfigure_sink() {
        this.gst_base_transform_reconfigure_sink(Pointer.pointerTo(this, GstBaseTransform.class).getPeer());
    }

    protected native void gst_base_transform_reconfigure_src(
        @Ptr
        long trans);

    public void reconfigure_src() {
        this.gst_base_transform_reconfigure_src(Pointer.pointerTo(this, GstBaseTransform.class).getPeer());
    }

    protected native void gst_base_transform_set_gap_aware(
        @Ptr
        long trans, boolean gap_aware);

    public void set_gap_aware(boolean gap_aware) {
        this.gst_base_transform_set_gap_aware(Pointer.pointerTo(this, GstBaseTransform.class).getPeer(), gap_aware);
    }

    protected native void gst_base_transform_set_in_place(
        @Ptr
        long trans, boolean in_place);

    public void set_in_place(boolean in_place) {
        this.gst_base_transform_set_in_place(Pointer.pointerTo(this, GstBaseTransform.class).getPeer(), in_place);
    }

    protected native void gst_base_transform_set_passthrough(
        @Ptr
        long trans, boolean passthrough);

    public void set_passthrough(boolean passthrough) {
        this.gst_base_transform_set_passthrough(Pointer.pointerTo(this, GstBaseTransform.class).getPeer(), passthrough);
    }

    protected native void gst_base_transform_set_prefer_passthrough(
        @Ptr
        long trans, boolean prefer_passthrough);

    public void set_prefer_passthrough(boolean prefer_passthrough) {
        this.gst_base_transform_set_prefer_passthrough(Pointer.pointerTo(this, GstBaseTransform.class).getPeer(), prefer_passthrough);
    }

    protected native void gst_base_transform_set_qos_enabled(
        @Ptr
        long trans, boolean enabled);

    public void set_qos_enabled(boolean enabled) {
        this.gst_base_transform_set_qos_enabled(Pointer.pointerTo(this, GstBaseTransform.class).getPeer(), enabled);
    }

    protected native void gst_base_transform_update_qos(
        @Ptr
        long trans, double proportion, long diff, long timestamp);

    public void update_qos(double proportion, long diff, long timestamp) {
        this.gst_base_transform_update_qos(Pointer.pointerTo(this, GstBaseTransform.class).getPeer(), proportion, diff, timestamp);
    }

    @Field(0)
    public GstElement field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseTransform field_element(GstElement field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBaseTransform field_sinkpad(Pointer<GstPad> field_sinkpad) {
        this.io.setPointerField(this, 1, field_sinkpad);
        return this;
    }

    @Field(2)
    public Pointer<GstPad> field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstBaseTransform field_srcpad(Pointer<GstPad> field_srcpad) {
        this.io.setPointerField(this, 2, field_srcpad);
        return this;
    }

    @Field(3)
    public boolean field_have_segment() {
        return this.io.getBooleanField(this, 3);
    }

    @Field(3)
    public GstBaseTransform field_have_segment(boolean field_have_segment) {
        this.io.setBooleanField(this, 3, field_have_segment);
        return this;
    }

    @Field(4)
    public GstSegment field_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstBaseTransform field_segment(GstSegment field_segment) {
        this.io.setNativeObjectField(this, 4, field_segment);
        return this;
    }

    @Field(5)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstBaseTransform field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 5, field_priv);
        return this;
    }

    @Field(6)
    private Pointer gstbasetransform_field__gst_reserved() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstBaseTransform gstbasetransform_field__gst_reserved(Pointer gstbasetransform_field__gst_reserved) {
        this.io.setPointerField(this, 6, gstbasetransform_field__gst_reserved);
        return this;
    }

}
