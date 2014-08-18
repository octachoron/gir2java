
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GClosure
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GClosure() {
        super();
    }

    public GClosure(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GClosure field_data(Pointer field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    protected native void g_closure_add_finalize_notifier(
        @Ptr
        long closure,
        @Ptr
        long notify_data,
        @Ptr
        long notify_func);

    public void add_finalize_notifier(Pointer notify_data, Pointer notify_func) {
        this.g_closure_add_finalize_notifier(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(notify_data), Pointer.getPeer(notify_func));
    }

    protected native void g_closure_unref(
        @Ptr
        long closure);

    public void unref() {
        this.g_closure_unref(Pointer.pointerTo(this, GClosure.class).getPeer());
    }

    protected native void g_closure_remove_finalize_notifier(
        @Ptr
        long closure,
        @Ptr
        long notify_data,
        @Ptr
        long notify_func);

    public void remove_finalize_notifier(Pointer notify_data, Pointer notify_func) {
        this.g_closure_remove_finalize_notifier(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(notify_data), Pointer.getPeer(notify_func));
    }

    protected native void g_closure_invalidate(
        @Ptr
        long closure);

    public void invalidate() {
        this.g_closure_invalidate(Pointer.pointerTo(this, GClosure.class).getPeer());
    }

    @Field(1)
    private long field_derivative_flag() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GClosure field_derivative_flag(long field_derivative_flag) {
        this.io.setLongField(this, 1, field_derivative_flag);
        return this;
    }

    protected native void g_closure_sink(
        @Ptr
        long closure);

    public void sink() {
        this.g_closure_sink(Pointer.pointerTo(this, GClosure.class).getPeer());
    }

    @Field(2)
    private long field_floating() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    private GClosure field_floating(long field_floating) {
        this.io.setLongField(this, 2, field_floating);
        return this;
    }

    protected native void g_closure_add_marshal_guards(
        @Ptr
        long closure,
        @Ptr
        long pre_marshal_data,
        @Ptr
        long pre_marshal_notify,
        @Ptr
        long post_marshal_data,
        @Ptr
        long post_marshal_notify);

    public void add_marshal_guards(Pointer pre_marshal_data, Pointer pre_marshal_notify, Pointer post_marshal_data, Pointer post_marshal_notify) {
        this.g_closure_add_marshal_guards(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(pre_marshal_data), Pointer.getPeer(pre_marshal_notify), Pointer.getPeer(post_marshal_data), Pointer.getPeer(post_marshal_notify));
    }

    protected native void g_closure_set_marshal(
        @Ptr
        long closure,
        @Ptr
        long marshal);

    public void set_marshal(Pointer marshal) {
        this.g_closure_set_marshal(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(marshal));
    }

    @Field(3)
    private long field_n_fnotifiers() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    private GClosure field_n_fnotifiers(long field_n_fnotifiers) {
        this.io.setLongField(this, 3, field_n_fnotifiers);
        return this;
    }

    protected native void g_closure_set_meta_marshal(
        @Ptr
        long closure,
        @Ptr
        long marshal_data,
        @Ptr
        long meta_marshal);

    public void set_meta_marshal(Pointer marshal_data, Pointer meta_marshal) {
        this.g_closure_set_meta_marshal(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(marshal_data), Pointer.getPeer(meta_marshal));
    }

    @Field(4)
    private long field_n_guards() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    private GClosure field_n_guards(long field_n_guards) {
        this.io.setLongField(this, 4, field_n_guards);
        return this;
    }

    @Field(5)
    private long field_meta_marshal_nouse() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    private GClosure field_meta_marshal_nouse(long field_meta_marshal_nouse) {
        this.io.setLongField(this, 5, field_meta_marshal_nouse);
        return this;
    }

    @Ptr
    protected native long g_closure_ref(
        @Ptr
        long closure);

    public Pointer<GClosure> ref() {
        return Pointer.pointerToAddress(this.g_closure_ref(Pointer.pointerTo(this, GClosure.class).getPeer()), GClosure.class);
    }

    @Field(6)
    public long field_in_marshal() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GClosure field_in_marshal(long field_in_marshal) {
        this.io.setLongField(this, 6, field_in_marshal);
        return this;
    }

    @Field(7)
    private long field_in_inotify() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    private GClosure field_in_inotify(long field_in_inotify) {
        this.io.setLongField(this, 7, field_in_inotify);
        return this;
    }

    @Ptr
    protected static native long g_closure_new_object(long sizeof_closure,
        @Ptr
        long object);

    public static Pointer<GClosure> new_object(long sizeof_closure, Pointer<GObject> object) {
        return Pointer.pointerToAddress(GClosure.g_closure_new_object(sizeof_closure, Pointer.getPeer(object)), GClosure.class);
    }

    protected native void g_closure_invoke(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint);

    public void invoke(Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint) {
        this.g_closure_invoke(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint));
    }

    @Field(8)
    public long field_is_invalid() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public GClosure field_is_invalid(long field_is_invalid) {
        this.io.setLongField(this, 8, field_is_invalid);
        return this;
    }

    protected native void g_closure_remove_invalidate_notifier(
        @Ptr
        long closure,
        @Ptr
        long notify_data,
        @Ptr
        long notify_func);

    public void remove_invalidate_notifier(Pointer notify_data, Pointer notify_func) {
        this.g_closure_remove_invalidate_notifier(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(notify_data), Pointer.getPeer(notify_func));
    }

    protected native void g_closure_add_invalidate_notifier(
        @Ptr
        long closure,
        @Ptr
        long notify_data,
        @Ptr
        long notify_func);

    public void add_invalidate_notifier(Pointer notify_data, Pointer notify_func) {
        this.g_closure_add_invalidate_notifier(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(notify_data), Pointer.getPeer(notify_func));
    }

    @Field(9)
    private long field_n_inotifiers() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    private GClosure field_n_inotifiers(long field_n_inotifiers) {
        this.io.setLongField(this, 9, field_n_inotifiers);
        return this;
    }

    @Field(10)
    private long field_ref_count() {
        return this.io.getLongField(this, 10);
    }

    @Field(10)
    private GClosure field_ref_count(long field_ref_count) {
        this.io.setLongField(this, 10, field_ref_count);
        return this;
    }

    @Field(11)
    private Pointer<GClosureNotifyData> field_notifiers() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    private GClosure field_notifiers(Pointer<GClosureNotifyData> field_notifiers) {
        this.io.setPointerField(this, 11, field_notifiers);
        return this;
    }

    @Ptr
    protected static native long g_closure_new_simple(long sizeof_closure,
        @Ptr
        long data);

    public static Pointer<GClosure> new_simple(long sizeof_closure, Pointer data) {
        return Pointer.pointerToAddress(GClosure.g_closure_new_simple(sizeof_closure, Pointer.getPeer(data)), GClosure.class);
    }

}
