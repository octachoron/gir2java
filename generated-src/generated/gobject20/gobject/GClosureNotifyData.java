
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GClosureNotifyData
    extends StructObject
{


    public GClosureNotifyData() {
        super();
    }

    public GClosureNotifyData(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GClosureNotifyData field_data(Pointer field_data) {
        this.io.setNativeObjectField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public Object field_notify() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GClosureNotifyData field_notify(Object field_notify) {
        this.io.setNativeObjectField(this, 1, field_notify);
        return this;
    }

}
