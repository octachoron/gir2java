
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAudioCdSrcMode
    implements IntValuedEnum<GstAudioCdSrcMode>
{

    GST_AUDIO_CD_SRC_MODE_NORMAL(0L),
    GST_AUDIO_CD_SRC_MODE_CONTINUOUS(1L);
    public final long value;

    GstAudioCdSrcMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioCdSrcMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioCdSrcMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
