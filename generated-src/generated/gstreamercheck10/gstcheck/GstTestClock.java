
package generated.gstreamercheck10.gstcheck;

import generated.gstreamer10.gst.GstClock;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-check-1.0")
public class GstTestClock
    extends GstClock
{


    public GstTestClock() {
        super();
    }

    public GstTestClock(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_test_clock_advance_time(
        @Ptr
        long test_clock, Object delta);

    public void advance_time(Object delta) {
        this.gst_test_clock_advance_time(Pointer.pointerTo(this, GstTestClock.class), delta);
    }

    protected native Object gst_test_clock_get_next_entry_time(
        @Ptr
        long test_clock);

    public Object get_next_entry_time() {
        return this.gst_test_clock_get_next_entry_time(Pointer.pointerTo(this, GstTestClock.class));
    }

    protected native boolean gst_test_clock_has_id(
        @Ptr
        long test_clock, Object id);

    public boolean has_id(Object id) {
        return this.gst_test_clock_has_id(Pointer.pointerTo(this, GstTestClock.class), id);
    }

    protected native long gst_test_clock_peek_id_count(
        @Ptr
        long test_clock);

    public long peek_id_count() {
        return this.gst_test_clock_peek_id_count(Pointer.pointerTo(this, GstTestClock.class));
    }

    protected native boolean gst_test_clock_peek_next_pending_id(
        @Ptr
        long test_clock,
        @Ptr
        long pending_id);

    public boolean peek_next_pending_id(Pointer<Object> pending_id) {
        return this.gst_test_clock_peek_next_pending_id(Pointer.pointerTo(this, GstTestClock.class), Pointer.getPeer(pending_id));
    }

    protected native Object gst_test_clock_process_next_clock_id(
        @Ptr
        long test_clock);

    public Object process_next_clock_id() {
        return this.gst_test_clock_process_next_clock_id(Pointer.pointerTo(this, GstTestClock.class));
    }

    protected native void gst_test_clock_set_time(
        @Ptr
        long test_clock, Object new_time);

    public void set_time(Object new_time) {
        this.gst_test_clock_set_time(Pointer.pointerTo(this, GstTestClock.class), new_time);
    }

    protected native void gst_test_clock_wait_for_next_pending_id(
        @Ptr
        long test_clock,
        @Ptr
        long pending_id);

    public void wait_for_next_pending_id(Pointer<Object> pending_id) {
        this.gst_test_clock_wait_for_next_pending_id(Pointer.pointerTo(this, GstTestClock.class), Pointer.getPeer(pending_id));
    }

    protected native void gst_test_clock_wait_for_pending_id_count(
        @Ptr
        long test_clock, long count);

    public void wait_for_pending_id_count(long count) {
        this.gst_test_clock_wait_for_pending_id_count(Pointer.pointerTo(this, GstTestClock.class), count);
    }

    @Field(0)
    public GstClock field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTestClock field_parent(GstClock field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTestClock field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
