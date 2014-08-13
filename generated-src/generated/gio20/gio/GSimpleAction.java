
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimpleAction
    extends GObject
{


    public GSimpleAction() {
        super();
    }

    public GSimpleAction(Pointer pointer) {
        super(pointer);
    }

    protected native void g_simple_action_set_enabled(
        @Ptr
        long simple, boolean enabled);

    public void set_enabled(boolean enabled) {
        this.g_simple_action_set_enabled(Pointer.pointerTo(this, GSimpleAction.class), enabled);
    }

    protected native void g_simple_action_set_state(
        @Ptr
        long simple,
        @Ptr
        long value);

    public void set_state(Pointer<GVariant> value) {
        this.g_simple_action_set_state(Pointer.pointerTo(this, GSimpleAction.class), Pointer.getPeer(value));
    }

}
