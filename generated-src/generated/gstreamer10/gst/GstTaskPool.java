
package generated.gstreamer10.gst;

import generated.glib20.glib.GThreadPool;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTaskPool
    extends GstObject
{


    public GstTaskPool() {
        super();
    }

    public GstTaskPool(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_task_pool_cleanup(
        @Ptr
        long pool);

    public void cleanup() {
        this.gst_task_pool_cleanup(Pointer.pointerTo(this, GstTaskPool.class));
    }

    protected native void gst_task_pool_join(
        @Ptr
        long pool, Pointer id);

    public void join(Pointer id) {
        this.gst_task_pool_join(Pointer.pointerTo(this, GstTaskPool.class), id);
    }

    protected native void gst_task_pool_prepare(
        @Ptr
        long pool);

    public void prepare() {
        this.gst_task_pool_prepare(Pointer.pointerTo(this, GstTaskPool.class));
    }

    @Field(0)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTaskPool field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public Pointer<GThreadPool> field_pool() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTaskPool field_pool(Pointer<GThreadPool> field_pool) {
        this.io.setPointerField(this, 1, field_pool);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstTaskPool field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    protected native Pointer gst_task_pool_push(
        @Ptr
        long pool, Object func, Pointer user_data);

    public Pointer push(Object func, Pointer user_data) {
        return this.gst_task_pool_push(Pointer.pointerTo(this, GstTaskPool.class), func, user_data);
    }

}
