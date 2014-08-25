
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GNativeVolumeMonitorClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GNativeVolumeMonitorClass() {
        super();
    }

    public GNativeVolumeMonitorClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GVolumeMonitorClass gnativevolumemonitorclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNativeVolumeMonitorClass gnativevolumemonitorclass_field_parent_class(GVolumeMonitorClass gnativevolumemonitorclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gnativevolumemonitorclass_field_parent_class);
        return this;
    }

}
