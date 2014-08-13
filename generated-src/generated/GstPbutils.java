
package generated;

import generated.glib20.glib.GList;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstMessage;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamerpbutils10.gstpbutils.GstInstallPluginsContext;
import generated.gstreamerpbutils10.gstpbutils.GstInstallPluginsReturn;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstPbutils {


    protected native boolean gst_codec_utils_aac_caps_set_level_and_profile(
        @Ptr
        long caps,
        @Ptr
        long audio_config, long len);

    public boolean codec_utils_aac_caps_set_level_and_profile(Pointer<GstCaps> caps, Pointer<Short> audio_config, long len) {
        return this.gst_codec_utils_aac_caps_set_level_and_profile(Pointer.getPeer(caps), Pointer.getPeer(audio_config), len);
    }

    public native int gst_codec_utils_aac_get_index_from_sample_rate(long rate);

    @Ptr
    protected native long gst_codec_utils_aac_get_level(
        @Ptr
        long audio_config, long len);

    public Pointer codec_utils_aac_get_level(Pointer<Short> audio_config, long len) {
        return Pointer.pointerToAddress(this.gst_codec_utils_aac_get_level(Pointer.getPeer(audio_config), len));
    }

    @Ptr
    protected native long gst_codec_utils_aac_get_profile(
        @Ptr
        long audio_config, long len);

    public Pointer codec_utils_aac_get_profile(Pointer<Short> audio_config, long len) {
        return Pointer.pointerToAddress(this.gst_codec_utils_aac_get_profile(Pointer.getPeer(audio_config), len));
    }

    public native long gst_codec_utils_aac_get_sample_rate_from_index(long sr_idx);

    protected native boolean gst_codec_utils_h264_caps_set_level_and_profile(
        @Ptr
        long caps,
        @Ptr
        long sps, long len);

    public boolean codec_utils_h264_caps_set_level_and_profile(Pointer<GstCaps> caps, Pointer<Short> sps, long len) {
        return this.gst_codec_utils_h264_caps_set_level_and_profile(Pointer.getPeer(caps), Pointer.getPeer(sps), len);
    }

    @Ptr
    protected native long gst_codec_utils_h264_get_level(
        @Ptr
        long sps, long len);

    public Pointer codec_utils_h264_get_level(Pointer<Short> sps, long len) {
        return Pointer.pointerToAddress(this.gst_codec_utils_h264_get_level(Pointer.getPeer(sps), len));
    }

    protected native short gst_codec_utils_h264_get_level_idc(
        @Ptr
        long level);

    public short codec_utils_h264_get_level_idc(Pointer level) {
        return this.gst_codec_utils_h264_get_level_idc(Pointer.getPeer(level));
    }

    @Ptr
    protected native long gst_codec_utils_h264_get_profile(
        @Ptr
        long sps, long len);

    public Pointer codec_utils_h264_get_profile(Pointer<Short> sps, long len) {
        return Pointer.pointerToAddress(this.gst_codec_utils_h264_get_profile(Pointer.getPeer(sps), len));
    }

    protected native boolean gst_codec_utils_mpeg4video_caps_set_level_and_profile(
        @Ptr
        long caps,
        @Ptr
        long vis_obj_seq, long len);

    public boolean codec_utils_mpeg4video_caps_set_level_and_profile(Pointer<GstCaps> caps, Pointer<Short> vis_obj_seq, long len) {
        return this.gst_codec_utils_mpeg4video_caps_set_level_and_profile(Pointer.getPeer(caps), Pointer.getPeer(vis_obj_seq), len);
    }

    @Ptr
    protected native long gst_codec_utils_mpeg4video_get_level(
        @Ptr
        long vis_obj_seq, long len);

    public Pointer codec_utils_mpeg4video_get_level(Pointer<Short> vis_obj_seq, long len) {
        return Pointer.pointerToAddress(this.gst_codec_utils_mpeg4video_get_level(Pointer.getPeer(vis_obj_seq), len));
    }

    @Ptr
    protected native long gst_codec_utils_mpeg4video_get_profile(
        @Ptr
        long vis_obj_seq, long len);

    public Pointer codec_utils_mpeg4video_get_profile(Pointer<Short> vis_obj_seq, long len) {
        return Pointer.pointerToAddress(this.gst_codec_utils_mpeg4video_get_profile(Pointer.getPeer(vis_obj_seq), len));
    }

    @Ptr
    protected native long gst_encoding_list_all_targets(
        @Ptr
        long categoryname);

    public Pointer<GList> encoding_list_all_targets(Pointer categoryname) {
        return Pointer.pointerToAddress(this.gst_encoding_list_all_targets(Pointer.getPeer(categoryname)), Pointer.class);
    }

    @Ptr
    protected native long gst_encoding_list_available_categories();

    public Pointer<GList> encoding_list_available_categories() {
        return Pointer.pointerToAddress(this.gst_encoding_list_available_categories(), Pointer.class);
    }

    protected native IntValuedEnum<GstInstallPluginsReturn> gst_install_plugins_async(
        @Ptr
        long details,
        @Ptr
        long ctx, Object func, Pointer user_data);

    public IntValuedEnum<GstInstallPluginsReturn> install_plugins_async(Pointer details, Pointer<GstInstallPluginsContext> ctx, Object func, Pointer user_data) {
        return this.gst_install_plugins_async(Pointer.getPeer(details), Pointer.getPeer(ctx), func, user_data);
    }

    public native boolean gst_install_plugins_installation_in_progress();

    @Ptr
    protected native long gst_install_plugins_return_get_name(IntValuedEnum<GstInstallPluginsReturn> ret);

    public Pointer install_plugins_return_get_name(IntValuedEnum<GstInstallPluginsReturn> ret) {
        return Pointer.pointerToAddress(this.gst_install_plugins_return_get_name(ret));
    }

    public native boolean gst_install_plugins_supported();

    protected native IntValuedEnum<GstInstallPluginsReturn> gst_install_plugins_sync(
        @Ptr
        long details,
        @Ptr
        long ctx);

    public IntValuedEnum<GstInstallPluginsReturn> install_plugins_sync(Pointer details, Pointer<GstInstallPluginsContext> ctx) {
        return this.gst_install_plugins_sync(Pointer.getPeer(details), Pointer.getPeer(ctx));
    }

    protected native boolean gst_is_missing_plugin_message(
        @Ptr
        long msg);

    public boolean is_missing_plugin_message(Pointer<GstMessage> msg) {
        return this.gst_is_missing_plugin_message(Pointer.getPeer(msg));
    }

    @Ptr
    protected native long gst_missing_decoder_installer_detail_new(
        @Ptr
        long decode_caps);

    public Pointer missing_decoder_installer_detail_new(Pointer<GstCaps> decode_caps) {
        return Pointer.pointerToAddress(this.gst_missing_decoder_installer_detail_new(Pointer.getPeer(decode_caps)));
    }

    @Ptr
    protected native long gst_missing_decoder_message_new(
        @Ptr
        long element,
        @Ptr
        long decode_caps);

    public Pointer<GstMessage> missing_decoder_message_new(Pointer<GstElement> element, Pointer<GstCaps> decode_caps) {
        return Pointer.pointerToAddress(this.gst_missing_decoder_message_new(Pointer.getPeer(element), Pointer.getPeer(decode_caps)), Pointer.class);
    }

    @Ptr
    protected native long gst_missing_element_installer_detail_new(
        @Ptr
        long factory_name);

    public Pointer missing_element_installer_detail_new(Pointer factory_name) {
        return Pointer.pointerToAddress(this.gst_missing_element_installer_detail_new(Pointer.getPeer(factory_name)));
    }

    @Ptr
    protected native long gst_missing_element_message_new(
        @Ptr
        long element,
        @Ptr
        long factory_name);

    public Pointer<GstMessage> missing_element_message_new(Pointer<GstElement> element, Pointer factory_name) {
        return Pointer.pointerToAddress(this.gst_missing_element_message_new(Pointer.getPeer(element), Pointer.getPeer(factory_name)), Pointer.class);
    }

    @Ptr
    protected native long gst_missing_encoder_installer_detail_new(
        @Ptr
        long encode_caps);

    public Pointer missing_encoder_installer_detail_new(Pointer<GstCaps> encode_caps) {
        return Pointer.pointerToAddress(this.gst_missing_encoder_installer_detail_new(Pointer.getPeer(encode_caps)));
    }

    @Ptr
    protected native long gst_missing_encoder_message_new(
        @Ptr
        long element,
        @Ptr
        long encode_caps);

    public Pointer<GstMessage> missing_encoder_message_new(Pointer<GstElement> element, Pointer<GstCaps> encode_caps) {
        return Pointer.pointerToAddress(this.gst_missing_encoder_message_new(Pointer.getPeer(element), Pointer.getPeer(encode_caps)), Pointer.class);
    }

    @Ptr
    protected native long gst_missing_plugin_message_get_description(
        @Ptr
        long msg);

    public Pointer missing_plugin_message_get_description(Pointer<GstMessage> msg) {
        return Pointer.pointerToAddress(this.gst_missing_plugin_message_get_description(Pointer.getPeer(msg)));
    }

    @Ptr
    protected native long gst_missing_plugin_message_get_installer_detail(
        @Ptr
        long msg);

    public Pointer missing_plugin_message_get_installer_detail(Pointer<GstMessage> msg) {
        return Pointer.pointerToAddress(this.gst_missing_plugin_message_get_installer_detail(Pointer.getPeer(msg)));
    }

    @Ptr
    protected native long gst_missing_uri_sink_installer_detail_new(
        @Ptr
        long protocol);

    public Pointer missing_uri_sink_installer_detail_new(Pointer protocol) {
        return Pointer.pointerToAddress(this.gst_missing_uri_sink_installer_detail_new(Pointer.getPeer(protocol)));
    }

    @Ptr
    protected native long gst_missing_uri_sink_message_new(
        @Ptr
        long element,
        @Ptr
        long protocol);

    public Pointer<GstMessage> missing_uri_sink_message_new(Pointer<GstElement> element, Pointer protocol) {
        return Pointer.pointerToAddress(this.gst_missing_uri_sink_message_new(Pointer.getPeer(element), Pointer.getPeer(protocol)), Pointer.class);
    }

    @Ptr
    protected native long gst_missing_uri_source_installer_detail_new(
        @Ptr
        long protocol);

    public Pointer missing_uri_source_installer_detail_new(Pointer protocol) {
        return Pointer.pointerToAddress(this.gst_missing_uri_source_installer_detail_new(Pointer.getPeer(protocol)));
    }

    @Ptr
    protected native long gst_missing_uri_source_message_new(
        @Ptr
        long element,
        @Ptr
        long protocol);

    public Pointer<GstMessage> missing_uri_source_message_new(Pointer<GstElement> element, Pointer protocol) {
        return Pointer.pointerToAddress(this.gst_missing_uri_source_message_new(Pointer.getPeer(element), Pointer.getPeer(protocol)), Pointer.class);
    }

    protected native boolean gst_pb_utils_add_codec_description_to_tag_list(
        @Ptr
        long taglist,
        @Ptr
        long codec_tag,
        @Ptr
        long caps);

    public boolean pb_utils_add_codec_description_to_tag_list(Pointer<GstTagList> taglist, Pointer codec_tag, Pointer<GstCaps> caps) {
        return this.gst_pb_utils_add_codec_description_to_tag_list(Pointer.getPeer(taglist), Pointer.getPeer(codec_tag), Pointer.getPeer(caps));
    }

    @Ptr
    protected native long gst_pb_utils_get_codec_description(
        @Ptr
        long caps);

    public Pointer pb_utils_get_codec_description(Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(this.gst_pb_utils_get_codec_description(Pointer.getPeer(caps)));
    }

    @Ptr
    protected native long gst_pb_utils_get_decoder_description(
        @Ptr
        long caps);

    public Pointer pb_utils_get_decoder_description(Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(this.gst_pb_utils_get_decoder_description(Pointer.getPeer(caps)));
    }

    @Ptr
    protected native long gst_pb_utils_get_element_description(
        @Ptr
        long factory_name);

    public Pointer pb_utils_get_element_description(Pointer factory_name) {
        return Pointer.pointerToAddress(this.gst_pb_utils_get_element_description(Pointer.getPeer(factory_name)));
    }

    @Ptr
    protected native long gst_pb_utils_get_encoder_description(
        @Ptr
        long caps);

    public Pointer pb_utils_get_encoder_description(Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(this.gst_pb_utils_get_encoder_description(Pointer.getPeer(caps)));
    }

    @Ptr
    protected native long gst_pb_utils_get_sink_description(
        @Ptr
        long protocol);

    public Pointer pb_utils_get_sink_description(Pointer protocol) {
        return Pointer.pointerToAddress(this.gst_pb_utils_get_sink_description(Pointer.getPeer(protocol)));
    }

    @Ptr
    protected native long gst_pb_utils_get_source_description(
        @Ptr
        long protocol);

    public Pointer pb_utils_get_source_description(Pointer protocol) {
        return Pointer.pointerToAddress(this.gst_pb_utils_get_source_description(Pointer.getPeer(protocol)));
    }

    public native void gst_pb_utils_init();

    protected native void gst_plugins_base_version(
        @Ptr
        long major,
        @Ptr
        long minor,
        @Ptr
        long micro,
        @Ptr
        long nano);

    public void plugins_base_version(Pointer<Long> major, Pointer<Long> minor, Pointer<Long> micro, Pointer<Long> nano) {
        this.gst_plugins_base_version(Pointer.getPeer(major), Pointer.getPeer(minor), Pointer.getPeer(micro), Pointer.getPeer(nano));
    }

    @Ptr
    protected native long gst_plugins_base_version_string();

    public Pointer plugins_base_version_string() {
        return Pointer.pointerToAddress(this.gst_plugins_base_version_string());
    }

}
