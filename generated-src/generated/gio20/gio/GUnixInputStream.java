
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixInputStream
    extends GInputStream
{


    static {
        BridJ.register();
    }

    public GUnixInputStream() {
        super();
    }

    public GUnixInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_unix_input_stream_new(int fd, boolean close_fd);

    public static Pointer<GInputStream> gunixinputstream__new(int fd, boolean close_fd) {
        return Pointer.pointerToAddress(GUnixInputStream.g_unix_input_stream_new(fd, close_fd), GInputStream.class);
    }

    protected native boolean g_unix_input_stream_get_close_fd(
        @Ptr
        long stream);

    public boolean get_close_fd() {
        return this.g_unix_input_stream_get_close_fd(Pointer.pointerTo(this, GUnixInputStream.class).getPeer());
    }

    protected native int g_unix_input_stream_get_fd(
        @Ptr
        long stream);

    public int get_fd() {
        return this.g_unix_input_stream_get_fd(Pointer.pointerTo(this, GUnixInputStream.class).getPeer());
    }

    protected native void g_unix_input_stream_set_close_fd(
        @Ptr
        long stream, boolean close_fd);

    public void set_close_fd(boolean close_fd) {
        this.g_unix_input_stream_set_close_fd(Pointer.pointerTo(this, GUnixInputStream.class).getPeer(), close_fd);
    }

    @Field(0)
    public GInputStream gunixinputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixInputStream gunixinputstream_field_parent_instance(GInputStream gunixinputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gunixinputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gunixinputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GUnixInputStream gunixinputstream_field_priv(Pointer gunixinputstream_field_priv) {
        this.io.setPointerField(this, 1, gunixinputstream_field_priv);
        return this;
    }

}
