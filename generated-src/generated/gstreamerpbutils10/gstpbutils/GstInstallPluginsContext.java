
package generated.gstreamerpbutils10.gstpbutils;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstInstallPluginsContext
    extends StructObject
{


    public GstInstallPluginsContext() {
        super();
    }

    public GstInstallPluginsContext(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_install_plugins_context_free(
        @Ptr
        long ctx);

    public void free() {
        this.gst_install_plugins_context_free(Pointer.pointerTo(this, GstInstallPluginsContext.class));
    }

    protected native void gst_install_plugins_context_set_xid(
        @Ptr
        long ctx, long xid);

    public void set_xid(long xid) {
        this.gst_install_plugins_context_set_xid(Pointer.pointerTo(this, GstInstallPluginsContext.class), xid);
    }

}
