
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GSequence
    extends StructObject
{


    public GSequence() {
        super();
    }

    public GSequence(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_sequence_append(
        @Ptr
        long seq, Pointer data);

    public Pointer append(Pointer data) {
        return Pointer.pointerToAddress(this.g_sequence_append(Pointer.pointerTo(this, GSequence.class), data));
    }

    protected native void g_sequence_foreach(
        @Ptr
        long seq, Object func, Pointer user_data);

    public void foreach(Object func, Pointer user_data) {
        this.g_sequence_foreach(Pointer.pointerTo(this, GSequence.class), func, user_data);
    }

    protected native void g_sequence_free(
        @Ptr
        long seq);

    public void free() {
        this.g_sequence_free(Pointer.pointerTo(this, GSequence.class));
    }

    @Ptr
    protected native long g_sequence_get_begin_iter(
        @Ptr
        long seq);

    public Pointer get_begin_iter() {
        return Pointer.pointerToAddress(this.g_sequence_get_begin_iter(Pointer.pointerTo(this, GSequence.class)));
    }

    @Ptr
    protected native long g_sequence_get_end_iter(
        @Ptr
        long seq);

    public Pointer get_end_iter() {
        return Pointer.pointerToAddress(this.g_sequence_get_end_iter(Pointer.pointerTo(this, GSequence.class)));
    }

    @Ptr
    protected native long g_sequence_get_iter_at_pos(
        @Ptr
        long seq, int pos);

    public Pointer get_iter_at_pos(int pos) {
        return Pointer.pointerToAddress(this.g_sequence_get_iter_at_pos(Pointer.pointerTo(this, GSequence.class), pos));
    }

    protected native int g_sequence_get_length(
        @Ptr
        long seq);

    public int get_length() {
        return this.g_sequence_get_length(Pointer.pointerTo(this, GSequence.class));
    }

    @Ptr
    protected native long g_sequence_insert_sorted(
        @Ptr
        long seq, Pointer data, Object cmp_func, Pointer cmp_data);

    public Pointer insert_sorted(Pointer data, Object cmp_func, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_insert_sorted(Pointer.pointerTo(this, GSequence.class), data, cmp_func, cmp_data));
    }

    @Ptr
    protected native long g_sequence_lookup(
        @Ptr
        long seq, Pointer data, Object cmp_func, Pointer cmp_data);

    public Pointer lookup(Pointer data, Object cmp_func, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_lookup(Pointer.pointerTo(this, GSequence.class), data, cmp_func, cmp_data));
    }

    @Ptr
    protected native long g_sequence_prepend(
        @Ptr
        long seq, Pointer data);

    public Pointer prepend(Pointer data) {
        return Pointer.pointerToAddress(this.g_sequence_prepend(Pointer.pointerTo(this, GSequence.class), data));
    }

    @Ptr
    protected native long g_sequence_search(
        @Ptr
        long seq, Pointer data, Object cmp_func, Pointer cmp_data);

    public Pointer search(Pointer data, Object cmp_func, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_search(Pointer.pointerTo(this, GSequence.class), data, cmp_func, cmp_data));
    }

    protected native void g_sequence_sort(
        @Ptr
        long seq, Object cmp_func, Pointer cmp_data);

    public void sort(Object cmp_func, Pointer cmp_data) {
        this.g_sequence_sort(Pointer.pointerTo(this, GSequence.class), cmp_func, cmp_data);
    }

    protected native void g_sequence_foreach_range(
        @Ptr
        long begin,
        @Ptr
        long end, Object func, Pointer user_data);

    public void foreach_range(Pointer begin, Pointer end, Object func, Pointer user_data) {
        this.g_sequence_foreach_range(Pointer.getPeer(begin), Pointer.getPeer(end), func, user_data);
    }

    protected native Pointer g_sequence_get(
        @Ptr
        long iter);

    public Pointer get(Pointer iter) {
        return this.g_sequence_get(Pointer.getPeer(iter));
    }

    @Ptr
    protected native long g_sequence_insert_before(
        @Ptr
        long iter, Pointer data);

    public Pointer insert_before(Pointer iter, Pointer data) {
        return Pointer.pointerToAddress(this.g_sequence_insert_before(Pointer.getPeer(iter), data));
    }

    protected native void g_sequence_move(
        @Ptr
        long src,
        @Ptr
        long dest);

    public void move(Pointer src, Pointer dest) {
        this.g_sequence_move(Pointer.getPeer(src), Pointer.getPeer(dest));
    }

    protected native void g_sequence_move_range(
        @Ptr
        long dest,
        @Ptr
        long begin,
        @Ptr
        long end);

    public void move_range(Pointer dest, Pointer begin, Pointer end) {
        this.g_sequence_move_range(Pointer.getPeer(dest), Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    @Ptr
    protected native long g_sequence_new(Object data_destroy);

    public Pointer _new(Object data_destroy) {
        return Pointer.pointerToAddress(this.g_sequence_new(data_destroy));
    }

    @Ptr
    protected native long g_sequence_range_get_midpoint(
        @Ptr
        long begin,
        @Ptr
        long end);

    public Pointer range_get_midpoint(Pointer begin, Pointer end) {
        return Pointer.pointerToAddress(this.g_sequence_range_get_midpoint(Pointer.getPeer(begin), Pointer.getPeer(end)));
    }

    protected native void g_sequence_remove(
        @Ptr
        long iter);

    public void remove(Pointer iter) {
        this.g_sequence_remove(Pointer.getPeer(iter));
    }

    protected native void g_sequence_remove_range(
        @Ptr
        long begin,
        @Ptr
        long end);

    public void remove_range(Pointer begin, Pointer end) {
        this.g_sequence_remove_range(Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    protected native void g_sequence_set(
        @Ptr
        long iter, Pointer data);

    public void set(Pointer iter, Pointer data) {
        this.g_sequence_set(Pointer.getPeer(iter), data);
    }

    protected native void g_sequence_sort_changed(
        @Ptr
        long iter, Object cmp_func, Pointer cmp_data);

    public void sort_changed(Pointer iter, Object cmp_func, Pointer cmp_data) {
        this.g_sequence_sort_changed(Pointer.getPeer(iter), cmp_func, cmp_data);
    }

    protected native void g_sequence_swap(
        @Ptr
        long a,
        @Ptr
        long b);

    public void swap(Pointer a, Pointer b) {
        this.g_sequence_swap(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected native void g_sequence_sort_changed_iter(
        @Ptr
        long iter, Object iter_cmp, Pointer cmp_data);

    public void sort_changed_iter(Pointer<GSequenceIter> iter, Object iter_cmp, Pointer cmp_data) {
        this.g_sequence_sort_changed_iter(Pointer.getPeer(iter), iter_cmp, cmp_data);
    }

    @Ptr
    protected native long g_sequence_insert_sorted_iter(
        @Ptr
        long seq, Pointer data, Object iter_cmp, Pointer cmp_data);

    public Pointer<GSequenceIter> insert_sorted_iter(Pointer data, Object iter_cmp, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_insert_sorted_iter(Pointer.pointerTo(this, GSequence.class), data, iter_cmp, cmp_data), Pointer.class);
    }

    @Ptr
    protected native long g_sequence_search_iter(
        @Ptr
        long seq, Pointer data, Object iter_cmp, Pointer cmp_data);

    public Pointer<GSequenceIter> search_iter(Pointer data, Object iter_cmp, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_search_iter(Pointer.pointerTo(this, GSequence.class), data, iter_cmp, cmp_data), Pointer.class);
    }

    @Ptr
    protected native long g_sequence_lookup_iter(
        @Ptr
        long seq, Pointer data, Object iter_cmp, Pointer cmp_data);

    public Pointer<GSequenceIter> lookup_iter(Pointer data, Object iter_cmp, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_lookup_iter(Pointer.pointerTo(this, GSequence.class), data, iter_cmp, cmp_data), Pointer.class);
    }

    protected native void g_sequence_sort_iter(
        @Ptr
        long seq, Object cmp_func, Pointer cmp_data);

    public void sort_iter(Object cmp_func, Pointer cmp_data) {
        this.g_sequence_sort_iter(Pointer.pointerTo(this, GSequence.class), cmp_func, cmp_data);
    }

}
