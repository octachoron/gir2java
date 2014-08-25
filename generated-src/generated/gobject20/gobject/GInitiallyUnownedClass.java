
package generated.gobject20.gobject;

import generated.glib20.glib.GSList;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GInitiallyUnownedClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GInitiallyUnownedClass() {
        super();
    }

    public GInitiallyUnownedClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private long ginitiallyunownedclass_field_flags() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GInitiallyUnownedClass ginitiallyunownedclass_field_flags(long ginitiallyunownedclass_field_flags) {
        this.io.setLongField(this, 0, ginitiallyunownedclass_field_flags);
        return this;
    }

    @Field(1)
    private Pointer ginitiallyunownedclass_field_pdummy() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GInitiallyUnownedClass ginitiallyunownedclass_field_pdummy(Pointer ginitiallyunownedclass_field_pdummy) {
        this.io.setPointerField(this, 1, ginitiallyunownedclass_field_pdummy);
        return this;
    }

    @Field(2)
    public GTypeClass ginitiallyunownedclass_field_g_type_class() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GInitiallyUnownedClass ginitiallyunownedclass_field_g_type_class(GTypeClass ginitiallyunownedclass_field_g_type_class) {
        this.io.setNativeObjectField(this, 2, ginitiallyunownedclass_field_g_type_class);
        return this;
    }

    @Field(3)
    private Pointer<GSList> ginitiallyunownedclass_field_construct_properties() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GInitiallyUnownedClass ginitiallyunownedclass_field_construct_properties(Pointer<GSList> ginitiallyunownedclass_field_construct_properties) {
        this.io.setPointerField(this, 3, ginitiallyunownedclass_field_construct_properties);
        return this;
    }

}
