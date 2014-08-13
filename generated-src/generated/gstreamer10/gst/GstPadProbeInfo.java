
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPadProbeInfo
    extends StructObject
{


    public GstPadProbeInfo() {
        super();
    }

    public GstPadProbeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_id() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPadProbeInfo field_id(long field_id) {
        this.io.setNativeObjectField(this, 0, field_id);
        return this;
    }

    @Field(1)
    public Object field_type() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstPadProbeInfo field_type(Object field_type) {
        this.io.setNativeObjectField(this, 1, field_type);
        return this;
    }

    @Field(2)
    public long field_offset() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstPadProbeInfo field_offset(long field_offset) {
        this.io.setNativeObjectField(this, 2, field_offset);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_event(
        @Ptr
        long info);

    public Pointer<GstEvent> get_event() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_event(Pointer.pointerTo(this, GstPadProbeInfo.class)), Pointer.class);
    }

    @Field(3)
    public long field_size() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstPadProbeInfo field_size(long field_size) {
        this.io.setNativeObjectField(this, 3, field_size);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_buffer(
        @Ptr
        long info);

    public Pointer<GstBuffer> get_buffer() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_buffer(Pointer.pointerTo(this, GstPadProbeInfo.class)), Pointer.class);
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstPadProbeInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_buffer_list(
        @Ptr
        long info);

    public Pointer<GstBufferList> get_buffer_list() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_buffer_list(Pointer.pointerTo(this, GstPadProbeInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_pad_probe_info_get_query(
        @Ptr
        long info);

    public Pointer<GstQuery> get_query() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_query(Pointer.pointerTo(this, GstPadProbeInfo.class)), Pointer.class);
    }

    @Field(5)
    public Pointer field_data() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstPadProbeInfo field_data(Pointer field_data) {
        this.io.setNativeObjectField(this, 5, field_data);
        return this;
    }

}
