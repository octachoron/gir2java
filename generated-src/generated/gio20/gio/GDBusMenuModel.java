
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusMenuModel
    extends GMenuModel
{


    static {
        BridJ.register();
    }

    public GDBusMenuModel() {
        super();
    }

    public GDBusMenuModel(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_menu_model_get(
        @Ptr
        long connection,
        @Ptr
        long bus_name,
        @Ptr
        long object_path);

    public static Pointer gdbusmenumodel_get(Pointer<GDBusConnection> connection, Pointer bus_name, Pointer object_path) {
        return Pointer.pointerToAddress(GDBusMenuModel.g_dbus_menu_model_get(Pointer.getPeer(connection), Pointer.getPeer(bus_name), Pointer.getPeer(object_path)));
    }

}
