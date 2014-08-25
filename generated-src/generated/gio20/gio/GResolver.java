
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GResolver
    extends GObject
{


    static {
        BridJ.register();
    }

    public GResolver() {
        super();
    }

    public GResolver(Pointer pointer) {
        super(pointer);
    }

    protected static native void g_resolver_free_addresses(
        @Ptr
        long addresses);

    public static void free_addresses(Pointer<GList> addresses) {
        GResolver.g_resolver_free_addresses(Pointer.getPeer(addresses));
    }

    protected static native void g_resolver_free_targets(
        @Ptr
        long targets);

    public static void free_targets(Pointer<GList> targets) {
        GResolver.g_resolver_free_targets(Pointer.getPeer(targets));
    }

    @Ptr
    protected static native long g_resolver_get_default();

    public static Pointer get_default() {
        return Pointer.pointerToAddress(GResolver.g_resolver_get_default());
    }

    @Ptr
    protected native long g_resolver_lookup_by_address(
        @Ptr
        long resolver,
        @Ptr
        long address,
        @Ptr
        long cancellable);

    public Pointer lookup_by_address(Pointer<GInetAddress> address, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_by_address(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(address), Pointer.getPeer(cancellable)));
    }

    protected native void g_resolver_lookup_by_address_async(
        @Ptr
        long resolver,
        @Ptr
        long address,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void lookup_by_address_async(Pointer<GInetAddress> address, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_resolver_lookup_by_address_async(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(address), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_resolver_lookup_by_address_finish(
        @Ptr
        long resolver,
        @Ptr
        long result);

    public Pointer lookup_by_address_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_by_address_finish(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(result)));
    }

    @Ptr
    protected native long g_resolver_lookup_by_name(
        @Ptr
        long resolver,
        @Ptr
        long hostname,
        @Ptr
        long cancellable);

    public Pointer<GList> lookup_by_name(Pointer hostname, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_by_name(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(hostname), Pointer.getPeer(cancellable)), GList.class);
    }

    protected native void g_resolver_lookup_by_name_async(
        @Ptr
        long resolver,
        @Ptr
        long hostname,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void lookup_by_name_async(Pointer hostname, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_resolver_lookup_by_name_async(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(hostname), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_resolver_lookup_by_name_finish(
        @Ptr
        long resolver,
        @Ptr
        long result);

    public Pointer<GList> lookup_by_name_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_by_name_finish(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(result)), GList.class);
    }

    @Ptr
    protected native long g_resolver_lookup_records_finish(
        @Ptr
        long resolver,
        @Ptr
        long result);

    public Pointer<GList> lookup_records_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_records_finish(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(result)), GList.class);
    }

    @Ptr
    protected native long g_resolver_lookup_service(
        @Ptr
        long resolver,
        @Ptr
        long service,
        @Ptr
        long protocol,
        @Ptr
        long domain,
        @Ptr
        long cancellable);

    public Pointer<GList> lookup_service(Pointer service, Pointer protocol, Pointer domain, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_service(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(service), Pointer.getPeer(protocol), Pointer.getPeer(domain), Pointer.getPeer(cancellable)), GList.class);
    }

    protected native void g_resolver_lookup_service_async(
        @Ptr
        long resolver,
        @Ptr
        long service,
        @Ptr
        long protocol,
        @Ptr
        long domain,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void lookup_service_async(Pointer service, Pointer protocol, Pointer domain, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_resolver_lookup_service_async(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(service), Pointer.getPeer(protocol), Pointer.getPeer(domain), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_resolver_lookup_service_finish(
        @Ptr
        long resolver,
        @Ptr
        long result);

    public Pointer<GList> lookup_service_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_service_finish(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(result)), GList.class);
    }

    protected native void g_resolver_set_default(
        @Ptr
        long resolver);

    public void set_default() {
        this.g_resolver_set_default(Pointer.pointerTo(this, GResolver.class).getPeer());
    }

    @Field(0)
    public GObject gresolver_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GResolver gresolver_field_parent_instance(GObject gresolver_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gresolver_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gresolver_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GResolver gresolver_field_priv(Pointer gresolver_field_priv) {
        this.io.setPointerField(this, 1, gresolver_field_priv);
        return this;
    }

    @Ptr
    protected native long g_resolver_lookup_records(
        @Ptr
        long resolver,
        @Ptr
        long rrname, IntValuedEnum<GResolverRecordType> record_type,
        @Ptr
        long cancellable);

    public Pointer<GList> lookup_records(Pointer rrname, IntValuedEnum<GResolverRecordType> record_type, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_resolver_lookup_records(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(rrname), record_type, Pointer.getPeer(cancellable)), GList.class);
    }

    protected native void g_resolver_lookup_records_async(
        @Ptr
        long resolver,
        @Ptr
        long rrname, IntValuedEnum<GResolverRecordType> record_type,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void lookup_records_async(Pointer rrname, IntValuedEnum<GResolverRecordType> record_type, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_resolver_lookup_records_async(Pointer.pointerTo(this, GResolver.class).getPeer(), Pointer.getPeer(rrname), record_type, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

}
