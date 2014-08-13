
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAudioBaseSinkSlaveMethod
    implements IntValuedEnum<GstAudioBaseSinkSlaveMethod>
{

    GST_AUDIO_BASE_SINK_SLAVE_METHOD_RESAMPLE(0L),
    GST_AUDIO_BASE_SINK_SLAVE_METHOD_SKEW(1L),
    GST_AUDIO_BASE_SINK_SLAVE_METHOD_NONE(2L);
    public final long value;

    GstAudioBaseSinkSlaveMethod(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioBaseSinkSlaveMethod> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioBaseSinkSlaveMethod> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
