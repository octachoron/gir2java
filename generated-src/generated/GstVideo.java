
package generated;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstEvent;
import generated.gstreamer10.gst.GstMessage;
import generated.gstreamer10.gst.GstMetaInfo;
import generated.gstreamer10.gst.GstObject;
import generated.gstreamer10.gst.GstQuery;
import generated.gstreamer10.gst.GstSample;
import generated.gstreamer10.gst.GstStructure;
import generated.gstreamervideo10.gstvideo.GstNavigationCommand;
import generated.gstreamervideo10.gstvideo.GstNavigationEventType;
import generated.gstreamervideo10.gstvideo.GstNavigationMessageType;
import generated.gstreamervideo10.gstvideo.GstNavigationQueryType;
import generated.gstreamervideo10.gstvideo.GstVideoAlignment;
import generated.gstreamervideo10.gstvideo.GstVideoChromaResample;
import generated.gstreamervideo10.gstvideo.GstVideoChromaSite;
import generated.gstreamervideo10.gstvideo.GstVideoColorRange;
import generated.gstreamervideo10.gstvideo.GstVideoFormat;
import generated.gstreamervideo10.gstvideo.GstVideoFormatInfo;
import generated.gstreamervideo10.gstvideo.GstVideoFrame;
import generated.gstreamervideo10.gstvideo.GstVideoFrameFlags;
import generated.gstreamervideo10.gstvideo.GstVideoGLTextureOrientation;
import generated.gstreamervideo10.gstvideo.GstVideoGLTextureType;
import generated.gstreamervideo10.gstvideo.GstVideoGLTextureUploadMeta;
import generated.gstreamervideo10.gstvideo.GstVideoInfo;
import generated.gstreamervideo10.gstvideo.GstVideoMeta;
import generated.gstreamervideo10.gstvideo.GstVideoOverlayComposition;
import generated.gstreamervideo10.gstvideo.GstVideoOverlayCompositionMeta;
import generated.gstreamervideo10.gstvideo.GstVideoRegionOfInterestMeta;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstvideo-1.0")
public class GstVideo {


    static {
        BridJ.register();
    }

    @Ptr
    protected static native long gst_buffer_add_video_gl_texture_upload_meta(
        @Ptr
        long buffer, IntValuedEnum<GstVideoGLTextureOrientation> texture_orientation, long n_textures, IntValuedEnum<GstVideoGLTextureType> texture_type,
        @Ptr
        long upload,
        @Ptr
        long user_data,
        @Ptr
        long user_data_copy,
        @Ptr
        long user_data_free);

    public static Pointer<GstVideoGLTextureUploadMeta> buffer_add_video_gl_texture_upload_meta(Pointer<GstBuffer> buffer, IntValuedEnum<GstVideoGLTextureOrientation> texture_orientation, long n_textures, IntValuedEnum<GstVideoGLTextureType> texture_type, Pointer upload, Pointer user_data, Pointer user_data_copy, Pointer user_data_free) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_add_video_gl_texture_upload_meta(Pointer.getPeer(buffer), texture_orientation, n_textures, texture_type, Pointer.getPeer(upload), Pointer.getPeer(user_data), Pointer.getPeer(user_data_copy), Pointer.getPeer(user_data_free)), GstVideoGLTextureUploadMeta.class);
    }

    @Ptr
    protected static native long gst_buffer_add_video_meta(
        @Ptr
        long buffer, IntValuedEnum<GstVideoFrameFlags> flags, IntValuedEnum<GstVideoFormat> format, long width, long height);

    public static Pointer<GstVideoMeta> buffer_add_video_meta(Pointer<GstBuffer> buffer, IntValuedEnum<GstVideoFrameFlags> flags, IntValuedEnum<GstVideoFormat> format, long width, long height) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_add_video_meta(Pointer.getPeer(buffer), flags, format, width, height), GstVideoMeta.class);
    }

    @Ptr
    protected static native long gst_buffer_add_video_meta_full(
        @Ptr
        long buffer, IntValuedEnum<GstVideoFrameFlags> flags, IntValuedEnum<GstVideoFormat> format, long width, long height, long n_planes, long offset, int stride);

    public static Pointer<GstVideoMeta> buffer_add_video_meta_full(Pointer<GstBuffer> buffer, IntValuedEnum<GstVideoFrameFlags> flags, IntValuedEnum<GstVideoFormat> format, long width, long height, long n_planes, long offset, int stride) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_add_video_meta_full(Pointer.getPeer(buffer), flags, format, width, height, n_planes, offset, stride), GstVideoMeta.class);
    }

    @Ptr
    protected static native long gst_buffer_add_video_overlay_composition_meta(
        @Ptr
        long buf,
        @Ptr
        long comp);

    public static Pointer<GstVideoOverlayCompositionMeta> buffer_add_video_overlay_composition_meta(Pointer<GstBuffer> buf, Pointer<GstVideoOverlayComposition> comp) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_add_video_overlay_composition_meta(Pointer.getPeer(buf), Pointer.getPeer(comp)), GstVideoOverlayCompositionMeta.class);
    }

    @Ptr
    protected static native long gst_buffer_add_video_region_of_interest_meta(
        @Ptr
        long buffer,
        @Ptr
        long roi_type, long x, long y, long w, long h);

    public static Pointer<GstVideoRegionOfInterestMeta> buffer_add_video_region_of_interest_meta(Pointer<GstBuffer> buffer, Pointer roi_type, long x, long y, long w, long h) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_add_video_region_of_interest_meta(Pointer.getPeer(buffer), Pointer.getPeer(roi_type), x, y, w, h), GstVideoRegionOfInterestMeta.class);
    }

    @Ptr
    protected static native long gst_buffer_add_video_region_of_interest_meta_id(
        @Ptr
        long buffer, long roi_type, long x, long y, long w, long h);

    public static Pointer<GstVideoRegionOfInterestMeta> buffer_add_video_region_of_interest_meta_id(Pointer<GstBuffer> buffer, long roi_type, long x, long y, long w, long h) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_add_video_region_of_interest_meta_id(Pointer.getPeer(buffer), roi_type, x, y, w, h), GstVideoRegionOfInterestMeta.class);
    }

    @Ptr
    protected static native long gst_buffer_get_video_meta_id(
        @Ptr
        long buffer, int id);

    public static Pointer<GstVideoMeta> buffer_get_video_meta_id(Pointer<GstBuffer> buffer, int id) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_get_video_meta_id(Pointer.getPeer(buffer), id), GstVideoMeta.class);
    }

    @Ptr
    protected static native long gst_buffer_get_video_region_of_interest_meta_id(
        @Ptr
        long buffer, int id);

    public static Pointer<GstVideoRegionOfInterestMeta> buffer_get_video_region_of_interest_meta_id(Pointer<GstBuffer> buffer, int id) {
        return Pointer.pointerToAddress(GstVideo.gst_buffer_get_video_region_of_interest_meta_id(Pointer.getPeer(buffer), id), GstVideoRegionOfInterestMeta.class);
    }

    protected static native boolean gst_buffer_pool_config_get_video_alignment(
        @Ptr
        long config,
        @Ptr
        long align);

    public static boolean buffer_pool_config_get_video_alignment(Pointer<GstStructure> config, Pointer<GstVideoAlignment> align) {
        return GstVideo.gst_buffer_pool_config_get_video_alignment(Pointer.getPeer(config), Pointer.getPeer(align));
    }

    protected static native void gst_buffer_pool_config_set_video_alignment(
        @Ptr
        long config,
        @Ptr
        long align);

    public static void buffer_pool_config_set_video_alignment(Pointer<GstStructure> config, Pointer<GstVideoAlignment> align) {
        GstVideo.gst_buffer_pool_config_set_video_alignment(Pointer.getPeer(config), Pointer.getPeer(align));
    }

    protected static native boolean gst_is_video_overlay_prepare_window_handle_message(
        @Ptr
        long msg);

    public static boolean is_video_overlay_prepare_window_handle_message(Pointer<GstMessage> msg) {
        return GstVideo.gst_is_video_overlay_prepare_window_handle_message(Pointer.getPeer(msg));
    }

    protected static native IntValuedEnum<GstNavigationEventType> gst_navigation_event_get_type(
        @Ptr
        long event);

    public static IntValuedEnum<GstNavigationEventType> navigation_event_get_type(Pointer<GstEvent> event) {
        return GstVideo.gst_navigation_event_get_type(Pointer.getPeer(event));
    }

    protected static native boolean gst_navigation_event_parse_command(
        @Ptr
        long event,
        @Ptr
        long command);

    public static boolean navigation_event_parse_command(Pointer<GstEvent> event, Pointer<IntValuedEnum<GstNavigationCommand>> command) {
        return GstVideo.gst_navigation_event_parse_command(Pointer.getPeer(event), Pointer.getPeer(command));
    }

    protected static native boolean gst_navigation_event_parse_key_event(
        @Ptr
        long event,
        @Ptr
        long key);

    public static boolean navigation_event_parse_key_event(Pointer<GstEvent> event, Pointer key) {
        return GstVideo.gst_navigation_event_parse_key_event(Pointer.getPeer(event), Pointer.getPeer(key));
    }

    protected static native boolean gst_navigation_event_parse_mouse_button_event(
        @Ptr
        long event,
        @Ptr
        long button,
        @Ptr
        long x,
        @Ptr
        long y);

    public static boolean navigation_event_parse_mouse_button_event(Pointer<GstEvent> event, Pointer<Integer> button, Pointer<Double> x, Pointer<Double> y) {
        return GstVideo.gst_navigation_event_parse_mouse_button_event(Pointer.getPeer(event), Pointer.getPeer(button), Pointer.getPeer(x), Pointer.getPeer(y));
    }

    protected static native boolean gst_navigation_event_parse_mouse_move_event(
        @Ptr
        long event,
        @Ptr
        long x,
        @Ptr
        long y);

    public static boolean navigation_event_parse_mouse_move_event(Pointer<GstEvent> event, Pointer<Double> x, Pointer<Double> y) {
        return GstVideo.gst_navigation_event_parse_mouse_move_event(Pointer.getPeer(event), Pointer.getPeer(x), Pointer.getPeer(y));
    }

    protected static native IntValuedEnum<GstNavigationMessageType> gst_navigation_message_get_type(
        @Ptr
        long message);

    public static IntValuedEnum<GstNavigationMessageType> navigation_message_get_type(Pointer<GstMessage> message) {
        return GstVideo.gst_navigation_message_get_type(Pointer.getPeer(message));
    }

    @Ptr
    protected static native long gst_navigation_message_new_angles_changed(
        @Ptr
        long src, long cur_angle, long n_angles);

    public static Pointer<GstMessage> navigation_message_new_angles_changed(Pointer<GstObject> src, long cur_angle, long n_angles) {
        return Pointer.pointerToAddress(GstVideo.gst_navigation_message_new_angles_changed(Pointer.getPeer(src), cur_angle, n_angles), GstMessage.class);
    }

    @Ptr
    protected static native long gst_navigation_message_new_commands_changed(
        @Ptr
        long src);

    public static Pointer<GstMessage> navigation_message_new_commands_changed(Pointer<GstObject> src) {
        return Pointer.pointerToAddress(GstVideo.gst_navigation_message_new_commands_changed(Pointer.getPeer(src)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_navigation_message_new_mouse_over(
        @Ptr
        long src, boolean active);

    public static Pointer<GstMessage> navigation_message_new_mouse_over(Pointer<GstObject> src, boolean active) {
        return Pointer.pointerToAddress(GstVideo.gst_navigation_message_new_mouse_over(Pointer.getPeer(src), active), GstMessage.class);
    }

    protected static native boolean gst_navigation_message_parse_angles_changed(
        @Ptr
        long message,
        @Ptr
        long cur_angle,
        @Ptr
        long n_angles);

    public static boolean navigation_message_parse_angles_changed(Pointer<GstMessage> message, Pointer<Long> cur_angle, Pointer<Long> n_angles) {
        return GstVideo.gst_navigation_message_parse_angles_changed(Pointer.getPeer(message), Pointer.getPeer(cur_angle), Pointer.getPeer(n_angles));
    }

    protected static native boolean gst_navigation_message_parse_mouse_over(
        @Ptr
        long message,
        @Ptr
        long active);

    public static boolean navigation_message_parse_mouse_over(Pointer<GstMessage> message, Pointer<Boolean> active) {
        return GstVideo.gst_navigation_message_parse_mouse_over(Pointer.getPeer(message), Pointer.getPeer(active));
    }

    protected static native IntValuedEnum<GstNavigationQueryType> gst_navigation_query_get_type(
        @Ptr
        long query);

    public static IntValuedEnum<GstNavigationQueryType> navigation_query_get_type(Pointer<GstQuery> query) {
        return GstVideo.gst_navigation_query_get_type(Pointer.getPeer(query));
    }

    @Ptr
    protected static native long gst_navigation_query_new_angles();

    public static Pointer<GstQuery> navigation_query_new_angles() {
        return Pointer.pointerToAddress(GstVideo.gst_navigation_query_new_angles(), GstQuery.class);
    }

    @Ptr
    protected static native long gst_navigation_query_new_commands();

    public static Pointer<GstQuery> navigation_query_new_commands() {
        return Pointer.pointerToAddress(GstVideo.gst_navigation_query_new_commands(), GstQuery.class);
    }

    protected static native boolean gst_navigation_query_parse_angles(
        @Ptr
        long query,
        @Ptr
        long cur_angle,
        @Ptr
        long n_angles);

    public static boolean navigation_query_parse_angles(Pointer<GstQuery> query, Pointer<Long> cur_angle, Pointer<Long> n_angles) {
        return GstVideo.gst_navigation_query_parse_angles(Pointer.getPeer(query), Pointer.getPeer(cur_angle), Pointer.getPeer(n_angles));
    }

    protected static native boolean gst_navigation_query_parse_commands_length(
        @Ptr
        long query,
        @Ptr
        long n_cmds);

    public static boolean navigation_query_parse_commands_length(Pointer<GstQuery> query, Pointer<Long> n_cmds) {
        return GstVideo.gst_navigation_query_parse_commands_length(Pointer.getPeer(query), Pointer.getPeer(n_cmds));
    }

    protected static native boolean gst_navigation_query_parse_commands_nth(
        @Ptr
        long query, long nth,
        @Ptr
        long cmd);

    public static boolean navigation_query_parse_commands_nth(Pointer<GstQuery> query, long nth, Pointer<IntValuedEnum<GstNavigationCommand>> cmd) {
        return GstVideo.gst_navigation_query_parse_commands_nth(Pointer.getPeer(query), nth, Pointer.getPeer(cmd));
    }

    protected static native void gst_navigation_query_set_angles(
        @Ptr
        long query, long cur_angle, long n_angles);

    public static void navigation_query_set_angles(Pointer<GstQuery> query, long cur_angle, long n_angles) {
        GstVideo.gst_navigation_query_set_angles(Pointer.getPeer(query), cur_angle, n_angles);
    }

    protected static native void gst_navigation_query_set_commandsv(
        @Ptr
        long query, int n_cmds,
        @Ptr
        long cmds);

    public static void navigation_query_set_commandsv(Pointer<GstQuery> query, int n_cmds, Pointer<IntValuedEnum<GstNavigationCommand>> cmds) {
        GstVideo.gst_navigation_query_set_commandsv(Pointer.getPeer(query), n_cmds, Pointer.getPeer(cmds));
    }

    protected static native boolean gst_video_blend(
        @Ptr
        long dest,
        @Ptr
        long src, int x, int y, float global_alpha);

    public static boolean video_blend(Pointer<GstVideoFrame> dest, Pointer<GstVideoFrame> src, int x, int y, float global_alpha) {
        return GstVideo.gst_video_blend(Pointer.getPeer(dest), Pointer.getPeer(src), x, y, global_alpha);
    }

    protected static native void gst_video_blend_scale_linear_RGBA(
        @Ptr
        long src,
        @Ptr
        long src_buffer, int dest_height, int dest_width,
        @Ptr
        long dest,
        @Ptr
        long dest_buffer);

    public static void video_blend_scale_linear_RGBA(Pointer<GstVideoInfo> src, Pointer<GstBuffer> src_buffer, int dest_height, int dest_width, Pointer<GstVideoInfo> dest, Pointer<Pointer<GstBuffer>> dest_buffer) {
        GstVideo.gst_video_blend_scale_linear_RGBA(Pointer.getPeer(src), Pointer.getPeer(src_buffer), dest_height, dest_width, Pointer.getPeer(dest), Pointer.getPeer(dest_buffer));
    }

    protected static native boolean gst_video_calculate_display_ratio(
        @Ptr
        long dar_n,
        @Ptr
        long dar_d, long video_width, long video_height, long video_par_n, long video_par_d, long display_par_n, long display_par_d);

    public static boolean video_calculate_display_ratio(Pointer<Long> dar_n, Pointer<Long> dar_d, long video_width, long video_height, long video_par_n, long video_par_d, long display_par_n, long display_par_d) {
        return GstVideo.gst_video_calculate_display_ratio(Pointer.getPeer(dar_n), Pointer.getPeer(dar_d), video_width, video_height, video_par_n, video_par_d, display_par_n, display_par_d);
    }

    protected static native IntValuedEnum<GstVideoChromaSite> gst_video_chroma_from_string(
        @Ptr
        long s);

    public static IntValuedEnum<GstVideoChromaSite> video_chroma_from_string(Pointer s) {
        return GstVideo.gst_video_chroma_from_string(Pointer.getPeer(s));
    }

    protected static native void gst_video_chroma_resample(
        @Ptr
        long resample,
        @Ptr
        long lines, int width);

    public static void video_chroma_resample(Pointer<GstVideoChromaResample> resample, Pointer lines, int width) {
        GstVideo.gst_video_chroma_resample(Pointer.getPeer(resample), Pointer.getPeer(lines), width);
    }

    @Ptr
    protected static native long gst_video_chroma_to_string(IntValuedEnum<GstVideoChromaSite> site);

    public static Pointer video_chroma_to_string(IntValuedEnum<GstVideoChromaSite> site) {
        return Pointer.pointerToAddress(GstVideo.gst_video_chroma_to_string(site));
    }

    protected static native void gst_video_color_range_offsets(IntValuedEnum<GstVideoColorRange> range,
        @Ptr
        long info, int offset, int scale);

    public static void video_color_range_offsets(IntValuedEnum<GstVideoColorRange> range, Pointer<GstVideoFormatInfo> info, int offset, int scale) {
        GstVideo.gst_video_color_range_offsets(range, Pointer.getPeer(info), offset, scale);
    }

    @Ptr
    protected static native long gst_video_convert_sample(
        @Ptr
        long sample,
        @Ptr
        long to_caps, long timeout);

    public static Pointer<GstSample> video_convert_sample(Pointer<GstSample> sample, Pointer<GstCaps> to_caps, long timeout) {
        return Pointer.pointerToAddress(GstVideo.gst_video_convert_sample(Pointer.getPeer(sample), Pointer.getPeer(to_caps), timeout), GstSample.class);
    }

    protected static native void gst_video_convert_sample_async(
        @Ptr
        long sample,
        @Ptr
        long to_caps, long timeout,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long destroy_notify);

    public static void video_convert_sample_async(Pointer<GstSample> sample, Pointer<GstCaps> to_caps, long timeout, Pointer callback, Pointer user_data, Pointer destroy_notify) {
        GstVideo.gst_video_convert_sample_async(Pointer.getPeer(sample), Pointer.getPeer(to_caps), timeout, Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(destroy_notify));
    }

    public static native long gst_video_crop_meta_api_get_type();

    @Ptr
    protected static native long gst_video_crop_meta_get_info();

    public static Pointer<GstMetaInfo> video_crop_meta_get_info() {
        return Pointer.pointerToAddress(GstVideo.gst_video_crop_meta_get_info(), GstMetaInfo.class);
    }

    protected static native boolean gst_video_event_is_force_key_unit(
        @Ptr
        long event);

    public static boolean video_event_is_force_key_unit(Pointer<GstEvent> event) {
        return GstVideo.gst_video_event_is_force_key_unit(Pointer.getPeer(event));
    }

    @Ptr
    protected static native long gst_video_event_new_downstream_force_key_unit(long timestamp, long stream_time, long running_time, boolean all_headers, long count);

    public static Pointer<GstEvent> video_event_new_downstream_force_key_unit(long timestamp, long stream_time, long running_time, boolean all_headers, long count) {
        return Pointer.pointerToAddress(GstVideo.gst_video_event_new_downstream_force_key_unit(timestamp, stream_time, running_time, all_headers, count), GstEvent.class);
    }

    @Ptr
    protected static native long gst_video_event_new_still_frame(boolean in_still);

    public static Pointer<GstEvent> video_event_new_still_frame(boolean in_still) {
        return Pointer.pointerToAddress(GstVideo.gst_video_event_new_still_frame(in_still), GstEvent.class);
    }

    @Ptr
    protected static native long gst_video_event_new_upstream_force_key_unit(long running_time, boolean all_headers, long count);

    public static Pointer<GstEvent> video_event_new_upstream_force_key_unit(long running_time, boolean all_headers, long count) {
        return Pointer.pointerToAddress(GstVideo.gst_video_event_new_upstream_force_key_unit(running_time, all_headers, count), GstEvent.class);
    }

    protected static native boolean gst_video_event_parse_downstream_force_key_unit(
        @Ptr
        long event,
        @Ptr
        long timestamp,
        @Ptr
        long stream_time,
        @Ptr
        long running_time,
        @Ptr
        long all_headers,
        @Ptr
        long count);

    public static boolean video_event_parse_downstream_force_key_unit(Pointer<GstEvent> event, Pointer<Long> timestamp, Pointer<Long> stream_time, Pointer<Long> running_time, Pointer<Boolean> all_headers, Pointer<Long> count) {
        return GstVideo.gst_video_event_parse_downstream_force_key_unit(Pointer.getPeer(event), Pointer.getPeer(timestamp), Pointer.getPeer(stream_time), Pointer.getPeer(running_time), Pointer.getPeer(all_headers), Pointer.getPeer(count));
    }

    protected static native boolean gst_video_event_parse_still_frame(
        @Ptr
        long event,
        @Ptr
        long in_still);

    public static boolean video_event_parse_still_frame(Pointer<GstEvent> event, Pointer<Boolean> in_still) {
        return GstVideo.gst_video_event_parse_still_frame(Pointer.getPeer(event), Pointer.getPeer(in_still));
    }

    protected static native boolean gst_video_event_parse_upstream_force_key_unit(
        @Ptr
        long event,
        @Ptr
        long running_time,
        @Ptr
        long all_headers,
        @Ptr
        long count);

    public static boolean video_event_parse_upstream_force_key_unit(Pointer<GstEvent> event, Pointer<Long> running_time, Pointer<Boolean> all_headers, Pointer<Long> count) {
        return GstVideo.gst_video_event_parse_upstream_force_key_unit(Pointer.getPeer(event), Pointer.getPeer(running_time), Pointer.getPeer(all_headers), Pointer.getPeer(count));
    }

    public static native IntValuedEnum<GstVideoFormat> gst_video_format_from_fourcc(long fourcc);

    public static native IntValuedEnum<GstVideoFormat> gst_video_format_from_masks(int depth, int bpp, int endianness, long red_mask, long green_mask, long blue_mask, long alpha_mask);

    protected static native IntValuedEnum<GstVideoFormat> gst_video_format_from_string(
        @Ptr
        long format);

    public static IntValuedEnum<GstVideoFormat> video_format_from_string(Pointer format) {
        return GstVideo.gst_video_format_from_string(Pointer.getPeer(format));
    }

    @Ptr
    protected static native long gst_video_format_get_info(IntValuedEnum<GstVideoFormat> format);

    public static Pointer<GstVideoFormatInfo> video_format_get_info(IntValuedEnum<GstVideoFormat> format) {
        return Pointer.pointerToAddress(GstVideo.gst_video_format_get_info(format), GstVideoFormatInfo.class);
    }

    public static native long gst_video_format_to_fourcc(IntValuedEnum<GstVideoFormat> format);

    @Ptr
    protected static native long gst_video_format_to_string(IntValuedEnum<GstVideoFormat> format);

    public static Pointer video_format_to_string(IntValuedEnum<GstVideoFormat> format) {
        return Pointer.pointerToAddress(GstVideo.gst_video_format_to_string(format));
    }

    public static native long gst_video_gl_texture_upload_meta_api_get_type();

    @Ptr
    protected static native long gst_video_gl_texture_upload_meta_get_info();

    public static Pointer<GstMetaInfo> video_gl_texture_upload_meta_get_info() {
        return Pointer.pointerToAddress(GstVideo.gst_video_gl_texture_upload_meta_get_info(), GstMetaInfo.class);
    }

    public static native long gst_video_meta_api_get_type();

    @Ptr
    protected static native long gst_video_meta_get_info();

    public static Pointer<GstMetaInfo> video_meta_get_info() {
        return Pointer.pointerToAddress(GstVideo.gst_video_meta_get_info(), GstMetaInfo.class);
    }

    public static native long gst_video_meta_transform_scale_get_quark();

    public static native long gst_video_overlay_composition_meta_api_get_type();

    @Ptr
    protected static native long gst_video_overlay_composition_meta_get_info();

    public static Pointer<GstMetaInfo> video_overlay_composition_meta_get_info() {
        return Pointer.pointerToAddress(GstVideo.gst_video_overlay_composition_meta_get_info(), GstMetaInfo.class);
    }

    public static native long gst_video_region_of_interest_meta_api_get_type();

    @Ptr
    protected static native long gst_video_region_of_interest_meta_get_info();

    public static Pointer<GstMetaInfo> video_region_of_interest_meta_get_info() {
        return Pointer.pointerToAddress(GstVideo.gst_video_region_of_interest_meta_get_info(), GstMetaInfo.class);
    }

}
