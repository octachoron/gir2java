
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypeInfo
    extends StructObject
{


    public GTypeInfo() {
        super();
    }

    public GTypeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_class_size() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTypeInfo field_class_size(int field_class_size) {
        this.io.setNativeObjectField(this, 0, field_class_size);
        return this;
    }

    @Field(1)
    public Object field_base_init() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GTypeInfo field_base_init(Object field_base_init) {
        this.io.setNativeObjectField(this, 1, field_base_init);
        return this;
    }

    @Field(2)
    public Object field_base_finalize() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GTypeInfo field_base_finalize(Object field_base_finalize) {
        this.io.setNativeObjectField(this, 2, field_base_finalize);
        return this;
    }

    @Field(3)
    public Object field_class_init() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GTypeInfo field_class_init(Object field_class_init) {
        this.io.setNativeObjectField(this, 3, field_class_init);
        return this;
    }

    @Field(4)
    public Object field_class_finalize() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GTypeInfo field_class_finalize(Object field_class_finalize) {
        this.io.setNativeObjectField(this, 4, field_class_finalize);
        return this;
    }

    @Field(5)
    public Pointer field_class_data() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GTypeInfo field_class_data(Pointer field_class_data) {
        this.io.setNativeObjectField(this, 5, field_class_data);
        return this;
    }

    @Field(6)
    public int field_instance_size() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GTypeInfo field_instance_size(int field_instance_size) {
        this.io.setNativeObjectField(this, 6, field_instance_size);
        return this;
    }

    @Field(7)
    public int field_n_preallocs() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GTypeInfo field_n_preallocs(int field_n_preallocs) {
        this.io.setNativeObjectField(this, 7, field_n_preallocs);
        return this;
    }

    @Field(8)
    public Object field_instance_init() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GTypeInfo field_instance_init(Object field_instance_init) {
        this.io.setNativeObjectField(this, 8, field_instance_init);
        return this;
    }

    @Field(9)
    public Pointer field_value_table() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GTypeInfo field_value_table(Pointer field_value_table) {
        this.io.setPointerField(this, 9, field_value_table);
        return this;
    }

}
