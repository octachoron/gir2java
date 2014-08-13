
package generated.gstreamerpbutils10.gstpbutils;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstDiscovererAudioInfo
    extends StructObject
{


    public GstDiscovererAudioInfo() {
        super();
    }

    public GstDiscovererAudioInfo(Pointer pointer) {
        super(pointer);
    }

    protected native long gst_discoverer_audio_info_get_bitrate(
        @Ptr
        long info);

    public long get_bitrate() {
        return this.gst_discoverer_audio_info_get_bitrate(Pointer.pointerTo(this, GstDiscovererAudioInfo.class));
    }

    protected native long gst_discoverer_audio_info_get_channels(
        @Ptr
        long info);

    public long get_channels() {
        return this.gst_discoverer_audio_info_get_channels(Pointer.pointerTo(this, GstDiscovererAudioInfo.class));
    }

    protected native long gst_discoverer_audio_info_get_depth(
        @Ptr
        long info);

    public long get_depth() {
        return this.gst_discoverer_audio_info_get_depth(Pointer.pointerTo(this, GstDiscovererAudioInfo.class));
    }

    @Ptr
    protected native long gst_discoverer_audio_info_get_language(
        @Ptr
        long info);

    public Pointer get_language() {
        return Pointer.pointerToAddress(this.gst_discoverer_audio_info_get_language(Pointer.pointerTo(this, GstDiscovererAudioInfo.class)));
    }

    protected native long gst_discoverer_audio_info_get_max_bitrate(
        @Ptr
        long info);

    public long get_max_bitrate() {
        return this.gst_discoverer_audio_info_get_max_bitrate(Pointer.pointerTo(this, GstDiscovererAudioInfo.class));
    }

    protected native long gst_discoverer_audio_info_get_sample_rate(
        @Ptr
        long info);

    public long get_sample_rate() {
        return this.gst_discoverer_audio_info_get_sample_rate(Pointer.pointerTo(this, GstDiscovererAudioInfo.class));
    }

}
