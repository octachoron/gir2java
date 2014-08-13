
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GSource
    extends StructObject
{


    public GSource() {
        super();
    }

    public GSource(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_callback_data() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSource field_callback_data(Pointer field_callback_data) {
        this.io.setNativeObjectField(this, 0, field_callback_data);
        return this;
    }

    @Field(1)
    public Pointer field_callback_funcs() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSource field_callback_funcs(Pointer field_callback_funcs) {
        this.io.setPointerField(this, 1, field_callback_funcs);
        return this;
    }

    @Field(2)
    public Pointer field_source_funcs() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GSource field_source_funcs(Pointer field_source_funcs) {
        this.io.setPointerField(this, 2, field_source_funcs);
        return this;
    }

    @Field(3)
    public long field_ref_count() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GSource field_ref_count(long field_ref_count) {
        this.io.setNativeObjectField(this, 3, field_ref_count);
        return this;
    }

    @Field(4)
    public Pointer<GMainContext> field_context() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GSource field_context(Pointer<GMainContext> field_context) {
        this.io.setPointerField(this, 4, field_context);
        return this;
    }

    @Field(5)
    public int field_priority() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GSource field_priority(int field_priority) {
        this.io.setNativeObjectField(this, 5, field_priority);
        return this;
    }

    @Field(6)
    public long field_flags() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GSource field_flags(long field_flags) {
        this.io.setNativeObjectField(this, 6, field_flags);
        return this;
    }

    @Field(7)
    public long field_source_id() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GSource field_source_id(long field_source_id) {
        this.io.setNativeObjectField(this, 7, field_source_id);
        return this;
    }

    @Field(8)
    public Pointer<GSList> field_poll_fds() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GSource field_poll_fds(Pointer<GSList> field_poll_fds) {
        this.io.setPointerField(this, 8, field_poll_fds);
        return this;
    }

    @Field(9)
    public Pointer field_prev() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GSource field_prev(Pointer field_prev) {
        this.io.setPointerField(this, 9, field_prev);
        return this;
    }

    @Field(10)
    public Pointer field_next() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GSource field_next(Pointer field_next) {
        this.io.setPointerField(this, 10, field_next);
        return this;
    }

    @Field(11)
    public Pointer field_name() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public GSource field_name(Pointer field_name) {
        this.io.setPointerField(this, 11, field_name);
        return this;
    }

    @Field(12)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public GSource field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 12, field_priv);
        return this;
    }

    protected native void g_source_add_child_source(
        @Ptr
        long source,
        @Ptr
        long child_source);

    public void add_child_source(Pointer child_source) {
        this.g_source_add_child_source(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(child_source));
    }

    protected native void g_source_add_poll(
        @Ptr
        long source,
        @Ptr
        long fd);

    public void add_poll(Pointer<GPollFD> fd) {
        this.g_source_add_poll(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(fd));
    }

    protected native Pointer g_source_add_unix_fd(
        @Ptr
        long source, int fd, Object events);

    public Pointer add_unix_fd(int fd, Object events) {
        return this.g_source_add_unix_fd(Pointer.pointerTo(this, GSource.class), fd, events);
    }

    protected native long g_source_attach(
        @Ptr
        long source,
        @Ptr
        long context);

    public long attach(Pointer<GMainContext> context) {
        return this.g_source_attach(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(context));
    }

    protected native void g_source_destroy(
        @Ptr
        long source);

    public void destroy() {
        this.g_source_destroy(Pointer.pointerTo(this, GSource.class));
    }

    protected native boolean g_source_get_can_recurse(
        @Ptr
        long source);

    public boolean get_can_recurse() {
        return this.g_source_get_can_recurse(Pointer.pointerTo(this, GSource.class));
    }

    @Ptr
    protected native long g_source_get_context(
        @Ptr
        long source);

    public Pointer<GMainContext> get_context() {
        return Pointer.pointerToAddress(this.g_source_get_context(Pointer.pointerTo(this, GSource.class)), Pointer.class);
    }

    protected native void g_source_get_current_time(
        @Ptr
        long source,
        @Ptr
        long timeval);

    public void get_current_time(Pointer timeval) {
        this.g_source_get_current_time(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(timeval));
    }

    protected native long g_source_get_id(
        @Ptr
        long source);

    public long get_id() {
        return this.g_source_get_id(Pointer.pointerTo(this, GSource.class));
    }

    @Ptr
    protected native long g_source_get_name(
        @Ptr
        long source);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_source_get_name(Pointer.pointerTo(this, GSource.class)));
    }

    protected native int g_source_get_priority(
        @Ptr
        long source);

    public int get_priority() {
        return this.g_source_get_priority(Pointer.pointerTo(this, GSource.class));
    }

    protected native long g_source_get_ready_time(
        @Ptr
        long source);

    public long get_ready_time() {
        return this.g_source_get_ready_time(Pointer.pointerTo(this, GSource.class));
    }

    protected native long g_source_get_time(
        @Ptr
        long source);

    public long get_time() {
        return this.g_source_get_time(Pointer.pointerTo(this, GSource.class));
    }

    protected native boolean g_source_is_destroyed(
        @Ptr
        long source);

    public boolean is_destroyed() {
        return this.g_source_is_destroyed(Pointer.pointerTo(this, GSource.class));
    }

    protected native void g_source_modify_unix_fd(
        @Ptr
        long source, Pointer tag, Object new_events);

    public void modify_unix_fd(Pointer tag, Object new_events) {
        this.g_source_modify_unix_fd(Pointer.pointerTo(this, GSource.class), tag, new_events);
    }

    protected native Object g_source_query_unix_fd(
        @Ptr
        long source, Pointer tag);

    public Object query_unix_fd(Pointer tag) {
        return this.g_source_query_unix_fd(Pointer.pointerTo(this, GSource.class), tag);
    }

    @Ptr
    protected native long g_source_ref(
        @Ptr
        long source);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_source_ref(Pointer.pointerTo(this, GSource.class)));
    }

    protected native void g_source_remove_child_source(
        @Ptr
        long source,
        @Ptr
        long child_source);

    public void remove_child_source(Pointer child_source) {
        this.g_source_remove_child_source(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(child_source));
    }

    protected native void g_source_remove_poll(
        @Ptr
        long source,
        @Ptr
        long fd);

    public void remove_poll(Pointer<GPollFD> fd) {
        this.g_source_remove_poll(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(fd));
    }

    protected native void g_source_remove_unix_fd(
        @Ptr
        long source, Pointer tag);

    public void remove_unix_fd(Pointer tag) {
        this.g_source_remove_unix_fd(Pointer.pointerTo(this, GSource.class), tag);
    }

    protected native void g_source_set_callback_indirect(
        @Ptr
        long source, Pointer callback_data,
        @Ptr
        long callback_funcs);

    public void set_callback_indirect(Pointer callback_data, Pointer callback_funcs) {
        this.g_source_set_callback_indirect(Pointer.pointerTo(this, GSource.class), callback_data, Pointer.getPeer(callback_funcs));
    }

    protected native void g_source_set_can_recurse(
        @Ptr
        long source, boolean can_recurse);

    public void set_can_recurse(boolean can_recurse) {
        this.g_source_set_can_recurse(Pointer.pointerTo(this, GSource.class), can_recurse);
    }

    protected native void g_source_set_funcs(
        @Ptr
        long source,
        @Ptr
        long funcs);

    public void set_funcs(Pointer funcs) {
        this.g_source_set_funcs(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(funcs));
    }

    protected native void g_source_set_name(
        @Ptr
        long source,
        @Ptr
        long name);

    public void set_name(Pointer name) {
        this.g_source_set_name(Pointer.pointerTo(this, GSource.class), Pointer.getPeer(name));
    }

    protected native void g_source_set_priority(
        @Ptr
        long source, int priority);

    public void set_priority(int priority) {
        this.g_source_set_priority(Pointer.pointerTo(this, GSource.class), priority);
    }

    protected native void g_source_set_ready_time(
        @Ptr
        long source, long ready_time);

    public void set_ready_time(long ready_time) {
        this.g_source_set_ready_time(Pointer.pointerTo(this, GSource.class), ready_time);
    }

    protected native void g_source_unref(
        @Ptr
        long source);

    public void unref() {
        this.g_source_unref(Pointer.pointerTo(this, GSource.class));
    }

    public native boolean g_source_remove(long tag);

    protected native boolean g_source_remove_by_funcs_user_data(
        @Ptr
        long funcs, Pointer user_data);

    public boolean remove_by_funcs_user_data(Pointer funcs, Pointer user_data) {
        return this.g_source_remove_by_funcs_user_data(Pointer.getPeer(funcs), user_data);
    }

    public native boolean g_source_remove_by_user_data(Pointer user_data);

    protected native void g_source_set_name_by_id(long tag,
        @Ptr
        long name);

    public void set_name_by_id(long tag, Pointer name) {
        this.g_source_set_name_by_id(tag, Pointer.getPeer(name));
    }

    protected native void g_source_set_callback(
        @Ptr
        long source, Object func, Pointer data, Object notify);

    public void set_callback(Object func, Pointer data, Object notify) {
        this.g_source_set_callback(Pointer.pointerTo(this, GSource.class), func, data, notify);
    }

}
