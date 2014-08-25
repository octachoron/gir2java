
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstCollectData
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstCollectData() {
        super();
    }

    public GstCollectData(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gstcollectdata_field_collect() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstCollectData gstcollectdata_field_collect(Pointer gstcollectdata_field_collect) {
        this.io.setPointerField(this, 0, gstcollectdata_field_collect);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> gstcollectdata_field_pad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstCollectData gstcollectdata_field_pad(Pointer<GstPad> gstcollectdata_field_pad) {
        this.io.setPointerField(this, 1, gstcollectdata_field_pad);
        return this;
    }

    @Field(2)
    public Pointer<GstBuffer> gstcollectdata_field_buffer() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstCollectData gstcollectdata_field_buffer(Pointer<GstBuffer> gstcollectdata_field_buffer) {
        this.io.setPointerField(this, 2, gstcollectdata_field_buffer);
        return this;
    }

    @Field(3)
    public long gstcollectdata_field_pos() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstCollectData gstcollectdata_field_pos(long gstcollectdata_field_pos) {
        this.io.setLongField(this, 3, gstcollectdata_field_pos);
        return this;
    }

    @Field(4)
    public GstSegment gstcollectdata_field_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstCollectData gstcollectdata_field_segment(GstSegment gstcollectdata_field_segment) {
        this.io.setNativeObjectField(this, 4, gstcollectdata_field_segment);
        return this;
    }

    @Field(5)
    private Pointer gstcollectdata_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstCollectData gstcollectdata_field__gst_reserved(Pointer gstcollectdata_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstcollectdata_field__gst_reserved);
        return this;
    }

    @Field(6)
    private IntValuedEnum<GstCollectPadsStateFlags> gstcollectdata_field_state() {
        return this.io.getEnumField(this, 6);
    }

    @Field(6)
    private GstCollectData gstcollectdata_field_state(IntValuedEnum<GstCollectPadsStateFlags> gstcollectdata_field_state) {
        this.io.setEnumField(this, 6, gstcollectdata_field_state);
        return this;
    }

    @Field(7)
    private Pointer<GstCollectDataPrivate> gstcollectdata_field_priv() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GstCollectData gstcollectdata_field_priv(Pointer<GstCollectDataPrivate> gstcollectdata_field_priv) {
        this.io.setPointerField(this, 7, gstcollectdata_field_priv);
        return this;
    }

}
