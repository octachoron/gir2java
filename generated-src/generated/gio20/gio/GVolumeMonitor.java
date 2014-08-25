
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GVolumeMonitor
    extends GObject
{


    static {
        BridJ.register();
    }

    public GVolumeMonitor() {
        super();
    }

    public GVolumeMonitor(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_volume_monitor_adopt_orphan_mount(
        @Ptr
        long mount);

    public static Pointer<Object> adopt_orphan_mount(Pointer<Object> mount) {
        return Pointer.pointerToAddress(GVolumeMonitor.g_volume_monitor_adopt_orphan_mount(Pointer.getPeer(mount)), Object.class);
    }

    @Ptr
    protected static native long g_volume_monitor_get();

    public static Pointer gvolumemonitor_get() {
        return Pointer.pointerToAddress(GVolumeMonitor.g_volume_monitor_get());
    }

    @Ptr
    protected native long g_volume_monitor_get_connected_drives(
        @Ptr
        long volume_monitor);

    public Pointer<GList> get_connected_drives() {
        return Pointer.pointerToAddress(this.g_volume_monitor_get_connected_drives(Pointer.pointerTo(this, GVolumeMonitor.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long g_volume_monitor_get_mount_for_uuid(
        @Ptr
        long volume_monitor,
        @Ptr
        long uuid);

    public Pointer<Object> get_mount_for_uuid(Pointer uuid) {
        return Pointer.pointerToAddress(this.g_volume_monitor_get_mount_for_uuid(Pointer.pointerTo(this, GVolumeMonitor.class).getPeer(), Pointer.getPeer(uuid)), Object.class);
    }

    @Ptr
    protected native long g_volume_monitor_get_mounts(
        @Ptr
        long volume_monitor);

    public Pointer<GList> get_mounts() {
        return Pointer.pointerToAddress(this.g_volume_monitor_get_mounts(Pointer.pointerTo(this, GVolumeMonitor.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long g_volume_monitor_get_volume_for_uuid(
        @Ptr
        long volume_monitor,
        @Ptr
        long uuid);

    public Pointer<Object> get_volume_for_uuid(Pointer uuid) {
        return Pointer.pointerToAddress(this.g_volume_monitor_get_volume_for_uuid(Pointer.pointerTo(this, GVolumeMonitor.class).getPeer(), Pointer.getPeer(uuid)), Object.class);
    }

    @Ptr
    protected native long g_volume_monitor_get_volumes(
        @Ptr
        long volume_monitor);

    public Pointer<GList> get_volumes() {
        return Pointer.pointerToAddress(this.g_volume_monitor_get_volumes(Pointer.pointerTo(this, GVolumeMonitor.class).getPeer()), GList.class);
    }

    @Field(0)
    public GObject gvolumemonitor_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GVolumeMonitor gvolumemonitor_field_parent_instance(GObject gvolumemonitor_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gvolumemonitor_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gvolumemonitor_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GVolumeMonitor gvolumemonitor_field_priv(Pointer gvolumemonitor_field_priv) {
        this.io.setPointerField(this, 1, gvolumemonitor_field_priv);
        return this;
    }

}
