
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
    public long gsignalquery_field_return_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GSignalQuery gsignalquery_field_return_type(long gsignalquery_field_return_type) {
        this.io.setLongField(this, 0, gsignalquery_field_return_type);
        return this;
    }

    @Field(1)
    public Pointer gsignalquery_field_signal_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSignalQuery gsignalquery_field_signal_name(Pointer gsignalquery_field_signal_name) {
        this.io.setPointerField(this, 1, gsignalquery_field_signal_name);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GSignalFlags> gsignalquery_field_signal_flags() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GSignalQuery gsignalquery_field_signal_flags(IntValuedEnum<GSignalFlags> gsignalquery_field_signal_flags) {
        this.io.setEnumField(this, 2, gsignalquery_field_signal_flags);
        return this;
    }

    @Field(3)
    public long gsignalquery_field_itype() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GSignalQuery gsignalquery_field_itype(long gsignalquery_field_itype) {
        this.io.setLongField(this, 3, gsignalquery_field_itype);
        return this;
    }

    @Field(4)
    public long gsignalquery_field_signal_id() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GSignalQuery gsignalquery_field_signal_id(long gsignalquery_field_signal_id) {
        this.io.setLongField(this, 4, gsignalquery_field_signal_id);
        return this;
    }

    @Field(5)
    public long gsignalquery_field_n_params() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GSignalQuery gsignalquery_field_n_params(long gsignalquery_field_n_params) {
        this.io.setLongField(this, 5, gsignalquery_field_n_params);
        return this;
    }

    @Field(6)
    public Pointer<Long> gsignalquery_field_param_types() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GSignalQuery gsignalquery_field_param_types(Pointer<Long> gsignalquery_field_param_types) {
        this.io.setPointerField(this, 6, gsignalquery_field_param_types);
        return this;
    }

}
