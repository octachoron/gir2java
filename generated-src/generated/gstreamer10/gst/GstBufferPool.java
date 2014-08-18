
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBufferPool
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstBufferPool() {
        super();
    }

    public GstBufferPool(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_buffer_pool_new();

    public static Pointer gstbufferpool__new() {
        return Pointer.pointerToAddress(GstBufferPool.gst_buffer_pool_new());
    }

    protected static native void gst_buffer_pool_config_add_option(
        @Ptr
        long config,
        @Ptr
        long option);

    public static void config_add_option(Pointer<GstStructure> config, Pointer option) {
        GstBufferPool.gst_buffer_pool_config_add_option(Pointer.getPeer(config), Pointer.getPeer(option));
    }

    protected static native boolean gst_buffer_pool_config_get_allocator(
        @Ptr
        long config,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public static boolean config_get_allocator(Pointer<GstStructure> config, Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        return GstBufferPool.gst_buffer_pool_config_get_allocator(Pointer.getPeer(config), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    @Ptr
    protected static native long gst_buffer_pool_config_get_option(
        @Ptr
        long config, long index);

    public static Pointer config_get_option(Pointer<GstStructure> config, long index) {
        return Pointer.pointerToAddress(GstBufferPool.gst_buffer_pool_config_get_option(Pointer.getPeer(config), index));
    }

    protected static native boolean gst_buffer_pool_config_get_params(
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

    public static boolean config_get_params(Pointer<GstStructure> config, Pointer<Pointer<GstCaps>> caps, Pointer<Long> size, Pointer<Long> min_buffers, Pointer<Long> max_buffers) {
        return GstBufferPool.gst_buffer_pool_config_get_params(Pointer.getPeer(config), Pointer.getPeer(caps), Pointer.getPeer(size), Pointer.getPeer(min_buffers), Pointer.getPeer(max_buffers));
    }

    protected static native boolean gst_buffer_pool_config_has_option(
        @Ptr
        long config,
        @Ptr
        long option);

    public static boolean config_has_option(Pointer<GstStructure> config, Pointer option) {
        return GstBufferPool.gst_buffer_pool_config_has_option(Pointer.getPeer(config), Pointer.getPeer(option));
    }

    protected static native long gst_buffer_pool_config_n_options(
        @Ptr
        long config);

    public static long config_n_options(Pointer<GstStructure> config) {
        return GstBufferPool.gst_buffer_pool_config_n_options(Pointer.getPeer(config));
    }

    protected static native void gst_buffer_pool_config_set_allocator(
        @Ptr
        long config,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public static void config_set_allocator(Pointer<GstStructure> config, Pointer<GstAllocator> allocator, Pointer<GstAllocationParams> params) {
        GstBufferPool.gst_buffer_pool_config_set_allocator(Pointer.getPeer(config), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    protected static native void gst_buffer_pool_config_set_params(
        @Ptr
        long config,
        @Ptr
        long caps, long size, long min_buffers, long max_buffers);

    public static void config_set_params(Pointer<GstStructure> config, Pointer<GstCaps> caps, long size, long min_buffers, long max_buffers) {
        GstBufferPool.gst_buffer_pool_config_set_params(Pointer.getPeer(config), Pointer.getPeer(caps), size, min_buffers, max_buffers);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_buffer_pool_acquire_buffer(
        @Ptr
        long pool,
        @Ptr
        long buffer,
        @Ptr
        long params);

    public IntValuedEnum<GstFlowReturn> acquire_buffer(Pointer<Pointer<GstBuffer>> buffer, Pointer<GstBufferPoolAcquireParams> params) {
        return this.gst_buffer_pool_acquire_buffer(Pointer.pointerTo(this, GstBufferPool.class).getPeer(), Pointer.getPeer(buffer), Pointer.getPeer(params));
    }

    @Ptr
    protected native long gst_buffer_pool_get_config(
        @Ptr
        long pool);

    public Pointer<GstStructure> get_config() {
        return Pointer.pointerToAddress(this.gst_buffer_pool_get_config(Pointer.pointerTo(this, GstBufferPool.class).getPeer()), GstStructure.class);
    }

    @Ptr
    protected native long gst_buffer_pool_get_options(
        @Ptr
        long pool);

    public Pointer get_options() {
        return Pointer.pointerToAddress(this.gst_buffer_pool_get_options(Pointer.pointerTo(this, GstBufferPool.class).getPeer()));
    }

    protected native boolean gst_buffer_pool_has_option(
        @Ptr
        long pool,
        @Ptr
        long option);

    public boolean has_option(Pointer option) {
        return this.gst_buffer_pool_has_option(Pointer.pointerTo(this, GstBufferPool.class).getPeer(), Pointer.getPeer(option));
    }

    protected native boolean gst_buffer_pool_is_active(
        @Ptr
        long pool);

    public boolean is_active() {
        return this.gst_buffer_pool_is_active(Pointer.pointerTo(this, GstBufferPool.class).getPeer());
    }

    protected native void gst_buffer_pool_release_buffer(
        @Ptr
        long pool,
        @Ptr
        long buffer);

    public void release_buffer(Pointer<GstBuffer> buffer) {
        this.gst_buffer_pool_release_buffer(Pointer.pointerTo(this, GstBufferPool.class).getPeer(), Pointer.getPeer(buffer));
    }

    protected native boolean gst_buffer_pool_set_active(
        @Ptr
        long pool, boolean active);

    public boolean set_active(boolean active) {
        return this.gst_buffer_pool_set_active(Pointer.pointerTo(this, GstBufferPool.class).getPeer(), active);
    }

    protected native boolean gst_buffer_pool_set_config(
        @Ptr
        long pool,
        @Ptr
        long config);

    public boolean set_config(Pointer<GstStructure> config) {
        return this.gst_buffer_pool_set_config(Pointer.pointerTo(this, GstBufferPool.class).getPeer(), Pointer.getPeer(config));
    }

    @Field(0)
    public GstObject gstbufferpool_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBufferPool gstbufferpool_field_object(GstObject gstbufferpool_field_object) {
        this.io.setNativeObjectField(this, 0, gstbufferpool_field_object);
        return this;
    }

    @Field(1)
    public int field_flushing() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GstBufferPool field_flushing(int field_flushing) {
        this.io.setIntField(this, 1, field_flushing);
        return this;
    }

    @Field(2)
    private Pointer<GstBufferPoolPrivate> field_priv() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstBufferPool field_priv(Pointer<GstBufferPoolPrivate> field_priv) {
        this.io.setPointerField(this, 2, field_priv);
        return this;
    }

    @Field(3)
    private Pointer gstbufferpool_field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstBufferPool gstbufferpool_field__gst_reserved(Pointer gstbufferpool_field__gst_reserved) {
        this.io.setPointerField(this, 3, gstbufferpool_field__gst_reserved);
        return this;
    }

}
