
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GRecMutex
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GRecMutex() {
        super();
    }

    public GRecMutex(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer grecmutex_field_p() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GRecMutex grecmutex_field_p(Pointer grecmutex_field_p) {
        this.io.setPointerField(this, 0, grecmutex_field_p);
        return this;
    }

    @Field(1)
    private long grecmutex_field_i() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GRecMutex grecmutex_field_i(long grecmutex_field_i) {
        this.io.setLongField(this, 1, grecmutex_field_i);
        return this;
    }

    protected native void g_rec_mutex_clear(
        @Ptr
        long rec_mutex);

    public void clear() {
        this.g_rec_mutex_clear(Pointer.pointerTo(this, GRecMutex.class).getPeer());
    }

    protected native void g_rec_mutex_init(
        @Ptr
        long rec_mutex);

    public void init() {
        this.g_rec_mutex_init(Pointer.pointerTo(this, GRecMutex.class).getPeer());
    }

    protected native void g_rec_mutex_lock(
        @Ptr
        long rec_mutex);

    public void lock() {
        this.g_rec_mutex_lock(Pointer.pointerTo(this, GRecMutex.class).getPeer());
    }

    protected native boolean g_rec_mutex_trylock(
        @Ptr
        long rec_mutex);

    public boolean trylock() {
        return this.g_rec_mutex_trylock(Pointer.pointerTo(this, GRecMutex.class).getPeer());
    }

    protected native void g_rec_mutex_unlock(
        @Ptr
        long rec_mutex);

    public void unlock() {
        this.g_rec_mutex_unlock(Pointer.pointerTo(this, GRecMutex.class).getPeer());
    }

}
