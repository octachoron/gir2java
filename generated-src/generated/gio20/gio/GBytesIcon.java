
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GBytesIcon
    extends GObject
{


    public GBytesIcon() {
        super();
    }

    public GBytesIcon(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_bytes_icon_get_bytes(
        @Ptr
        long icon);

    public Pointer<GBytes> get_bytes() {
        return Pointer.pointerToAddress(this.g_bytes_icon_get_bytes(Pointer.pointerTo(this, GBytesIcon.class)), Pointer.class);
    }

}
