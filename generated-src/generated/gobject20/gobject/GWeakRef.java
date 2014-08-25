
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GWeakRef
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GWeakRef() {
        super();
    }

    public GWeakRef(Pointer pointer) {
        super(pointer);
    }

    protected native void g_weak_ref_clear(
        @Ptr
        long weak_ref);

    public void clear() {
        this.g_weak_ref_clear(Pointer.pointerTo(this, GWeakRef.class).getPeer());
    }

    protected native void g_weak_ref_init(
        @Ptr
        long weak_ref,
        @Ptr
        long object);

    public void init(Pointer object) {
        this.g_weak_ref_init(Pointer.pointerTo(this, GWeakRef.class).getPeer(), Pointer.getPeer(object));
    }

    protected native void g_weak_ref_set(
        @Ptr
        long weak_ref,
        @Ptr
        long object);

    public void set(Pointer object) {
        this.g_weak_ref_set(Pointer.pointerTo(this, GWeakRef.class).getPeer(), Pointer.getPeer(object));
    }

}
