
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GRecMutex
    extends StructObject
{


    public GRecMutex() {
        super();
    }

    public GRecMutex(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_p() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GRecMutex field_p(Pointer field_p) {
        this.io.setNativeObjectField(this, 0, field_p);
        return this;
    }

    @Field(1)
    public long field_i() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GRecMutex field_i(long field_i) {
        this.io.setPointerField(this, 1, field_i);
        return this;
    }

    protected native void g_rec_mutex_clear(
        @Ptr
        long rec_mutex);

    public void clear() {
        this.g_rec_mutex_clear(Pointer.pointerTo(this, GRecMutex.class));
    }

    protected native void g_rec_mutex_init(
        @Ptr
        long rec_mutex);

    public void init() {
        this.g_rec_mutex_init(Pointer.pointerTo(this, GRecMutex.class));
    }

    protected native void g_rec_mutex_lock(
        @Ptr
        long rec_mutex);

    public void lock() {
        this.g_rec_mutex_lock(Pointer.pointerTo(this, GRecMutex.class));
    }

    protected native boolean g_rec_mutex_trylock(
        @Ptr
        long rec_mutex);

    public boolean trylock() {
        return this.g_rec_mutex_trylock(Pointer.pointerTo(this, GRecMutex.class));
    }

    protected native void g_rec_mutex_unlock(
        @Ptr
        long rec_mutex);

    public void unlock() {
        this.g_rec_mutex_unlock(Pointer.pointerTo(this, GRecMutex.class));
    }

}
