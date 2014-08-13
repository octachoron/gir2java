
package generated.gstreamersdp10.gstsdp;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-sdp-1.0")
public class GstSDPKey
    extends StructObject
{


    public GstSDPKey() {
        super();
    }

    public GstSDPKey(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_type() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPKey field_type(Pointer field_type) {
        this.io.setPointerField(this, 0, field_type);
        return this;
    }

    @Field(1)
    public Pointer field_data() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSDPKey field_data(Pointer field_data) {
        this.io.setPointerField(this, 1, field_data);
        return this;
    }

}
