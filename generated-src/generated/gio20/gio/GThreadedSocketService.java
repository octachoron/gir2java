
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GThreadedSocketService
    extends GSocketService
{


    static {
        BridJ.register();
    }

    public GThreadedSocketService() {
        super();
    }

    public GThreadedSocketService(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_threaded_socket_service_new(int max_threads);

    public static Pointer<GSocketService> gthreadedsocketservice__new(int max_threads) {
        return Pointer.pointerToAddress(GThreadedSocketService.g_threaded_socket_service_new(max_threads), GSocketService.class);
    }

    @Field(0)
    public GSocketService gthreadedsocketservice_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GThreadedSocketService gthreadedsocketservice_field_parent_instance(GSocketService gthreadedsocketservice_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gthreadedsocketservice_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gthreadedsocketservice_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GThreadedSocketService gthreadedsocketservice_field_priv(Pointer gthreadedsocketservice_field_priv) {
        this.io.setPointerField(this, 1, gthreadedsocketservice_field_priv);
        return this;
    }

}
