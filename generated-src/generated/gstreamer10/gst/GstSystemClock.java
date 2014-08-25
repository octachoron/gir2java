
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstSystemClock
    extends GstClock
{


    static {
        BridJ.register();
    }

    public GstSystemClock() {
        super();
    }

    public GstSystemClock(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_system_clock_obtain();

    public static Pointer<GstClock> obtain() {
        return Pointer.pointerToAddress(GstSystemClock.gst_system_clock_obtain(), GstClock.class);
    }

    @Field(0)
    public GstClock gstsystemclock_field_clock() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstSystemClock gstsystemclock_field_clock(GstClock gstsystemclock_field_clock) {
        this.io.setNativeObjectField(this, 0, gstsystemclock_field_clock);
        return this;
    }

    @Field(1)
    private Pointer gstsystemclock_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstSystemClock gstsystemclock_field_priv(Pointer gstsystemclock_field_priv) {
        this.io.setPointerField(this, 1, gstsystemclock_field_priv);
        return this;
    }

    @Field(2)
    private Pointer gstsystemclock_field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstSystemClock gstsystemclock_field__gst_reserved(Pointer gstsystemclock_field__gst_reserved) {
        this.io.setPointerField(this, 2, gstsystemclock_field__gst_reserved);
        return this;
    }

}
