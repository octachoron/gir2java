
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GPrivate
    extends StructObject
{


    public GPrivate() {
        super();
    }

    public GPrivate(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_p() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GPrivate field_p(Pointer field_p) {
        this.io.setNativeObjectField(this, 0, field_p);
        return this;
    }

    @Field(1)
    public Object field_notify() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GPrivate field_notify(Object field_notify) {
        this.io.setNativeObjectField(this, 1, field_notify);
        return this;
    }

    @Field(2)
    public Pointer field_future() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GPrivate field_future(Pointer field_future) {
        this.io.setPointerField(this, 2, field_future);
        return this;
    }

    protected native Pointer g_private_get(
        @Ptr
        long key);

    public Pointer get() {
        return this.g_private_get(Pointer.pointerTo(this, GPrivate.class));
    }

    protected native void g_private_replace(
        @Ptr
        long key, Pointer value);

    public void replace(Pointer value) {
        this.g_private_replace(Pointer.pointerTo(this, GPrivate.class), value);
    }

    protected native void g_private_set(
        @Ptr
        long key, Pointer value);

    public void set(Pointer value) {
        this.g_private_set(Pointer.pointerTo(this, GPrivate.class), value);
    }

}
