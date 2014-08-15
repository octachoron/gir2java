
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GVariantIter
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GVariantIter() {
        super();
    }

    public GVariantIter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_x() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GVariantIter field_x(long field_x) {
        this.io.setLongField(this, 0, field_x);
        return this;
    }

    @Ptr
    protected native long g_variant_iter_copy(
        @Ptr
        long iter);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_variant_iter_copy(Pointer.pointerTo(this, GVariantIter.class).getPeer()));
    }

    protected native void g_variant_iter_free(
        @Ptr
        long iter);

    public void free() {
        this.g_variant_iter_free(Pointer.pointerTo(this, GVariantIter.class).getPeer());
    }

    protected native long g_variant_iter_init(
        @Ptr
        long iter,
        @Ptr
        long value);

    public long init(Pointer<GVariant> value) {
        return this.g_variant_iter_init(Pointer.pointerTo(this, GVariantIter.class).getPeer(), Pointer.getPeer(value));
    }

    protected native boolean g_variant_iter_loop(
        @Ptr
        long iter,
        @Ptr
        long format_string, Object... varargs);

    public boolean loop(Pointer format_string, Object... varargs) {
        return this.g_variant_iter_loop(Pointer.pointerTo(this, GVariantIter.class).getPeer(), Pointer.getPeer(format_string), varargs);
    }

    protected native long g_variant_iter_n_children(
        @Ptr
        long iter);

    public long n_children() {
        return this.g_variant_iter_n_children(Pointer.pointerTo(this, GVariantIter.class).getPeer());
    }

    protected native boolean g_variant_iter_next(
        @Ptr
        long iter,
        @Ptr
        long format_string, Object... varargs);

    public boolean next(Pointer format_string, Object... varargs) {
        return this.g_variant_iter_next(Pointer.pointerTo(this, GVariantIter.class).getPeer(), Pointer.getPeer(format_string), varargs);
    }

    @Ptr
    protected native long g_variant_iter_next_value(
        @Ptr
        long iter);

    public Pointer<GVariant> next_value() {
        return Pointer.pointerToAddress(this.g_variant_iter_next_value(Pointer.pointerTo(this, GVariantIter.class).getPeer()), GVariant.class);
    }

}
