
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GBufferedOutputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GBufferedOutputStreamClass() {
        super();
    }

    public GBufferedOutputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GFilterOutputStreamClass gbufferedoutputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GBufferedOutputStreamClass gbufferedoutputstreamclass_field_parent_class(GFilterOutputStreamClass gbufferedoutputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gbufferedoutputstreamclass_field_parent_class);
        return this;
    }

}
