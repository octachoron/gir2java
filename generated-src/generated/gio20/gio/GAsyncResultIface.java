
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GAsyncResultIface
    extends StructObject
{


    public GAsyncResultIface() {
        super();
    }

    public GAsyncResultIface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GAsyncResultIface field_g_iface(GTypeInterface field_g_iface) {
        this.io.setNativeObjectField(this, 0, field_g_iface);
        return this;
    }

}