
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GConverterOutputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GConverterOutputStreamClass() {
        super();
    }

    public GConverterOutputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GFilterOutputStreamClass gconverteroutputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GConverterOutputStreamClass gconverteroutputstreamclass_field_parent_class(GFilterOutputStreamClass gconverteroutputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gconverteroutputstreamclass_field_parent_class);
        return this;
    }

}
