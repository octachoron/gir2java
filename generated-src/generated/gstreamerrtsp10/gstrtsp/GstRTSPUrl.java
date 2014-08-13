
package generated.gstreamerrtsp10.gstrtsp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPUrl
    extends StructObject
{


    public GstRTSPUrl() {
        super();
    }

    public GstRTSPUrl(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_transports() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTSPUrl field_transports(Object field_transports) {
        this.io.setNativeObjectField(this, 0, field_transports);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstRTSPFamily> field_family() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstRTSPUrl field_family(IntValuedEnum<GstRTSPFamily> field_family) {
        this.io.setEnumField(this, 1, field_family);
        return this;
    }

    @Field(2)
    public Pointer field_user() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstRTSPUrl field_user(Pointer field_user) {
        this.io.setPointerField(this, 2, field_user);
        return this;
    }

    @Field(3)
    public Pointer field_passwd() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstRTSPUrl field_passwd(Pointer field_passwd) {
        this.io.setPointerField(this, 3, field_passwd);
        return this;
    }

    @Field(4)
    public Pointer field_host() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstRTSPUrl field_host(Pointer field_host) {
        this.io.setPointerField(this, 4, field_host);
        return this;
    }

    @Field(5)
    public int field_port() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstRTSPUrl field_port(int field_port) {
        this.io.setNativeObjectField(this, 5, field_port);
        return this;
    }

    @Field(6)
    public Pointer field_abspath() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstRTSPUrl field_abspath(Pointer field_abspath) {
        this.io.setPointerField(this, 6, field_abspath);
        return this;
    }

    @Field(7)
    public Pointer field_query() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstRTSPUrl field_query(Pointer field_query) {
        this.io.setPointerField(this, 7, field_query);
        return this;
    }

    @Ptr
    protected native long gst_rtsp_url_copy(
        @Ptr
        long url);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_rtsp_url_copy(Pointer.pointerTo(this, GstRTSPUrl.class)));
    }

    @Ptr
    protected native long gst_rtsp_url_decode_path_components(
        @Ptr
        long url);

    public Pointer decode_path_components() {
        return Pointer.pointerToAddress(this.gst_rtsp_url_decode_path_components(Pointer.pointerTo(this, GstRTSPUrl.class)));
    }

    protected native void gst_rtsp_url_free(
        @Ptr
        long url);

    public void free() {
        this.gst_rtsp_url_free(Pointer.pointerTo(this, GstRTSPUrl.class));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_url_get_port(
        @Ptr
        long url,
        @Ptr
        long port);

    public IntValuedEnum<GstRTSPResult> get_port(Pointer<Integer> port) {
        return this.gst_rtsp_url_get_port(Pointer.pointerTo(this, GstRTSPUrl.class), Pointer.getPeer(port));
    }

    @Ptr
    protected native long gst_rtsp_url_get_request_uri(
        @Ptr
        long url);

    public Pointer get_request_uri() {
        return Pointer.pointerToAddress(this.gst_rtsp_url_get_request_uri(Pointer.pointerTo(this, GstRTSPUrl.class)));
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_url_set_port(
        @Ptr
        long url, int port);

    public IntValuedEnum<GstRTSPResult> set_port(int port) {
        return this.gst_rtsp_url_set_port(Pointer.pointerTo(this, GstRTSPUrl.class), port);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_url_parse(
        @Ptr
        long urlstr,
        @Ptr
        long url);

    public IntValuedEnum<GstRTSPResult> parse(Pointer urlstr, Pointer url) {
        return this.gst_rtsp_url_parse(Pointer.getPeer(urlstr), Pointer.getPeer(url));
    }

}
