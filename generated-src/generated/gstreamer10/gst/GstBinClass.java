
package generated.gstreamer10.gst;

import generated.glib20.glib.GThreadPool;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstBinClass
    extends StructObject
{


    public GstBinClass() {
        super();
    }

    public GstBinClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstBinClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 0, field__gst_reserved);
        return this;
    }

    @Field(1)
    public Pointer<GThreadPool> field_pool() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBinClass field_pool(Pointer<GThreadPool> field_pool) {
        this.io.setPointerField(this, 1, field_pool);
        return this;
    }

    @Field(2)
    public GstElementClass field_parent_class() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstBinClass field_parent_class(GstElementClass field_parent_class) {
        this.io.setNativeObjectField(this, 2, field_parent_class);
        return this;
    }

}
