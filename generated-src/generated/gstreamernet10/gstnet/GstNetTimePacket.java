
package generated.gstreamernet10.gstnet;

import generated.gio20.gio.GSocket;
import generated.gio20.gio.GSocketAddress;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-net-1.0")
public class GstNetTimePacket
    extends StructObject
{


    public GstNetTimePacket() {
        super();
    }

    public GstNetTimePacket(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_local_time() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstNetTimePacket field_local_time(Object field_local_time) {
        this.io.setNativeObjectField(this, 0, field_local_time);
        return this;
    }

    @Field(1)
    public Object field_remote_time() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstNetTimePacket field_remote_time(Object field_remote_time) {
        this.io.setNativeObjectField(this, 1, field_remote_time);
        return this;
    }

    @Ptr
    protected native long gst_net_time_packet_copy(
        @Ptr
        long packet);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_net_time_packet_copy(Pointer.pointerTo(this, GstNetTimePacket.class)));
    }

    protected native void gst_net_time_packet_free(
        @Ptr
        long packet);

    public void free() {
        this.gst_net_time_packet_free(Pointer.pointerTo(this, GstNetTimePacket.class));
    }

    protected native boolean gst_net_time_packet_send(
        @Ptr
        long packet,
        @Ptr
        long socket,
        @Ptr
        long dest_address);

    public boolean send(Pointer<GSocket> socket, Pointer<GSocketAddress> dest_address) {
        return this.gst_net_time_packet_send(Pointer.pointerTo(this, GstNetTimePacket.class), Pointer.getPeer(socket), Pointer.getPeer(dest_address));
    }

    @Ptr
    protected native long gst_net_time_packet_serialize(
        @Ptr
        long packet);

    public Pointer<Short> serialize() {
        return Pointer.pointerToAddress(this.gst_net_time_packet_serialize(Pointer.pointerTo(this, GstNetTimePacket.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_net_time_packet_receive(
        @Ptr
        long socket,
        @Ptr
        long src_address);

    public Pointer receive(Pointer<GSocket> socket, Pointer<Pointer<GSocketAddress>> src_address) {
        return Pointer.pointerToAddress(this.gst_net_time_packet_receive(Pointer.getPeer(socket), Pointer.getPeer(src_address)));
    }

}
