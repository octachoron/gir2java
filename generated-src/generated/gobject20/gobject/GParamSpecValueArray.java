
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecValueArray
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecValueArray() {
        super();
    }

    public GParamSpecValueArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gparamspecvaluearray_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecValueArray gparamspecvaluearray_field_parent_instance(GParamSpec gparamspecvaluearray_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecvaluearray_field_parent_instance);
        return this;
    }

    @Field(1)
    public long gparamspecvaluearray_field_fixed_n_elements() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GParamSpecValueArray gparamspecvaluearray_field_fixed_n_elements(long gparamspecvaluearray_field_fixed_n_elements) {
        this.io.setLongField(this, 1, gparamspecvaluearray_field_fixed_n_elements);
        return this;
    }

    @Field(2)
    public Pointer<GParamSpec> gparamspecvaluearray_field_element_spec() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecValueArray gparamspecvaluearray_field_element_spec(Pointer<GParamSpec> gparamspecvaluearray_field_element_spec) {
        this.io.setPointerField(this, 2, gparamspecvaluearray_field_element_spec);
        return this;
    }

}
