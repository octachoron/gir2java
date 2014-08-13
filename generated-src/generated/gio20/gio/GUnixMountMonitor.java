
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixMountMonitor
    extends GObject
{


    public GUnixMountMonitor() {
        super();
    }

    public GUnixMountMonitor(Pointer pointer) {
        super(pointer);
    }

    protected native void g_unix_mount_monitor_set_rate_limit(
        @Ptr
        long mount_monitor, int limit_msec);

    public void set_rate_limit(int limit_msec) {
        this.g_unix_mount_monitor_set_rate_limit(Pointer.pointerTo(this, GUnixMountMonitor.class), limit_msec);
    }

}
