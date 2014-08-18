
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstValueArray
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstValueArray() {
        super();
    }

    public GstValueArray(Pointer pointer) {
        super(pointer);
    }

    protected static native void gst_value_array_append_and_take_value(
        @Ptr
        long value,
        @Ptr
        long append_value);

    public static void append_and_take_value(Pointer<GValue> value, Pointer<GValue> append_value) {
        GstValueArray.gst_value_array_append_and_take_value(Pointer.getPeer(value), Pointer.getPeer(append_value));
    }

    protected static native void gst_value_array_append_value(
        @Ptr
        long value,
        @Ptr
        long append_value);

    public static void append_value(Pointer<GValue> value, Pointer<GValue> append_value) {
        GstValueArray.gst_value_array_append_value(Pointer.getPeer(value), Pointer.getPeer(append_value));
    }

    protected static native long gst_value_array_get_size(
        @Ptr
        long value);

    public static long get_size(Pointer<GValue> value) {
        return GstValueArray.gst_value_array_get_size(Pointer.getPeer(value));
    }

    @Ptr
    protected static native long gst_value_array_get_value(
        @Ptr
        long value, long index);

    public static Pointer<GValue> get_value(Pointer<GValue> value, long index) {
        return Pointer.pointerToAddress(GstValueArray.gst_value_array_get_value(Pointer.getPeer(value), index), GValue.class);
    }

    protected static native void gst_value_array_prepend_value(
        @Ptr
        long value,
        @Ptr
        long prepend_value);

    public static void prepend_value(Pointer<GValue> value, Pointer<GValue> prepend_value) {
        GstValueArray.gst_value_array_prepend_value(Pointer.getPeer(value), Pointer.getPeer(prepend_value));
    }

}
