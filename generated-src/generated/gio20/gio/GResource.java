
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GResource
    extends StructObject
{


    public GResource() {
        super();
    }

    public GResource(Pointer pointer) {
        super(pointer);
    }

    protected native void g_resources_register(
        @Ptr
        long resource);

    public void _register() {
        this.g_resources_register(Pointer.pointerTo(this, GResource.class));
    }

    protected native void g_resources_unregister(
        @Ptr
        long resource);

    public void _unregister() {
        this.g_resources_unregister(Pointer.pointerTo(this, GResource.class));
    }

    @Ptr
    protected native long g_resource_ref(
        @Ptr
        long resource);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_resource_ref(Pointer.pointerTo(this, GResource.class)));
    }

    protected native void g_resource_unref(
        @Ptr
        long resource);

    public void unref() {
        this.g_resource_unref(Pointer.pointerTo(this, GResource.class));
    }

    @Ptr
    protected native long g_resource_load(
        @Ptr
        long filename);

    public Pointer load(Pointer filename) {
        return Pointer.pointerToAddress(this.g_resource_load(Pointer.getPeer(filename)));
    }

    @Ptr
    protected native long g_resource_open_stream(
        @Ptr
        long resource,
        @Ptr
        long path, Object lookup_flags);

    public Pointer<GInputStream> open_stream(Pointer path, Object lookup_flags) {
        return Pointer.pointerToAddress(this.g_resource_open_stream(Pointer.pointerTo(this, GResource.class), Pointer.getPeer(path), lookup_flags), Pointer.class);
    }

    @Ptr
    protected native long g_resource_lookup_data(
        @Ptr
        long resource,
        @Ptr
        long path, Object lookup_flags);

    public Pointer<GBytes> lookup_data(Pointer path, Object lookup_flags) {
        return Pointer.pointerToAddress(this.g_resource_lookup_data(Pointer.pointerTo(this, GResource.class), Pointer.getPeer(path), lookup_flags), Pointer.class);
    }

    @Ptr
    protected native long g_resource_enumerate_children(
        @Ptr
        long resource,
        @Ptr
        long path, Object lookup_flags);

    public Pointer enumerate_children(Pointer path, Object lookup_flags) {
        return Pointer.pointerToAddress(this.g_resource_enumerate_children(Pointer.pointerTo(this, GResource.class), Pointer.getPeer(path), lookup_flags));
    }

    protected native boolean g_resource_get_info(
        @Ptr
        long resource,
        @Ptr
        long path, Object lookup_flags,
        @Ptr
        long size,
        @Ptr
        long flags);

    public boolean get_info(Pointer path, Object lookup_flags, Pointer<Long> size, Pointer<Long> flags) {
        return this.g_resource_get_info(Pointer.pointerTo(this, GResource.class), Pointer.getPeer(path), lookup_flags, Pointer.getPeer(size), Pointer.getPeer(flags));
    }

}
