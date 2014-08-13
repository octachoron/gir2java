
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GSignalInvocationHint
    extends StructObject
{


    public GSignalInvocationHint() {
        super();
    }

    public GSignalInvocationHint(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_signal_id() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSignalInvocationHint field_signal_id(long field_signal_id) {
        this.io.setNativeObjectField(this, 0, field_signal_id);
        return this;
    }

    @Field(1)
    public Object field_detail() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GSignalInvocationHint field_detail(Object field_detail) {
        this.io.setNativeObjectField(this, 1, field_detail);
        return this;
    }

    @Field(2)
    public Object field_run_type() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GSignalInvocationHint field_run_type(Object field_run_type) {
        this.io.setNativeObjectField(this, 2, field_run_type);
        return this;
    }

}
