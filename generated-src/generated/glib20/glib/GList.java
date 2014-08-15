
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GList
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GList() {
        super();
    }

    public GList(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GList field_data(Pointer field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public Pointer field_next() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GList field_next(Pointer field_next) {
        this.io.setPointerField(this, 1, field_next);
        return this;
    }

    @Field(2)
    public Pointer field_prev() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GList field_prev(Pointer field_prev) {
        this.io.setPointerField(this, 2, field_prev);
        return this;
    }

    @Ptr
    protected static native long g_list_alloc();

    public static Pointer alloc() {
        return Pointer.pointerToAddress(GList.g_list_alloc());
    }

    @Ptr
    protected static native long g_list_append(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer append(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GList.g_list_append(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_list_concat(
        @Ptr
        long list1,
        @Ptr
        long list2);

    public static Pointer concat(Pointer list1, Pointer list2) {
        return Pointer.pointerToAddress(GList.g_list_concat(Pointer.getPeer(list1), Pointer.getPeer(list2)));
    }

    @Ptr
    protected static native long g_list_copy(
        @Ptr
        long list);

    public static Pointer copy(Pointer list) {
        return Pointer.pointerToAddress(GList.g_list_copy(Pointer.getPeer(list)));
    }

    @Ptr
    protected static native long g_list_copy_deep(
        @Ptr
        long list,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static Pointer copy_deep(Pointer list, Pointer func, Pointer user_data) {
        return Pointer.pointerToAddress(GList.g_list_copy_deep(Pointer.getPeer(list), Pointer.getPeer(func), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected static native long g_list_delete_link(
        @Ptr
        long list,
        @Ptr
        long link_);

    public static Pointer delete_link(Pointer list, Pointer link_) {
        return Pointer.pointerToAddress(GList.g_list_delete_link(Pointer.getPeer(list), Pointer.getPeer(link_)));
    }

    @Ptr
    protected static native long g_list_find(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer find(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GList.g_list_find(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_list_find_custom(
        @Ptr
        long list,
        @Ptr
        long data,
        @Ptr
        long func);

    public static Pointer find_custom(Pointer list, Pointer data, Pointer func) {
        return Pointer.pointerToAddress(GList.g_list_find_custom(Pointer.getPeer(list), Pointer.getPeer(data), Pointer.getPeer(func)));
    }

    @Ptr
    protected static native long g_list_first(
        @Ptr
        long list);

    public static Pointer first(Pointer list) {
        return Pointer.pointerToAddress(GList.g_list_first(Pointer.getPeer(list)));
    }

    protected static native void g_list_foreach(
        @Ptr
        long list,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static void foreach(Pointer list, Pointer func, Pointer user_data) {
        GList.g_list_foreach(Pointer.getPeer(list), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected static native void g_list_free(
        @Ptr
        long list);

    public static void free(Pointer list) {
        GList.g_list_free(Pointer.getPeer(list));
    }

    protected static native void g_list_free_1(
        @Ptr
        long list);

    public static void free_1(Pointer list) {
        GList.g_list_free_1(Pointer.getPeer(list));
    }

    protected static native void g_list_free_full(
        @Ptr
        long list,
        @Ptr
        long free_func);

    public static void free_full(Pointer list, Pointer free_func) {
        GList.g_list_free_full(Pointer.getPeer(list), Pointer.getPeer(free_func));
    }

    protected static native int g_list_index(
        @Ptr
        long list,
        @Ptr
        long data);

    public static int index(Pointer list, Pointer data) {
        return GList.g_list_index(Pointer.getPeer(list), Pointer.getPeer(data));
    }

    @Ptr
    protected static native long g_list_insert(
        @Ptr
        long list,
        @Ptr
        long data, int position);

    public static Pointer insert(Pointer list, Pointer data, int position) {
        return Pointer.pointerToAddress(GList.g_list_insert(Pointer.getPeer(list), Pointer.getPeer(data), position));
    }

    @Ptr
    protected static native long g_list_insert_before(
        @Ptr
        long list,
        @Ptr
        long sibling,
        @Ptr
        long data);

    public static Pointer insert_before(Pointer list, Pointer sibling, Pointer data) {
        return Pointer.pointerToAddress(GList.g_list_insert_before(Pointer.getPeer(list), Pointer.getPeer(sibling), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_list_insert_sorted(
        @Ptr
        long list,
        @Ptr
        long data,
        @Ptr
        long func);

    public static Pointer insert_sorted(Pointer list, Pointer data, Pointer func) {
        return Pointer.pointerToAddress(GList.g_list_insert_sorted(Pointer.getPeer(list), Pointer.getPeer(data), Pointer.getPeer(func)));
    }

    @Ptr
    protected static native long g_list_insert_sorted_with_data(
        @Ptr
        long list,
        @Ptr
        long data,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static Pointer insert_sorted_with_data(Pointer list, Pointer data, Pointer func, Pointer user_data) {
        return Pointer.pointerToAddress(GList.g_list_insert_sorted_with_data(Pointer.getPeer(list), Pointer.getPeer(data), Pointer.getPeer(func), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected static native long g_list_last(
        @Ptr
        long list);

    public static Pointer last(Pointer list) {
        return Pointer.pointerToAddress(GList.g_list_last(Pointer.getPeer(list)));
    }

    protected static native long g_list_length(
        @Ptr
        long list);

    public static long length(Pointer list) {
        return GList.g_list_length(Pointer.getPeer(list));
    }

    @Ptr
    protected static native long g_list_nth(
        @Ptr
        long list, long n);

    public static Pointer nth(Pointer list, long n) {
        return Pointer.pointerToAddress(GList.g_list_nth(Pointer.getPeer(list), n));
    }

    @Ptr
    protected static native long g_list_nth_data(
        @Ptr
        long list, long n);

    public static Pointer nth_data(Pointer list, long n) {
        return Pointer.pointerToAddress(GList.g_list_nth_data(Pointer.getPeer(list), n));
    }

    @Ptr
    protected static native long g_list_nth_prev(
        @Ptr
        long list, long n);

    public static Pointer nth_prev(Pointer list, long n) {
        return Pointer.pointerToAddress(GList.g_list_nth_prev(Pointer.getPeer(list), n));
    }

    protected static native int g_list_position(
        @Ptr
        long list,
        @Ptr
        long llink);

    public static int position(Pointer list, Pointer llink) {
        return GList.g_list_position(Pointer.getPeer(list), Pointer.getPeer(llink));
    }

    @Ptr
    protected static native long g_list_prepend(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer prepend(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GList.g_list_prepend(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_list_remove(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer remove(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GList.g_list_remove(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_list_remove_all(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer remove_all(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GList.g_list_remove_all(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_list_remove_link(
        @Ptr
        long list,
        @Ptr
        long llink);

    public static Pointer remove_link(Pointer list, Pointer llink) {
        return Pointer.pointerToAddress(GList.g_list_remove_link(Pointer.getPeer(list), Pointer.getPeer(llink)));
    }

    @Ptr
    protected static native long g_list_reverse(
        @Ptr
        long list);

    public static Pointer reverse(Pointer list) {
        return Pointer.pointerToAddress(GList.g_list_reverse(Pointer.getPeer(list)));
    }

    @Ptr
    protected static native long g_list_sort(
        @Ptr
        long list,
        @Ptr
        long compare_func);

    public static Pointer sort(Pointer list, Pointer compare_func) {
        return Pointer.pointerToAddress(GList.g_list_sort(Pointer.getPeer(list), Pointer.getPeer(compare_func)));
    }

    @Ptr
    protected static native long g_list_sort_with_data(
        @Ptr
        long list,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public static Pointer sort_with_data(Pointer list, Pointer compare_func, Pointer user_data) {
        return Pointer.pointerToAddress(GList.g_list_sort_with_data(Pointer.getPeer(list), Pointer.getPeer(compare_func), Pointer.getPeer(user_data)));
    }

}
