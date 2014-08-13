
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixOutputStream
    extends GOutputStream
{


    public GUnixOutputStream() {
        super();
    }

    public GUnixOutputStream(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_unix_output_stream_get_close_fd(
        @Ptr
        long stream);

    public boolean get_close_fd() {
        return this.g_unix_output_stream_get_close_fd(Pointer.pointerTo(this, GUnixOutputStream.class));
    }

    protected native int g_unix_output_stream_get_fd(
        @Ptr
        long stream);

    public int get_fd() {
        return this.g_unix_output_stream_get_fd(Pointer.pointerTo(this, GUnixOutputStream.class));
    }

    protected native void g_unix_output_stream_set_close_fd(
        @Ptr
        long stream, boolean close_fd);

    public void set_close_fd(boolean close_fd) {
        this.g_unix_output_stream_set_close_fd(Pointer.pointerTo(this, GUnixOutputStream.class), close_fd);
    }

    @Field(0)
    public GOutputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixOutputStream field_parent_instance(GOutputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixOutputStream field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
