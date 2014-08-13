
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTlsPasswordClass
    extends StructObject
{


    public GTlsPasswordClass() {
        super();
    }

    public GTlsPasswordClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsPasswordClass field_parent_class(GObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTlsPasswordClass field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 1, field_padding);
        return this;
    }

}
