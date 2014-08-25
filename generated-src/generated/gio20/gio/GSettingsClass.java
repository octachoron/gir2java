
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GSettingsClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSettingsClass() {
        super();
    }

    public GSettingsClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gsettingsclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSettingsClass gsettingsclass_field_parent_class(GObjectClass gsettingsclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gsettingsclass_field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer gsettingsclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSettingsClass gsettingsclass_field_padding(Pointer gsettingsclass_field_padding) {
        this.io.setPointerField(this, 1, gsettingsclass_field_padding);
        return this;
    }

}
