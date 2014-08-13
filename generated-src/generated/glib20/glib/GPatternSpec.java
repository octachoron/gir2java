
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GPatternSpec
    extends StructObject
{


    public GPatternSpec() {
        super();
    }

    public GPatternSpec(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_pattern_spec_equal(
        @Ptr
        long pspec1,
        @Ptr
        long pspec2);

    public boolean equal(Pointer pspec2) {
        return this.g_pattern_spec_equal(Pointer.pointerTo(this, GPatternSpec.class), Pointer.getPeer(pspec2));
    }

    protected native void g_pattern_spec_free(
        @Ptr
        long pspec);

    public void free() {
        this.g_pattern_spec_free(Pointer.pointerTo(this, GPatternSpec.class));
    }

    @Ptr
    protected native long g_pattern_spec_new(
        @Ptr
        long pattern);

    public Pointer _new(Pointer pattern) {
        return Pointer.pointerToAddress(this.g_pattern_spec_new(Pointer.getPeer(pattern)));
    }

}
