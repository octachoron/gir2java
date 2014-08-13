
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHook
    extends StructObject
{


    public GHook() {
        super();
    }

    public GHook(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GHook field_data(Pointer field_data) {
        this.io.setNativeObjectField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public Pointer field_next() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GHook field_next(Pointer field_next) {
        this.io.setPointerField(this, 1, field_next);
        return this;
    }

    @Field(2)
    public Pointer field_prev() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GHook field_prev(Pointer field_prev) {
        this.io.setPointerField(this, 2, field_prev);
        return this;
    }

    @Field(3)
    public long field_ref_count() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GHook field_ref_count(long field_ref_count) {
        this.io.setNativeObjectField(this, 3, field_ref_count);
        return this;
    }

    @Field(4)
    public long field_hook_id() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GHook field_hook_id(long field_hook_id) {
        this.io.setNativeObjectField(this, 4, field_hook_id);
        return this;
    }

    @Field(5)
    public long field_flags() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GHook field_flags(long field_flags) {
        this.io.setNativeObjectField(this, 5, field_flags);
        return this;
    }

    @Field(6)
    public Pointer field_func() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GHook field_func(Pointer field_func) {
        this.io.setNativeObjectField(this, 6, field_func);
        return this;
    }

    @Field(7)
    public Object field_destroy() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GHook field_destroy(Object field_destroy) {
        this.io.setNativeObjectField(this, 7, field_destroy);
        return this;
    }

    protected native int g_hook_compare_ids(
        @Ptr
        long new_hook,
        @Ptr
        long sibling);

    public int compare_ids(Pointer sibling) {
        return this.g_hook_compare_ids(Pointer.pointerTo(this, GHook.class), Pointer.getPeer(sibling));
    }

    @Ptr
    protected native long g_hook_alloc(
        @Ptr
        long hook_list);

    public Pointer alloc(Pointer hook_list) {
        return Pointer.pointerToAddress(this.g_hook_alloc(Pointer.getPeer(hook_list)));
    }

    protected native boolean g_hook_destroy(
        @Ptr
        long hook_list, long hook_id);

    public boolean destroy(Pointer hook_list, long hook_id) {
        return this.g_hook_destroy(Pointer.getPeer(hook_list), hook_id);
    }

    protected native void g_hook_destroy_link(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void destroy_link(Pointer hook_list, Pointer hook) {
        this.g_hook_destroy_link(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    @Ptr
    protected native long g_hook_find_data(
        @Ptr
        long hook_list, boolean need_valids, Pointer data);

    public Pointer find_data(Pointer hook_list, boolean need_valids, Pointer data) {
        return Pointer.pointerToAddress(this.g_hook_find_data(Pointer.getPeer(hook_list), need_valids, data));
    }

    @Ptr
    protected native long g_hook_find_func(
        @Ptr
        long hook_list, boolean need_valids, Pointer func);

    public Pointer find_func(Pointer hook_list, boolean need_valids, Pointer func) {
        return Pointer.pointerToAddress(this.g_hook_find_func(Pointer.getPeer(hook_list), need_valids, func));
    }

    @Ptr
    protected native long g_hook_find_func_data(
        @Ptr
        long hook_list, boolean need_valids, Pointer func, Pointer data);

    public Pointer find_func_data(Pointer hook_list, boolean need_valids, Pointer func, Pointer data) {
        return Pointer.pointerToAddress(this.g_hook_find_func_data(Pointer.getPeer(hook_list), need_valids, func, data));
    }

    @Ptr
    protected native long g_hook_first_valid(
        @Ptr
        long hook_list, boolean may_be_in_call);

    public Pointer first_valid(Pointer hook_list, boolean may_be_in_call) {
        return Pointer.pointerToAddress(this.g_hook_first_valid(Pointer.getPeer(hook_list), may_be_in_call));
    }

    protected native void g_hook_free(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void free(Pointer hook_list, Pointer hook) {
        this.g_hook_free(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    @Ptr
    protected native long g_hook_get(
        @Ptr
        long hook_list, long hook_id);

    public Pointer get(Pointer hook_list, long hook_id) {
        return Pointer.pointerToAddress(this.g_hook_get(Pointer.getPeer(hook_list), hook_id));
    }

    protected native void g_hook_insert_before(
        @Ptr
        long hook_list,
        @Ptr
        long sibling,
        @Ptr
        long hook);

    public void insert_before(Pointer hook_list, Pointer sibling, Pointer hook) {
        this.g_hook_insert_before(Pointer.getPeer(hook_list), Pointer.getPeer(sibling), Pointer.getPeer(hook));
    }

    @Ptr
    protected native long g_hook_next_valid(
        @Ptr
        long hook_list,
        @Ptr
        long hook, boolean may_be_in_call);

    public Pointer next_valid(Pointer hook_list, Pointer hook, boolean may_be_in_call) {
        return Pointer.pointerToAddress(this.g_hook_next_valid(Pointer.getPeer(hook_list), Pointer.getPeer(hook), may_be_in_call));
    }

    protected native void g_hook_prepend(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void prepend(Pointer hook_list, Pointer hook) {
        this.g_hook_prepend(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    @Ptr
    protected native long g_hook_ref(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public Pointer ref(Pointer hook_list, Pointer hook) {
        return Pointer.pointerToAddress(this.g_hook_ref(Pointer.getPeer(hook_list), Pointer.getPeer(hook)));
    }

    protected native void g_hook_unref(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void unref(Pointer hook_list, Pointer hook) {
        this.g_hook_unref(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected native void g_hook_insert_sorted(
        @Ptr
        long hook_list,
        @Ptr
        long hook, Object func);

    public void insert_sorted(Pointer<GHookList> hook_list, Pointer<GHook> hook, Object func) {
        this.g_hook_insert_sorted(Pointer.getPeer(hook_list), Pointer.getPeer(hook), func);
    }

    @Ptr
    protected native long g_hook_find(
        @Ptr
        long hook_list, boolean need_valids, Object func, Pointer data);

    public Pointer<GHook> find(Pointer<GHookList> hook_list, boolean need_valids, Object func, Pointer data) {
        return Pointer.pointerToAddress(this.g_hook_find(Pointer.getPeer(hook_list), need_valids, func, data), Pointer.class);
    }

}
