
package generated.gstreamerrtp10.gstrtp;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtp-1.0")
public class GstRTPPayloadInfo
    extends StructObject
{


    public GstRTPPayloadInfo() {
        super();
    }

    public GstRTPPayloadInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public short field_payload_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTPPayloadInfo field_payload_type(short field_payload_type) {
        this.io.setNativeObjectField(this, 0, field_payload_type);
        return this;
    }

    @Field(1)
    public Pointer field_media() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstRTPPayloadInfo field_media(Pointer field_media) {
        this.io.setPointerField(this, 1, field_media);
        return this;
    }

    @Field(2)
    public Pointer field_encoding_name() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstRTPPayloadInfo field_encoding_name(Pointer field_encoding_name) {
        this.io.setPointerField(this, 2, field_encoding_name);
        return this;
    }

    @Field(3)
    public long field_clock_rate() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstRTPPayloadInfo field_clock_rate(long field_clock_rate) {
        this.io.setNativeObjectField(this, 3, field_clock_rate);
        return this;
    }

    @Field(4)
    public Pointer field_encoding_parameters() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstRTPPayloadInfo field_encoding_parameters(Pointer field_encoding_parameters) {
        this.io.setPointerField(this, 4, field_encoding_parameters);
        return this;
    }

    @Field(5)
    public long field_bitrate() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstRTPPayloadInfo field_bitrate(long field_bitrate) {
        this.io.setNativeObjectField(this, 5, field_bitrate);
        return this;
    }

    @Field(6)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstRTPPayloadInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 6, field__gst_reserved);
        return this;
    }

    @Ptr
    protected native long gst_rtp_payload_info_for_name(
        @Ptr
        long media,
        @Ptr
        long encoding_name);

    public Pointer for_name(Pointer media, Pointer encoding_name) {
        return Pointer.pointerToAddress(this.gst_rtp_payload_info_for_name(Pointer.getPeer(media), Pointer.getPeer(encoding_name)));
    }

    @Ptr
    protected native long gst_rtp_payload_info_for_pt(short payload_type);

    public Pointer for_pt(short payload_type) {
        return Pointer.pointerToAddress(this.gst_rtp_payload_info_for_pt(payload_type));
    }

}
