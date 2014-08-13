
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeInstance
    extends StructObject
{


    public GTypeInstance() {
        super();
    }

    public GTypeInstance(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GTypeClass> field_g_class() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTypeInstance field_g_class(Pointer<GTypeClass> field_g_class) {
        this.io.setPointerField(this, 0, field_g_class);
        return this;
    }

    protected native Pointer g_type_instance_get_private(
        @Ptr
        long instance, long private_type);

    public Pointer get_private(long private_type) {
        return this.g_type_instance_get_private(Pointer.pointerTo(this, GTypeInstance.class), private_type);
    }

}
