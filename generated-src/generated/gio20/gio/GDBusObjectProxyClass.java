
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusObjectProxyClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusObjectProxyClass() {
        super();
    }

    public GDBusObjectProxyClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gdbusobjectproxyclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusObjectProxyClass gdbusobjectproxyclass_field_parent_class(GObjectClass gdbusobjectproxyclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gdbusobjectproxyclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gdbusobjectproxyclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusObjectProxyClass gdbusobjectproxyclass_field_padding(Pointer gdbusobjectproxyclass_field_padding) {
        this.io.setPointerField(this, 1, gdbusobjectproxyclass_field_padding);
        return this;
    }

}
