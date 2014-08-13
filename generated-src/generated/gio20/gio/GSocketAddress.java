
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketAddress
    extends GObject
{


    public GSocketAddress() {
        super();
    }

    public GSocketAddress(Pointer pointer) {
        super(pointer);
    }

    protected native long g_socket_address_get_native_size(
        @Ptr
        long address);

    public long get_native_size() {
        return this.g_socket_address_get_native_size(Pointer.pointerTo(this, GSocketAddress.class));
    }

    protected native boolean g_socket_address_to_native(
        @Ptr
        long address, Pointer dest, long destlen);

    public boolean to_native(Pointer dest, long destlen) {
        return this.g_socket_address_to_native(Pointer.pointerTo(this, GSocketAddress.class), dest, destlen);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketAddress field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    protected native IntValuedEnum<GSocketFamily> g_socket_address_get_family(
        @Ptr
        long address);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_socket_address_get_family(Pointer.pointerTo(this, GSocketAddress.class));
    }

}
