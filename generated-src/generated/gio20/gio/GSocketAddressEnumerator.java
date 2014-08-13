
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketAddressEnumerator
    extends GObject
{


    public GSocketAddressEnumerator() {
        super();
    }

    public GSocketAddressEnumerator(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_socket_address_enumerator_next(
        @Ptr
        long enumerator,
        @Ptr
        long cancellable);

    public Pointer<GSocketAddress> next(Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_address_enumerator_next(Pointer.pointerTo(this, GSocketAddressEnumerator.class), Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native void g_socket_address_enumerator_next_async(
        @Ptr
        long enumerator,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void next_async(Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_socket_address_enumerator_next_async(Pointer.pointerTo(this, GSocketAddressEnumerator.class), Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_socket_address_enumerator_next_finish(
        @Ptr
        long enumerator,
        @Ptr
        long result);

    public Pointer<GSocketAddress> next_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_address_enumerator_next_finish(Pointer.pointerTo(this, GSocketAddressEnumerator.class), Pointer.getPeer(result)), Pointer.class);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketAddressEnumerator field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

}
