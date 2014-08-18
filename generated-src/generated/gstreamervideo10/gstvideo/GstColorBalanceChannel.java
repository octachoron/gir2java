
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstColorBalanceChannel
    extends GObject
{


    static {
        BridJ.register();
    }

    public GstColorBalanceChannel() {
        super();
    }

    public GstColorBalanceChannel(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObject field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstColorBalanceChannel field_parent(GObject field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field_label() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstColorBalanceChannel field_label(Pointer field_label) {
        this.io.setPointerField(this, 1, field_label);
        return this;
    }

    @Field(2)
    public int field_min_value() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstColorBalanceChannel field_min_value(int field_min_value) {
        this.io.setIntField(this, 2, field_min_value);
        return this;
    }

    @Field(3)
    public int field_max_value() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GstColorBalanceChannel field_max_value(int field_max_value) {
        this.io.setIntField(this, 3, field_max_value);
        return this;
    }

    @Field(4)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstColorBalanceChannel field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

}
