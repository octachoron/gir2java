
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTlsInteraction
    extends GObject
{


    public GTlsInteraction() {
        super();
    }

    public GTlsInteraction(Pointer pointer) {
        super(pointer);
    }

    protected native void g_tls_interaction_ask_password_async(
        @Ptr
        long interaction,
        @Ptr
        long password,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void ask_password_async(Pointer password, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_tls_interaction_ask_password_async(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(password), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native void g_tls_interaction_request_certificate_async(
        @Ptr
        long interaction,
        @Ptr
        long connection, IntValuedEnum<GTlsCertificateRequestFlags> flags,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void request_certificate_async(Pointer<GTlsConnection> connection, IntValuedEnum<GTlsCertificateRequestFlags> flags, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_tls_interaction_request_certificate_async(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(connection), flags, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsInteraction field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsInteraction field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_invoke_ask_password(
        @Ptr
        long interaction,
        @Ptr
        long password,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> invoke_ask_password(Pointer<GTlsPassword> password, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_invoke_ask_password(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(password), Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_invoke_request_certificate(
        @Ptr
        long interaction,
        @Ptr
        long connection, IntValuedEnum<GTlsCertificateRequestFlags> flags,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> invoke_request_certificate(Pointer<GTlsConnection> connection, IntValuedEnum<GTlsCertificateRequestFlags> flags, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_invoke_request_certificate(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(connection), flags, Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_request_certificate_finish(
        @Ptr
        long interaction,
        @Ptr
        long result);

    public IntValuedEnum<GTlsInteractionResult> request_certificate_finish(Pointer<Object> result) {
        return this.g_tls_interaction_request_certificate_finish(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(result));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_ask_password_finish(
        @Ptr
        long interaction,
        @Ptr
        long result);

    public IntValuedEnum<GTlsInteractionResult> ask_password_finish(Pointer<Object> result) {
        return this.g_tls_interaction_ask_password_finish(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(result));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_request_certificate(
        @Ptr
        long interaction,
        @Ptr
        long connection, IntValuedEnum<GTlsCertificateRequestFlags> flags,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> request_certificate(Pointer<GTlsConnection> connection, IntValuedEnum<GTlsCertificateRequestFlags> flags, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_request_certificate(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(connection), flags, Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_ask_password(
        @Ptr
        long interaction,
        @Ptr
        long password,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> ask_password(Pointer<GTlsPassword> password, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_ask_password(Pointer.pointerTo(this, GTlsInteraction.class), Pointer.getPeer(password), Pointer.getPeer(cancellable));
    }

}
