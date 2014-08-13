
package generated;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstObject;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstTypeFindProbability;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstBase {


    @Ptr
    protected native long gst_type_find_helper(
        @Ptr
        long src, long size);

    public Pointer<GstCaps> type_find_helper(Pointer<GstPad> src, long size) {
        return Pointer.pointerToAddress(this.gst_type_find_helper(Pointer.getPeer(src), size), Pointer.class);
    }

    @Ptr
    protected native long gst_type_find_helper_for_buffer(
        @Ptr
        long obj,
        @Ptr
        long buf,
        @Ptr
        long prob);

    public Pointer<GstCaps> type_find_helper_for_buffer(Pointer<GstObject> obj, Pointer<GstBuffer> buf, Pointer<IntValuedEnum<GstTypeFindProbability>> prob) {
        return Pointer.pointerToAddress(this.gst_type_find_helper_for_buffer(Pointer.getPeer(obj), Pointer.getPeer(buf), Pointer.getPeer(prob)), Pointer.class);
    }

    @Ptr
    protected native long gst_type_find_helper_for_data(
        @Ptr
        long obj,
        @Ptr
        long data, long size,
        @Ptr
        long prob);

    public Pointer<GstCaps> type_find_helper_for_data(Pointer<GstObject> obj, Pointer<Short> data, long size, Pointer<IntValuedEnum<GstTypeFindProbability>> prob) {
        return Pointer.pointerToAddress(this.gst_type_find_helper_for_data(Pointer.getPeer(obj), Pointer.getPeer(data), size, Pointer.getPeer(prob)), Pointer.class);
    }

    @Ptr
    protected native long gst_type_find_helper_for_extension(
        @Ptr
        long obj,
        @Ptr
        long extension);

    public Pointer<GstCaps> type_find_helper_for_extension(Pointer<GstObject> obj, Pointer extension) {
        return Pointer.pointerToAddress(this.gst_type_find_helper_for_extension(Pointer.getPeer(obj), Pointer.getPeer(extension)), Pointer.class);
    }

    @Ptr
    protected native long gst_type_find_helper_get_range(
        @Ptr
        long obj,
        @Ptr
        long parent, Object func, long size,
        @Ptr
        long extension,
        @Ptr
        long prob);

    public Pointer<GstCaps> type_find_helper_get_range(Pointer<GstObject> obj, Pointer<GstObject> parent, Object func, long size, Pointer extension, Pointer<IntValuedEnum<GstTypeFindProbability>> prob) {
        return Pointer.pointerToAddress(this.gst_type_find_helper_get_range(Pointer.getPeer(obj), Pointer.getPeer(parent), func, size, Pointer.getPeer(extension), Pointer.getPeer(prob)), Pointer.class);
    }

}
