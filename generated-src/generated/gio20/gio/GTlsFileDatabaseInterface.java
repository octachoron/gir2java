
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
    public GTypeInterface field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsFileDatabaseInterface field_g_iface(GTypeInterface field_g_iface) {
        this.io.setNativeObjectField(this, 0, field_g_iface);
        return this;
    }

    @Field(1)
    private Pointer field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTlsFileDatabaseInterface field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 1, field_padding);
        return this;
    }

}
