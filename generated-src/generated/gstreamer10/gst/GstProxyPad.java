
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstProxyPad
    extends GstPad
{


    static {
        BridJ.register();
    }

    public GstProxyPad() {
        super();
    }

    public GstProxyPad(Pointer pointer) {
        super(pointer);
    }

    protected static native IntValuedEnum<GstFlowReturn> gst_proxy_pad_chain_default(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long buffer);

    public static IntValuedEnum<GstFlowReturn> chain_default(Pointer<GstPad> pad, Pointer<GstObject> parent, Pointer<GstBuffer> buffer) {
        return GstProxyPad.gst_proxy_pad_chain_default(Pointer.getPeer(pad), Pointer.getPeer(parent), Pointer.getPeer(buffer));
    }

    protected static native IntValuedEnum<GstFlowReturn> gst_proxy_pad_chain_list_default(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long list);

    public static IntValuedEnum<GstFlowReturn> chain_list_default(Pointer<GstPad> pad, Pointer<GstObject> parent, Pointer<GstBufferList> list) {
        return GstProxyPad.gst_proxy_pad_chain_list_default(Pointer.getPeer(pad), Pointer.getPeer(parent), Pointer.getPeer(list));
    }

    protected static native IntValuedEnum<GstFlowReturn> gst_proxy_pad_getrange_default(
        @Ptr
        long pad,
        @Ptr
        long parent, long offset, long size,
        @Ptr
        long buffer);

    public static IntValuedEnum<GstFlowReturn> getrange_default(Pointer<GstPad> pad, Pointer<GstObject> parent, long offset, long size, Pointer<Pointer<GstBuffer>> buffer) {
        return GstProxyPad.gst_proxy_pad_getrange_default(Pointer.getPeer(pad), Pointer.getPeer(parent), offset, size, Pointer.getPeer(buffer));
    }

    @Ptr
    protected static native long gst_proxy_pad_iterate_internal_links_default(
        @Ptr
        long pad,
        @Ptr
        long parent);

    public static Pointer<GstIterator> gstproxypad_iterate_internal_links_default(Pointer<GstPad> pad, Pointer<GstObject> parent) {
        return Pointer.pointerToAddress(GstProxyPad.gst_proxy_pad_iterate_internal_links_default(Pointer.getPeer(pad), Pointer.getPeer(parent)), GstIterator.class);
    }

    @Ptr
    protected native long gst_proxy_pad_get_internal(
        @Ptr
        long pad);

    public Pointer get_internal() {
        return Pointer.pointerToAddress(this.gst_proxy_pad_get_internal(Pointer.pointerTo(this, GstProxyPad.class).getPeer()));
    }

    @Field(0)
    public GstPad gstproxypad_field_pad() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstProxyPad gstproxypad_field_pad(GstPad gstproxypad_field_pad) {
        this.io.setNativeObjectField(this, 0, gstproxypad_field_pad);
        return this;
    }

    @Field(1)
    private Pointer gstproxypad_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstProxyPad gstproxypad_field_priv(Pointer gstproxypad_field_priv) {
        this.io.setPointerField(this, 1, gstproxypad_field_priv);
        return this;
    }

}
