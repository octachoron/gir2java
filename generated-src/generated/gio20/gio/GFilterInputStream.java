
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFilterInputStream
    extends GInputStream
{


    static {
        BridJ.register();
    }

    public GFilterInputStream() {
        super();
    }

    public GFilterInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_filter_input_stream_get_base_stream(
        @Ptr
        long stream);

    public Pointer get_base_stream() {
        return Pointer.pointerToAddress(this.g_filter_input_stream_get_base_stream(Pointer.pointerTo(this, GFilterInputStream.class).getPeer()));
    }

    protected native boolean g_filter_input_stream_get_close_base_stream(
        @Ptr
        long stream);

    public boolean get_close_base_stream() {
        return this.g_filter_input_stream_get_close_base_stream(Pointer.pointerTo(this, GFilterInputStream.class).getPeer());
    }

    protected native void g_filter_input_stream_set_close_base_stream(
        @Ptr
        long stream, boolean close_base);

    public void set_close_base_stream(boolean close_base) {
        this.g_filter_input_stream_set_close_base_stream(Pointer.pointerTo(this, GFilterInputStream.class).getPeer(), close_base);
    }

    @Field(0)
    public Pointer<GInputStream> gfilterinputstream_field_base_stream() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GFilterInputStream gfilterinputstream_field_base_stream(Pointer<GInputStream> gfilterinputstream_field_base_stream) {
        this.io.setPointerField(this, 0, gfilterinputstream_field_base_stream);
        return this;
    }

    @Field(1)
    public GInputStream gfilterinputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GFilterInputStream gfilterinputstream_field_parent_instance(GInputStream gfilterinputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, gfilterinputstream_field_parent_instance);
        return this;
    }

}
