
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GError
    extends StructObject
{


    public GError() {
        super();
    }

    public GError(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_domain() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GError field_domain(Object field_domain) {
        this.io.setNativeObjectField(this, 0, field_domain);
        return this;
    }

    @Field(1)
    public int field_code() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GError field_code(int field_code) {
        this.io.setNativeObjectField(this, 1, field_code);
        return this;
    }

    @Field(2)
    public Pointer field_message() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GError field_message(Pointer field_message) {
        this.io.setPointerField(this, 2, field_message);
        return this;
    }

    @Ptr
    protected native long g_error_copy(
        @Ptr
        long error);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_error_copy(Pointer.pointerTo(this, GError.class)));
    }

    protected native void g_error_free(
        @Ptr
        long error);

    public void free() {
        this.g_error_free(Pointer.pointerTo(this, GError.class));
    }

    protected native boolean g_error_matches(
        @Ptr
        long error, Object domain, int code);

    public boolean matches(Object domain, int code) {
        return this.g_error_matches(Pointer.pointerTo(this, GError.class), domain, code);
    }

}
