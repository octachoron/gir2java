
package generated.gstreamersdp10.gstsdp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-sdp-1.0")
public class GstSDPConnection
    extends StructObject
{


    public GstSDPConnection() {
        super();
    }

    public GstSDPConnection(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_nettype() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPConnection field_nettype(Pointer field_nettype) {
        this.io.setPointerField(this, 0, field_nettype);
        return this;
    }

    @Field(1)
    public Pointer field_addrtype() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSDPConnection field_addrtype(Pointer field_addrtype) {
        this.io.setPointerField(this, 1, field_addrtype);
        return this;
    }

    @Field(2)
    public Pointer field_address() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstSDPConnection field_address(Pointer field_address) {
        this.io.setPointerField(this, 2, field_address);
        return this;
    }

    @Field(3)
    public long field_ttl() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstSDPConnection field_ttl(long field_ttl) {
        this.io.setNativeObjectField(this, 3, field_ttl);
        return this;
    }

    @Field(4)
    public long field_addr_number() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstSDPConnection field_addr_number(long field_addr_number) {
        this.io.setNativeObjectField(this, 4, field_addr_number);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_connection_clear(
        @Ptr
        long conn);

    public IntValuedEnum<GstSDPResult> clear() {
        return this.gst_sdp_connection_clear(Pointer.pointerTo(this, GstSDPConnection.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_connection_set(
        @Ptr
        long conn,
        @Ptr
        long nettype,
        @Ptr
        long addrtype,
        @Ptr
        long address, long ttl, long addr_number);

    public IntValuedEnum<GstSDPResult> set(Pointer nettype, Pointer addrtype, Pointer address, long ttl, long addr_number) {
        return this.gst_sdp_connection_set(Pointer.pointerTo(this, GstSDPConnection.class), Pointer.getPeer(nettype), Pointer.getPeer(addrtype), Pointer.getPeer(address), ttl, addr_number);
    }

}
