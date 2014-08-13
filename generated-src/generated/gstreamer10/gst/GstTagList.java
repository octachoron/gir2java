
package generated.gstreamer10.gst;

import generated.glib20.glib.GDate;
import generated.gobject20.gobject.GValue;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTagList
    extends StructObject
{


    public GstTagList() {
        super();
    }

    public GstTagList(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTagList field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 0, field_mini_object);
        return this;
    }

    protected native void gst_tag_list_foreach(
        @Ptr
        long list, Object func, Pointer user_data);

    public void foreach(Object func, Pointer user_data) {
        this.gst_tag_list_foreach(Pointer.pointerTo(this, GstTagList.class), func, user_data);
    }

    protected native boolean gst_tag_list_get_boolean(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_boolean(Pointer tag, Pointer<Boolean> value) {
        return this.gst_tag_list_get_boolean(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_boolean_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_boolean_index(Pointer tag, long index, Pointer<Boolean> value) {
        return this.gst_tag_list_get_boolean_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_date(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_date(Pointer tag, Pointer<Pointer<GDate>> value) {
        return this.gst_tag_list_get_date(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_date_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_date_index(Pointer tag, long index, Pointer<Pointer<GDate>> value) {
        return this.gst_tag_list_get_date_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_date_time(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_date_time(Pointer tag, Pointer<Pointer<GstDateTime>> value) {
        return this.gst_tag_list_get_date_time(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_date_time_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_date_time_index(Pointer tag, long index, Pointer<Pointer<GstDateTime>> value) {
        return this.gst_tag_list_get_date_time_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_double(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_double(Pointer tag, Pointer<Double> value) {
        return this.gst_tag_list_get_double(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_double_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_double_index(Pointer tag, long index, Pointer<Double> value) {
        return this.gst_tag_list_get_double_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_float(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_float(Pointer tag, Pointer<Float> value) {
        return this.gst_tag_list_get_float(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_float_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_float_index(Pointer tag, long index, Pointer<Float> value) {
        return this.gst_tag_list_get_float_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_int(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_int(Pointer tag, Pointer<Integer> value) {
        return this.gst_tag_list_get_int(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_int64(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_int64(Pointer tag, Pointer<Long> value) {
        return this.gst_tag_list_get_int64(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_int64_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_int64_index(Pointer tag, long index, Pointer<Long> value) {
        return this.gst_tag_list_get_int64_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_int_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_int_index(Pointer tag, long index, Pointer<Integer> value) {
        return this.gst_tag_list_get_int_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_pointer(
        @Ptr
        long list,
        @Ptr
        long tag, Pointer value);

    public boolean get_pointer(Pointer tag, Pointer value) {
        return this.gst_tag_list_get_pointer(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), value);
    }

    protected native boolean gst_tag_list_get_pointer_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index, Pointer value);

    public boolean get_pointer_index(Pointer tag, long index, Pointer value) {
        return this.gst_tag_list_get_pointer_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, value);
    }

    protected native boolean gst_tag_list_get_sample(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long sample);

    public boolean get_sample(Pointer tag, Pointer<Pointer<GstSample>> sample) {
        return this.gst_tag_list_get_sample(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(sample));
    }

    protected native boolean gst_tag_list_get_sample_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long sample);

    public boolean get_sample_index(Pointer tag, long index, Pointer<Pointer<GstSample>> sample) {
        return this.gst_tag_list_get_sample_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(sample));
    }

    protected native boolean gst_tag_list_get_string(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_string(Pointer tag, Pointer value) {
        return this.gst_tag_list_get_string(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_string_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_string_index(Pointer tag, long index, Pointer value) {
        return this.gst_tag_list_get_string_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native long gst_tag_list_get_tag_size(
        @Ptr
        long list,
        @Ptr
        long tag);

    public long get_tag_size(Pointer tag) {
        return this.gst_tag_list_get_tag_size(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag));
    }

    protected native boolean gst_tag_list_get_uint(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_uint(Pointer tag, Pointer<Long> value) {
        return this.gst_tag_list_get_uint(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_uint64(
        @Ptr
        long list,
        @Ptr
        long tag,
        @Ptr
        long value);

    public boolean get_uint64(Pointer tag, Pointer<Long> value) {
        return this.gst_tag_list_get_uint64(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_uint64_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_uint64_index(Pointer tag, long index, Pointer<Long> value) {
        return this.gst_tag_list_get_uint64_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native boolean gst_tag_list_get_uint_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean get_uint_index(Pointer tag, long index, Pointer<Long> value) {
        return this.gst_tag_list_get_uint_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    @Ptr
    protected native long gst_tag_list_get_value_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index);

    public Pointer<GValue> get_value_index(Pointer tag, long index) {
        return Pointer.pointerToAddress(this.gst_tag_list_get_value_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index), Pointer.class);
    }

    protected native boolean gst_tag_list_is_empty(
        @Ptr
        long list);

    public boolean is_empty() {
        return this.gst_tag_list_is_empty(Pointer.pointerTo(this, GstTagList.class));
    }

    protected native boolean gst_tag_list_is_equal(
        @Ptr
        long list1,
        @Ptr
        long list2);

    public boolean is_equal(Pointer list2) {
        return this.gst_tag_list_is_equal(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(list2));
    }

    protected native int gst_tag_list_n_tags(
        @Ptr
        long list);

    public int n_tags() {
        return this.gst_tag_list_n_tags(Pointer.pointerTo(this, GstTagList.class));
    }

    @Ptr
    protected native long gst_tag_list_nth_tag_name(
        @Ptr
        long list, long index);

    public Pointer nth_tag_name(long index) {
        return Pointer.pointerToAddress(this.gst_tag_list_nth_tag_name(Pointer.pointerTo(this, GstTagList.class), index));
    }

    protected native boolean gst_tag_list_peek_string_index(
        @Ptr
        long list,
        @Ptr
        long tag, long index,
        @Ptr
        long value);

    public boolean peek_string_index(Pointer tag, long index, Pointer value) {
        return this.gst_tag_list_peek_string_index(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag), index, Pointer.getPeer(value));
    }

    protected native void gst_tag_list_remove_tag(
        @Ptr
        long list,
        @Ptr
        long tag);

    public void remove_tag(Pointer tag) {
        this.gst_tag_list_remove_tag(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(tag));
    }

    @Ptr
    protected native long gst_tag_list_to_string(
        @Ptr
        long list);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.gst_tag_list_to_string(Pointer.pointerTo(this, GstTagList.class)));
    }

    protected native boolean gst_tag_list_copy_value(
        @Ptr
        long dest,
        @Ptr
        long list,
        @Ptr
        long tag);

    public boolean copy_value(Pointer<GValue> dest, Pointer list, Pointer tag) {
        return this.gst_tag_list_copy_value(Pointer.getPeer(dest), Pointer.getPeer(list), Pointer.getPeer(tag));
    }

    protected native void gst_tag_list_add_values(
        @Ptr
        long list, IntValuedEnum<GstTagMergeMode> mode,
        @Ptr
        long tag, Object... varargs);

    public void add_values(IntValuedEnum<GstTagMergeMode> mode, Pointer tag, Object... varargs) {
        this.gst_tag_list_add_values(Pointer.pointerTo(this, GstTagList.class), mode, Pointer.getPeer(tag), varargs);
    }

    @Ptr
    protected native long gst_tag_list_merge(
        @Ptr
        long list1,
        @Ptr
        long list2, IntValuedEnum<GstTagMergeMode> mode);

    public Pointer<GstTagList> merge(Pointer<GstTagList> list2, IntValuedEnum<GstTagMergeMode> mode) {
        return Pointer.pointerToAddress(this.gst_tag_list_merge(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(list2), mode), Pointer.class);
    }

    protected native void gst_tag_list_add(
        @Ptr
        long list, IntValuedEnum<GstTagMergeMode> mode,
        @Ptr
        long tag, Object... varargs);

    public void add(IntValuedEnum<GstTagMergeMode> mode, Pointer tag, Object... varargs) {
        this.gst_tag_list_add(Pointer.pointerTo(this, GstTagList.class), mode, Pointer.getPeer(tag), varargs);
    }

    protected native void gst_tag_list_set_scope(
        @Ptr
        long list, IntValuedEnum<GstTagScope> scope);

    public void set_scope(IntValuedEnum<GstTagScope> scope) {
        this.gst_tag_list_set_scope(Pointer.pointerTo(this, GstTagList.class), scope);
    }

    protected native void gst_tag_list_add_value(
        @Ptr
        long list, IntValuedEnum<GstTagMergeMode> mode,
        @Ptr
        long tag,
        @Ptr
        long value);

    public void add_value(IntValuedEnum<GstTagMergeMode> mode, Pointer tag, Pointer<GValue> value) {
        this.gst_tag_list_add_value(Pointer.pointerTo(this, GstTagList.class), mode, Pointer.getPeer(tag), Pointer.getPeer(value));
    }

    protected native void gst_tag_list_insert(
        @Ptr
        long into,
        @Ptr
        long from, IntValuedEnum<GstTagMergeMode> mode);

    public void insert(Pointer<GstTagList> from, IntValuedEnum<GstTagMergeMode> mode) {
        this.gst_tag_list_insert(Pointer.pointerTo(this, GstTagList.class), Pointer.getPeer(from), mode);
    }

    protected native IntValuedEnum<GstTagScope> gst_tag_list_get_scope(
        @Ptr
        long list);

    public IntValuedEnum<GstTagScope> get_scope() {
        return this.gst_tag_list_get_scope(Pointer.pointerTo(this, GstTagList.class));
    }

}
