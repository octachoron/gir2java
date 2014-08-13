
package generated.gstreamersdp10.gstsdp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-sdp-1.0")
public class GstSDPMedia
    extends StructObject
{


    public GstSDPMedia() {
        super();
    }

    public GstSDPMedia(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_media() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPMedia field_media(Pointer field_media) {
        this.io.setPointerField(this, 0, field_media);
        return this;
    }

    @Field(1)
    public long field_port() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstSDPMedia field_port(long field_port) {
        this.io.setNativeObjectField(this, 1, field_port);
        return this;
    }

    @Field(2)
    public long field_num_ports() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstSDPMedia field_num_ports(long field_num_ports) {
        this.io.setNativeObjectField(this, 2, field_num_ports);
        return this;
    }

    @Field(3)
    public Pointer field_proto() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstSDPMedia field_proto(Pointer field_proto) {
        this.io.setPointerField(this, 3, field_proto);
        return this;
    }

    @Field(4)
    public Pointer field_fmts() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstSDPMedia field_fmts(Pointer field_fmts) {
        this.io.setPointerField(this, 4, field_fmts);
        return this;
    }

    @Field(5)
    public Pointer field_information() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstSDPMedia field_information(Pointer field_information) {
        this.io.setPointerField(this, 5, field_information);
        return this;
    }

    @Field(6)
    public Pointer field_connections() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstSDPMedia field_connections(Pointer field_connections) {
        this.io.setPointerField(this, 6, field_connections);
        return this;
    }

    @Field(7)
    public Pointer field_bandwidths() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstSDPMedia field_bandwidths(Pointer field_bandwidths) {
        this.io.setPointerField(this, 7, field_bandwidths);
        return this;
    }

    @Field(8)
    public GstSDPKey field_key() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstSDPMedia field_key(GstSDPKey field_key) {
        this.io.setNativeObjectField(this, 8, field_key);
        return this;
    }

    @Field(9)
    public Pointer field_attributes() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstSDPMedia field_attributes(Pointer field_attributes) {
        this.io.setPointerField(this, 9, field_attributes);
        return this;
    }

    @Ptr
    protected native long gst_sdp_media_as_text(
        @Ptr
        long media);

    public Pointer as_text() {
        return Pointer.pointerToAddress(this.gst_sdp_media_as_text(Pointer.pointerTo(this, GstSDPMedia.class)));
    }

    protected native long gst_sdp_media_attributes_len(
        @Ptr
        long media);

    public long attributes_len() {
        return this.gst_sdp_media_attributes_len(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    protected native long gst_sdp_media_bandwidths_len(
        @Ptr
        long media);

    public long bandwidths_len() {
        return this.gst_sdp_media_bandwidths_len(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    protected native long gst_sdp_media_connections_len(
        @Ptr
        long media);

    public long connections_len() {
        return this.gst_sdp_media_connections_len(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    protected native long gst_sdp_media_formats_len(
        @Ptr
        long media);

    public long formats_len() {
        return this.gst_sdp_media_formats_len(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    @Ptr
    protected native long gst_sdp_media_get_attribute(
        @Ptr
        long media, long idx);

    public Pointer<GstSDPAttribute> get_attribute(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_attribute(Pointer.pointerTo(this, GstSDPMedia.class), idx), Pointer.class);
    }

    @Ptr
    protected native long gst_sdp_media_get_attribute_val(
        @Ptr
        long media,
        @Ptr
        long key);

    public Pointer get_attribute_val(Pointer key) {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_attribute_val(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(key)));
    }

    @Ptr
    protected native long gst_sdp_media_get_attribute_val_n(
        @Ptr
        long media,
        @Ptr
        long key, long nth);

    public Pointer get_attribute_val_n(Pointer key, long nth) {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_attribute_val_n(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(key), nth));
    }

    @Ptr
    protected native long gst_sdp_media_get_bandwidth(
        @Ptr
        long media, long idx);

    public Pointer<GstSDPBandwidth> get_bandwidth(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_bandwidth(Pointer.pointerTo(this, GstSDPMedia.class), idx), Pointer.class);
    }

    @Ptr
    protected native long gst_sdp_media_get_connection(
        @Ptr
        long media, long idx);

    public Pointer<GstSDPConnection> get_connection(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_connection(Pointer.pointerTo(this, GstSDPMedia.class), idx), Pointer.class);
    }

    @Ptr
    protected native long gst_sdp_media_get_format(
        @Ptr
        long media, long idx);

    public Pointer get_format(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_format(Pointer.pointerTo(this, GstSDPMedia.class), idx));
    }

    @Ptr
    protected native long gst_sdp_media_get_information(
        @Ptr
        long media);

    public Pointer get_information() {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_information(Pointer.pointerTo(this, GstSDPMedia.class)));
    }

    @Ptr
    protected native long gst_sdp_media_get_key(
        @Ptr
        long media);

    public Pointer<GstSDPKey> get_key() {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_key(Pointer.pointerTo(this, GstSDPMedia.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_sdp_media_get_media(
        @Ptr
        long media);

    public Pointer get_media() {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_media(Pointer.pointerTo(this, GstSDPMedia.class)));
    }

    protected native long gst_sdp_media_get_num_ports(
        @Ptr
        long media);

    public long get_num_ports() {
        return this.gst_sdp_media_get_num_ports(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    protected native long gst_sdp_media_get_port(
        @Ptr
        long media);

    public long get_port() {
        return this.gst_sdp_media_get_port(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    @Ptr
    protected native long gst_sdp_media_get_proto(
        @Ptr
        long media);

    public Pointer get_proto() {
        return Pointer.pointerToAddress(this.gst_sdp_media_get_proto(Pointer.pointerTo(this, GstSDPMedia.class)));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_replace_attribute(
        @Ptr
        long media, long idx,
        @Ptr
        long attr);

    public IntValuedEnum<GstSDPResult> replace_attribute(long idx, Pointer<GstSDPAttribute> attr) {
        return this.gst_sdp_media_replace_attribute(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(attr));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_set_information(
        @Ptr
        long media,
        @Ptr
        long information);

    public IntValuedEnum<GstSDPResult> set_information(Pointer information) {
        return this.gst_sdp_media_set_information(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(information));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_replace_connection(
        @Ptr
        long media, long idx,
        @Ptr
        long conn);

    public IntValuedEnum<GstSDPResult> replace_connection(long idx, Pointer<GstSDPConnection> conn) {
        return this.gst_sdp_media_replace_connection(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(conn));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_remove_bandwidth(
        @Ptr
        long media, long idx);

    public IntValuedEnum<GstSDPResult> remove_bandwidth(long idx) {
        return this.gst_sdp_media_remove_bandwidth(Pointer.pointerTo(this, GstSDPMedia.class), idx);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_init(
        @Ptr
        long media);

    public IntValuedEnum<GstSDPResult> init() {
        return this.gst_sdp_media_init(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_insert_connection(
        @Ptr
        long media, int idx,
        @Ptr
        long conn);

    public IntValuedEnum<GstSDPResult> insert_connection(int idx, Pointer<GstSDPConnection> conn) {
        return this.gst_sdp_media_insert_connection(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(conn));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_new(
        @Ptr
        long media);

    public IntValuedEnum<GstSDPResult> _new(Pointer<Pointer<GstSDPMedia>> media) {
        return this.gst_sdp_media_new(Pointer.getPeer(media));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_remove_connection(
        @Ptr
        long media, long idx);

    public IntValuedEnum<GstSDPResult> remove_connection(long idx) {
        return this.gst_sdp_media_remove_connection(Pointer.pointerTo(this, GstSDPMedia.class), idx);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_replace_format(
        @Ptr
        long media, long idx,
        @Ptr
        long format);

    public IntValuedEnum<GstSDPResult> replace_format(long idx, Pointer format) {
        return this.gst_sdp_media_replace_format(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(format));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_add_attribute(
        @Ptr
        long media,
        @Ptr
        long key,
        @Ptr
        long value);

    public IntValuedEnum<GstSDPResult> add_attribute(Pointer key, Pointer value) {
        return this.gst_sdp_media_add_attribute(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_set_port_info(
        @Ptr
        long media, long port, long num_ports);

    public IntValuedEnum<GstSDPResult> set_port_info(long port, long num_ports) {
        return this.gst_sdp_media_set_port_info(Pointer.pointerTo(this, GstSDPMedia.class), port, num_ports);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_uninit(
        @Ptr
        long media);

    public IntValuedEnum<GstSDPResult> uninit() {
        return this.gst_sdp_media_uninit(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_insert_attribute(
        @Ptr
        long media, int idx,
        @Ptr
        long attr);

    public IntValuedEnum<GstSDPResult> insert_attribute(int idx, Pointer<GstSDPAttribute> attr) {
        return this.gst_sdp_media_insert_attribute(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(attr));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_set_proto(
        @Ptr
        long media,
        @Ptr
        long proto);

    public IntValuedEnum<GstSDPResult> set_proto(Pointer proto) {
        return this.gst_sdp_media_set_proto(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(proto));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_set_key(
        @Ptr
        long media,
        @Ptr
        long type,
        @Ptr
        long data);

    public IntValuedEnum<GstSDPResult> set_key(Pointer type, Pointer data) {
        return this.gst_sdp_media_set_key(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(type), Pointer.getPeer(data));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_add_bandwidth(
        @Ptr
        long media,
        @Ptr
        long bwtype, long bandwidth);

    public IntValuedEnum<GstSDPResult> add_bandwidth(Pointer bwtype, long bandwidth) {
        return this.gst_sdp_media_add_bandwidth(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(bwtype), bandwidth);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_replace_bandwidth(
        @Ptr
        long media, long idx,
        @Ptr
        long bw);

    public IntValuedEnum<GstSDPResult> replace_bandwidth(long idx, Pointer<GstSDPBandwidth> bw) {
        return this.gst_sdp_media_replace_bandwidth(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(bw));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_add_format(
        @Ptr
        long media,
        @Ptr
        long format);

    public IntValuedEnum<GstSDPResult> add_format(Pointer format) {
        return this.gst_sdp_media_add_format(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(format));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_add_connection(
        @Ptr
        long media,
        @Ptr
        long nettype,
        @Ptr
        long addrtype,
        @Ptr
        long address, long ttl, long addr_number);

    public IntValuedEnum<GstSDPResult> add_connection(Pointer nettype, Pointer addrtype, Pointer address, long ttl, long addr_number) {
        return this.gst_sdp_media_add_connection(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(nettype), Pointer.getPeer(addrtype), Pointer.getPeer(address), ttl, addr_number);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_insert_bandwidth(
        @Ptr
        long media, int idx,
        @Ptr
        long bw);

    public IntValuedEnum<GstSDPResult> insert_bandwidth(int idx, Pointer<GstSDPBandwidth> bw) {
        return this.gst_sdp_media_insert_bandwidth(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(bw));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_copy(
        @Ptr
        long media,
        @Ptr
        long copy);

    public IntValuedEnum<GstSDPResult> copy(Pointer<Pointer<GstSDPMedia>> copy) {
        return this.gst_sdp_media_copy(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(copy));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_remove_format(
        @Ptr
        long media, long idx);

    public IntValuedEnum<GstSDPResult> remove_format(long idx) {
        return this.gst_sdp_media_remove_format(Pointer.pointerTo(this, GstSDPMedia.class), idx);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_remove_attribute(
        @Ptr
        long media, long idx);

    public IntValuedEnum<GstSDPResult> remove_attribute(long idx) {
        return this.gst_sdp_media_remove_attribute(Pointer.pointerTo(this, GstSDPMedia.class), idx);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_insert_format(
        @Ptr
        long media, int idx,
        @Ptr
        long format);

    public IntValuedEnum<GstSDPResult> insert_format(int idx, Pointer format) {
        return this.gst_sdp_media_insert_format(Pointer.pointerTo(this, GstSDPMedia.class), idx, Pointer.getPeer(format));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_free(
        @Ptr
        long media);

    public IntValuedEnum<GstSDPResult> free() {
        return this.gst_sdp_media_free(Pointer.pointerTo(this, GstSDPMedia.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_set_media(
        @Ptr
        long media,
        @Ptr
        long med);

    public IntValuedEnum<GstSDPResult> set_media(Pointer med) {
        return this.gst_sdp_media_set_media(Pointer.pointerTo(this, GstSDPMedia.class), Pointer.getPeer(med));
    }

}
