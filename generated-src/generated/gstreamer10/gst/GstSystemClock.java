
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstSystemClock
    extends GstClock
{


    public GstSystemClock() {
        super();
    }

    public GstSystemClock(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_system_clock_obtain();

    public Pointer<GstClock> obtain() {
        return Pointer.pointerToAddress(this.gst_system_clock_obtain(), Pointer.class);
    }

    @Field(0)
    public GstClock field_clock() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstSystemClock field_clock(GstClock field_clock) {
        this.io.setNativeObjectField(this, 0, field_clock);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSystemClock field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstSystemClock field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

}
