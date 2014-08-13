
package generated;

import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GModule {


    @Ptr
    protected native long g_module_build_path(
        @Ptr
        long directory,
        @Ptr
        long module_name);

    public Pointer module_build_path(Pointer directory, Pointer module_name) {
        return Pointer.pointerToAddress(this.g_module_build_path(Pointer.getPeer(directory), Pointer.getPeer(module_name)));
    }

    @Ptr
    protected native long g_module_error();

    public Pointer module_error() {
        return Pointer.pointerToAddress(this.g_module_error());
    }

    public native boolean g_module_supported();

}
