
package generated.gobject20.gobject;

import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecVariant
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecVariant() {
        super();
    }

    public GParamSpecVariant(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecVariant field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GVariant> field_default_value() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GParamSpecVariant field_default_value(Pointer<GVariant> field_default_value) {
        this.io.setPointerField(this, 1, field_default_value);
        return this;
    }

    @Field(2)
    public Pointer<GVariantType> field_type() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecVariant field_type(Pointer<GVariantType> field_type) {
        this.io.setPointerField(this, 2, field_type);
        return this;
    }

    @Field(3)
    private Pointer field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GParamSpecVariant field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 3, field_padding);
        return this;
    }

}
