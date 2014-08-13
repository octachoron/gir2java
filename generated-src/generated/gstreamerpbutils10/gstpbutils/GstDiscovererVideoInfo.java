
package generated.gstreamerpbutils10.gstpbutils;

import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstDiscovererVideoInfo
    extends GstDiscovererStreamInfo
{


    public GstDiscovererVideoInfo() {
        super();
    }

    public GstDiscovererVideoInfo(Pointer pointer) {
        super(pointer);
    }

    protected native long gst_discoverer_video_info_get_bitrate(
        @Ptr
        long info);

    public long get_bitrate() {
        return this.gst_discoverer_video_info_get_bitrate(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_depth(
        @Ptr
        long info);

    public long get_depth() {
        return this.gst_discoverer_video_info_get_depth(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_framerate_denom(
        @Ptr
        long info);

    public long get_framerate_denom() {
        return this.gst_discoverer_video_info_get_framerate_denom(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_framerate_num(
        @Ptr
        long info);

    public long get_framerate_num() {
        return this.gst_discoverer_video_info_get_framerate_num(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_height(
        @Ptr
        long info);

    public long get_height() {
        return this.gst_discoverer_video_info_get_height(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_max_bitrate(
        @Ptr
        long info);

    public long get_max_bitrate() {
        return this.gst_discoverer_video_info_get_max_bitrate(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_par_denom(
        @Ptr
        long info);

    public long get_par_denom() {
        return this.gst_discoverer_video_info_get_par_denom(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_par_num(
        @Ptr
        long info);

    public long get_par_num() {
        return this.gst_discoverer_video_info_get_par_num(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native long gst_discoverer_video_info_get_width(
        @Ptr
        long info);

    public long get_width() {
        return this.gst_discoverer_video_info_get_width(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native boolean gst_discoverer_video_info_is_image(
        @Ptr
        long info);

    public boolean is_image() {
        return this.gst_discoverer_video_info_is_image(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

    protected native boolean gst_discoverer_video_info_is_interlaced(
        @Ptr
        long info);

    public boolean is_interlaced() {
        return this.gst_discoverer_video_info_is_interlaced(Pointer.pointerTo(this, GstDiscovererVideoInfo.class));
    }

}
