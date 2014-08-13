
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GMainLoop
    extends StructObject
{


    public GMainLoop() {
        super();
    }

    public GMainLoop(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_main_loop_get_context(
        @Ptr
        long loop);

    public Pointer<GMainContext> get_context() {
        return Pointer.pointerToAddress(this.g_main_loop_get_context(Pointer.pointerTo(this, GMainLoop.class)), Pointer.class);
    }

    protected native boolean g_main_loop_is_running(
        @Ptr
        long loop);

    public boolean is_running() {
        return this.g_main_loop_is_running(Pointer.pointerTo(this, GMainLoop.class));
    }

    protected native void g_main_loop_quit(
        @Ptr
        long loop);

    public void quit() {
        this.g_main_loop_quit(Pointer.pointerTo(this, GMainLoop.class));
    }

    @Ptr
    protected native long g_main_loop_ref(
        @Ptr
        long loop);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_main_loop_ref(Pointer.pointerTo(this, GMainLoop.class)));
    }

    protected native void g_main_loop_run(
        @Ptr
        long loop);

    public void run() {
        this.g_main_loop_run(Pointer.pointerTo(this, GMainLoop.class));
    }

    protected native void g_main_loop_unref(
        @Ptr
        long loop);

    public void unref() {
        this.g_main_loop_unref(Pointer.pointerTo(this, GMainLoop.class));
    }

}
