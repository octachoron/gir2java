
package generated.glib20.glib;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GOptionEntry
    extends StructObject
{


    public GOptionEntry() {
        super();
    }

    public GOptionEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_long_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GOptionEntry field_long_name(Pointer field_long_name) {
        this.io.setPointerField(this, 0, field_long_name);
        return this;
    }

    @Field(1)
    public char field_short_name() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GOptionEntry field_short_name(char field_short_name) {
        this.io.setNativeObjectField(this, 1, field_short_name);
        return this;
    }

    @Field(2)
    public int field_flags() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GOptionEntry field_flags(int field_flags) {
        this.io.setNativeObjectField(this, 2, field_flags);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GOptionArg> field_arg() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GOptionEntry field_arg(IntValuedEnum<GOptionArg> field_arg) {
        this.io.setEnumField(this, 3, field_arg);
        return this;
    }

    @Field(4)
    public Pointer field_arg_data() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GOptionEntry field_arg_data(Pointer field_arg_data) {
        this.io.setNativeObjectField(this, 4, field_arg_data);
        return this;
    }

    @Field(5)
    public Pointer field_description() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GOptionEntry field_description(Pointer field_description) {
        this.io.setPointerField(this, 5, field_description);
        return this;
    }

    @Field(6)
    public Pointer field_arg_description() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GOptionEntry field_arg_description(Pointer field_arg_description) {
        this.io.setPointerField(this, 6, field_arg_description);
        return this;
    }

}
