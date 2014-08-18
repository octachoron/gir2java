
package generated.gstreamer10.gst;

import generated.glib20.glib.GThreadPool;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTaskPool
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstTaskPool() {
        super();
    }

    public GstTaskPool(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_task_pool_new();

    public static Pointer gsttaskpool__new() {
        return Pointer.pointerToAddress(GstTaskPool.gst_task_pool_new());
    }

    protected native void gst_task_pool_cleanup(
        @Ptr
        long pool);

    public void cleanup() {
        this.gst_task_pool_cleanup(Pointer.pointerTo(this, GstTaskPool.class).getPeer());
    }

    protected native void gst_task_pool_join(
        @Ptr
        long pool,
        @Ptr
        long id);

    public void join(Pointer id) {
        this.gst_task_pool_join(Pointer.pointerTo(this, GstTaskPool.class).getPeer(), Pointer.getPeer(id));
    }

    protected native void gst_task_pool_prepare(
        @Ptr
        long pool);

    public void prepare() {
        this.gst_task_pool_prepare(Pointer.pointerTo(this, GstTaskPool.class).getPeer());
    }

    @Field(0)
    public GstObject gsttaskpool_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTaskPool gsttaskpool_field_object(GstObject gsttaskpool_field_object) {
        this.io.setNativeObjectField(this, 0, gsttaskpool_field_object);
        return this;
    }

    @Field(1)
    private Pointer<GThreadPool> field_pool() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstTaskPool field_pool(Pointer<GThreadPool> field_pool) {
        this.io.setPointerField(this, 1, field_pool);
        return this;
    }

    @Field(2)
    private Pointer gsttaskpool_field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstTaskPool gsttaskpool_field__gst_reserved(Pointer gsttaskpool_field__gst_reserved) {
        this.io.setPointerField(this, 2, gsttaskpool_field__gst_reserved);
        return this;
    }

    @Ptr
    protected native long gst_task_pool_push(
        @Ptr
        long pool,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public Pointer push(Pointer func, Pointer user_data) {
        return Pointer.pointerToAddress(this.gst_task_pool_push(Pointer.pointerTo(this, GstTaskPool.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data)));
    }

}
