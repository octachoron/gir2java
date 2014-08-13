
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTlsDatabase
    extends GObject
{


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
        return Pointer.pointerToAddress(this.g_tls_database_create_certificate_handle(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(certificate)));
    }

    @Ptr
    protected native long g_tls_database_lookup_certificate_for_handle_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public Pointer<GTlsCertificate> lookup_certificate_for_handle_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_for_handle_finish(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(result)), Pointer.class);
    }

    @Ptr
    protected native long g_tls_database_lookup_certificate_issuer_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public Pointer<GTlsCertificate> lookup_certificate_issuer_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_issuer_finish(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(result)), Pointer.class);
    }

    @Ptr
    protected native long g_tls_database_lookup_certificates_issued_by_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public Pointer<GList> lookup_certificates_issued_by_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificates_issued_by_finish(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(result)), Pointer.class);
    }

    protected native Object g_tls_database_verify_chain_finish(
        @Ptr
        long self,
        @Ptr
        long result);

    public Object verify_chain_finish(Pointer<Object> result) {
        return this.g_tls_database_verify_chain_finish(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(result));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsDatabase field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsDatabase field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
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
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_for_handle(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(handle), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native void g_tls_database_lookup_certificate_issuer_async(
        @Ptr
        long self,
        @Ptr
        long certificate,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void lookup_certificate_issuer_async(Pointer<GTlsCertificate> certificate, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_tls_database_lookup_certificate_issuer_async(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(certificate), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native Object g_tls_database_verify_chain(
        @Ptr
        long self,
        @Ptr
        long chain,
        @Ptr
        long purpose,
        @Ptr
        long identity,
        @Ptr
        long interaction, Object flags,
        @Ptr
        long cancellable);

    public Object verify_chain(Pointer<GTlsCertificate> chain, Pointer purpose, Pointer<Object> identity, Pointer<GTlsInteraction> interaction, Object flags, Pointer<GCancellable> cancellable) {
        return this.g_tls_database_verify_chain(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(chain), Pointer.getPeer(purpose), Pointer.getPeer(identity), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable));
    }

    protected native void g_tls_database_lookup_certificate_for_handle_async(
        @Ptr
        long self,
        @Ptr
        long handle,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void lookup_certificate_for_handle_async(Pointer handle, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_tls_database_lookup_certificate_for_handle_async(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(handle), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), callback, user_data);
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

    public Pointer<GList> lookup_certificates_issued_by(short issuer_raw_dn, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificates_issued_by(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(issuer_raw_dn), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable)), Pointer.class);
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
        long interaction, Object flags,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void verify_chain_async(Pointer<GTlsCertificate> chain, Pointer purpose, Pointer<Object> identity, Pointer<GTlsInteraction> interaction, Object flags, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_tls_database_verify_chain_async(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(chain), Pointer.getPeer(purpose), Pointer.getPeer(identity), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native void g_tls_database_lookup_certificates_issued_by_async(
        @Ptr
        long self,
        @Ptr
        long issuer_raw_dn,
        @Ptr
        long interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void lookup_certificates_issued_by_async(short issuer_raw_dn, Pointer<GTlsInteraction> interaction, IntValuedEnum<GTlsDatabaseLookupFlags> flags, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_tls_database_lookup_certificates_issued_by_async(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(issuer_raw_dn), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable), callback, user_data);
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
        return Pointer.pointerToAddress(this.g_tls_database_lookup_certificate_issuer(Pointer.pointerTo(this, GTlsDatabase.class), Pointer.getPeer(certificate), Pointer.getPeer(interaction), flags, Pointer.getPeer(cancellable)), Pointer.class);
    }

}
