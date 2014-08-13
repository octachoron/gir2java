
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GNetworkAddress
    extends GObject
{


    public GNetworkAddress() {
        super();
    }

    public GNetworkAddress(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_network_address_parse(
        @Ptr
        long host_and_port, int default_port);

    public Pointer parse(Pointer host_and_port, int default_port) {
        return Pointer.pointerToAddress(this.g_network_address_parse(Pointer.getPeer(host_and_port), default_port));
    }

    @Ptr
    protected native long g_network_address_parse_uri(
        @Ptr
        long uri, int default_port);

    public Pointer parse_uri(Pointer uri, int default_port) {
        return Pointer.pointerToAddress(this.g_network_address_parse_uri(Pointer.getPeer(uri), default_port));
    }

    @Ptr
    protected native long g_network_address_get_hostname(
        @Ptr
        long addr);

    public Pointer get_hostname() {
        return Pointer.pointerToAddress(this.g_network_address_get_hostname(Pointer.pointerTo(this, GNetworkAddress.class)));
    }

    protected native int g_network_address_get_port(
        @Ptr
        long addr);

    public int get_port() {
        return this.g_network_address_get_port(Pointer.pointerTo(this, GNetworkAddress.class));
    }

    @Ptr
    protected native long g_network_address_get_scheme(
        @Ptr
        long addr);

    public Pointer get_scheme() {
        return Pointer.pointerToAddress(this.g_network_address_get_scheme(Pointer.pointerTo(this, GNetworkAddress.class)));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNetworkAddress field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GNetworkAddress field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
