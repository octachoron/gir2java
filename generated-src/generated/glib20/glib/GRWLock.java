
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GRWLock
    extends StructObject
{


    public GRWLock() {
        super();
    }

    public GRWLock(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_p() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GRWLock field_p(Pointer field_p) {
        this.io.setNativeObjectField(this, 0, field_p);
        return this;
    }

    @Field(1)
    public long field_i() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GRWLock field_i(long field_i) {
        this.io.setPointerField(this, 1, field_i);
        return this;
    }

    protected native void g_rw_lock_clear(
        @Ptr
        long rw_lock);

    public void clear() {
        this.g_rw_lock_clear(Pointer.pointerTo(this, GRWLock.class));
    }

    protected native void g_rw_lock_init(
        @Ptr
        long rw_lock);

    public void init() {
        this.g_rw_lock_init(Pointer.pointerTo(this, GRWLock.class));
    }

    protected native void g_rw_lock_reader_lock(
        @Ptr
        long rw_lock);

    public void reader_lock() {
        this.g_rw_lock_reader_lock(Pointer.pointerTo(this, GRWLock.class));
    }

    protected native boolean g_rw_lock_reader_trylock(
        @Ptr
        long rw_lock);

    public boolean reader_trylock() {
        return this.g_rw_lock_reader_trylock(Pointer.pointerTo(this, GRWLock.class));
    }

    protected native void g_rw_lock_reader_unlock(
        @Ptr
        long rw_lock);

    public void reader_unlock() {
        this.g_rw_lock_reader_unlock(Pointer.pointerTo(this, GRWLock.class));
    }

    protected native void g_rw_lock_writer_lock(
        @Ptr
        long rw_lock);

    public void writer_lock() {
        this.g_rw_lock_writer_lock(Pointer.pointerTo(this, GRWLock.class));
    }

    protected native boolean g_rw_lock_writer_trylock(
        @Ptr
        long rw_lock);

    public boolean writer_trylock() {
        return this.g_rw_lock_writer_trylock(Pointer.pointerTo(this, GRWLock.class));
    }

    protected native void g_rw_lock_writer_unlock(
        @Ptr
        long rw_lock);

    public void writer_unlock() {
        this.g_rw_lock_writer_unlock(Pointer.pointerTo(this, GRWLock.class));
    }

}