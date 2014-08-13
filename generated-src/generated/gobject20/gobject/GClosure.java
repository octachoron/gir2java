
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GClosure
    extends StructObject
{


    public GClosure() {
        super();
    }

    public GClosure(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_ref_count() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GClosure field_ref_count(long field_ref_count) {
        this.io.setNativeObjectField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public long field_meta_marshal_nouse() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GClosure field_meta_marshal_nouse(long field_meta_marshal_nouse) {
        this.io.setNativeObjectField(this, 1, field_meta_marshal_nouse);
        return this;
    }

    @Field(2)
    public long field_n_guards() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GClosure field_n_guards(long field_n_guards) {
        this.io.setNativeObjectField(this, 2, field_n_guards);
        return this;
    }

    @Field(3)
    public long field_n_fnotifiers() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GClosure field_n_fnotifiers(long field_n_fnotifiers) {
        this.io.setNativeObjectField(this, 3, field_n_fnotifiers);
        return this;
    }

    @Field(4)
    public long field_n_inotifiers() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GClosure field_n_inotifiers(long field_n_inotifiers) {
        this.io.setNativeObjectField(this, 4, field_n_inotifiers);
        return this;
    }

    @Field(5)
    public long field_in_inotify() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GClosure field_in_inotify(long field_in_inotify) {
        this.io.setNativeObjectField(this, 5, field_in_inotify);
        return this;
    }

    @Field(6)
    public long field_floating() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GClosure field_floating(long field_floating) {
        this.io.setNativeObjectField(this, 6, field_floating);
        return this;
    }

    @Field(7)
    public long field_derivative_flag() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GClosure field_derivative_flag(long field_derivative_flag) {
        this.io.setNativeObjectField(this, 7, field_derivative_flag);
        return this;
    }

    @Field(8)
    public long field_in_marshal() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GClosure field_in_marshal(long field_in_marshal) {
        this.io.setNativeObjectField(this, 8, field_in_marshal);
        return this;
    }

    @Field(9)
    public long field_is_invalid() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GClosure field_is_invalid(long field_is_invalid) {
        this.io.setNativeObjectField(this, 9, field_is_invalid);
        return this;
    }

    @Field(10)
    public Pointer field_data() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GClosure field_data(Pointer field_data) {
        this.io.setNativeObjectField(this, 10, field_data);
        return this;
    }

    @Field(11)
    public Pointer field_notifiers() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public GClosure field_notifiers(Pointer field_notifiers) {
        this.io.setPointerField(this, 11, field_notifiers);
        return this;
    }

    protected native void g_closure_invalidate(
        @Ptr
        long closure);

    public void invalidate() {
        this.g_closure_invalidate(Pointer.pointerTo(this, GClosure.class));
    }

    @Ptr
    protected native long g_closure_ref(
        @Ptr
        long closure);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_closure_ref(Pointer.pointerTo(this, GClosure.class)));
    }

    protected native void g_closure_sink(
        @Ptr
        long closure);

    public void sink() {
        this.g_closure_sink(Pointer.pointerTo(this, GClosure.class));
    }

    protected native void g_closure_unref(
        @Ptr
        long closure);

    public void unref() {
        this.g_closure_unref(Pointer.pointerTo(this, GClosure.class));
    }

    protected native void g_closure_invoke(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint);

    public void invoke(Pointer<GValue> return_value, long n_param_values, GValue param_values, Pointer invocation_hint) {
        this.g_closure_invoke(Pointer.pointerTo(this, GClosure.class), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint);
    }

    protected native void g_closure_remove_invalidate_notifier(
        @Ptr
        long closure, Pointer notify_data, Object notify_func);

    public void remove_invalidate_notifier(Pointer notify_data, Object notify_func) {
        this.g_closure_remove_invalidate_notifier(Pointer.pointerTo(this, GClosure.class), notify_data, notify_func);
    }

    protected native void g_closure_add_marshal_guards(
        @Ptr
        long closure, Pointer pre_marshal_data, Object pre_marshal_notify, Pointer post_marshal_data, Object post_marshal_notify);

    public void add_marshal_guards(Pointer pre_marshal_data, Object pre_marshal_notify, Pointer post_marshal_data, Object post_marshal_notify) {
        this.g_closure_add_marshal_guards(Pointer.pointerTo(this, GClosure.class), pre_marshal_data, pre_marshal_notify, post_marshal_data, post_marshal_notify);
    }

    protected native void g_closure_set_marshal(
        @Ptr
        long closure, Object marshal);

    public void set_marshal(Object marshal) {
        this.g_closure_set_marshal(Pointer.pointerTo(this, GClosure.class), marshal);
    }

    protected native void g_closure_set_meta_marshal(
        @Ptr
        long closure, Pointer marshal_data, Object meta_marshal);

    public void set_meta_marshal(Pointer marshal_data, Object meta_marshal) {
        this.g_closure_set_meta_marshal(Pointer.pointerTo(this, GClosure.class), marshal_data, meta_marshal);
    }

    protected native void g_closure_remove_finalize_notifier(
        @Ptr
        long closure, Pointer notify_data, Object notify_func);

    public void remove_finalize_notifier(Pointer notify_data, Object notify_func) {
        this.g_closure_remove_finalize_notifier(Pointer.pointerTo(this, GClosure.class), notify_data, notify_func);
    }

    protected native void g_closure_add_finalize_notifier(
        @Ptr
        long closure, Pointer notify_data, Object notify_func);

    public void add_finalize_notifier(Pointer notify_data, Object notify_func) {
        this.g_closure_add_finalize_notifier(Pointer.pointerTo(this, GClosure.class), notify_data, notify_func);
    }

    protected native void g_closure_add_invalidate_notifier(
        @Ptr
        long closure, Pointer notify_data, Object notify_func);

    public void add_invalidate_notifier(Pointer notify_data, Object notify_func) {
        this.g_closure_add_invalidate_notifier(Pointer.pointerTo(this, GClosure.class), notify_data, notify_func);
    }

}
