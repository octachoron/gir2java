
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
public class GTlsDatabase
    extends GObject
{


    static {
        BridJ.register();
    }

    public GTlsDatabase() {
        super();
    }

    public GTlsDatabase(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_tls_database_create_certificate_handle(
        @Ptr
        long self,
        @Ptr
        long certificate);

    public Pointer create_certificate_handle(Pointer<GTlsCertificate> certificate) {
        return Pointer.pointerToAddress(this.g_tls_database_create_certificate_handle(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(certificate)));
    }

    @Ptr
    protected native long g_tls_database_lookup_certificate_for_handle_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public Pointer<GTlsCertificate> lookup_certificate_for_handle_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_for_handle_finish(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(result)), GTlsCertificate.class);
    }

    @Ptr
    protected native long g_tls_database_lookup_certificate_issuer_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public Pointer<GTlsCertificate> lookup_certificate_issuer_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_issuer_finish(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(result)), GTlsCertificate.class);
    }

    @Ptr
    protected native long g_tls_database_lookup_certificates_issued_by_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public Pointer<GList> lookup_certificates_issued_by_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificates_issued_by_finish(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(result)), GList.class);
    }

    protected native IntValuedEnum<GTlsCertificateFlags> g_tls_database_verify_chain_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public IntValuedEnum<GTlsCertificateFlags> verify_chain_finish(Pointer<Object> result) {
        return this.g_tls_database_verify_chain_finish(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(result));
    }

    @Field(0)
    public GObject gtlsdatabase_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsDatabase gtlsdatabase_field_parent_instance(GObject gtlsdatabase_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gtlsdatabase_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gtlsdatabase_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsDatabase gtlsdatabase_field_priv(Pointer gtlsdatabase_field_priv) {
        this.io.setPointerField(this, 1, gtlsdatabase_field_priv);
        return this;
    }

    @Ptr
    protected native long g_tls_database_lookup_certificate_issuer(
        @Ptr
        long self,
        @Ptr
        long certificate,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable);

    public Pointer<GTlsCertificate> lookup_certificate_issuer(Pointer<GTlsCertificate> certificate, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_issuer(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(certificate), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable)), GTlsCertificate.class);
    }

    protected native void g_tls_database_verify_chain_async(
        @Ptr
        long self,
        @Ptr
        long chain,
        @Ptr
        long purpose,
        @Ptr
        long identity,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseVerifyFlags> flags,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void verify_chain_async(Pointer<GTlsCertificate> chain, Pointer purpose, Pointer<Object> identity, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseVerifyFlags> flags, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_tls_database_verify_chain_async(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(chain), Pointer.getPeer(purpose), Pointer.getPeer(identity), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_tls_database_lookup_certificate_for_handle(
        @Ptr
        long self,
        @Ptr
        long handle,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable);

    public Pointer<GTlsCertificate> lookup_certificate_for_handle(Pointer handle, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_for_handle(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(handle), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable)), GTlsCertificate.class);
    }

    @Ptr
    protected native long g_tls_database_lookup_certificates_issued_by(
        @Ptr
        long self,
        @Ptr
        long issuer_raw_dn,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable);

    public Pointer<GList> lookup_certificates_issued_by(Pointer<Short> issuer_raw_dn, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificates_issued_by(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(issuer_raw_dn), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable)), GList.class);
    }

    protected native IntValuedEnum<GTlsCertificateFlags> g_tls_database_verify_chain(
        @Ptr
        long self,
        @Ptr
        long chain,
        @Ptr
        long purpose,
        @Ptr
        long identity,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseVerifyFlags> flags,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsCertificateFlags> verify_chain(Pointer<GTlsCertificate> chain, Pointer purpose, Pointer<Object> identity, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseVerifyFlags> flags, Pointer<GCancellable> cancellable) {
        return this.g_tls_database_verify_chain(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(chain), Pointer.getPeer(purpose), Pointer.getPeer(identity), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable));
    }

    protected native void g_tls_database_lookup_certificate_for_handle_async(
        @Ptr
        long self,
        @Ptr
        long handle,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void lookup_certificate_for_handle_async(Pointer handle, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_tls_database_lookup_certificate_for_handle_async(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(handle), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native void g_tls_database_lookup_certificates_issued_by_async(
        @Ptr
        long self,
        @Ptr
        long issuer_raw_dn,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void lookup_certificates_issued_by_async(Pointer<Short> issuer_raw_dn, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_tls_database_lookup_certificates_issued_by_async(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(issuer_raw_dn), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native void g_tls_database_lookup_certificate_issuer_async(
        @Ptr
        long self,
        @Ptr
        long certificate,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void lookup_certificate_issuer_async(Pointer<GTlsCertificate> certificate, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_tls_database_lookup_certificate_issuer_async(Pointer.pointerTo(this, GTlsDatabase.class).getPeer(), Pointer.getPeer(certificate), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

}
