
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GMappedFile
    extends StructObject
{


    public GMappedFile() {
        super();
    }

    public GMappedFile(Pointer pointer) {
        super(pointer);
    }

    protected native void g_mapped_file_free(
        @Ptr
        long file);

    public void free() {
        this.g_mapped_file_free(Pointer.pointerTo(this, GMappedFile.class));
    }

    @Ptr
    protected native long g_mapped_file_get_bytes(
        @Ptr
        long file);

    public Pointer<GBytes> get_bytes() {
        return Pointer.pointerToAddress(this.g_mapped_file_get_bytes(Pointer.pointerTo(this, GMappedFile.class)), Pointer.class);
    }

    @Ptr
    protected native long g_mapped_file_get_contents(
        @Ptr
        long file);

    public Pointer get_contents() {
        return Pointer.pointerToAddress(this.g_mapped_file_get_contents(Pointer.pointerTo(this, GMappedFile.class)));
    }

    protected native long g_mapped_file_get_length(
        @Ptr
        long file);

    public long get_length() {
        return this.g_mapped_file_get_length(Pointer.pointerTo(this, GMappedFile.class));
    }

    @Ptr
    protected native long g_mapped_file_ref(
        @Ptr
        long file);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_mapped_file_ref(Pointer.pointerTo(this, GMappedFile.class)));
    }

    protected native void g_mapped_file_unref(
        @Ptr
        long file);

    public void unref() {
        this.g_mapped_file_unref(Pointer.pointerTo(this, GMappedFile.class));
    }

}
