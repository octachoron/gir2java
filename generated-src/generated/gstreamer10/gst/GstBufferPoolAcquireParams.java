
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstBufferPoolAcquireParams
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBufferPoolAcquireParams() {
        super();
    }

    public GstBufferPoolAcquireParams(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gstbufferpoolacquireparams_field_start() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstBufferPoolAcquireParams gstbufferpoolacquireparams_field_start(long gstbufferpoolacquireparams_field_start) {
        this.io.setLongField(this, 0, gstbufferpoolacquireparams_field_start);
        return this;
    }

    @Field(1)
    public long gstbufferpoolacquireparams_field_stop() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstBufferPoolAcquireParams gstbufferpoolacquireparams_field_stop(long gstbufferpoolacquireparams_field_stop) {
        this.io.setLongField(this, 1, gstbufferpoolacquireparams_field_stop);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstFormat> gstbufferpoolacquireparams_field_format() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstBufferPoolAcquireParams gstbufferpoolacquireparams_field_format(IntValuedEnum<GstFormat> gstbufferpoolacquireparams_field_format) {
        this.io.setEnumField(this, 2, gstbufferpoolacquireparams_field_format);
        return this;
    }

    @Field(3)
    private Pointer gstbufferpoolacquireparams_field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstBufferPoolAcquireParams gstbufferpoolacquireparams_field__gst_reserved(Pointer gstbufferpoolacquireparams_field__gst_reserved) {
        this.io.setPointerField(this, 3, gstbufferpoolacquireparams_field__gst_reserved);
        return this;
    }

    @Field(4)
    public IntValuedEnum<GstBufferPoolAcquireFlags> gstbufferpoolacquireparams_field_flags() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public GstBufferPoolAcquireParams gstbufferpoolacquireparams_field_flags(IntValuedEnum<GstBufferPoolAcquireFlags> gstbufferpoolacquireparams_field_flags) {
        this.io.setEnumField(this, 4, gstbufferpoolacquireparams_field_flags);
        return this;
    }

}
