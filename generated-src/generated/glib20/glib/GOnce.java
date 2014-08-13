
package generated.glib20.glib;

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

    public native boolean g_once_init_enter(Pointer location);

    public native void g_once_init_leave(Pointer location, long result);

    protected native Pointer g_once_impl(
        @Ptr
        long once, Object func, Pointer arg);

    public Pointer impl(Object func, Pointer arg) {
        return this.g_once_impl(Pointer.pointerTo(this, GOnce.class), func, arg);
    }

    @Field(1)
    public Pointer field_retval() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GOnce field_retval(Pointer field_retval) {
        this.io.setNativeObjectField(this, 1, field_retval);
        return this;
    }

}
