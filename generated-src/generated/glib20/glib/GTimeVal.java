
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTimeVal
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTimeVal() {
        super();
    }

    public GTimeVal(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gtimeval_field_tv_sec() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GTimeVal gtimeval_field_tv_sec(long gtimeval_field_tv_sec) {
        this.io.setLongField(this, 0, gtimeval_field_tv_sec);
        return this;
    }

    @Field(1)
    public long gtimeval_field_tv_usec() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GTimeVal gtimeval_field_tv_usec(long gtimeval_field_tv_usec) {
        this.io.setLongField(this, 1, gtimeval_field_tv_usec);
        return this;
    }

    protected native void g_time_val_add(
        @Ptr
        long time_, long microseconds);

    public void add(long microseconds) {
        this.g_time_val_add(Pointer.pointerTo(this, GTimeVal.class).getPeer(), microseconds);
    }

    @Ptr
    protected native long g_time_val_to_iso8601(
        @Ptr
        long time_);

    public Pointer to_iso8601() {
        return Pointer.pointerToAddress(this.g_time_val_to_iso8601(Pointer.pointerTo(this, GTimeVal.class).getPeer()));
    }

    protected static native boolean g_time_val_from_iso8601(
        @Ptr
        long iso_date,
        @Ptr
        long time_);

    public static boolean from_iso8601(Pointer iso_date, Pointer time_) {
        return GTimeVal.g_time_val_from_iso8601(Pointer.getPeer(iso_date), Pointer.getPeer(time_));
    }

}
