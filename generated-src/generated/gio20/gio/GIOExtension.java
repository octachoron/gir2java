
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOExtension
    extends StructObject
{


    public GIOExtension() {
        super();
    }

    public GIOExtension(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_io_extension_get_name(
        @Ptr
        long extension);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_io_extension_get_name(Pointer.pointerTo(this, GIOExtension.class)));
    }

    protected native int g_io_extension_get_priority(
        @Ptr
        long extension);

    public int get_priority() {
        return this.g_io_extension_get_priority(Pointer.pointerTo(this, GIOExtension.class));
    }

    protected native long g_io_extension_get_type(
        @Ptr
        long extension);

    public long get_type() {
        return this.g_io_extension_get_type(Pointer.pointerTo(this, GIOExtension.class));
    }

    @Ptr
    protected native long g_io_extension_ref_class(
        @Ptr
        long extension);

    public Pointer<GTypeClass> ref_class() {
        return Pointer.pointerToAddress(this.g_io_extension_ref_class(Pointer.pointerTo(this, GIOExtension.class)), Pointer.class);
    }

}
