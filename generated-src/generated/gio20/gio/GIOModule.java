
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeModule;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOModule
    extends GTypeModule
{


    static {
        BridJ.register();
    }

    public GIOModule() {
        super();
    }

    public GIOModule(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_io_module_new(
        @Ptr
        long filename);

    public static Pointer giomodule__new(Pointer filename) {
        return Pointer.pointerToAddress(GIOModule.g_io_module_new(Pointer.getPeer(filename)));
    }

    @Ptr
    protected static native long g_io_module_query();

    public static Pointer query() {
        return Pointer.pointerToAddress(GIOModule.g_io_module_query());
    }

    protected native void g_io_module_load(
        @Ptr
        long module);

    public void load() {
        this.g_io_module_load(Pointer.pointerTo(this, GIOModule.class).getPeer());
    }

    protected native void g_io_module_unload(
        @Ptr
        long module);

    public void unload() {
        this.g_io_module_unload(Pointer.pointerTo(this, GIOModule.class).getPeer());
    }

}
