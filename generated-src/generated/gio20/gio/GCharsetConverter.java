
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GCharsetConverter
    extends GObject
{


    static {
        BridJ.register();
    }

    public GCharsetConverter() {
        super();
    }

    public GCharsetConverter(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_charset_converter_new(
        @Ptr
        long to_charset,
        @Ptr
        long from_charset);

    public static Pointer gcharsetconverter__new(Pointer to_charset, Pointer from_charset) {
        return Pointer.pointerToAddress(GCharsetConverter.g_charset_converter_new(Pointer.getPeer(to_charset), Pointer.getPeer(from_charset)));
    }

    protected native long g_charset_converter_get_num_fallbacks(
        @Ptr
        long converter);

    public long get_num_fallbacks() {
        return this.g_charset_converter_get_num_fallbacks(Pointer.pointerTo(this, GCharsetConverter.class).getPeer());
    }

    protected native boolean g_charset_converter_get_use_fallback(
        @Ptr
        long converter);

    public boolean get_use_fallback() {
        return this.g_charset_converter_get_use_fallback(Pointer.pointerTo(this, GCharsetConverter.class).getPeer());
    }

    protected native void g_charset_converter_set_use_fallback(
        @Ptr
        long converter, boolean use_fallback);

    public void set_use_fallback(boolean use_fallback) {
        this.g_charset_converter_set_use_fallback(Pointer.pointerTo(this, GCharsetConverter.class).getPeer(), use_fallback);
    }

}
