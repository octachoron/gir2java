
package generated.gstreamercontroller10.gstcontroller;

import generated.glib20.glib.GList;
import generated.glib20.glib.GSList;
import generated.glib20.glib.GSequence;
import generated.glib20.glib.GSequenceIter;
import generated.gstreamer10.gst.GstControlSource;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-controller-1.0")
public class GstTimedValueControlSource
    extends GstControlSource
{


    public GstTimedValueControlSource() {
        super();
    }

    public GstTimedValueControlSource(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_timed_value_control_source_find_control_point_iter(
        @Ptr
        long self, Object timestamp);

    public Pointer<GSequenceIter> find_control_point_iter(Object timestamp) {
        return Pointer.pointerToAddress(this.gst_timed_value_control_source_find_control_point_iter(Pointer.pointerTo(this, GstTimedValueControlSource.class), timestamp), Pointer.class);
    }

    @Ptr
    protected native long gst_timed_value_control_source_get_all(
        @Ptr
        long self);

    public Pointer<GList> get_all() {
        return Pointer.pointerToAddress(this.gst_timed_value_control_source_get_all(Pointer.pointerTo(this, GstTimedValueControlSource.class)), Pointer.class);
    }

    protected native int gst_timed_value_control_source_get_count(
        @Ptr
        long self);

    public int get_count() {
        return this.gst_timed_value_control_source_get_count(Pointer.pointerTo(this, GstTimedValueControlSource.class));
    }

    protected native boolean gst_timed_value_control_source_set(
        @Ptr
        long self, Object timestamp, double value);

    public boolean set(Object timestamp, double value) {
        return this.gst_timed_value_control_source_set(Pointer.pointerTo(this, GstTimedValueControlSource.class), timestamp, value);
    }

    protected native boolean gst_timed_value_control_source_set_from_list(
        @Ptr
        long self,
        @Ptr
        long timedvalues);

    public boolean set_from_list(Pointer<GSList> timedvalues) {
        return this.gst_timed_value_control_source_set_from_list(Pointer.pointerTo(this, GstTimedValueControlSource.class), Pointer.getPeer(timedvalues));
    }

    protected native boolean gst_timed_value_control_source_unset(
        @Ptr
        long self, Object timestamp);

    public boolean unset(Object timestamp) {
        return this.gst_timed_value_control_source_unset(Pointer.pointerTo(this, GstTimedValueControlSource.class), timestamp);
    }

    protected native void gst_timed_value_control_source_unset_all(
        @Ptr
        long self);

    public void unset_all() {
        this.gst_timed_value_control_source_unset_all(Pointer.pointerTo(this, GstTimedValueControlSource.class));
    }

    @Field(0)
    public GstControlSource field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTimedValueControlSource field_parent(GstControlSource field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Object field_lock() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstTimedValueControlSource field_lock(Object field_lock) {
        this.io.setNativeObjectField(this, 1, field_lock);
        return this;
    }

    @Field(2)
    public Pointer<GSequence> field_values() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstTimedValueControlSource field_values(Pointer<GSequence> field_values) {
        this.io.setPointerField(this, 2, field_values);
        return this;
    }

    @Field(3)
    public int field_nvalues() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstTimedValueControlSource field_nvalues(int field_nvalues) {
        this.io.setNativeObjectField(this, 3, field_nvalues);
        return this;
    }

    @Field(4)
    public boolean field_valid_cache() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstTimedValueControlSource field_valid_cache(boolean field_valid_cache) {
        this.io.setNativeObjectField(this, 4, field_valid_cache);
        return this;
    }

    @Field(5)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstTimedValueControlSource field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 5, field_priv);
        return this;
    }

    @Field(6)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstTimedValueControlSource field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 6, field__gst_reserved);
        return this;
    }

}
