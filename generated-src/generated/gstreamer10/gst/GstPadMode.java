
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstPadMode
    implements IntValuedEnum<GstPadMode>
{

    GST_PAD_MODE_NONE(0L),
    GST_PAD_MODE_PUSH(1L),
    GST_PAD_MODE_PULL(2L);
    public final long value;

    GstPadMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    @Ptr
    protected native long gst_pad_mode_get_name(IntValuedEnum<GstPadMode> mode);

    public Pointer get_name(IntValuedEnum<GstPadMode> mode) {
        return Pointer.pointerToAddress(this.gst_pad_mode_get_name(mode));
    }

}
