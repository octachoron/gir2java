
package generated.gstreamer10.gst;

import generated.glib20.glib.GDateTime;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstDateTime
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstDateTime() {
        super();
    }

    public GstDateTime(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_date_time_new(float tzoffset, int year, int month, int day, int hour, int minute, double seconds);

    public static Pointer _new(float tzoffset, int year, int month, int day, int hour, int minute, double seconds) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new(tzoffset, year, month, day, hour, minute, seconds));
    }

    @Ptr
    protected static native long gst_date_time_new_from_g_date_time(
        @Ptr
        long dt);

    public static Pointer new_from_g_date_time(Pointer<GDateTime> dt) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_from_g_date_time(Pointer.getPeer(dt)));
    }

    @Ptr
    protected static native long gst_date_time_new_from_iso8601_string(
        @Ptr
        long string);

    public static Pointer new_from_iso8601_string(Pointer string) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_from_iso8601_string(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long gst_date_time_new_from_unix_epoch_local_time(long secs);

    public static Pointer new_from_unix_epoch_local_time(long secs) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_from_unix_epoch_local_time(secs));
    }

    @Ptr
    protected static native long gst_date_time_new_from_unix_epoch_utc(long secs);

    public static Pointer new_from_unix_epoch_utc(long secs) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_from_unix_epoch_utc(secs));
    }

    @Ptr
    protected static native long gst_date_time_new_local_time(int year, int month, int day, int hour, int minute, double seconds);

    public static Pointer new_local_time(int year, int month, int day, int hour, int minute, double seconds) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_local_time(year, month, day, hour, minute, seconds));
    }

    @Ptr
    protected static native long gst_date_time_new_now_local_time();

    public static Pointer new_now_local_time() {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_now_local_time());
    }

    @Ptr
    protected static native long gst_date_time_new_now_utc();

    public static Pointer new_now_utc() {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_now_utc());
    }

    @Ptr
    protected static native long gst_date_time_new_y(int year);

    public static Pointer new_y(int year) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_y(year));
    }

    @Ptr
    protected static native long gst_date_time_new_ym(int year, int month);

    public static Pointer new_ym(int year, int month) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_ym(year, month));
    }

    @Ptr
    protected static native long gst_date_time_new_ymd(int year, int month, int day);

    public static Pointer new_ymd(int year, int month, int day) {
        return Pointer.pointerToAddress(GstDateTime.gst_date_time_new_ymd(year, month, day));
    }

    protected native int gst_date_time_get_day(
        @Ptr
        long datetime);

    public int get_day() {
        return this.gst_date_time_get_day(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native int gst_date_time_get_hour(
        @Ptr
        long datetime);

    public int get_hour() {
        return this.gst_date_time_get_hour(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native int gst_date_time_get_microsecond(
        @Ptr
        long datetime);

    public int get_microsecond() {
        return this.gst_date_time_get_microsecond(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native int gst_date_time_get_minute(
        @Ptr
        long datetime);

    public int get_minute() {
        return this.gst_date_time_get_minute(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native int gst_date_time_get_month(
        @Ptr
        long datetime);

    public int get_month() {
        return this.gst_date_time_get_month(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native int gst_date_time_get_second(
        @Ptr
        long datetime);

    public int get_second() {
        return this.gst_date_time_get_second(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native float gst_date_time_get_time_zone_offset(
        @Ptr
        long datetime);

    public float get_time_zone_offset() {
        return this.gst_date_time_get_time_zone_offset(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native int gst_date_time_get_year(
        @Ptr
        long datetime);

    public int get_year() {
        return this.gst_date_time_get_year(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native boolean gst_date_time_has_day(
        @Ptr
        long datetime);

    public boolean has_day() {
        return this.gst_date_time_has_day(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native boolean gst_date_time_has_month(
        @Ptr
        long datetime);

    public boolean has_month() {
        return this.gst_date_time_has_month(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native boolean gst_date_time_has_second(
        @Ptr
        long datetime);

    public boolean has_second() {
        return this.gst_date_time_has_second(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native boolean gst_date_time_has_time(
        @Ptr
        long datetime);

    public boolean has_time() {
        return this.gst_date_time_has_time(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    protected native boolean gst_date_time_has_year(
        @Ptr
        long datetime);

    public boolean has_year() {
        return this.gst_date_time_has_year(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

    @Ptr
    protected native long gst_date_time_ref(
        @Ptr
        long datetime);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.gst_date_time_ref(Pointer.pointerTo(this, GstDateTime.class).getPeer()));
    }

    @Ptr
    protected native long gst_date_time_to_g_date_time(
        @Ptr
        long datetime);

    public Pointer<GDateTime> to_g_date_time() {
        return Pointer.pointerToAddress(this.gst_date_time_to_g_date_time(Pointer.pointerTo(this, GstDateTime.class).getPeer()), GDateTime.class);
    }

    @Ptr
    protected native long gst_date_time_to_iso8601_string(
        @Ptr
        long datetime);

    public Pointer to_iso8601_string() {
        return Pointer.pointerToAddress(this.gst_date_time_to_iso8601_string(Pointer.pointerTo(this, GstDateTime.class).getPeer()));
    }

    protected native void gst_date_time_unref(
        @Ptr
        long datetime);

    public void unref() {
        this.gst_date_time_unref(Pointer.pointerTo(this, GstDateTime.class).getPeer());
    }

}
