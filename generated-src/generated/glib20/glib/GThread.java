
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GThread
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GThread() {
        super();
    }

    public GThread(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_thread_join(
        @Ptr
        long thread);

    public Pointer join() {
        return Pointer.pointerToAddress(this.g_thread_join(Pointer.pointerTo(this, GThread.class).getPeer()));
    }

    @Ptr
    protected native long g_thread_ref(
        @Ptr
        long thread);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_thread_ref(Pointer.pointerTo(this, GThread.class).getPeer()));
    }

    protected native void g_thread_unref(
        @Ptr
        long thread);

    public void unref() {
        this.g_thread_unref(Pointer.pointerTo(this, GThread.class).getPeer());
    }

    public static native long g_thread_error_quark();

    protected static native void g_thread_exit(
        @Ptr
        long retval);

    public static void exit(Pointer retval) {
        GThread.g_thread_exit(Pointer.getPeer(retval));
    }

    @Ptr
    protected static native long g_thread_self();

    public static Pointer self() {
        return Pointer.pointerToAddress(GThread.g_thread_self());
    }

    public static native void g_thread_yield();

}
