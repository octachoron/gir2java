
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTimer
    extends StructObject
{


    public GTimer() {
        super();
    }

    public GTimer(Pointer pointer) {
        super(pointer);
    }

    protected native void g_timer_continue(
        @Ptr
        long timer);

    public void _continue() {
        this.g_timer_continue(Pointer.pointerTo(this, GTimer.class));
    }

    protected native void g_timer_destroy(
        @Ptr
        long timer);

    public void destroy() {
        this.g_timer_destroy(Pointer.pointerTo(this, GTimer.class));
    }

    protected native double g_timer_elapsed(
        @Ptr
        long timer,
        @Ptr
        long microseconds);

    public double elapsed(Pointer<Long> microseconds) {
        return this.g_timer_elapsed(Pointer.pointerTo(this, GTimer.class), Pointer.getPeer(microseconds));
    }

    protected native void g_timer_reset(
        @Ptr
        long timer);

    public void reset() {
        this.g_timer_reset(Pointer.pointerTo(this, GTimer.class));
    }

    protected native void g_timer_start(
        @Ptr
        long timer);

    public void start() {
        this.g_timer_start(Pointer.pointerTo(this, GTimer.class));
    }

    protected native void g_timer_stop(
        @Ptr
        long timer);

    public void stop() {
        this.g_timer_stop(Pointer.pointerTo(this, GTimer.class));
    }

    @Ptr
    protected native long g_timer_new();

    public Pointer _new() {
        return Pointer.pointerToAddress(this.g_timer_new());
    }

}
