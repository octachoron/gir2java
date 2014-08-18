
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoChromaSite
    implements IntValuedEnum<GstVideoChromaSite>
{

    GST_VIDEO_CHROMA_SITE_UNKNOWN(0L),
    GST_VIDEO_CHROMA_SITE_NONE(1L),
    GST_VIDEO_CHROMA_SITE_H_COSITED(2L),
    GST_VIDEO_CHROMA_SITE_V_COSITED(4L),
    GST_VIDEO_CHROMA_SITE_ALT_LINE(8L),
    GST_VIDEO_CHROMA_SITE_COSITED(6L),
    GST_VIDEO_CHROMA_SITE_JPEG(1L),
    GST_VIDEO_CHROMA_SITE_MPEG2(2L),
    GST_VIDEO_CHROMA_SITE_DV(14L);
    public final long value;

    GstVideoChromaSite(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoChromaSite> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoChromaSite> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoChromaSite.values());
    }

}
