
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTlsInteraction
    extends GObject
{


    static {
        BridJ.register();
    }

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
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void ask_password_async(Pointer password, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_tls_interaction_ask_password_async(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(password), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native void g_tls_interaction_request_certificate_async(
        @Ptr
        long interaction,
        @Ptr
        long connection, IntValuedEnum<GTlsCertificateRequestFlags> flags,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void request_certificate_async(Pointer<GTlsConnection> connection, IntValuedEnum<GTlsCertificateRequestFlags> flags, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_tls_interaction_request_certificate_async(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(connection), flags, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Field(0)
    private GObject gtlsinteraction_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GTlsInteraction gtlsinteraction_field_parent_instance(GObject gtlsinteraction_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gtlsinteraction_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gtlsinteraction_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTlsInteraction gtlsinteraction_field_priv(Pointer gtlsinteraction_field_priv) {
        this.io.setPointerField(this, 1, gtlsinteraction_field_priv);
        return this;
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_invoke_request_certificate(
        @Ptr
        long interaction,
        @Ptr
        long connection, IntValuedEnum<GTlsCertificateRequestFlags> flags,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> invoke_request_certificate(Pointer<GTlsConnection> connection, IntValuedEnum<GTlsCertificateRequestFlags> flags, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_invoke_request_certificate(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(connection), flags, Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_ask_password_finish(
        @Ptr
        long interaction,
        @Ptr
        long result);

    public IntValuedEnum<GTlsInteractionResult> ask_password_finish(Pointer<Object> result) {
        return this.g_tls_interaction_ask_password_finish(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(result));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_request_certificate(
        @Ptr
        long interaction,
        @Ptr
        long connection, IntValuedEnum<GTlsCertificateRequestFlags> flags,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> request_certificate(Pointer<GTlsConnection> connection, IntValuedEnum<GTlsCertificateRequestFlags> flags, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_request_certificate(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(connection), flags, Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_request_certificate_finish(
        @Ptr
        long interaction,
        @Ptr
        long result);

    public IntValuedEnum<GTlsInteractionResult> request_certificate_finish(Pointer<Object> result) {
        return this.g_tls_interaction_request_certificate_finish(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(result));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_invoke_ask_password(
        @Ptr
        long interaction,
        @Ptr
        long password,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> invoke_ask_password(Pointer<GTlsPassword> password, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_invoke_ask_password(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(password), Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GTlsInteractionResult> g_tls_interaction_ask_password(
        @Ptr
        long interaction,
        @Ptr
        long password,
        @Ptr
        long cancellable);

    public IntValuedEnum<GTlsInteractionResult> ask_password(Pointer<GTlsPassword> password, Pointer<GCancellable> cancellable) {
        return this.g_tls_interaction_ask_password(Pointer.pointerTo(this, GTlsInteraction.class).getPeer(), Pointer.getPeer(password), Pointer.getPeer(cancellable));
    }

}
