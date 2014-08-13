
package generated.gstreamerpbutils10.gstpbutils;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-pbutils-1.0")
public class GstDiscovererClass
    extends StructObject
{


    public GstDiscovererClass() {
        super();
    }

    public GstDiscovererClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass field_parentclass() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstDiscovererClass field_parentclass(GObjectClass field_parentclass) {
        this.io.setNativeObjectField(this, 0, field_parentclass);
        return this;
    }

    @Field(1)
    public Pointer field__reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstDiscovererClass field__reserved(Pointer field__reserved) {
        this.io.setPointerField(this, 1, field__reserved);
        return this;
    }

}
