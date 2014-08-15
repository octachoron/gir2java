
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
    public Pointer field_closure_callback() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GSourceFuncs field_closure_callback(Pointer field_closure_callback) {
        this.io.setPointerField(this, 0, field_closure_callback);
        return this;
    }

    @Field(1)
    public Pointer field_closure_marshal() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSourceFuncs field_closure_marshal(Pointer field_closure_marshal) {
        this.io.setPointerField(this, 1, field_closure_marshal);
        return this;
    }

}
