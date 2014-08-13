
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAudioBaseSrcSlaveMethod
    implements IntValuedEnum<GstAudioBaseSrcSlaveMethod>
{

    GST_AUDIO_BASE_SRC_SLAVE_METHOD_RESAMPLE(0L),
    GST_AUDIO_BASE_SRC_SLAVE_METHOD_RE_TIMESTAMP(1L),
    GST_AUDIO_BASE_SRC_SLAVE_METHOD_SKEW(2L),
    GST_AUDIO_BASE_SRC_SLAVE_METHOD_NONE(3L);
    public final long value;

    GstAudioBaseSrcSlaveMethod(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioBaseSrcSlaveMethod> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioBaseSrcSlaveMethod> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
