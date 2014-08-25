
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTlsFileDatabaseInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTlsFileDatabaseInterface() {
        super();
    }

    public GTlsFileDatabaseInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gtlsfiledatabaseinterface_field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsFileDatabaseInterface gtlsfiledatabaseinterface_field_g_iface(GTypeInterface gtlsfiledatabaseinterface_field_g_iface) {
        this.io.setNativeObjectField(this, 0, gtlsfiledatabaseinterface_field_g_iface);
        return this;
    }

    @Field(1)
    private Pointer gtlsfiledatabaseinterface_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTlsFileDatabaseInterface gtlsfiledatabaseinterface_field_padding(Pointer gtlsfiledatabaseinterface_field_padding) {
        this.io.setPointerField(this, 1, gtlsfiledatabaseinterface_field_padding);
        return this;
    }

}
