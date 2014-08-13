
package generated.gstreamersdp10.gstsdp;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-sdp-1.0")
public class GstSDPOrigin
    extends StructObject
{


    public GstSDPOrigin() {
        super();
    }

    public GstSDPOrigin(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_username() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPOrigin field_username(Pointer field_username) {
        this.io.setPointerField(this, 0, field_username);
        return this;
    }

    @Field(1)
    public Pointer field_sess_id() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSDPOrigin field_sess_id(Pointer field_sess_id) {
        this.io.setPointerField(this, 1, field_sess_id);
        return this;
    }

    @Field(2)
    public Pointer field_sess_version() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstSDPOrigin field_sess_version(Pointer field_sess_version) {
        this.io.setPointerField(this, 2, field_sess_version);
        return this;
    }

    @Field(3)
    public Pointer field_nettype() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstSDPOrigin field_nettype(Pointer field_nettype) {
        this.io.setPointerField(this, 3, field_nettype);
        return this;
    }

    @Field(4)
    public Pointer field_addrtype() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstSDPOrigin field_addrtype(Pointer field_addrtype) {
        this.io.setPointerField(this, 4, field_addrtype);
        return this;
    }

    @Field(5)
    public Pointer field_addr() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstSDPOrigin field_addr(Pointer field_addr) {
        this.io.setPointerField(this, 5, field_addr);
        return this;
    }

}
