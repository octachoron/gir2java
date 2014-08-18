
package generated.gio20.gio;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSrvTarget
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSrvTarget() {
        super();
    }

    public GSrvTarget(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_srv_target_new(
        @Ptr
        long hostname, int port, int priority, int weight);

    public static Pointer _new(Pointer hostname, int port, int priority, int weight) {
        return Pointer.pointerToAddress(GSrvTarget.g_srv_target_new(Pointer.getPeer(hostname), port, priority, weight));
    }

    @Ptr
    protected native long g_srv_target_copy(
        @Ptr
        long target);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_srv_target_copy(Pointer.pointerTo(this, GSrvTarget.class).getPeer()));
    }

    protected native void g_srv_target_free(
        @Ptr
        long target);

    public void free() {
        this.g_srv_target_free(Pointer.pointerTo(this, GSrvTarget.class).getPeer());
    }

    @Ptr
    protected native long g_srv_target_get_hostname(
        @Ptr
        long target);

    public Pointer get_hostname() {
        return Pointer.pointerToAddress(this.g_srv_target_get_hostname(Pointer.pointerTo(this, GSrvTarget.class).getPeer()));
    }

    protected native int g_srv_target_get_port(
        @Ptr
        long target);

    public int get_port() {
        return this.g_srv_target_get_port(Pointer.pointerTo(this, GSrvTarget.class).getPeer());
    }

    protected native int g_srv_target_get_priority(
        @Ptr
        long target);

    public int get_priority() {
        return this.g_srv_target_get_priority(Pointer.pointerTo(this, GSrvTarget.class).getPeer());
    }

    protected native int g_srv_target_get_weight(
        @Ptr
        long target);

    public int get_weight() {
        return this.g_srv_target_get_weight(Pointer.pointerTo(this, GSrvTarget.class).getPeer());
    }

    @Ptr
    protected static native long g_srv_target_list_sort(
        @Ptr
        long targets);

    public static Pointer<GList> list_sort(Pointer<GList> targets) {
        return Pointer.pointerToAddress(GSrvTarget.g_srv_target_list_sort(Pointer.getPeer(targets)), GList.class);
    }

}
