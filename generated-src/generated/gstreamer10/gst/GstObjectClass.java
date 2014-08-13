
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GInitiallyUnownedClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstObjectClass
    extends StructObject
{


    public GstObjectClass() {
        super();
    }

    public GstObjectClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GInitiallyUnownedClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstObjectClass field_parent_class(GInitiallyUnownedClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field_path_string_separator() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstObjectClass field_path_string_separator(Pointer field_path_string_separator) {
        this.io.setPointerField(this, 1, field_path_string_separator);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstObjectClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
