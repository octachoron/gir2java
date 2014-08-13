
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstClockEntry
    extends StructObject
{


    public GstClockEntry() {
        super();
    }

    public GstClockEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_refcount() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstClockEntry field_refcount(int field_refcount) {
        this.io.setNativeObjectField(this, 0, field_refcount);
        return this;
    }

    @Field(1)
    public Pointer<GstClock> field_clock() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstClockEntry field_clock(Pointer<GstClock> field_clock) {
        this.io.setPointerField(this, 1, field_clock);
        return this;
    }

    @Field(2)
    public Object field_interval() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstClockEntry field_interval(Object field_interval) {
        this.io.setNativeObjectField(this, 2, field_interval);
        return this;
    }

    @Field(3)
    public boolean field_unscheduled() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstClockEntry field_unscheduled(boolean field_unscheduled) {
        this.io.setNativeObjectField(this, 3, field_unscheduled);
        return this;
    }

    @Field(4)
    public Object field_destroy_data() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstClockEntry field_destroy_data(Object field_destroy_data) {
        this.io.setNativeObjectField(this, 4, field_destroy_data);
        return this;
    }

    @Field(5)
    public Object field_func() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstClockEntry field_func(Object field_func) {
        this.io.setNativeObjectField(this, 5, field_func);
        return this;
    }

    @Field(6)
    public IntValuedEnum<GstClockEntryType> field_type() {
        return this.io.getEnumField(this, 6);
    }

    @Field(6)
    public GstClockEntry field_type(IntValuedEnum<GstClockEntryType> field_type) {
        this.io.setEnumField(this, 6, field_type);
        return this;
    }

    @Field(7)
    public Pointer field_user_data() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstClockEntry field_user_data(Pointer field_user_data) {
        this.io.setNativeObjectField(this, 7, field_user_data);
        return this;
    }

    @Field(8)
    public Object field_time() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstClockEntry field_time(Object field_time) {
        this.io.setNativeObjectField(this, 8, field_time);
        return this;
    }

    @Field(9)
    public boolean field_woken_up() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstClockEntry field_woken_up(boolean field_woken_up) {
        this.io.setNativeObjectField(this, 9, field_woken_up);
        return this;
    }

    @Field(10)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstClockEntry field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 10, field__gst_reserved);
        return this;
    }

    @Field(11)
    public IntValuedEnum<GstClockReturn> field_status() {
        return this.io.getEnumField(this, 11);
    }

    @Field(11)
    public GstClockEntry field_status(IntValuedEnum<GstClockReturn> field_status) {
        this.io.setEnumField(this, 11, field_status);
        return this;
    }

}
