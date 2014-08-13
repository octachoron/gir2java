
package generated.gstreamerrtsp10.gstrtsp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPTime
    extends StructObject
{


    public GstRTSPTime() {
        super();
    }

    public GstRTSPTime(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstRTSPTimeType> field_type() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstRTSPTime field_type(IntValuedEnum<GstRTSPTimeType> field_type) {
        this.io.setEnumField(this, 0, field_type);
        return this;
    }

    @Field(1)
    public double field_seconds() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTSPTime field_seconds(double field_seconds) {
        this.io.setNativeObjectField(this, 1, field_seconds);
        return this;
    }

}
