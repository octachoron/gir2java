
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOModuleScope
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GIOModuleScope() {
        super();
    }

    public GIOModuleScope(Pointer pointer) {
        super(pointer);
    }

    protected native void g_io_module_scope_block(
        @Ptr
        long scope,
        @Ptr
        long basename);

    public void block(Pointer basename) {
        this.g_io_module_scope_block(Pointer.pointerTo(this, GIOModuleScope.class).getPeer(), Pointer.getPeer(basename));
    }

    protected native void g_io_module_scope_free(
        @Ptr
        long scope);

    public void free() {
        this.g_io_module_scope_free(Pointer.pointerTo(this, GIOModuleScope.class).getPeer());
    }

    @Ptr
    protected static native long g_io_module_scope_new(IntValuedEnum<GIOModuleScopeFlags> flags);

    public static Pointer<GIOModuleScope> _new(IntValuedEnum<GIOModuleScopeFlags> flags) {
        return Pointer.pointerToAddress(GIOModuleScope.g_io_module_scope_new(flags), GIOModuleScope.class);
    }

}
