
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstClock;
import generated.gstreamer10.gst.GstSystemClock;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioClock
    extends GstSystemClock
{


    public GstAudioClock() {
        super();
    }

    public GstAudioClock(Pointer pointer) {
        super(pointer);
    }

    protected native Object gst_audio_clock_adjust(
        @Ptr
        long clock, Object time);

    public Object adjust(Pointer<GstClock> clock, Object time) {
        return this.gst_audio_clock_adjust(Pointer.getPeer(clock), time);
    }

    protected native Object gst_audio_clock_get_time(
        @Ptr
        long clock);

    public Object get_time(Pointer<GstClock> clock) {
        return this.gst_audio_clock_get_time(Pointer.getPeer(clock));
    }

    protected native void gst_audio_clock_invalidate(
        @Ptr
        long clock);

    public void invalidate(Pointer<GstClock> clock) {
        this.gst_audio_clock_invalidate(Pointer.getPeer(clock));
    }

    protected native void gst_audio_clock_reset(
        @Ptr
        long clock, Object time);

    public void reset(Object time) {
        this.gst_audio_clock_reset(Pointer.pointerTo(this, GstAudioClock.class), time);
    }

    @Field(0)
    public GstSystemClock field_clock() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioClock field_clock(GstSystemClock field_clock) {
        this.io.setNativeObjectField(this, 0, field_clock);
        return this;
    }

    @Field(1)
    public Object field_func() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstAudioClock field_func(Object field_func) {
        this.io.setNativeObjectField(this, 1, field_func);
        return this;
    }

    @Field(2)
    public Object field_time_offset() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstAudioClock field_time_offset(Object field_time_offset) {
        this.io.setNativeObjectField(this, 2, field_time_offset);
        return this;
    }

    @Field(3)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstAudioClock field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 3, field__gst_reserved);
        return this;
    }

    @Field(4)
    public Pointer field_user_data() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioClock field_user_data(Pointer field_user_data) {
        this.io.setNativeObjectField(this, 4, field_user_data);
        return this;
    }

    @Field(5)
    public Object field_last_time() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstAudioClock field_last_time(Object field_last_time) {
        this.io.setNativeObjectField(this, 5, field_last_time);
        return this;
    }

    @Field(6)
    public Object field_destroy_notify() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstAudioClock field_destroy_notify(Object field_destroy_notify) {
        this.io.setNativeObjectField(this, 6, field_destroy_notify);
        return this;
    }

}
