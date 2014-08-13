
package generated.gstreamerrtsp10.gstrtsp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPTimeRange
    extends StructObject
{


    public GstRTSPTimeRange() {
        super();
    }

    public GstRTSPTimeRange(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstRTSPRangeUnit> field_unit() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstRTSPTimeRange field_unit(IntValuedEnum<GstRTSPRangeUnit> field_unit) {
        this.io.setEnumField(this, 0, field_unit);
        return this;
    }

    @Field(1)
    public GstRTSPTime field_min() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTSPTimeRange field_min(GstRTSPTime field_min) {
        this.io.setNativeObjectField(this, 1, field_min);
        return this;
    }

    @Field(2)
    public GstRTSPTime field_max() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstRTSPTimeRange field_max(GstRTSPTime field_max) {
        this.io.setNativeObjectField(this, 2, field_max);
        return this;
    }

    @Field(3)
    public GstRTSPTime2 field_min2() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstRTSPTimeRange field_min2(GstRTSPTime2 field_min2) {
        this.io.setNativeObjectField(this, 3, field_min2);
        return this;
    }

    @Field(4)
    public GstRTSPTime2 field_max2() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstRTSPTimeRange field_max2(GstRTSPTime2 field_max2) {
        this.io.setNativeObjectField(this, 4, field_max2);
        return this;
    }

}
