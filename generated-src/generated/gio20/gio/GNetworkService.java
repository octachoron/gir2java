
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GNetworkService
    extends GObject
{


    public GNetworkService() {
        super();
    }

    public GNetworkService(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_network_service_get_domain(
        @Ptr
        long srv);

    public Pointer get_domain() {
        return Pointer.pointerToAddress(this.g_network_service_get_domain(Pointer.pointerTo(this, GNetworkService.class)));
    }

    @Ptr
    protected native long g_network_service_get_protocol(
        @Ptr
        long srv);

    public Pointer get_protocol() {
        return Pointer.pointerToAddress(this.g_network_service_get_protocol(Pointer.pointerTo(this, GNetworkService.class)));
    }

    @Ptr
    protected native long g_network_service_get_scheme(
        @Ptr
        long srv);

    public Pointer get_scheme() {
        return Pointer.pointerToAddress(this.g_network_service_get_scheme(Pointer.pointerTo(this, GNetworkService.class)));
    }

    @Ptr
    protected native long g_network_service_get_service(
        @Ptr
        long srv);

    public Pointer get_service() {
        return Pointer.pointerToAddress(this.g_network_service_get_service(Pointer.pointerTo(this, GNetworkService.class)));
    }

    protected native void g_network_service_set_scheme(
        @Ptr
        long srv,
        @Ptr
        long scheme);

    public void set_scheme(Pointer scheme) {
        this.g_network_service_set_scheme(Pointer.pointerTo(this, GNetworkService.class), Pointer.getPeer(scheme));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNetworkService field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GNetworkService field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
