
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GZlibDecompressor
    extends GObject
{


    static {
        BridJ.register();
    }

    public GZlibDecompressor() {
        super();
    }

    public GZlibDecompressor(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_zlib_decompressor_new(IntValuedEnum<GZlibCompressorFormat> format);

    public static Pointer gzlibdecompressor__new(IntValuedEnum<GZlibCompressorFormat> format) {
        return Pointer.pointerToAddress(GZlibDecompressor.g_zlib_decompressor_new(format));
    }

    @Ptr
    protected native long g_zlib_decompressor_get_file_info(
        @Ptr
        long decompressor);

    public Pointer<GFileInfo> get_file_info() {
        return Pointer.pointerToAddress(this.g_zlib_decompressor_get_file_info(Pointer.pointerTo(this, GZlibDecompressor.class).getPeer()), GFileInfo.class);
    }

}
