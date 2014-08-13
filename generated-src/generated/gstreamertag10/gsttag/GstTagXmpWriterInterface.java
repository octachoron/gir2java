
package generated.gstreamertag10.gsttag;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-tag-1.0")
public class GstTagXmpWriterInterface
    extends StructObject
{


    public GstTagXmpWriterInterface() {
        super();
    }

    public GstTagXmpWriterInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTagXmpWriterInterface field_parent(GTypeInterface field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

}
