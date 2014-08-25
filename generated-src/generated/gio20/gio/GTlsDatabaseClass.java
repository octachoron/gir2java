
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTlsDatabaseClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTlsDatabaseClass() {
        super();
    }

    public GTlsDatabaseClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gtlsdatabaseclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsDatabaseClass gtlsdatabaseclass_field_parent_class(GObjectClass gtlsdatabaseclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gtlsdatabaseclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gtlsdatabaseclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTlsDatabaseClass gtlsdatabaseclass_field_padding(Pointer gtlsdatabaseclass_field_padding) {
        this.io.setPointerField(this, 1, gtlsdatabaseclass_field_padding);
        return this;
    }

}
