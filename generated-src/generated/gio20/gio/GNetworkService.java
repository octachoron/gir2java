
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GNetworkService
    extends GObject
{


    static {
        BridJ.register();
    }

    public GNetworkService() {
        super();
    }

    public GNetworkService(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_network_service_new(
        @Ptr
        long service,
        @Ptr
        long protocol,
        @Ptr
        long domain);

    public static Pointer gnetworkservice__new(Pointer service, Pointer protocol, Pointer domain) {
        return Pointer.pointerToAddress(GNetworkService.g_network_service_new(Pointer.getPeer(service), Pointer.getPeer(protocol), Pointer.getPeer(domain)));
    }

    @Ptr
    protected native long g_network_service_get_domain(
        @Ptr
        long srv);

    public Pointer get_domain() {
        return Pointer.pointerToAddress(this.g_network_service_get_domain(Pointer.pointerTo(this, GNetworkService.class).getPeer()));
    }

    @Ptr
    protected native long g_network_service_get_protocol(
        @Ptr
        long srv);

    public Pointer get_protocol() {
        return Pointer.pointerToAddress(this.g_network_service_get_protocol(Pointer.pointerTo(this, GNetworkService.class).getPeer()));
    }

    @Ptr
    protected native long g_network_service_get_scheme(
        @Ptr
        long srv);

    public Pointer get_scheme() {
        return Pointer.pointerToAddress(this.g_network_service_get_scheme(Pointer.pointerTo(this, GNetworkService.class).getPeer()));
    }

    @Ptr
    protected native long g_network_service_get_service(
        @Ptr
        long srv);

    public Pointer get_service() {
        return Pointer.pointerToAddress(this.g_network_service_get_service(Pointer.pointerTo(this, GNetworkService.class).getPeer()));
    }

    protected native void g_network_service_set_scheme(
        @Ptr
        long srv,
        @Ptr
        long scheme);

    public void set_scheme(Pointer scheme) {
        this.g_network_service_set_scheme(Pointer.pointerTo(this, GNetworkService.class).getPeer(), Pointer.getPeer(scheme));
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
    private Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GNetworkService field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
