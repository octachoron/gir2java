
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAudioPackFlags
    implements IntValuedEnum<GstAudioPackFlags>
{

    GST_AUDIO_PACK_FLAGS_NONE(0L);
    public final long value;

    GstAudioPackFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioPackFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioPackFlags> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
