
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstStaticCaps
    extends StructObject
{


    public GstStaticCaps() {
        super();
    }

    public GstStaticCaps(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstCaps> field_caps() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstStaticCaps field_caps(Pointer<GstCaps> field_caps) {
        this.io.setPointerField(this, 0, field_caps);
        return this;
    }

    @Field(1)
    public Pointer field_string() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstStaticCaps field_string(Pointer field_string) {
        this.io.setPointerField(this, 1, field_string);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstStaticCaps field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    protected native void gst_static_caps_cleanup(
        @Ptr
        long static_caps);

    public void cleanup() {
        this.gst_static_caps_cleanup(Pointer.pointerTo(this, GstStaticCaps.class));
    }

    @Ptr
    protected native long gst_static_caps_get(
        @Ptr
        long static_caps);

    public Pointer<GstCaps> get() {
        return Pointer.pointerToAddress(this.gst_static_caps_get(Pointer.pointerTo(this, GstStaticCaps.class)), Pointer.class);
    }

}
