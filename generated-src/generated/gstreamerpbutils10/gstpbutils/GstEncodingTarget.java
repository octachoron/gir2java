
package generated.gstreamerpbutils10.gstpbutils;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstEncodingTarget
    extends GObject
{


    public GstEncodingTarget() {
        super();
    }

    public GstEncodingTarget(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_encoding_target_load(
        @Ptr
        long name,
        @Ptr
        long category);

    public Pointer load(Pointer name, Pointer category) {
        return Pointer.pointerToAddress(this.gst_encoding_target_load(Pointer.getPeer(name), Pointer.getPeer(category)));
    }

    @Ptr
    protected native long gst_encoding_target_load_from_file(
        @Ptr
        long filepath);

    public Pointer load_from_file(Pointer filepath) {
        return Pointer.pointerToAddress(this.gst_encoding_target_load_from_file(Pointer.getPeer(filepath)));
    }

    protected native boolean gst_encoding_target_add_profile(
        @Ptr
        long target,
        @Ptr
        long profile);

    public boolean add_profile(Pointer<GstEncodingProfile> profile) {
        return this.gst_encoding_target_add_profile(Pointer.pointerTo(this, GstEncodingTarget.class), Pointer.getPeer(profile));
    }

    @Ptr
    protected native long gst_encoding_target_get_category(
        @Ptr
        long target);

    public Pointer get_category() {
        return Pointer.pointerToAddress(this.gst_encoding_target_get_category(Pointer.pointerTo(this, GstEncodingTarget.class)));
    }

    @Ptr
    protected native long gst_encoding_target_get_description(
        @Ptr
        long target);

    public Pointer get_description() {
        return Pointer.pointerToAddress(this.gst_encoding_target_get_description(Pointer.pointerTo(this, GstEncodingTarget.class)));
    }

    @Ptr
    protected native long gst_encoding_target_get_name(
        @Ptr
        long target);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.gst_encoding_target_get_name(Pointer.pointerTo(this, GstEncodingTarget.class)));
    }

    @Ptr
    protected native long gst_encoding_target_get_profile(
        @Ptr
        long target,
        @Ptr
        long name);

    public Pointer<GstEncodingProfile> get_profile(Pointer name) {
        return Pointer.pointerToAddress(this.gst_encoding_target_get_profile(Pointer.pointerTo(this, GstEncodingTarget.class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long gst_encoding_target_get_profiles(
        @Ptr
        long target);

    public Pointer<GList> get_profiles() {
        return Pointer.pointerToAddress(this.gst_encoding_target_get_profiles(Pointer.pointerTo(this, GstEncodingTarget.class)), Pointer.class);
    }

    protected native boolean gst_encoding_target_save(
        @Ptr
        long target);

    public boolean save() {
        return this.gst_encoding_target_save(Pointer.pointerTo(this, GstEncodingTarget.class));
    }

    protected native boolean gst_encoding_target_save_to_file(
        @Ptr
        long target,
        @Ptr
        long filepath);

    public boolean save_to_file(Pointer filepath) {
        return this.gst_encoding_target_save_to_file(Pointer.pointerTo(this, GstEncodingTarget.class), Pointer.getPeer(filepath));
    }

}
