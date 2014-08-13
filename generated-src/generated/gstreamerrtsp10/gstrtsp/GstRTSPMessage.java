
package generated.gstreamerrtsp10.gstrtsp;

import generated.glib20.glib.GString;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPMessage
    extends StructObject
{


    public GstRTSPMessage() {
        super();
    }

    public GstRTSPMessage(Pointer pointer) {
        super(pointer);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_parse_request(
        @Ptr
        long msg,
        @Ptr
        long method,
        @Ptr
        long uri,
        @Ptr
        long version);

    public IntValuedEnum<GstRTSPResult> parse_request(Pointer<Object> method, Pointer uri, Pointer<IntValuedEnum<GstRTSPVersion>> version) {
        return this.gst_rtsp_message_parse_request(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(method), Pointer.getPeer(uri), Pointer.getPeer(version));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_parse_data(
        @Ptr
        long msg,
        @Ptr
        long channel);

    public IntValuedEnum<GstRTSPResult> parse_data(Pointer<Short> channel) {
        return this.gst_rtsp_message_parse_data(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(channel));
    }

    protected native IntValuedEnum<GstRTSPMsgType> gst_rtsp_message_get_type(
        @Ptr
        long msg);

    public IntValuedEnum<GstRTSPMsgType> get_type() {
        return this.gst_rtsp_message_get_type(Pointer.pointerTo(this, GstRTSPMessage.class));
    }

    @Field(0)
    public Pointer<Short> field_body() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstRTSPMessage field_body(Pointer<Short> field_body) {
        this.io.setPointerField(this, 0, field_body);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstRTSPMessage field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new(
        @Ptr
        long msg);

    public IntValuedEnum<GstRTSPResult> _new(Pointer<Pointer<GstRTSPMessage>> msg) {
        return this.gst_rtsp_message_new(Pointer.getPeer(msg));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_append_headers(
        @Ptr
        long msg,
        @Ptr
        long str);

    public IntValuedEnum<GstRTSPResult> append_headers(Pointer<GString> str) {
        return this.gst_rtsp_message_append_headers(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(str));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_unset(
        @Ptr
        long msg);

    public IntValuedEnum<GstRTSPResult> unset() {
        return this.gst_rtsp_message_unset(Pointer.pointerTo(this, GstRTSPMessage.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_add_header(
        @Ptr
        long msg, IntValuedEnum<GstRTSPHeaderField> field,
        @Ptr
        long value);

    public IntValuedEnum<GstRTSPResult> add_header(IntValuedEnum<GstRTSPHeaderField> field, Pointer value) {
        return this.gst_rtsp_message_add_header(Pointer.pointerTo(this, GstRTSPMessage.class), field, Pointer.getPeer(value));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_take_body(
        @Ptr
        long msg,
        @Ptr
        long data, long size);

    public IntValuedEnum<GstRTSPResult> take_body(short data, long size) {
        return this.gst_rtsp_message_take_body(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(data), size);
    }

    @Field(2)
    public long field_body_size() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstRTSPMessage field_body_size(long field_body_size) {
        this.io.setNativeObjectField(this, 2, field_body_size);
        return this;
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_free(
        @Ptr
        long msg);

    public IntValuedEnum<GstRTSPResult> free() {
        return this.gst_rtsp_message_free(Pointer.pointerTo(this, GstRTSPMessage.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new_request(
        @Ptr
        long msg, Object method,
        @Ptr
        long uri);

    public IntValuedEnum<GstRTSPResult> new_request(Pointer<Pointer<GstRTSPMessage>> msg, Object method, Pointer uri) {
        return this.gst_rtsp_message_new_request(Pointer.getPeer(msg), method, Pointer.getPeer(uri));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_remove_header(
        @Ptr
        long msg, IntValuedEnum<GstRTSPHeaderField> field, int indx);

    public IntValuedEnum<GstRTSPResult> remove_header(IntValuedEnum<GstRTSPHeaderField> field, int indx) {
        return this.gst_rtsp_message_remove_header(Pointer.pointerTo(this, GstRTSPMessage.class), field, indx);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_parse_response(
        @Ptr
        long msg,
        @Ptr
        long code,
        @Ptr
        long reason,
        @Ptr
        long version);

    public IntValuedEnum<GstRTSPResult> parse_response(Pointer<IntValuedEnum<GstRTSPStatusCode>> code, Pointer reason, Pointer<IntValuedEnum<GstRTSPVersion>> version) {
        return this.gst_rtsp_message_parse_response(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(code), Pointer.getPeer(reason), Pointer.getPeer(version));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_dump(
        @Ptr
        long msg);

    public IntValuedEnum<GstRTSPResult> dump() {
        return this.gst_rtsp_message_dump(Pointer.pointerTo(this, GstRTSPMessage.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_init_data(
        @Ptr
        long msg, short channel);

    public IntValuedEnum<GstRTSPResult> init_data(short channel) {
        return this.gst_rtsp_message_init_data(Pointer.pointerTo(this, GstRTSPMessage.class), channel);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_take_header(
        @Ptr
        long msg, IntValuedEnum<GstRTSPHeaderField> field,
        @Ptr
        long value);

    public IntValuedEnum<GstRTSPResult> take_header(IntValuedEnum<GstRTSPHeaderField> field, Pointer value) {
        return this.gst_rtsp_message_take_header(Pointer.pointerTo(this, GstRTSPMessage.class), field, Pointer.getPeer(value));
    }

    @Field(3)
    public Pointer field_hdr_fields() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstRTSPMessage field_hdr_fields(Pointer field_hdr_fields) {
        this.io.setPointerField(this, 3, field_hdr_fields);
        return this;
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_set_body(
        @Ptr
        long msg,
        @Ptr
        long data, long size);

    public IntValuedEnum<GstRTSPResult> set_body(short data, long size) {
        return this.gst_rtsp_message_set_body(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(data), size);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_get_body(
        @Ptr
        long msg,
        @Ptr
        long data,
        @Ptr
        long size);

    public IntValuedEnum<GstRTSPResult> get_body(Pointer<Short> data, Pointer<Long> size) {
        return this.gst_rtsp_message_get_body(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(data), Pointer.getPeer(size));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_steal_body(
        @Ptr
        long msg,
        @Ptr
        long data,
        @Ptr
        long size);

    public IntValuedEnum<GstRTSPResult> steal_body(Pointer<Short> data, Pointer<Long> size) {
        return this.gst_rtsp_message_steal_body(Pointer.pointerTo(this, GstRTSPMessage.class), Pointer.getPeer(data), Pointer.getPeer(size));
    }

    @Field(4)
    public IntValuedEnum<GstRTSPMsgType> field_type() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public GstRTSPMessage field_type(IntValuedEnum<GstRTSPMsgType> field_type) {
        this.io.setEnumField(this, 4, field_type);
        return this;
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_init(
        @Ptr
        long msg);

    public IntValuedEnum<GstRTSPResult> init() {
        return this.gst_rtsp_message_init(Pointer.pointerTo(this, GstRTSPMessage.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_init_response(
        @Ptr
        long msg, IntValuedEnum<GstRTSPStatusCode> code,
        @Ptr
        long reason,
        @Ptr
        long request);

    public IntValuedEnum<GstRTSPResult> init_response(IntValuedEnum<GstRTSPStatusCode> code, Pointer reason, Pointer<GstRTSPMessage> request) {
        return this.gst_rtsp_message_init_response(Pointer.pointerTo(this, GstRTSPMessage.class), code, Pointer.getPeer(reason), Pointer.getPeer(request));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_get_header(
        @Ptr
        long msg, IntValuedEnum<GstRTSPHeaderField> field,
        @Ptr
        long value, int indx);

    public IntValuedEnum<GstRTSPResult> get_header(IntValuedEnum<GstRTSPHeaderField> field, Pointer value, int indx) {
        return this.gst_rtsp_message_get_header(Pointer.pointerTo(this, GstRTSPMessage.class), field, Pointer.getPeer(value), indx);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new_data(
        @Ptr
        long msg, short channel);

    public IntValuedEnum<GstRTSPResult> new_data(Pointer<Pointer<GstRTSPMessage>> msg, short channel) {
        return this.gst_rtsp_message_new_data(Pointer.getPeer(msg), channel);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_init_request(
        @Ptr
        long msg, Object method,
        @Ptr
        long uri);

    public IntValuedEnum<GstRTSPResult> init_request(Object method, Pointer uri) {
        return this.gst_rtsp_message_init_request(Pointer.pointerTo(this, GstRTSPMessage.class), method, Pointer.getPeer(uri));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_message_new_response(
        @Ptr
        long msg, IntValuedEnum<GstRTSPStatusCode> code,
        @Ptr
        long reason,
        @Ptr
        long request);

    public IntValuedEnum<GstRTSPResult> new_response(Pointer<Pointer<GstRTSPMessage>> msg, IntValuedEnum<GstRTSPStatusCode> code, Pointer reason, Pointer<GstRTSPMessage> request) {
        return this.gst_rtsp_message_new_response(Pointer.getPeer(msg), code, Pointer.getPeer(reason), Pointer.getPeer(request));
    }

}
