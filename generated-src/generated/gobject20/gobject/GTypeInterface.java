
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeInterface() {
        super();
    }

    public GTypeInterface(Pointer pointer) {
        super(pointer);
    }

    public static native void g_type_interface_add_prerequisite(long interface_type, long prerequisite_type);

    @Field(0)
    private long gtypeinterface_field_g_instance_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GTypeInterface gtypeinterface_field_g_instance_type(long gtypeinterface_field_g_instance_type) {
        this.io.setLongField(this, 0, gtypeinterface_field_g_instance_type);
        return this;
    }

    @Ptr
    protected native long g_type_interface_peek_parent(
        @Ptr
        long g_iface);

    public Pointer<GTypeInterface> peek_parent() {
        return Pointer.pointerToAddress(this.g_type_interface_peek_parent(Pointer.pointerTo(this, GTypeInterface.class).getPeer()), GTypeInterface.class);
    }

    @Ptr
    protected static native long g_type_interface_prerequisites(long interface_type,
        @Ptr
        long n_prerequisites);

    public static Pointer<Long> prerequisites(long interface_type, Pointer<Long> n_prerequisites) {
        return Pointer.pointerToAddress(GTypeInterface.g_type_interface_prerequisites(interface_type, Pointer.getPeer(n_prerequisites)), Long.class);
    }

    @Ptr
    protected static native long g_type_interface_peek(
        @Ptr
        long instance_class, long iface_type);

    public static Pointer<GTypeInterface> peek(Pointer<GTypeClass> instance_class, long iface_type) {
        return Pointer.pointerToAddress(GTypeInterface.g_type_interface_peek(Pointer.getPeer(instance_class), iface_type), GTypeInterface.class);
    }

    @Field(1)
    private long gtypeinterface_field_g_type() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GTypeInterface gtypeinterface_field_g_type(long gtypeinterface_field_g_type) {
        this.io.setLongField(this, 1, gtypeinterface_field_g_type);
        return this;
    }

    @Ptr
    protected static native long g_type_interface_get_plugin(long instance_type, long interface_type);

    public static Pointer<Object> get_plugin(long instance_type, long interface_type) {
        return Pointer.pointerToAddress(GTypeInterface.g_type_interface_get_plugin(instance_type, interface_type), Object.class);
    }

}
