
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GClosureNotifyData
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GClosureNotifyData() {
        super();
    }

    public GClosureNotifyData(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gclosurenotifydata_field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GClosureNotifyData gclosurenotifydata_field_data(Pointer gclosurenotifydata_field_data) {
        this.io.setPointerField(this, 0, gclosurenotifydata_field_data);
        return this;
    }

    @Field(1)
    public Pointer gclosurenotifydata_field_notify() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GClosureNotifyData gclosurenotifydata_field_notify(Pointer gclosurenotifydata_field_notify) {
        this.io.setPointerField(this, 1, gclosurenotifydata_field_notify);
        return this;
    }

}
