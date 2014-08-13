
package generated.gstreamerrtsp10.gstrtsp;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPTime2
    extends StructObject
{


    public GstRTSPTime2() {
        super();
    }

    public GstRTSPTime2(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public double field_frames() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTSPTime2 field_frames(double field_frames) {
        this.io.setNativeObjectField(this, 0, field_frames);
        return this;
    }

    @Field(1)
    public long field_year() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTSPTime2 field_year(long field_year) {
        this.io.setNativeObjectField(this, 1, field_year);
        return this;
    }

    @Field(2)
    public long field_month() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstRTSPTime2 field_month(long field_month) {
        this.io.setNativeObjectField(this, 2, field_month);
        return this;
    }

    @Field(3)
    public long field_day() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstRTSPTime2 field_day(long field_day) {
        this.io.setNativeObjectField(this, 3, field_day);
        return this;
    }

}
