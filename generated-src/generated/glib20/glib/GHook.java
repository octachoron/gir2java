
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHook
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GHook() {
        super();
    }

    public GHook(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer ghook_field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GHook ghook_field_data(Pointer ghook_field_data) {
        this.io.setPointerField(this, 0, ghook_field_data);
        return this;
    }

    @Field(1)
    public Pointer ghook_field_next() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GHook ghook_field_next(Pointer ghook_field_next) {
        this.io.setPointerField(this, 1, ghook_field_next);
        return this;
    }

    @Field(2)
    public Pointer ghook_field_prev() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GHook ghook_field_prev(Pointer ghook_field_prev) {
        this.io.setPointerField(this, 2, ghook_field_prev);
        return this;
    }

    @Field(3)
    public long ghook_field_ref_count() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GHook ghook_field_ref_count(long ghook_field_ref_count) {
        this.io.setLongField(this, 3, ghook_field_ref_count);
        return this;
    }

    @Field(4)
    public long ghook_field_hook_id() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GHook ghook_field_hook_id(long ghook_field_hook_id) {
        this.io.setLongField(this, 4, ghook_field_hook_id);
        return this;
    }

    @Field(5)
    public long ghook_field_flags() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GHook ghook_field_flags(long ghook_field_flags) {
        this.io.setLongField(this, 5, ghook_field_flags);
        return this;
    }

    @Field(6)
    public Pointer ghook_field_func() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GHook ghook_field_func(Pointer ghook_field_func) {
        this.io.setPointerField(this, 6, ghook_field_func);
        return this;
    }

    @Field(7)
    public Pointer ghook_field_destroy() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GHook ghook_field_destroy(Pointer ghook_field_destroy) {
        this.io.setPointerField(this, 7, ghook_field_destroy);
        return this;
    }

    protected native int g_hook_compare_ids(
        @Ptr
        long new_hook,
        @Ptr
        long sibling);

    public int compare_ids(Pointer sibling) {
        return this.g_hook_compare_ids(Pointer.pointerTo(this, GHook.class).getPeer(), Pointer.getPeer(sibling));
    }

    @Ptr
    protected static native long g_hook_alloc(
        @Ptr
        long hook_list);

    public static Pointer alloc(Pointer hook_list) {
        return Pointer.pointerToAddress(GHook.g_hook_alloc(Pointer.getPeer(hook_list)));
    }

    protected static native boolean g_hook_destroy(
        @Ptr
        long hook_list, long hook_id);

    public static boolean destroy(Pointer hook_list, long hook_id) {
        return GHook.g_hook_destroy(Pointer.getPeer(hook_list), hook_id);
    }

    protected static native void g_hook_destroy_link(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void destroy_link(Pointer hook_list, Pointer hook) {
        GHook.g_hook_destroy_link(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    @Ptr
    protected static native long g_hook_find_data(
        @Ptr
        long hook_list, boolean need_valids,
        @Ptr
        long data);

    public static Pointer find_data(Pointer hook_list, boolean need_valids, Pointer data) {
        return Pointer.pointerToAddress(GHook.g_hook_find_data(Pointer.getPeer(hook_list), need_valids, Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_hook_find_func(
        @Ptr
        long hook_list, boolean need_valids,
        @Ptr
        long func);

    public static Pointer find_func(Pointer hook_list, boolean need_valids, Pointer func) {
        return Pointer.pointerToAddress(GHook.g_hook_find_func(Pointer.getPeer(hook_list), need_valids, Pointer.getPeer(func)));
    }

    @Ptr
    protected static native long g_hook_find_func_data(
        @Ptr
        long hook_list, boolean need_valids,
        @Ptr
        long func,
        @Ptr
        long data);

    public static Pointer find_func_data(Pointer hook_list, boolean need_valids, Pointer func, Pointer data) {
        return Pointer.pointerToAddress(GHook.g_hook_find_func_data(Pointer.getPeer(hook_list), need_valids, Pointer.getPeer(func), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_hook_first_valid(
        @Ptr
        long hook_list, boolean may_be_in_call);

    public static Pointer first_valid(Pointer hook_list, boolean may_be_in_call) {
        return Pointer.pointerToAddress(GHook.g_hook_first_valid(Pointer.getPeer(hook_list), may_be_in_call));
    }

    protected static native void g_hook_free(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void free(Pointer hook_list, Pointer hook) {
        GHook.g_hook_free(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    @Ptr
    protected static native long g_hook_get(
        @Ptr
        long hook_list, long hook_id);

    public static Pointer get(Pointer hook_list, long hook_id) {
        return Pointer.pointerToAddress(GHook.g_hook_get(Pointer.getPeer(hook_list), hook_id));
    }

    protected static native void g_hook_insert_before(
        @Ptr
        long hook_list,
        @Ptr
        long sibling,
        @Ptr
        long hook);

    public static void insert_before(Pointer hook_list, Pointer sibling, Pointer hook) {
        GHook.g_hook_insert_before(Pointer.getPeer(hook_list), Pointer.getPeer(sibling), Pointer.getPeer(hook));
    }

    @Ptr
    protected static native long g_hook_next_valid(
        @Ptr
        long hook_list,
        @Ptr
        long hook, boolean may_be_in_call);

    public static Pointer next_valid(Pointer hook_list, Pointer hook, boolean may_be_in_call) {
        return Pointer.pointerToAddress(GHook.g_hook_next_valid(Pointer.getPeer(hook_list), Pointer.getPeer(hook), may_be_in_call));
    }

    protected static native void g_hook_prepend(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void prepend(Pointer hook_list, Pointer hook) {
        GHook.g_hook_prepend(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    @Ptr
    protected static native long g_hook_ref(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static Pointer ref(Pointer hook_list, Pointer hook) {
        return Pointer.pointerToAddress(GHook.g_hook_ref(Pointer.getPeer(hook_list), Pointer.getPeer(hook)));
    }

    protected static native void g_hook_unref(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void unref(Pointer hook_list, Pointer hook) {
        GHook.g_hook_unref(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected static native void g_hook_insert_sorted(
        @Ptr
        long hook_list,
        @Ptr
        long hook,
        @Ptr
        long func);

    public static void insert_sorted(Pointer<GHookList> hook_list, Pointer<GHook> hook, Pointer func) {
        GHook.g_hook_insert_sorted(Pointer.getPeer(hook_list), Pointer.getPeer(hook), Pointer.getPeer(func));
    }

    @Ptr
    protected static native long g_hook_find(
        @Ptr
        long hook_list, boolean need_valids,
        @Ptr
        long func,
        @Ptr
        long data);

    public static Pointer<GHook> find(Pointer<GHookList> hook_list, boolean need_valids, Pointer func, Pointer data) {
        return Pointer.pointerToAddress(GHook.g_hook_find(Pointer.getPeer(hook_list), need_valids, Pointer.getPeer(func), Pointer.getPeer(data)), GHook.class);
    }

}
