
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixMountMonitor
    extends GObject
{


    static {
        BridJ.register();
    }

    public GUnixMountMonitor() {
        super();
    }

    public GUnixMountMonitor(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_unix_mount_monitor_new();

    public static Pointer gunixmountmonitor__new() {
        return Pointer.pointerToAddress(GUnixMountMonitor.g_unix_mount_monitor_new());
    }

    protected native void g_unix_mount_monitor_set_rate_limit(
        @Ptr
        long mount_monitor, int limit_msec);

    public void set_rate_limit(int limit_msec) {
        this.g_unix_mount_monitor_set_rate_limit(Pointer.pointerTo(this, GUnixMountMonitor.class).getPeer(), limit_msec);
    }

}
