
package generated.gobject20.gobject;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.util.DefaultParameterizedType;

@Library("gobject-2.0")
public class GParamSpecPool
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GParamSpecPool() {
        super();
    }

    public GParamSpecPool(Pointer pointer) {
        super(pointer);
    }

    protected native void g_param_spec_pool_remove(
        @Ptr
        long pool,
        @Ptr
        long pspec);

    public void remove(Pointer<GParamSpec> pspec) {
        this.g_param_spec_pool_remove(Pointer.pointerTo(this, GParamSpecPool.class).getPeer(), Pointer.getPeer(pspec));
    }

    @Ptr
    protected native long g_param_spec_pool_list_owned(
        @Ptr
        long pool, long owner_type);

    public Pointer<GList> list_owned(long owner_type) {
        return Pointer.pointerToAddress(this.g_param_spec_pool_list_owned(Pointer.pointerTo(this, GParamSpecPool.class).getPeer(), owner_type), GList.class);
    }

    @Ptr
    protected native long g_param_spec_pool_list(
        @Ptr
        long pool, long owner_type,
        @Ptr
        long n_pspecs_p);

    public Pointer<Pointer<GParamSpec>> list(long owner_type, Pointer<Long> n_pspecs_p) {
        return Pointer.pointerToAddress(this.g_param_spec_pool_list(Pointer.pointerTo(this, GParamSpecPool.class).getPeer(), owner_type, Pointer.getPeer(n_pspecs_p)), DefaultParameterizedType.paramType(Pointer.class, GParamSpec.class));
    }

    @Ptr
    protected static native long g_param_spec_pool_new(boolean type_prefixing);

    public static Pointer<GParamSpecPool> _new(boolean type_prefixing) {
        return Pointer.pointerToAddress(GParamSpecPool.g_param_spec_pool_new(type_prefixing), GParamSpecPool.class);
    }

    @Ptr
    protected native long g_param_spec_pool_lookup(
        @Ptr
        long pool,
        @Ptr
        long param_name, long owner_type, boolean walk_ancestors);

    public Pointer<GParamSpec> lookup(Pointer param_name, long owner_type, boolean walk_ancestors) {
        return Pointer.pointerToAddress(this.g_param_spec_pool_lookup(Pointer.pointerTo(this, GParamSpecPool.class).getPeer(), Pointer.getPeer(param_name), owner_type, walk_ancestors), GParamSpec.class);
    }

    protected native void g_param_spec_pool_insert(
        @Ptr
        long pool,
        @Ptr
        long pspec, long owner_type);

    public void insert(Pointer<GParamSpec> pspec, long owner_type) {
        this.g_param_spec_pool_insert(Pointer.pointerTo(this, GParamSpecPool.class).getPeer(), Pointer.getPeer(pspec), owner_type);
    }

}
