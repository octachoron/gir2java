
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeInterface
    extends StructObject
{


    public GTypeInterface() {
        super();
    }

    public GTypeInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_g_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTypeInterface field_g_type(long field_g_type) {
        this.io.setNativeObjectField(this, 0, field_g_type);
        return this;
    }

    @Field(1)
    public long field_g_instance_type() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GTypeInterface field_g_instance_type(long field_g_instance_type) {
        this.io.setNativeObjectField(this, 1, field_g_instance_type);
        return this;
    }

    public native void g_type_interface_add_prerequisite(long interface_type, long prerequisite_type);

    @Ptr
    protected native long g_type_interface_get_plugin(long instance_type, long interface_type);

    public Pointer get_plugin(long instance_type, long interface_type) {
        return Pointer.pointerToAddress(this.g_type_interface_get_plugin(instance_type, interface_type));
    }

    @Ptr
    protected native long g_type_interface_prerequisites(long interface_type,
        @Ptr
        long n_prerequisites);

    public long prerequisites(long interface_type, Pointer<Long> n_prerequisites) {
        return Pointer.pointerToAddress(this.g_type_interface_prerequisites(interface_type, Pointer.getPeer(n_prerequisites)), Long.class);
    }

    public native GTypeInterface g_type_interface_peek_parent(GTypeInterface g_iface);

    public native GTypeInterface g_type_interface_peek(GTypeClass instance_class, long iface_type);

}
