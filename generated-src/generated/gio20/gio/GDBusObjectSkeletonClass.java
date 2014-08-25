
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusObjectSkeletonClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusObjectSkeletonClass() {
        super();
    }

    public GDBusObjectSkeletonClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gdbusobjectskeletonclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusObjectSkeletonClass gdbusobjectskeletonclass_field_parent_class(GObjectClass gdbusobjectskeletonclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gdbusobjectskeletonclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gdbusobjectskeletonclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusObjectSkeletonClass gdbusobjectskeletonclass_field_padding(Pointer gdbusobjectskeletonclass_field_padding) {
        this.io.setPointerField(this, 1, gdbusobjectskeletonclass_field_padding);
        return this;
    }

}
