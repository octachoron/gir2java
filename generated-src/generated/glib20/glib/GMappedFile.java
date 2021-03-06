
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GMappedFile
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMappedFile() {
        super();
    }

    public GMappedFile(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_mapped_file_new(
        @Ptr
        long filename, boolean writable);

    public static Pointer _new(Pointer filename, boolean writable) {
        return Pointer.pointerToAddress(GMappedFile.g_mapped_file_new(Pointer.getPeer(filename), writable));
    }

    @Ptr
    protected static native long g_mapped_file_new_from_fd(int fd, boolean writable);

    public static Pointer new_from_fd(int fd, boolean writable) {
        return Pointer.pointerToAddress(GMappedFile.g_mapped_file_new_from_fd(fd, writable));
    }

    protected native void g_mapped_file_free(
        @Ptr
        long file);

    public void free() {
        this.g_mapped_file_free(Pointer.pointerTo(this, GMappedFile.class).getPeer());
    }

    @Ptr
    protected native long g_mapped_file_get_bytes(
        @Ptr
        long file);

    public Pointer<GBytes> get_bytes() {
        return Pointer.pointerToAddress(this.g_mapped_file_get_bytes(Pointer.pointerTo(this, GMappedFile.class).getPeer()), GBytes.class);
    }

    @Ptr
    protected native long g_mapped_file_get_contents(
        @Ptr
        long file);

    public Pointer get_contents() {
        return Pointer.pointerToAddress(this.g_mapped_file_get_contents(Pointer.pointerTo(this, GMappedFile.class).getPeer()));
    }

    protected native long g_mapped_file_get_length(
        @Ptr
        long file);

    public long get_length() {
        return this.g_mapped_file_get_length(Pointer.pointerTo(this, GMappedFile.class).getPeer());
    }

    @Ptr
    protected native long g_mapped_file_ref(
        @Ptr
        long file);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_mapped_file_ref(Pointer.pointerTo(this, GMappedFile.class).getPeer()));
    }

    protected native void g_mapped_file_unref(
        @Ptr
        long file);

    public void unref() {
        this.g_mapped_file_unref(Pointer.pointerTo(this, GMappedFile.class).getPeer());
    }

}
