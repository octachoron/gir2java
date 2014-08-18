
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GCond
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GCond() {
        super();
    }

    public GCond(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer field_p() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GCond field_p(Pointer field_p) {
        this.io.setPointerField(this, 0, field_p);
        return this;
    }

    @Field(1)
    private long field_i() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GCond field_i(long field_i) {
        this.io.setLongField(this, 1, field_i);
        return this;
    }

    protected native void g_cond_broadcast(
        @Ptr
        long cond);

    public void broadcast() {
        this.g_cond_broadcast(Pointer.pointerTo(this, GCond.class).getPeer());
    }

    protected native void g_cond_clear(
        @Ptr
        long cond);

    public void clear() {
        this.g_cond_clear(Pointer.pointerTo(this, GCond.class).getPeer());
    }

    protected native void g_cond_init(
        @Ptr
        long cond);

    public void init() {
        this.g_cond_init(Pointer.pointerTo(this, GCond.class).getPeer());
    }

    protected native void g_cond_signal(
        @Ptr
        long cond);

    public void signal() {
        this.g_cond_signal(Pointer.pointerTo(this, GCond.class).getPeer());
    }

    protected native void g_cond_wait(
        @Ptr
        long cond,
        @Ptr
        long mutex);

    public void gcond_wait(Pointer mutex) {
        this.g_cond_wait(Pointer.pointerTo(this, GCond.class).getPeer(), Pointer.getPeer(mutex));
    }

    protected native boolean g_cond_wait_until(
        @Ptr
        long cond,
        @Ptr
        long mutex, long end_time);

    public boolean wait_until(Pointer mutex, long end_time) {
        return this.g_cond_wait_until(Pointer.pointerTo(this, GCond.class).getPeer(), Pointer.getPeer(mutex), end_time);
    }

}
