
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimpleProxyResolver
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSimpleProxyResolver() {
        super();
    }

    public GSimpleProxyResolver(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_simple_proxy_resolver_new(
        @Ptr
        long default_proxy,
        @Ptr
        long ignore_hosts);

    public static Pointer<Object> gsimpleproxyresolver__new(Pointer default_proxy, Pointer ignore_hosts) {
        return Pointer.pointerToAddress(GSimpleProxyResolver.g_simple_proxy_resolver_new(Pointer.getPeer(default_proxy), Pointer.getPeer(ignore_hosts)), Object.class);
    }

    protected native void g_simple_proxy_resolver_set_default_proxy(
        @Ptr
        long resolver,
        @Ptr
        long default_proxy);

    public void set_default_proxy(Pointer default_proxy) {
        this.g_simple_proxy_resolver_set_default_proxy(Pointer.pointerTo(this, GSimpleProxyResolver.class).getPeer(), Pointer.getPeer(default_proxy));
    }

    protected native void g_simple_proxy_resolver_set_ignore_hosts(
        @Ptr
        long resolver,
        @Ptr
        long ignore_hosts);

    public void set_ignore_hosts(Pointer ignore_hosts) {
        this.g_simple_proxy_resolver_set_ignore_hosts(Pointer.pointerTo(this, GSimpleProxyResolver.class).getPeer(), Pointer.getPeer(ignore_hosts));
    }

    protected native void g_simple_proxy_resolver_set_uri_proxy(
        @Ptr
        long resolver,
        @Ptr
        long uri_scheme,
        @Ptr
        long proxy);

    public void set_uri_proxy(Pointer uri_scheme, Pointer proxy) {
        this.g_simple_proxy_resolver_set_uri_proxy(Pointer.pointerTo(this, GSimpleProxyResolver.class).getPeer(), Pointer.getPeer(uri_scheme), Pointer.getPeer(proxy));
    }

    @Field(0)
    public GObject gsimpleproxyresolver_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSimpleProxyResolver gsimpleproxyresolver_field_parent_instance(GObject gsimpleproxyresolver_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gsimpleproxyresolver_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gsimpleproxyresolver_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GSimpleProxyResolver gsimpleproxyresolver_field_priv(Pointer gsimpleproxyresolver_field_priv) {
        this.io.setPointerField(this, 1, gsimpleproxyresolver_field_priv);
        return this;
    }

}
