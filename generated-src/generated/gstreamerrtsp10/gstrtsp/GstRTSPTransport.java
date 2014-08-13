
package generated.gstreamerrtsp10.gstrtsp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPTransport
    extends StructObject
{


    public GstRTSPTransport() {
        super();
    }

    public GstRTSPTransport(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_trans() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTSPTransport field_trans(Object field_trans) {
        this.io.setNativeObjectField(this, 0, field_trans);
        return this;
    }

    @Field(1)
    public Object field_profile() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTSPTransport field_profile(Object field_profile) {
        this.io.setNativeObjectField(this, 1, field_profile);
        return this;
    }

    @Field(2)
    public Object field_lower_transport() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstRTSPTransport field_lower_transport(Object field_lower_transport) {
        this.io.setNativeObjectField(this, 2, field_lower_transport);
        return this;
    }

    @Field(3)
    public Pointer field_destination() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstRTSPTransport field_destination(Pointer field_destination) {
        this.io.setPointerField(this, 3, field_destination);
        return this;
    }

    @Field(4)
    public Pointer field_source() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstRTSPTransport field_source(Pointer field_source) {
        this.io.setPointerField(this, 4, field_source);
        return this;
    }

    @Field(5)
    public long field_layers() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstRTSPTransport field_layers(long field_layers) {
        this.io.setNativeObjectField(this, 5, field_layers);
        return this;
    }

    @Field(6)
    public boolean field_mode_play() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstRTSPTransport field_mode_play(boolean field_mode_play) {
        this.io.setNativeObjectField(this, 6, field_mode_play);
        return this;
    }

    @Field(7)
    public boolean field_mode_record() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstRTSPTransport field_mode_record(boolean field_mode_record) {
        this.io.setNativeObjectField(this, 7, field_mode_record);
        return this;
    }

    @Field(8)
    public boolean field_append() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstRTSPTransport field_append(boolean field_append) {
        this.io.setNativeObjectField(this, 8, field_append);
        return this;
    }

    @Field(9)
    public GstRTSPRange field_interleaved() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstRTSPTransport field_interleaved(GstRTSPRange field_interleaved) {
        this.io.setNativeObjectField(this, 9, field_interleaved);
        return this;
    }

    @Field(10)
    public long field_ttl() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstRTSPTransport field_ttl(long field_ttl) {
        this.io.setNativeObjectField(this, 10, field_ttl);
        return this;
    }

    @Field(11)
    public GstRTSPRange field_port() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstRTSPTransport field_port(GstRTSPRange field_port) {
        this.io.setNativeObjectField(this, 11, field_port);
        return this;
    }

    @Field(12)
    public GstRTSPRange field_client_port() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GstRTSPTransport field_client_port(GstRTSPRange field_client_port) {
        this.io.setNativeObjectField(this, 12, field_client_port);
        return this;
    }

    @Field(13)
    public GstRTSPRange field_server_port() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GstRTSPTransport field_server_port(GstRTSPRange field_server_port) {
        this.io.setNativeObjectField(this, 13, field_server_port);
        return this;
    }

    @Field(14)
    public long field_ssrc() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GstRTSPTransport field_ssrc(long field_ssrc) {
        this.io.setNativeObjectField(this, 14, field_ssrc);
        return this;
    }

    @Field(15)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public GstRTSPTransport field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 15, field__gst_reserved);
        return this;
    }

    @Ptr
    protected native long gst_rtsp_transport_as_text(
        @Ptr
        long transport);

    public Pointer as_text() {
        return Pointer.pointerToAddress(this.gst_rtsp_transport_as_text(Pointer.pointerTo(this, GstRTSPTransport.class)));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_free(
        @Ptr
        long transport);

    public IntValuedEnum<GstRTSPResult> free() {
        return this.gst_rtsp_transport_free(Pointer.pointerTo(this, GstRTSPTransport.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_init(
        @Ptr
        long transport);

    public IntValuedEnum<GstRTSPResult> init() {
        return this.gst_rtsp_transport_init(Pointer.pointerTo(this, GstRTSPTransport.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_get_manager(Object trans,
        @Ptr
        long manager, long option);

    public IntValuedEnum<GstRTSPResult> get_manager(Object trans, Pointer manager, long option) {
        return this.gst_rtsp_transport_get_manager(trans, Pointer.getPeer(manager), option);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_get_mime(Object trans,
        @Ptr
        long mime);

    public IntValuedEnum<GstRTSPResult> get_mime(Object trans, Pointer mime) {
        return this.gst_rtsp_transport_get_mime(trans, Pointer.getPeer(mime));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_new(
        @Ptr
        long transport);

    public IntValuedEnum<GstRTSPResult> _new(Pointer transport) {
        return this.gst_rtsp_transport_new(Pointer.getPeer(transport));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_transport_parse(
        @Ptr
        long str,
        @Ptr
        long transport);

    public IntValuedEnum<GstRTSPResult> parse(Pointer str, Pointer transport) {
        return this.gst_rtsp_transport_parse(Pointer.getPeer(str), Pointer.getPeer(transport));
    }

}
