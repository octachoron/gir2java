
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GSequence
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSequence() {
        super();
    }

    public GSequence(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_sequence_append(
        @Ptr
        long seq,
        @Ptr
        long data);

    public Pointer append(Pointer data) {
        return Pointer.pointerToAddress(this.g_sequence_append(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data)));
    }

    protected native void g_sequence_foreach(
        @Ptr
        long seq,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void foreach(Pointer func, Pointer user_data) {
        this.g_sequence_foreach(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void g_sequence_free(
        @Ptr
        long seq);

    public void free() {
        this.g_sequence_free(Pointer.pointerTo(this, GSequence.class).getPeer());
    }

    @Ptr
    protected native long g_sequence_get_begin_iter(
        @Ptr
        long seq);

    public Pointer get_begin_iter() {
        return Pointer.pointerToAddress(this.g_sequence_get_begin_iter(Pointer.pointerTo(this, GSequence.class).getPeer()));
    }

    @Ptr
    protected native long g_sequence_get_end_iter(
        @Ptr
        long seq);

    public Pointer get_end_iter() {
        return Pointer.pointerToAddress(this.g_sequence_get_end_iter(Pointer.pointerTo(this, GSequence.class).getPeer()));
    }

    @Ptr
    protected native long g_sequence_get_iter_at_pos(
        @Ptr
        long seq, int pos);

    public Pointer get_iter_at_pos(int pos) {
        return Pointer.pointerToAddress(this.g_sequence_get_iter_at_pos(Pointer.pointerTo(this, GSequence.class).getPeer(), pos));
    }

    protected native int g_sequence_get_length(
        @Ptr
        long seq);

    public int get_length() {
        return this.g_sequence_get_length(Pointer.pointerTo(this, GSequence.class).getPeer());
    }

    @Ptr
    protected native long g_sequence_insert_sorted(
        @Ptr
        long seq,
        @Ptr
        long data,
        @Ptr
        long cmp_func,
        @Ptr
        long cmp_data);

    public Pointer insert_sorted(Pointer data, Pointer cmp_func, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_insert_sorted(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(cmp_func), Pointer.getPeer(cmp_data)));
    }

    @Ptr
    protected native long g_sequence_lookup(
        @Ptr
        long seq,
        @Ptr
        long data,
        @Ptr
        long cmp_func,
        @Ptr
        long cmp_data);

    public Pointer lookup(Pointer data, Pointer cmp_func, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_lookup(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(cmp_func), Pointer.getPeer(cmp_data)));
    }

    @Ptr
    protected native long g_sequence_prepend(
        @Ptr
        long seq,
        @Ptr
        long data);

    public Pointer prepend(Pointer data) {
        return Pointer.pointerToAddress(this.g_sequence_prepend(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data)));
    }

    @Ptr
    protected native long g_sequence_search(
        @Ptr
        long seq,
        @Ptr
        long data,
        @Ptr
        long cmp_func,
        @Ptr
        long cmp_data);

    public Pointer search(Pointer data, Pointer cmp_func, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_search(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(cmp_func), Pointer.getPeer(cmp_data)));
    }

    protected native void g_sequence_sort(
        @Ptr
        long seq,
        @Ptr
        long cmp_func,
        @Ptr
        long cmp_data);

    public void sort(Pointer cmp_func, Pointer cmp_data) {
        this.g_sequence_sort(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(cmp_func), Pointer.getPeer(cmp_data));
    }

    protected static native void g_sequence_foreach_range(
        @Ptr
        long begin,
        @Ptr
        long end,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static void foreach_range(Pointer begin, Pointer end, Pointer func, Pointer user_data) {
        GSequence.g_sequence_foreach_range(Pointer.getPeer(begin), Pointer.getPeer(end), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_sequence_get(
        @Ptr
        long iter);

    public static Pointer get(Pointer iter) {
        return Pointer.pointerToAddress(GSequence.g_sequence_get(Pointer.getPeer(iter)));
    }

    @Ptr
    protected static native long g_sequence_insert_before(
        @Ptr
        long iter,
        @Ptr
        long data);

    public static Pointer insert_before(Pointer iter, Pointer data) {
        return Pointer.pointerToAddress(GSequence.g_sequence_insert_before(Pointer.getPeer(iter), Pointer.getPeer(data)));
    }

    protected static native void g_sequence_move(
        @Ptr
        long src,
        @Ptr
        long dest);

    public static void move(Pointer src, Pointer dest) {
        GSequence.g_sequence_move(Pointer.getPeer(src), Pointer.getPeer(dest));
    }

    protected static native void g_sequence_move_range(
        @Ptr
        long dest,
        @Ptr
        long begin,
        @Ptr
        long end);

    public static void move_range(Pointer dest, Pointer begin, Pointer end) {
        GSequence.g_sequence_move_range(Pointer.getPeer(dest), Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    @Ptr
    protected static native long g_sequence_new(
        @Ptr
        long data_destroy);

    public static Pointer _new(Pointer data_destroy) {
        return Pointer.pointerToAddress(GSequence.g_sequence_new(Pointer.getPeer(data_destroy)));
    }

    @Ptr
    protected static native long g_sequence_range_get_midpoint(
        @Ptr
        long begin,
        @Ptr
        long end);

    public static Pointer range_get_midpoint(Pointer begin, Pointer end) {
        return Pointer.pointerToAddress(GSequence.g_sequence_range_get_midpoint(Pointer.getPeer(begin), Pointer.getPeer(end)));
    }

    protected static native void g_sequence_remove(
        @Ptr
        long iter);

    public static void remove(Pointer iter) {
        GSequence.g_sequence_remove(Pointer.getPeer(iter));
    }

    protected static native void g_sequence_remove_range(
        @Ptr
        long begin,
        @Ptr
        long end);

    public static void remove_range(Pointer begin, Pointer end) {
        GSequence.g_sequence_remove_range(Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    protected static native void g_sequence_set(
        @Ptr
        long iter,
        @Ptr
        long data);

    public static void set(Pointer iter, Pointer data) {
        GSequence.g_sequence_set(Pointer.getPeer(iter), Pointer.getPeer(data));
    }

    protected static native void g_sequence_sort_changed(
        @Ptr
        long iter,
        @Ptr
        long cmp_func,
        @Ptr
        long cmp_data);

    public static void sort_changed(Pointer iter, Pointer cmp_func, Pointer cmp_data) {
        GSequence.g_sequence_sort_changed(Pointer.getPeer(iter), Pointer.getPeer(cmp_func), Pointer.getPeer(cmp_data));
    }

    protected static native void g_sequence_swap(
        @Ptr
        long a,
        @Ptr
        long b);

    public static void swap(Pointer a, Pointer b) {
        GSequence.g_sequence_swap(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected static native void g_sequence_sort_changed_iter(
        @Ptr
        long iter,
        @Ptr
        long iter_cmp,
        @Ptr
        long cmp_data);

    public static void sort_changed_iter(Pointer<GSequenceIter> iter, Pointer iter_cmp, Pointer cmp_data) {
        GSequence.g_sequence_sort_changed_iter(Pointer.getPeer(iter), Pointer.getPeer(iter_cmp), Pointer.getPeer(cmp_data));
    }

    @Ptr
    protected native long g_sequence_search_iter(
        @Ptr
        long seq,
        @Ptr
        long data,
        @Ptr
        long iter_cmp,
        @Ptr
        long cmp_data);

    public Pointer<GSequenceIter> search_iter(Pointer data, Pointer iter_cmp, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_search_iter(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(iter_cmp), Pointer.getPeer(cmp_data)), GSequenceIter.class);
    }

    protected native void g_sequence_sort_iter(
        @Ptr
        long seq,
        @Ptr
        long cmp_func,
        @Ptr
        long cmp_data);

    public void sort_iter(Pointer cmp_func, Pointer cmp_data) {
        this.g_sequence_sort_iter(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(cmp_func), Pointer.getPeer(cmp_data));
    }

    @Ptr
    protected native long g_sequence_lookup_iter(
        @Ptr
        long seq,
        @Ptr
        long data,
        @Ptr
        long iter_cmp,
        @Ptr
        long cmp_data);

    public Pointer<GSequenceIter> lookup_iter(Pointer data, Pointer iter_cmp, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_lookup_iter(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(iter_cmp), Pointer.getPeer(cmp_data)), GSequenceIter.class);
    }

    @Ptr
    protected native long g_sequence_insert_sorted_iter(
        @Ptr
        long seq,
        @Ptr
        long data,
        @Ptr
        long iter_cmp,
        @Ptr
        long cmp_data);

    public Pointer<GSequenceIter> insert_sorted_iter(Pointer data, Pointer iter_cmp, Pointer cmp_data) {
        return Pointer.pointerToAddress(this.g_sequence_insert_sorted_iter(Pointer.pointerTo(this, GSequence.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(iter_cmp), Pointer.getPeer(cmp_data)), GSequenceIter.class);
    }

}
