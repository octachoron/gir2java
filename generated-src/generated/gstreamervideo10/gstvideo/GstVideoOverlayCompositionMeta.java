
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoOverlayCompositionMeta
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoOverlayCompositionMeta() {
        super();
    }

    public GstVideoOverlayCompositionMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoOverlayCompositionMeta field_meta(GstMeta field_meta) {
        this.io.setNativeObjectField(this, 0, field_meta);
        return this;
    }

    @Field(1)
    public Pointer<GstVideoOverlayComposition> field_overlay() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoOverlayCompositionMeta field_overlay(Pointer<GstVideoOverlayComposition> field_overlay) {
        this.io.setPointerField(this, 1, field_overlay);
        return this;
    }

    @Ptr
    protected static native long gst_video_overlay_composition_meta_get_info();

    public static Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(GstVideoOverlayCompositionMeta.gst_video_overlay_composition_meta_get_info(), GstMetaInfo.class);
    }

}
