
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBufferPool
    extends StructObject
{


    public GstBufferPool() {
        super();
    }

    public GstBufferPool(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_buffer_pool_config_add_option(
        @Ptr
        long config,
        @Ptr
        long option);

    public void config_add_option(Pointer config, Pointer option) {
        this.gst_buffer_pool_config_add_option(Pointer.getPeer(config), Pointer.getPeer(option));
    }

    protected native boolean gst_buffer_pool_config_get_allocator(
        @Ptr
        long config,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public boolean config_get_allocator(Pointer config, Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        return this.gst_buffer_pool_config_get_allocator(Pointer.getPeer(config), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    @Ptr
    protected native long gst_buffer_pool_config_get_option(
        @Ptr
        long config, long index);

    public Pointer config_get_option(Pointer config, long index) {
        return Pointer.pointerToAddress(this.gst_buffer_pool_config_get_option(Pointer.getPeer(config), index));
    }

    protected native boolean gst_buffer_pool_config_get_params(
        @Ptr
        long config,
        @Ptr
        long caps,
        @Ptr
        long size,
        @Ptr
        long min_buffers,
        @Ptr
        long max_buffers);

    public boolean config_get_params(Pointer config, Pointer caps, Pointer<Long> size, Pointer<Long> min_buffers, Pointer<Long> max_buffers) {
        return this.gst_buffer_pool_config_get_params(Pointer.getPeer(config), Pointer.getPeer(caps), Pointer.getPeer(size), Pointer.getPeer(min_buffers), Pointer.getPeer(max_buffers));
    }

    protected native boolean gst_buffer_pool_config_has_option(
        @Ptr
        long config,
        @Ptr
        long option);

    public boolean config_has_option(Pointer config, Pointer option) {
        return this.gst_buffer_pool_config_has_option(Pointer.getPeer(config), Pointer.getPeer(option));
    }

    protected native long gst_buffer_pool_config_n_options(
        @Ptr
        long config);

    public long config_n_options(Pointer config) {
        return this.gst_buffer_pool_config_n_options(Pointer.getPeer(config));
    }

    protected native void gst_buffer_pool_config_set_allocator(
        @Ptr
        long config,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void config_set_allocator(Pointer config, Pointer<GstAllocator> allocator, Pointer<GstAllocationParams> params) {
        this.gst_buffer_pool_config_set_allocator(Pointer.getPeer(config), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    protected native void gst_buffer_pool_config_set_params(
        @Ptr
        long config,
        @Ptr
        long caps, long size, long min_buffers, long max_buffers);

    public void config_set_params(Pointer config, Pointer caps, long size, long min_buffers, long max_buffers) {
        this.gst_buffer_pool_config_set_params(Pointer.getPeer(config), Pointer.getPeer(caps), size, min_buffers, max_buffers);
    }

    @Ptr
    protected native long gst_buffer_pool_get_config(
        @Ptr
        long pool);

    public Pointer get_config() {
        return Pointer.pointerToAddress(this.gst_buffer_pool_get_config(Pointer.pointerTo(this, GstBufferPool.class)));
    }

    @Ptr
    protected native long gst_buffer_pool_get_options(
        @Ptr
        long pool);

    public Pointer get_options() {
        return Pointer.pointerToAddress(this.gst_buffer_pool_get_options(Pointer.pointerTo(this, GstBufferPool.class)));
    }

    protected native boolean gst_buffer_pool_has_option(
        @Ptr
        long pool,
        @Ptr
        long option);

    public boolean has_option(Pointer option) {
        return this.gst_buffer_pool_has_option(Pointer.pointerTo(this, GstBufferPool.class), Pointer.getPeer(option));
    }

    protected native boolean gst_buffer_pool_is_active(
        @Ptr
        long pool);

    public boolean is_active() {
        return this.gst_buffer_pool_is_active(Pointer.pointerTo(this, GstBufferPool.class));
    }

    protected native void gst_buffer_pool_release_buffer(
        @Ptr
        long pool,
        @Ptr
        long buffer);

    public void release_buffer(Pointer<GstBuffer> buffer) {
        this.gst_buffer_pool_release_buffer(Pointer.pointerTo(this, GstBufferPool.class), Pointer.getPeer(buffer));
    }

    protected native boolean gst_buffer_pool_set_active(
        @Ptr
        long pool, boolean active);

    public boolean set_active(boolean active) {
        return this.gst_buffer_pool_set_active(Pointer.pointerTo(this, GstBufferPool.class), active);
    }

    protected native boolean gst_buffer_pool_set_config(
        @Ptr
        long pool,
        @Ptr
        long config);

    public boolean set_config(Pointer config) {
        return this.gst_buffer_pool_set_config(Pointer.pointerTo(this, GstBufferPool.class), Pointer.getPeer(config));
    }

    @Field(0)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstBufferPool field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 0, field__gst_reserved);
        return this;
    }

    @Field(1)
    public Pointer<GstBufferPoolPrivate> field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBufferPool field_priv(Pointer<GstBufferPoolPrivate> field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GstFlowReturn> gst_buffer_pool_acquire_buffer(
        @Ptr
        long pool,
        @Ptr
        long buffer,
        @Ptr
        long params);

    public IntValuedEnum<GstFlowReturn> acquire_buffer(Pointer<Pointer<GstBuffer>> buffer, Pointer<GstBufferPoolAcquireParams> params) {
        return this.gst_buffer_pool_acquire_buffer(Pointer.pointerTo(this, GstBufferPool.class), Pointer.getPeer(buffer), Pointer.getPeer(params));
    }

    @Field(2)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstBufferPool field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 2, field_object);
        return this;
    }

    @Field(3)
    public int field_flushing() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstBufferPool field_flushing(int field_flushing) {
        this.io.setNativeObjectField(this, 3, field_flushing);
        return this;
    }

}
