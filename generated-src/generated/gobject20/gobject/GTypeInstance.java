
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeInstance
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeInstance() {
        super();
    }

    public GTypeInstance(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_type_instance_get_private(
        @Ptr
        long instance, long private_type);

    public Pointer get_private(long private_type) {
        return Pointer.pointerToAddress(this.g_type_instance_get_private(Pointer.pointerTo(this, GTypeInstance.class).getPeer(), private_type));
    }

    @Field(0)
    private Pointer<GTypeClass> gtypeinstance_field_g_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GTypeInstance gtypeinstance_field_g_class(Pointer<GTypeClass> gtypeinstance_field_g_class) {
        this.io.setPointerField(this, 0, gtypeinstance_field_g_class);
        return this;
    }

}
