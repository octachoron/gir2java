
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixOutputStream
    extends GOutputStream
{


    static {
        BridJ.register();
    }

    public GUnixOutputStream() {
        super();
    }

    public GUnixOutputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_unix_output_stream_new(int fd, boolean close_fd);

    public static Pointer<GOutputStream> gunixoutputstream__new(int fd, boolean close_fd) {
        return Pointer.pointerToAddress(GUnixOutputStream.g_unix_output_stream_new(fd, close_fd), GOutputStream.class);
    }

    protected native boolean g_unix_output_stream_get_close_fd(
        @Ptr
        long stream);

    public boolean get_close_fd() {
        return this.g_unix_output_stream_get_close_fd(Pointer.pointerTo(this, GUnixOutputStream.class).getPeer());
    }

    protected native int g_unix_output_stream_get_fd(
        @Ptr
        long stream);

    public int get_fd() {
        return this.g_unix_output_stream_get_fd(Pointer.pointerTo(this, GUnixOutputStream.class).getPeer());
    }

    protected native void g_unix_output_stream_set_close_fd(
        @Ptr
        long stream, boolean close_fd);

    public void set_close_fd(boolean close_fd) {
        this.g_unix_output_stream_set_close_fd(Pointer.pointerTo(this, GUnixOutputStream.class).getPeer(), close_fd);
    }

    @Field(0)
    public GOutputStream gunixoutputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixOutputStream gunixoutputstream_field_parent_instance(GOutputStream gunixoutputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gunixoutputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gunixoutputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GUnixOutputStream gunixoutputstream_field_priv(Pointer gunixoutputstream_field_priv) {
        this.io.setPointerField(this, 1, gunixoutputstream_field_priv);
        return this;
    }

}
