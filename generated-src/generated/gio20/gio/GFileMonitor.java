
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileMonitor
    extends GObject
{


    static {
        BridJ.register();
    }

    public GFileMonitor() {
        super();
    }

    public GFileMonitor(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_file_monitor_cancel(
        @Ptr
        long monitor);

    public boolean cancel() {
        return this.g_file_monitor_cancel(Pointer.pointerTo(this, GFileMonitor.class).getPeer());
    }

    protected native boolean g_file_monitor_is_cancelled(
        @Ptr
        long monitor);

    public boolean is_cancelled() {
        return this.g_file_monitor_is_cancelled(Pointer.pointerTo(this, GFileMonitor.class).getPeer());
    }

    protected native void g_file_monitor_set_rate_limit(
        @Ptr
        long monitor, int limit_msecs);

    public void set_rate_limit(int limit_msecs) {
        this.g_file_monitor_set_rate_limit(Pointer.pointerTo(this, GFileMonitor.class).getPeer(), limit_msecs);
    }

    @Field(0)
    public GObject gfilemonitor_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileMonitor gfilemonitor_field_parent_instance(GObject gfilemonitor_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gfilemonitor_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gfilemonitor_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GFileMonitor gfilemonitor_field_priv(Pointer gfilemonitor_field_priv) {
        this.io.setPointerField(this, 1, gfilemonitor_field_priv);
        return this;
    }

    protected native void g_file_monitor_emit_event(
        @Ptr
        long monitor,
        @Ptr
        long child,
        @Ptr
        long other_file, IntValuedEnum<GFileMonitorEvent> event_type);

    public void emit_event(Pointer<Object> child, Pointer<Object> other_file, IntValuedEnum<GFileMonitorEvent> event_type) {
        this.g_file_monitor_emit_event(Pointer.pointerTo(this, GFileMonitor.class).getPeer(), Pointer.getPeer(child), Pointer.getPeer(other_file), event_type);
    }

}
