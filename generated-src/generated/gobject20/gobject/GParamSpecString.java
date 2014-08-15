
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
    public long field_ensure_non_null() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecString field_ensure_non_null(long field_ensure_non_null) {
        this.io.setLongField(this, 0, field_ensure_non_null);
        return this;
    }

    @Field(1)
    public char field_substitutor() {
        return this.io.getCharField(this, 1);
    }

    @Field(1)
    public GParamSpecString field_substitutor(char field_substitutor) {
        this.io.setCharField(this, 1, field_substitutor);
        return this;
    }

    @Field(2)
    public Pointer field_cset_first() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecString field_cset_first(Pointer field_cset_first) {
        this.io.setPointerField(this, 2, field_cset_first);
        return this;
    }

    @Field(3)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GParamSpecString field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 3, field_parent_instance);
        return this;
    }

    @Field(4)
    public long field_null_fold_if_empty() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GParamSpecString field_null_fold_if_empty(long field_null_fold_if_empty) {
        this.io.setLongField(this, 4, field_null_fold_if_empty);
        return this;
    }

    @Field(5)
    public Pointer field_default_value() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GParamSpecString field_default_value(Pointer field_default_value) {
        this.io.setPointerField(this, 5, field_default_value);
        return this;
    }

    @Field(6)
    public Pointer field_cset_nth() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GParamSpecString field_cset_nth(Pointer field_cset_nth) {
        this.io.setPointerField(this, 6, field_cset_nth);
        return this;
    }

}
