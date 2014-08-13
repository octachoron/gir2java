
package generated.gstreamerpbutils10.gstpbutils;

import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstCaps;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstEncodingProfile
    extends GObject
{


    public GstEncodingProfile() {
        super();
    }

    public GstEncodingProfile(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_encoding_profile_find(
        @Ptr
        long targetname,
        @Ptr
        long profilename,
        @Ptr
        long category);

    public Pointer find(Pointer targetname, Pointer profilename, Pointer category) {
        return Pointer.pointerToAddress(this.gst_encoding_profile_find(Pointer.getPeer(targetname), Pointer.getPeer(profilename), Pointer.getPeer(category)));
    }

    @Ptr
    protected native long gst_encoding_profile_from_discoverer(
        @Ptr
        long info);

    public Pointer from_discoverer(Pointer<GstDiscovererInfo> info) {
        return Pointer.pointerToAddress(this.gst_encoding_profile_from_discoverer(Pointer.getPeer(info)));
    }

    @Ptr
    protected native long gst_encoding_profile_get_description(
        @Ptr
        long profile);

    public Pointer get_description() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_description(Pointer.pointerTo(this, GstEncodingProfile.class)));
    }

    @Ptr
    protected native long gst_encoding_profile_get_file_extension(
        @Ptr
        long profile);

    public Pointer get_file_extension() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_file_extension(Pointer.pointerTo(this, GstEncodingProfile.class)));
    }

    @Ptr
    protected native long gst_encoding_profile_get_format(
        @Ptr
        long profile);

    public Pointer<GstCaps> get_format() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_format(Pointer.pointerTo(this, GstEncodingProfile.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_encoding_profile_get_input_caps(
        @Ptr
        long profile);

    public Pointer<GstCaps> get_input_caps() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_input_caps(Pointer.pointerTo(this, GstEncodingProfile.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_encoding_profile_get_name(
        @Ptr
        long profile);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_name(Pointer.pointerTo(this, GstEncodingProfile.class)));
    }

    protected native long gst_encoding_profile_get_presence(
        @Ptr
        long profile);

    public long get_presence() {
        return this.gst_encoding_profile_get_presence(Pointer.pointerTo(this, GstEncodingProfile.class));
    }

    @Ptr
    protected native long gst_encoding_profile_get_preset(
        @Ptr
        long profile);

    public Pointer get_preset() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_preset(Pointer.pointerTo(this, GstEncodingProfile.class)));
    }

    @Ptr
    protected native long gst_encoding_profile_get_preset_name(
        @Ptr
        long profile);

    public Pointer get_preset_name() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_preset_name(Pointer.pointerTo(this, GstEncodingProfile.class)));
    }

    @Ptr
    protected native long gst_encoding_profile_get_restriction(
        @Ptr
        long profile);

    public Pointer<GstCaps> get_restriction() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_restriction(Pointer.pointerTo(this, GstEncodingProfile.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_encoding_profile_get_type_nick(
        @Ptr
        long profile);

    public Pointer get_type_nick() {
        return Pointer.pointerToAddress(this.gst_encoding_profile_get_type_nick(Pointer.pointerTo(this, GstEncodingProfile.class)));
    }

    protected native boolean gst_encoding_profile_is_equal(
        @Ptr
        long a,
        @Ptr
        long b);

    public boolean is_equal(Pointer b) {
        return this.gst_encoding_profile_is_equal(Pointer.pointerTo(this, GstEncodingProfile.class), Pointer.getPeer(b));
    }

    protected native void gst_encoding_profile_set_description(
        @Ptr
        long profile,
        @Ptr
        long description);

    public void set_description(Pointer description) {
        this.gst_encoding_profile_set_description(Pointer.pointerTo(this, GstEncodingProfile.class), Pointer.getPeer(description));
    }

    protected native void gst_encoding_profile_set_format(
        @Ptr
        long profile,
        @Ptr
        long format);

    public void set_format(Pointer<GstCaps> format) {
        this.gst_encoding_profile_set_format(Pointer.pointerTo(this, GstEncodingProfile.class), Pointer.getPeer(format));
    }

    protected native void gst_encoding_profile_set_name(
        @Ptr
        long profile,
        @Ptr
        long name);

    public void set_name(Pointer name) {
        this.gst_encoding_profile_set_name(Pointer.pointerTo(this, GstEncodingProfile.class), Pointer.getPeer(name));
    }

    protected native void gst_encoding_profile_set_presence(
        @Ptr
        long profile, long presence);

    public void set_presence(long presence) {
        this.gst_encoding_profile_set_presence(Pointer.pointerTo(this, GstEncodingProfile.class), presence);
    }

    protected native void gst_encoding_profile_set_preset(
        @Ptr
        long profile,
        @Ptr
        long preset);

    public void set_preset(Pointer preset) {
        this.gst_encoding_profile_set_preset(Pointer.pointerTo(this, GstEncodingProfile.class), Pointer.getPeer(preset));
    }

    protected native void gst_encoding_profile_set_preset_name(
        @Ptr
        long profile,
        @Ptr
        long preset_name);

    public void set_preset_name(Pointer preset_name) {
        this.gst_encoding_profile_set_preset_name(Pointer.pointerTo(this, GstEncodingProfile.class), Pointer.getPeer(preset_name));
    }

    protected native void gst_encoding_profile_set_restriction(
        @Ptr
        long profile,
        @Ptr
        long restriction);

    public void set_restriction(Pointer<GstCaps> restriction) {
        this.gst_encoding_profile_set_restriction(Pointer.pointerTo(this, GstEncodingProfile.class), Pointer.getPeer(restriction));
    }

}
