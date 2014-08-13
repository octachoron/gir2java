
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeClass
    extends StructObject
{


    public GTypeClass() {
        super();
    }

    public GTypeClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_g_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTypeClass field_g_type(long field_g_type) {
        this.io.setNativeObjectField(this, 0, field_g_type);
        return this;
    }

    protected native Pointer g_type_class_get_private(
        @Ptr
        long klass, long private_type);

    public Pointer get_private(long private_type) {
        return this.g_type_class_get_private(Pointer.pointerTo(this, GTypeClass.class), private_type);
    }

    public native void g_type_class_add_private(Pointer g_class, long private_size);

    protected native void g_type_class_adjust_private_offset(Pointer g_class,
        @Ptr
        long private_size_or_offset);

    public void adjust_private_offset(Pointer g_class, Pointer<Integer> private_size_or_offset) {
        this.g_type_class_adjust_private_offset(g_class, Pointer.getPeer(private_size_or_offset));
    }

    public native int g_type_class_get_instance_private_offset(Pointer g_class);

    public native GTypeClass g_type_class_peek_parent(GTypeClass g_class);

    public native void g_type_class_unref_uncached(GTypeClass g_class);

    public native GTypeClass g_type_class_peek_static(long type);

    public native GTypeClass g_type_class_ref(long type);

    public native void g_type_class_unref(GTypeClass g_class);

    public native GTypeClass g_type_class_peek(long type);

}
