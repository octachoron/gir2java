
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstRegistry
    extends GstObject
{


    public GstRegistry() {
        super();
    }

    public GstRegistry(Pointer pointer) {
        super(pointer);
    }

    public native boolean gst_registry_fork_is_enabled();

    public native void gst_registry_fork_set_enabled(boolean enabled);

    @Ptr
    protected native long gst_registry_get();

    public Pointer get() {
        return Pointer.pointerToAddress(this.gst_registry_get());
    }

    protected native boolean gst_registry_add_feature(
        @Ptr
        long registry,
        @Ptr
        long feature);

    public boolean add_feature(Pointer<GstPluginFeature> feature) {
        return this.gst_registry_add_feature(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(feature));
    }

    protected native boolean gst_registry_add_plugin(
        @Ptr
        long registry,
        @Ptr
        long plugin);

    public boolean add_plugin(Pointer<GstPlugin> plugin) {
        return this.gst_registry_add_plugin(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(plugin));
    }

    protected native boolean gst_registry_check_feature_version(
        @Ptr
        long registry,
        @Ptr
        long feature_name, long min_major, long min_minor, long min_micro);

    public boolean check_feature_version(Pointer feature_name, long min_major, long min_minor, long min_micro) {
        return this.gst_registry_check_feature_version(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(feature_name), min_major, min_minor, min_micro);
    }

    @Ptr
    protected native long gst_registry_feature_filter(
        @Ptr
        long registry, Object filter, boolean first, Pointer user_data);

    public Pointer<GList> feature_filter(Object filter, boolean first, Pointer user_data) {
        return Pointer.pointerToAddress(this.gst_registry_feature_filter(Pointer.pointerTo(this, GstRegistry.class), filter, first, user_data), Pointer.class);
    }

    @Ptr
    protected native long gst_registry_find_feature(
        @Ptr
        long registry,
        @Ptr
        long name, long type);

    public Pointer<GstPluginFeature> find_feature(Pointer name, long type) {
        return Pointer.pointerToAddress(this.gst_registry_find_feature(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(name), type), Pointer.class);
    }

    @Ptr
    protected native long gst_registry_find_plugin(
        @Ptr
        long registry,
        @Ptr
        long name);

    public Pointer<GstPlugin> find_plugin(Pointer name) {
        return Pointer.pointerToAddress(this.gst_registry_find_plugin(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long gst_registry_get_feature_list(
        @Ptr
        long registry, long type);

    public Pointer<GList> get_feature_list(long type) {
        return Pointer.pointerToAddress(this.gst_registry_get_feature_list(Pointer.pointerTo(this, GstRegistry.class), type), Pointer.class);
    }

    @Ptr
    protected native long gst_registry_get_feature_list_by_plugin(
        @Ptr
        long registry,
        @Ptr
        long name);

    public Pointer<GList> get_feature_list_by_plugin(Pointer name) {
        return Pointer.pointerToAddress(this.gst_registry_get_feature_list_by_plugin(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(name)), Pointer.class);
    }

    protected native long gst_registry_get_feature_list_cookie(
        @Ptr
        long registry);

    public long get_feature_list_cookie() {
        return this.gst_registry_get_feature_list_cookie(Pointer.pointerTo(this, GstRegistry.class));
    }

    @Ptr
    protected native long gst_registry_get_plugin_list(
        @Ptr
        long registry);

    public Pointer<GList> get_plugin_list() {
        return Pointer.pointerToAddress(this.gst_registry_get_plugin_list(Pointer.pointerTo(this, GstRegistry.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_registry_lookup(
        @Ptr
        long registry,
        @Ptr
        long filename);

    public Pointer<GstPlugin> lookup(Pointer filename) {
        return Pointer.pointerToAddress(this.gst_registry_lookup(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(filename)), Pointer.class);
    }

    @Ptr
    protected native long gst_registry_lookup_feature(
        @Ptr
        long registry,
        @Ptr
        long name);

    public Pointer<GstPluginFeature> lookup_feature(Pointer name) {
        return Pointer.pointerToAddress(this.gst_registry_lookup_feature(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long gst_registry_plugin_filter(
        @Ptr
        long registry, Object filter, boolean first, Pointer user_data);

    public Pointer<GList> plugin_filter(Object filter, boolean first, Pointer user_data) {
        return Pointer.pointerToAddress(this.gst_registry_plugin_filter(Pointer.pointerTo(this, GstRegistry.class), filter, first, user_data), Pointer.class);
    }

    protected native void gst_registry_remove_feature(
        @Ptr
        long registry,
        @Ptr
        long feature);

    public void remove_feature(Pointer<GstPluginFeature> feature) {
        this.gst_registry_remove_feature(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(feature));
    }

    protected native void gst_registry_remove_plugin(
        @Ptr
        long registry,
        @Ptr
        long plugin);

    public void remove_plugin(Pointer<GstPlugin> plugin) {
        this.gst_registry_remove_plugin(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(plugin));
    }

    protected native boolean gst_registry_scan_path(
        @Ptr
        long registry,
        @Ptr
        long path);

    public boolean scan_path(Pointer path) {
        return this.gst_registry_scan_path(Pointer.pointerTo(this, GstRegistry.class), Pointer.getPeer(path));
    }

    @Field(0)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRegistry field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstRegistry field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
