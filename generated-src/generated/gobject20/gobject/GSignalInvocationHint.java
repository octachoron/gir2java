
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GSignalInvocationHint
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSignalInvocationHint() {
        super();
    }

    public GSignalInvocationHint(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gsignalinvocationhint_field_signal_id() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GSignalInvocationHint gsignalinvocationhint_field_signal_id(long gsignalinvocationhint_field_signal_id) {
        this.io.setLongField(this, 0, gsignalinvocationhint_field_signal_id);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GSignalFlags> gsignalinvocationhint_field_run_type() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GSignalInvocationHint gsignalinvocationhint_field_run_type(IntValuedEnum<GSignalFlags> gsignalinvocationhint_field_run_type) {
        this.io.setEnumField(this, 1, gsignalinvocationhint_field_run_type);
        return this;
    }

    @Field(2)
    public long gsignalinvocationhint_field_detail() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GSignalInvocationHint gsignalinvocationhint_field_detail(long gsignalinvocationhint_field_detail) {
        this.io.setLongField(this, 2, gsignalinvocationhint_field_detail);
        return this;
    }

}
