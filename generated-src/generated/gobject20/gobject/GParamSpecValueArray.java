
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecValueArray
    extends GParamSpec
{


    public GParamSpecValueArray() {
        super();
    }

    public GParamSpecValueArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecValueArray field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GParamSpec> field_element_spec() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GParamSpecValueArray field_element_spec(Pointer<GParamSpec> field_element_spec) {
        this.io.setPointerField(this, 1, field_element_spec);
        return this;
    }

    @Field(2)
    public long field_fixed_n_elements() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecValueArray field_fixed_n_elements(long field_fixed_n_elements) {
        this.io.setNativeObjectField(this, 2, field_fixed_n_elements);
        return this;
    }

}
