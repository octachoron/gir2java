
package generated.gstreamerrtsp10.gstrtsp;

import generated.gio20.gio.GCancellable;
import generated.gio20.gio.GSocket;
import generated.gio20.gio.GTlsConnection;
import generated.glib20.glib.GTimeVal;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPConnection
    extends StructObject
{


    public GstRTSPConnection() {
        super();
    }

    public GstRTSPConnection(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_rtsp_connection_clear_auth_params(
        @Ptr
        long conn);

    public void clear_auth_params() {
        this.gst_rtsp_connection_clear_auth_params(Pointer.pointerTo(this, GstRTSPConnection.class));
    }

    @Ptr
    protected native long gst_rtsp_connection_get_ip(
        @Ptr
        long conn);

    public Pointer get_ip() {
        return Pointer.pointerToAddress(this.gst_rtsp_connection_get_ip(Pointer.pointerTo(this, GstRTSPConnection.class)));
    }

    @Ptr
    protected native long gst_rtsp_connection_get_read_socket(
        @Ptr
        long conn);

    public Pointer<GSocket> get_read_socket() {
        return Pointer.pointerToAddress(this.gst_rtsp_connection_get_read_socket(Pointer.pointerTo(this, GstRTSPConnection.class)), Pointer.class);
    }

    protected native boolean gst_rtsp_connection_get_remember_session_id(
        @Ptr
        long conn);

    public boolean get_remember_session_id() {
        return this.gst_rtsp_connection_get_remember_session_id(Pointer.pointerTo(this, GstRTSPConnection.class));
    }

    @Ptr
    protected native long gst_rtsp_connection_get_tls(
        @Ptr
        long conn);

    public Pointer<GTlsConnection> get_tls() {
        return Pointer.pointerToAddress(this.gst_rtsp_connection_get_tls(Pointer.pointerTo(this, GstRTSPConnection.class)), Pointer.class);
    }

    protected native Object gst_rtsp_connection_get_tls_validation_flags(
        @Ptr
        long conn);

    public Object get_tls_validation_flags() {
        return this.gst_rtsp_connection_get_tls_validation_flags(Pointer.pointerTo(this, GstRTSPConnection.class));
    }

    @Ptr
    protected native long gst_rtsp_connection_get_tunnelid(
        @Ptr
        long conn);

    public Pointer get_tunnelid() {
        return Pointer.pointerToAddress(this.gst_rtsp_connection_get_tunnelid(Pointer.pointerTo(this, GstRTSPConnection.class)));
    }

    @Ptr
    protected native long gst_rtsp_connection_get_url(
        @Ptr
        long conn);

    public Pointer get_url() {
        return Pointer.pointerToAddress(this.gst_rtsp_connection_get_url(Pointer.pointerTo(this, GstRTSPConnection.class)));
    }

    @Ptr
    protected native long gst_rtsp_connection_get_write_socket(
        @Ptr
        long conn);

    public Pointer<GSocket> get_write_socket() {
        return Pointer.pointerToAddress(this.gst_rtsp_connection_get_write_socket(Pointer.pointerTo(this, GstRTSPConnection.class)), Pointer.class);
    }

    protected native boolean gst_rtsp_connection_is_tunneled(
        @Ptr
        long conn);

    public boolean is_tunneled() {
        return this.gst_rtsp_connection_is_tunneled(Pointer.pointerTo(this, GstRTSPConnection.class));
    }

    protected native void gst_rtsp_connection_set_auth_param(
        @Ptr
        long conn,
        @Ptr
        long param,
        @Ptr
        long value);

    public void set_auth_param(Pointer param, Pointer value) {
        this.gst_rtsp_connection_set_auth_param(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(param), Pointer.getPeer(value));
    }

    protected native void gst_rtsp_connection_set_http_mode(
        @Ptr
        long conn, boolean enable);

    public void set_http_mode(boolean enable) {
        this.gst_rtsp_connection_set_http_mode(Pointer.pointerTo(this, GstRTSPConnection.class), enable);
    }

    protected native void gst_rtsp_connection_set_ip(
        @Ptr
        long conn,
        @Ptr
        long ip);

    public void set_ip(Pointer ip) {
        this.gst_rtsp_connection_set_ip(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(ip));
    }

    protected native void gst_rtsp_connection_set_remember_session_id(
        @Ptr
        long conn, boolean remember);

    public void set_remember_session_id(boolean remember) {
        this.gst_rtsp_connection_set_remember_session_id(Pointer.pointerTo(this, GstRTSPConnection.class), remember);
    }

    protected native boolean gst_rtsp_connection_set_tls_validation_flags(
        @Ptr
        long conn, Object flags);

    public boolean set_tls_validation_flags(Object flags) {
        return this.gst_rtsp_connection_set_tls_validation_flags(Pointer.pointerTo(this, GstRTSPConnection.class), flags);
    }

    protected native void gst_rtsp_connection_set_tunneled(
        @Ptr
        long conn, boolean tunneled);

    public void set_tunneled(boolean tunneled) {
        this.gst_rtsp_connection_set_tunneled(Pointer.pointerTo(this, GstRTSPConnection.class), tunneled);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_set_qos_dscp(
        @Ptr
        long conn, long qos_dscp);

    public IntValuedEnum<GstRTSPResult> set_qos_dscp(long qos_dscp) {
        return this.gst_rtsp_connection_set_qos_dscp(Pointer.pointerTo(this, GstRTSPConnection.class), qos_dscp);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_next_timeout(
        @Ptr
        long conn,
        @Ptr
        long timeout);

    public IntValuedEnum<GstRTSPResult> next_timeout(Pointer<GTimeVal> timeout) {
        return this.gst_rtsp_connection_next_timeout(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(timeout));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_poll(
        @Ptr
        long conn, Object events,
        @Ptr
        long revents,
        @Ptr
        long timeout);

    public IntValuedEnum<GstRTSPResult> poll(Object events, Pointer<Object> revents, Pointer<GTimeVal> timeout) {
        return this.gst_rtsp_connection_poll(Pointer.pointerTo(this, GstRTSPConnection.class), events, Pointer.getPeer(revents), Pointer.getPeer(timeout));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_close(
        @Ptr
        long conn);

    public IntValuedEnum<GstRTSPResult> close() {
        return this.gst_rtsp_connection_close(Pointer.pointerTo(this, GstRTSPConnection.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_accept(
        @Ptr
        long socket,
        @Ptr
        long conn,
        @Ptr
        long cancellable);

    public IntValuedEnum<GstRTSPResult> accept(Pointer<GSocket> socket, Pointer<Pointer<GstRTSPConnection>> conn, Pointer<GCancellable> cancellable) {
        return this.gst_rtsp_connection_accept(Pointer.getPeer(socket), Pointer.getPeer(conn), Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_set_proxy(
        @Ptr
        long conn,
        @Ptr
        long host, long port);

    public IntValuedEnum<GstRTSPResult> set_proxy(Pointer host, long port) {
        return this.gst_rtsp_connection_set_proxy(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(host), port);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_send(
        @Ptr
        long conn,
        @Ptr
        long message,
        @Ptr
        long timeout);

    public IntValuedEnum<GstRTSPResult> send(Pointer<GstRTSPMessage> message, Pointer<GTimeVal> timeout) {
        return this.gst_rtsp_connection_send(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(message), Pointer.getPeer(timeout));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_connect(
        @Ptr
        long conn,
        @Ptr
        long timeout);

    public IntValuedEnum<GstRTSPResult> connect(Pointer<GTimeVal> timeout) {
        return this.gst_rtsp_connection_connect(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(timeout));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_read(
        @Ptr
        long conn,
        @Ptr
        long data, long size,
        @Ptr
        long timeout);

    public IntValuedEnum<GstRTSPResult> read(Pointer<Short> data, long size, Pointer<GTimeVal> timeout) {
        return this.gst_rtsp_connection_read(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(data), size, Pointer.getPeer(timeout));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_free(
        @Ptr
        long conn);

    public IntValuedEnum<GstRTSPResult> free() {
        return this.gst_rtsp_connection_free(Pointer.pointerTo(this, GstRTSPConnection.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_create(
        @Ptr
        long url,
        @Ptr
        long conn);

    public IntValuedEnum<GstRTSPResult> create(Pointer<GstRTSPUrl> url, Pointer<Pointer<GstRTSPConnection>> conn) {
        return this.gst_rtsp_connection_create(Pointer.getPeer(url), Pointer.getPeer(conn));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_write(
        @Ptr
        long conn,
        @Ptr
        long data, long size,
        @Ptr
        long timeout);

    public IntValuedEnum<GstRTSPResult> write(Pointer<Short> data, long size, Pointer<GTimeVal> timeout) {
        return this.gst_rtsp_connection_write(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(data), size, Pointer.getPeer(timeout));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_reset_timeout(
        @Ptr
        long conn);

    public IntValuedEnum<GstRTSPResult> reset_timeout() {
        return this.gst_rtsp_connection_reset_timeout(Pointer.pointerTo(this, GstRTSPConnection.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_set_auth(
        @Ptr
        long conn, IntValuedEnum<GstRTSPAuthMethod> method,
        @Ptr
        long user,
        @Ptr
        long pass);

    public IntValuedEnum<GstRTSPResult> set_auth(IntValuedEnum<GstRTSPAuthMethod> method, Pointer user, Pointer pass) {
        return this.gst_rtsp_connection_set_auth(Pointer.pointerTo(this, GstRTSPConnection.class), method, Pointer.getPeer(user), Pointer.getPeer(pass));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_flush(
        @Ptr
        long conn, boolean flush);

    public IntValuedEnum<GstRTSPResult> flush(boolean flush) {
        return this.gst_rtsp_connection_flush(Pointer.pointerTo(this, GstRTSPConnection.class), flush);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_do_tunnel(
        @Ptr
        long conn,
        @Ptr
        long conn2);

    public IntValuedEnum<GstRTSPResult> do_tunnel(Pointer<GstRTSPConnection> conn2) {
        return this.gst_rtsp_connection_do_tunnel(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(conn2));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_create_from_socket(
        @Ptr
        long socket,
        @Ptr
        long ip, int port,
        @Ptr
        long initial_buffer,
        @Ptr
        long conn);

    public IntValuedEnum<GstRTSPResult> create_from_socket(Pointer<GSocket> socket, Pointer ip, int port, Pointer initial_buffer, Pointer<Pointer<GstRTSPConnection>> conn) {
        return this.gst_rtsp_connection_create_from_socket(Pointer.getPeer(socket), Pointer.getPeer(ip), port, Pointer.getPeer(initial_buffer), Pointer.getPeer(conn));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_receive(
        @Ptr
        long conn,
        @Ptr
        long message,
        @Ptr
        long timeout);

    public IntValuedEnum<GstRTSPResult> receive(Pointer<GstRTSPMessage> message, Pointer<GTimeVal> timeout) {
        return this.gst_rtsp_connection_receive(Pointer.pointerTo(this, GstRTSPConnection.class), Pointer.getPeer(message), Pointer.getPeer(timeout));
    }

}
