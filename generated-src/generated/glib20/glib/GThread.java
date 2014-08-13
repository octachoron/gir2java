
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GThread
    extends StructObject
{


    public GThread() {
        super();
    }

    public GThread(Pointer pointer) {
        super(pointer);
    }

    protected native Pointer g_thread_join(
        @Ptr
        long thread);

    public Pointer join() {
        return this.g_thread_join(Pointer.pointerTo(this, GThread.class));
    }

    @Ptr
    protected native long g_thread_ref(
        @Ptr
        long thread);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_thread_ref(Pointer.pointerTo(this, GThread.class)));
    }

    protected native void g_thread_unref(
        @Ptr
        long thread);

    public void unref() {
        this.g_thread_unref(Pointer.pointerTo(this, GThread.class));
    }

    public native Object g_thread_error_quark();

    public native void g_thread_exit(Pointer retval);

    @Ptr
    protected native long g_thread_self();

    public Pointer self() {
        return Pointer.pointerToAddress(this.g_thread_self());
    }

    public native void g_thread_yield();

}
