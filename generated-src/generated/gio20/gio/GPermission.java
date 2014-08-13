
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GPermission
    extends GObject
{


    public GPermission() {
        super();
    }

    public GPermission(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_permission_acquire(
        @Ptr
        long permission,
        @Ptr
        long cancellable);

    public boolean acquire(Pointer<GCancellable> cancellable) {
        return this.g_permission_acquire(Pointer.pointerTo(this, GPermission.class), Pointer.getPeer(cancellable));
    }

    protected native void g_permission_acquire_async(
        @Ptr
        long permission,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void acquire_async(Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_permission_acquire_async(Pointer.pointerTo(this, GPermission.class), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_permission_acquire_finish(
        @Ptr
        long permission,
        @Ptr
        long result);

    public boolean acquire_finish(Pointer<Object> result) {
        return this.g_permission_acquire_finish(Pointer.pointerTo(this, GPermission.class), Pointer.getPeer(result));
    }

    protected native boolean g_permission_get_allowed(
        @Ptr
        long permission);

    public boolean get_allowed() {
        return this.g_permission_get_allowed(Pointer.pointerTo(this, GPermission.class));
    }

    protected native boolean g_permission_get_can_acquire(
        @Ptr
        long permission);

    public boolean get_can_acquire() {
        return this.g_permission_get_can_acquire(Pointer.pointerTo(this, GPermission.class));
    }

    protected native boolean g_permission_get_can_release(
        @Ptr
        long permission);

    public boolean get_can_release() {
        return this.g_permission_get_can_release(Pointer.pointerTo(this, GPermission.class));
    }

    protected native void g_permission_impl_update(
        @Ptr
        long permission, boolean allowed, boolean can_acquire, boolean can_release);

    public void impl_update(boolean allowed, boolean can_acquire, boolean can_release) {
        this.g_permission_impl_update(Pointer.pointerTo(this, GPermission.class), allowed, can_acquire, can_release);
    }

    protected native boolean g_permission_release(
        @Ptr
        long permission,
        @Ptr
        long cancellable);

    public boolean release(Pointer<GCancellable> cancellable) {
        return this.g_permission_release(Pointer.pointerTo(this, GPermission.class), Pointer.getPeer(cancellable));
    }

    protected native void g_permission_release_async(
        @Ptr
        long permission,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void release_async(Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_permission_release_async(Pointer.pointerTo(this, GPermission.class), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_permission_release_finish(
        @Ptr
        long permission,
        @Ptr
        long result);

    public boolean release_finish(Pointer<Object> result) {
        return this.g_permission_release_finish(Pointer.pointerTo(this, GPermission.class), Pointer.getPeer(result));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GPermission field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GPermission field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
