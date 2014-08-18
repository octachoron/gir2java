
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
    public Pointer field_memory() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstMapInfo field_memory(Pointer field_memory) {
        this.io.setPointerField(this, 0, field_memory);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstMapFlags> field_flags() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstMapInfo field_flags(IntValuedEnum<GstMapFlags> field_flags) {
        this.io.setEnumField(this, 1, field_flags);
        return this;
    }

    @Field(2)
    public Pointer<Short> field_data() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstMapInfo field_data(Pointer<Short> field_data) {
        this.io.setPointerField(this, 2, field_data);
        return this;
    }

    @Field(3)
    public long field_size() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstMapInfo field_size(long field_size) {
        this.io.setLongField(this, 3, field_size);
        return this;
    }

    @Field(4)
    public long field_maxsize() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstMapInfo field_maxsize(long field_maxsize) {
        this.io.setLongField(this, 4, field_maxsize);
        return this;
    }

    @Field(5)
    public Pointer field_user_data() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstMapInfo field_user_data(Pointer field_user_data) {
        this.io.setPointerField(this, 5, field_user_data);
        return this;
    }

    @Field(6)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstMapInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 6, field__gst_reserved);
        return this;
    }

}
