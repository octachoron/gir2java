
package generated.gstreamerpbutils10.gstpbutils;

import generated.glib20.glib.GList;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstDiscovererContainerInfo
    extends StructObject
{


    public GstDiscovererContainerInfo() {
        super();
    }

    public GstDiscovererContainerInfo(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_discoverer_container_info_get_streams(
        @Ptr
        long info);

    public Pointer<GList> get_streams() {
        return Pointer.pointerToAddress(this.gst_discoverer_container_info_get_streams(Pointer.pointerTo(this, GstDiscovererContainerInfo.class)), Pointer.class);
    }

}
