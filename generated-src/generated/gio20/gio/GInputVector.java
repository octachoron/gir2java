
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GInputVector
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GInputVector() {
        super();
    }

    public GInputVector(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer ginputvector_field_buffer() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GInputVector ginputvector_field_buffer(Pointer ginputvector_field_buffer) {
        this.io.setPointerField(this, 0, ginputvector_field_buffer);
        return this;
    }

    @Field(1)
    public long ginputvector_field_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GInputVector ginputvector_field_size(long ginputvector_field_size) {
        this.io.setLongField(this, 1, ginputvector_field_size);
        return this;
    }

}
