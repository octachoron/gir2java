
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoGLTextureType
    implements IntValuedEnum<GstVideoGLTextureType>
{

    GST_VIDEOGL_TEXTURE_TYPE_LUMINANCE(0L),
    GST_VIDEOGL_TEXTURE_TYPE_LUMINANCE_ALPHA(1L),
    GST_VIDEOGL_TEXTURE_TYPE_RGB16(2L),
    GST_VIDEOGL_TEXTURE_TYPE_RGB(3L),
    GST_VIDEOGL_TEXTURE_TYPE_RGBA(4L),
    GST_VIDEOGL_TEXTURE_TYPE_R(5L),
    GST_VIDEOGL_TEXTURE_TYPE_RG(6L);
    public final long value;

    GstVideoGLTextureType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoGLTextureType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoGLTextureType> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoGLTextureType.values());
    }

}
