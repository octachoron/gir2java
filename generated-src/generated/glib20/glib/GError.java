
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GError
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GError() {
        super();
    }

    public GError(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gerror_field_domain() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GError gerror_field_domain(long gerror_field_domain) {
        this.io.setLongField(this, 0, gerror_field_domain);
        return this;
    }

    @Field(1)
    public int gerror_field_code() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GError gerror_field_code(int gerror_field_code) {
        this.io.setIntField(this, 1, gerror_field_code);
        return this;
    }

    @Field(2)
    public Pointer gerror_field_message() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GError gerror_field_message(Pointer gerror_field_message) {
        this.io.setPointerField(this, 2, gerror_field_message);
        return this;
    }

    @Ptr
    protected static native long g_error_new(long domain, int code,
        @Ptr
        long format, Object... varargs);

    public static Pointer _new(long domain, int code, Pointer format, Object... varargs) {
        return Pointer.pointerToAddress(GError.g_error_new(domain, code, Pointer.getPeer(format), varargs));
    }

    @Ptr
    protected static native long g_error_new_literal(long domain, int code,
        @Ptr
        long message);

    public static Pointer new_literal(long domain, int code, Pointer message) {
        return Pointer.pointerToAddress(GError.g_error_new_literal(domain, code, Pointer.getPeer(message)));
    }

    @Ptr
    protected native long g_error_copy(
        @Ptr
        long error);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_error_copy(Pointer.pointerTo(this, GError.class).getPeer()));
    }

    protected native void g_error_free(
        @Ptr
        long error);

    public void free() {
        this.g_error_free(Pointer.pointerTo(this, GError.class).getPeer());
    }

    protected native boolean g_error_matches(
        @Ptr
        long error, long domain, int code);

    public boolean matches(long domain, int code) {
        return this.g_error_matches(Pointer.pointerTo(this, GError.class).getPeer(), domain, code);
    }

}
