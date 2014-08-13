
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GAppInfoMonitor
    extends GObject
{


    public GAppInfoMonitor() {
        super();
    }

    public GAppInfoMonitor(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_app_info_monitor_get();

    public Pointer get() {
        return Pointer.pointerToAddress(this.g_app_info_monitor_get());
    }

}
