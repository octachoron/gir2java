
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GRecMutex;
import generated.glib20.glib.GThread;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTask
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstTask() {
        super();
    }

    public GstTask(Pointer pointer) {
        super(pointer);
    }

    public static native void gst_task_cleanup_all();

    @Ptr
    protected native long gst_task_get_pool(
        @Ptr
        long task);

    public Pointer get_pool() {
        return Pointer.pointerToAddress(this.gst_task_get_pool(Pointer.pointerTo(this, GstTask.class).getPeer()));
    }

    protected native boolean gst_task_join(
        @Ptr
        long task);

    public boolean join() {
        return this.gst_task_join(Pointer.pointerTo(this, GstTask.class).getPeer());
    }

    protected native boolean gst_task_pause(
        @Ptr
        long task);

    public boolean pause() {
        return this.gst_task_pause(Pointer.pointerTo(this, GstTask.class).getPeer());
    }

    protected native void gst_task_set_lock(
        @Ptr
        long task,
        @Ptr
        long mutex);

    public void set_lock(Pointer<GRecMutex> mutex) {
        this.gst_task_set_lock(Pointer.pointerTo(this, GstTask.class).getPeer(), Pointer.getPeer(mutex));
    }

    protected native void gst_task_set_pool(
        @Ptr
        long task,
        @Ptr
        long pool);

    public void set_pool(Pointer pool) {
        this.gst_task_set_pool(Pointer.pointerTo(this, GstTask.class).getPeer(), Pointer.getPeer(pool));
    }

    protected native boolean gst_task_start(
        @Ptr
        long task);

    public boolean start() {
        return this.gst_task_start(Pointer.pointerTo(this, GstTask.class).getPeer());
    }

    protected native boolean gst_task_stop(
        @Ptr
        long task);

    public boolean stop() {
        return this.gst_task_stop(Pointer.pointerTo(this, GstTask.class).getPeer());
    }

    @Field(0)
    public GstObject gsttask_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTask gsttask_field_object(GstObject gsttask_field_object) {
        this.io.setNativeObjectField(this, 0, gsttask_field_object);
        return this;
    }

    @Field(1)
    public Pointer gsttask_field_func() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTask gsttask_field_func(Pointer gsttask_field_func) {
        this.io.setPointerField(this, 1, gsttask_field_func);
        return this;
    }

    @Field(2)
    public GCond gsttask_field_cond() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstTask gsttask_field_cond(GCond gsttask_field_cond) {
        this.io.setNativeObjectField(this, 2, gsttask_field_cond);
        return this;
    }

    @Field(3)
    private Pointer gsttask_field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstTask gsttask_field__gst_reserved(Pointer gsttask_field__gst_reserved) {
        this.io.setPointerField(this, 3, gsttask_field__gst_reserved);
        return this;
    }

    @Field(4)
    public boolean gsttask_field_running() {
        return this.io.getBooleanField(this, 4);
    }

    @Field(4)
    public GstTask gsttask_field_running(boolean gsttask_field_running) {
        this.io.setBooleanField(this, 4, gsttask_field_running);
        return this;
    }

    protected native boolean gst_task_set_state(
        @Ptr
        long task, IntValuedEnum<GstTaskState> state);

    public boolean set_state(IntValuedEnum<GstTaskState> state) {
        return this.gst_task_set_state(Pointer.pointerTo(this, GstTask.class).getPeer(), state);
    }

    @Field(5)
    private Pointer<GThread> gsttask_field_thread() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstTask gsttask_field_thread(Pointer<GThread> gsttask_field_thread) {
        this.io.setPointerField(this, 5, gsttask_field_thread);
        return this;
    }

    @Field(6)
    private Pointer<GstTaskPrivate> gsttask_field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstTask gsttask_field_priv(Pointer<GstTaskPrivate> gsttask_field_priv) {
        this.io.setPointerField(this, 6, gsttask_field_priv);
        return this;
    }

    @Field(7)
    public IntValuedEnum<GstTaskState> gsttask_field_state() {
        return this.io.getEnumField(this, 7);
    }

    @Field(7)
    public GstTask gsttask_field_state(IntValuedEnum<GstTaskState> gsttask_field_state) {
        this.io.setEnumField(this, 7, gsttask_field_state);
        return this;
    }

    protected native IntValuedEnum<GstTaskState> gst_task_get_state(
        @Ptr
        long task);

    public IntValuedEnum<GstTaskState> get_state() {
        return this.gst_task_get_state(Pointer.pointerTo(this, GstTask.class).getPeer());
    }

    @Field(8)
    public Pointer gsttask_field_notify() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstTask gsttask_field_notify(Pointer gsttask_field_notify) {
        this.io.setPointerField(this, 8, gsttask_field_notify);
        return this;
    }

    protected native void gst_task_set_leave_callback(
        @Ptr
        long task,
        @Ptr
        long leave_func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_leave_callback(Pointer leave_func, Pointer user_data, Pointer notify) {
        this.gst_task_set_leave_callback(Pointer.pointerTo(this, GstTask.class).getPeer(), Pointer.getPeer(leave_func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(9)
    public Pointer gsttask_field_user_data() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstTask gsttask_field_user_data(Pointer gsttask_field_user_data) {
        this.io.setPointerField(this, 9, gsttask_field_user_data);
        return this;
    }

    protected native void gst_task_set_enter_callback(
        @Ptr
        long task,
        @Ptr
        long enter_func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_enter_callback(Pointer enter_func, Pointer user_data, Pointer notify) {
        this.gst_task_set_enter_callback(Pointer.pointerTo(this, GstTask.class).getPeer(), Pointer.getPeer(enter_func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(10)
    public Pointer<GRecMutex> gsttask_field_lock() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstTask gsttask_field_lock(Pointer<GRecMutex> gsttask_field_lock) {
        this.io.setPointerField(this, 10, gsttask_field_lock);
        return this;
    }

    @Ptr
    protected static native long gst_task_new(
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public static Pointer<GstTask> gsttask__new(Pointer func, Pointer user_data, Pointer notify) {
        return Pointer.pointerToAddress(GstTask.gst_task_new(Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify)), GstTask.class);
    }

}
