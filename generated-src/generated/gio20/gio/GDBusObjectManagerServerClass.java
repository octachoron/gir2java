
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusObjectManagerServerClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusObjectManagerServerClass() {
        super();
    }

    public GDBusObjectManagerServerClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gdbusobjectmanagerserverclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusObjectManagerServerClass gdbusobjectmanagerserverclass_field_parent_class(GObjectClass gdbusobjectmanagerserverclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gdbusobjectmanagerserverclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gdbusobjectmanagerserverclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusObjectManagerServerClass gdbusobjectmanagerserverclass_field_padding(Pointer gdbusobjectmanagerserverclass_field_padding) {
        this.io.setPointerField(this, 1, gdbusobjectmanagerserverclass_field_padding);
        return this;
    }

}
