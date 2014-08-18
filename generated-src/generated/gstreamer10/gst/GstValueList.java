
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstValueList
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstValueList() {
        super();
    }

    public GstValueList(Pointer pointer) {
        super(pointer);
    }

    protected static native void gst_value_list_append_and_take_value(
        @Ptr
        long value,
        @Ptr
        long append_value);

    public static void append_and_take_value(Pointer<GValue> value, Pointer<GValue> append_value) {
        GstValueList.gst_value_list_append_and_take_value(Pointer.getPeer(value), Pointer.getPeer(append_value));
    }

    protected static native void gst_value_list_append_value(
        @Ptr
        long value,
        @Ptr
        long append_value);

    public static void append_value(Pointer<GValue> value, Pointer<GValue> append_value) {
        GstValueList.gst_value_list_append_value(Pointer.getPeer(value), Pointer.getPeer(append_value));
    }

    protected static native void gst_value_list_concat(
        @Ptr
        long dest,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static void concat(Pointer<GValue> dest, Pointer<GValue> value1, Pointer<GValue> value2) {
        GstValueList.gst_value_list_concat(Pointer.getPeer(dest), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native long gst_value_list_get_size(
        @Ptr
        long value);

    public static long get_size(Pointer<GValue> value) {
        return GstValueList.gst_value_list_get_size(Pointer.getPeer(value));
    }

    @Ptr
    protected static native long gst_value_list_get_value(
        @Ptr
        long value, long index);

    public static Pointer<GValue> get_value(Pointer<GValue> value, long index) {
        return Pointer.pointerToAddress(GstValueList.gst_value_list_get_value(Pointer.getPeer(value), index), GValue.class);
    }

    protected static native void gst_value_list_merge(
        @Ptr
        long dest,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static void merge(Pointer<GValue> dest, Pointer<GValue> value1, Pointer<GValue> value2) {
        GstValueList.gst_value_list_merge(Pointer.getPeer(dest), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native void gst_value_list_prepend_value(
        @Ptr
        long value,
        @Ptr
        long prepend_value);

    public static void prepend_value(Pointer<GValue> value, Pointer<GValue> prepend_value) {
        GstValueList.gst_value_list_prepend_value(Pointer.getPeer(value), Pointer.getPeer(prepend_value));
    }

}
