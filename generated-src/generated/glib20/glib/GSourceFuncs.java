
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GSourceFuncs
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSourceFuncs() {
        super();
    }

    public GSourceFuncs(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer gsourcefuncs_field_closure_callback() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GSourceFuncs gsourcefuncs_field_closure_callback(Pointer gsourcefuncs_field_closure_callback) {
        this.io.setPointerField(this, 0, gsourcefuncs_field_closure_callback);
        return this;
    }

    @Field(1)
    private Pointer gsourcefuncs_field_closure_marshal() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GSourceFuncs gsourcefuncs_field_closure_marshal(Pointer gsourcefuncs_field_closure_marshal) {
        this.io.setPointerField(this, 1, gsourcefuncs_field_closure_marshal);
        return this;
    }

}
