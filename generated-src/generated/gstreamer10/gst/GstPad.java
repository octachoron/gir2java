
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GHookList;
import generated.glib20.glib.GRecMutex;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPad
    extends GstObject
{


    public GstPad() {
        super();
    }

    public GstPad(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_pad_can_link(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad);

    public boolean can_link(Pointer sinkpad) {
        return this.gst_pad_can_link(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(sinkpad));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_chain(
        @Ptr
        long pad,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> chain(Pointer<GstBuffer> buffer) {
        return this.gst_pad_chain(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(buffer));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_chain_list(
        @Ptr
        long pad,
        @Ptr
        long list);

    public IntValuedEnum<GstFlowReturn> chain_list(Pointer<GstBufferList> list) {
        return this.gst_pad_chain_list(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(list));
    }

    protected native boolean gst_pad_check_reconfigure(
        @Ptr
        long pad);

    public boolean check_reconfigure() {
        return this.gst_pad_check_reconfigure(Pointer.pointerTo(this, GstPad.class));
    }

    @Ptr
    protected native long gst_pad_create_stream_id(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long stream_id);

    public Pointer create_stream_id(Pointer<GstElement> parent, Pointer stream_id) {
        return Pointer.pointerToAddress(this.gst_pad_create_stream_id(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(parent), Pointer.getPeer(stream_id)));
    }

    @Ptr
    protected native long gst_pad_create_stream_id_printf(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long stream_id, Object... varargs);

    public Pointer create_stream_id_printf(Pointer<GstElement> parent, Pointer stream_id, Object... varargs) {
        return Pointer.pointerToAddress(this.gst_pad_create_stream_id_printf(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(parent), Pointer.getPeer(stream_id), varargs));
    }

    protected native boolean gst_pad_event_default(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long event);

    public boolean event_default(Pointer<GstObject> parent, Pointer<GstEvent> event) {
        return this.gst_pad_event_default(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(parent), Pointer.getPeer(event));
    }

    @Ptr
    protected native long gst_pad_get_allowed_caps(
        @Ptr
        long pad);

    public Pointer<GstCaps> get_allowed_caps() {
        return Pointer.pointerToAddress(this.gst_pad_get_allowed_caps(Pointer.pointerTo(this, GstPad.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_pad_get_current_caps(
        @Ptr
        long pad);

    public Pointer<GstCaps> get_current_caps() {
        return Pointer.pointerToAddress(this.gst_pad_get_current_caps(Pointer.pointerTo(this, GstPad.class)), Pointer.class);
    }

    protected native Pointer gst_pad_get_element_private(
        @Ptr
        long pad);

    public Pointer get_element_private() {
        return this.gst_pad_get_element_private(Pointer.pointerTo(this, GstPad.class));
    }

    protected native long gst_pad_get_offset(
        @Ptr
        long pad);

    public long get_offset() {
        return this.gst_pad_get_offset(Pointer.pointerTo(this, GstPad.class));
    }

    @Ptr
    protected native long gst_pad_get_pad_template(
        @Ptr
        long pad);

    public Pointer get_pad_template() {
        return Pointer.pointerToAddress(this.gst_pad_get_pad_template(Pointer.pointerTo(this, GstPad.class)));
    }

    @Ptr
    protected native long gst_pad_get_pad_template_caps(
        @Ptr
        long pad);

    public Pointer<GstCaps> get_pad_template_caps() {
        return Pointer.pointerToAddress(this.gst_pad_get_pad_template_caps(Pointer.pointerTo(this, GstPad.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_pad_get_parent_element(
        @Ptr
        long pad);

    public Pointer<GstElement> get_parent_element() {
        return Pointer.pointerToAddress(this.gst_pad_get_parent_element(Pointer.pointerTo(this, GstPad.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_pad_get_peer(
        @Ptr
        long pad);

    public Pointer get_peer() {
        return Pointer.pointerToAddress(this.gst_pad_get_peer(Pointer.pointerTo(this, GstPad.class)));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_get_range(
        @Ptr
        long pad, long offset, long size,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> get_range(long offset, long size, Pointer<Pointer<GstBuffer>> buffer) {
        return this.gst_pad_get_range(Pointer.pointerTo(this, GstPad.class), offset, size, Pointer.getPeer(buffer));
    }

    @Ptr
    protected native long gst_pad_get_sticky_event(
        @Ptr
        long pad, IntValuedEnum<GstEventType> event_type, long idx);

    public Pointer<GstEvent> get_sticky_event(IntValuedEnum<GstEventType> event_type, long idx) {
        return Pointer.pointerToAddress(this.gst_pad_get_sticky_event(Pointer.pointerTo(this, GstPad.class), event_type, idx), Pointer.class);
    }

    @Ptr
    protected native long gst_pad_get_stream_id(
        @Ptr
        long pad);

    public Pointer get_stream_id() {
        return Pointer.pointerToAddress(this.gst_pad_get_stream_id(Pointer.pointerTo(this, GstPad.class)));
    }

    protected native boolean gst_pad_has_current_caps(
        @Ptr
        long pad);

    public boolean has_current_caps() {
        return this.gst_pad_has_current_caps(Pointer.pointerTo(this, GstPad.class));
    }

    protected native boolean gst_pad_is_active(
        @Ptr
        long pad);

    public boolean is_active() {
        return this.gst_pad_is_active(Pointer.pointerTo(this, GstPad.class));
    }

    protected native boolean gst_pad_is_blocked(
        @Ptr
        long pad);

    public boolean is_blocked() {
        return this.gst_pad_is_blocked(Pointer.pointerTo(this, GstPad.class));
    }

    protected native boolean gst_pad_is_blocking(
        @Ptr
        long pad);

    public boolean is_blocking() {
        return this.gst_pad_is_blocking(Pointer.pointerTo(this, GstPad.class));
    }

    protected native boolean gst_pad_is_linked(
        @Ptr
        long pad);

    public boolean is_linked() {
        return this.gst_pad_is_linked(Pointer.pointerTo(this, GstPad.class));
    }

    @Ptr
    protected native long gst_pad_iterate_internal_links(
        @Ptr
        long pad);

    public Pointer<GstIterator> iterate_internal_links() {
        return Pointer.pointerToAddress(this.gst_pad_iterate_internal_links(Pointer.pointerTo(this, GstPad.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_pad_iterate_internal_links_default(
        @Ptr
        long pad,
        @Ptr
        long parent);

    public Pointer<GstIterator> iterate_internal_links_default(Pointer<GstObject> parent) {
        return Pointer.pointerToAddress(this.gst_pad_iterate_internal_links_default(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(parent)), Pointer.class);
    }

    protected native void gst_pad_mark_reconfigure(
        @Ptr
        long pad);

    public void mark_reconfigure() {
        this.gst_pad_mark_reconfigure(Pointer.pointerTo(this, GstPad.class));
    }

    protected native boolean gst_pad_needs_reconfigure(
        @Ptr
        long pad);

    public boolean needs_reconfigure() {
        return this.gst_pad_needs_reconfigure(Pointer.pointerTo(this, GstPad.class));
    }

    protected native boolean gst_pad_pause_task(
        @Ptr
        long pad);

    public boolean pause_task() {
        return this.gst_pad_pause_task(Pointer.pointerTo(this, GstPad.class));
    }

    protected native boolean gst_pad_peer_query(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean peer_query(Pointer query) {
        return this.gst_pad_peer_query(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_peer_query_accept_caps(
        @Ptr
        long pad,
        @Ptr
        long caps);

    public boolean peer_query_accept_caps(Pointer<GstCaps> caps) {
        return this.gst_pad_peer_query_accept_caps(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(caps));
    }

    @Ptr
    protected native long gst_pad_peer_query_caps(
        @Ptr
        long pad,
        @Ptr
        long filter);

    public Pointer<GstCaps> peer_query_caps(Pointer<GstCaps> filter) {
        return Pointer.pointerToAddress(this.gst_pad_peer_query_caps(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(filter)), Pointer.class);
    }

    protected native boolean gst_pad_peer_query_convert(
        @Ptr
        long pad, IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_val);

    public boolean peer_query_convert(IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_val) {
        return this.gst_pad_peer_query_convert(Pointer.pointerTo(this, GstPad.class), src_format, src_val, dest_format, Pointer.getPeer(dest_val));
    }

    protected native boolean gst_pad_peer_query_duration(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long duration);

    public boolean peer_query_duration(IntValuedEnum<GstFormat> format, Pointer<Long> duration) {
        return this.gst_pad_peer_query_duration(Pointer.pointerTo(this, GstPad.class), format, Pointer.getPeer(duration));
    }

    protected native boolean gst_pad_peer_query_position(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long cur);

    public boolean peer_query_position(IntValuedEnum<GstFormat> format, Pointer<Long> cur) {
        return this.gst_pad_peer_query_position(Pointer.pointerTo(this, GstPad.class), format, Pointer.getPeer(cur));
    }

    protected native boolean gst_pad_proxy_query_accept_caps(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean proxy_query_accept_caps(Pointer query) {
        return this.gst_pad_proxy_query_accept_caps(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_proxy_query_caps(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean proxy_query_caps(Pointer query) {
        return this.gst_pad_proxy_query_caps(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(query));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_pull_range(
        @Ptr
        long pad, long offset, long size,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> pull_range(long offset, long size, Pointer<Pointer<GstBuffer>> buffer) {
        return this.gst_pad_pull_range(Pointer.pointerTo(this, GstPad.class), offset, size, Pointer.getPeer(buffer));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_push(
        @Ptr
        long pad,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> push(Pointer<GstBuffer> buffer) {
        return this.gst_pad_push(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(buffer));
    }

    protected native boolean gst_pad_push_event(
        @Ptr
        long pad,
        @Ptr
        long event);

    public boolean push_event(Pointer<GstEvent> event) {
        return this.gst_pad_push_event(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(event));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_push_list(
        @Ptr
        long pad,
        @Ptr
        long list);

    public IntValuedEnum<GstFlowReturn> push_list(Pointer<GstBufferList> list) {
        return this.gst_pad_push_list(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(list));
    }

    protected native boolean gst_pad_query(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean query(Pointer query) {
        return this.gst_pad_query(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_query_accept_caps(
        @Ptr
        long pad,
        @Ptr
        long caps);

    public boolean query_accept_caps(Pointer<GstCaps> caps) {
        return this.gst_pad_query_accept_caps(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(caps));
    }

    @Ptr
    protected native long gst_pad_query_caps(
        @Ptr
        long pad,
        @Ptr
        long filter);

    public Pointer<GstCaps> query_caps(Pointer<GstCaps> filter) {
        return Pointer.pointerToAddress(this.gst_pad_query_caps(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(filter)), Pointer.class);
    }

    protected native boolean gst_pad_query_convert(
        @Ptr
        long pad, IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_val);

    public boolean query_convert(IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_val) {
        return this.gst_pad_query_convert(Pointer.pointerTo(this, GstPad.class), src_format, src_val, dest_format, Pointer.getPeer(dest_val));
    }

    protected native boolean gst_pad_query_default(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long query);

    public boolean query_default(Pointer<GstObject> parent, Pointer query) {
        return this.gst_pad_query_default(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(parent), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_query_duration(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long duration);

    public boolean query_duration(IntValuedEnum<GstFormat> format, Pointer<Long> duration) {
        return this.gst_pad_query_duration(Pointer.pointerTo(this, GstPad.class), format, Pointer.getPeer(duration));
    }

    protected native boolean gst_pad_query_position(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long cur);

    public boolean query_position(IntValuedEnum<GstFormat> format, Pointer<Long> cur) {
        return this.gst_pad_query_position(Pointer.pointerTo(this, GstPad.class), format, Pointer.getPeer(cur));
    }

    protected native void gst_pad_remove_probe(
        @Ptr
        long pad, long id);

    public void remove_probe(long id) {
        this.gst_pad_remove_probe(Pointer.pointerTo(this, GstPad.class), id);
    }

    protected native boolean gst_pad_send_event(
        @Ptr
        long pad,
        @Ptr
        long event);

    public boolean send_event(Pointer<GstEvent> event) {
        return this.gst_pad_send_event(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(event));
    }

    protected native boolean gst_pad_set_active(
        @Ptr
        long pad, boolean active);

    public boolean set_active(boolean active) {
        return this.gst_pad_set_active(Pointer.pointerTo(this, GstPad.class), active);
    }

    protected native void gst_pad_set_element_private(
        @Ptr
        long pad, Pointer priv);

    public void set_element_private(Pointer priv) {
        this.gst_pad_set_element_private(Pointer.pointerTo(this, GstPad.class), priv);
    }

    protected native void gst_pad_set_offset(
        @Ptr
        long pad, long offset);

    public void set_offset(long offset) {
        this.gst_pad_set_offset(Pointer.pointerTo(this, GstPad.class), offset);
    }

    protected native boolean gst_pad_stop_task(
        @Ptr
        long pad);

    public boolean stop_task() {
        return this.gst_pad_stop_task(Pointer.pointerTo(this, GstPad.class));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_store_sticky_event(
        @Ptr
        long pad,
        @Ptr
        long event);

    public IntValuedEnum<GstFlowReturn> store_sticky_event(Pointer<GstEvent> event) {
        return this.gst_pad_store_sticky_event(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(event));
    }

    protected native boolean gst_pad_unlink(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad);

    public boolean unlink(Pointer sinkpad) {
        return this.gst_pad_unlink(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(sinkpad));
    }

    protected native void gst_pad_use_fixed_caps(
        @Ptr
        long pad);

    public void use_fixed_caps() {
        this.gst_pad_use_fixed_caps(Pointer.pointerTo(this, GstPad.class));
    }

    @Field(0)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPad field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public Pointer field_element_private() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstPad field_element_private(Pointer field_element_private) {
        this.io.setNativeObjectField(this, 1, field_element_private);
        return this;
    }

    @Field(2)
    public Pointer field_padtemplate() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstPad field_padtemplate(Pointer field_padtemplate) {
        this.io.setPointerField(this, 2, field_padtemplate);
        return this;
    }

    @Field(3)
    public Pointer field_activatedata() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstPad field_activatedata(Pointer field_activatedata) {
        this.io.setNativeObjectField(this, 3, field_activatedata);
        return this;
    }

    @Field(4)
    public Object field_iterintlinkfunc() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstPad field_iterintlinkfunc(Object field_iterintlinkfunc) {
        this.io.setNativeObjectField(this, 4, field_iterintlinkfunc);
        return this;
    }

    @Field(5)
    public Object field_getrangefunc() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstPad field_getrangefunc(Object field_getrangefunc) {
        this.io.setNativeObjectField(this, 5, field_getrangefunc);
        return this;
    }

    @Field(6)
    public Pointer field_querydata() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstPad field_querydata(Pointer field_querydata) {
        this.io.setNativeObjectField(this, 6, field_querydata);
        return this;
    }

    @Field(7)
    public Object field_activatemodenotify() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstPad field_activatemodenotify(Object field_activatemodenotify) {
        this.io.setNativeObjectField(this, 7, field_activatemodenotify);
        return this;
    }

    @Field(8)
    public Object field_querynotify() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstPad field_querynotify(Object field_querynotify) {
        this.io.setNativeObjectField(this, 8, field_querynotify);
        return this;
    }

    @Field(9)
    public Object field_chainfunc() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstPad field_chainfunc(Object field_chainfunc) {
        this.io.setNativeObjectField(this, 9, field_chainfunc);
        return this;
    }

    @Field(10)
    public int field_num_probes() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstPad field_num_probes(int field_num_probes) {
        this.io.setNativeObjectField(this, 10, field_num_probes);
        return this;
    }

    @Field(11)
    public Object field_iterintlinknotify() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstPad field_iterintlinknotify(Object field_iterintlinknotify) {
        this.io.setNativeObjectField(this, 11, field_iterintlinknotify);
        return this;
    }

    @Field(12)
    public Pointer field_getrangedata() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GstPad field_getrangedata(Pointer field_getrangedata) {
        this.io.setNativeObjectField(this, 12, field_getrangedata);
        return this;
    }

    @Field(13)
    public IntValuedEnum<GstPadMode> field_mode() {
        return this.io.getEnumField(this, 13);
    }

    @Field(13)
    public GstPad field_mode(IntValuedEnum<GstPadMode> field_mode) {
        this.io.setEnumField(this, 13, field_mode);
        return this;
    }

    protected native void gst_pad_set_query_function_full(
        @Ptr
        long pad, Object query, Pointer user_data, Object notify);

    public void set_query_function_full(Object query, Pointer user_data, Object notify) {
        this.gst_pad_set_query_function_full(Pointer.pointerTo(this, GstPad.class), query, user_data, notify);
    }

    @Field(14)
    public Object field_unlinknotify() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GstPad field_unlinknotify(Object field_unlinknotify) {
        this.io.setNativeObjectField(this, 14, field_unlinknotify);
        return this;
    }

    protected native IntValuedEnum<GstPadDirection> gst_pad_get_direction(
        @Ptr
        long pad);

    public IntValuedEnum<GstPadDirection> get_direction() {
        return this.gst_pad_get_direction(Pointer.pointerTo(this, GstPad.class));
    }

    protected native void gst_pad_set_iterate_internal_links_function_full(
        @Ptr
        long pad, Object iterintlink, Pointer user_data, Object notify);

    public void set_iterate_internal_links_function_full(Object iterintlink, Pointer user_data, Object notify) {
        this.gst_pad_set_iterate_internal_links_function_full(Pointer.pointerTo(this, GstPad.class), iterintlink, user_data, notify);
    }

    protected native void gst_pad_set_activatemode_function_full(
        @Ptr
        long pad, Object activatemode, Pointer user_data, Object notify);

    public void set_activatemode_function_full(Object activatemode, Pointer user_data, Object notify) {
        this.gst_pad_set_activatemode_function_full(Pointer.pointerTo(this, GstPad.class), activatemode, user_data, notify);
    }

    @Field(15)
    public GRecMutex field_stream_rec_lock() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GstPad field_stream_rec_lock(GRecMutex field_stream_rec_lock) {
        this.io.setNativeObjectField(this, 15, field_stream_rec_lock);
        return this;
    }

    @Field(16)
    public Object field_activatenotify() {
        return this.io.getNativeObjectField(this, 16);
    }

    @Field(16)
    public GstPad field_activatenotify(Object field_activatenotify) {
        this.io.setNativeObjectField(this, 16, field_activatenotify);
        return this;
    }

    @Field(17)
    public Pointer<GstTask> field_task() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    public GstPad field_task(Pointer<GstTask> field_task) {
        this.io.setPointerField(this, 17, field_task);
        return this;
    }

    protected native long gst_pad_add_probe(
        @Ptr
        long pad, Object mask, Object callback, Pointer user_data, Object destroy_data);

    public long add_probe(Object mask, Object callback, Pointer user_data, Object destroy_data) {
        return this.gst_pad_add_probe(Pointer.pointerTo(this, GstPad.class), mask, callback, user_data, destroy_data);
    }

    protected native void gst_pad_set_activate_function_full(
        @Ptr
        long pad, Object activate, Pointer user_data, Object notify);

    public void set_activate_function_full(Object activate, Pointer user_data, Object notify) {
        this.gst_pad_set_activate_function_full(Pointer.pointerTo(this, GstPad.class), activate, user_data, notify);
    }

    @Field(18)
    public Object field_activatemodefunc() {
        return this.io.getNativeObjectField(this, 18);
    }

    @Field(18)
    public GstPad field_activatemodefunc(Object field_activatemodefunc) {
        this.io.setNativeObjectField(this, 18, field_activatemodefunc);
        return this;
    }

    @Field(19)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    public GstPad field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 19, field__gst_reserved);
        return this;
    }

    protected native boolean gst_pad_activate_mode(
        @Ptr
        long pad, IntValuedEnum<GstPadMode> mode, boolean active);

    public boolean activate_mode(IntValuedEnum<GstPadMode> mode, boolean active) {
        return this.gst_pad_activate_mode(Pointer.pointerTo(this, GstPad.class), mode, active);
    }

    protected native void gst_pad_set_unlink_function_full(
        @Ptr
        long pad, Object unlink, Pointer user_data, Object notify);

    public void set_unlink_function_full(Object unlink, Pointer user_data, Object notify) {
        this.gst_pad_set_unlink_function_full(Pointer.pointerTo(this, GstPad.class), unlink, user_data, notify);
    }

    protected native void gst_pad_set_chain_function_full(
        @Ptr
        long pad, Object chain, Pointer user_data, Object notify);

    public void set_chain_function_full(Object chain, Pointer user_data, Object notify) {
        this.gst_pad_set_chain_function_full(Pointer.pointerTo(this, GstPad.class), chain, user_data, notify);
    }

    protected native void gst_pad_sticky_events_foreach(
        @Ptr
        long pad, Object foreach_func, Pointer user_data);

    public void sticky_events_foreach(Object foreach_func, Pointer user_data) {
        this.gst_pad_sticky_events_foreach(Pointer.pointerTo(this, GstPad.class), foreach_func, user_data);
    }

    protected native boolean gst_pad_forward(
        @Ptr
        long pad, Object forward, Pointer user_data);

    public boolean forward(Object forward, Pointer user_data) {
        return this.gst_pad_forward(Pointer.pointerTo(this, GstPad.class), forward, user_data);
    }

    @Field(20)
    public GCond field_block_cond() {
        return this.io.getNativeObjectField(this, 20);
    }

    @Field(20)
    public GstPad field_block_cond(GCond field_block_cond) {
        this.io.setNativeObjectField(this, 20, field_block_cond);
        return this;
    }

    @Field(21)
    public Object field_queryfunc() {
        return this.io.getNativeObjectField(this, 21);
    }

    @Field(21)
    public GstPad field_queryfunc(Object field_queryfunc) {
        this.io.setNativeObjectField(this, 21, field_queryfunc);
        return this;
    }

    @Field(22)
    public Object field_eventfunc() {
        return this.io.getNativeObjectField(this, 22);
    }

    @Field(22)
    public GstPad field_eventfunc(Object field_eventfunc) {
        this.io.setNativeObjectField(this, 22, field_eventfunc);
        return this;
    }

    @Field(23)
    public Object field_linkfunc() {
        return this.io.getNativeObjectField(this, 23);
    }

    @Field(23)
    public GstPad field_linkfunc(Object field_linkfunc) {
        this.io.setNativeObjectField(this, 23, field_linkfunc);
        return this;
    }

    protected native void gst_pad_set_link_function_full(
        @Ptr
        long pad, Object link, Pointer user_data, Object notify);

    public void set_link_function_full(Object link, Pointer user_data, Object notify) {
        this.gst_pad_set_link_function_full(Pointer.pointerTo(this, GstPad.class), link, user_data, notify);
    }

    @Field(24)
    public int field_num_blocked() {
        return this.io.getNativeObjectField(this, 24);
    }

    @Field(24)
    public GstPad field_num_blocked(int field_num_blocked) {
        this.io.setNativeObjectField(this, 24, field_num_blocked);
        return this;
    }

    @Field(25)
    public Object field_eventnotify() {
        return this.io.getNativeObjectField(this, 25);
    }

    @Field(25)
    public GstPad field_eventnotify(Object field_eventnotify) {
        this.io.setNativeObjectField(this, 25, field_eventnotify);
        return this;
    }

    @Field(26)
    public Pointer field_chaindata() {
        return this.io.getNativeObjectField(this, 26);
    }

    @Field(26)
    public GstPad field_chaindata(Pointer field_chaindata) {
        this.io.setNativeObjectField(this, 26, field_chaindata);
        return this;
    }

    @Field(27)
    public Pointer<GstPadPrivate> field_priv() {
        return this.io.getPointerField(this, 27);
    }

    @Field(27)
    public GstPad field_priv(Pointer<GstPadPrivate> field_priv) {
        this.io.setPointerField(this, 27, field_priv);
        return this;
    }

    @Field(28)
    public Object field_chainlistfunc() {
        return this.io.getNativeObjectField(this, 28);
    }

    @Field(28)
    public GstPad field_chainlistfunc(Object field_chainlistfunc) {
        this.io.setNativeObjectField(this, 28, field_chainlistfunc);
        return this;
    }

    @Field(29)
    public Object field_chainlistnotify() {
        return this.io.getNativeObjectField(this, 29);
    }

    @Field(29)
    public GstPad field_chainlistnotify(Object field_chainlistnotify) {
        this.io.setNativeObjectField(this, 29, field_chainlistnotify);
        return this;
    }

    protected native IntValuedEnum<GstPadLinkReturn> gst_pad_link(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad);

    public IntValuedEnum<GstPadLinkReturn> link(Pointer<GstPad> sinkpad) {
        return this.gst_pad_link(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(sinkpad));
    }

    protected native IntValuedEnum<GstPadLinkReturn> gst_pad_link_full(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad, Object flags);

    public IntValuedEnum<GstPadLinkReturn> link_full(Pointer<GstPad> sinkpad, Object flags) {
        return this.gst_pad_link_full(Pointer.pointerTo(this, GstPad.class), Pointer.getPeer(sinkpad), flags);
    }

    protected native void gst_pad_set_chain_list_function_full(
        @Ptr
        long pad, Object chainlist, Pointer user_data, Object notify);

    public void set_chain_list_function_full(Object chainlist, Pointer user_data, Object notify) {
        this.gst_pad_set_chain_list_function_full(Pointer.pointerTo(this, GstPad.class), chainlist, user_data, notify);
    }

    protected native void gst_pad_set_getrange_function_full(
        @Ptr
        long pad, Object get, Pointer user_data, Object notify);

    public void set_getrange_function_full(Object get, Pointer user_data, Object notify) {
        this.gst_pad_set_getrange_function_full(Pointer.pointerTo(this, GstPad.class), get, user_data, notify);
    }

    @Field(30)
    public Pointer<GstPad> field_peer() {
        return this.io.getPointerField(this, 30);
    }

    @Field(30)
    public GstPad field_peer(Pointer<GstPad> field_peer) {
        this.io.setPointerField(this, 30, field_peer);
        return this;
    }

    @Field(31)
    public Pointer field_iterintlinkdata() {
        return this.io.getNativeObjectField(this, 31);
    }

    @Field(31)
    public GstPad field_iterintlinkdata(Pointer field_iterintlinkdata) {
        this.io.setNativeObjectField(this, 31, field_iterintlinkdata);
        return this;
    }

    @Field(32)
    public GHookList field_probes() {
        return this.io.getNativeObjectField(this, 32);
    }

    @Field(32)
    public GstPad field_probes(GHookList field_probes) {
        this.io.setNativeObjectField(this, 32, field_probes);
        return this;
    }

    protected native boolean gst_pad_start_task(
        @Ptr
        long pad, Object func, Pointer user_data, Object notify);

    public boolean start_task(Object func, Pointer user_data, Object notify) {
        return this.gst_pad_start_task(Pointer.pointerTo(this, GstPad.class), func, user_data, notify);
    }

    @Field(33)
    public Pointer field_activatemodedata() {
        return this.io.getNativeObjectField(this, 33);
    }

    @Field(33)
    public GstPad field_activatemodedata(Pointer field_activatemodedata) {
        this.io.setNativeObjectField(this, 33, field_activatemodedata);
        return this;
    }

    @Field(34)
    public Pointer field_linkdata() {
        return this.io.getNativeObjectField(this, 34);
    }

    @Field(34)
    public GstPad field_linkdata(Pointer field_linkdata) {
        this.io.setNativeObjectField(this, 34, field_linkdata);
        return this;
    }

    @Field(35)
    public Object field_chainnotify() {
        return this.io.getNativeObjectField(this, 35);
    }

    @Field(35)
    public GstPad field_chainnotify(Object field_chainnotify) {
        this.io.setNativeObjectField(this, 35, field_chainnotify);
        return this;
    }

    @Field(36)
    public long field_offset() {
        return this.io.getNativeObjectField(this, 36);
    }

    @Field(36)
    public GstPad field_offset(long field_offset) {
        this.io.setNativeObjectField(this, 36, field_offset);
        return this;
    }

    @Field(37)
    public Object field_unlinkfunc() {
        return this.io.getNativeObjectField(this, 37);
    }

    @Field(37)
    public GstPad field_unlinkfunc(Object field_unlinkfunc) {
        this.io.setNativeObjectField(this, 37, field_unlinkfunc);
        return this;
    }

    protected native void gst_pad_set_event_function_full(
        @Ptr
        long pad, Object event, Pointer user_data, Object notify);

    public void set_event_function_full(Object event, Pointer user_data, Object notify) {
        this.gst_pad_set_event_function_full(Pointer.pointerTo(this, GstPad.class), event, user_data, notify);
    }

    @Field(38)
    public Pointer field_eventdata() {
        return this.io.getNativeObjectField(this, 38);
    }

    @Field(38)
    public GstPad field_eventdata(Pointer field_eventdata) {
        this.io.setNativeObjectField(this, 38, field_eventdata);
        return this;
    }

    @Field(39)
    public Object field_linknotify() {
        return this.io.getNativeObjectField(this, 39);
    }

    @Field(39)
    public GstPad field_linknotify(Object field_linknotify) {
        this.io.setNativeObjectField(this, 39, field_linknotify);
        return this;
    }

    @Field(40)
    public Pointer field_unlinkdata() {
        return this.io.getNativeObjectField(this, 40);
    }

    @Field(40)
    public GstPad field_unlinkdata(Pointer field_unlinkdata) {
        this.io.setNativeObjectField(this, 40, field_unlinkdata);
        return this;
    }

    @Field(41)
    public Object field_activatefunc() {
        return this.io.getNativeObjectField(this, 41);
    }

    @Field(41)
    public GstPad field_activatefunc(Object field_activatefunc) {
        this.io.setNativeObjectField(this, 41, field_activatefunc);
        return this;
    }

    @Field(42)
    public IntValuedEnum<GstPadDirection> field_direction() {
        return this.io.getEnumField(this, 42);
    }

    @Field(42)
    public GstPad field_direction(IntValuedEnum<GstPadDirection> field_direction) {
        this.io.setEnumField(this, 42, field_direction);
        return this;
    }

    @Field(43)
    public Pointer field_chainlistdata() {
        return this.io.getNativeObjectField(this, 43);
    }

    @Field(43)
    public GstPad field_chainlistdata(Pointer field_chainlistdata) {
        this.io.setNativeObjectField(this, 43, field_chainlistdata);
        return this;
    }

    @Field(44)
    public Object field_getrangenotify() {
        return this.io.getNativeObjectField(this, 44);
    }

    @Field(44)
    public GstPad field_getrangenotify(Object field_getrangenotify) {
        this.io.setNativeObjectField(this, 44, field_getrangenotify);
        return this;
    }

}
