
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GSimpleActionGroupClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSimpleActionGroupClass() {
        super();
    }

    public GSimpleActionGroupClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private GObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GSimpleActionGroupClass field_parent_class(GObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GSimpleActionGroupClass field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 1, field_padding);
        return this;
    }

}
