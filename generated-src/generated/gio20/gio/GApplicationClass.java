
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GApplicationClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GApplicationClass() {
        super();
    }

    public GApplicationClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private GObjectClass gapplicationclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GApplicationClass gapplicationclass_field_parent_class(GObjectClass gapplicationclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gapplicationclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gapplicationclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GApplicationClass gapplicationclass_field_padding(Pointer gapplicationclass_field_padding) {
        this.io.setPointerField(this, 1, gapplicationclass_field_padding);
        return this;
    }

}
