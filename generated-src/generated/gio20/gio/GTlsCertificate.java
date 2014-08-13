
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTlsCertificate
    extends GObject
{


    public GTlsCertificate() {
        super();
    }

    public GTlsCertificate(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_tls_certificate_list_new_from_file(
        @Ptr
        long file);

    public Pointer<GList> list_new_from_file(Pointer file) {
        return Pointer.pointerToAddress(this.g_tls_certificate_list_new_from_file(Pointer.getPeer(file)), Pointer.class);
    }

    @Ptr
    protected native long g_tls_certificate_get_issuer(
        @Ptr
        long cert);

    public Pointer get_issuer() {
        return Pointer.pointerToAddress(this.g_tls_certificate_get_issuer(Pointer.pointerTo(this, GTlsCertificate.class)));
    }

    protected native boolean g_tls_certificate_is_same(
        @Ptr
        long cert_one,
        @Ptr
        long cert_two);

    public boolean is_same(Pointer cert_two) {
        return this.g_tls_certificate_is_same(Pointer.pointerTo(this, GTlsCertificate.class), Pointer.getPeer(cert_two));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsCertificate field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsCertificate field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native Object g_tls_certificate_verify(
        @Ptr
        long cert,
        @Ptr
        long identity,
        @Ptr
        long trusted_ca);

    public Object verify(Pointer<Object> identity, Pointer<GTlsCertificate> trusted_ca) {
        return this.g_tls_certificate_verify(Pointer.pointerTo(this, GTlsCertificate.class), Pointer.getPeer(identity), Pointer.getPeer(trusted_ca));
    }

}
