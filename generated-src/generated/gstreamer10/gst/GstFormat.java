
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstFormat implements IntValuedEnum<GstFormat>
{

    GST_FORMAT_UNDEFINED(0L),
    GST_FORMAT_DEFAULT(1L),
    GST_FORMAT_BYTES(2L),
    GST_FORMAT_TIME(3L),
    GST_FORMAT_BUFFERS(4L),
    GST_FORMAT_PERCENT(5L);
    public final long value;

    GstFormat(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstFormat> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstFormat> fromValue(int value) {
        return FlagSet.fromValue(value, GstFormat.values());
    }

    @Ptr
    protected static native long gst_format_iterate_definitions();

    public static Pointer iterate_definitions() {
        return Pointer.pointerToAddress(GstFormat.gst_format_iterate_definitions());
    }

    protected static native IntValuedEnum<GstFormat> gst_format_get_by_nick(
        @Ptr
        long nick);

    public static IntValuedEnum<GstFormat> get_by_nick(Pointer nick) {
        return GstFormat.gst_format_get_by_nick(Pointer.getPeer(nick));
    }

    protected static native IntValuedEnum<GstFormat> gst_format_register(
        @Ptr
        long nick,
        @Ptr
        long description);

    public static IntValuedEnum<GstFormat> register(Pointer nick, Pointer description) {
        return GstFormat.gst_format_register(Pointer.getPeer(nick), Pointer.getPeer(description));
    }

    public static native long gst_format_to_quark(IntValuedEnum<GstFormat> format);

    @Ptr
    protected static native long gst_format_get_details(IntValuedEnum<GstFormat> format);

    public static Pointer<GstFormatDefinition> get_details(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(GstFormat.gst_format_get_details(format), GstFormatDefinition.class);
    }

    @Ptr
    protected static native long gst_format_get_name(IntValuedEnum<GstFormat> format);

    public static Pointer get_name(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(GstFormat.gst_format_get_name(format));
    }

}
