
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GAppInfoMonitor
    extends GObject
{


    static {
        BridJ.register();
    }

    public GAppInfoMonitor() {
        super();
    }

    public GAppInfoMonitor(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_app_info_monitor_get();

    public static Pointer gappinfomonitor_get() {
        return Pointer.pointerToAddress(GAppInfoMonitor.g_app_info_monitor_get());
    }

}
