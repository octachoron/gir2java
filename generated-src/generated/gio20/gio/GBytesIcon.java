
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GBytesIcon
    extends GObject
{


    static {
        BridJ.register();
    }

    public GBytesIcon() {
        super();
    }

    public GBytesIcon(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_bytes_icon_new(
        @Ptr
        long bytes);

    public static Pointer gbytesicon__new(Pointer<GBytes> bytes) {
        return Pointer.pointerToAddress(GBytesIcon.g_bytes_icon_new(Pointer.getPeer(bytes)));
    }

    @Ptr
    protected native long g_bytes_icon_get_bytes(
        @Ptr
        long icon);

    public Pointer<GBytes> get_bytes() {
        return Pointer.pointerToAddress(this.g_bytes_icon_get_bytes(Pointer.pointerTo(this, GBytesIcon.class).getPeer()), GBytes.class);
    }

}
