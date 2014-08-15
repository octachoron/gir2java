
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GSequenceIter
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSequenceIter() {
        super();
    }

    public GSequenceIter(Pointer pointer) {
        super(pointer);
    }

    protected native int g_sequence_iter_compare(
        @Ptr
        long a,
        @Ptr
        long b);

    public int compare(Pointer b) {
        return this.g_sequence_iter_compare(Pointer.pointerTo(this, GSequenceIter.class).getPeer(), Pointer.getPeer(b));
    }

    protected native int g_sequence_iter_get_position(
        @Ptr
        long iter);

    public int get_position() {
        return this.g_sequence_iter_get_position(Pointer.pointerTo(this, GSequenceIter.class).getPeer());
    }

    @Ptr
    protected native long g_sequence_iter_get_sequence(
        @Ptr
        long iter);

    public Pointer<GSequence> get_sequence() {
        return Pointer.pointerToAddress(this.g_sequence_iter_get_sequence(Pointer.pointerTo(this, GSequenceIter.class).getPeer()), GSequence.class);
    }

    protected native boolean g_sequence_iter_is_begin(
        @Ptr
        long iter);

    public boolean is_begin() {
        return this.g_sequence_iter_is_begin(Pointer.pointerTo(this, GSequenceIter.class).getPeer());
    }

    protected native boolean g_sequence_iter_is_end(
        @Ptr
        long iter);

    public boolean is_end() {
        return this.g_sequence_iter_is_end(Pointer.pointerTo(this, GSequenceIter.class).getPeer());
    }

    @Ptr
    protected native long g_sequence_iter_move(
        @Ptr
        long iter, int delta);

    public Pointer move(int delta) {
        return Pointer.pointerToAddress(this.g_sequence_iter_move(Pointer.pointerTo(this, GSequenceIter.class).getPeer(), delta));
    }

    @Ptr
    protected native long g_sequence_iter_next(
        @Ptr
        long iter);

    public Pointer next() {
        return Pointer.pointerToAddress(this.g_sequence_iter_next(Pointer.pointerTo(this, GSequenceIter.class).getPeer()));
    }

    @Ptr
    protected native long g_sequence_iter_prev(
        @Ptr
        long iter);

    public Pointer prev() {
        return Pointer.pointerToAddress(this.g_sequence_iter_prev(Pointer.pointerTo(this, GSequenceIter.class).getPeer()));
    }

}
