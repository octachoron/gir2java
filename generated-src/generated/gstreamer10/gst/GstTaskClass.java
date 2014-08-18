
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstTaskClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstTaskClass() {
        super();
    }

    public GstTaskClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTaskClass field_parent_class(GstObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer field_pool() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstTaskClass field_pool(Pointer field_pool) {
        this.io.setPointerField(this, 1, field_pool);
        return this;
    }

    @Field(2)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstTaskClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
