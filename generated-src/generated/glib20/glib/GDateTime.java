
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GDateTime
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDateTime() {
        super();
    }

    public GDateTime(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_date_time_new(
        @Ptr
        long tz, int year, int month, int day, int hour, int minute, double seconds);

    public static Pointer _new(Pointer tz, int year, int month, int day, int hour, int minute, double seconds) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new(Pointer.getPeer(tz), year, month, day, hour, minute, seconds));
    }

    @Ptr
    protected static native long g_date_time_new_from_timeval_local(
        @Ptr
        long tv);

    public static Pointer new_from_timeval_local(Pointer tv) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_from_timeval_local(Pointer.getPeer(tv)));
    }

    @Ptr
    protected static native long g_date_time_new_from_timeval_utc(
        @Ptr
        long tv);

    public static Pointer new_from_timeval_utc(Pointer tv) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_from_timeval_utc(Pointer.getPeer(tv)));
    }

    @Ptr
    protected static native long g_date_time_new_from_unix_local(long t);

    public static Pointer new_from_unix_local(long t) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_from_unix_local(t));
    }

    @Ptr
    protected static native long g_date_time_new_from_unix_utc(long t);

    public static Pointer new_from_unix_utc(long t) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_from_unix_utc(t));
    }

    @Ptr
    protected static native long g_date_time_new_local(int year, int month, int day, int hour, int minute, double seconds);

    public static Pointer new_local(int year, int month, int day, int hour, int minute, double seconds) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_local(year, month, day, hour, minute, seconds));
    }

    @Ptr
    protected static native long g_date_time_new_now(
        @Ptr
        long tz);

    public static Pointer new_now(Pointer tz) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_now(Pointer.getPeer(tz)));
    }

    @Ptr
    protected static native long g_date_time_new_now_local();

    public static Pointer new_now_local() {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_now_local());
    }

    @Ptr
    protected static native long g_date_time_new_now_utc();

    public static Pointer new_now_utc() {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_now_utc());
    }

    @Ptr
    protected static native long g_date_time_new_utc(int year, int month, int day, int hour, int minute, double seconds);

    public static Pointer new_utc(int year, int month, int day, int hour, int minute, double seconds) {
        return Pointer.pointerToAddress(GDateTime.g_date_time_new_utc(year, month, day, hour, minute, seconds));
    }

    @Ptr
    protected native long g_date_time_add(
        @Ptr
        long datetime, long timespan);

    public Pointer add(long timespan) {
        return Pointer.pointerToAddress(this.g_date_time_add(Pointer.pointerTo(this, GDateTime.class).getPeer(), timespan));
    }

    @Ptr
    protected native long g_date_time_add_days(
        @Ptr
        long datetime, int days);

    public Pointer add_days(int days) {
        return Pointer.pointerToAddress(this.g_date_time_add_days(Pointer.pointerTo(this, GDateTime.class).getPeer(), days));
    }

    @Ptr
    protected native long g_date_time_add_full(
        @Ptr
        long datetime, int years, int months, int days, int hours, int minutes, double seconds);

    public Pointer add_full(int years, int months, int days, int hours, int minutes, double seconds) {
        return Pointer.pointerToAddress(this.g_date_time_add_full(Pointer.pointerTo(this, GDateTime.class).getPeer(), years, months, days, hours, minutes, seconds));
    }

    @Ptr
    protected native long g_date_time_add_hours(
        @Ptr
        long datetime, int hours);

    public Pointer add_hours(int hours) {
        return Pointer.pointerToAddress(this.g_date_time_add_hours(Pointer.pointerTo(this, GDateTime.class).getPeer(), hours));
    }

    @Ptr
    protected native long g_date_time_add_minutes(
        @Ptr
        long datetime, int minutes);

    public Pointer add_minutes(int minutes) {
        return Pointer.pointerToAddress(this.g_date_time_add_minutes(Pointer.pointerTo(this, GDateTime.class).getPeer(), minutes));
    }

    @Ptr
    protected native long g_date_time_add_months(
        @Ptr
        long datetime, int months);

    public Pointer add_months(int months) {
        return Pointer.pointerToAddress(this.g_date_time_add_months(Pointer.pointerTo(this, GDateTime.class).getPeer(), months));
    }

    @Ptr
    protected native long g_date_time_add_seconds(
        @Ptr
        long datetime, double seconds);

    public Pointer add_seconds(double seconds) {
        return Pointer.pointerToAddress(this.g_date_time_add_seconds(Pointer.pointerTo(this, GDateTime.class).getPeer(), seconds));
    }

    @Ptr
    protected native long g_date_time_add_weeks(
        @Ptr
        long datetime, int weeks);

    public Pointer add_weeks(int weeks) {
        return Pointer.pointerToAddress(this.g_date_time_add_weeks(Pointer.pointerTo(this, GDateTime.class).getPeer(), weeks));
    }

    @Ptr
    protected native long g_date_time_add_years(
        @Ptr
        long datetime, int years);

    public Pointer add_years(int years) {
        return Pointer.pointerToAddress(this.g_date_time_add_years(Pointer.pointerTo(this, GDateTime.class).getPeer(), years));
    }

    protected native long g_date_time_difference(
        @Ptr
        long end,
        @Ptr
        long begin);

    public long difference(Pointer begin) {
        return this.g_date_time_difference(Pointer.pointerTo(this, GDateTime.class).getPeer(), Pointer.getPeer(begin));
    }

    @Ptr
    protected native long g_date_time_format(
        @Ptr
        long datetime,
        @Ptr
        long format);

    public Pointer format(Pointer format) {
        return Pointer.pointerToAddress(this.g_date_time_format(Pointer.pointerTo(this, GDateTime.class).getPeer(), Pointer.getPeer(format)));
    }

    protected native int g_date_time_get_day_of_month(
        @Ptr
        long datetime);

    public int get_day_of_month() {
        return this.g_date_time_get_day_of_month(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_day_of_week(
        @Ptr
        long datetime);

    public int get_day_of_week() {
        return this.g_date_time_get_day_of_week(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_day_of_year(
        @Ptr
        long datetime);

    public int get_day_of_year() {
        return this.g_date_time_get_day_of_year(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_hour(
        @Ptr
        long datetime);

    public int get_hour() {
        return this.g_date_time_get_hour(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_microsecond(
        @Ptr
        long datetime);

    public int get_microsecond() {
        return this.g_date_time_get_microsecond(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_minute(
        @Ptr
        long datetime);

    public int get_minute() {
        return this.g_date_time_get_minute(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_month(
        @Ptr
        long datetime);

    public int get_month() {
        return this.g_date_time_get_month(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_second(
        @Ptr
        long datetime);

    public int get_second() {
        return this.g_date_time_get_second(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native double g_date_time_get_seconds(
        @Ptr
        long datetime);

    public double get_seconds() {
        return this.g_date_time_get_seconds(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    @Ptr
    protected native long g_date_time_get_timezone_abbreviation(
        @Ptr
        long datetime);

    public Pointer get_timezone_abbreviation() {
        return Pointer.pointerToAddress(this.g_date_time_get_timezone_abbreviation(Pointer.pointerTo(this, GDateTime.class).getPeer()));
    }

    protected native long g_date_time_get_utc_offset(
        @Ptr
        long datetime);

    public long get_utc_offset() {
        return this.g_date_time_get_utc_offset(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_week_numbering_year(
        @Ptr
        long datetime);

    public int get_week_numbering_year() {
        return this.g_date_time_get_week_numbering_year(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_week_of_year(
        @Ptr
        long datetime);

    public int get_week_of_year() {
        return this.g_date_time_get_week_of_year(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native int g_date_time_get_year(
        @Ptr
        long datetime);

    public int get_year() {
        return this.g_date_time_get_year(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected native void g_date_time_get_ymd(
        @Ptr
        long datetime,
        @Ptr
        long year,
        @Ptr
        long month,
        @Ptr
        long day);

    public void get_ymd(Pointer<Integer> year, Pointer<Integer> month, Pointer<Integer> day) {
        this.g_date_time_get_ymd(Pointer.pointerTo(this, GDateTime.class).getPeer(), Pointer.getPeer(year), Pointer.getPeer(month), Pointer.getPeer(day));
    }

    protected native boolean g_date_time_is_daylight_savings(
        @Ptr
        long datetime);

    public boolean is_daylight_savings() {
        return this.g_date_time_is_daylight_savings(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    @Ptr
    protected native long g_date_time_ref(
        @Ptr
        long datetime);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_date_time_ref(Pointer.pointerTo(this, GDateTime.class).getPeer()));
    }

    @Ptr
    protected native long g_date_time_to_local(
        @Ptr
        long datetime);

    public Pointer to_local() {
        return Pointer.pointerToAddress(this.g_date_time_to_local(Pointer.pointerTo(this, GDateTime.class).getPeer()));
    }

    protected native boolean g_date_time_to_timeval(
        @Ptr
        long datetime,
        @Ptr
        long tv);

    public boolean to_timeval(Pointer tv) {
        return this.g_date_time_to_timeval(Pointer.pointerTo(this, GDateTime.class).getPeer(), Pointer.getPeer(tv));
    }

    @Ptr
    protected native long g_date_time_to_timezone(
        @Ptr
        long datetime,
        @Ptr
        long tz);

    public Pointer to_timezone(Pointer tz) {
        return Pointer.pointerToAddress(this.g_date_time_to_timezone(Pointer.pointerTo(this, GDateTime.class).getPeer(), Pointer.getPeer(tz)));
    }

    protected native long g_date_time_to_unix(
        @Ptr
        long datetime);

    public long to_unix() {
        return this.g_date_time_to_unix(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    @Ptr
    protected native long g_date_time_to_utc(
        @Ptr
        long datetime);

    public Pointer to_utc() {
        return Pointer.pointerToAddress(this.g_date_time_to_utc(Pointer.pointerTo(this, GDateTime.class).getPeer()));
    }

    protected native void g_date_time_unref(
        @Ptr
        long datetime);

    public void unref() {
        this.g_date_time_unref(Pointer.pointerTo(this, GDateTime.class).getPeer());
    }

    protected static native int g_date_time_compare(
        @Ptr
        long dt1,
        @Ptr
        long dt2);

    public static int compare(Pointer dt1, Pointer dt2) {
        return GDateTime.g_date_time_compare(Pointer.getPeer(dt1), Pointer.getPeer(dt2));
    }

    protected static native boolean g_date_time_equal(
        @Ptr
        long dt1,
        @Ptr
        long dt2);

    public static boolean equal(Pointer dt1, Pointer dt2) {
        return GDateTime.g_date_time_equal(Pointer.getPeer(dt1), Pointer.getPeer(dt2));
    }

    protected static native long g_date_time_hash(
        @Ptr
        long datetime);

    public static long hash(Pointer datetime) {
        return GDateTime.g_date_time_hash(Pointer.getPeer(datetime));
    }

}
