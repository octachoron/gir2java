
package generated.gstreamerbase10.gstbase;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstDataQueueSize
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstDataQueueSize() {
        super();
    }

    public GstDataQueueSize(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gstdataqueuesize_field_visible() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstDataQueueSize gstdataqueuesize_field_visible(long gstdataqueuesize_field_visible) {
        this.io.setLongField(this, 0, gstdataqueuesize_field_visible);
        return this;
    }

    @Field(1)
    public long gstdataqueuesize_field_bytes() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstDataQueueSize gstdataqueuesize_field_bytes(long gstdataqueuesize_field_bytes) {
        this.io.setLongField(this, 1, gstdataqueuesize_field_bytes);
        return this;
    }

    @Field(2)
    public long gstdataqueuesize_field_time() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstDataQueueSize gstdataqueuesize_field_time(long gstdataqueuesize_field_time) {
        this.io.setLongField(this, 2, gstdataqueuesize_field_time);
        return this;
    }

}
