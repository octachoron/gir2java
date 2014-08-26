
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecOverride
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecOverride() {
        super();
    }

    public GParamSpecOverride(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer<GParamSpec> gparamspecoverride_field_overridden() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GParamSpecOverride gparamspecoverride_field_overridden(Pointer<GParamSpec> gparamspecoverride_field_overridden) {
        this.io.setPointerField(this, 0, gparamspecoverride_field_overridden);
        return this;
    }

    @Field(1)
    private GParamSpec gparamspecoverride_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    private GParamSpecOverride gparamspecoverride_field_parent_instance(GParamSpec gparamspecoverride_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, gparamspecoverride_field_parent_instance);
        return this;
    }

}
