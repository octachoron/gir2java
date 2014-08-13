
package generated.gstreamerrtp10.gstrtp;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMapInfo;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtp-1.0")
public class GstRTCPBuffer
    extends StructObject
{


    public GstRTCPBuffer() {
        super();
    }

    public GstRTCPBuffer(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstBuffer> field_buffer() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstRTCPBuffer field_buffer(Pointer<GstBuffer> field_buffer) {
        this.io.setPointerField(this, 0, field_buffer);
        return this;
    }

    @Field(1)
    public GstMapInfo field_map() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTCPBuffer field_map(GstMapInfo field_map) {
        this.io.setNativeObjectField(this, 1, field_map);
        return this;
    }

    protected native boolean gst_rtcp_buffer_get_first_packet(
        @Ptr
        long rtcp,
        @Ptr
        long packet);

    public boolean get_first_packet(Pointer packet) {
        return this.gst_rtcp_buffer_get_first_packet(Pointer.pointerTo(this, GstRTCPBuffer.class), Pointer.getPeer(packet));
    }

    protected native long gst_rtcp_buffer_get_packet_count(
        @Ptr
        long rtcp);

    public long get_packet_count() {
        return this.gst_rtcp_buffer_get_packet_count(Pointer.pointerTo(this, GstRTCPBuffer.class));
    }

    protected native boolean gst_rtcp_buffer_unmap(
        @Ptr
        long rtcp);

    public boolean unmap() {
        return this.gst_rtcp_buffer_unmap(Pointer.pointerTo(this, GstRTCPBuffer.class));
    }

    protected native boolean gst_rtcp_buffer_map(
        @Ptr
        long buffer, Object flags,
        @Ptr
        long rtcp);

    public boolean map(Pointer<GstBuffer> buffer, Object flags, Pointer rtcp) {
        return this.gst_rtcp_buffer_map(Pointer.getPeer(buffer), flags, Pointer.getPeer(rtcp));
    }

    @Ptr
    protected native long gst_rtcp_buffer_new(long mtu);

    public Pointer<GstBuffer> _new(long mtu) {
        return Pointer.pointerToAddress(this.gst_rtcp_buffer_new(mtu), Pointer.class);
    }

    @Ptr
    protected native long gst_rtcp_buffer_new_copy_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> new_copy_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtcp_buffer_new_copy_data(Pointer.getPeer(data), len), Pointer.class);
    }

    @Ptr
    protected native long gst_rtcp_buffer_new_take_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> new_take_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtcp_buffer_new_take_data(Pointer.getPeer(data), len), Pointer.class);
    }

    protected native boolean gst_rtcp_buffer_validate(
        @Ptr
        long buffer);

    public boolean validate(Pointer<GstBuffer> buffer) {
        return this.gst_rtcp_buffer_validate(Pointer.getPeer(buffer));
    }

    protected native boolean gst_rtcp_buffer_validate_data(
        @Ptr
        long data, long len);

    public boolean validate_data(short data, long len) {
        return this.gst_rtcp_buffer_validate_data(Pointer.getPeer(data), len);
    }

    protected native boolean gst_rtcp_buffer_add_packet(
        @Ptr
        long rtcp, IntValuedEnum<GstRTCPType> type,
        @Ptr
        long packet);

    public boolean add_packet(IntValuedEnum<GstRTCPType> type, Pointer<GstRTCPPacket> packet) {
        return this.gst_rtcp_buffer_add_packet(Pointer.pointerTo(this, GstRTCPBuffer.class), type, Pointer.getPeer(packet));
    }

}
