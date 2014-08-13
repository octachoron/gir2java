
package generated.gio20.gio;

import generated.glib20.glib.GList;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOExtensionPoint
    extends StructObject
{


    public GIOExtensionPoint() {
        super();
    }

    public GIOExtensionPoint(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_io_extension_point_get_extension_by_name(
        @Ptr
        long extension_point,
        @Ptr
        long name);

    public Pointer<GIOExtension> get_extension_by_name(Pointer name) {
        return Pointer.pointerToAddress(this.g_io_extension_point_get_extension_by_name(Pointer.pointerTo(this, GIOExtensionPoint.class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long g_io_extension_point_get_extensions(
        @Ptr
        long extension_point);

    public Pointer<GList> get_extensions() {
        return Pointer.pointerToAddress(this.g_io_extension_point_get_extensions(Pointer.pointerTo(this, GIOExtensionPoint.class)), Pointer.class);
    }

    protected native long g_io_extension_point_get_required_type(
        @Ptr
        long extension_point);

    public long get_required_type() {
        return this.g_io_extension_point_get_required_type(Pointer.pointerTo(this, GIOExtensionPoint.class));
    }

    protected native void g_io_extension_point_set_required_type(
        @Ptr
        long extension_point, long type);

    public void set_required_type(long type) {
        this.g_io_extension_point_set_required_type(Pointer.pointerTo(this, GIOExtensionPoint.class), type);
    }

    @Ptr
    protected native long g_io_extension_point_implement(
        @Ptr
        long extension_point_name, long type,
        @Ptr
        long extension_name, int priority);

    public Pointer<GIOExtension> implement(Pointer extension_point_name, long type, Pointer extension_name, int priority) {
        return Pointer.pointerToAddress(this.g_io_extension_point_implement(Pointer.getPeer(extension_point_name), type, Pointer.getPeer(extension_name), priority), Pointer.class);
    }

    @Ptr
    protected native long g_io_extension_point_lookup(
        @Ptr
        long name);

    public Pointer lookup(Pointer name) {
        return Pointer.pointerToAddress(this.g_io_extension_point_lookup(Pointer.getPeer(name)));
    }

    @Ptr
    protected native long g_io_extension_point_register(
        @Ptr
        long name);

    public Pointer register(Pointer name) {
        return Pointer.pointerToAddress(this.g_io_extension_point_register(Pointer.getPeer(name)));
    }

}
