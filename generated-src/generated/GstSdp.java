
package generated;

import generated.gstreamersdp10.gstsdp.GstSDPMedia;
import generated.gstreamersdp10.gstsdp.GstSDPMessage;
import generated.gstreamersdp10.gstsdp.GstSDPResult;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstSdp {


    protected native boolean gst_sdp_address_is_multicast(
        @Ptr
        long nettype,
        @Ptr
        long addrtype,
        @Ptr
        long addr);

    public boolean sdp_address_is_multicast(Pointer nettype, Pointer addrtype, Pointer addr) {
        return this.gst_sdp_address_is_multicast(Pointer.getPeer(nettype), Pointer.getPeer(addrtype), Pointer.getPeer(addr));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_media_new(
        @Ptr
        long media);

    public IntValuedEnum<GstSDPResult> sdp_media_new(Pointer<Pointer<GstSDPMedia>> media) {
        return this.gst_sdp_media_new(Pointer.getPeer(media));
    }

    @Ptr
    protected native long gst_sdp_message_as_uri(
        @Ptr
        long scheme,
        @Ptr
        long msg);

    public Pointer sdp_message_as_uri(Pointer scheme, Pointer<GstSDPMessage> msg) {
        return Pointer.pointerToAddress(this.gst_sdp_message_as_uri(Pointer.getPeer(scheme), Pointer.getPeer(msg)));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_new(
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> sdp_message_new(Pointer<Pointer<GstSDPMessage>> msg) {
        return this.gst_sdp_message_new(Pointer.getPeer(msg));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_parse_buffer(
        @Ptr
        long data, long size,
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> sdp_message_parse_buffer(Pointer<Short> data, long size, Pointer<GstSDPMessage> msg) {
        return this.gst_sdp_message_parse_buffer(Pointer.getPeer(data), size, Pointer.getPeer(msg));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_message_parse_uri(
        @Ptr
        long uri,
        @Ptr
        long msg);

    public IntValuedEnum<GstSDPResult> sdp_message_parse_uri(Pointer uri, Pointer<GstSDPMessage> msg) {
        return this.gst_sdp_message_parse_uri(Pointer.getPeer(uri), Pointer.getPeer(msg));
    }

}
