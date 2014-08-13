
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GValue;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstValueList
    extends StructObject
{


    public GstValueList() {
        super();
    }

    public GstValueList(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_value_list_append_and_take_value(
        @Ptr
        long value,
        @Ptr
        long append_value);

    public void append_and_take_value(Pointer<GValue> value, Pointer<GValue> append_value) {
        this.gst_value_list_append_and_take_value(Pointer.getPeer(value), Pointer.getPeer(append_value));
    }

    protected native void gst_value_list_append_value(
        @Ptr
        long value,
        @Ptr
        long append_value);

    public void append_value(Pointer<GValue> value, Pointer<GValue> append_value) {
        this.gst_value_list_append_value(Pointer.getPeer(value), Pointer.getPeer(append_value));
    }

    protected native void gst_value_list_concat(
        @Ptr
        long dest,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public void concat(Pointer<GValue> dest, Pointer<GValue> value1, Pointer<GValue> value2) {
        this.gst_value_list_concat(Pointer.getPeer(dest), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected native long gst_value_list_get_size(
        @Ptr
        long value);

    public long get_size(Pointer<GValue> value) {
        return this.gst_value_list_get_size(Pointer.getPeer(value));
    }

    @Ptr
    protected native long gst_value_list_get_value(
        @Ptr
        long value, long index);

    public Pointer<GValue> get_value(Pointer<GValue> value, long index) {
        return Pointer.pointerToAddress(this.gst_value_list_get_value(Pointer.getPeer(value), index), Pointer.class);
    }

    protected native void gst_value_list_merge(
        @Ptr
        long dest,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public void merge(Pointer<GValue> dest, Pointer<GValue> value1, Pointer<GValue> value2) {
        this.gst_value_list_merge(Pointer.getPeer(dest), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected native void gst_value_list_prepend_value(
        @Ptr
        long value,
        @Ptr
        long prepend_value);

    public void prepend_value(Pointer<GValue> value, Pointer<GValue> prepend_value) {
        this.gst_value_list_prepend_value(Pointer.getPeer(value), Pointer.getPeer(prepend_value));
    }

}
