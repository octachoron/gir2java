
package generated.gstreamernet10.gstnet;

import generated.gstreamer10.gst.GstSystemClock;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-net-1.0")
public class GstNetClientClock
    extends GstSystemClock
{


    public GstNetClientClock() {
        super();
    }

    public GstNetClientClock(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstSystemClock field_clock() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstNetClientClock field_clock(GstSystemClock field_clock) {
        this.io.setNativeObjectField(this, 0, field_clock);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstNetClientClock field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstNetClientClock field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
