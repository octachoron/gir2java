
package generated.gstreamerpbutils10.gstpbutils;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-pbutils-1.0")
public class GstDiscoverer
    extends GObject
{


    public GstDiscoverer() {
        super();
    }

    public GstDiscoverer(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_discoverer_discover_uri(
        @Ptr
        long discoverer,
        @Ptr
        long uri);

    public Pointer discover_uri(Pointer uri) {
        return Pointer.pointerToAddress(this.gst_discoverer_discover_uri(Pointer.pointerTo(this, GstDiscoverer.class), Pointer.getPeer(uri)));
    }

    protected native boolean gst_discoverer_discover_uri_async(
        @Ptr
        long discoverer,
        @Ptr
        long uri);

    public boolean discover_uri_async(Pointer uri) {
        return this.gst_discoverer_discover_uri_async(Pointer.pointerTo(this, GstDiscoverer.class), Pointer.getPeer(uri));
    }

    protected native void gst_discoverer_start(
        @Ptr
        long discoverer);

    public void start() {
        this.gst_discoverer_start(Pointer.pointerTo(this, GstDiscoverer.class));
    }

    protected native void gst_discoverer_stop(
        @Ptr
        long discoverer);

    public void stop() {
        this.gst_discoverer_stop(Pointer.pointerTo(this, GstDiscoverer.class));
    }

    @Field(0)
    public GObject field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstDiscoverer field_parent(GObject field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstDiscoverer field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Field(2)
    public Pointer field__reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstDiscoverer field__reserved(Pointer field__reserved) {
        this.io.setPointerField(this, 2, field__reserved);
        return this;
    }

}
