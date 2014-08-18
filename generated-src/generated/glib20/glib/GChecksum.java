
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GChecksum
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GChecksum() {
        super();
    }

    public GChecksum(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_checksum_copy(
        @Ptr
        long checksum);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_checksum_copy(Pointer.pointerTo(this, GChecksum.class).getPeer()));
    }

    protected native void g_checksum_free(
        @Ptr
        long checksum);

    public void free() {
        this.g_checksum_free(Pointer.pointerTo(this, GChecksum.class).getPeer());
    }

    protected native void g_checksum_get_digest(
        @Ptr
        long checksum,
        @Ptr
        long buffer,
        @Ptr
        long digest_len);

    public void get_digest(Pointer<Short> buffer, Pointer<Long> digest_len) {
        this.g_checksum_get_digest(Pointer.pointerTo(this, GChecksum.class).getPeer(), Pointer.getPeer(buffer), Pointer.getPeer(digest_len));
    }

    @Ptr
    protected native long g_checksum_get_string(
        @Ptr
        long checksum);

    public Pointer get_string() {
        return Pointer.pointerToAddress(this.g_checksum_get_string(Pointer.pointerTo(this, GChecksum.class).getPeer()));
    }

    protected native void g_checksum_reset(
        @Ptr
        long checksum);

    public void reset() {
        this.g_checksum_reset(Pointer.pointerTo(this, GChecksum.class).getPeer());
    }

    protected native void g_checksum_update(
        @Ptr
        long checksum,
        @Ptr
        long data, long length);

    public void update(Pointer<Short> data, long length) {
        this.g_checksum_update(Pointer.pointerTo(this, GChecksum.class).getPeer(), Pointer.getPeer(data), length);
    }

    @Ptr
    protected static native long g_checksum_new(IntValuedEnum<GChecksumType> checksum_type);

    public static Pointer<GChecksum> _new(IntValuedEnum<GChecksumType> checksum_type) {
        return Pointer.pointerToAddress(GChecksum.g_checksum_new(checksum_type), GChecksum.class);
    }

    public static native long g_checksum_type_get_length(IntValuedEnum<GChecksumType> checksum_type);

}
