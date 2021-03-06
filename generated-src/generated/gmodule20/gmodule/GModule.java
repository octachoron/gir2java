
package generated.gmodule20.gmodule;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gmodule-2.0")
public class GModule
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GModule() {
        super();
    }

    public GModule(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_module_close(
        @Ptr
        long module);

    public boolean close() {
        return this.g_module_close(Pointer.pointerTo(this, GModule.class).getPeer());
    }

    protected native void g_module_make_resident(
        @Ptr
        long module);

    public void make_resident() {
        this.g_module_make_resident(Pointer.pointerTo(this, GModule.class).getPeer());
    }

    @Ptr
    protected native long g_module_name(
        @Ptr
        long module);

    public Pointer name() {
        return Pointer.pointerToAddress(this.g_module_name(Pointer.pointerTo(this, GModule.class).getPeer()));
    }

    protected native boolean g_module_symbol(
        @Ptr
        long module,
        @Ptr
        long symbol_name,
        @Ptr
        long symbol);

    public boolean symbol(Pointer symbol_name, Pointer symbol) {
        return this.g_module_symbol(Pointer.pointerTo(this, GModule.class).getPeer(), Pointer.getPeer(symbol_name), Pointer.getPeer(symbol));
    }

    @Ptr
    protected static native long g_module_build_path(
        @Ptr
        long directory,
        @Ptr
        long module_name);

    public static Pointer build_path(Pointer directory, Pointer module_name) {
        return Pointer.pointerToAddress(GModule.g_module_build_path(Pointer.getPeer(directory), Pointer.getPeer(module_name)));
    }

    @Ptr
    protected static native long g_module_error();

    public static Pointer error() {
        return Pointer.pointerToAddress(GModule.g_module_error());
    }

    public static native boolean g_module_supported();

    @Ptr
    protected static native long g_module_open(
        @Ptr
        long file_name, IntValuedEnum<GModuleFlags> flags);

    public static Pointer<GModule> open(Pointer file_name, IntValuedEnum<GModuleFlags> flags) {
        return Pointer.pointerToAddress(GModule.g_module_open(Pointer.getPeer(file_name), flags), GModule.class);
    }

}
