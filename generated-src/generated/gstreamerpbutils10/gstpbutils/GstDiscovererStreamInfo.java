
package generated.gstreamerpbutils10.gstpbutils;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstStructure;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamer10.gst.GstToc;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstDiscovererStreamInfo
    extends GObject
{


    public GstDiscovererStreamInfo() {
        super();
    }

    public GstDiscovererStreamInfo(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_discoverer_stream_info_list_free(
        @Ptr
        long infos);

    public void list_free(Pointer<GList> infos) {
        this.gst_discoverer_stream_info_list_free(Pointer.getPeer(infos));
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_caps(
        @Ptr
        long info);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_caps(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_misc(
        @Ptr
        long info);

    public Pointer<GstStructure> get_misc() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_misc(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_next(
        @Ptr
        long info);

    public Pointer get_next() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_next(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)));
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_previous(
        @Ptr
        long info);

    public Pointer get_previous() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_previous(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)));
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_stream_id(
        @Ptr
        long info);

    public Pointer get_stream_id() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_stream_id(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)));
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_stream_type_nick(
        @Ptr
        long info);

    public Pointer get_stream_type_nick() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_stream_type_nick(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)));
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_tags(
        @Ptr
        long info);

    public Pointer<GstTagList> get_tags() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_tags(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_discoverer_stream_info_get_toc(
        @Ptr
        long info);

    public Pointer<GstToc> get_toc() {
        return Pointer.pointerToAddress(this.gst_discoverer_stream_info_get_toc(Pointer.pointerTo(this, GstDiscovererStreamInfo.class)), Pointer.class);
    }

}
