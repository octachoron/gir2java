
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GOnce
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GOnce() {
        super();
    }

    public GOnce(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GOnceStatus> field_status() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GOnce field_status(IntValuedEnum<GOnceStatus> field_status) {
        this.io.setEnumField(this, 0, field_status);
        return this;
    }

    protected static native void g_once_init_leave(
        @Ptr
        long location, long result);

    public static void init_leave(Pointer location, long result) {
        GOnce.g_once_init_leave(Pointer.getPeer(location), result);
    }

    @Ptr
    protected native long g_once_impl(
        @Ptr
        long once,
        @Ptr
        long func,
        @Ptr
        long arg);

    public Pointer impl(Pointer func, Pointer arg) {
        return Pointer.pointerToAddress(this.g_once_impl(Pointer.pointerTo(this, GOnce.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(arg)));
    }

    protected static native boolean g_once_init_enter(
        @Ptr
        long location);

    public static boolean init_enter(Pointer location) {
        return GOnce.g_once_init_enter(Pointer.getPeer(location));
    }

    @Field(1)
    public Pointer field_retval() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GOnce field_retval(Pointer field_retval) {
        this.io.setPointerField(this, 1, field_retval);
        return this;
    }

}
