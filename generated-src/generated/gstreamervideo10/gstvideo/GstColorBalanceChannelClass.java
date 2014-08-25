
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstColorBalanceChannelClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstColorBalanceChannelClass() {
        super();
    }

    public GstColorBalanceChannelClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gstcolorbalancechannelclass_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstColorBalanceChannelClass gstcolorbalancechannelclass_field_parent(GObjectClass gstcolorbalancechannelclass_field_parent) {
        this.io.setNativeObjectField(this, 0, gstcolorbalancechannelclass_field_parent);
        return this;
    }

    @Field(1)
    private Pointer gstcolorbalancechannelclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstColorBalanceChannelClass gstcolorbalancechannelclass_field__gst_reserved(Pointer gstcolorbalancechannelclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstcolorbalancechannelclass_field__gst_reserved);
        return this;
    }

}
