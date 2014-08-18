
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusActionGroup
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusActionGroup() {
        super();
    }

    public GDBusActionGroup(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_action_group_get(
        @Ptr
        long connection,
        @Ptr
        long bus_name,
        @Ptr
        long object_path);

    public static Pointer gdbusactiongroup_get(Pointer connection, Pointer bus_name, Pointer object_path) {
        return Pointer.pointerToAddress(GDBusActionGroup.g_dbus_action_group_get(Pointer.getPeer(connection), Pointer.getPeer(bus_name), Pointer.getPeer(object_path)));
    }

}
