
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GPermissionClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GPermissionClass() {
        super();
    }

    public GPermissionClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gpermissionclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GPermissionClass gpermissionclass_field_parent_class(GObjectClass gpermissionclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gpermissionclass_field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer gpermissionclass_field_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GPermissionClass gpermissionclass_field_reserved(Pointer gpermissionclass_field_reserved) {
        this.io.setPointerField(this, 1, gpermissionclass_field_reserved);
        return this;
    }

}
