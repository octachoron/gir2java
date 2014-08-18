
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketService
    extends GSocketListener
{


    static {
        BridJ.register();
    }

    public GSocketService() {
        super();
    }

    public GSocketService(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_socket_service_new();

    public static Pointer gsocketservice__new() {
        return Pointer.pointerToAddress(GSocketService.g_socket_service_new());
    }

    protected native boolean g_socket_service_is_active(
        @Ptr
        long service);

    public boolean is_active() {
        return this.g_socket_service_is_active(Pointer.pointerTo(this, GSocketService.class).getPeer());
    }

    protected native void g_socket_service_start(
        @Ptr
        long service);

    public void start() {
        this.g_socket_service_start(Pointer.pointerTo(this, GSocketService.class).getPeer());
    }

    protected native void g_socket_service_stop(
        @Ptr
        long service);

    public void stop() {
        this.g_socket_service_stop(Pointer.pointerTo(this, GSocketService.class).getPeer());
    }

    @Field(0)
    public GSocketListener gsocketservice_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketService gsocketservice_field_parent_instance(GSocketListener gsocketservice_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gsocketservice_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gsocketservice_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketService gsocketservice_field_priv(Pointer gsocketservice_field_priv) {
        this.io.setPointerField(this, 1, gsocketservice_field_priv);
        return this;
    }

}
