
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstClock
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstClock() {
        super();
    }

    public GstClock(Pointer pointer) {
        super(pointer);
    }

    protected static native int gst_clock_id_compare_func(
        @Ptr
        long id1,
        @Ptr
        long id2);

    public static int id_compare_func(Pointer id1, Pointer id2) {
        return GstClock.gst_clock_id_compare_func(Pointer.getPeer(id1), Pointer.getPeer(id2));
    }

    protected static native long gst_clock_id_get_time(
        @Ptr
        long id);

    public static long id_get_time(Pointer id) {
        return GstClock.gst_clock_id_get_time(Pointer.getPeer(id));
    }

    @Ptr
    protected static native long gst_clock_id_ref(
        @Ptr
        long id);

    public static Pointer id_ref(Pointer id) {
        return Pointer.pointerToAddress(GstClock.gst_clock_id_ref(Pointer.getPeer(id)));
    }

    protected static native void gst_clock_id_unref(
        @Ptr
        long id);

    public static void id_unref(Pointer id) {
        GstClock.gst_clock_id_unref(Pointer.getPeer(id));
    }

    protected static native void gst_clock_id_unschedule(
        @Ptr
        long id);

    public static void id_unschedule(Pointer id) {
        GstClock.gst_clock_id_unschedule(Pointer.getPeer(id));
    }

    protected static native IntValuedEnum<GstClockReturn> gst_clock_id_wait(
        @Ptr
        long id,
        @Ptr
        long jitter);

    public static IntValuedEnum<GstClockReturn> id_wait(Pointer id, Pointer<Long> jitter) {
        return GstClock.gst_clock_id_wait(Pointer.getPeer(id), Pointer.getPeer(jitter));
    }

    protected static native IntValuedEnum<GstClockReturn> gst_clock_id_wait_async(
        @Ptr
        long id,
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long destroy_data);

    public static IntValuedEnum<GstClockReturn> id_wait_async(Pointer id, Pointer func, Pointer user_data, Pointer destroy_data) {
        return GstClock.gst_clock_id_wait_async(Pointer.getPeer(id), Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(destroy_data));
    }

    protected native boolean gst_clock_add_observation(
        @Ptr
        long clock, long slave, long master,
        @Ptr
        long r_squared);

    public boolean add_observation(long slave, long master, Pointer<Double> r_squared) {
        return this.gst_clock_add_observation(Pointer.pointerTo(this, GstClock.class).getPeer(), slave, master, Pointer.getPeer(r_squared));
    }

    protected native long gst_clock_adjust_unlocked(
        @Ptr
        long clock, long internal);

    public long adjust_unlocked(long internal) {
        return this.gst_clock_adjust_unlocked(Pointer.pointerTo(this, GstClock.class).getPeer(), internal);
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

    public void get_calibration(Pointer<Long> internal, Pointer<Long> external, Pointer<Long> rate_num, Pointer<Long> rate_denom) {
        this.gst_clock_get_calibration(Pointer.pointerTo(this, GstClock.class).getPeer(), Pointer.getPeer(internal), Pointer.getPeer(external), Pointer.getPeer(rate_num), Pointer.getPeer(rate_denom));
    }

    protected native long gst_clock_get_internal_time(
        @Ptr
        long clock);

    public long get_internal_time() {
        return this.gst_clock_get_internal_time(Pointer.pointerTo(this, GstClock.class).getPeer());
    }

    @Ptr
    protected native long gst_clock_get_master(
        @Ptr
        long clock);

    public Pointer get_master() {
        return Pointer.pointerToAddress(this.gst_clock_get_master(Pointer.pointerTo(this, GstClock.class).getPeer()));
    }

    protected native long gst_clock_get_resolution(
        @Ptr
        long clock);

    public long get_resolution() {
        return this.gst_clock_get_resolution(Pointer.pointerTo(this, GstClock.class).getPeer());
    }

    protected native long gst_clock_get_time(
        @Ptr
        long clock);

    public long get_time() {
        return this.gst_clock_get_time(Pointer.pointerTo(this, GstClock.class).getPeer());
    }

    protected native long gst_clock_get_timeout(
        @Ptr
        long clock);

    public long get_timeout() {
        return this.gst_clock_get_timeout(Pointer.pointerTo(this, GstClock.class).getPeer());
    }

    @Ptr
    protected native long gst_clock_new_periodic_id(
        @Ptr
        long clock, long start_time, long interval);

    public Pointer new_periodic_id(long start_time, long interval) {
        return Pointer.pointerToAddress(this.gst_clock_new_periodic_id(Pointer.pointerTo(this, GstClock.class).getPeer(), start_time, interval));
    }

    @Ptr
    protected native long gst_clock_new_single_shot_id(
        @Ptr
        long clock, long time);

    public Pointer new_single_shot_id(long time) {
        return Pointer.pointerToAddress(this.gst_clock_new_single_shot_id(Pointer.pointerTo(this, GstClock.class).getPeer(), time));
    }

    protected native boolean gst_clock_periodic_id_reinit(
        @Ptr
        long clock,
        @Ptr
        long id, long start_time, long interval);

    public boolean periodic_id_reinit(Pointer id, long start_time, long interval) {
        return this.gst_clock_periodic_id_reinit(Pointer.pointerTo(this, GstClock.class).getPeer(), Pointer.getPeer(id), start_time, interval);
    }

    protected native void gst_clock_set_calibration(
        @Ptr
        long clock, long internal, long external, long rate_num, long rate_denom);

    public void set_calibration(long internal, long external, long rate_num, long rate_denom) {
        this.gst_clock_set_calibration(Pointer.pointerTo(this, GstClock.class).getPeer(), internal, external, rate_num, rate_denom);
    }

    protected native boolean gst_clock_set_master(
        @Ptr
        long clock,
        @Ptr
        long master);

    public boolean set_master(Pointer master) {
        return this.gst_clock_set_master(Pointer.pointerTo(this, GstClock.class).getPeer(), Pointer.getPeer(master));
    }

    protected native long gst_clock_set_resolution(
        @Ptr
        long clock, long resolution);

    public long set_resolution(long resolution) {
        return this.gst_clock_set_resolution(Pointer.pointerTo(this, GstClock.class).getPeer(), resolution);
    }

    protected native void gst_clock_set_timeout(
        @Ptr
        long clock, long timeout);

    public void set_timeout(long timeout) {
        this.gst_clock_set_timeout(Pointer.pointerTo(this, GstClock.class).getPeer(), timeout);
    }

    protected native boolean gst_clock_single_shot_id_reinit(
        @Ptr
        long clock,
        @Ptr
        long id, long time);

    public boolean single_shot_id_reinit(Pointer id, long time) {
        return this.gst_clock_single_shot_id_reinit(Pointer.pointerTo(this, GstClock.class).getPeer(), Pointer.getPeer(id), time);
    }

    protected native long gst_clock_unadjust_unlocked(
        @Ptr
        long clock, long external);

    public long unadjust_unlocked(long external) {
        return this.gst_clock_unadjust_unlocked(Pointer.pointerTo(this, GstClock.class).getPeer(), external);
    }

    @Field(0)
    public GstObject gstclock_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstClock gstclock_field_object(GstObject gstclock_field_object) {
        this.io.setNativeObjectField(this, 0, gstclock_field_object);
        return this;
    }

    @Field(1)
    private Pointer<GstClockPrivate> field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstClock field_priv(Pointer<GstClockPrivate> field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    private Pointer gstclock_field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstClock gstclock_field__gst_reserved(Pointer gstclock_field__gst_reserved) {
        this.io.setPointerField(this, 2, gstclock_field__gst_reserved);
        return this;
    }

}
