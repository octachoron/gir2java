
package generated;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstObject;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstTypeFindProbability;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstbase-1.0")
public class GstBase {


    static {
        BridJ.register();
    }

    @Ptr
    protected static native long gst_type_find_helper(
        @Ptr
        long src, long size);

    public static Pointer<GstCaps> type_find_helper(Pointer<GstPad> src, long size) {
        return Pointer.pointerToAddress(GstBase.gst_type_find_helper(Pointer.getPeer(src), size), GstCaps.class);
    }

    @Ptr
    protected static native long gst_type_find_helper_for_buffer(
        @Ptr
        long obj,
        @Ptr
        long buf,
        @Ptr
        long prob);

    public static Pointer<GstCaps> type_find_helper_for_buffer(Pointer<GstObject> obj, Pointer<GstBuffer> buf, Pointer<IntValuedEnum<GstTypeFindProbability>> prob) {
        return Pointer.pointerToAddress(GstBase.gst_type_find_helper_for_buffer(Pointer.getPeer(obj), Pointer.getPeer(buf), Pointer.getPeer(prob)), GstCaps.class);
    }

    @Ptr
    protected static native long gst_type_find_helper_for_data(
        @Ptr
        long obj,
        @Ptr
        long data, long size,
        @Ptr
        long prob);

    public static Pointer<GstCaps> type_find_helper_for_data(Pointer<GstObject> obj, Pointer<Short> data, long size, Pointer<IntValuedEnum<GstTypeFindProbability>> prob) {
        return Pointer.pointerToAddress(GstBase.gst_type_find_helper_for_data(Pointer.getPeer(obj), Pointer.getPeer(data), size, Pointer.getPeer(prob)), GstCaps.class);
    }

    @Ptr
    protected static native long gst_type_find_helper_for_extension(
        @Ptr
        long obj,
        @Ptr
        long extension);

    public static Pointer<GstCaps> type_find_helper_for_extension(Pointer<GstObject> obj, Pointer extension) {
        return Pointer.pointerToAddress(GstBase.gst_type_find_helper_for_extension(Pointer.getPeer(obj), Pointer.getPeer(extension)), GstCaps.class);
    }

    @Ptr
    protected static native long gst_type_find_helper_get_range(
        @Ptr
        long obj,
        @Ptr
        long parent,
        @Ptr
        long func, long size,
        @Ptr
        long extension,
        @Ptr
        long prob);

    public static Pointer<GstCaps> type_find_helper_get_range(Pointer<GstObject> obj, Pointer<GstObject> parent, Pointer func, long size, Pointer extension, Pointer<IntValuedEnum<GstTypeFindProbability>> prob) {
        return Pointer.pointerToAddress(GstBase.gst_type_find_helper_get_range(Pointer.getPeer(obj), Pointer.getPeer(parent), Pointer.getPeer(func), size, Pointer.getPeer(extension), Pointer.getPeer(prob)), GstCaps.class);
    }

}
