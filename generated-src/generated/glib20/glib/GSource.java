
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GSource
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSource() {
        super();
    }

    public GSource(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer field_callback_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GSource field_callback_data(Pointer field_callback_data) {
        this.io.setPointerField(this, 0, field_callback_data);
        return this;
    }

    @Field(1)
    private Pointer field_callback_funcs() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GSource field_callback_funcs(Pointer field_callback_funcs) {
        this.io.setPointerField(this, 1, field_callback_funcs);
        return this;
    }

    @Field(2)
    private Pointer field_source_funcs() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GSource field_source_funcs(Pointer field_source_funcs) {
        this.io.setPointerField(this, 2, field_source_funcs);
        return this;
    }

    @Field(3)
    private long field_ref_count() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    private GSource field_ref_count(long field_ref_count) {
        this.io.setLongField(this, 3, field_ref_count);
        return this;
    }

    @Field(4)
    private Pointer<GMainContext> field_context() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GSource field_context(Pointer<GMainContext> field_context) {
        this.io.setPointerField(this, 4, field_context);
        return this;
    }

    @Field(5)
    private int field_priority() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    private GSource field_priority(int field_priority) {
        this.io.setIntField(this, 5, field_priority);
        return this;
    }

    @Field(6)
    private long field_flags() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    private GSource field_flags(long field_flags) {
        this.io.setLongField(this, 6, field_flags);
        return this;
    }

    @Field(7)
    private long field_source_id() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    private GSource field_source_id(long field_source_id) {
        this.io.setLongField(this, 7, field_source_id);
        return this;
    }

    @Field(8)
    private Pointer<GSList> field_poll_fds() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    private GSource field_poll_fds(Pointer<GSList> field_poll_fds) {
        this.io.setPointerField(this, 8, field_poll_fds);
        return this;
    }

    @Field(9)
    private Pointer field_prev() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    private GSource field_prev(Pointer field_prev) {
        this.io.setPointerField(this, 9, field_prev);
        return this;
    }

    @Field(10)
    private Pointer field_next() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    private GSource field_next(Pointer field_next) {
        this.io.setPointerField(this, 10, field_next);
        return this;
    }

    @Field(11)
    private Pointer field_name() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    private GSource field_name(Pointer field_name) {
        this.io.setPointerField(this, 11, field_name);
        return this;
    }

    @Field(12)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    private GSource field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 12, field_priv);
        return this;
    }

    @Ptr
    protected static native long g_source_new(
        @Ptr
        long source_funcs, long struct_size);

    public static Pointer _new(Pointer source_funcs, long struct_size) {
        return Pointer.pointerToAddress(GSource.g_source_new(Pointer.getPeer(source_funcs), struct_size));
    }

    protected native void g_source_add_child_source(
        @Ptr
        long source,
        @Ptr
        long child_source);

    public void add_child_source(Pointer child_source) {
        this.g_source_add_child_source(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(child_source));
    }

    protected native void g_source_add_poll(
        @Ptr
        long source,
        @Ptr
        long fd);

    public void add_poll(Pointer<GPollFD> fd) {
        this.g_source_add_poll(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(fd));
    }

    @Ptr
    protected native long g_source_add_unix_fd(
        @Ptr
        long source, int fd, IntValuedEnum<GIOCondition> events);

    public Pointer add_unix_fd(int fd, IntValuedEnum<GIOCondition> events) {
        return Pointer.pointerToAddress(this.g_source_add_unix_fd(Pointer.pointerTo(this, GSource.class).getPeer(), fd, events));
    }

    protected native long g_source_attach(
        @Ptr
        long source,
        @Ptr
        long context);

    public long attach(Pointer<GMainContext> context) {
        return this.g_source_attach(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(context));
    }

    protected native void g_source_destroy(
        @Ptr
        long source);

    public void destroy() {
        this.g_source_destroy(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    protected native boolean g_source_get_can_recurse(
        @Ptr
        long source);

    public boolean get_can_recurse() {
        return this.g_source_get_can_recurse(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    @Ptr
    protected native long g_source_get_context(
        @Ptr
        long source);

    public Pointer<GMainContext> get_context() {
        return Pointer.pointerToAddress(this.g_source_get_context(Pointer.pointerTo(this, GSource.class).getPeer()), GMainContext.class);
    }

    protected native void g_source_get_current_time(
        @Ptr
        long source,
        @Ptr
        long timeval);

    public void get_current_time(Pointer timeval) {
        this.g_source_get_current_time(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(timeval));
    }

    protected native long g_source_get_id(
        @Ptr
        long source);

    public long get_id() {
        return this.g_source_get_id(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    @Ptr
    protected native long g_source_get_name(
        @Ptr
        long source);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_source_get_name(Pointer.pointerTo(this, GSource.class).getPeer()));
    }

    protected native int g_source_get_priority(
        @Ptr
        long source);

    public int get_priority() {
        return this.g_source_get_priority(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    protected native long g_source_get_ready_time(
        @Ptr
        long source);

    public long get_ready_time() {
        return this.g_source_get_ready_time(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    protected native long g_source_get_time(
        @Ptr
        long source);

    public long get_time() {
        return this.g_source_get_time(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    protected native boolean g_source_is_destroyed(
        @Ptr
        long source);

    public boolean is_destroyed() {
        return this.g_source_is_destroyed(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    protected native void g_source_modify_unix_fd(
        @Ptr
        long source,
        @Ptr
        long tag, IntValuedEnum<GIOCondition> new_events);

    public void modify_unix_fd(Pointer tag, IntValuedEnum<GIOCondition> new_events) {
        this.g_source_modify_unix_fd(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(tag), new_events);
    }

    protected native IntValuedEnum<GIOCondition> g_source_query_unix_fd(
        @Ptr
        long source,
        @Ptr
        long tag);

    public IntValuedEnum<GIOCondition> query_unix_fd(Pointer tag) {
        return this.g_source_query_unix_fd(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(tag));
    }

    @Ptr
    protected native long g_source_ref(
        @Ptr
        long source);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_source_ref(Pointer.pointerTo(this, GSource.class).getPeer()));
    }

    protected native void g_source_remove_child_source(
        @Ptr
        long source,
        @Ptr
        long child_source);

    public void remove_child_source(Pointer child_source) {
        this.g_source_remove_child_source(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(child_source));
    }

    protected native void g_source_remove_poll(
        @Ptr
        long source,
        @Ptr
        long fd);

    public void remove_poll(Pointer<GPollFD> fd) {
        this.g_source_remove_poll(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(fd));
    }

    protected native void g_source_remove_unix_fd(
        @Ptr
        long source,
        @Ptr
        long tag);

    public void remove_unix_fd(Pointer tag) {
        this.g_source_remove_unix_fd(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(tag));
    }

    protected native void g_source_set_callback_indirect(
        @Ptr
        long source,
        @Ptr
        long callback_data,
        @Ptr
        long callback_funcs);

    public void set_callback_indirect(Pointer callback_data, Pointer callback_funcs) {
        this.g_source_set_callback_indirect(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(callback_data), Pointer.getPeer(callback_funcs));
    }

    protected native void g_source_set_can_recurse(
        @Ptr
        long source, boolean can_recurse);

    public void set_can_recurse(boolean can_recurse) {
        this.g_source_set_can_recurse(Pointer.pointerTo(this, GSource.class).getPeer(), can_recurse);
    }

    protected native void g_source_set_funcs(
        @Ptr
        long source,
        @Ptr
        long funcs);

    public void set_funcs(Pointer funcs) {
        this.g_source_set_funcs(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(funcs));
    }

    protected native void g_source_set_name(
        @Ptr
        long source,
        @Ptr
        long name);

    public void set_name(Pointer name) {
        this.g_source_set_name(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(name));
    }

    protected native void g_source_set_priority(
        @Ptr
        long source, int priority);

    public void set_priority(int priority) {
        this.g_source_set_priority(Pointer.pointerTo(this, GSource.class).getPeer(), priority);
    }

    protected native void g_source_set_ready_time(
        @Ptr
        long source, long ready_time);

    public void set_ready_time(long ready_time) {
        this.g_source_set_ready_time(Pointer.pointerTo(this, GSource.class).getPeer(), ready_time);
    }

    protected native void g_source_unref(
        @Ptr
        long source);

    public void unref() {
        this.g_source_unref(Pointer.pointerTo(this, GSource.class).getPeer());
    }

    public static native boolean g_source_remove(long tag);

    protected static native boolean g_source_remove_by_funcs_user_data(
        @Ptr
        long funcs,
        @Ptr
        long user_data);

    public static boolean remove_by_funcs_user_data(Pointer funcs, Pointer user_data) {
        return GSource.g_source_remove_by_funcs_user_data(Pointer.getPeer(funcs), Pointer.getPeer(user_data));
    }

    protected static native boolean g_source_remove_by_user_data(
        @Ptr
        long user_data);

    public static boolean remove_by_user_data(Pointer user_data) {
        return GSource.g_source_remove_by_user_data(Pointer.getPeer(user_data));
    }

    protected static native void g_source_set_name_by_id(long tag,
        @Ptr
        long name);

    public static void set_name_by_id(long tag, Pointer name) {
        GSource.g_source_set_name_by_id(tag, Pointer.getPeer(name));
    }

    protected native void g_source_set_callback(
        @Ptr
        long source,
        @Ptr
        long func,
        @Ptr
        long data,
        @Ptr
        long notify);

    public void set_callback(Pointer func, Pointer data, Pointer notify) {
        this.g_source_set_callback(Pointer.pointerTo(this, GSource.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(data), Pointer.getPeer(notify));
    }

}
