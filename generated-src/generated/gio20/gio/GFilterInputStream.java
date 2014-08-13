
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFilterInputStream
    extends StructObject
{


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
        return Pointer.pointerToAddress(this.g_filter_input_stream_get_base_stream(Pointer.pointerTo(this, GFilterInputStream.class)));
    }

    protected native boolean g_filter_input_stream_get_close_base_stream(
        @Ptr
        long stream);

    public boolean get_close_base_stream() {
        return this.g_filter_input_stream_get_close_base_stream(Pointer.pointerTo(this, GFilterInputStream.class));
    }

    protected native void g_filter_input_stream_set_close_base_stream(
        @Ptr
        long stream, boolean close_base);

    public void set_close_base_stream(boolean close_base) {
        this.g_filter_input_stream_set_close_base_stream(Pointer.pointerTo(this, GFilterInputStream.class), close_base);
    }

    @Field(0)
    public GInputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFilterInputStream field_parent_instance(GInputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GInputStream> field_base_stream() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GFilterInputStream field_base_stream(Pointer<GInputStream> field_base_stream) {
        this.io.setPointerField(this, 1, field_base_stream);
        return this;
    }

}
