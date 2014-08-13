
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GStringChunk
    extends StructObject
{


    public GStringChunk() {
        super();
    }

    public GStringChunk(Pointer pointer) {
        super(pointer);
    }

    protected native void g_string_chunk_clear(
        @Ptr
        long chunk);

    public void clear() {
        this.g_string_chunk_clear(Pointer.pointerTo(this, GStringChunk.class));
    }

    protected native void g_string_chunk_free(
        @Ptr
        long chunk);

    public void free() {
        this.g_string_chunk_free(Pointer.pointerTo(this, GStringChunk.class));
    }

    @Ptr
    protected native long g_string_chunk_insert(
        @Ptr
        long chunk,
        @Ptr
        long string);

    public Pointer insert(Pointer string) {
        return Pointer.pointerToAddress(this.g_string_chunk_insert(Pointer.pointerTo(this, GStringChunk.class), Pointer.getPeer(string)));
    }

    @Ptr
    protected native long g_string_chunk_insert_const(
        @Ptr
        long chunk,
        @Ptr
        long string);

    public Pointer insert_const(Pointer string) {
        return Pointer.pointerToAddress(this.g_string_chunk_insert_const(Pointer.pointerTo(this, GStringChunk.class), Pointer.getPeer(string)));
    }

    @Ptr
    protected native long g_string_chunk_insert_len(
        @Ptr
        long chunk,
        @Ptr
        long string, long len);

    public Pointer insert_len(Pointer string, long len) {
        return Pointer.pointerToAddress(this.g_string_chunk_insert_len(Pointer.pointerTo(this, GStringChunk.class), Pointer.getPeer(string), len));
    }

    @Ptr
    protected native long g_string_chunk_new(long size);

    public Pointer _new(long size) {
        return Pointer.pointerToAddress(this.g_string_chunk_new(size));
    }

}
