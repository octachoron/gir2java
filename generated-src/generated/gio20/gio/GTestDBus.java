
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTestDBus
    extends GObject
{


    public GTestDBus() {
        super();
    }

    public GTestDBus(Pointer pointer) {
        super(pointer);
    }

    public native void g_test_dbus_unset();

    protected native void g_test_dbus_add_service_dir(
        @Ptr
        long self,
        @Ptr
        long path);

    public void add_service_dir(Pointer path) {
        this.g_test_dbus_add_service_dir(Pointer.pointerTo(this, GTestDBus.class), Pointer.getPeer(path));
    }

    protected native void g_test_dbus_down(
        @Ptr
        long self);

    public void down() {
        this.g_test_dbus_down(Pointer.pointerTo(this, GTestDBus.class));
    }

    @Ptr
    protected native long g_test_dbus_get_bus_address(
        @Ptr
        long self);

    public Pointer get_bus_address() {
        return Pointer.pointerToAddress(this.g_test_dbus_get_bus_address(Pointer.pointerTo(this, GTestDBus.class)));
    }

    protected native void g_test_dbus_stop(
        @Ptr
        long self);

    public void stop() {
        this.g_test_dbus_stop(Pointer.pointerTo(this, GTestDBus.class));
    }

    protected native void g_test_dbus_up(
        @Ptr
        long self);

    public void up() {
        this.g_test_dbus_up(Pointer.pointerTo(this, GTestDBus.class));
    }

    protected native Object g_test_dbus_get_flags(
        @Ptr
        long self);

    public Object get_flags() {
        return this.g_test_dbus_get_flags(Pointer.pointerTo(this, GTestDBus.class));
    }

}
