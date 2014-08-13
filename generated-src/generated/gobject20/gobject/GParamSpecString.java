
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecString
    extends GParamSpec
{


    public GParamSpecString() {
        super();
    }

    public GParamSpecString(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecString field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_default_value() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GParamSpecString field_default_value(Pointer field_default_value) {
        this.io.setPointerField(this, 1, field_default_value);
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
    public Pointer field_cset_nth() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GParamSpecString field_cset_nth(Pointer field_cset_nth) {
        this.io.setPointerField(this, 3, field_cset_nth);
        return this;
    }

    @Field(4)
    public char field_substitutor() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GParamSpecString field_substitutor(char field_substitutor) {
        this.io.setNativeObjectField(this, 4, field_substitutor);
        return this;
    }

    @Field(5)
    public long field_null_fold_if_empty() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GParamSpecString field_null_fold_if_empty(long field_null_fold_if_empty) {
        this.io.setNativeObjectField(this, 5, field_null_fold_if_empty);
        return this;
    }

    @Field(6)
    public long field_ensure_non_null() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GParamSpecString field_ensure_non_null(long field_ensure_non_null) {
        this.io.setNativeObjectField(this, 6, field_ensure_non_null);
        return this;
    }

}
