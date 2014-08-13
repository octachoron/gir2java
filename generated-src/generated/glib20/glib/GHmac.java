
package generated.glib20.glib;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHmac
    extends StructObject
{


    public GHmac() {
        super();
    }

    public GHmac(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_hmac_copy(
        @Ptr
        long hmac);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_hmac_copy(Pointer.pointerTo(this, GHmac.class)));
    }

    protected native void g_hmac_get_digest(
        @Ptr
        long hmac,
        @Ptr
        long buffer,
        @Ptr
        long digest_len);

    public void get_digest(Pointer<Short> buffer, Pointer<Long> digest_len) {
        this.g_hmac_get_digest(Pointer.pointerTo(this, GHmac.class), Pointer.getPeer(buffer), Pointer.getPeer(digest_len));
    }

    @Ptr
    protected native long g_hmac_get_string(
        @Ptr
        long hmac);

    public Pointer get_string() {
        return Pointer.pointerToAddress(this.g_hmac_get_string(Pointer.pointerTo(this, GHmac.class)));
    }

    @Ptr
    protected native long g_hmac_ref(
        @Ptr
        long hmac);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_hmac_ref(Pointer.pointerTo(this, GHmac.class)));
    }

    protected native void g_hmac_unref(
        @Ptr
        long hmac);

    public void unref() {
        this.g_hmac_unref(Pointer.pointerTo(this, GHmac.class));
    }

    protected native void g_hmac_update(
        @Ptr
        long hmac,
        @Ptr
        long data, long length);

    public void update(short data, long length) {
        this.g_hmac_update(Pointer.pointerTo(this, GHmac.class), Pointer.getPeer(data), length);
    }

    @Ptr
    protected native long g_hmac_new(IntValuedEnum<GChecksumType> digest_type,
        @Ptr
        long key, long key_len);

    public Pointer _new(IntValuedEnum<GChecksumType> digest_type, short key, long key_len) {
        return Pointer.pointerToAddress(this.g_hmac_new(digest_type, Pointer.getPeer(key), key_len));
    }

}
