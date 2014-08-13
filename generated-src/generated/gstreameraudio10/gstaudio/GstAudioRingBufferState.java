
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAudioRingBufferState
    implements IntValuedEnum<GstAudioRingBufferState>
{

    GST_AUDIO_RING_BUFFER_STATE_STOPPED(0L),
    GST_AUDIO_RING_BUFFER_STATE_PAUSED(1L),
    GST_AUDIO_RING_BUFFER_STATE_STARTED(2L),
    GST_AUDIO_RING_BUFFER_STATE_ERROR(3L);
    public final long value;

    GstAudioRingBufferState(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioRingBufferState> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioRingBufferState> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
