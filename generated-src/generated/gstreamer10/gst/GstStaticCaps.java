
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstStaticCaps
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstStaticCaps() {
        super();
    }

    public GstStaticCaps(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstCaps> gststaticcaps_field_caps() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstStaticCaps gststaticcaps_field_caps(Pointer<GstCaps> gststaticcaps_field_caps) {
        this.io.setPointerField(this, 0, gststaticcaps_field_caps);
        return this;
    }

    @Field(1)
    public Pointer gststaticcaps_field_string() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstStaticCaps gststaticcaps_field_string(Pointer gststaticcaps_field_string) {
        this.io.setPointerField(this, 1, gststaticcaps_field_string);
        return this;
    }

    @Field(2)
    private Pointer gststaticcaps_field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstStaticCaps gststaticcaps_field__gst_reserved(Pointer gststaticcaps_field__gst_reserved) {
        this.io.setPointerField(this, 2, gststaticcaps_field__gst_reserved);
        return this;
    }

    protected native void gst_static_caps_cleanup(
        @Ptr
        long static_caps);

    public void cleanup() {
        this.gst_static_caps_cleanup(Pointer.pointerTo(this, GstStaticCaps.class).getPeer());
    }

    @Ptr
    protected native long gst_static_caps_get(
        @Ptr
        long static_caps);

    public Pointer<GstCaps> get() {
        return Pointer.pointerToAddress(this.gst_static_caps_get(Pointer.pointerTo(this, GstStaticCaps.class).getPeer()), GstCaps.class);
    }

}
