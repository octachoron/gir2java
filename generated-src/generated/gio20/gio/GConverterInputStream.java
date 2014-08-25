
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GConverterInputStream
    extends GFilterInputStream
{


    static {
        BridJ.register();
    }

    public GConverterInputStream() {
        super();
    }

    public GConverterInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_converter_input_stream_new(
        @Ptr
        long base_stream,
        @Ptr
        long converter);

    public static Pointer _new(Pointer base_stream, Pointer<Object> converter) {
        return Pointer.pointerToAddress(GConverterInputStream.g_converter_input_stream_new(Pointer.getPeer(base_stream), Pointer.getPeer(converter)));
    }

    @Ptr
    protected native long g_converter_input_stream_get_converter(
        @Ptr
        long converter_stream);

    public Pointer<Object> get_converter() {
        return Pointer.pointerToAddress(this.g_converter_input_stream_get_converter(Pointer.pointerTo(this, GConverterInputStream.class).getPeer()), Object.class);
    }

    @Field(0)
    public GFilterInputStream gconverterinputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GConverterInputStream gconverterinputstream_field_parent_instance(GFilterInputStream gconverterinputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gconverterinputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer<GConverterInputStreamPrivate> gconverterinputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GConverterInputStream gconverterinputstream_field_priv(Pointer<GConverterInputStreamPrivate> gconverterinputstream_field_priv) {
        this.io.setPointerField(this, 1, gconverterinputstream_field_priv);
        return this;
    }

}
