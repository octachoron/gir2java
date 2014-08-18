
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

    @Ptr
    protected static native long g_type_interface_get_plugin(long instance_type, long interface_type);

    public static Pointer<Object> get_plugin(long instance_type, long interface_type) {
        return Pointer.pointerToAddress(GTypeInterface.g_type_interface_get_plugin(instance_type, interface_type), Object.class);
    }

    @Field(0)
    private long field_g_instance_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GTypeInterface field_g_instance_type(long field_g_instance_type) {
        this.io.setLongField(this, 0, field_g_instance_type);
        return this;
    }

    @Field(1)
    private long field_g_type() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GTypeInterface field_g_type(long field_g_type) {
        this.io.setLongField(this, 1, field_g_type);
        return this;
    }

    @Ptr
    protected static native long g_type_interface_prerequisites(long interface_type,
        @Ptr
        long n_prerequisites);

    public static Pointer<Long> prerequisites(long interface_type, Pointer<Long> n_prerequisites) {
        return Pointer.pointerToAddress(GTypeInterface.g_type_interface_prerequisites(interface_type, Pointer.getPeer(n_prerequisites)), Long.class);
    }

    public static native void g_type_interface_add_prerequisite(long interface_type, long prerequisite_type);

}
