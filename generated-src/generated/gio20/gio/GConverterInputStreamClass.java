
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GConverterInputStreamClass
    extends StructObject
{


    public GConverterInputStreamClass() {
        super();
    }

    public GConverterInputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GFilterInputStreamClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GConverterInputStreamClass field_parent_class(GFilterInputStreamClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
