
package generated;

import generated.gio20.gio.GCancellable;
import generated.gio20.gio.GSocket;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPConnection;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPHeaderField;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPMessage;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPRangeUnit;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPResult;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPStatusCode;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPTimeRange;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPTransport;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPUrl;
import generated.gstreamerrtsp10.gstrtsp.GstRTSPVersion;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstRtsp {


    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_accept(
        @Ptr
        long socket,
        @Ptr
        long conn,
        @Ptr
        long cancellable);

    public IntValuedEnum<GstRTSPResult> rtsp_connection_accept(Pointer<GSocket> socket, Pointer<Pointer<GstRTSPConnection>> conn, Pointer<GCancellable> cancellable) {
        return this.gst_rtsp_connection_accept(Pointer.getPeer(socket), Pointer.getPeer(conn), Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_connection_create(
        @Ptr
        long url,
        @Ptr
        long conn);

    public IntValuedEnum<GstRTSPResult> rtsp_connection_create(Pointer<GstRTSPUrl> url, Pointer<Pointer<GstRTSPConnection>> conn) {
        return this.gst_rtsp_connection_create(Pointer.getPeer(url), Pointer.getPeer(conn));
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

    public IntValuedEnum<GstRTSPResult> rtsp_connection_create_from_socket(Pointer<GSocket> socket, Pointer ip, int port, Pointer initial_buffer, Pointer<Pointer<GstRTSPConnection>> conn) {
        return this.gst_rtsp_connection_create_from_socket(Pointer.getPeer(socket), Pointer.getPeer(ip), port, Pointer.getPeer(initial_buffer), Pointer.getPeer(conn));
    }

    protected native IntValuedEnum<GstRTSPHeaderField> gst_rtsp_find_header_field(
        @Ptr
        long header);

    public IntValuedEnum<GstRTSPHeaderField> rtsp_find_header_field(Pointer header) {
        return this.gst_rtsp_find_header_field(Pointer.getPeer(header));
    }

    protected native Object gst_rtsp_find_method(
        @Ptr
        long method);

    public Object rtsp_find_method(Pointer method) {
        return this.gst_rtsp_find_method(Pointer.getPeer(method));
    }

    public native boolean gst_rtsp_header_allow_multiple(IntValuedEnum<GstRTSPHeaderField> field);

    @Ptr
    protected native long gst_rtsp_header_as_text(IntValuedEnum<GstRTSPHeaderField> field);

    public Pointer rtsp_header_as_text(IntValuedEnum<GstRTSPHeaderField> field) {
        return Pointer.pointerToAddress(this.gst_rtsp_header_as_text(field));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new(
        @Ptr
        long msg);

    public IntValuedEnum<GstRTSPResult> rtsp_message_new(Pointer<Pointer<GstRTSPMessage>> msg) {
        return this.gst_rtsp_message_new(Pointer.getPeer(msg));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new_data(
        @Ptr
        long msg, short channel);

    public IntValuedEnum<GstRTSPResult> rtsp_message_new_data(Pointer<Pointer<GstRTSPMessage>> msg, short channel) {
        return this.gst_rtsp_message_new_data(Pointer.getPeer(msg), channel);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new_request(
        @Ptr
        long msg, Object method,
        @Ptr
        long uri);

    public IntValuedEnum<GstRTSPResult> rtsp_message_new_request(Pointer<Pointer<GstRTSPMessage>> msg, Object method, Pointer uri) {
        return this.gst_rtsp_message_new_request(Pointer.getPeer(msg), method, Pointer.getPeer(uri));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new_response(
        @Ptr
        long msg, IntValuedEnum<GstRTSPStatusCode> code,
        @Ptr
        long reason,
        @Ptr
        long request);

    public IntValuedEnum<GstRTSPResult> rtsp_message_new_response(Pointer<Pointer<GstRTSPMessage>> msg, IntValuedEnum<GstRTSPStatusCode> code, Pointer reason, Pointer<GstRTSPMessage> request) {
        return this.gst_rtsp_message_new_response(Pointer.getPeer(msg), code, Pointer.getPeer(reason), Pointer.getPeer(request));
    }

    @Ptr
    protected native long gst_rtsp_method_as_text(Object method);

    public Pointer rtsp_method_as_text(Object method) {
        return Pointer.pointerToAddress(this.gst_rtsp_method_as_text(method));
    }

    @Ptr
    protected native long gst_rtsp_options_as_text(Object options);

    public Pointer rtsp_options_as_text(Object options) {
        return Pointer.pointerToAddress(this.gst_rtsp_options_as_text(options));
    }

    protected native Object gst_rtsp_options_from_text(
        @Ptr
        long options);

    public Object rtsp_options_from_text(Pointer options) {
        return this.gst_rtsp_options_from_text(Pointer.getPeer(options));
    }

    protected native boolean gst_rtsp_range_convert_units(
        @Ptr
        long range, IntValuedEnum<GstRTSPRangeUnit> unit);

    public boolean rtsp_range_convert_units(Pointer<GstRTSPTimeRange> range, IntValuedEnum<GstRTSPRangeUnit> unit) {
        return this.gst_rtsp_range_convert_units(Pointer.getPeer(range), unit);
    }

    protected native void gst_rtsp_range_free(
        @Ptr
        long range);

    public void rtsp_range_free(Pointer<GstRTSPTimeRange> range) {
        this.gst_rtsp_range_free(Pointer.getPeer(range));
    }

    protected native boolean gst_rtsp_range_get_times(
        @Ptr
        long range,
        @Ptr
        long min,
        @Ptr
        long max);

    public boolean rtsp_range_get_times(Pointer<GstRTSPTimeRange> range, Pointer<Object> min, Pointer<Object> max) {
        return this.gst_rtsp_range_get_times(Pointer.getPeer(range), Pointer.getPeer(min), Pointer.getPeer(max));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_range_parse(
        @Ptr
        long rangestr,
        @Ptr
        long range);

    public IntValuedEnum<GstRTSPResult> rtsp_range_parse(Pointer rangestr, Pointer<Pointer<GstRTSPTimeRange>> range) {
        return this.gst_rtsp_range_parse(Pointer.getPeer(rangestr), Pointer.getPeer(range));
    }

    @Ptr
    protected native long gst_rtsp_range_to_string(
        @Ptr
        long range);

    public Pointer rtsp_range_to_string(Pointer<GstRTSPTimeRange> range) {
        return Pointer.pointerToAddress(this.gst_rtsp_range_to_string(Pointer.getPeer(range)));
    }

    @Ptr
    protected native long gst_rtsp_status_as_text(IntValuedEnum<GstRTSPStatusCode> code);

    public Pointer rtsp_status_as_text(IntValuedEnum<GstRTSPStatusCode> code) {
        return Pointer.pointerToAddress(this.gst_rtsp_status_as_text(code));
    }

    @Ptr
    protected native long gst_rtsp_strresult(IntValuedEnum<GstRTSPResult> result);

    public Pointer rtsp_strresult(IntValuedEnum<GstRTSPResult> result) {
        return Pointer.pointerToAddress(this.gst_rtsp_strresult(result));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_get_manager(Object trans,
        @Ptr
        long manager, long option);

    public IntValuedEnum<GstRTSPResult> rtsp_transport_get_manager(Object trans, Pointer manager, long option) {
        return this.gst_rtsp_transport_get_manager(trans, Pointer.getPeer(manager), option);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_get_mime(Object trans,
        @Ptr
        long mime);

    public IntValuedEnum<GstRTSPResult> rtsp_transport_get_mime(Object trans, Pointer mime) {
        return this.gst_rtsp_transport_get_mime(trans, Pointer.getPeer(mime));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_new(
        @Ptr
        long transport);

    public IntValuedEnum<GstRTSPResult> rtsp_transport_new(Pointer<Pointer<GstRTSPTransport>> transport) {
        return this.gst_rtsp_transport_new(Pointer.getPeer(transport));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_parse(
        @Ptr
        long str,
        @Ptr
        long transport);

    public IntValuedEnum<GstRTSPResult> rtsp_transport_parse(Pointer str, Pointer<GstRTSPTransport> transport) {
        return this.gst_rtsp_transport_parse(Pointer.getPeer(str), Pointer.getPeer(transport));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_url_parse(
        @Ptr
        long urlstr,
        @Ptr
        long url);

    public IntValuedEnum<GstRTSPResult> rtsp_url_parse(Pointer urlstr, Pointer<Pointer<GstRTSPUrl>> url) {
        return this.gst_rtsp_url_parse(Pointer.getPeer(urlstr), Pointer.getPeer(url));
    }

    @Ptr
    protected native long gst_rtsp_version_as_text(IntValuedEnum<GstRTSPVersion> version);

    public Pointer rtsp_version_as_text(IntValuedEnum<GstRTSPVersion> version) {
        return Pointer.pointerToAddress(this.gst_rtsp_version_as_text(version));
    }

}
