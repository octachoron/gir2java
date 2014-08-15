
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GSList
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSList() {
        super();
    }

    public GSList(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GSList field_data(Pointer field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public Pointer field_next() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSList field_next(Pointer field_next) {
        this.io.setPointerField(this, 1, field_next);
        return this;
    }

    @Ptr
    protected static native long g_slist_alloc();

    public static Pointer alloc() {
        return Pointer.pointerToAddress(GSList.g_slist_alloc());
    }

    @Ptr
    protected static native long g_slist_append(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer append(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GSList.g_slist_append(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_slist_concat(
        @Ptr
        long list1,
        @Ptr
        long list2);

    public static Pointer concat(Pointer list1, Pointer list2) {
        return Pointer.pointerToAddress(GSList.g_slist_concat(Pointer.getPeer(list1), Pointer.getPeer(list2)));
    }

    @Ptr
    protected static native long g_slist_copy(
        @Ptr
        long list);

    public static Pointer copy(Pointer list) {
        return Pointer.pointerToAddress(GSList.g_slist_copy(Pointer.getPeer(list)));
    }

    @Ptr
    protected static native long g_slist_copy_deep(
        @Ptr
        long list,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static Pointer copy_deep(Pointer list, Pointer func, Pointer user_data) {
        return Pointer.pointerToAddress(GSList.g_slist_copy_deep(Pointer.getPeer(list), Pointer.getPeer(func), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected static native long g_slist_delete_link(
        @Ptr
        long list,
        @Ptr
        long link_);

    public static Pointer delete_link(Pointer list, Pointer link_) {
        return Pointer.pointerToAddress(GSList.g_slist_delete_link(Pointer.getPeer(list), Pointer.getPeer(link_)));
    }

    @Ptr
    protected static native long g_slist_find(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer find(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GSList.g_slist_find(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_slist_find_custom(
        @Ptr
        long list,
        @Ptr
        long data,
        @Ptr
        long func);

    public static Pointer find_custom(Pointer list, Pointer data, Pointer func) {
        return Pointer.pointerToAddress(GSList.g_slist_find_custom(Pointer.getPeer(list), Pointer.getPeer(data), Pointer.getPeer(func)));
    }

    protected static native void g_slist_foreach(
        @Ptr
        long list,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static void foreach(Pointer list, Pointer func, Pointer user_data) {
        GSList.g_slist_foreach(Pointer.getPeer(list), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected static native void g_slist_free(
        @Ptr
        long list);

    public static void free(Pointer list) {
        GSList.g_slist_free(Pointer.getPeer(list));
    }

    protected static native void g_slist_free_1(
        @Ptr
        long list);

    public static void free_1(Pointer list) {
        GSList.g_slist_free_1(Pointer.getPeer(list));
    }

    protected static native void g_slist_free_full(
        @Ptr
        long list,
        @Ptr
        long free_func);

    public static void free_full(Pointer list, Pointer free_func) {
        GSList.g_slist_free_full(Pointer.getPeer(list), Pointer.getPeer(free_func));
    }

    protected static native int g_slist_index(
        @Ptr
        long list,
        @Ptr
        long data);

    public static int index(Pointer list, Pointer data) {
        return GSList.g_slist_index(Pointer.getPeer(list), Pointer.getPeer(data));
    }

    @Ptr
    protected static native long g_slist_insert(
        @Ptr
        long list,
        @Ptr
        long data, int position);

    public static Pointer insert(Pointer list, Pointer data, int position) {
        return Pointer.pointerToAddress(GSList.g_slist_insert(Pointer.getPeer(list), Pointer.getPeer(data), position));
    }

    @Ptr
    protected static native long g_slist_insert_before(
        @Ptr
        long slist,
        @Ptr
        long sibling,
        @Ptr
        long data);

    public static Pointer insert_before(Pointer slist, Pointer sibling, Pointer data) {
        return Pointer.pointerToAddress(GSList.g_slist_insert_before(Pointer.getPeer(slist), Pointer.getPeer(sibling), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_slist_insert_sorted(
        @Ptr
        long list,
        @Ptr
        long data,
        @Ptr
        long func);

    public static Pointer insert_sorted(Pointer list, Pointer data, Pointer func) {
        return Pointer.pointerToAddress(GSList.g_slist_insert_sorted(Pointer.getPeer(list), Pointer.getPeer(data), Pointer.getPeer(func)));
    }

    @Ptr
    protected static native long g_slist_insert_sorted_with_data(
        @Ptr
        long list,
        @Ptr
        long data,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static Pointer insert_sorted_with_data(Pointer list, Pointer data, Pointer func, Pointer user_data) {
        return Pointer.pointerToAddress(GSList.g_slist_insert_sorted_with_data(Pointer.getPeer(list), Pointer.getPeer(data), Pointer.getPeer(func), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected static native long g_slist_last(
        @Ptr
        long list);

    public static Pointer last(Pointer list) {
        return Pointer.pointerToAddress(GSList.g_slist_last(Pointer.getPeer(list)));
    }

    protected static native long g_slist_length(
        @Ptr
        long list);

    public static long length(Pointer list) {
        return GSList.g_slist_length(Pointer.getPeer(list));
    }

    @Ptr
    protected static native long g_slist_nth(
        @Ptr
        long list, long n);

    public static Pointer nth(Pointer list, long n) {
        return Pointer.pointerToAddress(GSList.g_slist_nth(Pointer.getPeer(list), n));
    }

    @Ptr
    protected static native long g_slist_nth_data(
        @Ptr
        long list, long n);

    public static Pointer nth_data(Pointer list, long n) {
        return Pointer.pointerToAddress(GSList.g_slist_nth_data(Pointer.getPeer(list), n));
    }

    protected static native int g_slist_position(
        @Ptr
        long list,
        @Ptr
        long llink);

    public static int position(Pointer list, Pointer llink) {
        return GSList.g_slist_position(Pointer.getPeer(list), Pointer.getPeer(llink));
    }

    @Ptr
    protected static native long g_slist_prepend(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer prepend(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GSList.g_slist_prepend(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_slist_remove(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer remove(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GSList.g_slist_remove(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_slist_remove_all(
        @Ptr
        long list,
        @Ptr
        long data);

    public static Pointer remove_all(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(GSList.g_slist_remove_all(Pointer.getPeer(list), Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_slist_remove_link(
        @Ptr
        long list,
        @Ptr
        long link_);

    public static Pointer remove_link(Pointer list, Pointer link_) {
        return Pointer.pointerToAddress(GSList.g_slist_remove_link(Pointer.getPeer(list), Pointer.getPeer(link_)));
    }

    @Ptr
    protected static native long g_slist_reverse(
        @Ptr
        long list);

    public static Pointer reverse(Pointer list) {
        return Pointer.pointerToAddress(GSList.g_slist_reverse(Pointer.getPeer(list)));
    }

    @Ptr
    protected static native long g_slist_sort(
        @Ptr
        long list,
        @Ptr
        long compare_func);

    public static Pointer sort(Pointer list, Pointer compare_func) {
        return Pointer.pointerToAddress(GSList.g_slist_sort(Pointer.getPeer(list), Pointer.getPeer(compare_func)));
    }

    @Ptr
    protected static native long g_slist_sort_with_data(
        @Ptr
        long list,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public static Pointer sort_with_data(Pointer list, Pointer compare_func, Pointer user_data) {
        return Pointer.pointerToAddress(GSList.g_slist_sort_with_data(Pointer.getPeer(list), Pointer.getPeer(compare_func), Pointer.getPeer(user_data)));
    }

}
