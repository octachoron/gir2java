
package generated.gobject20.gobject;

import generated.glib20.glib.GData;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GInitiallyUnowned
    extends StructObject
{


    public GInitiallyUnowned() {
        super();
    }

    public GInitiallyUnowned(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_ref_count() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInitiallyUnowned field_ref_count(long field_ref_count) {
        this.io.setNativeObjectField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public GTypeInstance field_g_type_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GInitiallyUnowned field_g_type_instance(GTypeInstance field_g_type_instance) {
        this.io.setNativeObjectField(this, 1, field_g_type_instance);
        return this;
    }

    @Field(2)
    public Pointer<GData> field_qdata() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GInitiallyUnowned field_qdata(Pointer<GData> field_qdata) {
        this.io.setPointerField(this, 2, field_qdata);
        return this;
    }

}