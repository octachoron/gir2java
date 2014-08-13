
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecTypeInfo
    extends StructObject
{


    public GParamSpecTypeInfo() {
        super();
    }

    public GParamSpecTypeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_instance_size() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecTypeInfo field_instance_size(int field_instance_size) {
        this.io.setNativeObjectField(this, 0, field_instance_size);
        return this;
    }

    @Field(1)
    public int field_n_preallocs() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecTypeInfo field_n_preallocs(int field_n_preallocs) {
        this.io.setNativeObjectField(this, 1, field_n_preallocs);
        return this;
    }

    @Field(2)
    public long field_value_type() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecTypeInfo field_value_type(long field_value_type) {
        this.io.setNativeObjectField(this, 2, field_value_type);
        return this;
    }

}
