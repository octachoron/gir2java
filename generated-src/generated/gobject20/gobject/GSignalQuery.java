
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GSignalQuery
    extends StructObject
{


    public GSignalQuery() {
        super();
    }

    public GSignalQuery(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_signal_id() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSignalQuery field_signal_id(long field_signal_id) {
        this.io.setNativeObjectField(this, 0, field_signal_id);
        return this;
    }

    @Field(1)
    public Pointer field_signal_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSignalQuery field_signal_name(Pointer field_signal_name) {
        this.io.setPointerField(this, 1, field_signal_name);
        return this;
    }

    @Field(2)
    public long field_itype() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GSignalQuery field_itype(long field_itype) {
        this.io.setNativeObjectField(this, 2, field_itype);
        return this;
    }

    @Field(3)
    public Object field_signal_flags() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GSignalQuery field_signal_flags(Object field_signal_flags) {
        this.io.setNativeObjectField(this, 3, field_signal_flags);
        return this;
    }

    @Field(4)
    public long field_return_type() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GSignalQuery field_return_type(long field_return_type) {
        this.io.setNativeObjectField(this, 4, field_return_type);
        return this;
    }

    @Field(5)
    public long field_n_params() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GSignalQuery field_n_params(long field_n_params) {
        this.io.setNativeObjectField(this, 5, field_n_params);
        return this;
    }

    @Field(6)
    public long field_param_types() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GSignalQuery field_param_types(long field_param_types) {
        this.io.setPointerField(this, 6, field_param_types);
        return this;
    }

}
