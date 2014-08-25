
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstClockEntry
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstClockEntry() {
        super();
    }

    public GstClockEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gstclockentry_field_refcount() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GstClockEntry gstclockentry_field_refcount(int gstclockentry_field_refcount) {
        this.io.setIntField(this, 0, gstclockentry_field_refcount);
        return this;
    }

    @Field(1)
    public Pointer<GstClock> gstclockentry_field_clock() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstClockEntry gstclockentry_field_clock(Pointer<GstClock> gstclockentry_field_clock) {
        this.io.setPointerField(this, 1, gstclockentry_field_clock);
        return this;
    }

    @Field(2)
    public boolean gstclockentry_field_woken_up() {
        return this.io.getBooleanField(this, 2);
    }

    @Field(2)
    public GstClockEntry gstclockentry_field_woken_up(boolean gstclockentry_field_woken_up) {
        this.io.setBooleanField(this, 2, gstclockentry_field_woken_up);
        return this;
    }

    @Field(3)
    private Pointer gstclockentry_field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstClockEntry gstclockentry_field__gst_reserved(Pointer gstclockentry_field__gst_reserved) {
        this.io.setPointerField(this, 3, gstclockentry_field__gst_reserved);
        return this;
    }

    @Field(4)
    public long gstclockentry_field_time() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstClockEntry gstclockentry_field_time(long gstclockentry_field_time) {
        this.io.setLongField(this, 4, gstclockentry_field_time);
        return this;
    }

    @Field(5)
    public Pointer gstclockentry_field_func() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstClockEntry gstclockentry_field_func(Pointer gstclockentry_field_func) {
        this.io.setPointerField(this, 5, gstclockentry_field_func);
        return this;
    }

    @Field(6)
    public IntValuedEnum<GstClockEntryType> gstclockentry_field_type() {
        return this.io.getEnumField(this, 6);
    }

    @Field(6)
    public GstClockEntry gstclockentry_field_type(IntValuedEnum<GstClockEntryType> gstclockentry_field_type) {
        this.io.setEnumField(this, 6, gstclockentry_field_type);
        return this;
    }

    @Field(7)
    public long gstclockentry_field_interval() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstClockEntry gstclockentry_field_interval(long gstclockentry_field_interval) {
        this.io.setLongField(this, 7, gstclockentry_field_interval);
        return this;
    }

    @Field(8)
    public boolean gstclockentry_field_unscheduled() {
        return this.io.getBooleanField(this, 8);
    }

    @Field(8)
    public GstClockEntry gstclockentry_field_unscheduled(boolean gstclockentry_field_unscheduled) {
        this.io.setBooleanField(this, 8, gstclockentry_field_unscheduled);
        return this;
    }

    @Field(9)
    public IntValuedEnum<GstClockReturn> gstclockentry_field_status() {
        return this.io.getEnumField(this, 9);
    }

    @Field(9)
    public GstClockEntry gstclockentry_field_status(IntValuedEnum<GstClockReturn> gstclockentry_field_status) {
        this.io.setEnumField(this, 9, gstclockentry_field_status);
        return this;
    }

    @Field(10)
    public Pointer gstclockentry_field_user_data() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstClockEntry gstclockentry_field_user_data(Pointer gstclockentry_field_user_data) {
        this.io.setPointerField(this, 10, gstclockentry_field_user_data);
        return this;
    }

    @Field(11)
    public Pointer gstclockentry_field_destroy_data() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public GstClockEntry gstclockentry_field_destroy_data(Pointer gstclockentry_field_destroy_data) {
        this.io.setPointerField(this, 11, gstclockentry_field_destroy_data);
        return this;
    }

}
