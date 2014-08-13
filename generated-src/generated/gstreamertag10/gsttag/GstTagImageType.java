
package generated.gstreamertag10.gsttag;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTagImageType
    implements IntValuedEnum<GstTagImageType>
{

    GST_TAG_IMAGE_TYPE_NONE(-1L),
    GST_TAG_IMAGE_TYPE_UNDEFINED(0L),
    GST_TAG_IMAGE_TYPE_FRONT_COVER(1L),
    GST_TAG_IMAGE_TYPE_BACK_COVER(2L),
    GST_TAG_IMAGE_TYPE_LEAFLET_PAGE(3L),
    GST_TAG_IMAGE_TYPE_MEDIUM(4L),
    GST_TAG_IMAGE_TYPE_LEAD_ARTIST(5L),
    GST_TAG_IMAGE_TYPE_ARTIST(6L),
    GST_TAG_IMAGE_TYPE_CONDUCTOR(7L),
    GST_TAG_IMAGE_TYPE_BAND_ORCHESTRA(8L),
    GST_TAG_IMAGE_TYPE_COMPOSER(9L),
    GST_TAG_IMAGE_TYPE_LYRICIST(10L),
    GST_TAG_IMAGE_TYPE_RECORDING_LOCATION(11L),
    GST_TAG_IMAGE_TYPE_DURING_RECORDING(12L),
    GST_TAG_IMAGE_TYPE_DURING_PERFORMANCE(13L),
    GST_TAG_IMAGE_TYPE_VIDEO_CAPTURE(14L),
    GST_TAG_IMAGE_TYPE_FISH(15L),
    GST_TAG_IMAGE_TYPE_ILLUSTRATION(16L),
    GST_TAG_IMAGE_TYPE_ARTIST_LOGO(17L),
    GST_TAG_IMAGE_TYPE_PUBLISHER_STUDIO_LOGO(18L);
    public final long value;

    GstTagImageType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTagImageType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTagImageType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
