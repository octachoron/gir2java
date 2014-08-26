
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
    public int gtypeinfo_field_n_preallocs() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GTypeInfo gtypeinfo_field_n_preallocs(int gtypeinfo_field_n_preallocs) {
        this.io.setIntField(this, 0, gtypeinfo_field_n_preallocs);
        return this;
    }

    @Field(1)
    public Pointer gtypeinfo_field_instance_init() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTypeInfo gtypeinfo_field_instance_init(Pointer gtypeinfo_field_instance_init) {
        this.io.setPointerField(this, 1, gtypeinfo_field_instance_init);
        return this;
    }

    @Field(2)
    public Pointer gtypeinfo_field_class_finalize() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GTypeInfo gtypeinfo_field_class_finalize(Pointer gtypeinfo_field_class_finalize) {
        this.io.setPointerField(this, 2, gtypeinfo_field_class_finalize);
        return this;
    }

    @Field(3)
    public int gtypeinfo_field_instance_size() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GTypeInfo gtypeinfo_field_instance_size(int gtypeinfo_field_instance_size) {
        this.io.setIntField(this, 3, gtypeinfo_field_instance_size);
        return this;
    }

    @Field(4)
    public Pointer gtypeinfo_field_class_data() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GTypeInfo gtypeinfo_field_class_data(Pointer gtypeinfo_field_class_data) {
        this.io.setPointerField(this, 4, gtypeinfo_field_class_data);
        return this;
    }

    @Field(5)
    public Pointer gtypeinfo_field_base_init() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GTypeInfo gtypeinfo_field_base_init(Pointer gtypeinfo_field_base_init) {
        this.io.setPointerField(this, 5, gtypeinfo_field_base_init);
        return this;
    }

    @Field(6)
    public Pointer gtypeinfo_field_base_finalize() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GTypeInfo gtypeinfo_field_base_finalize(Pointer gtypeinfo_field_base_finalize) {
        this.io.setPointerField(this, 6, gtypeinfo_field_base_finalize);
        return this;
    }

    @Field(7)
    public int gtypeinfo_field_class_size() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public GTypeInfo gtypeinfo_field_class_size(int gtypeinfo_field_class_size) {
        this.io.setIntField(this, 7, gtypeinfo_field_class_size);
        return this;
    }

    @Field(8)
    public Pointer<GTypeValueTable> gtypeinfo_field_value_table() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GTypeInfo gtypeinfo_field_value_table(Pointer<GTypeValueTable> gtypeinfo_field_value_table) {
        this.io.setPointerField(this, 8, gtypeinfo_field_value_table);
        return this;
    }

    @Field(9)
    public Pointer gtypeinfo_field_class_init() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GTypeInfo gtypeinfo_field_class_init(Pointer gtypeinfo_field_class_init) {
        this.io.setPointerField(this, 9, gtypeinfo_field_class_init);
        return this;
    }

}
