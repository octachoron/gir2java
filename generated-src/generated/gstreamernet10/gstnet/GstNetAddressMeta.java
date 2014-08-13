
package generated.gstreamernet10.gstnet;

import generated.gio20.gio.GSocketAddress;
import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-net-1.0")
public class GstNetAddressMeta
    extends StructObject
{


    public GstNetAddressMeta() {
        super();
    }

    public GstNetAddressMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstNetAddressMeta field_meta(GstMeta field_meta) {
        this.io.setNativeObjectField(this, 0, field_meta);
        return this;
    }

    @Field(1)
    public Pointer<GSocketAddress> field_addr() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstNetAddressMeta field_addr(Pointer<GSocketAddress> field_addr) {
        this.io.setPointerField(this, 1, field_addr);
        return this;
    }

    @Ptr
    protected native long gst_net_address_meta_get_info();

    public Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(this.gst_net_address_meta_get_info(), Pointer.class);
    }

}
