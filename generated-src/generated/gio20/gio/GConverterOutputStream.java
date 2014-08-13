
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GConverterOutputStream
    extends StructObject
{


    public GConverterOutputStream() {
        super();
    }

    public GConverterOutputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_converter_output_stream_get_converter(
        @Ptr
        long converter_stream);

    public Pointer<Object> get_converter() {
        return Pointer.pointerToAddress(this.g_converter_output_stream_get_converter(Pointer.pointerTo(this, GConverterOutputStream.class)), Pointer.class);
    }

    @Field(0)
    public Pointer<GConverterOutputStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GConverterOutputStream field_priv(Pointer<GConverterOutputStreamPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GFilterOutputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GConverterOutputStream field_parent_instance(GFilterOutputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
