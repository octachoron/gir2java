
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GPrivate
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GPrivate() {
        super();
    }

    public GPrivate(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer field_p() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GPrivate field_p(Pointer field_p) {
        this.io.setPointerField(this, 0, field_p);
        return this;
    }

    @Field(1)
    private Pointer field_notify() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GPrivate field_notify(Pointer field_notify) {
        this.io.setPointerField(this, 1, field_notify);
        return this;
    }

    @Field(2)
    private Pointer field_future() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GPrivate field_future(Pointer field_future) {
        this.io.setPointerField(this, 2, field_future);
        return this;
    }

    @Ptr
    protected native long g_private_get(
        @Ptr
        long key);

    public Pointer get() {
        return Pointer.pointerToAddress(this.g_private_get(Pointer.pointerTo(this, GPrivate.class).getPeer()));
    }

    protected native void g_private_replace(
        @Ptr
        long key,
        @Ptr
        long value);

    public void replace(Pointer value) {
        this.g_private_replace(Pointer.pointerTo(this, GPrivate.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_private_set(
        @Ptr
        long key,
        @Ptr
        long value);

    public void set(Pointer value) {
        this.g_private_set(Pointer.pointerTo(this, GPrivate.class).getPeer(), Pointer.getPeer(value));
    }

}
