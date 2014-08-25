
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
    public Pointer ginterfaceinfo_field_interface_init() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GInterfaceInfo ginterfaceinfo_field_interface_init(Pointer ginterfaceinfo_field_interface_init) {
        this.io.setPointerField(this, 0, ginterfaceinfo_field_interface_init);
        return this;
    }

    @Field(1)
    public Pointer ginterfaceinfo_field_interface_finalize() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GInterfaceInfo ginterfaceinfo_field_interface_finalize(Pointer ginterfaceinfo_field_interface_finalize) {
        this.io.setPointerField(this, 1, ginterfaceinfo_field_interface_finalize);
        return this;
    }

    @Field(2)
    public Pointer ginterfaceinfo_field_interface_data() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GInterfaceInfo ginterfaceinfo_field_interface_data(Pointer ginterfaceinfo_field_interface_data) {
        this.io.setPointerField(this, 2, ginterfaceinfo_field_interface_data);
        return this;
    }

}
