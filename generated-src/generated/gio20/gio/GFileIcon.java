
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileIcon
    extends GObject
{


    static {
        BridJ.register();
    }

    public GFileIcon() {
        super();
    }

    public GFileIcon(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_file_icon_new(
        @Ptr
        long file);

    public static Pointer gfileicon__new(Pointer<Object> file) {
        return Pointer.pointerToAddress(GFileIcon.g_file_icon_new(Pointer.getPeer(file)));
    }

    @Ptr
    protected native long g_file_icon_get_file(
        @Ptr
        long icon);

    public Pointer<Object> get_file() {
        return Pointer.pointerToAddress(this.g_file_icon_get_file(Pointer.pointerTo(this, GFileIcon.class).getPeer()), Object.class);
    }

}
