
package generated.gstreamerpbutils10.gstpbutils;

import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstDiscovererSubtitleInfo
    extends GstDiscovererStreamInfo
{


    public GstDiscovererSubtitleInfo() {
        super();
    }

    public GstDiscovererSubtitleInfo(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_discoverer_subtitle_info_get_language(
        @Ptr
        long info);

    public Pointer get_language() {
        return Pointer.pointerToAddress(this.gst_discoverer_subtitle_info_get_language(Pointer.pointerTo(this, GstDiscovererSubtitleInfo.class)));
    }

}
