
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GSignalQuery
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSignalQuery() {
        super();
    }

    public GSignalQuery(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_signal_id() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GSignalQuery field_signal_id(long field_signal_id) {
        this.io.setLongField(this, 0, field_signal_id);
        return this;
    }

    @Field(1)
    public long field_return_type() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GSignalQuery field_return_type(long field_return_type) {
        this.io.setLongField(this, 1, field_return_type);
        return this;
    }

    @Field(2)
    public Pointer<Long> field_param_types() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GSignalQuery field_param_types(Pointer<Long> field_param_types) {
        this.io.setPointerField(this, 2, field_param_types);
        return this;
    }

    @Field(3)
    public long field_itype() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GSignalQuery field_itype(long field_itype) {
        this.io.setLongField(this, 3, field_itype);
        return this;
    }

    @Field(4)
    public long field_n_params() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GSignalQuery field_n_params(long field_n_params) {
        this.io.setLongField(this, 4, field_n_params);
        return this;
    }

    @Field(5)
    public Pointer field_signal_name() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GSignalQuery field_signal_name(Pointer field_signal_name) {
        this.io.setPointerField(this, 5, field_signal_name);
        return this;
    }

    @Field(6)
    public IntValuedEnum<GSignalFlags> field_signal_flags() {
        return this.io.getEnumField(this, 6);
    }

    @Field(6)
    public GSignalQuery field_signal_flags(IntValuedEnum<GSignalFlags> field_signal_flags) {
        this.io.setEnumField(this, 6, field_signal_flags);
        return this;
    }

}
