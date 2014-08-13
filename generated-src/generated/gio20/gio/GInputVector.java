
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GInputVector
    extends StructObject
{


    public GInputVector() {
        super();
    }

    public GInputVector(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_buffer() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInputVector field_buffer(Pointer field_buffer) {
        this.io.setNativeObjectField(this, 0, field_buffer);
        return this;
    }

    @Field(1)
    public long field_size() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GInputVector field_size(long field_size) {
        this.io.setNativeObjectField(this, 1, field_size);
        return this;
    }

}
