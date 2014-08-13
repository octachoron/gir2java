
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GThemedIcon
    extends GObject
{


    public GThemedIcon() {
        super();
    }

    public GThemedIcon(Pointer pointer) {
        super(pointer);
    }

    protected native void g_themed_icon_append_name(
        @Ptr
        long icon,
        @Ptr
        long iconname);

    public void append_name(Pointer iconname) {
        this.g_themed_icon_append_name(Pointer.pointerTo(this, GThemedIcon.class), Pointer.getPeer(iconname));
    }

    @Ptr
    protected native long g_themed_icon_get_names(
        @Ptr
        long icon);

    public Pointer get_names() {
        return Pointer.pointerToAddress(this.g_themed_icon_get_names(Pointer.pointerTo(this, GThemedIcon.class)));
    }

    protected native void g_themed_icon_prepend_name(
        @Ptr
        long icon,
        @Ptr
        long iconname);

    public void prepend_name(Pointer iconname) {
        this.g_themed_icon_prepend_name(Pointer.pointerTo(this, GThemedIcon.class), Pointer.getPeer(iconname));
    }

}
