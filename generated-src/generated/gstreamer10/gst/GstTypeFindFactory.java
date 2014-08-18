
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTypeFindFactory
    extends GstPluginFeature
{


    static {
        BridJ.register();
    }

    public GstTypeFindFactory() {
        super();
    }

    public GstTypeFindFactory(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_type_find_factory_get_list();

    public static Pointer<GList> get_list() {
        return Pointer.pointerToAddress(GstTypeFindFactory.gst_type_find_factory_get_list(), GList.class);
    }

    protected native void gst_type_find_factory_call_function(
        @Ptr
        long factory,
        @Ptr
        long find);

    public void call_function(Pointer<GstTypeFind> find) {
        this.gst_type_find_factory_call_function(Pointer.pointerTo(this, GstTypeFindFactory.class).getPeer(), Pointer.getPeer(find));
    }

    @Ptr
    protected native long gst_type_find_factory_get_caps(
        @Ptr
        long factory);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_type_find_factory_get_caps(Pointer.pointerTo(this, GstTypeFindFactory.class).getPeer()), GstCaps.class);
    }

    @Ptr
    protected native long gst_type_find_factory_get_extensions(
        @Ptr
        long factory);

    public Pointer get_extensions() {
        return Pointer.pointerToAddress(this.gst_type_find_factory_get_extensions(Pointer.pointerTo(this, GstTypeFindFactory.class).getPeer()));
    }

    protected native boolean gst_type_find_factory_has_function(
        @Ptr
        long factory);

    public boolean has_function() {
        return this.gst_type_find_factory_has_function(Pointer.pointerTo(this, GstTypeFindFactory.class).getPeer());
    }

}
