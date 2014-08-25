
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTlsCertificate
    extends GObject
{


    static {
        BridJ.register();
    }

    public GTlsCertificate() {
        super();
    }

    public GTlsCertificate(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_tls_certificate_new_from_file(
        @Ptr
        long file);

    public static Pointer new_from_file(Pointer file) {
        return Pointer.pointerToAddress(GTlsCertificate.g_tls_certificate_new_from_file(Pointer.getPeer(file)));
    }

    @Ptr
    protected static native long g_tls_certificate_new_from_files(
        @Ptr
        long cert_file,
        @Ptr
        long key_file);

    public static Pointer new_from_files(Pointer cert_file, Pointer key_file) {
        return Pointer.pointerToAddress(GTlsCertificate.g_tls_certificate_new_from_files(Pointer.getPeer(cert_file), Pointer.getPeer(key_file)));
    }

    @Ptr
    protected static native long g_tls_certificate_new_from_pem(
        @Ptr
        long data, long length);

    public static Pointer new_from_pem(Pointer data, long length) {
        return Pointer.pointerToAddress(GTlsCertificate.g_tls_certificate_new_from_pem(Pointer.getPeer(data), length));
    }

    @Ptr
    protected static native long g_tls_certificate_list_new_from_file(
        @Ptr
        long file);

    public static Pointer<GList> list_new_from_file(Pointer file) {
        return Pointer.pointerToAddress(GTlsCertificate.g_tls_certificate_list_new_from_file(Pointer.getPeer(file)), GList.class);
    }

    @Ptr
    protected native long g_tls_certificate_get_issuer(
        @Ptr
        long cert);

    public Pointer get_issuer() {
        return Pointer.pointerToAddress(this.g_tls_certificate_get_issuer(Pointer.pointerTo(this, GTlsCertificate.class).getPeer()));
    }

    protected native boolean g_tls_certificate_is_same(
        @Ptr
        long cert_one,
        @Ptr
        long cert_two);

    public boolean is_same(Pointer cert_two) {
        return this.g_tls_certificate_is_same(Pointer.pointerTo(this, GTlsCertificate.class).getPeer(), Pointer.getPeer(cert_two));
    }

    @Field(0)
    public GObject gtlscertificate_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsCertificate gtlscertificate_field_parent_instance(GObject gtlscertificate_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gtlscertificate_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gtlscertificate_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsCertificate gtlscertificate_field_priv(Pointer gtlscertificate_field_priv) {
        this.io.setPointerField(this, 1, gtlscertificate_field_priv);
        return this;
    }

    protected native IntValuedEnum<GTlsCertificateFlags> g_tls_certificate_verify(
        @Ptr
        long cert,
        @Ptr
        long identity,
        @Ptr
        long trusted_ca);

    public IntValuedEnum<GTlsCertificateFlags> verify(Pointer<Object> identity, Pointer<GTlsCertificate> trusted_ca) {
        return this.g_tls_certificate_verify(Pointer.pointerTo(this, GTlsCertificate.class).getPeer(), Pointer.getPeer(identity), Pointer.getPeer(trusted_ca));
    }

}
