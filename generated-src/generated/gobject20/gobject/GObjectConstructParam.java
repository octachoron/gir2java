
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GObjectConstructParam
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GObjectConstructParam() {
        super();
    }

    public GObjectConstructParam(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GValue> gobjectconstructparam_field_value() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GObjectConstructParam gobjectconstructparam_field_value(Pointer<GValue> gobjectconstructparam_field_value) {
        this.io.setPointerField(this, 0, gobjectconstructparam_field_value);
        return this;
    }

    @Field(1)
    public Pointer<GParamSpec> gobjectconstructparam_field_pspec() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GObjectConstructParam gobjectconstructparam_field_pspec(Pointer<GParamSpec> gobjectconstructparam_field_pspec) {
        this.io.setPointerField(this, 1, gobjectconstructparam_field_pspec);
        return this;
    }

}
