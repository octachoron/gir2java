
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GRecMutex;
import generated.glib20.glib.GThread;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTask
    extends GstObject
{


    public GstTask() {
        super();
    }

    public GstTask(Pointer pointer) {
        super(pointer);
    }

    public native void gst_task_cleanup_all();

    @Ptr
    protected native long gst_task_get_pool(
        @Ptr
        long task);

    public Pointer get_pool() {
        return Pointer.pointerToAddress(this.gst_task_get_pool(Pointer.pointerTo(this, GstTask.class)));
    }

    protected native boolean gst_task_join(
        @Ptr
        long task);

    public boolean join() {
        return this.gst_task_join(Pointer.pointerTo(this, GstTask.class));
    }

    protected native boolean gst_task_pause(
        @Ptr
        long task);

    public boolean pause() {
        return this.gst_task_pause(Pointer.pointerTo(this, GstTask.class));
    }

    protected native void gst_task_set_lock(
        @Ptr
        long task,
        @Ptr
        long mutex);

    public void set_lock(Pointer<GRecMutex> mutex) {
        this.gst_task_set_lock(Pointer.pointerTo(this, GstTask.class), Pointer.getPeer(mutex));
    }

    protected native void gst_task_set_pool(
        @Ptr
        long task,
        @Ptr
        long pool);

    public void set_pool(Pointer pool) {
        this.gst_task_set_pool(Pointer.pointerTo(this, GstTask.class), Pointer.getPeer(pool));
    }

    protected native boolean gst_task_start(
        @Ptr
        long task);

    public boolean start() {
        return this.gst_task_start(Pointer.pointerTo(this, GstTask.class));
    }

    protected native boolean gst_task_stop(
        @Ptr
        long task);

    public boolean stop() {
        return this.gst_task_stop(Pointer.pointerTo(this, GstTask.class));
    }

    @Field(0)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTask field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    protected native boolean gst_task_set_state(
        @Ptr
        long task, IntValuedEnum<GstTaskState> state);

    public boolean set_state(IntValuedEnum<GstTaskState> state) {
        return this.gst_task_set_state(Pointer.pointerTo(this, GstTask.class), state);
    }

    @Field(1)
    public Pointer<GThread> field_thread() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTask field_thread(Pointer<GThread> field_thread) {
        this.io.setPointerField(this, 1, field_thread);
        return this;
    }

    protected native void gst_task_set_enter_callback(
        @Ptr
        long task, Object enter_func, Pointer user_data, Object notify);

    public void set_enter_callback(Object enter_func, Pointer user_data, Object notify) {
        this.gst_task_set_enter_callback(Pointer.pointerTo(this, GstTask.class), enter_func, user_data, notify);
    }

    @Field(2)
    public Object field_func() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstTask field_func(Object field_func) {
        this.io.setNativeObjectField(this, 2, field_func);
        return this;
    }

    protected native IntValuedEnum<GstTaskState> gst_task_get_state(
        @Ptr
        long task);

    public IntValuedEnum<GstTaskState> get_state() {
        return this.gst_task_get_state(Pointer.pointerTo(this, GstTask.class));
    }

    protected native void gst_task_set_leave_callback(
        @Ptr
        long task, Object leave_func, Pointer user_data, Object notify);

    public void set_leave_callback(Object leave_func, Pointer user_data, Object notify) {
        this.gst_task_set_leave_callback(Pointer.pointerTo(this, GstTask.class), leave_func, user_data, notify);
    }

    @Field(3)
    public Pointer field_user_data() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstTask field_user_data(Pointer field_user_data) {
        this.io.setNativeObjectField(this, 3, field_user_data);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstTask field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    @Field(5)
    public boolean field_running() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstTask field_running(boolean field_running) {
        this.io.setNativeObjectField(this, 5, field_running);
        return this;
    }

    @Field(6)
    public Object field_notify() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstTask field_notify(Object field_notify) {
        this.io.setNativeObjectField(this, 6, field_notify);
        return this;
    }

    @Field(7)
    public Pointer<GstTaskPrivate> field_priv() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstTask field_priv(Pointer<GstTaskPrivate> field_priv) {
        this.io.setPointerField(this, 7, field_priv);
        return this;
    }

    @Field(8)
    public GCond field_cond() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstTask field_cond(GCond field_cond) {
        this.io.setNativeObjectField(this, 8, field_cond);
        return this;
    }

    @Field(9)
    public IntValuedEnum<GstTaskState> field_state() {
        return this.io.getEnumField(this, 9);
    }

    @Field(9)
    public GstTask field_state(IntValuedEnum<GstTaskState> field_state) {
        this.io.setEnumField(this, 9, field_state);
        return this;
    }

    @Field(10)
    public Pointer<GRecMutex> field_lock() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstTask field_lock(Pointer<GRecMutex> field_lock) {
        this.io.setPointerField(this, 10, field_lock);
        return this;
    }

}
