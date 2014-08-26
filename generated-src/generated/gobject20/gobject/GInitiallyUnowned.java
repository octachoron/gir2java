
package generated.gobject20.gobject;

import generated.glib20.glib.GData;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GInitiallyUnowned
    extends GObject
{


    static {
        BridJ.register();
    }

    public GInitiallyUnowned() {
        super();
    }

    public GInitiallyUnowned(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private long ginitiallyunowned_field_ref_count() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GInitiallyUnowned ginitiallyunowned_field_ref_count(long ginitiallyunowned_field_ref_count) {
        this.io.setLongField(this, 0, ginitiallyunowned_field_ref_count);
        return this;
    }

    @Field(1)
    private Pointer<GData> ginitiallyunowned_field_qdata() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GInitiallyUnowned ginitiallyunowned_field_qdata(Pointer<GData> ginitiallyunowned_field_qdata) {
        this.io.setPointerField(this, 1, ginitiallyunowned_field_qdata);
        return this;
    }

    @Field(2)
    public GTypeInstance ginitiallyunowned_field_g_type_instance() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GInitiallyUnowned ginitiallyunowned_field_g_type_instance(GTypeInstance ginitiallyunowned_field_g_type_instance) {
        this.io.setNativeObjectField(this, 2, ginitiallyunowned_field_g_type_instance);
        return this;
    }

}
