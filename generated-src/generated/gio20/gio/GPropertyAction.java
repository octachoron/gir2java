
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GPropertyAction
    extends GObject
{


    static {
        BridJ.register();
    }

    public GPropertyAction() {
        super();
    }

    public GPropertyAction(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_property_action_new(
        @Ptr
        long name,
        @Ptr
        long object,
        @Ptr
        long property_name);

    public static Pointer gpropertyaction__new(Pointer name, Pointer object, Pointer property_name) {
        return Pointer.pointerToAddress(GPropertyAction.g_property_action_new(Pointer.getPeer(name), Pointer.getPeer(object), Pointer.getPeer(property_name)));
    }

}
