
package generated.gstreamerpbutils10.gstpbutils;

import generated.glib20.glib.GList;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstEncodingContainerProfile
    extends StructObject
{


    public GstEncodingContainerProfile() {
        super();
    }

    public GstEncodingContainerProfile(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_encoding_container_profile_add_profile(
        @Ptr
        long container,
        @Ptr
        long profile);

    public boolean add_profile(Pointer profile) {
        return this.gst_encoding_container_profile_add_profile(Pointer.pointerTo(this, GstEncodingContainerProfile.class), Pointer.getPeer(profile));
    }

    protected native boolean gst_encoding_container_profile_contains_profile(
        @Ptr
        long container,
        @Ptr
        long profile);

    public boolean contains_profile(Pointer profile) {
        return this.gst_encoding_container_profile_contains_profile(Pointer.pointerTo(this, GstEncodingContainerProfile.class), Pointer.getPeer(profile));
    }

    @Ptr
    protected native long gst_encoding_container_profile_get_profiles(
        @Ptr
        long profile);

    public Pointer<GList> get_profiles() {
        return Pointer.pointerToAddress(this.gst_encoding_container_profile_get_profiles(Pointer.pointerTo(this, GstEncodingContainerProfile.class)), Pointer.class);
    }

}
