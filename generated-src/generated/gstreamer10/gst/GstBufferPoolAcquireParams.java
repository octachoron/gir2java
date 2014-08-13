
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstBufferPoolAcquireParams
    extends StructObject
{


    public GstBufferPoolAcquireParams() {
        super();
    }

    public GstBufferPoolAcquireParams(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_stop() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBufferPoolAcquireParams field_stop(long field_stop) {
        this.io.setNativeObjectField(this, 0, field_stop);
        return this;
    }

    @Field(1)
    public long field_start() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstBufferPoolAcquireParams field_start(long field_start) {
        this.io.setNativeObjectField(this, 1, field_start);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstFormat> field_format() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstBufferPoolAcquireParams field_format(IntValuedEnum<GstFormat> field_format) {
        this.io.setEnumField(this, 2, field_format);
        return this;
    }

    @Field(3)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstBufferPoolAcquireParams field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 3, field_flags);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstBufferPoolAcquireParams field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

}
