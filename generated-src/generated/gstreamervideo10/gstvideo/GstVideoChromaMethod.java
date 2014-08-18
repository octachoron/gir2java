
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoChromaMethod
    implements IntValuedEnum<GstVideoChromaMethod>
{

    GST_VIDEO_CHROMA_METHOD_NEAREST(0L),
    GST_VIDEO_CHROMA_METHOD_LINEAR(1L);
    public final long value;

    GstVideoChromaMethod(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoChromaMethod> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoChromaMethod> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoChromaMethod.values());
    }

}
