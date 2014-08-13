
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GDir
    extends StructObject
{


    public GDir() {
        super();
    }

    public GDir(Pointer pointer) {
        super(pointer);
    }

    protected native void g_dir_close(
        @Ptr
        long dir);

    public void close() {
        this.g_dir_close(Pointer.pointerTo(this, GDir.class));
    }

    @Ptr
    protected native long g_dir_read_name(
        @Ptr
        long dir);

    public Pointer read_name() {
        return Pointer.pointerToAddress(this.g_dir_read_name(Pointer.pointerTo(this, GDir.class)));
    }

    protected native void g_dir_rewind(
        @Ptr
        long dir);

    public void rewind() {
        this.g_dir_rewind(Pointer.pointerTo(this, GDir.class));
    }

    @Ptr
    protected native long g_dir_make_tmp(
        @Ptr
        long tmpl);

    public Pointer make_tmp(Pointer tmpl) {
        return Pointer.pointerToAddress(this.g_dir_make_tmp(Pointer.getPeer(tmpl)));
    }

    @Ptr
    protected native long g_dir_open(
        @Ptr
        long path, long flags);

    public Pointer open(Pointer path, long flags) {
        return Pointer.pointerToAddress(this.g_dir_open(Pointer.getPeer(path), flags));
    }

}
