
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTimeZone
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTimeZone() {
        super();
    }

    public GTimeZone(Pointer pointer) {
        super(pointer);
    }

    protected native int g_time_zone_adjust_time(
        @Ptr
        long tz, IntValuedEnum<GTimeType> type,
        @Ptr
        long time_);

    public int adjust_time(IntValuedEnum<GTimeType> type, Pointer<Long> time_) {
        return this.g_time_zone_adjust_time(Pointer.pointerTo(this, GTimeZone.class).getPeer(), type, Pointer.getPeer(time_));
    }

    protected native int g_time_zone_find_interval(
        @Ptr
        long tz, IntValuedEnum<GTimeType> type, long time_);

    public int find_interval(IntValuedEnum<GTimeType> type, long time_) {
        return this.g_time_zone_find_interval(Pointer.pointerTo(this, GTimeZone.class).getPeer(), type, time_);
    }

    @Ptr
    protected native long g_time_zone_get_abbreviation(
        @Ptr
        long tz, int interval);

    public Pointer get_abbreviation(int interval) {
        return Pointer.pointerToAddress(this.g_time_zone_get_abbreviation(Pointer.pointerTo(this, GTimeZone.class).getPeer(), interval));
    }

    protected native int g_time_zone_get_offset(
        @Ptr
        long tz, int interval);

    public int get_offset(int interval) {
        return this.g_time_zone_get_offset(Pointer.pointerTo(this, GTimeZone.class).getPeer(), interval);
    }

    protected native boolean g_time_zone_is_dst(
        @Ptr
        long tz, int interval);

    public boolean is_dst(int interval) {
        return this.g_time_zone_is_dst(Pointer.pointerTo(this, GTimeZone.class).getPeer(), interval);
    }

    @Ptr
    protected native long g_time_zone_ref(
        @Ptr
        long tz);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_time_zone_ref(Pointer.pointerTo(this, GTimeZone.class).getPeer()));
    }

    protected native void g_time_zone_unref(
        @Ptr
        long tz);

    public void unref() {
        this.g_time_zone_unref(Pointer.pointerTo(this, GTimeZone.class).getPeer());
    }

}
