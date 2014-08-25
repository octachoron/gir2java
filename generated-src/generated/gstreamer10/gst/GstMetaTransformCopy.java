
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
    public boolean gstmetatransformcopy_field_region() {
        return this.io.getBooleanField(this, 0);
    }

    @Field(0)
    public GstMetaTransformCopy gstmetatransformcopy_field_region(boolean gstmetatransformcopy_field_region) {
        this.io.setBooleanField(this, 0, gstmetatransformcopy_field_region);
        return this;
    }

    @Field(1)
    public long gstmetatransformcopy_field_offset() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstMetaTransformCopy gstmetatransformcopy_field_offset(long gstmetatransformcopy_field_offset) {
        this.io.setLongField(this, 1, gstmetatransformcopy_field_offset);
        return this;
    }

    @Field(2)
    public long gstmetatransformcopy_field_size() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstMetaTransformCopy gstmetatransformcopy_field_size(long gstmetatransformcopy_field_size) {
        this.io.setLongField(this, 2, gstmetatransformcopy_field_size);
        return this;
    }

}
