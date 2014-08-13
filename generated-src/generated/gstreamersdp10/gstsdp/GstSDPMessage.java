
package generated.gstreamersdp10.gstsdp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-sdp-1.0")
public class GstSDPMessage
    extends StructObject
{


    public GstSDPMessage() {
        super();
    }

    public GstSDPMessage(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_version() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPMessage field_version(Pointer field_version) {
        this.io.setPointerField(this, 0, field_version);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_insert_phone(
        @Ptr
        long msg, int idx,
        @Ptr
        long phone);

    public IntValuedEnum<GstSDPResult> insert_phone(int idx, Pointer phone) {
        return this.gst_sdp_message_insert_phone(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(phone));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_replace_zone(
        @Ptr
        long msg, long idx,
        @Ptr
        long zone);

    public IntValuedEnum<GstSDPResult> replace_zone(long idx, Pointer<GstSDPZone> zone) {
        return this.gst_sdp_message_replace_zone(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(zone));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_insert_time(
        @Ptr
        long msg, int idx,
        @Ptr
        long t);

    public IntValuedEnum<GstSDPResult> insert_time(int idx, Pointer<GstSDPTime> t) {
        return this.gst_sdp_message_insert_time(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(t));
    }

    @Ptr
    protected native long gst_sdp_message_get_origin(
        @Ptr
        long msg);

    public Pointer<GstSDPOrigin> get_origin() {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_origin(Pointer.pointerTo(this, GstSDPMessage.class)), Pointer.class);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_replace_email(
        @Ptr
        long msg, long idx,
        @Ptr
        long email);

    public IntValuedEnum<GstSDPResult> replace_email(long idx, Pointer email) {
        return this.gst_sdp_message_replace_email(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(email));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_insert_email(
        @Ptr
        long msg, int idx,
        @Ptr
        long email);

    public IntValuedEnum<GstSDPResult> insert_email(int idx, Pointer email) {
        return this.gst_sdp_message_insert_email(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(email));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_insert_attribute(
        @Ptr
        long msg, int idx,
        @Ptr
        long attr);

    public IntValuedEnum<GstSDPResult> insert_attribute(int idx, Pointer<GstSDPAttribute> attr) {
        return this.gst_sdp_message_insert_attribute(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(attr));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_dump(
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> dump() {
        return this.gst_sdp_message_dump(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_set_connection(
        @Ptr
        long msg,
        @Ptr
        long nettype,
        @Ptr
        long addrtype,
        @Ptr
        long address, long ttl, long addr_number);

    public IntValuedEnum<GstSDPResult> set_connection(Pointer nettype, Pointer addrtype, Pointer address, long ttl, long addr_number) {
        return this.gst_sdp_message_set_connection(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(nettype), Pointer.getPeer(addrtype), Pointer.getPeer(address), ttl, addr_number);
    }

    @Ptr
    protected native long gst_sdp_message_get_email(
        @Ptr
        long msg, long idx);

    public Pointer get_email(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_email(Pointer.pointerTo(this, GstSDPMessage.class), idx));
    }

    @Field(1)
    public Pointer field_times() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSDPMessage field_times(Pointer field_times) {
        this.io.setPointerField(this, 1, field_times);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_copy(
        @Ptr
        long msg,
        @Ptr
        long copy);

    public IntValuedEnum<GstSDPResult> copy(Pointer<Pointer<GstSDPMessage>> copy) {
        return this.gst_sdp_message_copy(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(copy));
    }

    @Field(2)
    public Pointer field_uri() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstSDPMessage field_uri(Pointer field_uri) {
        this.io.setPointerField(this, 2, field_uri);
        return this;
    }

    @Field(3)
    public Pointer field_emails() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstSDPMessage field_emails(Pointer field_emails) {
        this.io.setPointerField(this, 3, field_emails);
        return this;
    }

    @Field(4)
    public Pointer field_zones() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstSDPMessage field_zones(Pointer field_zones) {
        this.io.setPointerField(this, 4, field_zones);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_add_zone(
        @Ptr
        long msg,
        @Ptr
        long adj_time,
        @Ptr
        long typed_time);

    public IntValuedEnum<GstSDPResult> add_zone(Pointer adj_time, Pointer typed_time) {
        return this.gst_sdp_message_add_zone(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(adj_time), Pointer.getPeer(typed_time));
    }

    @Ptr
    protected native long gst_sdp_message_get_version(
        @Ptr
        long msg);

    public Pointer get_version() {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_version(Pointer.pointerTo(this, GstSDPMessage.class)));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_set_version(
        @Ptr
        long msg,
        @Ptr
        long version);

    public IntValuedEnum<GstSDPResult> set_version(Pointer version) {
        return this.gst_sdp_message_set_version(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(version));
    }

    @Ptr
    protected native long gst_sdp_message_as_text(
        @Ptr
        long msg);

    public Pointer as_text() {
        return Pointer.pointerToAddress(this.gst_sdp_message_as_text(Pointer.pointerTo(this, GstSDPMessage.class)));
    }

    @Ptr
    protected native long gst_sdp_message_get_media(
        @Ptr
        long msg, long idx);

    public Pointer<GstSDPMedia> get_media(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_media(Pointer.pointerTo(this, GstSDPMessage.class), idx), Pointer.class);
    }

    @Ptr
    protected native long gst_sdp_message_as_uri(
        @Ptr
        long scheme,
        @Ptr
        long msg);

    public Pointer as_uri(Pointer scheme, Pointer<GstSDPMessage> msg) {
        return Pointer.pointerToAddress(this.gst_sdp_message_as_uri(Pointer.getPeer(scheme), Pointer.getPeer(msg)));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_insert_bandwidth(
        @Ptr
        long msg, int idx,
        @Ptr
        long bw);

    public IntValuedEnum<GstSDPResult> insert_bandwidth(int idx, Pointer<GstSDPBandwidth> bw) {
        return this.gst_sdp_message_insert_bandwidth(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(bw));
    }

    @Ptr
    protected native long gst_sdp_message_get_connection(
        @Ptr
        long msg);

    public Pointer<GstSDPConnection> get_connection() {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_connection(Pointer.pointerTo(this, GstSDPMessage.class)), Pointer.class);
    }

    @Field(5)
    public GstSDPConnection field_connection() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstSDPMessage field_connection(GstSDPConnection field_connection) {
        this.io.setNativeObjectField(this, 5, field_connection);
        return this;
    }

    @Ptr
    protected native long gst_sdp_message_get_attribute_val(
        @Ptr
        long msg,
        @Ptr
        long key);

    public Pointer get_attribute_val(Pointer key) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_attribute_val(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(key)));
    }

    @Ptr
    protected native long gst_sdp_message_get_zone(
        @Ptr
        long msg, long idx);

    public Pointer<GstSDPZone> get_zone(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_zone(Pointer.pointerTo(this, GstSDPMessage.class), idx), Pointer.class);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_remove_phone(
        @Ptr
        long msg, long idx);

    public IntValuedEnum<GstSDPResult> remove_phone(long idx) {
        return this.gst_sdp_message_remove_phone(Pointer.pointerTo(this, GstSDPMessage.class), idx);
    }

    @Field(6)
    public GstSDPOrigin field_origin() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstSDPMessage field_origin(GstSDPOrigin field_origin) {
        this.io.setNativeObjectField(this, 6, field_origin);
        return this;
    }

    @Ptr
    protected native long gst_sdp_message_get_bandwidth(
        @Ptr
        long msg, long idx);

    public Pointer<GstSDPBandwidth> get_bandwidth(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_bandwidth(Pointer.pointerTo(this, GstSDPMessage.class), idx), Pointer.class);
    }

    @Ptr
    protected native long gst_sdp_message_get_phone(
        @Ptr
        long msg, long idx);

    public Pointer get_phone(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_phone(Pointer.pointerTo(this, GstSDPMessage.class), idx));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_set_session_name(
        @Ptr
        long msg,
        @Ptr
        long session_name);

    public IntValuedEnum<GstSDPResult> set_session_name(Pointer session_name) {
        return this.gst_sdp_message_set_session_name(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(session_name));
    }

    @Ptr
    protected native long gst_sdp_message_get_session_name(
        @Ptr
        long msg);

    public Pointer get_session_name() {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_session_name(Pointer.pointerTo(this, GstSDPMessage.class)));
    }

    protected native long gst_sdp_message_phones_len(
        @Ptr
        long msg);

    public long phones_len() {
        return this.gst_sdp_message_phones_len(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native long gst_sdp_message_attributes_len(
        @Ptr
        long msg);

    public long attributes_len() {
        return this.gst_sdp_message_attributes_len(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_new(
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> _new(Pointer<Pointer<GstSDPMessage>> msg) {
        return this.gst_sdp_message_new(Pointer.getPeer(msg));
    }

    protected native long gst_sdp_message_emails_len(
        @Ptr
        long msg);

    public long emails_len() {
        return this.gst_sdp_message_emails_len(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_remove_time(
        @Ptr
        long msg, long idx);

    public IntValuedEnum<GstSDPResult> remove_time(long idx) {
        return this.gst_sdp_message_remove_time(Pointer.pointerTo(this, GstSDPMessage.class), idx);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_insert_zone(
        @Ptr
        long msg, int idx,
        @Ptr
        long zone);

    public IntValuedEnum<GstSDPResult> insert_zone(int idx, Pointer<GstSDPZone> zone) {
        return this.gst_sdp_message_insert_zone(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(zone));
    }

    @Field(7)
    public Pointer field_bandwidths() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstSDPMessage field_bandwidths(Pointer field_bandwidths) {
        this.io.setPointerField(this, 7, field_bandwidths);
        return this;
    }

    protected native long gst_sdp_message_times_len(
        @Ptr
        long msg);

    public long times_len() {
        return this.gst_sdp_message_times_len(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_set_origin(
        @Ptr
        long msg,
        @Ptr
        long username,
        @Ptr
        long sess_id,
        @Ptr
        long sess_version,
        @Ptr
        long nettype,
        @Ptr
        long addrtype,
        @Ptr
        long addr);

    public IntValuedEnum<GstSDPResult> set_origin(Pointer username, Pointer sess_id, Pointer sess_version, Pointer nettype, Pointer addrtype, Pointer addr) {
        return this.gst_sdp_message_set_origin(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(username), Pointer.getPeer(sess_id), Pointer.getPeer(sess_version), Pointer.getPeer(nettype), Pointer.getPeer(addrtype), Pointer.getPeer(addr));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_replace_bandwidth(
        @Ptr
        long msg, long idx,
        @Ptr
        long bw);

    public IntValuedEnum<GstSDPResult> replace_bandwidth(long idx, Pointer<GstSDPBandwidth> bw) {
        return this.gst_sdp_message_replace_bandwidth(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(bw));
    }

    protected native long gst_sdp_message_bandwidths_len(
        @Ptr
        long msg);

    public long bandwidths_len() {
        return this.gst_sdp_message_bandwidths_len(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_remove_bandwidth(
        @Ptr
        long msg, long idx);

    public IntValuedEnum<GstSDPResult> remove_bandwidth(long idx) {
        return this.gst_sdp_message_remove_bandwidth(Pointer.pointerTo(this, GstSDPMessage.class), idx);
    }

    @Field(8)
    public Pointer field_medias() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstSDPMessage field_medias(Pointer field_medias) {
        this.io.setPointerField(this, 8, field_medias);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_add_media(
        @Ptr
        long msg,
        @Ptr
        long media);

    public IntValuedEnum<GstSDPResult> add_media(Pointer<GstSDPMedia> media) {
        return this.gst_sdp_message_add_media(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(media));
    }

    @Ptr
    protected native long gst_sdp_message_get_attribute(
        @Ptr
        long msg, long idx);

    public Pointer<GstSDPAttribute> get_attribute(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_attribute(Pointer.pointerTo(this, GstSDPMessage.class), idx), Pointer.class);
    }

    @Ptr
    protected native long gst_sdp_message_get_key(
        @Ptr
        long msg);

    public Pointer<GstSDPKey> get_key() {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_key(Pointer.pointerTo(this, GstSDPMessage.class)), Pointer.class);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_remove_email(
        @Ptr
        long msg, long idx);

    public IntValuedEnum<GstSDPResult> remove_email(long idx) {
        return this.gst_sdp_message_remove_email(Pointer.pointerTo(this, GstSDPMessage.class), idx);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_init(
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> init() {
        return this.gst_sdp_message_init(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    @Ptr
    protected native long gst_sdp_message_get_uri(
        @Ptr
        long msg);

    public Pointer get_uri() {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_uri(Pointer.pointerTo(this, GstSDPMessage.class)));
    }

    @Field(9)
    public Pointer field_phones() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstSDPMessage field_phones(Pointer field_phones) {
        this.io.setPointerField(this, 9, field_phones);
        return this;
    }

    protected native long gst_sdp_message_zones_len(
        @Ptr
        long msg);

    public long zones_len() {
        return this.gst_sdp_message_zones_len(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_add_phone(
        @Ptr
        long msg,
        @Ptr
        long phone);

    public IntValuedEnum<GstSDPResult> add_phone(Pointer phone) {
        return this.gst_sdp_message_add_phone(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(phone));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_uninit(
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> uninit() {
        return this.gst_sdp_message_uninit(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_set_key(
        @Ptr
        long msg,
        @Ptr
        long type,
        @Ptr
        long data);

    public IntValuedEnum<GstSDPResult> set_key(Pointer type, Pointer data) {
        return this.gst_sdp_message_set_key(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(type), Pointer.getPeer(data));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_add_email(
        @Ptr
        long msg,
        @Ptr
        long email);

    public IntValuedEnum<GstSDPResult> add_email(Pointer email) {
        return this.gst_sdp_message_add_email(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(email));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_add_time(
        @Ptr
        long msg,
        @Ptr
        long start,
        @Ptr
        long stop,
        @Ptr
        long repeat);

    public IntValuedEnum<GstSDPResult> add_time(Pointer start, Pointer stop, Pointer repeat) {
        return this.gst_sdp_message_add_time(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(start), Pointer.getPeer(stop), Pointer.getPeer(repeat));
    }

    @Field(10)
    public Pointer field_attributes() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstSDPMessage field_attributes(Pointer field_attributes) {
        this.io.setPointerField(this, 10, field_attributes);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_remove_zone(
        @Ptr
        long msg, long idx);

    public IntValuedEnum<GstSDPResult> remove_zone(long idx) {
        return this.gst_sdp_message_remove_zone(Pointer.pointerTo(this, GstSDPMessage.class), idx);
    }

    @Field(11)
    public Pointer field_information() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public GstSDPMessage field_information(Pointer field_information) {
        this.io.setPointerField(this, 11, field_information);
        return this;
    }

    @Field(12)
    public GstSDPKey field_key() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GstSDPMessage field_key(GstSDPKey field_key) {
        this.io.setNativeObjectField(this, 12, field_key);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_add_bandwidth(
        @Ptr
        long msg,
        @Ptr
        long bwtype, long bandwidth);

    public IntValuedEnum<GstSDPResult> add_bandwidth(Pointer bwtype, long bandwidth) {
        return this.gst_sdp_message_add_bandwidth(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(bwtype), bandwidth);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_replace_phone(
        @Ptr
        long msg, long idx,
        @Ptr
        long phone);

    public IntValuedEnum<GstSDPResult> replace_phone(long idx, Pointer phone) {
        return this.gst_sdp_message_replace_phone(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(phone));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_replace_attribute(
        @Ptr
        long msg, long idx,
        @Ptr
        long attr);

    public IntValuedEnum<GstSDPResult> replace_attribute(long idx, Pointer<GstSDPAttribute> attr) {
        return this.gst_sdp_message_replace_attribute(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(attr));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_parse_buffer(
        @Ptr
        long data, long size,
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> parse_buffer(Pointer<Short> data, long size, Pointer<GstSDPMessage> msg) {
        return this.gst_sdp_message_parse_buffer(Pointer.getPeer(data), size, Pointer.getPeer(msg));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_remove_attribute(
        @Ptr
        long msg, long idx);

    public IntValuedEnum<GstSDPResult> remove_attribute(long idx) {
        return this.gst_sdp_message_remove_attribute(Pointer.pointerTo(this, GstSDPMessage.class), idx);
    }

    @Ptr
    protected native long gst_sdp_message_get_time(
        @Ptr
        long msg, long idx);

    public Pointer<GstSDPTime> get_time(long idx) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_time(Pointer.pointerTo(this, GstSDPMessage.class), idx), Pointer.class);
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_set_uri(
        @Ptr
        long msg,
        @Ptr
        long uri);

    public IntValuedEnum<GstSDPResult> set_uri(Pointer uri) {
        return this.gst_sdp_message_set_uri(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(uri));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_parse_uri(
        @Ptr
        long uri,
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> parse_uri(Pointer uri, Pointer<GstSDPMessage> msg) {
        return this.gst_sdp_message_parse_uri(Pointer.getPeer(uri), Pointer.getPeer(msg));
    }

    @Ptr
    protected native long gst_sdp_message_get_information(
        @Ptr
        long msg);

    public Pointer get_information() {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_information(Pointer.pointerTo(this, GstSDPMessage.class)));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_set_information(
        @Ptr
        long msg,
        @Ptr
        long information);

    public IntValuedEnum<GstSDPResult> set_information(Pointer information) {
        return this.gst_sdp_message_set_information(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(information));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_replace_time(
        @Ptr
        long msg, long idx,
        @Ptr
        long t);

    public IntValuedEnum<GstSDPResult> replace_time(long idx, Pointer<GstSDPTime> t) {
        return this.gst_sdp_message_replace_time(Pointer.pointerTo(this, GstSDPMessage.class), idx, Pointer.getPeer(t));
    }

    @Ptr
    protected native long gst_sdp_message_get_attribute_val_n(
        @Ptr
        long msg,
        @Ptr
        long key, long nth);

    public Pointer get_attribute_val_n(Pointer key, long nth) {
        return Pointer.pointerToAddress(this.gst_sdp_message_get_attribute_val_n(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(key), nth));
    }

    protected native long gst_sdp_message_medias_len(
        @Ptr
        long msg);

    public long medias_len() {
        return this.gst_sdp_message_medias_len(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    @Field(13)
    public Pointer field_session_name() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public GstSDPMessage field_session_name(Pointer field_session_name) {
        this.io.setPointerField(this, 13, field_session_name);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_free(
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> free() {
        return this.gst_sdp_message_free(Pointer.pointerTo(this, GstSDPMessage.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_add_attribute(
        @Ptr
        long msg,
        @Ptr
        long key,
        @Ptr
        long value);

    public IntValuedEnum<GstSDPResult> add_attribute(Pointer key, Pointer value) {
        return this.gst_sdp_message_add_attribute(Pointer.pointerTo(this, GstSDPMessage.class), Pointer.getPeer(key), Pointer.getPeer(value));
    }

}
