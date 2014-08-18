
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Union;

@Union
@Library("glib-2.0")
public class GMutex
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMutex() {
        super();
    }

    public GMutex(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer field_p() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GMutex field_p(Pointer field_p) {
        this.io.setPointerField(this, 0, field_p);
        return this;
    }

    @Field(1)
    private long field_i() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    private GMutex field_i(long field_i) {
        this.io.setLongField(this, 1, field_i);
        return this;
    }

    protected native void g_mutex_clear(
        @Ptr
        long mutex);

    public void clear() {
        this.g_mutex_clear(Pointer.pointerTo(this, GMutex.class).getPeer());
    }

    protected native void g_mutex_init(
        @Ptr
        long mutex);

    public void init() {
        this.g_mutex_init(Pointer.pointerTo(this, GMutex.class).getPeer());
    }

    protected native void g_mutex_lock(
        @Ptr
        long mutex);

    public void lock() {
        this.g_mutex_lock(Pointer.pointerTo(this, GMutex.class).getPeer());
    }

    protected native boolean g_mutex_trylock(
        @Ptr
        long mutex);

    public boolean trylock() {
        return this.g_mutex_trylock(Pointer.pointerTo(this, GMutex.class).getPeer());
    }

    protected native void g_mutex_unlock(
        @Ptr
        long mutex);

    public void unlock() {
        this.g_mutex_unlock(Pointer.pointerTo(this, GMutex.class).getPeer());
    }

}
