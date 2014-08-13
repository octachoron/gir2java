
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAudioRingBufferFormatType
    implements IntValuedEnum<GstAudioRingBufferFormatType>
{

    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_RAW(0L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_MU_LAW(1L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_A_LAW(2L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_IMA_ADPCM(3L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_MPEG(4L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_GSM(5L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_IEC958(6L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_AC3(7L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_EAC3(8L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_DTS(9L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_MPEG2_AAC(10L),
    GST_AUDIO_RING_BUFFER_FORMAT_TYPE_MPEG4_AAC(11L);
    public final long value;

    GstAudioRingBufferFormatType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioRingBufferFormatType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioRingBufferFormatType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
