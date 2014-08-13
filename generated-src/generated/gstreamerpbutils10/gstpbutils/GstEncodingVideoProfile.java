
package generated.gstreamerpbutils10.gstpbutils;

import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstEncodingVideoProfile
    extends GstEncodingProfile
{


    public GstEncodingVideoProfile() {
        super();
    }

    public GstEncodingVideoProfile(Pointer pointer) {
        super(pointer);
    }

    protected native long gst_encoding_video_profile_get_pass(
        @Ptr
        long prof);

    public long get_pass() {
        return this.gst_encoding_video_profile_get_pass(Pointer.pointerTo(this, GstEncodingVideoProfile.class));
    }

    protected native boolean gst_encoding_video_profile_get_variableframerate(
        @Ptr
        long prof);

    public boolean get_variableframerate() {
        return this.gst_encoding_video_profile_get_variableframerate(Pointer.pointerTo(this, GstEncodingVideoProfile.class));
    }

    protected native void gst_encoding_video_profile_set_pass(
        @Ptr
        long prof, long pass);

    public void set_pass(long pass) {
        this.gst_encoding_video_profile_set_pass(Pointer.pointerTo(this, GstEncodingVideoProfile.class), pass);
    }

    protected native void gst_encoding_video_profile_set_variableframerate(
        @Ptr
        long prof, boolean variableframerate);

    public void set_variableframerate(boolean variableframerate) {
        this.gst_encoding_video_profile_set_variableframerate(Pointer.pointerTo(this, GstEncodingVideoProfile.class), variableframerate);
    }

}
