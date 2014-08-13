
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GNativeVolumeMonitor
    extends StructObject
{


    public GNativeVolumeMonitor() {
        super();
    }

    public GNativeVolumeMonitor(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GVolumeMonitor field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNativeVolumeMonitor field_parent_instance(GVolumeMonitor field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

}
