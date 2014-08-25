
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFilterOutputStream
    extends GOutputStream
{


    static {
        BridJ.register();
    }

    public GFilterOutputStream() {
        super();
    }

    public GFilterOutputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_filter_output_stream_get_base_stream(
        @Ptr
        long stream);

    public Pointer get_base_stream() {
        return Pointer.pointerToAddress(this.g_filter_output_stream_get_base_stream(Pointer.pointerTo(this, GFilterOutputStream.class).getPeer()));
    }

    protected native boolean g_filter_output_stream_get_close_base_stream(
        @Ptr
        long stream);

    public boolean get_close_base_stream() {
        return this.g_filter_output_stream_get_close_base_stream(Pointer.pointerTo(this, GFilterOutputStream.class).getPeer());
    }

    protected native void g_filter_output_stream_set_close_base_stream(
        @Ptr
        long stream, boolean close_base);

    public void set_close_base_stream(boolean close_base) {
        this.g_filter_output_stream_set_close_base_stream(Pointer.pointerTo(this, GFilterOutputStream.class).getPeer(), close_base);
    }

    @Field(0)
    public GOutputStream gfilteroutputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFilterOutputStream gfilteroutputstream_field_parent_instance(GOutputStream gfilteroutputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gfilteroutputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GOutputStream> gfilteroutputstream_field_base_stream() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GFilterOutputStream gfilteroutputstream_field_base_stream(Pointer<GOutputStream> gfilteroutputstream_field_base_stream) {
        this.io.setPointerField(this, 1, gfilteroutputstream_field_base_stream);
        return this;
    }

}
