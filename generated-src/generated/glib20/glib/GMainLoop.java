
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GMainLoop
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMainLoop() {
        super();
    }

    public GMainLoop(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_main_loop_new(
        @Ptr
        long context, boolean is_running);

    public static Pointer _new(Pointer<GMainContext> context, boolean is_running) {
        return Pointer.pointerToAddress(GMainLoop.g_main_loop_new(Pointer.getPeer(context), is_running));
    }

    @Ptr
    protected native long g_main_loop_get_context(
        @Ptr
        long loop);

    public Pointer<GMainContext> get_context() {
        return Pointer.pointerToAddress(this.g_main_loop_get_context(Pointer.pointerTo(this, GMainLoop.class).getPeer()), GMainContext.class);
    }

    protected native boolean g_main_loop_is_running(
        @Ptr
        long loop);

    public boolean is_running() {
        return this.g_main_loop_is_running(Pointer.pointerTo(this, GMainLoop.class).getPeer());
    }

    protected native void g_main_loop_quit(
        @Ptr
        long loop);

    public void quit() {
        this.g_main_loop_quit(Pointer.pointerTo(this, GMainLoop.class).getPeer());
    }

    @Ptr
    protected native long g_main_loop_ref(
        @Ptr
        long loop);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_main_loop_ref(Pointer.pointerTo(this, GMainLoop.class).getPeer()));
    }

    protected native void g_main_loop_run(
        @Ptr
        long loop);

    public void run() {
        this.g_main_loop_run(Pointer.pointerTo(this, GMainLoop.class).getPeer());
    }

    protected native void g_main_loop_unref(
        @Ptr
        long loop);

    public void unref() {
        this.g_main_loop_unref(Pointer.pointerTo(this, GMainLoop.class).getPeer());
    }

}
