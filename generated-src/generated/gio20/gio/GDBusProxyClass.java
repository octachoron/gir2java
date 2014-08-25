
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusProxyClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusProxyClass() {
        super();
    }

    public GDBusProxyClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private GObjectClass gdbusproxyclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GDBusProxyClass gdbusproxyclass_field_parent_class(GObjectClass gdbusproxyclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gdbusproxyclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gdbusproxyclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusProxyClass gdbusproxyclass_field_padding(Pointer gdbusproxyclass_field_padding) {
        this.io.setPointerField(this, 1, gdbusproxyclass_field_padding);
        return this;
    }

}
