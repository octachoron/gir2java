
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GVariantDict
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GVariantDict() {
        super();
    }

    public GVariantDict(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private long field_x() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GVariantDict field_x(long field_x) {
        this.io.setLongField(this, 0, field_x);
        return this;
    }

    @Ptr
    protected static native long g_variant_dict_new(
        @Ptr
        long from_asv);

    public static Pointer _new(Pointer<GVariant> from_asv) {
        return Pointer.pointerToAddress(GVariantDict.g_variant_dict_new(Pointer.getPeer(from_asv)));
    }

    protected native void g_variant_dict_clear(
        @Ptr
        long dict);

    public void clear() {
        this.g_variant_dict_clear(Pointer.pointerTo(this, GVariantDict.class).getPeer());
    }

    protected native boolean g_variant_dict_contains(
        @Ptr
        long dict,
        @Ptr
        long key);

    public boolean contains(Pointer key) {
        return this.g_variant_dict_contains(Pointer.pointerTo(this, GVariantDict.class).getPeer(), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_variant_dict_end(
        @Ptr
        long dict);

    public Pointer<GVariant> end() {
        return Pointer.pointerToAddress(this.g_variant_dict_end(Pointer.pointerTo(this, GVariantDict.class).getPeer()), GVariant.class);
    }

    protected native void g_variant_dict_init(
        @Ptr
        long dict,
        @Ptr
        long from_asv);

    public void init(Pointer<GVariant> from_asv) {
        this.g_variant_dict_init(Pointer.pointerTo(this, GVariantDict.class).getPeer(), Pointer.getPeer(from_asv));
    }

    protected native void g_variant_dict_insert(
        @Ptr
        long dict,
        @Ptr
        long key,
        @Ptr
        long format_string, Object... varargs);

    public void insert(Pointer key, Pointer format_string, Object... varargs) {
        this.g_variant_dict_insert(Pointer.pointerTo(this, GVariantDict.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(format_string), varargs);
    }

    protected native void g_variant_dict_insert_value(
        @Ptr
        long dict,
        @Ptr
        long key,
        @Ptr
        long value);

    public void insert_value(Pointer key, Pointer<GVariant> value) {
        this.g_variant_dict_insert_value(Pointer.pointerTo(this, GVariantDict.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected native boolean g_variant_dict_lookup(
        @Ptr
        long dict,
        @Ptr
        long key,
        @Ptr
        long format_string, Object... varargs);

    public boolean lookup(Pointer key, Pointer format_string, Object... varargs) {
        return this.g_variant_dict_lookup(Pointer.pointerTo(this, GVariantDict.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(format_string), varargs);
    }

    @Ptr
    protected native long g_variant_dict_lookup_value(
        @Ptr
        long dict,
        @Ptr
        long key,
        @Ptr
        long expected_type);

    public Pointer<GVariant> lookup_value(Pointer key, Pointer expected_type) {
        return Pointer.pointerToAddress(this.g_variant_dict_lookup_value(Pointer.pointerTo(this, GVariantDict.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(expected_type)), GVariant.class);
    }

    @Ptr
    protected native long g_variant_dict_ref(
        @Ptr
        long dict);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_variant_dict_ref(Pointer.pointerTo(this, GVariantDict.class).getPeer()));
    }

    protected native boolean g_variant_dict_remove(
        @Ptr
        long dict,
        @Ptr
        long key);

    public boolean remove(Pointer key) {
        return this.g_variant_dict_remove(Pointer.pointerTo(this, GVariantDict.class).getPeer(), Pointer.getPeer(key));
    }

    protected native void g_variant_dict_unref(
        @Ptr
        long dict);

    public void unref() {
        this.g_variant_dict_unref(Pointer.pointerTo(this, GVariantDict.class).getPeer());
    }

}
