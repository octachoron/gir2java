
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GMemoryOutputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMemoryOutputStreamClass() {
        super();
    }

    public GMemoryOutputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GOutputStreamClass gmemoryoutputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMemoryOutputStreamClass gmemoryoutputstreamclass_field_parent_class(GOutputStreamClass gmemoryoutputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gmemoryoutputstreamclass_field_parent_class);
        return this;
    }

}
