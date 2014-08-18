
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTlsPassword
    extends GObject
{


    static {
        BridJ.register();
    }

    public GTlsPassword() {
        super();
    }

    public GTlsPassword(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_tls_password_get_description(
        @Ptr
        long password);

    public Pointer get_description() {
        return Pointer.pointerToAddress(this.g_tls_password_get_description(Pointer.pointerTo(this, GTlsPassword.class).getPeer()));
    }

    @Ptr
    protected native long g_tls_password_get_value(
        @Ptr
        long password,
        @Ptr
        long length);

    public Pointer<Short> get_value(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_tls_password_get_value(Pointer.pointerTo(this, GTlsPassword.class).getPeer(), Pointer.getPeer(length)), Short.class);
    }

    @Ptr
    protected native long g_tls_password_get_warning(
        @Ptr
        long password);

    public Pointer get_warning() {
        return Pointer.pointerToAddress(this.g_tls_password_get_warning(Pointer.pointerTo(this, GTlsPassword.class).getPeer()));
    }

    protected native void g_tls_password_set_description(
        @Ptr
        long password,
        @Ptr
        long description);

    public void set_description(Pointer description) {
        this.g_tls_password_set_description(Pointer.pointerTo(this, GTlsPassword.class).getPeer(), Pointer.getPeer(description));
    }

    protected native void g_tls_password_set_value(
        @Ptr
        long password,
        @Ptr
        long value, long length);

    public void set_value(Pointer<Short> value, long length) {
        this.g_tls_password_set_value(Pointer.pointerTo(this, GTlsPassword.class).getPeer(), Pointer.getPeer(value), length);
    }

    protected native void g_tls_password_set_value_full(
        @Ptr
        long password,
        @Ptr
        long value, long length,
        @Ptr
        long destroy);

    public void set_value_full(Pointer<Short> value, long length, Pointer destroy) {
        this.g_tls_password_set_value_full(Pointer.pointerTo(this, GTlsPassword.class).getPeer(), Pointer.getPeer(value), length, Pointer.getPeer(destroy));
    }

    protected native void g_tls_password_set_warning(
        @Ptr
        long password,
        @Ptr
        long warning);

    public void set_warning(Pointer warning) {
        this.g_tls_password_set_warning(Pointer.pointerTo(this, GTlsPassword.class).getPeer(), Pointer.getPeer(warning));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsPassword field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsPassword field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GTlsPasswordFlags> g_tls_password_get_flags(
        @Ptr
        long password);

    public IntValuedEnum<GTlsPasswordFlags> get_flags() {
        return this.g_tls_password_get_flags(Pointer.pointerTo(this, GTlsPassword.class).getPeer());
    }

    @Ptr
    protected static native long g_tls_password_new(IntValuedEnum<GTlsPasswordFlags> flags,
        @Ptr
        long description);

    public static Pointer<GTlsPassword> gtlspassword__new(IntValuedEnum<GTlsPasswordFlags> flags, Pointer description) {
        return Pointer.pointerToAddress(GTlsPassword.g_tls_password_new(flags, Pointer.getPeer(description)), GTlsPassword.class);
    }

    protected native void g_tls_password_set_flags(
        @Ptr
        long password, IntValuedEnum<GTlsPasswordFlags> flags);

    public void set_flags(IntValuedEnum<GTlsPasswordFlags> flags) {
        this.g_tls_password_set_flags(Pointer.pointerTo(this, GTlsPassword.class).getPeer(), flags);
    }

}
