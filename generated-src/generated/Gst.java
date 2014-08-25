
package generated;

import generated.glib20.glib.GOptionGroup;
import generated.glib20.glib.GSList;
import generated.gobject20.gobject.GObject;
import generated.gobject20.gobject.GParamFlags;
import generated.gobject20.gobject.GParamSpec;
import generated.gobject20.gobject.GValue;
import generated.gstreamer10.gst.GstBin;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstCapsFeatures;
import generated.gstreamer10.gst.GstDebugCategory;
import generated.gstreamer10.gst.GstDebugColorMode;
import generated.gstreamer10.gst.GstDebugGraphDetails;
import generated.gstreamer10.gst.GstDebugLevel;
import generated.gstreamer10.gst.GstDebugMessage;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstEventType;
import generated.gstreamer10.gst.GstEventTypeFlags;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstFormat;
import generated.gstreamer10.gst.GstFormatDefinition;
import generated.gstreamer10.gst.GstIterator;
import generated.gstreamer10.gst.GstMessageType;
import generated.gstreamer10.gst.GstMetaInfo;
import generated.gstreamer10.gst.GstMiniObject;
import generated.gstreamer10.gst.GstPadMode;
import generated.gstreamer10.gst.GstParseContext;
import generated.gstreamer10.gst.GstParseFlags;
import generated.gstreamer10.gst.GstPlugin;
import generated.gstreamer10.gst.GstPoll;
import generated.gstreamer10.gst.GstQueryType;
import generated.gstreamer10.gst.GstQueryTypeFlags;
import generated.gstreamer10.gst.GstSearchMode;
import generated.gstreamer10.gst.GstStructure;
import generated.gstreamer10.gst.GstTagFlag;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamer10.gst.GstTocEntryType;
import generated.gstreamer10.gst.GstURIType;
import generated.gstreamer10.gst.GstValueTable;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class Gst {


    static {
        BridJ.register();
    }

    public static native long gst_buffer_get_max_memory();

    @Ptr
    protected static native long gst_caps_features_from_string(
        @Ptr
        long features);

    public static Pointer<GstCapsFeatures> caps_features_from_string(Pointer features) {
        return Pointer.pointerToAddress(Gst.gst_caps_features_from_string(Pointer.getPeer(features)), GstCapsFeatures.class);
    }

    @Ptr
    protected static native long gst_caps_from_string(
        @Ptr
        long string);

    public static Pointer<GstCaps> caps_from_string(Pointer string) {
        return Pointer.pointerToAddress(Gst.gst_caps_from_string(Pointer.getPeer(string)), GstCaps.class);
    }

    public static native long gst_core_error_quark();

    protected static native void gst_debug_add_log_function(
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public static void debug_add_log_function(Pointer func, Pointer user_data, Pointer notify) {
        Gst.gst_debug_add_log_function(Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected static native void gst_debug_bin_to_dot_file(
        @Ptr
        long bin, IntValuedEnum<GstDebugGraphDetails> details,
        @Ptr
        long file_name);

    public static void debug_bin_to_dot_file(Pointer<GstBin> bin, IntValuedEnum<GstDebugGraphDetails> details, Pointer file_name) {
        Gst.gst_debug_bin_to_dot_file(Pointer.getPeer(bin), details, Pointer.getPeer(file_name));
    }

    protected static native void gst_debug_bin_to_dot_file_with_ts(
        @Ptr
        long bin, IntValuedEnum<GstDebugGraphDetails> details,
        @Ptr
        long file_name);

    public static void debug_bin_to_dot_file_with_ts(Pointer<GstBin> bin, IntValuedEnum<GstDebugGraphDetails> details, Pointer file_name) {
        Gst.gst_debug_bin_to_dot_file_with_ts(Pointer.getPeer(bin), details, Pointer.getPeer(file_name));
    }

    @Ptr
    protected static native long gst_debug_construct_term_color(long colorinfo);

    public static Pointer debug_construct_term_color(long colorinfo) {
        return Pointer.pointerToAddress(Gst.gst_debug_construct_term_color(colorinfo));
    }

    public static native int gst_debug_construct_win_color(long colorinfo);

    @Ptr
    protected static native long gst_debug_get_all_categories();

    public static Pointer<GSList> debug_get_all_categories() {
        return Pointer.pointerToAddress(Gst.gst_debug_get_all_categories(), GSList.class);
    }

    public static native IntValuedEnum<GstDebugColorMode> gst_debug_get_color_mode();

    public static native IntValuedEnum<GstDebugLevel> gst_debug_get_default_threshold();

    public static native boolean gst_debug_is_active();

    public static native boolean gst_debug_is_colored();

    @Ptr
    protected static native long gst_debug_level_get_name(IntValuedEnum<GstDebugLevel> level);

    public static Pointer debug_level_get_name(IntValuedEnum<GstDebugLevel> level) {
        return Pointer.pointerToAddress(Gst.gst_debug_level_get_name(level));
    }

    protected static native void gst_debug_log(
        @Ptr
        long category, IntValuedEnum<GstDebugLevel> level,
        @Ptr
        long file,
        @Ptr
        long function, int line,
        @Ptr
        long object,
        @Ptr
        long format, Object... varargs);

    public static void debug_log(Pointer<GstDebugCategory> category, IntValuedEnum<GstDebugLevel> level, Pointer file, Pointer function, int line, Pointer<GObject> object, Pointer format, Object... varargs) {
        Gst.gst_debug_log(Pointer.getPeer(category), level, Pointer.getPeer(file), Pointer.getPeer(function), line, Pointer.getPeer(object), Pointer.getPeer(format), varargs);
    }

    protected static native void gst_debug_log_default(
        @Ptr
        long category, IntValuedEnum<GstDebugLevel> level,
        @Ptr
        long file,
        @Ptr
        long function, int line,
        @Ptr
        long object,
        @Ptr
        long message,
        @Ptr
        long unused);

    public static void debug_log_default(Pointer<GstDebugCategory> category, IntValuedEnum<GstDebugLevel> level, Pointer file, Pointer function, int line, Pointer<GObject> object, Pointer<GstDebugMessage> message, Pointer unused) {
        Gst.gst_debug_log_default(Pointer.getPeer(category), level, Pointer.getPeer(file), Pointer.getPeer(function), line, Pointer.getPeer(object), Pointer.getPeer(message), Pointer.getPeer(unused));
    }

    public static native void gst_debug_print_stack_trace();

    protected static native long gst_debug_remove_log_function(
        @Ptr
        long func);

    public static long debug_remove_log_function(Pointer func) {
        return Gst.gst_debug_remove_log_function(Pointer.getPeer(func));
    }

    protected static native long gst_debug_remove_log_function_by_data(
        @Ptr
        long data);

    public static long debug_remove_log_function_by_data(Pointer data) {
        return Gst.gst_debug_remove_log_function_by_data(Pointer.getPeer(data));
    }

    public static native void gst_debug_set_active(boolean active);

    public static native void gst_debug_set_color_mode(IntValuedEnum<GstDebugColorMode> mode);

    protected static native void gst_debug_set_color_mode_from_string(
        @Ptr
        long mode);

    public static void debug_set_color_mode_from_string(Pointer mode) {
        Gst.gst_debug_set_color_mode_from_string(Pointer.getPeer(mode));
    }

    public static native void gst_debug_set_colored(boolean colored);

    public static native void gst_debug_set_default_threshold(IntValuedEnum<GstDebugLevel> level);

    protected static native void gst_debug_set_threshold_for_name(
        @Ptr
        long name, IntValuedEnum<GstDebugLevel> level);

    public static void debug_set_threshold_for_name(Pointer name, IntValuedEnum<GstDebugLevel> level) {
        Gst.gst_debug_set_threshold_for_name(Pointer.getPeer(name), level);
    }

    protected static native void gst_debug_set_threshold_from_string(
        @Ptr
        long list, boolean reset);

    public static void debug_set_threshold_from_string(Pointer list, boolean reset) {
        Gst.gst_debug_set_threshold_from_string(Pointer.getPeer(list), reset);
    }

    protected static native void gst_debug_unset_threshold_for_name(
        @Ptr
        long name);

    public static void debug_unset_threshold_for_name(Pointer name) {
        Gst.gst_debug_unset_threshold_for_name(Pointer.getPeer(name));
    }

    public static native void gst_deinit();

    @Ptr
    protected static native long gst_error_get_message(long domain, int code);

    public static Pointer error_get_message(long domain, int code) {
        return Pointer.pointerToAddress(Gst.gst_error_get_message(domain, code));
    }

    public static native IntValuedEnum<GstEventTypeFlags> gst_event_type_get_flags(IntValuedEnum<GstEventType> type);

    @Ptr
    protected static native long gst_event_type_get_name(IntValuedEnum<GstEventType> type);

    public static Pointer event_type_get_name(IntValuedEnum<GstEventType> type) {
        return Pointer.pointerToAddress(Gst.gst_event_type_get_name(type));
    }

    public static native long gst_event_type_to_quark(IntValuedEnum<GstEventType> type);

    @Ptr
    protected static native long gst_filename_to_uri(
        @Ptr
        long filename);

    public static Pointer filename_to_uri(Pointer filename) {
        return Pointer.pointerToAddress(Gst.gst_filename_to_uri(Pointer.getPeer(filename)));
    }

    @Ptr
    protected static native long gst_flow_get_name(IntValuedEnum<GstFlowReturn> ret);

    public static Pointer flow_get_name(IntValuedEnum<GstFlowReturn> ret) {
        return Pointer.pointerToAddress(Gst.gst_flow_get_name(ret));
    }

    public static native long gst_flow_to_quark(IntValuedEnum<GstFlowReturn> ret);

    protected static native IntValuedEnum<GstFormat> gst_format_get_by_nick(
        @Ptr
        long nick);

    public static IntValuedEnum<GstFormat> format_get_by_nick(Pointer nick) {
        return Gst.gst_format_get_by_nick(Pointer.getPeer(nick));
    }

    @Ptr
    protected static native long gst_format_get_details(IntValuedEnum<GstFormat> format);

    public static Pointer<GstFormatDefinition> format_get_details(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(Gst.gst_format_get_details(format), GstFormatDefinition.class);
    }

    @Ptr
    protected static native long gst_format_get_name(IntValuedEnum<GstFormat> format);

    public static Pointer format_get_name(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(Gst.gst_format_get_name(format));
    }

    @Ptr
    protected static native long gst_format_iterate_definitions();

    public static Pointer<GstIterator> format_iterate_definitions() {
        return Pointer.pointerToAddress(Gst.gst_format_iterate_definitions(), GstIterator.class);
    }

    protected static native IntValuedEnum<GstFormat> gst_format_register(
        @Ptr
        long nick,
        @Ptr
        long description);

    public static IntValuedEnum<GstFormat> format_register(Pointer nick, Pointer description) {
        return Gst.gst_format_register(Pointer.getPeer(nick), Pointer.getPeer(description));
    }

    public static native long gst_format_to_quark(IntValuedEnum<GstFormat> format);

    protected static native boolean gst_formats_contains(
        @Ptr
        long formats, IntValuedEnum<GstFormat> format);

    public static boolean formats_contains(Pointer<IntValuedEnum<GstFormat>> formats, IntValuedEnum<GstFormat> format) {
        return Gst.gst_formats_contains(Pointer.getPeer(formats), format);
    }

    protected static native void gst_init(
        @Ptr
        long argc,
        @Ptr
        long argv);

    public static void init(Pointer<Integer> argc, Pointer argv) {
        Gst.gst_init(Pointer.getPeer(argc), Pointer.getPeer(argv));
    }

    protected static native boolean gst_init_check(
        @Ptr
        long argc,
        @Ptr
        long argv);

    public static boolean init_check(Pointer<Integer> argc, Pointer argv) {
        return Gst.gst_init_check(Pointer.getPeer(argc), Pointer.getPeer(argv));
    }

    @Ptr
    protected static native long gst_init_get_option_group();

    public static Pointer<GOptionGroup> init_get_option_group() {
        return Pointer.pointerToAddress(Gst.gst_init_get_option_group(), GOptionGroup.class);
    }

    protected static native boolean gst_is_caps_features(
        @Ptr
        long obj);

    public static boolean is_caps_features(Pointer obj) {
        return Gst.gst_is_caps_features(Pointer.getPeer(obj));
    }

    public static native boolean gst_is_initialized();

    public static native long gst_library_error_quark();

    @Ptr
    protected static native long gst_message_type_get_name(IntValuedEnum<GstMessageType> type);

    public static Pointer message_type_get_name(IntValuedEnum<GstMessageType> type) {
        return Pointer.pointerToAddress(Gst.gst_message_type_get_name(type));
    }

    public static native long gst_message_type_to_quark(IntValuedEnum<GstMessageType> type);

    @Ptr
    protected static native long gst_meta_api_type_get_tags(long api);

    public static Pointer meta_api_type_get_tags(long api) {
        return Pointer.pointerToAddress(Gst.gst_meta_api_type_get_tags(api));
    }

    public static native boolean gst_meta_api_type_has_tag(long api, long tag);

    protected static native long gst_meta_api_type_register(
        @Ptr
        long api,
        @Ptr
        long tags);

    public static long meta_api_type_register(Pointer api, Pointer tags) {
        return Gst.gst_meta_api_type_register(Pointer.getPeer(api), Pointer.getPeer(tags));
    }

    @Ptr
    protected static native long gst_meta_get_info(
        @Ptr
        long impl);

    public static Pointer<GstMetaInfo> meta_get_info(Pointer impl) {
        return Pointer.pointerToAddress(Gst.gst_meta_get_info(Pointer.getPeer(impl)), GstMetaInfo.class);
    }

    @Ptr
    protected static native long gst_meta_register(long api,
        @Ptr
        long impl, long size,
        @Ptr
        long init_func,
        @Ptr
        long free_func,
        @Ptr
        long transform_func);

    public static Pointer<GstMetaInfo> meta_register(long api, Pointer impl, long size, Pointer init_func, Pointer free_func, Pointer transform_func) {
        return Pointer.pointerToAddress(Gst.gst_meta_register(api, Pointer.getPeer(impl), size, Pointer.getPeer(init_func), Pointer.getPeer(free_func), Pointer.getPeer(transform_func)), GstMetaInfo.class);
    }

    protected static native boolean gst_mini_object_replace(
        @Ptr
        long olddata,
        @Ptr
        long newdata);

    public static boolean mini_object_replace(Pointer<Pointer<GstMiniObject>> olddata, Pointer<GstMiniObject> newdata) {
        return Gst.gst_mini_object_replace(Pointer.getPeer(olddata), Pointer.getPeer(newdata));
    }

    protected static native boolean gst_mini_object_take(
        @Ptr
        long olddata,
        @Ptr
        long newdata);

    public static boolean mini_object_take(Pointer<Pointer<GstMiniObject>> olddata, Pointer<GstMiniObject> newdata) {
        return Gst.gst_mini_object_take(Pointer.getPeer(olddata), Pointer.getPeer(newdata));
    }

    @Ptr
    protected static native long gst_pad_mode_get_name(IntValuedEnum<GstPadMode> mode);

    public static Pointer pad_mode_get_name(IntValuedEnum<GstPadMode> mode) {
        return Pointer.pointerToAddress(Gst.gst_pad_mode_get_name(mode));
    }

    @Ptr
    protected static native long gst_param_spec_fraction(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, int min_num, int min_denom, int max_num, int max_denom, int default_num, int default_denom, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_fraction(Pointer name, Pointer nick, Pointer blurb, int min_num, int min_denom, int max_num, int max_denom, int default_num, int default_denom, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(Gst.gst_param_spec_fraction(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), min_num, min_denom, max_num, max_denom, default_num, default_denom, flags), GParamSpec.class);
    }

    @Ptr
    protected static native long gst_parse_bin_from_description(
        @Ptr
        long bin_description, boolean ghost_unlinked_pads);

    public static Pointer<GstBin> parse_bin_from_description(Pointer bin_description, boolean ghost_unlinked_pads) {
        return Pointer.pointerToAddress(Gst.gst_parse_bin_from_description(Pointer.getPeer(bin_description), ghost_unlinked_pads), GstBin.class);
    }

    @Ptr
    protected static native long gst_parse_bin_from_description_full(
        @Ptr
        long bin_description, boolean ghost_unlinked_pads,
        @Ptr
        long context, IntValuedEnum<GstParseFlags> flags);

    public static Pointer<GstElement> parse_bin_from_description_full(Pointer bin_description, boolean ghost_unlinked_pads, Pointer<GstParseContext> context, IntValuedEnum<GstParseFlags> flags) {
        return Pointer.pointerToAddress(Gst.gst_parse_bin_from_description_full(Pointer.getPeer(bin_description), ghost_unlinked_pads, Pointer.getPeer(context), flags), GstElement.class);
    }

    public static native long gst_parse_error_quark();

    @Ptr
    protected static native long gst_parse_launch(
        @Ptr
        long pipeline_description);

    public static Pointer<GstElement> parse_launch(Pointer pipeline_description) {
        return Pointer.pointerToAddress(Gst.gst_parse_launch(Pointer.getPeer(pipeline_description)), GstElement.class);
    }

    @Ptr
    protected static native long gst_parse_launch_full(
        @Ptr
        long pipeline_description,
        @Ptr
        long context, IntValuedEnum<GstParseFlags> flags);

    public static Pointer<GstElement> parse_launch_full(Pointer pipeline_description, Pointer<GstParseContext> context, IntValuedEnum<GstParseFlags> flags) {
        return Pointer.pointerToAddress(Gst.gst_parse_launch_full(Pointer.getPeer(pipeline_description), Pointer.getPeer(context), flags), GstElement.class);
    }

    @Ptr
    protected static native long gst_parse_launchv(
        @Ptr
        long argv);

    public static Pointer<GstElement> parse_launchv(Pointer argv) {
        return Pointer.pointerToAddress(Gst.gst_parse_launchv(Pointer.getPeer(argv)), GstElement.class);
    }

    @Ptr
    protected static native long gst_parse_launchv_full(
        @Ptr
        long argv,
        @Ptr
        long context, IntValuedEnum<GstParseFlags> flags);

    public static Pointer<GstElement> parse_launchv_full(Pointer argv, Pointer<GstParseContext> context, IntValuedEnum<GstParseFlags> flags) {
        return Pointer.pointerToAddress(Gst.gst_parse_launchv_full(Pointer.getPeer(argv), Pointer.getPeer(context), flags), GstElement.class);
    }

    public static native long gst_plugin_error_quark();

    @Ptr
    protected static native long gst_poll_new(boolean controllable);

    public static Pointer<GstPoll> poll_new(boolean controllable) {
        return Pointer.pointerToAddress(Gst.gst_poll_new(controllable), GstPoll.class);
    }

    @Ptr
    protected static native long gst_poll_new_timer();

    public static Pointer<GstPoll> poll_new_timer() {
        return Pointer.pointerToAddress(Gst.gst_poll_new_timer(), GstPoll.class);
    }

    @Ptr
    protected static native long gst_preset_get_app_dir();

    public static Pointer preset_get_app_dir() {
        return Pointer.pointerToAddress(Gst.gst_preset_get_app_dir());
    }

    protected static native boolean gst_preset_set_app_dir(
        @Ptr
        long app_dir);

    public static boolean preset_set_app_dir(Pointer app_dir) {
        return Gst.gst_preset_set_app_dir(Pointer.getPeer(app_dir));
    }

    public static native IntValuedEnum<GstQueryTypeFlags> gst_query_type_get_flags(IntValuedEnum<GstQueryType> type);

    @Ptr
    protected static native long gst_query_type_get_name(IntValuedEnum<GstQueryType> type);

    public static Pointer query_type_get_name(IntValuedEnum<GstQueryType> type) {
        return Pointer.pointerToAddress(Gst.gst_query_type_get_name(type));
    }

    public static native long gst_query_type_to_quark(IntValuedEnum<GstQueryType> type);

    public static native long gst_resource_error_quark();

    public static native boolean gst_segtrap_is_enabled();

    public static native void gst_segtrap_set_enabled(boolean enabled);

    public static native long gst_static_caps_get_type();

    public static native long gst_static_pad_template_get_type();

    public static native long gst_stream_error_quark();

    @Ptr
    protected static native long gst_structure_from_string(
        @Ptr
        long string,
        @Ptr
        long end);

    public static Pointer<GstStructure> structure_from_string(Pointer string, Pointer end) {
        return Pointer.pointerToAddress(Gst.gst_structure_from_string(Pointer.getPeer(string), Pointer.getPeer(end)), GstStructure.class);
    }

    protected static native boolean gst_tag_exists(
        @Ptr
        long tag);

    public static boolean tag_exists(Pointer tag) {
        return Gst.gst_tag_exists(Pointer.getPeer(tag));
    }

    @Ptr
    protected static native long gst_tag_get_description(
        @Ptr
        long tag);

    public static Pointer tag_get_description(Pointer tag) {
        return Pointer.pointerToAddress(Gst.gst_tag_get_description(Pointer.getPeer(tag)));
    }

    protected static native IntValuedEnum<GstTagFlag> gst_tag_get_flag(
        @Ptr
        long tag);

    public static IntValuedEnum<GstTagFlag> tag_get_flag(Pointer tag) {
        return Gst.gst_tag_get_flag(Pointer.getPeer(tag));
    }

    @Ptr
    protected static native long gst_tag_get_nick(
        @Ptr
        long tag);

    public static Pointer tag_get_nick(Pointer tag) {
        return Pointer.pointerToAddress(Gst.gst_tag_get_nick(Pointer.getPeer(tag)));
    }

    protected static native long gst_tag_get_type(
        @Ptr
        long tag);

    public static long tag_get_type(Pointer tag) {
        return Gst.gst_tag_get_type(Pointer.getPeer(tag));
    }

    protected static native boolean gst_tag_is_fixed(
        @Ptr
        long tag);

    public static boolean tag_is_fixed(Pointer tag) {
        return Gst.gst_tag_is_fixed(Pointer.getPeer(tag));
    }

    protected static native boolean gst_tag_list_copy_value(
        @Ptr
        long dest,
        @Ptr
        long list,
        @Ptr
        long tag);

    public static boolean tag_list_copy_value(Pointer<GValue> dest, Pointer<GstTagList> list, Pointer tag) {
        return Gst.gst_tag_list_copy_value(Pointer.getPeer(dest), Pointer.getPeer(list), Pointer.getPeer(tag));
    }

    protected static native void gst_tag_merge_strings_with_comma(
        @Ptr
        long dest,
        @Ptr
        long src);

    public static void tag_merge_strings_with_comma(Pointer<GValue> dest, Pointer<GValue> src) {
        Gst.gst_tag_merge_strings_with_comma(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native void gst_tag_merge_use_first(
        @Ptr
        long dest,
        @Ptr
        long src);

    public static void tag_merge_use_first(Pointer<GValue> dest, Pointer<GValue> src) {
        Gst.gst_tag_merge_use_first(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native void gst_tag_register(
        @Ptr
        long name, IntValuedEnum<GstTagFlag> flag, long type,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long func);

    public static void tag_register(Pointer name, IntValuedEnum<GstTagFlag> flag, long type, Pointer nick, Pointer blurb, Pointer func) {
        Gst.gst_tag_register(Pointer.getPeer(name), flag, type, Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(func));
    }

    protected static native void gst_tag_register_static(
        @Ptr
        long name, IntValuedEnum<GstTagFlag> flag, long type,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long func);

    public static void tag_register_static(Pointer name, IntValuedEnum<GstTagFlag> flag, long type, Pointer nick, Pointer blurb, Pointer func) {
        Gst.gst_tag_register_static(Pointer.getPeer(name), flag, type, Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(func));
    }

    @Ptr
    protected static native long gst_toc_entry_type_get_nick(IntValuedEnum<GstTocEntryType> type);

    public static Pointer toc_entry_type_get_nick(IntValuedEnum<GstTocEntryType> type) {
        return Pointer.pointerToAddress(Gst.gst_toc_entry_type_get_nick(type));
    }

    public static native long gst_type_find_get_type();

    protected static native boolean gst_type_find_register(
        @Ptr
        long plugin,
        @Ptr
        long name, long rank,
        @Ptr
        long func,
        @Ptr
        long extensions,
        @Ptr
        long possible_caps,
        @Ptr
        long data,
        @Ptr
        long data_notify);

    public static boolean type_find_register(Pointer<GstPlugin> plugin, Pointer name, long rank, Pointer func, Pointer extensions, Pointer<GstCaps> possible_caps, Pointer data, Pointer data_notify) {
        return Gst.gst_type_find_register(Pointer.getPeer(plugin), Pointer.getPeer(name), rank, Pointer.getPeer(func), Pointer.getPeer(extensions), Pointer.getPeer(possible_caps), Pointer.getPeer(data), Pointer.getPeer(data_notify));
    }

    public static native boolean gst_update_registry();

    @Ptr
    protected static native long gst_uri_construct(
        @Ptr
        long protocol,
        @Ptr
        long location);

    public static Pointer uri_construct(Pointer protocol, Pointer location) {
        return Pointer.pointerToAddress(Gst.gst_uri_construct(Pointer.getPeer(protocol), Pointer.getPeer(location)));
    }

    public static native long gst_uri_error_quark();

    @Ptr
    protected static native long gst_uri_get_location(
        @Ptr
        long uri);

    public static Pointer uri_get_location(Pointer uri) {
        return Pointer.pointerToAddress(Gst.gst_uri_get_location(Pointer.getPeer(uri)));
    }

    @Ptr
    protected static native long gst_uri_get_protocol(
        @Ptr
        long uri);

    public static Pointer uri_get_protocol(Pointer uri) {
        return Pointer.pointerToAddress(Gst.gst_uri_get_protocol(Pointer.getPeer(uri)));
    }

    protected static native boolean gst_uri_has_protocol(
        @Ptr
        long uri,
        @Ptr
        long protocol);

    public static boolean uri_has_protocol(Pointer uri, Pointer protocol) {
        return Gst.gst_uri_has_protocol(Pointer.getPeer(uri), Pointer.getPeer(protocol));
    }

    protected static native boolean gst_uri_is_valid(
        @Ptr
        long uri);

    public static boolean uri_is_valid(Pointer uri) {
        return Gst.gst_uri_is_valid(Pointer.getPeer(uri));
    }

    protected static native boolean gst_uri_protocol_is_supported(IntValuedEnum<GstURIType> type,
        @Ptr
        long protocol);

    public static boolean uri_protocol_is_supported(IntValuedEnum<GstURIType> type, Pointer protocol) {
        return Gst.gst_uri_protocol_is_supported(type, Pointer.getPeer(protocol));
    }

    protected static native boolean gst_uri_protocol_is_valid(
        @Ptr
        long protocol);

    public static boolean uri_protocol_is_valid(Pointer protocol) {
        return Gst.gst_uri_protocol_is_valid(Pointer.getPeer(protocol));
    }

    @Ptr
    protected static native long gst_util_array_binary_search(
        @Ptr
        long array, long num_elements, long element_size,
        @Ptr
        long search_func, IntValuedEnum<GstSearchMode> mode,
        @Ptr
        long search_data,
        @Ptr
        long user_data);

    public static Pointer util_array_binary_search(Pointer array, long num_elements, long element_size, Pointer search_func, IntValuedEnum<GstSearchMode> mode, Pointer search_data, Pointer user_data) {
        return Pointer.pointerToAddress(Gst.gst_util_array_binary_search(Pointer.getPeer(array), num_elements, element_size, Pointer.getPeer(search_func), mode, Pointer.getPeer(search_data), Pointer.getPeer(user_data)));
    }

    protected static native void gst_util_double_to_fraction(double src,
        @Ptr
        long dest_n,
        @Ptr
        long dest_d);

    public static void util_double_to_fraction(double src, Pointer<Integer> dest_n, Pointer<Integer> dest_d) {
        Gst.gst_util_double_to_fraction(src, Pointer.getPeer(dest_n), Pointer.getPeer(dest_d));
    }

    protected static native void gst_util_dump_mem(
        @Ptr
        long mem, long size);

    public static void util_dump_mem(Pointer<Short> mem, long size) {
        Gst.gst_util_dump_mem(Pointer.getPeer(mem), size);
    }

    protected static native boolean gst_util_fraction_add(int a_n, int a_d, int b_n, int b_d,
        @Ptr
        long res_n,
        @Ptr
        long res_d);

    public static boolean util_fraction_add(int a_n, int a_d, int b_n, int b_d, Pointer<Integer> res_n, Pointer<Integer> res_d) {
        return Gst.gst_util_fraction_add(a_n, a_d, b_n, b_d, Pointer.getPeer(res_n), Pointer.getPeer(res_d));
    }

    public static native int gst_util_fraction_compare(int a_n, int a_d, int b_n, int b_d);

    protected static native boolean gst_util_fraction_multiply(int a_n, int a_d, int b_n, int b_d,
        @Ptr
        long res_n,
        @Ptr
        long res_d);

    public static boolean util_fraction_multiply(int a_n, int a_d, int b_n, int b_d, Pointer<Integer> res_n, Pointer<Integer> res_d) {
        return Gst.gst_util_fraction_multiply(a_n, a_d, b_n, b_d, Pointer.getPeer(res_n), Pointer.getPeer(res_d));
    }

    protected static native void gst_util_fraction_to_double(int src_n, int src_d,
        @Ptr
        long dest);

    public static void util_fraction_to_double(int src_n, int src_d, Pointer<Double> dest) {
        Gst.gst_util_fraction_to_double(src_n, src_d, Pointer.getPeer(dest));
    }

    public static native long gst_util_gdouble_to_guint64(double value);

    public static native long gst_util_get_timestamp();

    public static native int gst_util_greatest_common_divisor(int a, int b);

    public static native long gst_util_greatest_common_divisor_int64(long a, long b);

    public static native long gst_util_group_id_next();

    public static native double gst_util_guint64_to_gdouble(long value);

    public static native int gst_util_seqnum_compare(long s1, long s2);

    public static native long gst_util_seqnum_next();

    protected static native void gst_util_set_object_arg(
        @Ptr
        long object,
        @Ptr
        long name,
        @Ptr
        long value);

    public static void util_set_object_arg(Pointer<GObject> object, Pointer name, Pointer value) {
        Gst.gst_util_set_object_arg(Pointer.getPeer(object), Pointer.getPeer(name), Pointer.getPeer(value));
    }

    protected static native void gst_util_set_value_from_string(
        @Ptr
        long value,
        @Ptr
        long value_str);

    public static void util_set_value_from_string(Pointer<GValue> value, Pointer value_str) {
        Gst.gst_util_set_value_from_string(Pointer.getPeer(value), Pointer.getPeer(value_str));
    }

    public static native long gst_util_uint64_scale(long val, long num, long denom);

    public static native long gst_util_uint64_scale_ceil(long val, long num, long denom);

    public static native long gst_util_uint64_scale_int(long val, int num, int denom);

    public static native long gst_util_uint64_scale_int_ceil(long val, int num, int denom);

    public static native long gst_util_uint64_scale_int_round(long val, int num, int denom);

    public static native long gst_util_uint64_scale_round(long val, long num, long denom);

    protected static native boolean gst_value_can_compare(
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static boolean value_can_compare(Pointer<GValue> value1, Pointer<GValue> value2) {
        return Gst.gst_value_can_compare(Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native boolean gst_value_can_intersect(
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static boolean value_can_intersect(Pointer<GValue> value1, Pointer<GValue> value2) {
        return Gst.gst_value_can_intersect(Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native boolean gst_value_can_subtract(
        @Ptr
        long minuend,
        @Ptr
        long subtrahend);

    public static boolean value_can_subtract(Pointer<GValue> minuend, Pointer<GValue> subtrahend) {
        return Gst.gst_value_can_subtract(Pointer.getPeer(minuend), Pointer.getPeer(subtrahend));
    }

    protected static native boolean gst_value_can_union(
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static boolean value_can_union(Pointer<GValue> value1, Pointer<GValue> value2) {
        return Gst.gst_value_can_union(Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native int gst_value_compare(
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static int value_compare(Pointer<GValue> value1, Pointer<GValue> value2) {
        return Gst.gst_value_compare(Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native boolean gst_value_deserialize(
        @Ptr
        long dest,
        @Ptr
        long src);

    public static boolean value_deserialize(Pointer<GValue> dest, Pointer src) {
        return Gst.gst_value_deserialize(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native boolean gst_value_fixate(
        @Ptr
        long dest,
        @Ptr
        long src);

    public static boolean value_fixate(Pointer<GValue> dest, Pointer<GValue> src) {
        return Gst.gst_value_fixate(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native boolean gst_value_fraction_multiply(
        @Ptr
        long product,
        @Ptr
        long factor1,
        @Ptr
        long factor2);

    public static boolean value_fraction_multiply(Pointer<GValue> product, Pointer<GValue> factor1, Pointer<GValue> factor2) {
        return Gst.gst_value_fraction_multiply(Pointer.getPeer(product), Pointer.getPeer(factor1), Pointer.getPeer(factor2));
    }

    protected static native boolean gst_value_fraction_subtract(
        @Ptr
        long dest,
        @Ptr
        long minuend,
        @Ptr
        long subtrahend);

    public static boolean value_fraction_subtract(Pointer<GValue> dest, Pointer<GValue> minuend, Pointer<GValue> subtrahend) {
        return Gst.gst_value_fraction_subtract(Pointer.getPeer(dest), Pointer.getPeer(minuend), Pointer.getPeer(subtrahend));
    }

    protected static native long gst_value_get_bitmask(
        @Ptr
        long value);

    public static long value_get_bitmask(Pointer<GValue> value) {
        return Gst.gst_value_get_bitmask(Pointer.getPeer(value));
    }

    @Ptr
    protected static native long gst_value_get_caps(
        @Ptr
        long value);

    public static Pointer<GstCaps> value_get_caps(Pointer<GValue> value) {
        return Pointer.pointerToAddress(Gst.gst_value_get_caps(Pointer.getPeer(value)), GstCaps.class);
    }

    @Ptr
    protected static native long gst_value_get_caps_features(
        @Ptr
        long value);

    public static Pointer<GstCapsFeatures> value_get_caps_features(Pointer<GValue> value) {
        return Pointer.pointerToAddress(Gst.gst_value_get_caps_features(Pointer.getPeer(value)), GstCapsFeatures.class);
    }

    protected static native double gst_value_get_double_range_max(
        @Ptr
        long value);

    public static double value_get_double_range_max(Pointer<GValue> value) {
        return Gst.gst_value_get_double_range_max(Pointer.getPeer(value));
    }

    protected static native double gst_value_get_double_range_min(
        @Ptr
        long value);

    public static double value_get_double_range_min(Pointer<GValue> value) {
        return Gst.gst_value_get_double_range_min(Pointer.getPeer(value));
    }

    protected static native int gst_value_get_fraction_denominator(
        @Ptr
        long value);

    public static int value_get_fraction_denominator(Pointer<GValue> value) {
        return Gst.gst_value_get_fraction_denominator(Pointer.getPeer(value));
    }

    protected static native int gst_value_get_fraction_numerator(
        @Ptr
        long value);

    public static int value_get_fraction_numerator(Pointer<GValue> value) {
        return Gst.gst_value_get_fraction_numerator(Pointer.getPeer(value));
    }

    @Ptr
    protected static native long gst_value_get_fraction_range_max(
        @Ptr
        long value);

    public static Pointer<GValue> value_get_fraction_range_max(Pointer<GValue> value) {
        return Pointer.pointerToAddress(Gst.gst_value_get_fraction_range_max(Pointer.getPeer(value)), GValue.class);
    }

    @Ptr
    protected static native long gst_value_get_fraction_range_min(
        @Ptr
        long value);

    public static Pointer<GValue> value_get_fraction_range_min(Pointer<GValue> value) {
        return Pointer.pointerToAddress(Gst.gst_value_get_fraction_range_min(Pointer.getPeer(value)), GValue.class);
    }

    protected static native long gst_value_get_int64_range_max(
        @Ptr
        long value);

    public static long value_get_int64_range_max(Pointer<GValue> value) {
        return Gst.gst_value_get_int64_range_max(Pointer.getPeer(value));
    }

    protected static native long gst_value_get_int64_range_min(
        @Ptr
        long value);

    public static long value_get_int64_range_min(Pointer<GValue> value) {
        return Gst.gst_value_get_int64_range_min(Pointer.getPeer(value));
    }

    protected static native long gst_value_get_int64_range_step(
        @Ptr
        long value);

    public static long value_get_int64_range_step(Pointer<GValue> value) {
        return Gst.gst_value_get_int64_range_step(Pointer.getPeer(value));
    }

    protected static native int gst_value_get_int_range_max(
        @Ptr
        long value);

    public static int value_get_int_range_max(Pointer<GValue> value) {
        return Gst.gst_value_get_int_range_max(Pointer.getPeer(value));
    }

    protected static native int gst_value_get_int_range_min(
        @Ptr
        long value);

    public static int value_get_int_range_min(Pointer<GValue> value) {
        return Gst.gst_value_get_int_range_min(Pointer.getPeer(value));
    }

    protected static native int gst_value_get_int_range_step(
        @Ptr
        long value);

    public static int value_get_int_range_step(Pointer<GValue> value) {
        return Gst.gst_value_get_int_range_step(Pointer.getPeer(value));
    }

    @Ptr
    protected static native long gst_value_get_structure(
        @Ptr
        long value);

    public static Pointer<GstStructure> value_get_structure(Pointer<GValue> value) {
        return Pointer.pointerToAddress(Gst.gst_value_get_structure(Pointer.getPeer(value)), GstStructure.class);
    }

    protected static native void gst_value_init_and_copy(
        @Ptr
        long dest,
        @Ptr
        long src);

    public static void value_init_and_copy(Pointer<GValue> dest, Pointer<GValue> src) {
        Gst.gst_value_init_and_copy(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native boolean gst_value_intersect(
        @Ptr
        long dest,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static boolean value_intersect(Pointer<GValue> dest, Pointer<GValue> value1, Pointer<GValue> value2) {
        return Gst.gst_value_intersect(Pointer.getPeer(dest), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native boolean gst_value_is_fixed(
        @Ptr
        long value);

    public static boolean value_is_fixed(Pointer<GValue> value) {
        return Gst.gst_value_is_fixed(Pointer.getPeer(value));
    }

    protected static native boolean gst_value_is_subset(
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static boolean value_is_subset(Pointer<GValue> value1, Pointer<GValue> value2) {
        return Gst.gst_value_is_subset(Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native void gst_value_register(
        @Ptr
        long table);

    public static void value_register(Pointer<GstValueTable> table) {
        Gst.gst_value_register(Pointer.getPeer(table));
    }

    @Ptr
    protected static native long gst_value_serialize(
        @Ptr
        long value);

    public static Pointer value_serialize(Pointer<GValue> value) {
        return Pointer.pointerToAddress(Gst.gst_value_serialize(Pointer.getPeer(value)));
    }

    protected static native void gst_value_set_bitmask(
        @Ptr
        long value, long bitmask);

    public static void value_set_bitmask(Pointer<GValue> value, long bitmask) {
        Gst.gst_value_set_bitmask(Pointer.getPeer(value), bitmask);
    }

    protected static native void gst_value_set_caps(
        @Ptr
        long value,
        @Ptr
        long caps);

    public static void value_set_caps(Pointer<GValue> value, Pointer<GstCaps> caps) {
        Gst.gst_value_set_caps(Pointer.getPeer(value), Pointer.getPeer(caps));
    }

    protected static native void gst_value_set_caps_features(
        @Ptr
        long value,
        @Ptr
        long features);

    public static void value_set_caps_features(Pointer<GValue> value, Pointer<GstCapsFeatures> features) {
        Gst.gst_value_set_caps_features(Pointer.getPeer(value), Pointer.getPeer(features));
    }

    protected static native void gst_value_set_double_range(
        @Ptr
        long value, double start, double end);

    public static void value_set_double_range(Pointer<GValue> value, double start, double end) {
        Gst.gst_value_set_double_range(Pointer.getPeer(value), start, end);
    }

    protected static native void gst_value_set_fraction(
        @Ptr
        long value, int numerator, int denominator);

    public static void value_set_fraction(Pointer<GValue> value, int numerator, int denominator) {
        Gst.gst_value_set_fraction(Pointer.getPeer(value), numerator, denominator);
    }

    protected static native void gst_value_set_fraction_range(
        @Ptr
        long value,
        @Ptr
        long start,
        @Ptr
        long end);

    public static void value_set_fraction_range(Pointer<GValue> value, Pointer<GValue> start, Pointer<GValue> end) {
        Gst.gst_value_set_fraction_range(Pointer.getPeer(value), Pointer.getPeer(start), Pointer.getPeer(end));
    }

    protected static native void gst_value_set_fraction_range_full(
        @Ptr
        long value, int numerator_start, int denominator_start, int numerator_end, int denominator_end);

    public static void value_set_fraction_range_full(Pointer<GValue> value, int numerator_start, int denominator_start, int numerator_end, int denominator_end) {
        Gst.gst_value_set_fraction_range_full(Pointer.getPeer(value), numerator_start, denominator_start, numerator_end, denominator_end);
    }

    protected static native void gst_value_set_int64_range(
        @Ptr
        long value, long start, long end);

    public static void value_set_int64_range(Pointer<GValue> value, long start, long end) {
        Gst.gst_value_set_int64_range(Pointer.getPeer(value), start, end);
    }

    protected static native void gst_value_set_int64_range_step(
        @Ptr
        long value, long start, long end, long step);

    public static void value_set_int64_range_step(Pointer<GValue> value, long start, long end, long step) {
        Gst.gst_value_set_int64_range_step(Pointer.getPeer(value), start, end, step);
    }

    protected static native void gst_value_set_int_range(
        @Ptr
        long value, int start, int end);

    public static void value_set_int_range(Pointer<GValue> value, int start, int end) {
        Gst.gst_value_set_int_range(Pointer.getPeer(value), start, end);
    }

    protected static native void gst_value_set_int_range_step(
        @Ptr
        long value, int start, int end, int step);

    public static void value_set_int_range_step(Pointer<GValue> value, int start, int end, int step) {
        Gst.gst_value_set_int_range_step(Pointer.getPeer(value), start, end, step);
    }

    protected static native void gst_value_set_structure(
        @Ptr
        long value,
        @Ptr
        long structure);

    public static void value_set_structure(Pointer<GValue> value, Pointer<GstStructure> structure) {
        Gst.gst_value_set_structure(Pointer.getPeer(value), Pointer.getPeer(structure));
    }

    protected static native boolean gst_value_subtract(
        @Ptr
        long dest,
        @Ptr
        long minuend,
        @Ptr
        long subtrahend);

    public static boolean value_subtract(Pointer<GValue> dest, Pointer<GValue> minuend, Pointer<GValue> subtrahend) {
        return Gst.gst_value_subtract(Pointer.getPeer(dest), Pointer.getPeer(minuend), Pointer.getPeer(subtrahend));
    }

    protected static native boolean gst_value_union(
        @Ptr
        long dest,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static boolean value_union(Pointer<GValue> dest, Pointer<GValue> value1, Pointer<GValue> value2) {
        return Gst.gst_value_union(Pointer.getPeer(dest), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native void gst_version(
        @Ptr
        long major,
        @Ptr
        long minor,
        @Ptr
        long micro,
        @Ptr
        long nano);

    public static void version(Pointer<Long> major, Pointer<Long> minor, Pointer<Long> micro, Pointer<Long> nano) {
        Gst.gst_version(Pointer.getPeer(major), Pointer.getPeer(minor), Pointer.getPeer(micro), Pointer.getPeer(nano));
    }

    @Ptr
    protected static native long gst_version_string();

    public static Pointer version_string() {
        return Pointer.pointerToAddress(Gst.gst_version_string());
    }

}
