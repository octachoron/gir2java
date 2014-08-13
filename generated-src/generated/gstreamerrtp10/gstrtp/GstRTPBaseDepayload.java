
package generated.gstreamerrtp10.gstrtp;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstBufferList;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtp-1.0")
public class GstRTPBaseDepayload
    extends GstElement
{


    public GstRTPBaseDepayload() {
        super();
    }

    public GstRTPBaseDepayload(Pointer pointer) {
        super(pointer);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_rtp_base_depayload_push(
        @Ptr
        long filter,
        @Ptr
        long out_buf);

    public IntValuedEnum<GstFlowReturn> push(Pointer<GstBuffer> out_buf) {
        return this.gst_rtp_base_depayload_push(Pointer.pointerTo(this, GstRTPBaseDepayload.class), Pointer.getPeer(out_buf));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_rtp_base_depayload_push_list(
        @Ptr
        long filter,
        @Ptr
        long out_list);

    public IntValuedEnum<GstFlowReturn> push_list(Pointer<GstBufferList> out_list) {
        return this.gst_rtp_base_depayload_push_list(Pointer.pointerTo(this, GstRTPBaseDepayload.class), Pointer.getPeer(out_list));
    }

    @Field(0)
    public GstElement field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTPBaseDepayload field_parent(GstElement field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstRTPBaseDepayload field_sinkpad(Pointer<GstPad> field_sinkpad) {
        this.io.setPointerField(this, 1, field_sinkpad);
        return this;
    }

    @Field(2)
    public Pointer<GstPad> field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstRTPBaseDepayload field_srcpad(Pointer<GstPad> field_srcpad) {
        this.io.setPointerField(this, 2, field_srcpad);
        return this;
    }

    @Field(3)
    public long field_clock_rate() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstRTPBaseDepayload field_clock_rate(long field_clock_rate) {
        this.io.setNativeObjectField(this, 3, field_clock_rate);
        return this;
    }

    @Field(4)
    public GstSegment field_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstRTPBaseDepayload field_segment(GstSegment field_segment) {
        this.io.setNativeObjectField(this, 4, field_segment);
        return this;
    }

    @Field(5)
    public boolean field_need_newsegment() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstRTPBaseDepayload field_need_newsegment(boolean field_need_newsegment) {
        this.io.setNativeObjectField(this, 5, field_need_newsegment);
        return this;
    }

    @Field(6)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstRTPBaseDepayload field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 6, field_priv);
        return this;
    }

    @Field(7)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstRTPBaseDepayload field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 7, field__gst_reserved);
        return this;
    }

}
