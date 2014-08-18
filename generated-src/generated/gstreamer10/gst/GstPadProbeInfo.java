
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPadProbeInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPadProbeInfo() {
        super();
    }

    public GstPadProbeInfo(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_pad_probe_info_get_buffer(
        @Ptr
        long info);

    public Pointer<GstBuffer> get_buffer() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_buffer(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstBuffer.class);
    }

    @Field(0)
    public long field_offset() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstPadProbeInfo field_offset(long field_offset) {
        this.io.setLongField(this, 0, field_offset);
        return this;
    }

    @Field(1)
    public long field_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstPadProbeInfo field_size(long field_size) {
        this.io.setLongField(this, 1, field_size);
        return this;
    }

    @Field(2)
    public Pointer field_data() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstPadProbeInfo field_data(Pointer field_data) {
        this.io.setPointerField(this, 2, field_data);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_event(
        @Ptr
        long info);

    public Pointer<GstEvent> get_event() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_event(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstEvent.class);
    }

    @Ptr
    protected native long gst_pad_probe_info_get_query(
        @Ptr
        long info);

    public Pointer<GstQuery> get_query() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_query(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstQuery.class);
    }

    @Field(3)
    public IntValuedEnum<GstPadProbeType> field_type() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstPadProbeInfo field_type(IntValuedEnum<GstPadProbeType> field_type) {
        this.io.setEnumField(this, 3, field_type);
        return this;
    }

    @Field(4)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstPadProbeInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    @Field(5)
    public long field_id() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstPadProbeInfo field_id(long field_id) {
        this.io.setLongField(this, 5, field_id);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_buffer_list(
        @Ptr
        long info);

    public Pointer<GstBufferList> get_buffer_list() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_buffer_list(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstBufferList.class);
    }

}
