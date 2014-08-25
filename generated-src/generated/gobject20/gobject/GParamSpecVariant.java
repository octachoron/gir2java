
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
    public GParamSpec gparamspecvariant_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecVariant gparamspecvariant_field_parent_instance(GParamSpec gparamspecvariant_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecvariant_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GVariant> gparamspecvariant_field_default_value() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GParamSpecVariant gparamspecvariant_field_default_value(Pointer<GVariant> gparamspecvariant_field_default_value) {
        this.io.setPointerField(this, 1, gparamspecvariant_field_default_value);
        return this;
    }

    @Field(2)
    public Pointer<GVariantType> gparamspecvariant_field_type() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecVariant gparamspecvariant_field_type(Pointer<GVariantType> gparamspecvariant_field_type) {
        this.io.setPointerField(this, 2, gparamspecvariant_field_type);
        return this;
    }

    @Field(3)
    private Pointer gparamspecvariant_field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GParamSpecVariant gparamspecvariant_field_padding(Pointer gparamspecvariant_field_padding) {
        this.io.setPointerField(this, 3, gparamspecvariant_field_padding);
        return this;
    }

}
