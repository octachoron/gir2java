
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GInterfaceInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GInterfaceInfo() {
        super();
    }

    public GInterfaceInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_interface_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GInterfaceInfo field_interface_data(Pointer field_interface_data) {
        this.io.setPointerField(this, 0, field_interface_data);
        return this;
    }

    @Field(1)
    public Pointer field_interface_finalize() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GInterfaceInfo field_interface_finalize(Pointer field_interface_finalize) {
        this.io.setPointerField(this, 1, field_interface_finalize);
        return this;
    }

    @Field(2)
    public Pointer field_interface_init() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GInterfaceInfo field_interface_init(Pointer field_interface_init) {
        this.io.setPointerField(this, 2, field_interface_init);
        return this;
    }

}
