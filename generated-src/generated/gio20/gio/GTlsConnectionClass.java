
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTlsConnectionClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTlsConnectionClass() {
        super();
    }

    public GTlsConnectionClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GIOStreamClass gtlsconnectionclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsConnectionClass gtlsconnectionclass_field_parent_class(GIOStreamClass gtlsconnectionclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gtlsconnectionclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gtlsconnectionclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTlsConnectionClass gtlsconnectionclass_field_padding(Pointer gtlsconnectionclass_field_padding) {
        this.io.setPointerField(this, 1, gtlsconnectionclass_field_padding);
        return this;
    }

}
