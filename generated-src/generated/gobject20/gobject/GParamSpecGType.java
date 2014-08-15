
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecGType
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecGType() {
        super();
    }

    public GParamSpecGType(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_is_a_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecGType field_is_a_type(long field_is_a_type) {
        this.io.setLongField(this, 0, field_is_a_type);
        return this;
    }

    @Field(1)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecGType field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
