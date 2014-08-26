
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecString
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecString() {
        super();
    }

    public GParamSpecString(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gparamspecstring_field_cset_nth() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GParamSpecString gparamspecstring_field_cset_nth(Pointer gparamspecstring_field_cset_nth) {
        this.io.setPointerField(this, 0, gparamspecstring_field_cset_nth);
        return this;
    }

    @Field(1)
    public char gparamspecstring_field_substitutor() {
        return this.io.getCharField(this, 1);
    }

    @Field(1)
    public GParamSpecString gparamspecstring_field_substitutor(char gparamspecstring_field_substitutor) {
        this.io.setCharField(this, 1, gparamspecstring_field_substitutor);
        return this;
    }

    @Field(2)
    public Pointer gparamspecstring_field_default_value() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecString gparamspecstring_field_default_value(Pointer gparamspecstring_field_default_value) {
        this.io.setPointerField(this, 2, gparamspecstring_field_default_value);
        return this;
    }

    @Field(3)
    public long gparamspecstring_field_ensure_non_null() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GParamSpecString gparamspecstring_field_ensure_non_null(long gparamspecstring_field_ensure_non_null) {
        this.io.setLongField(this, 3, gparamspecstring_field_ensure_non_null);
        return this;
    }

    @Field(4)
    public long gparamspecstring_field_null_fold_if_empty() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GParamSpecString gparamspecstring_field_null_fold_if_empty(long gparamspecstring_field_null_fold_if_empty) {
        this.io.setLongField(this, 4, gparamspecstring_field_null_fold_if_empty);
        return this;
    }

    @Field(5)
    public Pointer gparamspecstring_field_cset_first() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GParamSpecString gparamspecstring_field_cset_first(Pointer gparamspecstring_field_cset_first) {
        this.io.setPointerField(this, 5, gparamspecstring_field_cset_first);
        return this;
    }

    @Field(6)
    public GParamSpec gparamspecstring_field_parent_instance() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GParamSpecString gparamspecstring_field_parent_instance(GParamSpec gparamspecstring_field_parent_instance) {
        this.io.setNativeObjectField(this, 6, gparamspecstring_field_parent_instance);
        return this;
    }

}
