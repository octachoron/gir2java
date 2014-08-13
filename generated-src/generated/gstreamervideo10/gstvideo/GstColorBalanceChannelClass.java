
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstColorBalanceChannelClass
    extends StructObject
{


    public GstColorBalanceChannelClass() {
        super();
    }

    public GstColorBalanceChannelClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstColorBalanceChannelClass field_parent(GObjectClass field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstColorBalanceChannelClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
