
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketService
    extends GSocketListener
{


    public GSocketService() {
        super();
    }

    public GSocketService(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_socket_service_is_active(
        @Ptr
        long service);

    public boolean is_active() {
        return this.g_socket_service_is_active(Pointer.pointerTo(this, GSocketService.class));
    }

    protected native void g_socket_service_start(
        @Ptr
        long service);

    public void start() {
        this.g_socket_service_start(Pointer.pointerTo(this, GSocketService.class));
    }

    protected native void g_socket_service_stop(
        @Ptr
        long service);

    public void stop() {
        this.g_socket_service_stop(Pointer.pointerTo(this, GSocketService.class));
    }

    @Field(0)
    public GSocketListener field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketService field_parent_instance(GSocketListener field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketService field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
