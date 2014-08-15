
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypeInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeInfo() {
        super();
    }

    public GTypeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_class_init() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTypeInfo field_class_init(Pointer field_class_init) {
        this.io.setPointerField(this, 0, field_class_init);
        return this;
    }

    @Field(1)
    public int field_instance_size() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GTypeInfo field_instance_size(int field_instance_size) {
        this.io.setIntField(this, 1, field_instance_size);
        return this;
    }

    @Field(2)
    public int field_class_size() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GTypeInfo field_class_size(int field_class_size) {
        this.io.setIntField(this, 2, field_class_size);
        return this;
    }

    @Field(3)
    public int field_n_preallocs() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GTypeInfo field_n_preallocs(int field_n_preallocs) {
        this.io.setIntField(this, 3, field_n_preallocs);
        return this;
    }

    @Field(4)
    public Pointer field_class_finalize() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GTypeInfo field_class_finalize(Pointer field_class_finalize) {
        this.io.setPointerField(this, 4, field_class_finalize);
        return this;
    }

    @Field(5)
    public Pointer field_instance_init() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GTypeInfo field_instance_init(Pointer field_instance_init) {
        this.io.setPointerField(this, 5, field_instance_init);
        return this;
    }

    @Field(6)
    public Pointer<GTypeValueTable> field_value_table() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GTypeInfo field_value_table(Pointer<GTypeValueTable> field_value_table) {
        this.io.setPointerField(this, 6, field_value_table);
        return this;
    }

    @Field(7)
    public Pointer field_class_data() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GTypeInfo field_class_data(Pointer field_class_data) {
        this.io.setPointerField(this, 7, field_class_data);
        return this;
    }

    @Field(8)
    public Pointer field_base_finalize() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GTypeInfo field_base_finalize(Pointer field_base_finalize) {
        this.io.setPointerField(this, 8, field_base_finalize);
        return this;
    }

    @Field(9)
    public Pointer field_base_init() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GTypeInfo field_base_init(Pointer field_base_init) {
        this.io.setPointerField(this, 9, field_base_init);
        return this;
    }

}
