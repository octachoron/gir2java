
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GList
    extends StructObject
{


    public GList() {
        super();
    }

    public GList(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GList field_data(Pointer field_data) {
        this.io.setNativeObjectField(this, 0, field_data);
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
    protected native long g_list_alloc();

    public Pointer alloc() {
        return Pointer.pointerToAddress(this.g_list_alloc());
    }

    @Ptr
    protected native long g_list_append(
        @Ptr
        long list, Pointer data);

    public Pointer append(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(this.g_list_append(Pointer.getPeer(list), data));
    }

    @Ptr
    protected native long g_list_concat(
        @Ptr
        long list1,
        @Ptr
        long list2);

    public Pointer concat(Pointer list1, Pointer list2) {
        return Pointer.pointerToAddress(this.g_list_concat(Pointer.getPeer(list1), Pointer.getPeer(list2)));
    }

    @Ptr
    protected native long g_list_copy(
        @Ptr
        long list);

    public Pointer copy(Pointer list) {
        return Pointer.pointerToAddress(this.g_list_copy(Pointer.getPeer(list)));
    }

    @Ptr
    protected native long g_list_copy_deep(
        @Ptr
        long list, Object func, Pointer user_data);

    public Pointer copy_deep(Pointer list, Object func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_list_copy_deep(Pointer.getPeer(list), func, user_data));
    }

    @Ptr
    protected native long g_list_delete_link(
        @Ptr
        long list,
        @Ptr
        long link_);

    public Pointer delete_link(Pointer list, Pointer link_) {
        return Pointer.pointerToAddress(this.g_list_delete_link(Pointer.getPeer(list), Pointer.getPeer(link_)));
    }

    @Ptr
    protected native long g_list_find(
        @Ptr
        long list, Pointer data);

    public Pointer find(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(this.g_list_find(Pointer.getPeer(list), data));
    }

    @Ptr
    protected native long g_list_find_custom(
        @Ptr
        long list, Pointer data, Object func);

    public Pointer find_custom(Pointer list, Pointer data, Object func) {
        return Pointer.pointerToAddress(this.g_list_find_custom(Pointer.getPeer(list), data, func));
    }

    @Ptr
    protected native long g_list_first(
        @Ptr
        long list);

    public Pointer first(Pointer list) {
        return Pointer.pointerToAddress(this.g_list_first(Pointer.getPeer(list)));
    }

    protected native void g_list_foreach(
        @Ptr
        long list, Object func, Pointer user_data);

    public void foreach(Pointer list, Object func, Pointer user_data) {
        this.g_list_foreach(Pointer.getPeer(list), func, user_data);
    }

    protected native void g_list_free(
        @Ptr
        long list);

    public void free(Pointer list) {
        this.g_list_free(Pointer.getPeer(list));
    }

    protected native void g_list_free_1(
        @Ptr
        long list);

    public void free_1(Pointer list) {
        this.g_list_free_1(Pointer.getPeer(list));
    }

    protected native void g_list_free_full(
        @Ptr
        long list, Object free_func);

    public void free_full(Pointer list, Object free_func) {
        this.g_list_free_full(Pointer.getPeer(list), free_func);
    }

    protected native int g_list_index(
        @Ptr
        long list, Pointer data);

    public int index(Pointer list, Pointer data) {
        return this.g_list_index(Pointer.getPeer(list), data);
    }

    @Ptr
    protected native long g_list_insert(
        @Ptr
        long list, Pointer data, int position);

    public Pointer insert(Pointer list, Pointer data, int position) {
        return Pointer.pointerToAddress(this.g_list_insert(Pointer.getPeer(list), data, position));
    }

    @Ptr
    protected native long g_list_insert_before(
        @Ptr
        long list,
        @Ptr
        long sibling, Pointer data);

    public Pointer insert_before(Pointer list, Pointer sibling, Pointer data) {
        return Pointer.pointerToAddress(this.g_list_insert_before(Pointer.getPeer(list), Pointer.getPeer(sibling), data));
    }

    @Ptr
    protected native long g_list_insert_sorted(
        @Ptr
        long list, Pointer data, Object func);

    public Pointer insert_sorted(Pointer list, Pointer data, Object func) {
        return Pointer.pointerToAddress(this.g_list_insert_sorted(Pointer.getPeer(list), data, func));
    }

    @Ptr
    protected native long g_list_insert_sorted_with_data(
        @Ptr
        long list, Pointer data, Object func, Pointer user_data);

    public Pointer insert_sorted_with_data(Pointer list, Pointer data, Object func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_list_insert_sorted_with_data(Pointer.getPeer(list), data, func, user_data));
    }

    @Ptr
    protected native long g_list_last(
        @Ptr
        long list);

    public Pointer last(Pointer list) {
        return Pointer.pointerToAddress(this.g_list_last(Pointer.getPeer(list)));
    }

    protected native long g_list_length(
        @Ptr
        long list);

    public long length(Pointer list) {
        return this.g_list_length(Pointer.getPeer(list));
    }

    @Ptr
    protected native long g_list_nth(
        @Ptr
        long list, long n);

    public Pointer nth(Pointer list, long n) {
        return Pointer.pointerToAddress(this.g_list_nth(Pointer.getPeer(list), n));
    }

    protected native Pointer g_list_nth_data(
        @Ptr
        long list, long n);

    public Pointer nth_data(Pointer list, long n) {
        return this.g_list_nth_data(Pointer.getPeer(list), n);
    }

    @Ptr
    protected native long g_list_nth_prev(
        @Ptr
        long list, long n);

    public Pointer nth_prev(Pointer list, long n) {
        return Pointer.pointerToAddress(this.g_list_nth_prev(Pointer.getPeer(list), n));
    }

    protected native int g_list_position(
        @Ptr
        long list,
        @Ptr
        long llink);

    public int position(Pointer list, Pointer llink) {
        return this.g_list_position(Pointer.getPeer(list), Pointer.getPeer(llink));
    }

    @Ptr
    protected native long g_list_prepend(
        @Ptr
        long list, Pointer data);

    public Pointer prepend(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(this.g_list_prepend(Pointer.getPeer(list), data));
    }

    @Ptr
    protected native long g_list_remove(
        @Ptr
        long list, Pointer data);

    public Pointer remove(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(this.g_list_remove(Pointer.getPeer(list), data));
    }

    @Ptr
    protected native long g_list_remove_all(
        @Ptr
        long list, Pointer data);

    public Pointer remove_all(Pointer list, Pointer data) {
        return Pointer.pointerToAddress(this.g_list_remove_all(Pointer.getPeer(list), data));
    }

    @Ptr
    protected native long g_list_remove_link(
        @Ptr
        long list,
        @Ptr
        long llink);

    public Pointer remove_link(Pointer list, Pointer llink) {
        return Pointer.pointerToAddress(this.g_list_remove_link(Pointer.getPeer(list), Pointer.getPeer(llink)));
    }

    @Ptr
    protected native long g_list_reverse(
        @Ptr
        long list);

    public Pointer reverse(Pointer list) {
        return Pointer.pointerToAddress(this.g_list_reverse(Pointer.getPeer(list)));
    }

    @Ptr
    protected native long g_list_sort(
        @Ptr
        long list, Object compare_func);

    public Pointer sort(Pointer list, Object compare_func) {
        return Pointer.pointerToAddress(this.g_list_sort(Pointer.getPeer(list), compare_func));
    }

    @Ptr
    protected native long g_list_sort_with_data(
        @Ptr
        long list, Object compare_func, Pointer user_data);

    public Pointer sort_with_data(Pointer list, Object compare_func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_list_sort_with_data(Pointer.getPeer(list), compare_func, user_data));
    }

}
