
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPluginFeature
    extends GstObject
{


    public GstPluginFeature() {
        super();
    }

    public GstPluginFeature(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_plugin_feature_list_copy(
        @Ptr
        long list);

    public Pointer<GList> list_copy(Pointer<GList> list) {
        return Pointer.pointerToAddress(this.gst_plugin_feature_list_copy(Pointer.getPeer(list)), Pointer.class);
    }

    protected native void gst_plugin_feature_list_debug(
        @Ptr
        long list);

    public void list_debug(Pointer<GList> list) {
        this.gst_plugin_feature_list_debug(Pointer.getPeer(list));
    }

    protected native void gst_plugin_feature_list_free(
        @Ptr
        long list);

    public void list_free(Pointer<GList> list) {
        this.gst_plugin_feature_list_free(Pointer.getPeer(list));
    }

    public native int gst_plugin_feature_rank_compare_func(Pointer p1, Pointer p2);

    protected native boolean gst_plugin_feature_check_version(
        @Ptr
        long feature, long min_major, long min_minor, long min_micro);

    public boolean check_version(long min_major, long min_minor, long min_micro) {
        return this.gst_plugin_feature_check_version(Pointer.pointerTo(this, GstPluginFeature.class), min_major, min_minor, min_micro);
    }

    @Ptr
    protected native long gst_plugin_feature_get_plugin(
        @Ptr
        long feature);

    public Pointer<GstPlugin> get_plugin() {
        return Pointer.pointerToAddress(this.gst_plugin_feature_get_plugin(Pointer.pointerTo(this, GstPluginFeature.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_plugin_feature_get_plugin_name(
        @Ptr
        long feature);

    public Pointer get_plugin_name() {
        return Pointer.pointerToAddress(this.gst_plugin_feature_get_plugin_name(Pointer.pointerTo(this, GstPluginFeature.class)));
    }

    protected native long gst_plugin_feature_get_rank(
        @Ptr
        long feature);

    public long get_rank() {
        return this.gst_plugin_feature_get_rank(Pointer.pointerTo(this, GstPluginFeature.class));
    }

    @Ptr
    protected native long gst_plugin_feature_load(
        @Ptr
        long feature);

    public Pointer load() {
        return Pointer.pointerToAddress(this.gst_plugin_feature_load(Pointer.pointerTo(this, GstPluginFeature.class)));
    }

    protected native void gst_plugin_feature_set_rank(
        @Ptr
        long feature, long rank);

    public void set_rank(long rank) {
        this.gst_plugin_feature_set_rank(Pointer.pointerTo(this, GstPluginFeature.class), rank);
    }

}
