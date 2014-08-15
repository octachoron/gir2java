
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
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecOverride field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GParamSpec> field_overridden() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GParamSpecOverride field_overridden(Pointer<GParamSpec> field_overridden) {
        this.io.setPointerField(this, 1, field_overridden);
        return this;
    }

}
