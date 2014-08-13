
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GConverterInputStream
    extends StructObject
{


    public GConverterInputStream() {
        super();
    }

    public GConverterInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_converter_input_stream_get_converter(
        @Ptr
        long converter_stream);

    public Pointer<Object> get_converter() {
        return Pointer.pointerToAddress(this.g_converter_input_stream_get_converter(Pointer.pointerTo(this, GConverterInputStream.class)), Pointer.class);
    }

    @Field(0)
    public GFilterInputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GConverterInputStream field_parent_instance(GFilterInputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GConverterInputStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GConverterInputStream field_priv(Pointer<GConverterInputStreamPrivate> field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
