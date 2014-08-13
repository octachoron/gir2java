
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixInputStream
    extends GInputStream
{


    public GUnixInputStream() {
        super();
    }

    public GUnixInputStream(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_unix_input_stream_get_close_fd(
        @Ptr
        long stream);

    public boolean get_close_fd() {
        return this.g_unix_input_stream_get_close_fd(Pointer.pointerTo(this, GUnixInputStream.class));
    }

    protected native int g_unix_input_stream_get_fd(
        @Ptr
        long stream);

    public int get_fd() {
        return this.g_unix_input_stream_get_fd(Pointer.pointerTo(this, GUnixInputStream.class));
    }

    protected native void g_unix_input_stream_set_close_fd(
        @Ptr
        long stream, boolean close_fd);

    public void set_close_fd(boolean close_fd) {
        this.g_unix_input_stream_set_close_fd(Pointer.pointerTo(this, GUnixInputStream.class), close_fd);
    }

    @Field(0)
    public GInputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixInputStream field_parent_instance(GInputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixInputStream field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
