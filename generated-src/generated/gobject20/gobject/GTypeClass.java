
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeClass() {
        super();
    }

    public GTypeClass(Pointer pointer) {
        super(pointer);
    }

    protected native void g_type_class_unref(
        @Ptr
        long g_class);

    public void unref() {
        this.g_type_class_unref(Pointer.pointerTo(this, GTypeClass.class).getPeer());
    }

    protected static native void g_type_class_adjust_private_offset(
        @Ptr
        long g_class,
        @Ptr
        long private_size_or_offset);

    public static void adjust_private_offset(Pointer g_class, Pointer<Integer> private_size_or_offset) {
        GTypeClass.g_type_class_adjust_private_offset(Pointer.getPeer(g_class), Pointer.getPeer(private_size_or_offset));
    }

    @Field(0)
    private long gtypeclass_field_g_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GTypeClass gtypeclass_field_g_type(long gtypeclass_field_g_type) {
        this.io.setLongField(this, 0, gtypeclass_field_g_type);
        return this;
    }

    protected static native int g_type_class_get_instance_private_offset(
        @Ptr
        long g_class);

    public static int get_instance_private_offset(Pointer g_class) {
        return GTypeClass.g_type_class_get_instance_private_offset(Pointer.getPeer(g_class));
    }

    protected native void g_type_class_unref_uncached(
        @Ptr
        long g_class);

    public void unref_uncached() {
        this.g_type_class_unref_uncached(Pointer.pointerTo(this, GTypeClass.class).getPeer());
    }

    @Ptr
    protected static native long g_type_class_ref(long type);

    public static Pointer<GTypeClass> ref(long type) {
        return Pointer.pointerToAddress(GTypeClass.g_type_class_ref(type), GTypeClass.class);
    }

    @Ptr
    protected static native long g_type_class_peek(long type);

    public static Pointer<GTypeClass> peek(long type) {
        return Pointer.pointerToAddress(GTypeClass.g_type_class_peek(type), GTypeClass.class);
    }

    @Ptr
    protected static native long g_type_class_peek_static(long type);

    public static Pointer<GTypeClass> peek_static(long type) {
        return Pointer.pointerToAddress(GTypeClass.g_type_class_peek_static(type), GTypeClass.class);
    }

    protected static native void g_type_class_add_private(
        @Ptr
        long g_class, long private_size);

    public static void add_private(Pointer g_class, long private_size) {
        GTypeClass.g_type_class_add_private(Pointer.getPeer(g_class), private_size);
    }

    @Ptr
    protected native long g_type_class_peek_parent(
        @Ptr
        long g_class);

    public Pointer<GTypeClass> peek_parent() {
        return Pointer.pointerToAddress(this.g_type_class_peek_parent(Pointer.pointerTo(this, GTypeClass.class).getPeer()), GTypeClass.class);
    }

    @Ptr
    protected native long g_type_class_get_private(
        @Ptr
        long klass, long private_type);

    public Pointer get_private(long private_type) {
        return Pointer.pointerToAddress(this.g_type_class_get_private(Pointer.pointerTo(this, GTypeClass.class).getPeer(), private_type));
    }

}
