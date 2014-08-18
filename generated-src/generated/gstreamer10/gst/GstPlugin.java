
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPlugin
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstPlugin() {
        super();
    }

    public GstPlugin(Pointer pointer) {
        super(pointer);
    }

    protected static native void gst_plugin_list_free(
        @Ptr
        long list);

    public static void list_free(Pointer<GList> list) {
        GstPlugin.gst_plugin_list_free(Pointer.getPeer(list));
    }

    @Ptr
    protected static native long gst_plugin_load_by_name(
        @Ptr
        long name);

    public static Pointer load_by_name(Pointer name) {
        return Pointer.pointerToAddress(GstPlugin.gst_plugin_load_by_name(Pointer.getPeer(name)));
    }

    @Ptr
    protected static native long gst_plugin_load_file(
        @Ptr
        long filename);

    public static Pointer load_file(Pointer filename) {
        return Pointer.pointerToAddress(GstPlugin.gst_plugin_load_file(Pointer.getPeer(filename)));
    }

    @Ptr
    protected native long gst_plugin_get_cache_data(
        @Ptr
        long plugin);

    public Pointer get_cache_data() {
        return Pointer.pointerToAddress(this.gst_plugin_get_cache_data(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_description(
        @Ptr
        long plugin);

    public Pointer get_description() {
        return Pointer.pointerToAddress(this.gst_plugin_get_description(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_filename(
        @Ptr
        long plugin);

    public Pointer get_filename() {
        return Pointer.pointerToAddress(this.gst_plugin_get_filename(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_license(
        @Ptr
        long plugin);

    public Pointer get_license() {
        return Pointer.pointerToAddress(this.gst_plugin_get_license(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_name(
        @Ptr
        long plugin);

    public Pointer gstplugin_get_name() {
        return Pointer.pointerToAddress(this.gst_plugin_get_name(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_origin(
        @Ptr
        long plugin);

    public Pointer get_origin() {
        return Pointer.pointerToAddress(this.gst_plugin_get_origin(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_package(
        @Ptr
        long plugin);

    public Pointer get_package() {
        return Pointer.pointerToAddress(this.gst_plugin_get_package(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_release_date_string(
        @Ptr
        long plugin);

    public Pointer get_release_date_string() {
        return Pointer.pointerToAddress(this.gst_plugin_get_release_date_string(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_source(
        @Ptr
        long plugin);

    public Pointer get_source() {
        return Pointer.pointerToAddress(this.gst_plugin_get_source(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    @Ptr
    protected native long gst_plugin_get_version(
        @Ptr
        long plugin);

    public Pointer get_version() {
        return Pointer.pointerToAddress(this.gst_plugin_get_version(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    protected native boolean gst_plugin_is_loaded(
        @Ptr
        long plugin);

    public boolean is_loaded() {
        return this.gst_plugin_is_loaded(Pointer.pointerTo(this, GstPlugin.class).getPeer());
    }

    @Ptr
    protected native long gst_plugin_load(
        @Ptr
        long plugin);

    public Pointer load() {
        return Pointer.pointerToAddress(this.gst_plugin_load(Pointer.pointerTo(this, GstPlugin.class).getPeer()));
    }

    protected native void gst_plugin_set_cache_data(
        @Ptr
        long plugin,
        @Ptr
        long cache_data);

    public void set_cache_data(Pointer cache_data) {
        this.gst_plugin_set_cache_data(Pointer.pointerTo(this, GstPlugin.class).getPeer(), Pointer.getPeer(cache_data));
    }

    protected static native boolean gst_plugin_register_static(int major_version, int minor_version,
        @Ptr
        long name,
        @Ptr
        long description,
        @Ptr
        long init_func,
        @Ptr
        long version,
        @Ptr
        long license,
        @Ptr
        long source,
        @Ptr
        long _package,
        @Ptr
        long origin);

    public static boolean register_static(int major_version, int minor_version, Pointer name, Pointer description, Pointer init_func, Pointer version, Pointer license, Pointer source, Pointer _package, Pointer origin) {
        return GstPlugin.gst_plugin_register_static(major_version, minor_version, Pointer.getPeer(name), Pointer.getPeer(description), Pointer.getPeer(init_func), Pointer.getPeer(version), Pointer.getPeer(license), Pointer.getPeer(source), Pointer.getPeer(_package), Pointer.getPeer(origin));
    }

    protected native void gst_plugin_add_dependency(
        @Ptr
        long plugin,
        @Ptr
        long env_vars,
        @Ptr
        long paths,
        @Ptr
        long names, IntValuedEnum<GstPluginDependencyFlags> flags);

    public void add_dependency(Pointer env_vars, Pointer paths, Pointer names, IntValuedEnum<GstPluginDependencyFlags> flags) {
        this.gst_plugin_add_dependency(Pointer.pointerTo(this, GstPlugin.class).getPeer(), Pointer.getPeer(env_vars), Pointer.getPeer(paths), Pointer.getPeer(names), flags);
    }

    protected native void gst_plugin_add_dependency_simple(
        @Ptr
        long plugin,
        @Ptr
        long env_vars,
        @Ptr
        long paths,
        @Ptr
        long names, IntValuedEnum<GstPluginDependencyFlags> flags);

    public void add_dependency_simple(Pointer env_vars, Pointer paths, Pointer names, IntValuedEnum<GstPluginDependencyFlags> flags) {
        this.gst_plugin_add_dependency_simple(Pointer.pointerTo(this, GstPlugin.class).getPeer(), Pointer.getPeer(env_vars), Pointer.getPeer(paths), Pointer.getPeer(names), flags);
    }

    protected static native boolean gst_plugin_register_static_full(int major_version, int minor_version,
        @Ptr
        long name,
        @Ptr
        long description,
        @Ptr
        long init_full_func,
        @Ptr
        long version,
        @Ptr
        long license,
        @Ptr
        long source,
        @Ptr
        long _package,
        @Ptr
        long origin,
        @Ptr
        long user_data);

    public static boolean register_static_full(int major_version, int minor_version, Pointer name, Pointer description, Pointer init_full_func, Pointer version, Pointer license, Pointer source, Pointer _package, Pointer origin, Pointer user_data) {
        return GstPlugin.gst_plugin_register_static_full(major_version, minor_version, Pointer.getPeer(name), Pointer.getPeer(description), Pointer.getPeer(init_full_func), Pointer.getPeer(version), Pointer.getPeer(license), Pointer.getPeer(source), Pointer.getPeer(_package), Pointer.getPeer(origin), Pointer.getPeer(user_data));
    }

}
