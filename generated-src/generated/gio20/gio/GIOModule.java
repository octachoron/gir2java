
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeModule;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOModule
    extends GTypeModule
{


    public GIOModule() {
        super();
    }

    public GIOModule(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_io_module_query();

    public Pointer query() {
        return Pointer.pointerToAddress(this.g_io_module_query());
    }

    protected native void g_io_module_load(
        @Ptr
        long module);

    public void load() {
        this.g_io_module_load(Pointer.pointerTo(this, GIOModule.class));
    }

    protected native void g_io_module_unload(
        @Ptr
        long module);

    public void unload() {
        this.g_io_module_unload(Pointer.pointerTo(this, GIOModule.class));
    }

}
