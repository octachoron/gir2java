
package generated.gstreamer10.gst;

import generated.glib20.glib.GDate;
import generated.gobject20.gobject.GValue;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstStructure
    extends StructObject
{


    public GstStructure() {
        super();
    }

    public GstStructure(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstStructure field_type(long field_type) {
        this.io.setNativeObjectField(this, 0, field_type);
        return this;
    }

    @Field(1)
    public Object field_name() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstStructure field_name(Object field_name) {
        this.io.setNativeObjectField(this, 1, field_name);
        return this;
    }

    protected native boolean gst_structure_can_intersect(
        @Ptr
        long struct1,
        @Ptr
        long struct2);

    public boolean can_intersect(Pointer struct2) {
        return this.gst_structure_can_intersect(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(struct2));
    }

    @Ptr
    protected native long gst_structure_copy(
        @Ptr
        long structure);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_structure_copy(Pointer.pointerTo(this, GstStructure.class)));
    }

    protected native void gst_structure_fixate(
        @Ptr
        long structure);

    public void fixate() {
        this.gst_structure_fixate(Pointer.pointerTo(this, GstStructure.class));
    }

    protected native boolean gst_structure_fixate_field(
        @Ptr
        long structure,
        @Ptr
        long field_name);

    public boolean fixate_field(Pointer field_name) {
        return this.gst_structure_fixate_field(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(field_name));
    }

    protected native boolean gst_structure_fixate_field_boolean(
        @Ptr
        long structure,
        @Ptr
        long field_name, boolean target);

    public boolean fixate_field_boolean(Pointer field_name, boolean target) {
        return this.gst_structure_fixate_field_boolean(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(field_name), target);
    }

    protected native boolean gst_structure_fixate_field_nearest_double(
        @Ptr
        long structure,
        @Ptr
        long field_name, double target);

    public boolean fixate_field_nearest_double(Pointer field_name, double target) {
        return this.gst_structure_fixate_field_nearest_double(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(field_name), target);
    }

    protected native boolean gst_structure_fixate_field_nearest_fraction(
        @Ptr
        long structure,
        @Ptr
        long field_name, int target_numerator, int target_denominator);

    public boolean fixate_field_nearest_fraction(Pointer field_name, int target_numerator, int target_denominator) {
        return this.gst_structure_fixate_field_nearest_fraction(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(field_name), target_numerator, target_denominator);
    }

    protected native boolean gst_structure_fixate_field_nearest_int(
        @Ptr
        long structure,
        @Ptr
        long field_name, int target);

    public boolean fixate_field_nearest_int(Pointer field_name, int target) {
        return this.gst_structure_fixate_field_nearest_int(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(field_name), target);
    }

    protected native boolean gst_structure_fixate_field_string(
        @Ptr
        long structure,
        @Ptr
        long field_name,
        @Ptr
        long target);

    public boolean fixate_field_string(Pointer field_name, Pointer target) {
        return this.gst_structure_fixate_field_string(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(field_name), Pointer.getPeer(target));
    }

    protected native void gst_structure_free(
        @Ptr
        long structure);

    public void free() {
        this.gst_structure_free(Pointer.pointerTo(this, GstStructure.class));
    }

    protected native boolean gst_structure_get(
        @Ptr
        long structure,
        @Ptr
        long first_fieldname, Object... varargs);

    public boolean get(Pointer first_fieldname, Object... varargs) {
        return this.gst_structure_get(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(first_fieldname), varargs);
    }

    protected native boolean gst_structure_get_boolean(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public boolean get_boolean(Pointer fieldname, Pointer<Boolean> value) {
        return this.gst_structure_get_boolean(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    protected native boolean gst_structure_get_clock_time(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public boolean get_clock_time(Pointer fieldname, Pointer<Object> value) {
        return this.gst_structure_get_clock_time(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    protected native boolean gst_structure_get_date(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public boolean get_date(Pointer fieldname, Pointer<Pointer<GDate>> value) {
        return this.gst_structure_get_date(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    protected native boolean gst_structure_get_date_time(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public boolean get_date_time(Pointer fieldname, Pointer<Pointer<GstDateTime>> value) {
        return this.gst_structure_get_date_time(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    protected native boolean gst_structure_get_double(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public boolean get_double(Pointer fieldname, Pointer<Double> value) {
        return this.gst_structure_get_double(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    protected native boolean gst_structure_get_enum(
        @Ptr
        long structure,
        @Ptr
        long fieldname, long enumtype,
        @Ptr
        long value);

    public boolean get_enum(Pointer fieldname, long enumtype, Pointer<Integer> value) {
        return this.gst_structure_get_enum(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), enumtype, Pointer.getPeer(value));
    }

    protected native long gst_structure_get_field_type(
        @Ptr
        long structure,
        @Ptr
        long fieldname);

    public long get_field_type(Pointer fieldname) {
        return this.gst_structure_get_field_type(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname));
    }

    protected native boolean gst_structure_get_fraction(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value_numerator,
        @Ptr
        long value_denominator);

    public boolean get_fraction(Pointer fieldname, Pointer<Integer> value_numerator, Pointer<Integer> value_denominator) {
        return this.gst_structure_get_fraction(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value_numerator), Pointer.getPeer(value_denominator));
    }

    protected native boolean gst_structure_get_int(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public boolean get_int(Pointer fieldname, Pointer<Integer> value) {
        return this.gst_structure_get_int(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    @Ptr
    protected native long gst_structure_get_name(
        @Ptr
        long structure);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.gst_structure_get_name(Pointer.pointerTo(this, GstStructure.class)));
    }

    protected native Object gst_structure_get_name_id(
        @Ptr
        long structure);

    public Object get_name_id() {
        return this.gst_structure_get_name_id(Pointer.pointerTo(this, GstStructure.class));
    }

    @Ptr
    protected native long gst_structure_get_string(
        @Ptr
        long structure,
        @Ptr
        long fieldname);

    public Pointer get_string(Pointer fieldname) {
        return Pointer.pointerToAddress(this.gst_structure_get_string(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname)));
    }

    protected native boolean gst_structure_get_uint(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public boolean get_uint(Pointer fieldname, Pointer<Long> value) {
        return this.gst_structure_get_uint(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    @Ptr
    protected native long gst_structure_get_value(
        @Ptr
        long structure,
        @Ptr
        long fieldname);

    public Pointer<GValue> get_value(Pointer fieldname) {
        return Pointer.pointerToAddress(this.gst_structure_get_value(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname)), Pointer.class);
    }

    protected native boolean gst_structure_has_field(
        @Ptr
        long structure,
        @Ptr
        long fieldname);

    public boolean has_field(Pointer fieldname) {
        return this.gst_structure_has_field(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname));
    }

    protected native boolean gst_structure_has_field_typed(
        @Ptr
        long structure,
        @Ptr
        long fieldname, long type);

    public boolean has_field_typed(Pointer fieldname, long type) {
        return this.gst_structure_has_field_typed(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), type);
    }

    protected native boolean gst_structure_has_name(
        @Ptr
        long structure,
        @Ptr
        long name);

    public boolean has_name(Pointer name) {
        return this.gst_structure_has_name(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(name));
    }

    protected native boolean gst_structure_id_get(
        @Ptr
        long structure, Object first_field_id, Object... varargs);

    public boolean id_get(Object first_field_id, Object... varargs) {
        return this.gst_structure_id_get(Pointer.pointerTo(this, GstStructure.class), first_field_id, varargs);
    }

    @Ptr
    protected native long gst_structure_id_get_value(
        @Ptr
        long structure, Object field);

    public Pointer<GValue> id_get_value(Object field) {
        return Pointer.pointerToAddress(this.gst_structure_id_get_value(Pointer.pointerTo(this, GstStructure.class), field), Pointer.class);
    }

    protected native boolean gst_structure_id_has_field(
        @Ptr
        long structure, Object field);

    public boolean id_has_field(Object field) {
        return this.gst_structure_id_has_field(Pointer.pointerTo(this, GstStructure.class), field);
    }

    protected native boolean gst_structure_id_has_field_typed(
        @Ptr
        long structure, Object field, long type);

    public boolean id_has_field_typed(Object field, long type) {
        return this.gst_structure_id_has_field_typed(Pointer.pointerTo(this, GstStructure.class), field, type);
    }

    protected native void gst_structure_id_set(
        @Ptr
        long structure, Object fieldname, Object... varargs);

    public void id_set(Object fieldname, Object... varargs) {
        this.gst_structure_id_set(Pointer.pointerTo(this, GstStructure.class), fieldname, varargs);
    }

    protected native void gst_structure_id_set_value(
        @Ptr
        long structure, Object field,
        @Ptr
        long value);

    public void id_set_value(Object field, Pointer<GValue> value) {
        this.gst_structure_id_set_value(Pointer.pointerTo(this, GstStructure.class), field, Pointer.getPeer(value));
    }

    protected native void gst_structure_id_take_value(
        @Ptr
        long structure, Object field,
        @Ptr
        long value);

    public void id_take_value(Object field, Pointer<GValue> value) {
        this.gst_structure_id_take_value(Pointer.pointerTo(this, GstStructure.class), field, Pointer.getPeer(value));
    }

    @Ptr
    protected native long gst_structure_intersect(
        @Ptr
        long struct1,
        @Ptr
        long struct2);

    public Pointer intersect(Pointer struct2) {
        return Pointer.pointerToAddress(this.gst_structure_intersect(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(struct2)));
    }

    protected native boolean gst_structure_is_equal(
        @Ptr
        long structure1,
        @Ptr
        long structure2);

    public boolean is_equal(Pointer structure2) {
        return this.gst_structure_is_equal(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(structure2));
    }

    protected native boolean gst_structure_is_subset(
        @Ptr
        long subset,
        @Ptr
        long superset);

    public boolean is_subset(Pointer superset) {
        return this.gst_structure_is_subset(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(superset));
    }

    protected native int gst_structure_n_fields(
        @Ptr
        long structure);

    public int n_fields() {
        return this.gst_structure_n_fields(Pointer.pointerTo(this, GstStructure.class));
    }

    @Ptr
    protected native long gst_structure_nth_field_name(
        @Ptr
        long structure, long index);

    public Pointer nth_field_name(long index) {
        return Pointer.pointerToAddress(this.gst_structure_nth_field_name(Pointer.pointerTo(this, GstStructure.class), index));
    }

    protected native void gst_structure_remove_all_fields(
        @Ptr
        long structure);

    public void remove_all_fields() {
        this.gst_structure_remove_all_fields(Pointer.pointerTo(this, GstStructure.class));
    }

    protected native void gst_structure_remove_field(
        @Ptr
        long structure,
        @Ptr
        long fieldname);

    public void remove_field(Pointer fieldname) {
        this.gst_structure_remove_field(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname));
    }

    protected native void gst_structure_remove_fields(
        @Ptr
        long structure,
        @Ptr
        long fieldname, Object... varargs);

    public void remove_fields(Pointer fieldname, Object... varargs) {
        this.gst_structure_remove_fields(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), varargs);
    }

    protected native void gst_structure_set(
        @Ptr
        long structure,
        @Ptr
        long fieldname, Object... varargs);

    public void set(Pointer fieldname, Object... varargs) {
        this.gst_structure_set(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), varargs);
    }

    protected native void gst_structure_set_name(
        @Ptr
        long structure,
        @Ptr
        long name);

    public void set_name(Pointer name) {
        this.gst_structure_set_name(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(name));
    }

    protected native boolean gst_structure_set_parent_refcount(
        @Ptr
        long structure,
        @Ptr
        long refcount);

    public boolean set_parent_refcount(Pointer<Integer> refcount) {
        return this.gst_structure_set_parent_refcount(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(refcount));
    }

    protected native void gst_structure_set_value(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public void set_value(Pointer fieldname, Pointer<GValue> value) {
        this.gst_structure_set_value(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    protected native void gst_structure_take_value(
        @Ptr
        long structure,
        @Ptr
        long fieldname,
        @Ptr
        long value);

    public void take_value(Pointer fieldname, Pointer<GValue> value) {
        this.gst_structure_take_value(Pointer.pointerTo(this, GstStructure.class), Pointer.getPeer(fieldname), Pointer.getPeer(value));
    }

    @Ptr
    protected native long gst_structure_to_string(
        @Ptr
        long structure);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.gst_structure_to_string(Pointer.pointerTo(this, GstStructure.class)));
    }

    @Ptr
    protected native long gst_structure_from_string(
        @Ptr
        long string,
        @Ptr
        long end);

    public Pointer from_string(Pointer string, Pointer end) {
        return Pointer.pointerToAddress(this.gst_structure_from_string(Pointer.getPeer(string), Pointer.getPeer(end)));
    }

    protected native boolean gst_structure_map_in_place(
        @Ptr
        long structure, Object func, Pointer user_data);

    public boolean map_in_place(Object func, Pointer user_data) {
        return this.gst_structure_map_in_place(Pointer.pointerTo(this, GstStructure.class), func, user_data);
    }

    protected native boolean gst_structure_foreach(
        @Ptr
        long structure, Object func, Pointer user_data);

    public boolean foreach(Object func, Pointer user_data) {
        return this.gst_structure_foreach(Pointer.pointerTo(this, GstStructure.class), func, user_data);
    }

}
