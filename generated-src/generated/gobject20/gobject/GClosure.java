
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

    protected native void g_closure_unref(
        @Ptr
        long closure);

    public void unref() {
        this.g_closure_unref(Pointer.pointerTo(this, GClosure.class).getPeer());
    }

    @Field(0)
    public long gclosure_field_in_marshal() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GClosure gclosure_field_in_marshal(long gclosure_field_in_marshal) {
        this.io.setLongField(this, 0, gclosure_field_in_marshal);
        return this;
    }

    @Ptr
    protected native long g_closure_ref(
        @Ptr
        long closure);

    public Pointer<GClosure> ref() {
        return Pointer.pointerToAddress(this.g_closure_ref(Pointer.pointerTo(this, GClosure.class).getPeer()), GClosure.class);
    }

    protected native void g_closure_sink(
        @Ptr
        long closure);

    public void sink() {
        this.g_closure_sink(Pointer.pointerTo(this, GClosure.class).getPeer());
    }

    @Ptr
    protected static native long g_closure_new_object(long sizeof_closure,
        @Ptr
        long object);

    public static Pointer<GClosure> new_object(long sizeof_closure, Pointer<GObject> object) {
        return Pointer.pointerToAddress(GClosure.g_closure_new_object(sizeof_closure, Pointer.getPeer(object)), GClosure.class);
    }

    protected native void g_closure_set_marshal(
        @Ptr
        long closure,
        @Ptr
        long marshal);

    public void set_marshal(Pointer marshal) {
        this.g_closure_set_marshal(Pointer.pointerTo(this, GClosure.class).getPeer(), Pointer.getPeer(marshal));
    }

    @Field(1)
    private long gclosure_field_floating() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GClosure gclosure_field_floating(long gclosure_field_floating) {
        this.io.setLongField(this, 1, gclosure_field_floating);
        return this;
    }

    @Field(2)
    private long gclosure_field_n_inotifiers() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    private GClosure gclosure_field_n_inotifiers(long gclosure_field_n_inotifiers) {
        this.io.setLongField(this, 2, gclosure_field_n_inotifiers);
        return this;
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

    @Field(3)
    private long gclosure_field_in_inotify() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    private GClosure gclosure_field_in_inotify(long gclosure_field_in_inotify) {
        this.io.setLongField(this, 3, gclosure_field_in_inotify);
        return this;
    }

    @Field(4)
    private long gclosure_field_n_fnotifiers() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    private GClosure gclosure_field_n_fnotifiers(long gclosure_field_n_fnotifiers) {
        this.io.setLongField(this, 4, gclosure_field_n_fnotifiers);
        return this;
    }

    protected native void g_closure_invalidate(
        @Ptr
        long closure);

    public void invalidate() {
        this.g_closure_invalidate(Pointer.pointerTo(this, GClosure.class).getPeer());
    }

    @Field(5)
    private long gclosure_field_meta_marshal_nouse() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    private GClosure gclosure_field_meta_marshal_nouse(long gclosure_field_meta_marshal_nouse) {
        this.io.setLongField(this, 5, gclosure_field_meta_marshal_nouse);
        return this;
    }

    @Ptr
    protected static native long g_closure_new_simple(long sizeof_closure,
        @Ptr
        long data);

    public static Pointer<GClosure> new_simple(long sizeof_closure, Pointer data) {
        return Pointer.pointerToAddress(GClosure.g_closure_new_simple(sizeof_closure, Pointer.getPeer(data)), GClosure.class);
    }

    @Field(6)
    private long gclosure_field_derivative_flag() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    private GClosure gclosure_field_derivative_flag(long gclosure_field_derivative_flag) {
        this.io.setLongField(this, 6, gclosure_field_derivative_flag);
        return this;
    }

    @Field(7)
    public long gclosure_field_is_invalid() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GClosure gclosure_field_is_invalid(long gclosure_field_is_invalid) {
        this.io.setLongField(this, 7, gclosure_field_is_invalid);
        return this;
    }

    @Field(8)
    private Pointer gclosure_field_data() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    private GClosure gclosure_field_data(Pointer gclosure_field_data) {
        this.io.setPointerField(this, 8, gclosure_field_data);
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

    @Field(9)
    private Pointer<GClosureNotifyData> gclosure_field_notifiers() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    private GClosure gclosure_field_notifiers(Pointer<GClosureNotifyData> gclosure_field_notifiers) {
        this.io.setPointerField(this, 9, gclosure_field_notifiers);
        return this;
    }

    @Field(10)
    private long gclosure_field_n_guards() {
        return this.io.getLongField(this, 10);
    }

    @Field(10)
    private GClosure gclosure_field_n_guards(long gclosure_field_n_guards) {
        this.io.setLongField(this, 10, gclosure_field_n_guards);
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

    @Field(11)
    private long gclosure_field_ref_count() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    private GClosure gclosure_field_ref_count(long gclosure_field_ref_count) {
        this.io.setLongField(this, 11, gclosure_field_ref_count);
        return this;
    }

}
