
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecTypeInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GParamSpecTypeInfo() {
        super();
    }

    public GParamSpecTypeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gparamspectypeinfo_field_value_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecTypeInfo gparamspectypeinfo_field_value_type(long gparamspectypeinfo_field_value_type) {
        this.io.setLongField(this, 0, gparamspectypeinfo_field_value_type);
        return this;
    }

    @Field(1)
    public int gparamspectypeinfo_field_n_preallocs() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GParamSpecTypeInfo gparamspectypeinfo_field_n_preallocs(int gparamspectypeinfo_field_n_preallocs) {
        this.io.setIntField(this, 1, gparamspectypeinfo_field_n_preallocs);
        return this;
    }

    @Field(2)
    public int gparamspectypeinfo_field_instance_size() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GParamSpecTypeInfo gparamspectypeinfo_field_instance_size(int gparamspectypeinfo_field_instance_size) {
        this.io.setIntField(this, 2, gparamspectypeinfo_field_instance_size);
        return this;
    }

}
