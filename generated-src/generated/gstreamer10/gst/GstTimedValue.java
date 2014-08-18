
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstTimedValue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstTimedValue() {
        super();
    }

    public GstTimedValue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_timestamp() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstTimedValue field_timestamp(long field_timestamp) {
        this.io.setLongField(this, 0, field_timestamp);
        return this;
    }

    @Field(1)
    public double field_value() {
        return this.io.getDoubleField(this, 1);
    }

    @Field(1)
    public GstTimedValue field_value(double field_value) {
        this.io.setDoubleField(this, 1, field_value);
        return this;
    }

}
