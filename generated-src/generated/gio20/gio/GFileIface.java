
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GFileIface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFileIface() {
        super();
    }

    public GFileIface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileIface field_g_iface(GTypeInterface field_g_iface) {
        this.io.setNativeObjectField(this, 0, field_g_iface);
        return this;
    }

    @Field(1)
    public boolean field_supports_thread_contexts() {
        return this.io.getBooleanField(this, 1);
    }

    @Field(1)
    public GFileIface field_supports_thread_contexts(boolean field_supports_thread_contexts) {
        this.io.setBooleanField(this, 1, field_supports_thread_contexts);
        return this;
    }

}
