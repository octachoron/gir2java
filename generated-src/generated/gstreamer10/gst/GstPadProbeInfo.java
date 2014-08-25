
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

    @Field(0)
    public long gstpadprobeinfo_field_size() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstPadProbeInfo gstpadprobeinfo_field_size(long gstpadprobeinfo_field_size) {
        this.io.setLongField(this, 0, gstpadprobeinfo_field_size);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_event(
        @Ptr
        long info);

    public Pointer<GstEvent> get_event() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_event(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstEvent.class);
    }

    @Field(1)
    public long gstpadprobeinfo_field_offset() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstPadProbeInfo gstpadprobeinfo_field_offset(long gstpadprobeinfo_field_offset) {
        this.io.setLongField(this, 1, gstpadprobeinfo_field_offset);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstPadProbeType> gstpadprobeinfo_field_type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstPadProbeInfo gstpadprobeinfo_field_type(IntValuedEnum<GstPadProbeType> gstpadprobeinfo_field_type) {
        this.io.setEnumField(this, 2, gstpadprobeinfo_field_type);
        return this;
    }

    @Field(3)
    public Pointer gstpadprobeinfo_field_data() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstPadProbeInfo gstpadprobeinfo_field_data(Pointer gstpadprobeinfo_field_data) {
        this.io.setPointerField(this, 3, gstpadprobeinfo_field_data);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_query(
        @Ptr
        long info);

    public Pointer<GstQuery> get_query() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_query(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstQuery.class);
    }

    @Ptr
    protected native long gst_pad_probe_info_get_buffer_list(
        @Ptr
        long info);

    public Pointer<GstBufferList> get_buffer_list() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_buffer_list(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstBufferList.class);
    }

    @Field(4)
    public long gstpadprobeinfo_field_id() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstPadProbeInfo gstpadprobeinfo_field_id(long gstpadprobeinfo_field_id) {
        this.io.setLongField(this, 4, gstpadprobeinfo_field_id);
        return this;
    }

    @Field(5)
    private Pointer gstpadprobeinfo_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstPadProbeInfo gstpadprobeinfo_field__gst_reserved(Pointer gstpadprobeinfo_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstpadprobeinfo_field__gst_reserved);
        return this;
    }

    @Ptr
    protected native long gst_pad_probe_info_get_buffer(
        @Ptr
        long info);

    public Pointer<GstBuffer> get_buffer() {
        return Pointer.pointerToAddress(this.gst_pad_probe_info_get_buffer(Pointer.pointerTo(this, GstPadProbeInfo.class).getPeer()), GstBuffer.class);
    }

}
