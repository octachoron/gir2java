
package generated.gstreamerpbutils10.gstpbutils;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstStructure;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamer10.gst.GstToc;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstDiscovererInfo
    extends GObject
{


    public GstDiscovererInfo() {
        super();
    }

    public GstDiscovererInfo(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_discoverer_info_copy(
        @Ptr
        long ptr);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_copy(Pointer.pointerTo(this, GstDiscovererInfo.class)));
    }

    @Ptr
    protected native long gst_discoverer_info_get_audio_streams(
        @Ptr
        long info);

    public Pointer<GList> get_audio_streams() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_audio_streams(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_info_get_container_streams(
        @Ptr
        long info);

    public Pointer<GList> get_container_streams() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_container_streams(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    protected native Object gst_discoverer_info_get_duration(
        @Ptr
        long info);

    public Object get_duration() {
        return this.gst_discoverer_info_get_duration(Pointer.pointerTo(this, GstDiscovererInfo.class));
    }

    @Ptr
    protected native long gst_discoverer_info_get_misc(
        @Ptr
        long info);

    public Pointer<GstStructure> get_misc() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_misc(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    protected native boolean gst_discoverer_info_get_seekable(
        @Ptr
        long info);

    public boolean get_seekable() {
        return this.gst_discoverer_info_get_seekable(Pointer.pointerTo(this, GstDiscovererInfo.class));
    }

    @Ptr
    protected native long gst_discoverer_info_get_stream_info(
        @Ptr
        long info);

    public Pointer get_stream_info() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_stream_info(Pointer.pointerTo(this, GstDiscovererInfo.class)));
    }

    @Ptr
    protected native long gst_discoverer_info_get_stream_list(
        @Ptr
        long info);

    public Pointer<GList> get_stream_list() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_stream_list(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_info_get_streams(
        @Ptr
        long info, long streamtype);

    public Pointer<GList> get_streams(long streamtype) {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_streams(Pointer.pointerTo(this, GstDiscovererInfo.class), streamtype), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_info_get_subtitle_streams(
        @Ptr
        long info);

    public Pointer<GList> get_subtitle_streams() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_subtitle_streams(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_info_get_tags(
        @Ptr
        long info);

    public Pointer<GstTagList> get_tags() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_tags(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_info_get_toc(
        @Ptr
        long info);

    public Pointer<GstToc> get_toc() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_toc(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_info_get_uri(
        @Ptr
        long info);

    public Pointer get_uri() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_uri(Pointer.pointerTo(this, GstDiscovererInfo.class)));
    }

    @Ptr
    protected native long gst_discoverer_info_get_video_streams(
        @Ptr
        long info);

    public Pointer<GList> get_video_streams() {
        return Pointer.pointerToAddress(this.gst_discoverer_info_get_video_streams(Pointer.pointerTo(this, GstDiscovererInfo.class)), Pointer.class);
    }

    protected native IntValuedEnum<GstDiscovererResult> gst_discoverer_info_get_result(
        @Ptr
        long info);

    public IntValuedEnum<GstDiscovererResult> get_result() {
        return this.gst_discoverer_info_get_result(Pointer.pointerTo(this, GstDiscovererInfo.class));
    }

}
