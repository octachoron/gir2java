
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GIConv
    extends StructObject
{


    public GIConv() {
        super();
    }

    public GIConv(Pointer pointer) {
        super(pointer);
    }

    protected native long g_iconv(GIConv converter,
        @Ptr
        long inbuf,
        @Ptr
        long inbytes_left,
        @Ptr
        long outbuf,
        @Ptr
        long outbytes_left);

    public long g_iconv(Pointer inbuf, Pointer<Long> inbytes_left, Pointer outbuf, Pointer<Long> outbytes_left) {
        return this.g_iconv(Pointer.pointerTo(this, GIConv.class), Pointer.getPeer(inbuf), Pointer.getPeer(inbytes_left), Pointer.getPeer(outbuf), Pointer.getPeer(outbytes_left));
    }

    public native int g_iconv_close(GIConv converter);

    protected native GIConv g_iconv_open(
        @Ptr
        long to_codeset,
        @Ptr
        long from_codeset);

    public GIConv open(Pointer to_codeset, Pointer from_codeset) {
        return this.g_iconv_open(Pointer.getPeer(to_codeset), Pointer.getPeer(from_codeset));
    }

}
