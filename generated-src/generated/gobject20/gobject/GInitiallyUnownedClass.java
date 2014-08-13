
package generated.gobject20.gobject;

import generated.glib20.glib.GSList;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GInitiallyUnownedClass
    extends StructObject
{


    public GInitiallyUnownedClass() {
        super();
    }

    public GInitiallyUnownedClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GSList> field_construct_properties() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GInitiallyUnownedClass field_construct_properties(Pointer<GSList> field_construct_properties) {
        this.io.setPointerField(this, 0, field_construct_properties);
        return this;
    }

    @Field(1)
    public long field_flags() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GInitiallyUnownedClass field_flags(long field_flags) {
        this.io.setNativeObjectField(this, 1, field_flags);
        return this;
    }

    @Field(2)
    public GTypeClass field_g_type_class() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GInitiallyUnownedClass field_g_type_class(GTypeClass field_g_type_class) {
        this.io.setNativeObjectField(this, 2, field_g_type_class);
        return this;
    }

    @Field(3)
    public Pointer field_pdummy() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GInitiallyUnownedClass field_pdummy(Pointer field_pdummy) {
        this.io.setPointerField(this, 3, field_pdummy);
        return this;
    }

}
