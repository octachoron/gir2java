
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTcpWrapperConnection
    extends GTcpConnection
{


    public GTcpWrapperConnection() {
        super();
    }

    public GTcpWrapperConnection(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_tcp_wrapper_connection_get_base_io_stream(
        @Ptr
        long conn);

    public Pointer<GIOStream> get_base_io_stream() {
        return Pointer.pointerToAddress(this.g_tcp_wrapper_connection_get_base_io_stream(Pointer.pointerTo(this, GTcpWrapperConnection.class)), Pointer.class);
    }

    @Field(0)
    public GTcpConnection field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTcpWrapperConnection field_parent_instance(GTcpConnection field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTcpWrapperConnection field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
