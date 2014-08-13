
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoGLTextureOrientation
    implements IntValuedEnum<GstVideoGLTextureOrientation>
{

    GST_VIDEOGL_TEXTURE_ORIENTATION_NORMAL_Y_NORMAL(0L),
    GST_VIDEOGL_TEXTURE_ORIENTATION_NORMAL_Y_FLIP(1L),
    GST_VIDEOGL_TEXTURE_ORIENTATION_FLIP_Y_NORMAL(2L),
    GST_VIDEOGL_TEXTURE_ORIENTATION_FLIP_Y_FLIP(3L);
    public final long value;

    GstVideoGLTextureOrientation(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoGLTextureOrientation> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoGLTextureOrientation> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
