
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstClock
    extends StructObject
{


    public GstClock() {
        super();
    }

    public GstClock(Pointer pointer) {
        super(pointer);
    }

    public native int gst_clock_id_compare_func(Pointer id1, Pointer id2);

    public native Object gst_clock_id_get_time(Object id);

    public native Object gst_clock_id_ref(Object id);

    public native void gst_clock_id_unref(Object id);

    public native void gst_clock_id_unschedule(Object id);

    protected native boolean gst_clock_add_observation(
        @Ptr
        long clock, Object slave, Object master,
        @Ptr
        long r_squared);

    public boolean add_observation(Object slave, Object master, Pointer<Double> r_squared) {
        return this.gst_clock_add_observation(Pointer.pointerTo(this, GstClock.class), slave, master, Pointer.getPeer(r_squared));
    }

    protected native Object gst_clock_adjust_unlocked(
        @Ptr
        long clock, Object internal);

    public Object adjust_unlocked(Object internal) {
        return this.gst_clock_adjust_unlocked(Pointer.pointerTo(this, GstClock.class), internal);
    }

    protected native void gst_clock_get_calibration(
        @Ptr
        long clock,
        @Ptr
        long internal,
        @Ptr
        long external,
        @Ptr
        long rate_num,
        @Ptr
        long rate_denom);

    public void get_calibration(Pointer<Object> internal, Pointer<Object> external, Pointer<Object> rate_num, Pointer<Object> rate_denom) {
        this.gst_clock_get_calibration(Pointer.pointerTo(this, GstClock.class), Pointer.getPeer(internal), Pointer.getPeer(external), Pointer.getPeer(rate_num), Pointer.getPeer(rate_denom));
    }

    protected native Object gst_clock_get_internal_time(
        @Ptr
        long clock);

    public Object get_internal_time() {
        return this.gst_clock_get_internal_time(Pointer.pointerTo(this, GstClock.class));
    }

    @Ptr
    protected native long gst_clock_get_master(
        @Ptr
        long clock);

    public Pointer get_master() {
        return Pointer.pointerToAddress(this.gst_clock_get_master(Pointer.pointerTo(this, GstClock.class)));
    }

    protected native Object gst_clock_get_resolution(
        @Ptr
        long clock);

    public Object get_resolution() {
        return this.gst_clock_get_resolution(Pointer.pointerTo(this, GstClock.class));
    }

    protected native Object gst_clock_get_time(
        @Ptr
        long clock);

    public Object get_time() {
        return this.gst_clock_get_time(Pointer.pointerTo(this, GstClock.class));
    }

    protected native Object gst_clock_get_timeout(
        @Ptr
        long clock);

    public Object get_timeout() {
        return this.gst_clock_get_timeout(Pointer.pointerTo(this, GstClock.class));
    }

    protected native Object gst_clock_new_periodic_id(
        @Ptr
        long clock, Object start_time, Object interval);

    public Object new_periodic_id(Object start_time, Object interval) {
        return this.gst_clock_new_periodic_id(Pointer.pointerTo(this, GstClock.class), start_time, interval);
    }

    protected native Object gst_clock_new_single_shot_id(
        @Ptr
        long clock, Object time);

    public Object new_single_shot_id(Object time) {
        return this.gst_clock_new_single_shot_id(Pointer.pointerTo(this, GstClock.class), time);
    }

    protected native boolean gst_clock_periodic_id_reinit(
        @Ptr
        long clock, Object id, Object start_time, Object interval);

    public boolean periodic_id_reinit(Object id, Object start_time, Object interval) {
        return this.gst_clock_periodic_id_reinit(Pointer.pointerTo(this, GstClock.class), id, start_time, interval);
    }

    protected native void gst_clock_set_calibration(
        @Ptr
        long clock, Object internal, Object external, Object rate_num, Object rate_denom);

    public void set_calibration(Object internal, Object external, Object rate_num, Object rate_denom) {
        this.gst_clock_set_calibration(Pointer.pointerTo(this, GstClock.class), internal, external, rate_num, rate_denom);
    }

    protected native boolean gst_clock_set_master(
        @Ptr
        long clock,
        @Ptr
        long master);

    public boolean set_master(Pointer master) {
        return this.gst_clock_set_master(Pointer.pointerTo(this, GstClock.class), Pointer.getPeer(master));
    }

    protected native Object gst_clock_set_resolution(
        @Ptr
        long clock, Object resolution);

    public Object set_resolution(Object resolution) {
        return this.gst_clock_set_resolution(Pointer.pointerTo(this, GstClock.class), resolution);
    }

    protected native void gst_clock_set_timeout(
        @Ptr
        long clock, Object timeout);

    public void set_timeout(Object timeout) {
        this.gst_clock_set_timeout(Pointer.pointerTo(this, GstClock.class), timeout);
    }

    protected native boolean gst_clock_single_shot_id_reinit(
        @Ptr
        long clock, Object id, Object time);

    public boolean single_shot_id_reinit(Object id, Object time) {
        return this.gst_clock_single_shot_id_reinit(Pointer.pointerTo(this, GstClock.class), id, time);
    }

    protected native Object gst_clock_unadjust_unlocked(
        @Ptr
        long clock, Object external);

    public Object unadjust_unlocked(Object external) {
        return this.gst_clock_unadjust_unlocked(Pointer.pointerTo(this, GstClock.class), external);
    }

    @Field(0)
    public Pointer<GstClockPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstClock field_priv(Pointer<GstClockPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstClock field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 1, field_object);
        return this;
    }

    protected native IntValuedEnum<GstClockReturn> gst_clock_id_wait(Object id,
        @Ptr
        long jitter);

    public IntValuedEnum<GstClockReturn> id_wait(Object id, Pointer<Object> jitter) {
        return this.gst_clock_id_wait(id, Pointer.getPeer(jitter));
    }

    public native IntValuedEnum<GstClockReturn> gst_clock_id_wait_async(Object id, Object func, Pointer user_data, Object destroy_data);

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstClock field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
