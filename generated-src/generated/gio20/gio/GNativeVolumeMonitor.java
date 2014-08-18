
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GNativeVolumeMonitor
    extends GVolumeMonitor
{


    static {
        BridJ.register();
    }

    public GNativeVolumeMonitor() {
        super();
    }

    public GNativeVolumeMonitor(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GVolumeMonitor gnativevolumemonitor_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNativeVolumeMonitor gnativevolumemonitor_field_parent_instance(GVolumeMonitor gnativevolumemonitor_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gnativevolumemonitor_field_parent_instance);
        return this;
    }

}
