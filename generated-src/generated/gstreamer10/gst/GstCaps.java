
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GValue;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstCaps
    extends StructObject
{


    public GstCaps() {
        super();
    }

    public GstCaps(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_caps_append(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public void append(Pointer<GstCaps> caps2) {
        this.gst_caps_append(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2));
    }

    protected native boolean gst_caps_is_subset_structure(
        @Ptr
        long caps,
        @Ptr
        long structure);

    public boolean is_subset_structure(Pointer<GstStructure> structure) {
        return this.gst_caps_is_subset_structure(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(structure));
    }

    protected native void gst_caps_append_structure(
        @Ptr
        long caps,
        @Ptr
        long structure);

    public void append_structure(Pointer<GstStructure> structure) {
        this.gst_caps_append_structure(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(structure));
    }

    @Ptr
    protected native long gst_caps_get_structure(
        @Ptr
        long caps, long index);

    public Pointer<GstStructure> get_structure(long index) {
        return Pointer.pointerToAddress(this.gst_caps_get_structure(Pointer.pointerTo(this, GstCaps.class), index), Pointer.class);
    }

    @Ptr
    protected native long gst_caps_intersect_full(
        @Ptr
        long caps1,
        @Ptr
        long caps2, IntValuedEnum<GstCapsIntersectMode> mode);

    public Pointer<GstCaps> intersect_full(Pointer<GstCaps> caps2, IntValuedEnum<GstCapsIntersectMode> mode) {
        return Pointer.pointerToAddress(this.gst_caps_intersect_full(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2), mode), Pointer.class);
    }

    protected native void gst_caps_set_value(
        @Ptr
        long caps,
        @Ptr
        long field,
        @Ptr
        long value);

    public void set_value(Pointer field, Pointer<GValue> value) {
        this.gst_caps_set_value(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(field), Pointer.getPeer(value));
    }

    protected native boolean gst_caps_is_equal_fixed(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public boolean is_equal_fixed(Pointer<GstCaps> caps2) {
        return this.gst_caps_is_equal_fixed(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2));
    }

    @Ptr
    protected native long gst_caps_copy_nth(
        @Ptr
        long caps, long nth);

    public Pointer<GstCaps> copy_nth(long nth) {
        return Pointer.pointerToAddress(this.gst_caps_copy_nth(Pointer.pointerTo(this, GstCaps.class), nth), Pointer.class);
    }

    protected native void gst_caps_set_simple(
        @Ptr
        long caps,
        @Ptr
        long field, Object... varargs);

    public void set_simple(Pointer field, Object... varargs) {
        this.gst_caps_set_simple(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(field), varargs);
    }

    protected native long gst_caps_get_size(
        @Ptr
        long caps);

    public long get_size() {
        return this.gst_caps_get_size(Pointer.pointerTo(this, GstCaps.class));
    }

    protected native boolean gst_caps_is_always_compatible(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public boolean is_always_compatible(Pointer<GstCaps> caps2) {
        return this.gst_caps_is_always_compatible(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2));
    }

    protected native boolean gst_caps_is_equal(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public boolean is_equal(Pointer<GstCaps> caps2) {
        return this.gst_caps_is_equal(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2));
    }

    protected native boolean gst_caps_is_subset_structure_full(
        @Ptr
        long caps,
        @Ptr
        long structure,
        @Ptr
        long features);

    public boolean is_subset_structure_full(Pointer<GstStructure> structure, Pointer<GstCapsFeatures> features) {
        return this.gst_caps_is_subset_structure_full(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(structure), Pointer.getPeer(features));
    }

    @Ptr
    protected native long gst_caps_to_string(
        @Ptr
        long caps);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.gst_caps_to_string(Pointer.pointerTo(this, GstCaps.class)));
    }

    @Ptr
    protected native long gst_caps_from_string(
        @Ptr
        long string);

    public Pointer<GstCaps> from_string(Pointer string) {
        return Pointer.pointerToAddress(this.gst_caps_from_string(Pointer.getPeer(string)), Pointer.class);
    }

    protected native boolean gst_caps_is_fixed(
        @Ptr
        long caps);

    public boolean is_fixed() {
        return this.gst_caps_is_fixed(Pointer.pointerTo(this, GstCaps.class));
    }

    @Ptr
    protected native long gst_caps_merge_structure(
        @Ptr
        long caps,
        @Ptr
        long structure);

    public Pointer<GstCaps> merge_structure(Pointer<GstStructure> structure) {
        return Pointer.pointerToAddress(this.gst_caps_merge_structure(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(structure)), Pointer.class);
    }

    @Field(0)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstCaps field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 0, field_mini_object);
        return this;
    }

    @Ptr
    protected native long gst_caps_get_features(
        @Ptr
        long caps, long index);

    public Pointer<GstCapsFeatures> get_features(long index) {
        return Pointer.pointerToAddress(this.gst_caps_get_features(Pointer.pointerTo(this, GstCaps.class), index), Pointer.class);
    }

    protected native boolean gst_caps_can_intersect(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public boolean can_intersect(Pointer<GstCaps> caps2) {
        return this.gst_caps_can_intersect(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2));
    }

    @Ptr
    protected native long gst_caps_subtract(
        @Ptr
        long minuend,
        @Ptr
        long subtrahend);

    public Pointer<GstCaps> subtract(Pointer<GstCaps> subtrahend) {
        return Pointer.pointerToAddress(this.gst_caps_subtract(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(subtrahend)), Pointer.class);
    }

    @Ptr
    protected native long gst_caps_fixate(
        @Ptr
        long caps);

    public Pointer<GstCaps> fixate() {
        return Pointer.pointerToAddress(this.gst_caps_fixate(Pointer.pointerTo(this, GstCaps.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_caps_steal_structure(
        @Ptr
        long caps, long index);

    public Pointer<GstStructure> steal_structure(long index) {
        return Pointer.pointerToAddress(this.gst_caps_steal_structure(Pointer.pointerTo(this, GstCaps.class), index), Pointer.class);
    }

    protected native boolean gst_caps_is_strictly_equal(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public boolean is_strictly_equal(Pointer<GstCaps> caps2) {
        return this.gst_caps_is_strictly_equal(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2));
    }

    protected native boolean gst_caps_is_subset(
        @Ptr
        long subset,
        @Ptr
        long superset);

    public boolean is_subset(Pointer<GstCaps> superset) {
        return this.gst_caps_is_subset(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(superset));
    }

    @Ptr
    protected native long gst_caps_truncate(
        @Ptr
        long caps);

    public Pointer<GstCaps> truncate() {
        return Pointer.pointerToAddress(this.gst_caps_truncate(Pointer.pointerTo(this, GstCaps.class)), Pointer.class);
    }

    protected native boolean gst_caps_is_any(
        @Ptr
        long caps);

    public boolean is_any() {
        return this.gst_caps_is_any(Pointer.pointerTo(this, GstCaps.class));
    }

    protected native void gst_caps_set_features(
        @Ptr
        long caps, long index,
        @Ptr
        long features);

    public void set_features(long index, Pointer<GstCapsFeatures> features) {
        this.gst_caps_set_features(Pointer.pointerTo(this, GstCaps.class), index, Pointer.getPeer(features));
    }

    @Ptr
    protected native long gst_caps_merge(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public Pointer<GstCaps> merge(Pointer<GstCaps> caps2) {
        return Pointer.pointerToAddress(this.gst_caps_merge(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2)), Pointer.class);
    }

    @Ptr
    protected native long gst_caps_normalize(
        @Ptr
        long caps);

    public Pointer<GstCaps> normalize() {
        return Pointer.pointerToAddress(this.gst_caps_normalize(Pointer.pointerTo(this, GstCaps.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_caps_simplify(
        @Ptr
        long caps);

    public Pointer<GstCaps> simplify() {
        return Pointer.pointerToAddress(this.gst_caps_simplify(Pointer.pointerTo(this, GstCaps.class)), Pointer.class);
    }

    protected native void gst_caps_append_structure_full(
        @Ptr
        long caps,
        @Ptr
        long structure,
        @Ptr
        long features);

    public void append_structure_full(Pointer<GstStructure> structure, Pointer<GstCapsFeatures> features) {
        this.gst_caps_append_structure_full(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(structure), Pointer.getPeer(features));
    }

    @Ptr
    protected native long gst_caps_intersect(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public Pointer<GstCaps> intersect(Pointer<GstCaps> caps2) {
        return Pointer.pointerToAddress(this.gst_caps_intersect(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(caps2)), Pointer.class);
    }

    @Ptr
    protected native long gst_caps_merge_structure_full(
        @Ptr
        long caps,
        @Ptr
        long structure,
        @Ptr
        long features);

    public Pointer<GstCaps> merge_structure_full(Pointer<GstStructure> structure, Pointer<GstCapsFeatures> features) {
        return Pointer.pointerToAddress(this.gst_caps_merge_structure_full(Pointer.pointerTo(this, GstCaps.class), Pointer.getPeer(structure), Pointer.getPeer(features)), Pointer.class);
    }

    protected native boolean gst_caps_is_empty(
        @Ptr
        long caps);

    public boolean is_empty() {
        return this.gst_caps_is_empty(Pointer.pointerTo(this, GstCaps.class));
    }

    protected native void gst_caps_remove_structure(
        @Ptr
        long caps, long idx);

    public void remove_structure(long idx) {
        this.gst_caps_remove_structure(Pointer.pointerTo(this, GstCaps.class), idx);
    }

}
