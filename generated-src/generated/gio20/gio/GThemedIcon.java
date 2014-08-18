
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GThemedIcon
    extends GObject
{


    static {
        BridJ.register();
    }

    public GThemedIcon() {
        super();
    }

    public GThemedIcon(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_themed_icon_new(
        @Ptr
        long iconname);

    public static Pointer gthemedicon__new(Pointer iconname) {
        return Pointer.pointerToAddress(GThemedIcon.g_themed_icon_new(Pointer.getPeer(iconname)));
    }

    @Ptr
    protected static native long g_themed_icon_new_from_names(
        @Ptr
        long iconnames, int len);

    public static Pointer new_from_names(Pointer iconnames, int len) {
        return Pointer.pointerToAddress(GThemedIcon.g_themed_icon_new_from_names(Pointer.getPeer(iconnames), len));
    }

    @Ptr
    protected static native long g_themed_icon_new_with_default_fallbacks(
        @Ptr
        long iconname);

    public static Pointer new_with_default_fallbacks(Pointer iconname) {
        return Pointer.pointerToAddress(GThemedIcon.g_themed_icon_new_with_default_fallbacks(Pointer.getPeer(iconname)));
    }

    protected native void g_themed_icon_append_name(
        @Ptr
        long icon,
        @Ptr
        long iconname);

    public void append_name(Pointer iconname) {
        this.g_themed_icon_append_name(Pointer.pointerTo(this, GThemedIcon.class).getPeer(), Pointer.getPeer(iconname));
    }

    @Ptr
    protected native long g_themed_icon_get_names(
        @Ptr
        long icon);

    public Pointer get_names() {
        return Pointer.pointerToAddress(this.g_themed_icon_get_names(Pointer.pointerTo(this, GThemedIcon.class).getPeer()));
    }

    protected native void g_themed_icon_prepend_name(
        @Ptr
        long icon,
        @Ptr
        long iconname);

    public void prepend_name(Pointer iconname) {
        this.g_themed_icon_prepend_name(Pointer.pointerTo(this, GThemedIcon.class).getPeer(), Pointer.getPeer(iconname));
    }

}
