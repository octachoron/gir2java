
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimplePermission
    extends GPermission
{


    static {
        BridJ.register();
    }

    public GSimplePermission() {
        super();
    }

    public GSimplePermission(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_simple_permission_new(boolean allowed);

    public static Pointer<GPermission> gsimplepermission__new(boolean allowed) {
        return Pointer.pointerToAddress(GSimplePermission.g_simple_permission_new(allowed), GPermission.class);
    }

}
