
package generated;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gmodule-2.0")
public class GModule {


    static {
        BridJ.register();
    }

    @Ptr
    protected static native long g_module_build_path(
        @Ptr
        long directory,
        @Ptr
        long module_name);

    public static Pointer module_build_path(Pointer directory, Pointer module_name) {
        return Pointer.pointerToAddress(GModule.g_module_build_path(Pointer.getPeer(directory), Pointer.getPeer(module_name)));
    }

    @Ptr
    protected static native long g_module_error();

    public static Pointer module_error() {
        return Pointer.pointerToAddress(GModule.g_module_error());
    }

    public static native boolean g_module_supported();

}
