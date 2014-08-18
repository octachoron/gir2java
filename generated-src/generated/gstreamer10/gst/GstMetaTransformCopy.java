
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstMetaTransformCopy
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstMetaTransformCopy() {
        super();
    }

    public GstMetaTransformCopy(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public boolean field_region() {
        return this.io.getBooleanField(this, 0);
    }

    @Field(0)
    public GstMetaTransformCopy field_region(boolean field_region) {
        this.io.setBooleanField(this, 0, field_region);
        return this;
    }

    @Field(1)
    public long field_offset() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstMetaTransformCopy field_offset(long field_offset) {
        this.io.setLongField(this, 1, field_offset);
        return this;
    }

    @Field(2)
    public long field_size() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstMetaTransformCopy field_size(long field_size) {
        this.io.setLongField(this, 2, field_size);
        return this;
    }

}
