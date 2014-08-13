
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstRTSPVersion
    implements IntValuedEnum<GstRTSPVersion>
{

    GSTRTSP_VERSION_INVALID(0L),
    GSTRTSP_VERSION_1_0(16L),
    GSTRTSP_VERSION_1_1(17L);
    public final long value;

    GstRTSPVersion(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPVersion> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPVersion> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    @Ptr
    protected native long gst_rtsp_version_as_text(IntValuedEnum<GstRTSPVersion> version);

    public Pointer as_text(IntValuedEnum<GstRTSPVersion> version) {
        return Pointer.pointerToAddress(this.gst_rtsp_version_as_text(version));
    }

}
