
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GRand
    extends StructObject
{


    public GRand() {
        super();
    }

    public GRand(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_rand_copy(
        @Ptr
        long rand_);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_rand_copy(Pointer.pointerTo(this, GRand.class)));
    }

    protected native double g_rand_double(
        @Ptr
        long rand_);

    public double _double() {
        return this.g_rand_double(Pointer.pointerTo(this, GRand.class));
    }

    protected native double g_rand_double_range(
        @Ptr
        long rand_, double begin, double end);

    public double double_range(double begin, double end) {
        return this.g_rand_double_range(Pointer.pointerTo(this, GRand.class), begin, end);
    }

    protected native void g_rand_free(
        @Ptr
        long rand_);

    public void free() {
        this.g_rand_free(Pointer.pointerTo(this, GRand.class));
    }

    protected native long g_rand_int(
        @Ptr
        long rand_);

    public long _int() {
        return this.g_rand_int(Pointer.pointerTo(this, GRand.class));
    }

    protected native int g_rand_int_range(
        @Ptr
        long rand_, int begin, int end);

    public int int_range(int begin, int end) {
        return this.g_rand_int_range(Pointer.pointerTo(this, GRand.class), begin, end);
    }

    protected native void g_rand_set_seed(
        @Ptr
        long rand_, long seed);

    public void set_seed(long seed) {
        this.g_rand_set_seed(Pointer.pointerTo(this, GRand.class), seed);
    }

    protected native void g_rand_set_seed_array(
        @Ptr
        long rand_,
        @Ptr
        long seed, long seed_length);

    public void set_seed_array(Pointer<Long> seed, long seed_length) {
        this.g_rand_set_seed_array(Pointer.pointerTo(this, GRand.class), Pointer.getPeer(seed), seed_length);
    }

    @Ptr
    protected native long g_rand_new();

    public Pointer _new() {
        return Pointer.pointerToAddress(this.g_rand_new());
    }

    @Ptr
    protected native long g_rand_new_with_seed(long seed);

    public Pointer new_with_seed(long seed) {
        return Pointer.pointerToAddress(this.g_rand_new_with_seed(seed));
    }

    @Ptr
    protected native long g_rand_new_with_seed_array(
        @Ptr
        long seed, long seed_length);

    public Pointer new_with_seed_array(Pointer<Long> seed, long seed_length) {
        return Pointer.pointerToAddress(this.g_rand_new_with_seed_array(Pointer.getPeer(seed), seed_length));
    }

}
