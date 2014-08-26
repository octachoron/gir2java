
package generated.gstreamer10.gst;

import generated.glib20.glib.GThreadPool;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstBinClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBinClass() {
        super();
    }

    public GstBinClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer<GThreadPool> gstbinclass_field_pool() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GstBinClass gstbinclass_field_pool(Pointer<GThreadPool> gstbinclass_field_pool) {
        this.io.setPointerField(this, 0, gstbinclass_field_pool);
        return this;
    }

    @Field(1)
    public GstElementClass gstbinclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstBinClass gstbinclass_field_parent_class(GstElementClass gstbinclass_field_parent_class) {
        this.io.setNativeObjectField(this, 1, gstbinclass_field_parent_class);
        return this;
    }

    @Field(2)
    private Pointer gstbinclass_field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstBinClass gstbinclass_field__gst_reserved(Pointer gstbinclass_field__gst_reserved) {
        this.io.setPointerField(this, 2, gstbinclass_field__gst_reserved);
        return this;
    }

}
