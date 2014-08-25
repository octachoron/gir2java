
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GInitiallyUnownedClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstObjectClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstObjectClass() {
        super();
    }

    public GstObjectClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GInitiallyUnownedClass gstobjectclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstObjectClass gstobjectclass_field_parent_class(GInitiallyUnownedClass gstobjectclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstobjectclass_field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer gstobjectclass_field_path_string_separator() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstObjectClass gstobjectclass_field_path_string_separator(Pointer gstobjectclass_field_path_string_separator) {
        this.io.setPointerField(this, 1, gstobjectclass_field_path_string_separator);
        return this;
    }

    @Field(2)
    private Pointer gstobjectclass_field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstObjectClass gstobjectclass_field__gst_reserved(Pointer gstobjectclass_field__gst_reserved) {
        this.io.setPointerField(this, 2, gstobjectclass_field__gst_reserved);
        return this;
    }

}
