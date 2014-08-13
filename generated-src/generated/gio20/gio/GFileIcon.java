
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileIcon
    extends GObject
{


    public GFileIcon() {
        super();
    }

    public GFileIcon(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_file_icon_get_file(
        @Ptr
        long icon);

    public Pointer<Object> get_file() {
        return Pointer.pointerToAddress(this.g_file_icon_get_file(Pointer.pointerTo(this, GFileIcon.class)), Pointer.class);
    }

}
