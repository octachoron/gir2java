
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstTimedValue
    extends StructObject
{


    public GstTimedValue() {
        super();
    }

    public GstTimedValue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_timestamp() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTimedValue field_timestamp(Object field_timestamp) {
        this.io.setNativeObjectField(this, 0, field_timestamp);
        return this;
    }

    @Field(1)
    public double field_value() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstTimedValue field_value(double field_value) {
        this.io.setNativeObjectField(this, 1, field_value);
        return this;
    }

}
