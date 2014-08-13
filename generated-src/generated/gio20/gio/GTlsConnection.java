
package generated.gio20.gio;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTlsConnection
    extends GIOStream
{


    public GTlsConnection() {
        super();
    }

    public GTlsConnection(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_tls_connection_emit_accept_certificate(
        @Ptr
        long conn,
        @Ptr
        long peer_cert, Object errors);

    public boolean emit_accept_certificate(Pointer<GTlsCertificate> peer_cert, Object errors) {
        return this.g_tls_connection_emit_accept_certificate(Pointer.pointerTo(this, GTlsConnection.class), Pointer.getPeer(peer_cert), errors);
    }

    @Ptr
    protected native long g_tls_connection_get_certificate(
        @Ptr
        long conn);

    public Pointer<GTlsCertificate> get_certificate() {
        return Pointer.pointerToAddress(this.g_tls_connection_get_certificate(Pointer.pointerTo(this, GTlsConnection.class)), Pointer.class);
    }

    @Ptr
    protected native long g_tls_connection_get_database(
        @Ptr
        long conn);

    public Pointer get_database() {
        return Pointer.pointerToAddress(this.g_tls_connection_get_database(Pointer.pointerTo(this, GTlsConnection.class)));
    }

    @Ptr
    protected native long g_tls_connection_get_interaction(
        @Ptr
        long conn);

    public Pointer get_interaction() {
        return Pointer.pointerToAddress(this.g_tls_connection_get_interaction(Pointer.pointerTo(this, GTlsConnection.class)));
    }

    @Ptr
    protected native long g_tls_connection_get_peer_certificate(
        @Ptr
        long conn);

    public Pointer<GTlsCertificate> get_peer_certificate() {
        return Pointer.pointerToAddress(this.g_tls_connection_get_peer_certificate(Pointer.pointerTo(this, GTlsConnection.class)), Pointer.class);
    }

    protected native Object g_tls_connection_get_peer_certificate_errors(
        @Ptr
        long conn);

    public Object get_peer_certificate_errors() {
        return this.g_tls_connection_get_peer_certificate_errors(Pointer.pointerTo(this, GTlsConnection.class));
    }

    protected native boolean g_tls_connection_get_require_close_notify(
        @Ptr
        long conn);

    public boolean get_require_close_notify() {
        return this.g_tls_connection_get_require_close_notify(Pointer.pointerTo(this, GTlsConnection.class));
    }

    protected native boolean g_tls_connection_get_use_system_certdb(
        @Ptr
        long conn);

    public boolean get_use_system_certdb() {
        return this.g_tls_connection_get_use_system_certdb(Pointer.pointerTo(this, GTlsConnection.class));
    }

    protected native boolean g_tls_connection_handshake(
        @Ptr
        long conn,
        @Ptr
        long cancellable);

    public boolean handshake(Pointer<GCancellable> cancellable) {
        return this.g_tls_connection_handshake(Pointer.pointerTo(this, GTlsConnection.class), Pointer.getPeer(cancellable));
    }

    protected native void g_tls_connection_handshake_async(
        @Ptr
        long conn, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void handshake_async(int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_tls_connection_handshake_async(Pointer.pointerTo(this, GTlsConnection.class), io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_tls_connection_handshake_finish(
        @Ptr
        long conn,
        @Ptr
        long result);

    public boolean handshake_finish(Pointer<Object> result) {
        return this.g_tls_connection_handshake_finish(Pointer.pointerTo(this, GTlsConnection.class), Pointer.getPeer(result));
    }

    protected native void g_tls_connection_set_certificate(
        @Ptr
        long conn,
        @Ptr
        long certificate);

    public void set_certificate(Pointer<GTlsCertificate> certificate) {
        this.g_tls_connection_set_certificate(Pointer.pointerTo(this, GTlsConnection.class), Pointer.getPeer(certificate));
    }

    protected native void g_tls_connection_set_database(
        @Ptr
        long conn,
        @Ptr
        long database);

    public void set_database(Pointer database) {
        this.g_tls_connection_set_database(Pointer.pointerTo(this, GTlsConnection.class), Pointer.getPeer(database));
    }

    protected native void g_tls_connection_set_interaction(
        @Ptr
        long conn,
        @Ptr
        long interaction);

    public void set_interaction(Pointer interaction) {
        this.g_tls_connection_set_interaction(Pointer.pointerTo(this, GTlsConnection.class), Pointer.getPeer(interaction));
    }

    protected native void g_tls_connection_set_require_close_notify(
        @Ptr
        long conn, boolean require_close_notify);

    public void set_require_close_notify(boolean require_close_notify) {
        this.g_tls_connection_set_require_close_notify(Pointer.pointerTo(this, GTlsConnection.class), require_close_notify);
    }

    protected native void g_tls_connection_set_use_system_certdb(
        @Ptr
        long conn, boolean use_system_certdb);

    public void set_use_system_certdb(boolean use_system_certdb) {
        this.g_tls_connection_set_use_system_certdb(Pointer.pointerTo(this, GTlsConnection.class), use_system_certdb);
    }

    @Field(0)
    public GIOStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsConnection field_parent_instance(GIOStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsConnection field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GTlsRehandshakeMode> g_tls_connection_get_rehandshake_mode(
        @Ptr
        long conn);

    public IntValuedEnum<GTlsRehandshakeMode> get_rehandshake_mode() {
        return this.g_tls_connection_get_rehandshake_mode(Pointer.pointerTo(this, GTlsConnection.class));
    }

    protected native void g_tls_connection_set_rehandshake_mode(
        @Ptr
        long conn, IntValuedEnum<GTlsRehandshakeMode> mode);

    public void set_rehandshake_mode(IntValuedEnum<GTlsRehandshakeMode> mode) {
        this.g_tls_connection_set_rehandshake_mode(Pointer.pointerTo(this, GTlsConnection.class), mode);
    }

}
