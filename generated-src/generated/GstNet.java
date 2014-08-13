
package generated;

import generated.gio20.gio.GSocket;
import generated.gio20.gio.GSocketAddress;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMetaInfo;
import generated.gstreamernet10.gstnet.GstNetAddressMeta;
import generated.gstreamernet10.gstnet.GstNetTimePacket;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstNet {


    @Ptr
    protected native long gst_buffer_add_net_address_meta(
        @Ptr
        long buffer,
        @Ptr
        long addr);

    public Pointer<GstNetAddressMeta> buffer_add_net_address_meta(Pointer<GstBuffer> buffer, Pointer<GSocketAddress> addr) {
        return Pointer.pointerToAddress(this.gst_buffer_add_net_address_meta(Pointer.getPeer(buffer), Pointer.getPeer(addr)), Pointer.class);
    }

    public native long gst_net_address_meta_api_get_type();

    @Ptr
    protected native long gst_net_address_meta_get_info();

    public Pointer<GstMetaInfo> net_address_meta_get_info() {
        return Pointer.pointerToAddress(this.gst_net_address_meta_get_info(), Pointer.class);
    }

    @Ptr
    protected native long gst_net_time_packet_receive(
        @Ptr
        long socket,
        @Ptr
        long src_address);

    public Pointer<GstNetTimePacket> net_time_packet_receive(Pointer<GSocket> socket, Pointer<Pointer<GSocketAddress>> src_address) {
        return Pointer.pointerToAddress(this.gst_net_time_packet_receive(Pointer.getPeer(socket), Pointer.getPeer(src_address)), Pointer.class);
    }

}
