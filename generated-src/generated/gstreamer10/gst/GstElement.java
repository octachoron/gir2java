
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GList;
import generated.glib20.glib.GRecMutex;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstElement
    extends StructObject
{


    public GstElement() {
        super();
    }

    public GstElement(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_element_register(
        @Ptr
        long plugin,
        @Ptr
        long name, long rank, long type);

    public boolean register(Pointer plugin, Pointer name, long rank, long type) {
        return this.gst_element_register(Pointer.getPeer(plugin), Pointer.getPeer(name), rank, type);
    }

    protected native void gst_element_abort_state(
        @Ptr
        long element);

    public void abort_state() {
        this.gst_element_abort_state(Pointer.pointerTo(this, GstElement.class));
    }

    protected native boolean gst_element_add_pad(
        @Ptr
        long element,
        @Ptr
        long pad);

    public boolean add_pad(Pointer pad) {
        return this.gst_element_add_pad(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(pad));
    }

    protected native void gst_element_create_all_pads(
        @Ptr
        long element);

    public void create_all_pads() {
        this.gst_element_create_all_pads(Pointer.pointerTo(this, GstElement.class));
    }

    protected native Object gst_element_get_base_time(
        @Ptr
        long element);

    public Object get_base_time() {
        return this.gst_element_get_base_time(Pointer.pointerTo(this, GstElement.class));
    }

    @Ptr
    protected native long gst_element_get_bus(
        @Ptr
        long element);

    public Pointer<GstBus> get_bus() {
        return Pointer.pointerToAddress(this.gst_element_get_bus(Pointer.pointerTo(this, GstElement.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_element_get_clock(
        @Ptr
        long element);

    public Pointer<GstClock> get_clock() {
        return Pointer.pointerToAddress(this.gst_element_get_clock(Pointer.pointerTo(this, GstElement.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_element_get_compatible_pad(
        @Ptr
        long element,
        @Ptr
        long pad,
        @Ptr
        long caps);

    public Pointer get_compatible_pad(Pointer pad, Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(this.gst_element_get_compatible_pad(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(pad), Pointer.getPeer(caps)));
    }

    @Ptr
    protected native long gst_element_get_compatible_pad_template(
        @Ptr
        long element,
        @Ptr
        long compattempl);

    public Pointer get_compatible_pad_template(Pointer compattempl) {
        return Pointer.pointerToAddress(this.gst_element_get_compatible_pad_template(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(compattempl)));
    }

    @Ptr
    protected native long gst_element_get_factory(
        @Ptr
        long element);

    public Pointer get_factory() {
        return Pointer.pointerToAddress(this.gst_element_get_factory(Pointer.pointerTo(this, GstElement.class)));
    }

    @Ptr
    protected native long gst_element_get_request_pad(
        @Ptr
        long element,
        @Ptr
        long name);

    public Pointer get_request_pad(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_get_request_pad(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(name)));
    }

    protected native Object gst_element_get_start_time(
        @Ptr
        long element);

    public Object get_start_time() {
        return this.gst_element_get_start_time(Pointer.pointerTo(this, GstElement.class));
    }

    @Ptr
    protected native long gst_element_get_static_pad(
        @Ptr
        long element,
        @Ptr
        long name);

    public Pointer get_static_pad(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_get_static_pad(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(name)));
    }

    protected native boolean gst_element_is_locked_state(
        @Ptr
        long element);

    public boolean is_locked_state() {
        return this.gst_element_is_locked_state(Pointer.pointerTo(this, GstElement.class));
    }

    @Ptr
    protected native long gst_element_iterate_pads(
        @Ptr
        long element);

    public Pointer iterate_pads() {
        return Pointer.pointerToAddress(this.gst_element_iterate_pads(Pointer.pointerTo(this, GstElement.class)));
    }

    @Ptr
    protected native long gst_element_iterate_sink_pads(
        @Ptr
        long element);

    public Pointer iterate_sink_pads() {
        return Pointer.pointerToAddress(this.gst_element_iterate_sink_pads(Pointer.pointerTo(this, GstElement.class)));
    }

    @Ptr
    protected native long gst_element_iterate_src_pads(
        @Ptr
        long element);

    public Pointer iterate_src_pads() {
        return Pointer.pointerToAddress(this.gst_element_iterate_src_pads(Pointer.pointerTo(this, GstElement.class)));
    }

    protected native boolean gst_element_link(
        @Ptr
        long src,
        @Ptr
        long dest);

    public boolean link(Pointer dest) {
        return this.gst_element_link(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(dest));
    }

    protected native boolean gst_element_link_filtered(
        @Ptr
        long src,
        @Ptr
        long dest,
        @Ptr
        long filter);

    public boolean link_filtered(Pointer dest, Pointer<GstCaps> filter) {
        return this.gst_element_link_filtered(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(dest), Pointer.getPeer(filter));
    }

    protected native boolean gst_element_link_many(
        @Ptr
        long element_1,
        @Ptr
        long element_2, Object... varargs);

    public boolean link_many(Pointer element_2, Object... varargs) {
        return this.gst_element_link_many(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(element_2), varargs);
    }

    protected native boolean gst_element_link_pads(
        @Ptr
        long src,
        @Ptr
        long srcpadname,
        @Ptr
        long dest,
        @Ptr
        long destpadname);

    public boolean link_pads(Pointer srcpadname, Pointer dest, Pointer destpadname) {
        return this.gst_element_link_pads(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname));
    }

    protected native boolean gst_element_link_pads_filtered(
        @Ptr
        long src,
        @Ptr
        long srcpadname,
        @Ptr
        long dest,
        @Ptr
        long destpadname,
        @Ptr
        long filter);

    public boolean link_pads_filtered(Pointer srcpadname, Pointer dest, Pointer destpadname, Pointer<GstCaps> filter) {
        return this.gst_element_link_pads_filtered(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname), Pointer.getPeer(filter));
    }

    protected native void gst_element_lost_state(
        @Ptr
        long element);

    public void lost_state() {
        this.gst_element_lost_state(Pointer.pointerTo(this, GstElement.class));
    }

    protected native void gst_element_no_more_pads(
        @Ptr
        long element);

    public void no_more_pads() {
        this.gst_element_no_more_pads(Pointer.pointerTo(this, GstElement.class));
    }

    protected native boolean gst_element_post_message(
        @Ptr
        long element,
        @Ptr
        long message);

    public boolean post_message(Pointer message) {
        return this.gst_element_post_message(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(message));
    }

    @Ptr
    protected native long gst_element_provide_clock(
        @Ptr
        long element);

    public Pointer<GstClock> provide_clock() {
        return Pointer.pointerToAddress(this.gst_element_provide_clock(Pointer.pointerTo(this, GstElement.class)), Pointer.class);
    }

    protected native boolean gst_element_query(
        @Ptr
        long element,
        @Ptr
        long query);

    public boolean query(Pointer query) {
        return this.gst_element_query(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(query));
    }

    protected native void gst_element_release_request_pad(
        @Ptr
        long element,
        @Ptr
        long pad);

    public void release_request_pad(Pointer pad) {
        this.gst_element_release_request_pad(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(pad));
    }

    protected native boolean gst_element_remove_pad(
        @Ptr
        long element,
        @Ptr
        long pad);

    public boolean remove_pad(Pointer pad) {
        return this.gst_element_remove_pad(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(pad));
    }

    @Ptr
    protected native long gst_element_request_pad(
        @Ptr
        long element,
        @Ptr
        long templ,
        @Ptr
        long name,
        @Ptr
        long caps);

    public Pointer request_pad(Pointer templ, Pointer name, Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(this.gst_element_request_pad(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(templ), Pointer.getPeer(name), Pointer.getPeer(caps)));
    }

    protected native boolean gst_element_send_event(
        @Ptr
        long element,
        @Ptr
        long event);

    public boolean send_event(Pointer event) {
        return this.gst_element_send_event(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(event));
    }

    protected native void gst_element_set_base_time(
        @Ptr
        long element, Object time);

    public void set_base_time(Object time) {
        this.gst_element_set_base_time(Pointer.pointerTo(this, GstElement.class), time);
    }

    protected native void gst_element_set_bus(
        @Ptr
        long element,
        @Ptr
        long bus);

    public void set_bus(Pointer<GstBus> bus) {
        this.gst_element_set_bus(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(bus));
    }

    protected native boolean gst_element_set_clock(
        @Ptr
        long element,
        @Ptr
        long clock);

    public boolean set_clock(Pointer<GstClock> clock) {
        return this.gst_element_set_clock(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(clock));
    }

    protected native void gst_element_set_context(
        @Ptr
        long element,
        @Ptr
        long context);

    public void set_context(Pointer<GstContext> context) {
        this.gst_element_set_context(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(context));
    }

    protected native boolean gst_element_set_locked_state(
        @Ptr
        long element, boolean locked_state);

    public boolean set_locked_state(boolean locked_state) {
        return this.gst_element_set_locked_state(Pointer.pointerTo(this, GstElement.class), locked_state);
    }

    protected native void gst_element_set_start_time(
        @Ptr
        long element, Object time);

    public void set_start_time(Object time) {
        this.gst_element_set_start_time(Pointer.pointerTo(this, GstElement.class), time);
    }

    protected native boolean gst_element_sync_state_with_parent(
        @Ptr
        long element);

    public boolean sync_state_with_parent() {
        return this.gst_element_sync_state_with_parent(Pointer.pointerTo(this, GstElement.class));
    }

    protected native void gst_element_unlink(
        @Ptr
        long src,
        @Ptr
        long dest);

    public void unlink(Pointer dest) {
        this.gst_element_unlink(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(dest));
    }

    protected native void gst_element_unlink_many(
        @Ptr
        long element_1,
        @Ptr
        long element_2, Object... varargs);

    public void unlink_many(Pointer element_2, Object... varargs) {
        this.gst_element_unlink_many(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(element_2), varargs);
    }

    protected native void gst_element_unlink_pads(
        @Ptr
        long src,
        @Ptr
        long srcpadname,
        @Ptr
        long dest,
        @Ptr
        long destpadname);

    public void unlink_pads(Pointer srcpadname, Pointer dest, Pointer destpadname) {
        this.gst_element_unlink_pads(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname));
    }

    @Field(0)
    public int field_numpads() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstElement field_numpads(int field_numpads) {
        this.io.setNativeObjectField(this, 0, field_numpads);
        return this;
    }

    @Field(1)
    public Pointer<GList> field_srcpads() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstElement field_srcpads(Pointer<GList> field_srcpads) {
        this.io.setPointerField(this, 1, field_srcpads);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstElement field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    @Field(3)
    public Object field_base_time() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstElement field_base_time(Object field_base_time) {
        this.io.setNativeObjectField(this, 3, field_base_time);
        return this;
    }

    @Field(4)
    public GCond field_state_cond() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstElement field_state_cond(GCond field_state_cond) {
        this.io.setNativeObjectField(this, 4, field_state_cond);
        return this;
    }

    @Field(5)
    public Pointer<GList> field_pads() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstElement field_pads(Pointer<GList> field_pads) {
        this.io.setPointerField(this, 5, field_pads);
        return this;
    }

    protected native void gst_element_message_full(
        @Ptr
        long element, Object type, Object domain, int code,
        @Ptr
        long text,
        @Ptr
        long debug,
        @Ptr
        long file,
        @Ptr
        long function, int line);

    public void message_full(Object type, Object domain, int code, Pointer text, Pointer debug, Pointer file, Pointer function, int line) {
        this.gst_element_message_full(Pointer.pointerTo(this, GstElement.class), type, domain, code, Pointer.getPeer(text), Pointer.getPeer(debug), Pointer.getPeer(file), Pointer.getPeer(function), line);
    }

    @Field(6)
    public GRecMutex field_state_lock() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstElement field_state_lock(GRecMutex field_state_lock) {
        this.io.setNativeObjectField(this, 6, field_state_lock);
        return this;
    }

    protected native boolean gst_element_query_duration(
        @Ptr
        long element, IntValuedEnum<GstFormat> format,
        @Ptr
        long duration);

    public boolean query_duration(IntValuedEnum<GstFormat> format, Pointer<Long> duration) {
        return this.gst_element_query_duration(Pointer.pointerTo(this, GstElement.class), format, Pointer.getPeer(duration));
    }

    @Field(7)
    public IntValuedEnum<GstStateChangeReturn> field_last_return() {
        return this.io.getEnumField(this, 7);
    }

    @Field(7)
    public GstElement field_last_return(IntValuedEnum<GstStateChangeReturn> field_last_return) {
        this.io.setEnumField(this, 7, field_last_return);
        return this;
    }

    @Ptr
    protected native long gst_element_state_change_return_get_name(IntValuedEnum<GstStateChangeReturn> state_ret);

    public Pointer state_change_return_get_name(IntValuedEnum<GstStateChangeReturn> state_ret) {
        return Pointer.pointerToAddress(this.gst_element_state_change_return_get_name(state_ret));
    }

    protected native boolean gst_element_query_convert(
        @Ptr
        long element, IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_val);

    public boolean query_convert(IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_val) {
        return this.gst_element_query_convert(Pointer.pointerTo(this, GstElement.class), src_format, src_val, dest_format, Pointer.getPeer(dest_val));
    }

    protected native boolean gst_element_seek(
        @Ptr
        long element, double rate, IntValuedEnum<GstFormat> format, Object flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop);

    public boolean seek(double rate, IntValuedEnum<GstFormat> format, Object flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop) {
        return this.gst_element_seek(Pointer.pointerTo(this, GstElement.class), rate, format, flags, start_type, start, stop_type, stop);
    }

    @Ptr
    protected native long gst_element_state_get_name(IntValuedEnum<GstState> state);

    public Pointer state_get_name(IntValuedEnum<GstState> state) {
        return Pointer.pointerToAddress(this.gst_element_state_get_name(state));
    }

    @Field(8)
    public Pointer<GstClock> field_clock() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstElement field_clock(Pointer<GstClock> field_clock) {
        this.io.setPointerField(this, 8, field_clock);
        return this;
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_set_state(
        @Ptr
        long element, IntValuedEnum<GstState> state);

    public IntValuedEnum<GstStateChangeReturn> set_state(IntValuedEnum<GstState> state) {
        return this.gst_element_set_state(Pointer.pointerTo(this, GstElement.class), state);
    }

    protected native boolean gst_element_link_pads_full(
        @Ptr
        long src,
        @Ptr
        long srcpadname,
        @Ptr
        long dest,
        @Ptr
        long destpadname, Object flags);

    public boolean link_pads_full(Pointer srcpadname, Pointer<GstElement> dest, Pointer destpadname, Object flags) {
        return this.gst_element_link_pads_full(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname), flags);
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_continue_state(
        @Ptr
        long element, IntValuedEnum<GstStateChangeReturn> ret);

    public IntValuedEnum<GstStateChangeReturn> continue_state(IntValuedEnum<GstStateChangeReturn> ret) {
        return this.gst_element_continue_state(Pointer.pointerTo(this, GstElement.class), ret);
    }

    @Field(9)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstElement field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 9, field_object);
        return this;
    }

    @Field(10)
    public IntValuedEnum<GstState> field_current_state() {
        return this.io.getEnumField(this, 10);
    }

    @Field(10)
    public GstElement field_current_state(IntValuedEnum<GstState> field_current_state) {
        this.io.setEnumField(this, 10, field_current_state);
        return this;
    }

    @Field(11)
    public Object field_start_time() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstElement field_start_time(Object field_start_time) {
        this.io.setNativeObjectField(this, 11, field_start_time);
        return this;
    }

    protected native boolean gst_element_seek_simple(
        @Ptr
        long element, IntValuedEnum<GstFormat> format, Object seek_flags, long seek_pos);

    public boolean seek_simple(IntValuedEnum<GstFormat> format, Object seek_flags, long seek_pos) {
        return this.gst_element_seek_simple(Pointer.pointerTo(this, GstElement.class), format, seek_flags, seek_pos);
    }

    @Field(12)
    public long field_state_cookie() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GstElement field_state_cookie(long field_state_cookie) {
        this.io.setNativeObjectField(this, 12, field_state_cookie);
        return this;
    }

    @Field(13)
    public IntValuedEnum<GstState> field_next_state() {
        return this.io.getEnumField(this, 13);
    }

    @Field(13)
    public GstElement field_next_state(IntValuedEnum<GstState> field_next_state) {
        this.io.setEnumField(this, 13, field_next_state);
        return this;
    }

    @Field(14)
    public Pointer<GstBus> field_bus() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    public GstElement field_bus(Pointer<GstBus> field_bus) {
        this.io.setPointerField(this, 14, field_bus);
        return this;
    }

    @Field(15)
    public int field_numsinkpads() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GstElement field_numsinkpads(int field_numsinkpads) {
        this.io.setNativeObjectField(this, 15, field_numsinkpads);
        return this;
    }

    protected native boolean gst_element_query_position(
        @Ptr
        long element, IntValuedEnum<GstFormat> format,
        @Ptr
        long cur);

    public boolean query_position(IntValuedEnum<GstFormat> format, Pointer<Long> cur) {
        return this.gst_element_query_position(Pointer.pointerTo(this, GstElement.class), format, Pointer.getPeer(cur));
    }

    @Field(16)
    public IntValuedEnum<GstState> field_pending_state() {
        return this.io.getEnumField(this, 16);
    }

    @Field(16)
    public GstElement field_pending_state(IntValuedEnum<GstState> field_pending_state) {
        this.io.setEnumField(this, 16, field_pending_state);
        return this;
    }

    @Field(17)
    public int field_numsrcpads() {
        return this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public GstElement field_numsrcpads(int field_numsrcpads) {
        this.io.setNativeObjectField(this, 17, field_numsrcpads);
        return this;
    }

    @Field(18)
    public Pointer<GList> field_sinkpads() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public GstElement field_sinkpads(Pointer<GList> field_sinkpads) {
        this.io.setPointerField(this, 18, field_sinkpads);
        return this;
    }

    @Field(19)
    public IntValuedEnum<GstState> field_target_state() {
        return this.io.getEnumField(this, 19);
    }

    @Field(19)
    public GstElement field_target_state(IntValuedEnum<GstState> field_target_state) {
        this.io.setEnumField(this, 19, field_target_state);
        return this;
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_get_state(
        @Ptr
        long element,
        @Ptr
        long state,
        @Ptr
        long pending, Object timeout);

    public IntValuedEnum<GstStateChangeReturn> get_state(Pointer<IntValuedEnum<GstState>> state, Pointer<IntValuedEnum<GstState>> pending, Object timeout) {
        return this.gst_element_get_state(Pointer.pointerTo(this, GstElement.class), Pointer.getPeer(state), Pointer.getPeer(pending), timeout);
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_change_state(
        @Ptr
        long element, IntValuedEnum<GstStateChange> transition);

    public IntValuedEnum<GstStateChangeReturn> change_state(IntValuedEnum<GstStateChange> transition) {
        return this.gst_element_change_state(Pointer.pointerTo(this, GstElement.class), transition);
    }

    @Field(20)
    public long field_pads_cookie() {
        return this.io.getNativeObjectField(this, 20);
    }

    @Field(20)
    public GstElement field_pads_cookie(long field_pads_cookie) {
        this.io.setNativeObjectField(this, 20, field_pads_cookie);
        return this;
    }

    @Ptr
    protected native long gst_element_make_from_uri(IntValuedEnum<GstURIType> type,
        @Ptr
        long uri,
        @Ptr
        long elementname);

    public Pointer<GstElement> make_from_uri(IntValuedEnum<GstURIType> type, Pointer uri, Pointer elementname) {
        return Pointer.pointerToAddress(this.gst_element_make_from_uri(type, Pointer.getPeer(uri), Pointer.getPeer(elementname)), Pointer.class);
    }

}
