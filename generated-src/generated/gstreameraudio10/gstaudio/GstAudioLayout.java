
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAudioLayout
    implements IntValuedEnum<GstAudioLayout>
{

    GST_AUDIO_LAYOUT_INTERLEAVED(0L),
    GST_AUDIO_LAYOUT_NON_INTERLEAVED(1L);
    public final long value;

    GstAudioLayout(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioLayout> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioLayout> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
