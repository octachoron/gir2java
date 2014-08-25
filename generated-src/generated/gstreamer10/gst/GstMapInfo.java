
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstMapInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstMapInfo() {
        super();
    }

    public GstMapInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gstmapinfo_field_memory() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstMapInfo gstmapinfo_field_memory(Pointer gstmapinfo_field_memory) {
        this.io.setPointerField(this, 0, gstmapinfo_field_memory);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstMapFlags> gstmapinfo_field_flags() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstMapInfo gstmapinfo_field_flags(IntValuedEnum<GstMapFlags> gstmapinfo_field_flags) {
        this.io.setEnumField(this, 1, gstmapinfo_field_flags);
        return this;
    }

    @Field(2)
    public Pointer<Short> gstmapinfo_field_data() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstMapInfo gstmapinfo_field_data(Pointer<Short> gstmapinfo_field_data) {
        this.io.setPointerField(this, 2, gstmapinfo_field_data);
        return this;
    }

    @Field(3)
    public long gstmapinfo_field_size() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstMapInfo gstmapinfo_field_size(long gstmapinfo_field_size) {
        this.io.setLongField(this, 3, gstmapinfo_field_size);
        return this;
    }

    @Field(4)
    public long gstmapinfo_field_maxsize() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstMapInfo gstmapinfo_field_maxsize(long gstmapinfo_field_maxsize) {
        this.io.setLongField(this, 4, gstmapinfo_field_maxsize);
        return this;
    }

    @Field(5)
    public Pointer gstmapinfo_field_user_data() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstMapInfo gstmapinfo_field_user_data(Pointer gstmapinfo_field_user_data) {
        this.io.setPointerField(this, 5, gstmapinfo_field_user_data);
        return this;
    }

    @Field(6)
    private Pointer gstmapinfo_field__gst_reserved() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstMapInfo gstmapinfo_field__gst_reserved(Pointer gstmapinfo_field__gst_reserved) {
        this.io.setPointerField(this, 6, gstmapinfo_field__gst_reserved);
        return this;
    }

}
