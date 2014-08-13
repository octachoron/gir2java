
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GBinding
    extends StructObject
{


    public GBinding() {
        super();
    }

    public GBinding(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_binding_get_source(
        @Ptr
        long binding);

    public Pointer get_source() {
        return Pointer.pointerToAddress(this.g_binding_get_source(Pointer.pointerTo(this, GBinding.class)));
    }

    @Ptr
    protected native long g_binding_get_source_property(
        @Ptr
        long binding);

    public Pointer get_source_property() {
        return Pointer.pointerToAddress(this.g_binding_get_source_property(Pointer.pointerTo(this, GBinding.class)));
    }

    @Ptr
    protected native long g_binding_get_target(
        @Ptr
        long binding);

    public Pointer get_target() {
        return Pointer.pointerToAddress(this.g_binding_get_target(Pointer.pointerTo(this, GBinding.class)));
    }

    @Ptr
    protected native long g_binding_get_target_property(
        @Ptr
        long binding);

    public Pointer get_target_property() {
        return Pointer.pointerToAddress(this.g_binding_get_target_property(Pointer.pointerTo(this, GBinding.class)));
    }

    protected native void g_binding_unbind(
        @Ptr
        long binding);

    public void unbind() {
        this.g_binding_unbind(Pointer.pointerTo(this, GBinding.class));
    }

    protected native Object g_binding_get_flags(
        @Ptr
        long binding);

    public Object get_flags() {
        return this.g_binding_get_flags(Pointer.pointerTo(this, GBinding.class));
    }

}
