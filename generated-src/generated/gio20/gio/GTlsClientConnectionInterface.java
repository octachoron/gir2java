
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTlsClientConnectionInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTlsClientConnectionInterface() {
        super();
    }

    public GTlsClientConnectionInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gtlsclientconnectioninterface_field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsClientConnectionInterface gtlsclientconnectioninterface_field_g_iface(GTypeInterface gtlsclientconnectioninterface_field_g_iface) {
        this.io.setNativeObjectField(this, 0, gtlsclientconnectioninterface_field_g_iface);
        return this;
    }

}
