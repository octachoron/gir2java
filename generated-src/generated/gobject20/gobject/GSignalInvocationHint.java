
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
    public IntValuedEnum<GSignalFlags> field_run_type() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GSignalInvocationHint field_run_type(IntValuedEnum<GSignalFlags> field_run_type) {
        this.io.setEnumField(this, 0, field_run_type);
        return this;
    }

    @Field(1)
    public long field_detail() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GSignalInvocationHint field_detail(long field_detail) {
        this.io.setLongField(this, 1, field_detail);
        return this;
    }

    @Field(2)
    public long field_signal_id() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GSignalInvocationHint field_signal_id(long field_signal_id) {
        this.io.setLongField(this, 2, field_signal_id);
        return this;
    }

}
