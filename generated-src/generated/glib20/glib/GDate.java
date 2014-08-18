
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GDate
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDate() {
        super();
    }

    public GDate(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_julian_days() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GDate field_julian_days(long field_julian_days) {
        this.io.setLongField(this, 0, field_julian_days);
        return this;
    }

    @Field(1)
    public long field_julian() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GDate field_julian(long field_julian) {
        this.io.setLongField(this, 1, field_julian);
        return this;
    }

    @Field(2)
    public long field_dmy() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GDate field_dmy(long field_dmy) {
        this.io.setLongField(this, 2, field_dmy);
        return this;
    }

    @Field(3)
    public long field_day() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GDate field_day(long field_day) {
        this.io.setLongField(this, 3, field_day);
        return this;
    }

    @Field(4)
    public long field_month() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GDate field_month(long field_month) {
        this.io.setLongField(this, 4, field_month);
        return this;
    }

    @Field(5)
    public long field_year() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GDate field_year(long field_year) {
        this.io.setLongField(this, 5, field_year);
        return this;
    }

    @Ptr
    protected static native long g_date_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GDate.g_date_new());
    }

    @Ptr
    protected static native long g_date_new_julian(long julian_day);

    public static Pointer new_julian(long julian_day) {
        return Pointer.pointerToAddress(GDate.g_date_new_julian(julian_day));
    }

    protected native void g_date_add_days(
        @Ptr
        long date, long n_days);

    public void add_days(long n_days) {
        this.g_date_add_days(Pointer.pointerTo(this, GDate.class).getPeer(), n_days);
    }

    protected native void g_date_add_months(
        @Ptr
        long date, long n_months);

    public void add_months(long n_months) {
        this.g_date_add_months(Pointer.pointerTo(this, GDate.class).getPeer(), n_months);
    }

    protected native void g_date_add_years(
        @Ptr
        long date, long n_years);

    public void add_years(long n_years) {
        this.g_date_add_years(Pointer.pointerTo(this, GDate.class).getPeer(), n_years);
    }

    protected native void g_date_clamp(
        @Ptr
        long date,
        @Ptr
        long min_date,
        @Ptr
        long max_date);

    public void clamp(Pointer min_date, Pointer max_date) {
        this.g_date_clamp(Pointer.pointerTo(this, GDate.class).getPeer(), Pointer.getPeer(min_date), Pointer.getPeer(max_date));
    }

    protected native void g_date_clear(
        @Ptr
        long date, long n_dates);

    public void clear(long n_dates) {
        this.g_date_clear(Pointer.pointerTo(this, GDate.class).getPeer(), n_dates);
    }

    protected native int g_date_compare(
        @Ptr
        long lhs,
        @Ptr
        long rhs);

    public int compare(Pointer rhs) {
        return this.g_date_compare(Pointer.pointerTo(this, GDate.class).getPeer(), Pointer.getPeer(rhs));
    }

    protected native int g_date_days_between(
        @Ptr
        long date1,
        @Ptr
        long date2);

    public int days_between(Pointer date2) {
        return this.g_date_days_between(Pointer.pointerTo(this, GDate.class).getPeer(), Pointer.getPeer(date2));
    }

    protected native void g_date_free(
        @Ptr
        long date);

    public void free() {
        this.g_date_free(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native short g_date_get_day(
        @Ptr
        long date);

    public short get_day() {
        return this.g_date_get_day(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native long g_date_get_day_of_year(
        @Ptr
        long date);

    public long get_day_of_year() {
        return this.g_date_get_day_of_year(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native long g_date_get_iso8601_week_of_year(
        @Ptr
        long date);

    public long get_iso8601_week_of_year() {
        return this.g_date_get_iso8601_week_of_year(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native long g_date_get_julian(
        @Ptr
        long date);

    public long get_julian() {
        return this.g_date_get_julian(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native long g_date_get_monday_week_of_year(
        @Ptr
        long date);

    public long get_monday_week_of_year() {
        return this.g_date_get_monday_week_of_year(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native long g_date_get_sunday_week_of_year(
        @Ptr
        long date);

    public long get_sunday_week_of_year() {
        return this.g_date_get_sunday_week_of_year(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native int g_date_get_year(
        @Ptr
        long date);

    public int get_year() {
        return this.g_date_get_year(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native boolean g_date_is_first_of_month(
        @Ptr
        long date);

    public boolean is_first_of_month() {
        return this.g_date_is_first_of_month(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native boolean g_date_is_last_of_month(
        @Ptr
        long date);

    public boolean is_last_of_month() {
        return this.g_date_is_last_of_month(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    protected native void g_date_order(
        @Ptr
        long date1,
        @Ptr
        long date2);

    public void order(Pointer date2) {
        this.g_date_order(Pointer.pointerTo(this, GDate.class).getPeer(), Pointer.getPeer(date2));
    }

    protected native void g_date_set_day(
        @Ptr
        long date, short day);

    public void set_day(short day) {
        this.g_date_set_day(Pointer.pointerTo(this, GDate.class).getPeer(), day);
    }

    protected native void g_date_set_julian(
        @Ptr
        long date, long julian_date);

    public void set_julian(long julian_date) {
        this.g_date_set_julian(Pointer.pointerTo(this, GDate.class).getPeer(), julian_date);
    }

    protected native void g_date_set_parse(
        @Ptr
        long date,
        @Ptr
        long str);

    public void set_parse(Pointer str) {
        this.g_date_set_parse(Pointer.pointerTo(this, GDate.class).getPeer(), Pointer.getPeer(str));
    }

    protected native void g_date_set_time(
        @Ptr
        long date, int time_);

    public void set_time(int time_) {
        this.g_date_set_time(Pointer.pointerTo(this, GDate.class).getPeer(), time_);
    }

    protected native void g_date_set_time_t(
        @Ptr
        long date, long timet);

    public void set_time_t(long timet) {
        this.g_date_set_time_t(Pointer.pointerTo(this, GDate.class).getPeer(), timet);
    }

    protected native void g_date_set_time_val(
        @Ptr
        long date,
        @Ptr
        long timeval);

    public void set_time_val(Pointer timeval) {
        this.g_date_set_time_val(Pointer.pointerTo(this, GDate.class).getPeer(), Pointer.getPeer(timeval));
    }

    protected native void g_date_set_year(
        @Ptr
        long date, int year);

    public void set_year(int year) {
        this.g_date_set_year(Pointer.pointerTo(this, GDate.class).getPeer(), year);
    }

    protected native void g_date_subtract_days(
        @Ptr
        long date, long n_days);

    public void subtract_days(long n_days) {
        this.g_date_subtract_days(Pointer.pointerTo(this, GDate.class).getPeer(), n_days);
    }

    protected native void g_date_subtract_months(
        @Ptr
        long date, long n_months);

    public void subtract_months(long n_months) {
        this.g_date_subtract_months(Pointer.pointerTo(this, GDate.class).getPeer(), n_months);
    }

    protected native void g_date_subtract_years(
        @Ptr
        long date, long n_years);

    public void subtract_years(long n_years) {
        this.g_date_subtract_years(Pointer.pointerTo(this, GDate.class).getPeer(), n_years);
    }

    protected native void g_date_to_struct_tm(
        @Ptr
        long date,
        @Ptr
        long tm);

    public void to_struct_tm(Pointer tm) {
        this.g_date_to_struct_tm(Pointer.pointerTo(this, GDate.class).getPeer(), Pointer.getPeer(tm));
    }

    protected native boolean g_date_valid(
        @Ptr
        long date);

    public boolean valid() {
        return this.g_date_valid(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    public static native short g_date_get_monday_weeks_in_year(int year);

    public static native short g_date_get_sunday_weeks_in_year(int year);

    public static native boolean g_date_is_leap_year(int year);

    protected static native long g_date_strftime(
        @Ptr
        long s, long slen,
        @Ptr
        long format,
        @Ptr
        long date);

    public static long strftime(Pointer s, long slen, Pointer format, Pointer date) {
        return GDate.g_date_strftime(Pointer.getPeer(s), slen, Pointer.getPeer(format), Pointer.getPeer(date));
    }

    public static native boolean g_date_valid_day(short day);

    public static native boolean g_date_valid_julian(long julian_date);

    public static native boolean g_date_valid_year(int year);

    protected native void g_date_set_dmy(
        @Ptr
        long date, short day, IntValuedEnum<GDateMonth> month, int y);

    public void set_dmy(short day, IntValuedEnum<GDateMonth> month, int y) {
        this.g_date_set_dmy(Pointer.pointerTo(this, GDate.class).getPeer(), day, month, y);
    }

    protected native IntValuedEnum<GDateMonth> g_date_get_month(
        @Ptr
        long date);

    public IntValuedEnum<GDateMonth> get_month() {
        return this.g_date_get_month(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    public static native boolean g_date_valid_dmy(short day, IntValuedEnum<GDateMonth> month, int year);

    protected native void g_date_set_month(
        @Ptr
        long date, IntValuedEnum<GDateMonth> month);

    public void set_month(IntValuedEnum<GDateMonth> month) {
        this.g_date_set_month(Pointer.pointerTo(this, GDate.class).getPeer(), month);
    }

    public static native short g_date_get_days_in_month(IntValuedEnum<GDateMonth> month, int year);

    public static native boolean g_date_valid_weekday(IntValuedEnum<GDateWeekday> weekday);

    public static native boolean g_date_valid_month(IntValuedEnum<GDateMonth> month);

    protected native IntValuedEnum<GDateWeekday> g_date_get_weekday(
        @Ptr
        long date);

    public IntValuedEnum<GDateWeekday> get_weekday() {
        return this.g_date_get_weekday(Pointer.pointerTo(this, GDate.class).getPeer());
    }

    @Ptr
    protected static native long g_date_new_dmy(short day, IntValuedEnum<GDateMonth> month, int year);

    public static Pointer<GDate> new_dmy(short day, IntValuedEnum<GDateMonth> month, int year) {
        return Pointer.pointerToAddress(GDate.g_date_new_dmy(day, month, year), GDate.class);
    }

}
