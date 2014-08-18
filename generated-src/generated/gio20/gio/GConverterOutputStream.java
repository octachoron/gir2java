
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GConverterOutputStream
    extends GFilterOutputStream
{


    static {
        BridJ.register();
    }

    public GConverterOutputStream() {
        super();
    }

    public GConverterOutputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_converter_output_stream_new(
        @Ptr
        long base_stream,
        @Ptr
        long converter);

    public static Pointer<GOutputStream> gconverteroutputstream__new(Pointer<GOutputStream> base_stream, Pointer<Object> converter) {
        return Pointer.pointerToAddress(GConverterOutputStream.g_converter_output_stream_new(Pointer.getPeer(base_stream), Pointer.getPeer(converter)), GOutputStream.class);
    }

    @Ptr
    protected native long g_converter_output_stream_get_converter(
        @Ptr
        long converter_stream);

    public Pointer<Object> get_converter() {
        return Pointer.pointerToAddress(this.g_converter_output_stream_get_converter(Pointer.pointerTo(this, GConverterOutputStream.class).getPeer()), Object.class);
    }

    @Field(0)
    public GFilterOutputStream gconverteroutputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GConverterOutputStream gconverteroutputstream_field_parent_instance(GFilterOutputStream gconverteroutputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gconverteroutputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer<GConverterOutputStreamPrivate> gconverteroutputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GConverterOutputStream gconverteroutputstream_field_priv(Pointer<GConverterOutputStreamPrivate> gconverteroutputstream_field_priv) {
        this.io.setPointerField(this, 1, gconverteroutputstream_field_priv);
        return this;
    }

}
