
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
    private Pointer gprivate_field_p() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GPrivate gprivate_field_p(Pointer gprivate_field_p) {
        this.io.setPointerField(this, 0, gprivate_field_p);
        return this;
    }

    @Field(1)
    private Pointer gprivate_field_notify() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GPrivate gprivate_field_notify(Pointer gprivate_field_notify) {
        this.io.setPointerField(this, 1, gprivate_field_notify);
        return this;
    }

    @Field(2)
    private Pointer gprivate_field_future() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GPrivate gprivate_field_future(Pointer gprivate_field_future) {
        this.io.setPointerField(this, 2, gprivate_field_future);
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
