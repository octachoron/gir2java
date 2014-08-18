
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

    protected static native int g_type_class_get_instance_private_offset(
        @Ptr
        long g_class);

    public static int get_instance_private_offset(Pointer g_class) {
        return GTypeClass.g_type_class_get_instance_private_offset(Pointer.getPeer(g_class));
    }

    @Field(0)
    private long field_g_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GTypeClass field_g_type(long field_g_type) {
        this.io.setLongField(this, 0, field_g_type);
        return this;
    }

    protected static native void g_type_class_adjust_private_offset(
        @Ptr
        long g_class,
        @Ptr
        long private_size_or_offset);

    public static void adjust_private_offset(Pointer g_class, Pointer<Integer> private_size_or_offset) {
        GTypeClass.g_type_class_adjust_private_offset(Pointer.getPeer(g_class), Pointer.getPeer(private_size_or_offset));
    }

    @Ptr
    protected native long g_type_class_get_private(
        @Ptr
        long klass, long private_type);

    public Pointer get_private(long private_type) {
        return Pointer.pointerToAddress(this.g_type_class_get_private(Pointer.pointerTo(this, GTypeClass.class).getPeer(), private_type));
    }

    protected static native void g_type_class_add_private(
        @Ptr
        long g_class, long private_size);

    public static void add_private(Pointer g_class, long private_size) {
        GTypeClass.g_type_class_add_private(Pointer.getPeer(g_class), private_size);
    }

}
