
package generated;

import generated.glib20.glib.GList;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstSample;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamertag10.gsttag.GstTagImageType;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstTag {


    protected native boolean gst_tag_check_language_code(
        @Ptr
        long lang_code);

    public boolean tag_check_language_code(Pointer lang_code) {
        return this.gst_tag_check_language_code(Pointer.getPeer(lang_code));
    }

    @Ptr
    protected native long gst_tag_freeform_string_to_utf8(
        @Ptr
        long data, int size,
        @Ptr
        long env_vars);

    public Pointer tag_freeform_string_to_utf8(Pointer data, int size, Pointer env_vars) {
        return Pointer.pointerToAddress(this.gst_tag_freeform_string_to_utf8(Pointer.getPeer(data), size, Pointer.getPeer(env_vars)));
    }

    @Ptr
    protected native long gst_tag_from_id3_tag(
        @Ptr
        long id3_tag);

    public Pointer tag_from_id3_tag(Pointer id3_tag) {
        return Pointer.pointerToAddress(this.gst_tag_from_id3_tag(Pointer.getPeer(id3_tag)));
    }

    @Ptr
    protected native long gst_tag_from_id3_user_tag(
        @Ptr
        long type,
        @Ptr
        long id3_user_tag);

    public Pointer tag_from_id3_user_tag(Pointer type, Pointer id3_user_tag) {
        return Pointer.pointerToAddress(this.gst_tag_from_id3_user_tag(Pointer.getPeer(type), Pointer.getPeer(id3_user_tag)));
    }

    @Ptr
    protected native long gst_tag_from_vorbis_tag(
        @Ptr
        long vorbis_tag);

    public Pointer tag_from_vorbis_tag(Pointer vorbis_tag) {
        return Pointer.pointerToAddress(this.gst_tag_from_vorbis_tag(Pointer.getPeer(vorbis_tag)));
    }

    protected native long gst_tag_get_id3v2_tag_size(
        @Ptr
        long buffer);

    public long tag_get_id3v2_tag_size(Pointer<GstBuffer> buffer) {
        return this.gst_tag_get_id3v2_tag_size(Pointer.getPeer(buffer));
    }

    @Ptr
    protected native long gst_tag_get_language_code_iso_639_1(
        @Ptr
        long lang_code);

    public Pointer tag_get_language_code_iso_639_1(Pointer lang_code) {
        return Pointer.pointerToAddress(this.gst_tag_get_language_code_iso_639_1(Pointer.getPeer(lang_code)));
    }

    @Ptr
    protected native long gst_tag_get_language_code_iso_639_2B(
        @Ptr
        long lang_code);

    public Pointer tag_get_language_code_iso_639_2B(Pointer lang_code) {
        return Pointer.pointerToAddress(this.gst_tag_get_language_code_iso_639_2B(Pointer.getPeer(lang_code)));
    }

    @Ptr
    protected native long gst_tag_get_language_code_iso_639_2T(
        @Ptr
        long lang_code);

    public Pointer tag_get_language_code_iso_639_2T(Pointer lang_code) {
        return Pointer.pointerToAddress(this.gst_tag_get_language_code_iso_639_2T(Pointer.getPeer(lang_code)));
    }

    @Ptr
    protected native long gst_tag_get_language_codes();

    public Pointer tag_get_language_codes() {
        return Pointer.pointerToAddress(this.gst_tag_get_language_codes());
    }

    @Ptr
    protected native long gst_tag_get_language_name(
        @Ptr
        long language_code);

    public Pointer tag_get_language_name(Pointer language_code) {
        return Pointer.pointerToAddress(this.gst_tag_get_language_name(Pointer.getPeer(language_code)));
    }

    @Ptr
    protected native long gst_tag_get_license_description(
        @Ptr
        long license_ref);

    public Pointer tag_get_license_description(Pointer license_ref) {
        return Pointer.pointerToAddress(this.gst_tag_get_license_description(Pointer.getPeer(license_ref)));
    }

    protected native Object gst_tag_get_license_flags(
        @Ptr
        long license_ref);

    public Object tag_get_license_flags(Pointer license_ref) {
        return this.gst_tag_get_license_flags(Pointer.getPeer(license_ref));
    }

    @Ptr
    protected native long gst_tag_get_license_jurisdiction(
        @Ptr
        long license_ref);

    public Pointer tag_get_license_jurisdiction(Pointer license_ref) {
        return Pointer.pointerToAddress(this.gst_tag_get_license_jurisdiction(Pointer.getPeer(license_ref)));
    }

    @Ptr
    protected native long gst_tag_get_license_nick(
        @Ptr
        long license_ref);

    public Pointer tag_get_license_nick(Pointer license_ref) {
        return Pointer.pointerToAddress(this.gst_tag_get_license_nick(Pointer.getPeer(license_ref)));
    }

    @Ptr
    protected native long gst_tag_get_license_title(
        @Ptr
        long license_ref);

    public Pointer tag_get_license_title(Pointer license_ref) {
        return Pointer.pointerToAddress(this.gst_tag_get_license_title(Pointer.getPeer(license_ref)));
    }

    @Ptr
    protected native long gst_tag_get_license_version(
        @Ptr
        long license_ref);

    public Pointer tag_get_license_version(Pointer license_ref) {
        return Pointer.pointerToAddress(this.gst_tag_get_license_version(Pointer.getPeer(license_ref)));
    }

    @Ptr
    protected native long gst_tag_get_licenses();

    public Pointer tag_get_licenses() {
        return Pointer.pointerToAddress(this.gst_tag_get_licenses());
    }

    public native long gst_tag_id3_genre_count();

    @Ptr
    protected native long gst_tag_id3_genre_get(long id);

    public Pointer tag_id3_genre_get(long id) {
        return Pointer.pointerToAddress(this.gst_tag_id3_genre_get(id));
    }

    @Ptr
    protected native long gst_tag_image_data_to_image_sample(
        @Ptr
        long image_data, long image_data_len, IntValuedEnum<GstTagImageType> image_type);

    public Pointer<GstSample> tag_image_data_to_image_sample(Pointer<Short> image_data, long image_data_len, IntValuedEnum<GstTagImageType> image_type) {
        return Pointer.pointerToAddress(this.gst_tag_image_data_to_image_sample(Pointer.getPeer(image_data), image_data_len, image_type), Pointer.class);
    }

    protected native boolean gst_tag_list_add_id3_image(
        @Ptr
        long tag_list,
        @Ptr
        long image_data, long image_data_len, long id3_picture_type);

    public boolean tag_list_add_id3_image(Pointer<GstTagList> tag_list, Pointer<Short> image_data, long image_data_len, long id3_picture_type) {
        return this.gst_tag_list_add_id3_image(Pointer.getPeer(tag_list), Pointer.getPeer(image_data), image_data_len, id3_picture_type);
    }

    @Ptr
    protected native long gst_tag_list_from_exif_buffer(
        @Ptr
        long buffer, int byte_order, long base_offset);

    public Pointer<GstTagList> tag_list_from_exif_buffer(Pointer<GstBuffer> buffer, int byte_order, long base_offset) {
        return Pointer.pointerToAddress(this.gst_tag_list_from_exif_buffer(Pointer.getPeer(buffer), byte_order, base_offset), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_from_exif_buffer_with_tiff_header(
        @Ptr
        long buffer);

    public Pointer<GstTagList> tag_list_from_exif_buffer_with_tiff_header(Pointer<GstBuffer> buffer) {
        return Pointer.pointerToAddress(this.gst_tag_list_from_exif_buffer_with_tiff_header(Pointer.getPeer(buffer)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_from_id3v2_tag(
        @Ptr
        long buffer);

    public Pointer<GstTagList> tag_list_from_id3v2_tag(Pointer<GstBuffer> buffer) {
        return Pointer.pointerToAddress(this.gst_tag_list_from_id3v2_tag(Pointer.getPeer(buffer)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_from_vorbiscomment(
        @Ptr
        long data, long size,
        @Ptr
        long id_data, long id_data_length,
        @Ptr
        long vendor_string);

    public Pointer<GstTagList> tag_list_from_vorbiscomment(Pointer<Short> data, long size, Pointer<Short> id_data, long id_data_length, Pointer vendor_string) {
        return Pointer.pointerToAddress(this.gst_tag_list_from_vorbiscomment(Pointer.getPeer(data), size, Pointer.getPeer(id_data), id_data_length, Pointer.getPeer(vendor_string)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_from_vorbiscomment_buffer(
        @Ptr
        long buffer,
        @Ptr
        long id_data, long id_data_length,
        @Ptr
        long vendor_string);

    public Pointer<GstTagList> tag_list_from_vorbiscomment_buffer(Pointer<GstBuffer> buffer, Pointer<Short> id_data, long id_data_length, Pointer vendor_string) {
        return Pointer.pointerToAddress(this.gst_tag_list_from_vorbiscomment_buffer(Pointer.getPeer(buffer), Pointer.getPeer(id_data), id_data_length, Pointer.getPeer(vendor_string)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_from_xmp_buffer(
        @Ptr
        long buffer);

    public Pointer<GstTagList> tag_list_from_xmp_buffer(Pointer<GstBuffer> buffer) {
        return Pointer.pointerToAddress(this.gst_tag_list_from_xmp_buffer(Pointer.getPeer(buffer)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_new_from_id3v1(
        @Ptr
        long data);

    public Pointer<GstTagList> tag_list_new_from_id3v1(Pointer<Short> data) {
        return Pointer.pointerToAddress(this.gst_tag_list_new_from_id3v1(Pointer.getPeer(data)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_to_exif_buffer(
        @Ptr
        long taglist, int byte_order, long base_offset);

    public Pointer<GstBuffer> tag_list_to_exif_buffer(Pointer<GstTagList> taglist, int byte_order, long base_offset) {
        return Pointer.pointerToAddress(this.gst_tag_list_to_exif_buffer(Pointer.getPeer(taglist), byte_order, base_offset), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_to_exif_buffer_with_tiff_header(
        @Ptr
        long taglist);

    public Pointer<GstBuffer> tag_list_to_exif_buffer_with_tiff_header(Pointer<GstTagList> taglist) {
        return Pointer.pointerToAddress(this.gst_tag_list_to_exif_buffer_with_tiff_header(Pointer.getPeer(taglist)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_to_vorbiscomment_buffer(
        @Ptr
        long list,
        @Ptr
        long id_data, long id_data_length,
        @Ptr
        long vendor_string);

    public Pointer<GstBuffer> tag_list_to_vorbiscomment_buffer(Pointer<GstTagList> list, Pointer<Short> id_data, long id_data_length, Pointer vendor_string) {
        return Pointer.pointerToAddress(this.gst_tag_list_to_vorbiscomment_buffer(Pointer.getPeer(list), Pointer.getPeer(id_data), id_data_length, Pointer.getPeer(vendor_string)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_list_to_xmp_buffer(
        @Ptr
        long list, boolean read_only,
        @Ptr
        long schemas);

    public Pointer<GstBuffer> tag_list_to_xmp_buffer(Pointer<GstTagList> list, boolean read_only, Pointer schemas) {
        return Pointer.pointerToAddress(this.gst_tag_list_to_xmp_buffer(Pointer.getPeer(list), read_only, Pointer.getPeer(schemas)), Pointer.class);
    }

    protected native boolean gst_tag_parse_extended_comment(
        @Ptr
        long ext_comment,
        @Ptr
        long key,
        @Ptr
        long lang,
        @Ptr
        long value, boolean fail_if_no_key);

    public boolean tag_parse_extended_comment(Pointer ext_comment, Pointer key, Pointer lang, Pointer value, boolean fail_if_no_key) {
        return this.gst_tag_parse_extended_comment(Pointer.getPeer(ext_comment), Pointer.getPeer(key), Pointer.getPeer(lang), Pointer.getPeer(value), fail_if_no_key);
    }

    public native void gst_tag_register_musicbrainz_tags();

    @Ptr
    protected native long gst_tag_to_id3_tag(
        @Ptr
        long gst_tag);

    public Pointer tag_to_id3_tag(Pointer gst_tag) {
        return Pointer.pointerToAddress(this.gst_tag_to_id3_tag(Pointer.getPeer(gst_tag)));
    }

    @Ptr
    protected native long gst_tag_to_vorbis_comments(
        @Ptr
        long list,
        @Ptr
        long tag);

    public Pointer<GList> tag_to_vorbis_comments(Pointer<GstTagList> list, Pointer tag) {
        return Pointer.pointerToAddress(this.gst_tag_to_vorbis_comments(Pointer.getPeer(list), Pointer.getPeer(tag)), Pointer.class);
    }

    @Ptr
    protected native long gst_tag_to_vorbis_tag(
        @Ptr
        long gst_tag);

    public Pointer tag_to_vorbis_tag(Pointer gst_tag) {
        return Pointer.pointerToAddress(this.gst_tag_to_vorbis_tag(Pointer.getPeer(gst_tag)));
    }

    @Ptr
    protected native long gst_tag_xmp_list_schemas();

    public Pointer tag_xmp_list_schemas() {
        return Pointer.pointerToAddress(this.gst_tag_xmp_list_schemas());
    }

    protected native void gst_vorbis_tag_add(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public void vorbis_tag_add(Pointer<GstTagList> list, Pointer tag, Pointer value) {
        this.gst_vorbis_tag_add(Pointer.getPeer(list), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

}
