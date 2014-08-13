
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GZlibCompressor
    extends GObject
{


    public GZlibCompressor() {
        super();
    }

    public GZlibCompressor(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_zlib_compressor_get_file_info(
        @Ptr
        long compressor);

    public Pointer<GFileInfo> get_file_info() {
        return Pointer.pointerToAddress(this.g_zlib_compressor_get_file_info(Pointer.pointerTo(this, GZlibCompressor.class)), Pointer.class);
    }

    protected native void g_zlib_compressor_set_file_info(
        @Ptr
        long compressor,
        @Ptr
        long file_info);

    public void set_file_info(Pointer<GFileInfo> file_info) {
        this.g_zlib_compressor_set_file_info(Pointer.pointerTo(this, GZlibCompressor.class), Pointer.getPeer(file_info));
    }

}
