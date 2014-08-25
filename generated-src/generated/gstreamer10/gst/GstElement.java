
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GList;
import generated.glib20.glib.GRecMutex;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstElement
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstElement() {
        super();
    }

    public GstElement(Pointer pointer) {
        super(pointer);
    }

    protected static native boolean gst_element_register(
        @Ptr
        long plugin,
        @Ptr
        long name, long rank, long type);

    public static boolean register(Pointer plugin, Pointer name, long rank, long type) {
        return GstElement.gst_element_register(Pointer.getPeer(plugin), Pointer.getPeer(name), rank, type);
    }

    protected native void gst_element_abort_state(
        @Ptr
        long element);

    public void abort_state() {
        this.gst_element_abort_state(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    protected native boolean gst_element_add_pad(
        @Ptr
        long element,
        @Ptr
        long pad);

    public boolean add_pad(Pointer pad) {
        return this.gst_element_add_pad(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(pad));
    }

    protected native void gst_element_create_all_pads(
        @Ptr
        long element);

    public void create_all_pads() {
        this.gst_element_create_all_pads(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    protected native long gst_element_get_base_time(
        @Ptr
        long element);

    public long get_base_time() {
        return this.gst_element_get_base_time(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    @Ptr
    protected native long gst_element_get_bus(
        @Ptr
        long element);

    public Pointer<GstBus> get_bus() {
        return Pointer.pointerToAddress(this.gst_element_get_bus(Pointer.pointerTo(this, GstElement.class).getPeer()), GstBus.class);
    }

    @Ptr
    protected native long gst_element_get_clock(
        @Ptr
        long element);

    public Pointer<GstClock> get_clock() {
        return Pointer.pointerToAddress(this.gst_element_get_clock(Pointer.pointerTo(this, GstElement.class).getPeer()), GstClock.class);
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
        return Pointer.pointerToAddress(this.gst_element_get_compatible_pad(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(pad), Pointer.getPeer(caps)));
    }

    @Ptr
    protected native long gst_element_get_compatible_pad_template(
        @Ptr
        long element,
        @Ptr
        long compattempl);

    public Pointer get_compatible_pad_template(Pointer compattempl) {
        return Pointer.pointerToAddress(this.gst_element_get_compatible_pad_template(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(compattempl)));
    }

    @Ptr
    protected native long gst_element_get_factory(
        @Ptr
        long element);

    public Pointer get_factory() {
        return Pointer.pointerToAddress(this.gst_element_get_factory(Pointer.pointerTo(this, GstElement.class).getPeer()));
    }

    @Ptr
    protected native long gst_element_get_request_pad(
        @Ptr
        long element,
        @Ptr
        long name);

    public Pointer get_request_pad(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_get_request_pad(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(name)));
    }

    protected native long gst_element_get_start_time(
        @Ptr
        long element);

    public long get_start_time() {
        return this.gst_element_get_start_time(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    @Ptr
    protected native long gst_element_get_static_pad(
        @Ptr
        long element,
        @Ptr
        long name);

    public Pointer get_static_pad(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_get_static_pad(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(name)));
    }

    protected native boolean gst_element_is_locked_state(
        @Ptr
        long element);

    public boolean is_locked_state() {
        return this.gst_element_is_locked_state(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    @Ptr
    protected native long gst_element_iterate_pads(
        @Ptr
        long element);

    public Pointer iterate_pads() {
        return Pointer.pointerToAddress(this.gst_element_iterate_pads(Pointer.pointerTo(this, GstElement.class).getPeer()));
    }

    @Ptr
    protected native long gst_element_iterate_sink_pads(
        @Ptr
        long element);

    public Pointer iterate_sink_pads() {
        return Pointer.pointerToAddress(this.gst_element_iterate_sink_pads(Pointer.pointerTo(this, GstElement.class).getPeer()));
    }

    @Ptr
    protected native long gst_element_iterate_src_pads(
        @Ptr
        long element);

    public Pointer iterate_src_pads() {
        return Pointer.pointerToAddress(this.gst_element_iterate_src_pads(Pointer.pointerTo(this, GstElement.class).getPeer()));
    }

    protected native boolean gst_element_link(
        @Ptr
        long src,
        @Ptr
        long dest);

    public boolean link(Pointer dest) {
        return this.gst_element_link(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(dest));
    }

    protected native boolean gst_element_link_filtered(
        @Ptr
        long src,
        @Ptr
        long dest,
        @Ptr
        long filter);

    public boolean link_filtered(Pointer dest, Pointer<GstCaps> filter) {
        return this.gst_element_link_filtered(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(dest), Pointer.getPeer(filter));
    }

    protected native boolean gst_element_link_many(
        @Ptr
        long element_1,
        @Ptr
        long element_2, Object... varargs);

    public boolean link_many(Pointer element_2, Object... varargs) {
        return this.gst_element_link_many(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(element_2), varargs);
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
        return this.gst_element_link_pads(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname));
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
        return this.gst_element_link_pads_filtered(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname), Pointer.getPeer(filter));
    }

    protected native void gst_element_lost_state(
        @Ptr
        long element);

    public void lost_state() {
        this.gst_element_lost_state(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    protected native void gst_element_no_more_pads(
        @Ptr
        long element);

    public void no_more_pads() {
        this.gst_element_no_more_pads(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    protected native boolean gst_element_post_message(
        @Ptr
        long element,
        @Ptr
        long message);

    public boolean post_message(Pointer message) {
        return this.gst_element_post_message(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(message));
    }

    @Ptr
    protected native long gst_element_provide_clock(
        @Ptr
        long element);

    public Pointer<GstClock> provide_clock() {
        return Pointer.pointerToAddress(this.gst_element_provide_clock(Pointer.pointerTo(this, GstElement.class).getPeer()), GstClock.class);
    }

    protected native boolean gst_element_query(
        @Ptr
        long element,
        @Ptr
        long query);

    public boolean query(Pointer query) {
        return this.gst_element_query(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(query));
    }

    protected native void gst_element_release_request_pad(
        @Ptr
        long element,
        @Ptr
        long pad);

    public void release_request_pad(Pointer pad) {
        this.gst_element_release_request_pad(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(pad));
    }

    protected native boolean gst_element_remove_pad(
        @Ptr
        long element,
        @Ptr
        long pad);

    public boolean remove_pad(Pointer pad) {
        return this.gst_element_remove_pad(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(pad));
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
        return Pointer.pointerToAddress(this.gst_element_request_pad(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(templ), Pointer.getPeer(name), Pointer.getPeer(caps)));
    }

    protected native boolean gst_element_send_event(
        @Ptr
        long element,
        @Ptr
        long event);

    public boolean send_event(Pointer event) {
        return this.gst_element_send_event(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(event));
    }

    protected native void gst_element_set_base_time(
        @Ptr
        long element, long time);

    public void set_base_time(long time) {
        this.gst_element_set_base_time(Pointer.pointerTo(this, GstElement.class).getPeer(), time);
    }

    protected native void gst_element_set_bus(
        @Ptr
        long element,
        @Ptr
        long bus);

    public void set_bus(Pointer<GstBus> bus) {
        this.gst_element_set_bus(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(bus));
    }

    protected native boolean gst_element_set_clock(
        @Ptr
        long element,
        @Ptr
        long clock);

    public boolean set_clock(Pointer<GstClock> clock) {
        return this.gst_element_set_clock(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(clock));
    }

    protected native void gst_element_set_context(
        @Ptr
        long element,
        @Ptr
        long context);

    public void set_context(Pointer<GstContext> context) {
        this.gst_element_set_context(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(context));
    }

    protected native boolean gst_element_set_locked_state(
        @Ptr
        long element, boolean locked_state);

    public boolean set_locked_state(boolean locked_state) {
        return this.gst_element_set_locked_state(Pointer.pointerTo(this, GstElement.class).getPeer(), locked_state);
    }

    protected native void gst_element_set_start_time(
        @Ptr
        long element, long time);

    public void set_start_time(long time) {
        this.gst_element_set_start_time(Pointer.pointerTo(this, GstElement.class).getPeer(), time);
    }

    protected native boolean gst_element_sync_state_with_parent(
        @Ptr
        long element);

    public boolean sync_state_with_parent() {
        return this.gst_element_sync_state_with_parent(Pointer.pointerTo(this, GstElement.class).getPeer());
    }

    protected native void gst_element_unlink(
        @Ptr
        long src,
        @Ptr
        long dest);

    public void unlink(Pointer dest) {
        this.gst_element_unlink(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(dest));
    }

    protected native void gst_element_unlink_many(
        @Ptr
        long element_1,
        @Ptr
        long element_2, Object... varargs);

    public void unlink_many(Pointer element_2, Object... varargs) {
        this.gst_element_unlink_many(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(element_2), varargs);
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
        this.gst_element_unlink_pads(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname));
    }

    @Field(0)
    public Pointer<GstBus> gstelement_field_bus() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstElement gstelement_field_bus(Pointer<GstBus> gstelement_field_bus) {
        this.io.setPointerField(this, 0, gstelement_field_bus);
        return this;
    }

    protected native boolean gst_element_query_position(
        @Ptr
        long element, IntValuedEnum<GstFormat> format,
        @Ptr
        long cur);

    public boolean query_position(IntValuedEnum<GstFormat> format, Pointer<Long> cur) {
        return this.gst_element_query_position(Pointer.pointerTo(this, GstElement.class).getPeer(), format, Pointer.getPeer(cur));
    }

    @Field(1)
    public long gstelement_field_start_time() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstElement gstelement_field_start_time(long gstelement_field_start_time) {
        this.io.setLongField(this, 1, gstelement_field_start_time);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstState> gstelement_field_current_state() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstElement gstelement_field_current_state(IntValuedEnum<GstState> gstelement_field_current_state) {
        this.io.setEnumField(this, 2, gstelement_field_current_state);
        return this;
    }

    @Field(3)
    public long gstelement_field_base_time() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstElement gstelement_field_base_time(long gstelement_field_base_time) {
        this.io.setLongField(this, 3, gstelement_field_base_time);
        return this;
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_set_state(
        @Ptr
        long element, IntValuedEnum<GstState> state);

    public IntValuedEnum<GstStateChangeReturn> set_state(IntValuedEnum<GstState> state) {
        return this.gst_element_set_state(Pointer.pointerTo(this, GstElement.class).getPeer(), state);
    }

    @Field(4)
    public Pointer<GList> gstelement_field_pads() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstElement gstelement_field_pads(Pointer<GList> gstelement_field_pads) {
        this.io.setPointerField(this, 4, gstelement_field_pads);
        return this;
    }

    protected native boolean gst_element_link_pads_full(
        @Ptr
        long src,
        @Ptr
        long srcpadname,
        @Ptr
        long dest,
        @Ptr
        long destpadname, IntValuedEnum<GstPadLinkCheck> flags);

    public boolean link_pads_full(Pointer srcpadname, Pointer<GstElement> dest, Pointer destpadname, IntValuedEnum<GstPadLinkCheck> flags) {
        return this.gst_element_link_pads_full(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(srcpadname), Pointer.getPeer(dest), Pointer.getPeer(destpadname), flags);
    }

    @Field(5)
    public IntValuedEnum<GstState> gstelement_field_next_state() {
        return this.io.getEnumField(this, 5);
    }

    @Field(5)
    public GstElement gstelement_field_next_state(IntValuedEnum<GstState> gstelement_field_next_state) {
        this.io.setEnumField(this, 5, gstelement_field_next_state);
        return this;
    }

    @Field(6)
    public GCond gstelement_field_state_cond() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstElement gstelement_field_state_cond(GCond gstelement_field_state_cond) {
        this.io.setNativeObjectField(this, 6, gstelement_field_state_cond);
        return this;
    }

    protected native boolean gst_element_query_convert(
        @Ptr
        long element, IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_val);

    public boolean query_convert(IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_val) {
        return this.gst_element_query_convert(Pointer.pointerTo(this, GstElement.class).getPeer(), src_format, src_val, dest_format, Pointer.getPeer(dest_val));
    }

    @Field(7)
    public Pointer<GList> gstelement_field_sinkpads() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstElement gstelement_field_sinkpads(Pointer<GList> gstelement_field_sinkpads) {
        this.io.setPointerField(this, 7, gstelement_field_sinkpads);
        return this;
    }

    @Ptr
    protected static native long gst_element_make_from_uri(IntValuedEnum<GstURIType> type,
        @Ptr
        long uri,
        @Ptr
        long elementname);

    public static Pointer<GstElement> make_from_uri(IntValuedEnum<GstURIType> type, Pointer uri, Pointer elementname) {
        return Pointer.pointerToAddress(GstElement.gst_element_make_from_uri(type, Pointer.getPeer(uri), Pointer.getPeer(elementname)), GstElement.class);
    }

    @Ptr
    protected static native long gst_element_state_change_return_get_name(IntValuedEnum<GstStateChangeReturn> state_ret);

    public static Pointer state_change_return_get_name(IntValuedEnum<GstStateChangeReturn> state_ret) {
        return Pointer.pointerToAddress(GstElement.gst_element_state_change_return_get_name(state_ret));
    }

    @Field(8)
    public int gstelement_field_numsrcpads() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public GstElement gstelement_field_numsrcpads(int gstelement_field_numsrcpads) {
        this.io.setIntField(this, 8, gstelement_field_numsrcpads);
        return this;
    }

    @Field(9)
    public Pointer<GstClock> gstelement_field_clock() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstElement gstelement_field_clock(Pointer<GstClock> gstelement_field_clock) {
        this.io.setPointerField(this, 9, gstelement_field_clock);
        return this;
    }

    protected native boolean gst_element_seek_simple(
        @Ptr
        long element, IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> seek_flags, long seek_pos);

    public boolean seek_simple(IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> seek_flags, long seek_pos) {
        return this.gst_element_seek_simple(Pointer.pointerTo(this, GstElement.class).getPeer(), format, seek_flags, seek_pos);
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_continue_state(
        @Ptr
        long element, IntValuedEnum<GstStateChangeReturn> ret);

    public IntValuedEnum<GstStateChangeReturn> continue_state(IntValuedEnum<GstStateChangeReturn> ret) {
        return this.gst_element_continue_state(Pointer.pointerTo(this, GstElement.class).getPeer(), ret);
    }

    @Field(10)
    public IntValuedEnum<GstState> gstelement_field_pending_state() {
        return this.io.getEnumField(this, 10);
    }

    @Field(10)
    public GstElement gstelement_field_pending_state(IntValuedEnum<GstState> gstelement_field_pending_state) {
        this.io.setEnumField(this, 10, gstelement_field_pending_state);
        return this;
    }

    protected native void gst_element_message_full(
        @Ptr
        long element, IntValuedEnum<GstMessageType> type, long domain, int code,
        @Ptr
        long text,
        @Ptr
        long debug,
        @Ptr
        long file,
        @Ptr
        long function, int line);

    public void message_full(IntValuedEnum<GstMessageType> type, long domain, int code, Pointer text, Pointer debug, Pointer file, Pointer function, int line) {
        this.gst_element_message_full(Pointer.pointerTo(this, GstElement.class).getPeer(), type, domain, code, Pointer.getPeer(text), Pointer.getPeer(debug), Pointer.getPeer(file), Pointer.getPeer(function), line);
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_change_state(
        @Ptr
        long element, IntValuedEnum<GstStateChange> transition);

    public IntValuedEnum<GstStateChangeReturn> change_state(IntValuedEnum<GstStateChange> transition) {
        return this.gst_element_change_state(Pointer.pointerTo(this, GstElement.class).getPeer(), transition);
    }

    @Field(11)
    public long gstelement_field_pads_cookie() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GstElement gstelement_field_pads_cookie(long gstelement_field_pads_cookie) {
        this.io.setLongField(this, 11, gstelement_field_pads_cookie);
        return this;
    }

    @Field(12)
    public IntValuedEnum<GstState> gstelement_field_target_state() {
        return this.io.getEnumField(this, 12);
    }

    @Field(12)
    public GstElement gstelement_field_target_state(IntValuedEnum<GstState> gstelement_field_target_state) {
        this.io.setEnumField(this, 12, gstelement_field_target_state);
        return this;
    }

    protected native IntValuedEnum<GstStateChangeReturn> gst_element_get_state(
        @Ptr
        long element,
        @Ptr
        long state,
        @Ptr
        long pending, long timeout);

    public IntValuedEnum<GstStateChangeReturn> get_state(Pointer<IntValuedEnum<GstState>> state, Pointer<IntValuedEnum<GstState>> pending, long timeout) {
        return this.gst_element_get_state(Pointer.pointerTo(this, GstElement.class).getPeer(), Pointer.getPeer(state), Pointer.getPeer(pending), timeout);
    }

    @Ptr
    protected static native long gst_element_state_get_name(IntValuedEnum<GstState> state);

    public static Pointer state_get_name(IntValuedEnum<GstState> state) {
        return Pointer.pointerToAddress(GstElement.gst_element_state_get_name(state));
    }

    @Field(13)
    public GstObject gstelement_field_object() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GstElement gstelement_field_object(GstObject gstelement_field_object) {
        this.io.setNativeObjectField(this, 13, gstelement_field_object);
        return this;
    }

    @Field(14)
    public int gstelement_field_numpads() {
        return this.io.getIntField(this, 14);
    }

    @Field(14)
    public GstElement gstelement_field_numpads(int gstelement_field_numpads) {
        this.io.setIntField(this, 14, gstelement_field_numpads);
        return this;
    }

    @Field(15)
    public Pointer<GList> gstelement_field_srcpads() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public GstElement gstelement_field_srcpads(Pointer<GList> gstelement_field_srcpads) {
        this.io.setPointerField(this, 15, gstelement_field_srcpads);
        return this;
    }

    @Field(16)
    public IntValuedEnum<GstStateChangeReturn> gstelement_field_last_return() {
        return this.io.getEnumField(this, 16);
    }

    @Field(16)
    public GstElement gstelement_field_last_return(IntValuedEnum<GstStateChangeReturn> gstelement_field_last_return) {
        this.io.setEnumField(this, 16, gstelement_field_last_return);
        return this;
    }

    protected native boolean gst_element_seek(
        @Ptr
        long element, double rate, IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop);

    public boolean seek(double rate, IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop) {
        return this.gst_element_seek(Pointer.pointerTo(this, GstElement.class).getPeer(), rate, format, flags, start_type, start, stop_type, stop);
    }

    @Field(17)
    public GRecMutex gstelement_field_state_lock() {
        return this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public GstElement gstelement_field_state_lock(GRecMutex gstelement_field_state_lock) {
        this.io.setNativeObjectField(this, 17, gstelement_field_state_lock);
        return this;
    }

    @Field(18)
    public int gstelement_field_numsinkpads() {
        return this.io.getIntField(this, 18);
    }

    @Field(18)
    public GstElement gstelement_field_numsinkpads(int gstelement_field_numsinkpads) {
        this.io.setIntField(this, 18, gstelement_field_numsinkpads);
        return this;
    }

    protected native boolean gst_element_query_duration(
        @Ptr
        long element, IntValuedEnum<GstFormat> format,
        @Ptr
        long duration);

    public boolean query_duration(IntValuedEnum<GstFormat> format, Pointer<Long> duration) {
        return this.gst_element_query_duration(Pointer.pointerTo(this, GstElement.class).getPeer(), format, Pointer.getPeer(duration));
    }

    @Field(19)
    private Pointer gstelement_field__gst_reserved() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    private GstElement gstelement_field__gst_reserved(Pointer gstelement_field__gst_reserved) {
        this.io.setPointerField(this, 19, gstelement_field__gst_reserved);
        return this;
    }

    @Field(20)
    public long gstelement_field_state_cookie() {
        return this.io.getLongField(this, 20);
    }

    @Field(20)
    public GstElement gstelement_field_state_cookie(long gstelement_field_state_cookie) {
        this.io.setLongField(this, 20, gstelement_field_state_cookie);
        return this;
    }

}
