
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
    public Pointer field_collect() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstCollectData field_collect(Pointer field_collect) {
        this.io.setPointerField(this, 0, field_collect);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_pad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstCollectData field_pad(Pointer<GstPad> field_pad) {
        this.io.setPointerField(this, 1, field_pad);
        return this;
    }

    @Field(2)
    public Pointer<GstBuffer> field_buffer() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstCollectData field_buffer(Pointer<GstBuffer> field_buffer) {
        this.io.setPointerField(this, 2, field_buffer);
        return this;
    }

    @Field(3)
    public long field_pos() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstCollectData field_pos(long field_pos) {
        this.io.setLongField(this, 3, field_pos);
        return this;
    }

    @Field(4)
    public GstSegment field_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstCollectData field_segment(GstSegment field_segment) {
        this.io.setNativeObjectField(this, 4, field_segment);
        return this;
    }

    @Field(5)
    private IntValuedEnum<GstCollectPadsStateFlags> field_state() {
        return this.io.getEnumField(this, 5);
    }

    @Field(5)
    private GstCollectData field_state(IntValuedEnum<GstCollectPadsStateFlags> field_state) {
        this.io.setEnumField(this, 5, field_state);
        return this;
    }

    @Field(6)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstCollectData field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 6, field__gst_reserved);
        return this;
    }

    @Field(7)
    private Pointer<GstCollectDataPrivate> field_priv() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GstCollectData field_priv(Pointer<GstCollectDataPrivate> field_priv) {
        this.io.setPointerField(this, 7, field_priv);
        return this;
    }

}
