
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GOptionEntry
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GOptionEntry() {
        super();
    }

    public GOptionEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer goptionentry_field_long_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GOptionEntry goptionentry_field_long_name(Pointer goptionentry_field_long_name) {
        this.io.setPointerField(this, 0, goptionentry_field_long_name);
        return this;
    }

    @Field(1)
    public char goptionentry_field_short_name() {
        return this.io.getCharField(this, 1);
    }

    @Field(1)
    public GOptionEntry goptionentry_field_short_name(char goptionentry_field_short_name) {
        this.io.setCharField(this, 1, goptionentry_field_short_name);
        return this;
    }

    @Field(2)
    public int goptionentry_field_flags() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GOptionEntry goptionentry_field_flags(int goptionentry_field_flags) {
        this.io.setIntField(this, 2, goptionentry_field_flags);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GOptionArg> goptionentry_field_arg() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GOptionEntry goptionentry_field_arg(IntValuedEnum<GOptionArg> goptionentry_field_arg) {
        this.io.setEnumField(this, 3, goptionentry_field_arg);
        return this;
    }

    @Field(4)
    public Pointer goptionentry_field_arg_data() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GOptionEntry goptionentry_field_arg_data(Pointer goptionentry_field_arg_data) {
        this.io.setPointerField(this, 4, goptionentry_field_arg_data);
        return this;
    }

    @Field(5)
    public Pointer goptionentry_field_description() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GOptionEntry goptionentry_field_description(Pointer goptionentry_field_description) {
        this.io.setPointerField(this, 5, goptionentry_field_description);
        return this;
    }

    @Field(6)
    public Pointer goptionentry_field_arg_description() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GOptionEntry goptionentry_field_arg_description(Pointer goptionentry_field_arg_description) {
        this.io.setPointerField(this, 6, goptionentry_field_arg_description);
        return this;
    }

}
