
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimpleAction
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSimpleAction() {
        super();
    }

    public GSimpleAction(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_simple_action_new(
        @Ptr
        long name,
        @Ptr
        long parameter_type);

    public static Pointer gsimpleaction__new(Pointer name, Pointer<GVariantType> parameter_type) {
        return Pointer.pointerToAddress(GSimpleAction.g_simple_action_new(Pointer.getPeer(name), Pointer.getPeer(parameter_type)));
    }

    @Ptr
    protected static native long g_simple_action_new_stateful(
        @Ptr
        long name,
        @Ptr
        long parameter_type,
        @Ptr
        long state);

    public static Pointer new_stateful(Pointer name, Pointer<GVariantType> parameter_type, Pointer<GVariant> state) {
        return Pointer.pointerToAddress(GSimpleAction.g_simple_action_new_stateful(Pointer.getPeer(name), Pointer.getPeer(parameter_type), Pointer.getPeer(state)));
    }

    protected native void g_simple_action_set_enabled(
        @Ptr
        long simple, boolean enabled);

    public void set_enabled(boolean enabled) {
        this.g_simple_action_set_enabled(Pointer.pointerTo(this, GSimpleAction.class).getPeer(), enabled);
    }

    protected native void g_simple_action_set_state(
        @Ptr
        long simple,
        @Ptr
        long value);

    public void set_state(Pointer<GVariant> value) {
        this.g_simple_action_set_state(Pointer.pointerTo(this, GSimpleAction.class).getPeer(), Pointer.getPeer(value));
    }

}
