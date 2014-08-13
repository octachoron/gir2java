
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GSourceFuncs
    extends StructObject
{


    public GSourceFuncs() {
        super();
    }

    public GSourceFuncs(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_closure_callback() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSourceFuncs field_closure_callback(Object field_closure_callback) {
        this.io.setNativeObjectField(this, 0, field_closure_callback);
        return this;
    }

    @Field(1)
    public Object field_closure_marshal() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GSourceFuncs field_closure_marshal(Object field_closure_marshal) {
        this.io.setNativeObjectField(this, 1, field_closure_marshal);
        return this;
    }

}
