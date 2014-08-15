
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GVariantBuilder
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GVariantBuilder() {
        super();
    }

    public GVariantBuilder(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_x() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GVariantBuilder field_x(long field_x) {
        this.io.setLongField(this, 0, field_x);
        return this;
    }

    protected native void g_variant_builder_add(
        @Ptr
        long builder,
        @Ptr
        long format_string, Object... varargs);

    public void add(Pointer format_string, Object... varargs) {
        this.g_variant_builder_add(Pointer.pointerTo(this, GVariantBuilder.class).getPeer(), Pointer.getPeer(format_string), varargs);
    }

    protected native void g_variant_builder_add_parsed(
        @Ptr
        long builder,
        @Ptr
        long format, Object... varargs);

    public void add_parsed(Pointer format, Object... varargs) {
        this.g_variant_builder_add_parsed(Pointer.pointerTo(this, GVariantBuilder.class).getPeer(), Pointer.getPeer(format), varargs);
    }

    protected native void g_variant_builder_add_value(
        @Ptr
        long builder,
        @Ptr
        long value);

    public void add_value(Pointer<GVariant> value) {
        this.g_variant_builder_add_value(Pointer.pointerTo(this, GVariantBuilder.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_variant_builder_clear(
        @Ptr
        long builder);

    public void clear() {
        this.g_variant_builder_clear(Pointer.pointerTo(this, GVariantBuilder.class).getPeer());
    }

    protected native void g_variant_builder_close(
        @Ptr
        long builder);

    public void close() {
        this.g_variant_builder_close(Pointer.pointerTo(this, GVariantBuilder.class).getPeer());
    }

    @Ptr
    protected native long g_variant_builder_end(
        @Ptr
        long builder);

    public Pointer<GVariant> end() {
        return Pointer.pointerToAddress(this.g_variant_builder_end(Pointer.pointerTo(this, GVariantBuilder.class).getPeer()), GVariant.class);
    }

    protected native void g_variant_builder_init(
        @Ptr
        long builder,
        @Ptr
        long type);

    public void init(Pointer type) {
        this.g_variant_builder_init(Pointer.pointerTo(this, GVariantBuilder.class).getPeer(), Pointer.getPeer(type));
    }

    protected native void g_variant_builder_open(
        @Ptr
        long builder,
        @Ptr
        long type);

    public void open(Pointer type) {
        this.g_variant_builder_open(Pointer.pointerTo(this, GVariantBuilder.class).getPeer(), Pointer.getPeer(type));
    }

    @Ptr
    protected native long g_variant_builder_ref(
        @Ptr
        long builder);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_variant_builder_ref(Pointer.pointerTo(this, GVariantBuilder.class).getPeer()));
    }

    protected native void g_variant_builder_unref(
        @Ptr
        long builder);

    public void unref() {
        this.g_variant_builder_unref(Pointer.pointerTo(this, GVariantBuilder.class).getPeer());
    }

}
