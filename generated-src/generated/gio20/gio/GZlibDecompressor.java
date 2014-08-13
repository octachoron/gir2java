
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GZlibDecompressor
    extends GObject
{


    public GZlibDecompressor() {
        super();
    }

    public GZlibDecompressor(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_zlib_decompressor_get_file_info(
        @Ptr
        long decompressor);

    public Pointer<GFileInfo> get_file_info() {
        return Pointer.pointerToAddress(this.g_zlib_decompressor_get_file_info(Pointer.pointerTo(this, GZlibDecompressor.class)), Pointer.class);
    }

}
