
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GHookList;
import generated.glib20.glib.GRecMutex;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPad
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstPad() {
        super();
    }

    public GstPad(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_pad_new_from_static_template(
        @Ptr
        long templ,
        @Ptr
        long name);

    public static Pointer new_from_static_template(Pointer templ, Pointer name) {
        return Pointer.pointerToAddress(GstPad.gst_pad_new_from_static_template(Pointer.getPeer(templ), Pointer.getPeer(name)));
    }

    @Ptr
    protected static native long gst_pad_new_from_template(
        @Ptr
        long templ,
        @Ptr
        long name);

    public static Pointer new_from_template(Pointer templ, Pointer name) {
        return Pointer.pointerToAddress(GstPad.gst_pad_new_from_template(Pointer.getPeer(templ), Pointer.getPeer(name)));
    }

    protected native boolean gst_pad_can_link(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad);

    public boolean can_link(Pointer sinkpad) {
        return this.gst_pad_can_link(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(sinkpad));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_chain(
        @Ptr
        long pad,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> chain(Pointer<GstBuffer> buffer) {
        return this.gst_pad_chain(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(buffer));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_chain_list(
        @Ptr
        long pad,
        @Ptr
        long list);

    public IntValuedEnum<GstFlowReturn> chain_list(Pointer<GstBufferList> list) {
        return this.gst_pad_chain_list(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(list));
    }

    protected native boolean gst_pad_check_reconfigure(
        @Ptr
        long pad);

    public boolean check_reconfigure() {
        return this.gst_pad_check_reconfigure(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    @Ptr
    protected native long gst_pad_create_stream_id(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long stream_id);

    public Pointer create_stream_id(Pointer parent, Pointer stream_id) {
        return Pointer.pointerToAddress(this.gst_pad_create_stream_id(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(parent), Pointer.getPeer(stream_id)));
    }

    @Ptr
    protected native long gst_pad_create_stream_id_printf(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long stream_id, Object... varargs);

    public Pointer create_stream_id_printf(Pointer parent, Pointer stream_id, Object... varargs) {
        return Pointer.pointerToAddress(this.gst_pad_create_stream_id_printf(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(parent), Pointer.getPeer(stream_id), varargs));
    }

    protected native boolean gst_pad_event_default(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long event);

    public boolean event_default(Pointer<GstObject> parent, Pointer<GstEvent> event) {
        return this.gst_pad_event_default(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(parent), Pointer.getPeer(event));
    }

    @Ptr
    protected native long gst_pad_get_allowed_caps(
        @Ptr
        long pad);

    public Pointer<GstCaps> get_allowed_caps() {
        return Pointer.pointerToAddress(this.gst_pad_get_allowed_caps(Pointer.pointerTo(this, GstPad.class).getPeer()), GstCaps.class);
    }

    @Ptr
    protected native long gst_pad_get_current_caps(
        @Ptr
        long pad);

    public Pointer<GstCaps> get_current_caps() {
        return Pointer.pointerToAddress(this.gst_pad_get_current_caps(Pointer.pointerTo(this, GstPad.class).getPeer()), GstCaps.class);
    }

    @Ptr
    protected native long gst_pad_get_element_private(
        @Ptr
        long pad);

    public Pointer get_element_private() {
        return Pointer.pointerToAddress(this.gst_pad_get_element_private(Pointer.pointerTo(this, GstPad.class).getPeer()));
    }

    protected native long gst_pad_get_offset(
        @Ptr
        long pad);

    public long get_offset() {
        return this.gst_pad_get_offset(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    @Ptr
    protected native long gst_pad_get_pad_template(
        @Ptr
        long pad);

    public Pointer get_pad_template() {
        return Pointer.pointerToAddress(this.gst_pad_get_pad_template(Pointer.pointerTo(this, GstPad.class).getPeer()));
    }

    @Ptr
    protected native long gst_pad_get_pad_template_caps(
        @Ptr
        long pad);

    public Pointer<GstCaps> get_pad_template_caps() {
        return Pointer.pointerToAddress(this.gst_pad_get_pad_template_caps(Pointer.pointerTo(this, GstPad.class).getPeer()), GstCaps.class);
    }

    @Ptr
    protected native long gst_pad_get_parent_element(
        @Ptr
        long pad);

    public Pointer get_parent_element() {
        return Pointer.pointerToAddress(this.gst_pad_get_parent_element(Pointer.pointerTo(this, GstPad.class).getPeer()));
    }

    @Ptr
    protected native long gst_pad_get_peer(
        @Ptr
        long pad);

    public Pointer get_peer() {
        return Pointer.pointerToAddress(this.gst_pad_get_peer(Pointer.pointerTo(this, GstPad.class).getPeer()));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_get_range(
        @Ptr
        long pad, long offset, long size,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> get_range(long offset, long size, Pointer<Pointer<GstBuffer>> buffer) {
        return this.gst_pad_get_range(Pointer.pointerTo(this, GstPad.class).getPeer(), offset, size, Pointer.getPeer(buffer));
    }

    @Ptr
    protected native long gst_pad_get_sticky_event(
        @Ptr
        long pad, IntValuedEnum<GstEventType> event_type, long idx);

    public Pointer<GstEvent> get_sticky_event(IntValuedEnum<GstEventType> event_type, long idx) {
        return Pointer.pointerToAddress(this.gst_pad_get_sticky_event(Pointer.pointerTo(this, GstPad.class).getPeer(), event_type, idx), GstEvent.class);
    }

    @Ptr
    protected native long gst_pad_get_stream_id(
        @Ptr
        long pad);

    public Pointer get_stream_id() {
        return Pointer.pointerToAddress(this.gst_pad_get_stream_id(Pointer.pointerTo(this, GstPad.class).getPeer()));
    }

    protected native boolean gst_pad_has_current_caps(
        @Ptr
        long pad);

    public boolean has_current_caps() {
        return this.gst_pad_has_current_caps(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native boolean gst_pad_is_active(
        @Ptr
        long pad);

    public boolean is_active() {
        return this.gst_pad_is_active(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native boolean gst_pad_is_blocked(
        @Ptr
        long pad);

    public boolean is_blocked() {
        return this.gst_pad_is_blocked(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native boolean gst_pad_is_blocking(
        @Ptr
        long pad);

    public boolean is_blocking() {
        return this.gst_pad_is_blocking(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native boolean gst_pad_is_linked(
        @Ptr
        long pad);

    public boolean is_linked() {
        return this.gst_pad_is_linked(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    @Ptr
    protected native long gst_pad_iterate_internal_links(
        @Ptr
        long pad);

    public Pointer<GstIterator> iterate_internal_links() {
        return Pointer.pointerToAddress(this.gst_pad_iterate_internal_links(Pointer.pointerTo(this, GstPad.class).getPeer()), GstIterator.class);
    }

    @Ptr
    protected native long gst_pad_iterate_internal_links_default(
        @Ptr
        long pad,
        @Ptr
        long parent);

    public Pointer<GstIterator> iterate_internal_links_default(Pointer<GstObject> parent) {
        return Pointer.pointerToAddress(this.gst_pad_iterate_internal_links_default(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(parent)), GstIterator.class);
    }

    protected native void gst_pad_mark_reconfigure(
        @Ptr
        long pad);

    public void mark_reconfigure() {
        this.gst_pad_mark_reconfigure(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native boolean gst_pad_needs_reconfigure(
        @Ptr
        long pad);

    public boolean needs_reconfigure() {
        return this.gst_pad_needs_reconfigure(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native boolean gst_pad_pause_task(
        @Ptr
        long pad);

    public boolean pause_task() {
        return this.gst_pad_pause_task(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native boolean gst_pad_peer_query(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean peer_query(Pointer query) {
        return this.gst_pad_peer_query(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_peer_query_accept_caps(
        @Ptr
        long pad,
        @Ptr
        long caps);

    public boolean peer_query_accept_caps(Pointer<GstCaps> caps) {
        return this.gst_pad_peer_query_accept_caps(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(caps));
    }

    @Ptr
    protected native long gst_pad_peer_query_caps(
        @Ptr
        long pad,
        @Ptr
        long filter);

    public Pointer<GstCaps> peer_query_caps(Pointer<GstCaps> filter) {
        return Pointer.pointerToAddress(this.gst_pad_peer_query_caps(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(filter)), GstCaps.class);
    }

    protected native boolean gst_pad_peer_query_convert(
        @Ptr
        long pad, IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_val);

    public boolean peer_query_convert(IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_val) {
        return this.gst_pad_peer_query_convert(Pointer.pointerTo(this, GstPad.class).getPeer(), src_format, src_val, dest_format, Pointer.getPeer(dest_val));
    }

    protected native boolean gst_pad_peer_query_duration(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long duration);

    public boolean peer_query_duration(IntValuedEnum<GstFormat> format, Pointer<Long> duration) {
        return this.gst_pad_peer_query_duration(Pointer.pointerTo(this, GstPad.class).getPeer(), format, Pointer.getPeer(duration));
    }

    protected native boolean gst_pad_peer_query_position(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long cur);

    public boolean peer_query_position(IntValuedEnum<GstFormat> format, Pointer<Long> cur) {
        return this.gst_pad_peer_query_position(Pointer.pointerTo(this, GstPad.class).getPeer(), format, Pointer.getPeer(cur));
    }

    protected native boolean gst_pad_proxy_query_accept_caps(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean proxy_query_accept_caps(Pointer query) {
        return this.gst_pad_proxy_query_accept_caps(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_proxy_query_caps(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean proxy_query_caps(Pointer query) {
        return this.gst_pad_proxy_query_caps(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(query));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_pull_range(
        @Ptr
        long pad, long offset, long size,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> pull_range(long offset, long size, Pointer<Pointer<GstBuffer>> buffer) {
        return this.gst_pad_pull_range(Pointer.pointerTo(this, GstPad.class).getPeer(), offset, size, Pointer.getPeer(buffer));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_push(
        @Ptr
        long pad,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> push(Pointer<GstBuffer> buffer) {
        return this.gst_pad_push(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(buffer));
    }

    protected native boolean gst_pad_push_event(
        @Ptr
        long pad,
        @Ptr
        long event);

    public boolean push_event(Pointer<GstEvent> event) {
        return this.gst_pad_push_event(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(event));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_push_list(
        @Ptr
        long pad,
        @Ptr
        long list);

    public IntValuedEnum<GstFlowReturn> push_list(Pointer<GstBufferList> list) {
        return this.gst_pad_push_list(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(list));
    }

    protected native boolean gst_pad_query(
        @Ptr
        long pad,
        @Ptr
        long query);

    public boolean query(Pointer query) {
        return this.gst_pad_query(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_query_accept_caps(
        @Ptr
        long pad,
        @Ptr
        long caps);

    public boolean query_accept_caps(Pointer<GstCaps> caps) {
        return this.gst_pad_query_accept_caps(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(caps));
    }

    @Ptr
    protected native long gst_pad_query_caps(
        @Ptr
        long pad,
        @Ptr
        long filter);

    public Pointer<GstCaps> query_caps(Pointer<GstCaps> filter) {
        return Pointer.pointerToAddress(this.gst_pad_query_caps(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(filter)), GstCaps.class);
    }

    protected native boolean gst_pad_query_convert(
        @Ptr
        long pad, IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_val);

    public boolean query_convert(IntValuedEnum<GstFormat> src_format, long src_val, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_val) {
        return this.gst_pad_query_convert(Pointer.pointerTo(this, GstPad.class).getPeer(), src_format, src_val, dest_format, Pointer.getPeer(dest_val));
    }

    protected native boolean gst_pad_query_default(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long query);

    public boolean query_default(Pointer<GstObject> parent, Pointer query) {
        return this.gst_pad_query_default(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(parent), Pointer.getPeer(query));
    }

    protected native boolean gst_pad_query_duration(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long duration);

    public boolean query_duration(IntValuedEnum<GstFormat> format, Pointer<Long> duration) {
        return this.gst_pad_query_duration(Pointer.pointerTo(this, GstPad.class).getPeer(), format, Pointer.getPeer(duration));
    }

    protected native boolean gst_pad_query_position(
        @Ptr
        long pad, IntValuedEnum<GstFormat> format,
        @Ptr
        long cur);

    public boolean query_position(IntValuedEnum<GstFormat> format, Pointer<Long> cur) {
        return this.gst_pad_query_position(Pointer.pointerTo(this, GstPad.class).getPeer(), format, Pointer.getPeer(cur));
    }

    protected native void gst_pad_remove_probe(
        @Ptr
        long pad, long id);

    public void remove_probe(long id) {
        this.gst_pad_remove_probe(Pointer.pointerTo(this, GstPad.class).getPeer(), id);
    }

    protected native boolean gst_pad_send_event(
        @Ptr
        long pad,
        @Ptr
        long event);

    public boolean send_event(Pointer<GstEvent> event) {
        return this.gst_pad_send_event(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(event));
    }

    protected native boolean gst_pad_set_active(
        @Ptr
        long pad, boolean active);

    public boolean set_active(boolean active) {
        return this.gst_pad_set_active(Pointer.pointerTo(this, GstPad.class).getPeer(), active);
    }

    protected native void gst_pad_set_element_private(
        @Ptr
        long pad,
        @Ptr
        long priv);

    public void set_element_private(Pointer priv) {
        this.gst_pad_set_element_private(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(priv));
    }

    protected native void gst_pad_set_offset(
        @Ptr
        long pad, long offset);

    public void set_offset(long offset) {
        this.gst_pad_set_offset(Pointer.pointerTo(this, GstPad.class).getPeer(), offset);
    }

    protected native boolean gst_pad_stop_task(
        @Ptr
        long pad);

    public boolean stop_task() {
        return this.gst_pad_stop_task(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    protected native IntValuedEnum<GstFlowReturn> gst_pad_store_sticky_event(
        @Ptr
        long pad,
        @Ptr
        long event);

    public IntValuedEnum<GstFlowReturn> store_sticky_event(Pointer<GstEvent> event) {
        return this.gst_pad_store_sticky_event(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(event));
    }

    protected native boolean gst_pad_unlink(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad);

    public boolean unlink(Pointer sinkpad) {
        return this.gst_pad_unlink(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(sinkpad));
    }

    protected native void gst_pad_use_fixed_caps(
        @Ptr
        long pad);

    public void use_fixed_caps() {
        this.gst_pad_use_fixed_caps(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    @Field(0)
    public GstObject gstpad_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPad gstpad_field_object(GstObject gstpad_field_object) {
        this.io.setNativeObjectField(this, 0, gstpad_field_object);
        return this;
    }

    @Field(1)
    public Pointer field_element_private() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstPad field_element_private(Pointer field_element_private) {
        this.io.setPointerField(this, 1, field_element_private);
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

    protected native boolean gst_pad_activate_mode(
        @Ptr
        long pad, IntValuedEnum<GstPadMode> mode, boolean active);

    public boolean activate_mode(IntValuedEnum<GstPadMode> mode, boolean active) {
        return this.gst_pad_activate_mode(Pointer.pointerTo(this, GstPad.class).getPeer(), mode, active);
    }

    protected native void gst_pad_set_chain_function_full(
        @Ptr
        long pad,
        @Ptr
        long chain,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_chain_function_full(Pointer chain, Pointer user_data, Pointer notify) {
        this.gst_pad_set_chain_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(chain), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native void gst_pad_set_unlink_function_full(
        @Ptr
        long pad,
        @Ptr
        long unlink,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_unlink_function_full(Pointer unlink, Pointer user_data, Pointer notify) {
        this.gst_pad_set_unlink_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(unlink), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native long gst_pad_add_probe(
        @Ptr
        long pad, IntValuedEnum<GstPadProbeType> mask,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long destroy_data);

    public long add_probe(IntValuedEnum<GstPadProbeType> mask, Pointer callback, Pointer user_data, Pointer destroy_data) {
        return this.gst_pad_add_probe(Pointer.pointerTo(this, GstPad.class).getPeer(), mask, Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(destroy_data));
    }

    @Field(3)
    private Pointer field_activatedata() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstPad field_activatedata(Pointer field_activatedata) {
        this.io.setPointerField(this, 3, field_activatedata);
        return this;
    }

    @Field(4)
    private GRecMutex field_stream_rec_lock() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    private GstPad field_stream_rec_lock(GRecMutex field_stream_rec_lock) {
        this.io.setNativeObjectField(this, 4, field_stream_rec_lock);
        return this;
    }

    @Field(5)
    private Pointer field_unlinkdata() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstPad field_unlinkdata(Pointer field_unlinkdata) {
        this.io.setPointerField(this, 5, field_unlinkdata);
        return this;
    }

    @Field(6)
    private Pointer field_linkfunc() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstPad field_linkfunc(Pointer field_linkfunc) {
        this.io.setPointerField(this, 6, field_linkfunc);
        return this;
    }

    @Field(7)
    private GCond field_block_cond() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    private GstPad field_block_cond(GCond field_block_cond) {
        this.io.setNativeObjectField(this, 7, field_block_cond);
        return this;
    }

    @Field(8)
    private Pointer field_iterintlinkfunc() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    private GstPad field_iterintlinkfunc(Pointer field_iterintlinkfunc) {
        this.io.setPointerField(this, 8, field_iterintlinkfunc);
        return this;
    }

    @Field(9)
    private Pointer field_activatenotify() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    private GstPad field_activatenotify(Pointer field_activatenotify) {
        this.io.setPointerField(this, 9, field_activatenotify);
        return this;
    }

    protected native void gst_pad_set_query_function_full(
        @Ptr
        long pad,
        @Ptr
        long query,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_query_function_full(Pointer query, Pointer user_data, Pointer notify) {
        this.gst_pad_set_query_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(query), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(10)
    private Pointer field_getrangefunc() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    private GstPad field_getrangefunc(Pointer field_getrangefunc) {
        this.io.setPointerField(this, 10, field_getrangefunc);
        return this;
    }

    @Field(11)
    private Pointer field_activatefunc() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    private GstPad field_activatefunc(Pointer field_activatefunc) {
        this.io.setPointerField(this, 11, field_activatefunc);
        return this;
    }

    @Field(12)
    private Pointer field_chainnotify() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    private GstPad field_chainnotify(Pointer field_chainnotify) {
        this.io.setPointerField(this, 12, field_chainnotify);
        return this;
    }

    protected native void gst_pad_set_getrange_function_full(
        @Ptr
        long pad,
        @Ptr
        long get,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_getrange_function_full(Pointer get, Pointer user_data, Pointer notify) {
        this.gst_pad_set_getrange_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(get), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native void gst_pad_set_chain_list_function_full(
        @Ptr
        long pad,
        @Ptr
        long chainlist,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_chain_list_function_full(Pointer chainlist, Pointer user_data, Pointer notify) {
        this.gst_pad_set_chain_list_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(chainlist), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native IntValuedEnum<GstPadDirection> gst_pad_get_direction(
        @Ptr
        long pad);

    public IntValuedEnum<GstPadDirection> get_direction() {
        return this.gst_pad_get_direction(Pointer.pointerTo(this, GstPad.class).getPeer());
    }

    @Field(13)
    private Pointer field_querynotify() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    private GstPad field_querynotify(Pointer field_querynotify) {
        this.io.setPointerField(this, 13, field_querynotify);
        return this;
    }

    @Field(14)
    private IntValuedEnum<GstPadMode> field_mode() {
        return this.io.getEnumField(this, 14);
    }

    @Field(14)
    private GstPad field_mode(IntValuedEnum<GstPadMode> field_mode) {
        this.io.setEnumField(this, 14, field_mode);
        return this;
    }

    @Field(15)
    private Pointer field_eventnotify() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    private GstPad field_eventnotify(Pointer field_eventnotify) {
        this.io.setPointerField(this, 15, field_eventnotify);
        return this;
    }

    @Field(16)
    private Pointer field_chainfunc() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    private GstPad field_chainfunc(Pointer field_chainfunc) {
        this.io.setPointerField(this, 16, field_chainfunc);
        return this;
    }

    @Ptr
    protected static native long gst_pad_new(
        @Ptr
        long name, IntValuedEnum<GstPadDirection> direction);

    public static Pointer<GstPad> gstpad__new(Pointer name, IntValuedEnum<GstPadDirection> direction) {
        return Pointer.pointerToAddress(GstPad.gst_pad_new(Pointer.getPeer(name), direction), GstPad.class);
    }

    @Field(17)
    private Pointer gstpad_field__gst_reserved() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    private GstPad gstpad_field__gst_reserved(Pointer gstpad_field__gst_reserved) {
        this.io.setPointerField(this, 17, gstpad_field__gst_reserved);
        return this;
    }

    @Field(18)
    private Pointer<GstPadPrivate> field_priv() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    private GstPad field_priv(Pointer<GstPadPrivate> field_priv) {
        this.io.setPointerField(this, 18, field_priv);
        return this;
    }

    protected native void gst_pad_set_activatemode_function_full(
        @Ptr
        long pad,
        @Ptr
        long activatemode,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_activatemode_function_full(Pointer activatemode, Pointer user_data, Pointer notify) {
        this.gst_pad_set_activatemode_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(activatemode), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(19)
    private Pointer field_chainlistnotify() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    private GstPad field_chainlistnotify(Pointer field_chainlistnotify) {
        this.io.setPointerField(this, 19, field_chainlistnotify);
        return this;
    }

    protected native void gst_pad_set_link_function_full(
        @Ptr
        long pad,
        @Ptr
        long link,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_link_function_full(Pointer link, Pointer user_data, Pointer notify) {
        this.gst_pad_set_link_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(link), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(20)
    private long field_offset() {
        return this.io.getLongField(this, 20);
    }

    @Field(20)
    private GstPad field_offset(long field_offset) {
        this.io.setLongField(this, 20, field_offset);
        return this;
    }

    @Field(21)
    private Pointer field_chaindata() {
        return this.io.getPointerField(this, 21);
    }

    @Field(21)
    private GstPad field_chaindata(Pointer field_chaindata) {
        this.io.setPointerField(this, 21, field_chaindata);
        return this;
    }

    @Field(22)
    private Pointer field_activatemodefunc() {
        return this.io.getPointerField(this, 22);
    }

    @Field(22)
    private GstPad field_activatemodefunc(Pointer field_activatemodefunc) {
        this.io.setPointerField(this, 22, field_activatemodefunc);
        return this;
    }

    @Field(23)
    private Pointer<GstTask> field_task() {
        return this.io.getPointerField(this, 23);
    }

    @Field(23)
    private GstPad field_task(Pointer<GstTask> field_task) {
        this.io.setPointerField(this, 23, field_task);
        return this;
    }

    @Field(24)
    private Pointer field_activatemodedata() {
        return this.io.getPointerField(this, 24);
    }

    @Field(24)
    private GstPad field_activatemodedata(Pointer field_activatemodedata) {
        this.io.setPointerField(this, 24, field_activatemodedata);
        return this;
    }

    @Field(25)
    private Pointer field_queryfunc() {
        return this.io.getPointerField(this, 25);
    }

    @Field(25)
    private GstPad field_queryfunc(Pointer field_queryfunc) {
        this.io.setPointerField(this, 25, field_queryfunc);
        return this;
    }

    @Field(26)
    public IntValuedEnum<GstPadDirection> field_direction() {
        return this.io.getEnumField(this, 26);
    }

    @Field(26)
    public GstPad field_direction(IntValuedEnum<GstPadDirection> field_direction) {
        this.io.setEnumField(this, 26, field_direction);
        return this;
    }

    protected native void gst_pad_set_activate_function_full(
        @Ptr
        long pad,
        @Ptr
        long activate,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_activate_function_full(Pointer activate, Pointer user_data, Pointer notify) {
        this.gst_pad_set_activate_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(activate), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native void gst_pad_set_event_function_full(
        @Ptr
        long pad,
        @Ptr
        long event,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_event_function_full(Pointer event, Pointer user_data, Pointer notify) {
        this.gst_pad_set_event_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(event), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native void gst_pad_set_iterate_internal_links_function_full(
        @Ptr
        long pad,
        @Ptr
        long iterintlink,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void set_iterate_internal_links_function_full(Pointer iterintlink, Pointer user_data, Pointer notify) {
        this.gst_pad_set_iterate_internal_links_function_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(iterintlink), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(27)
    private int field_num_probes() {
        return this.io.getIntField(this, 27);
    }

    @Field(27)
    private GstPad field_num_probes(int field_num_probes) {
        this.io.setIntField(this, 27, field_num_probes);
        return this;
    }

    @Field(28)
    private Pointer field_unlinkfunc() {
        return this.io.getPointerField(this, 28);
    }

    @Field(28)
    private GstPad field_unlinkfunc(Pointer field_unlinkfunc) {
        this.io.setPointerField(this, 28, field_unlinkfunc);
        return this;
    }

    protected native boolean gst_pad_start_task(
        @Ptr
        long pad,
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public boolean start_task(Pointer func, Pointer user_data, Pointer notify) {
        return this.gst_pad_start_task(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Field(29)
    private Pointer field_getrangedata() {
        return this.io.getPointerField(this, 29);
    }

    @Field(29)
    private GstPad field_getrangedata(Pointer field_getrangedata) {
        this.io.setPointerField(this, 29, field_getrangedata);
        return this;
    }

    @Field(30)
    private Pointer field_linkdata() {
        return this.io.getPointerField(this, 30);
    }

    @Field(30)
    private GstPad field_linkdata(Pointer field_linkdata) {
        this.io.setPointerField(this, 30, field_linkdata);
        return this;
    }

    @Field(31)
    private Pointer field_unlinknotify() {
        return this.io.getPointerField(this, 31);
    }

    @Field(31)
    private GstPad field_unlinknotify(Pointer field_unlinknotify) {
        this.io.setPointerField(this, 31, field_unlinknotify);
        return this;
    }

    @Field(32)
    private Pointer field_chainlistdata() {
        return this.io.getPointerField(this, 32);
    }

    @Field(32)
    private GstPad field_chainlistdata(Pointer field_chainlistdata) {
        this.io.setPointerField(this, 32, field_chainlistdata);
        return this;
    }

    @Field(33)
    private Pointer field_eventdata() {
        return this.io.getPointerField(this, 33);
    }

    @Field(33)
    private GstPad field_eventdata(Pointer field_eventdata) {
        this.io.setPointerField(this, 33, field_eventdata);
        return this;
    }

    protected native boolean gst_pad_forward(
        @Ptr
        long pad,
        @Ptr
        long forward,
        @Ptr
        long user_data);

    public boolean forward(Pointer forward, Pointer user_data) {
        return this.gst_pad_forward(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(forward), Pointer.getPeer(user_data));
    }

    protected native void gst_pad_sticky_events_foreach(
        @Ptr
        long pad,
        @Ptr
        long foreach_func,
        @Ptr
        long user_data);

    public void sticky_events_foreach(Pointer foreach_func, Pointer user_data) {
        this.gst_pad_sticky_events_foreach(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(foreach_func), Pointer.getPeer(user_data));
    }

    @Field(34)
    private Pointer field_getrangenotify() {
        return this.io.getPointerField(this, 34);
    }

    @Field(34)
    private GstPad field_getrangenotify(Pointer field_getrangenotify) {
        this.io.setPointerField(this, 34, field_getrangenotify);
        return this;
    }

    @Field(35)
    private Pointer field_querydata() {
        return this.io.getPointerField(this, 35);
    }

    @Field(35)
    private GstPad field_querydata(Pointer field_querydata) {
        this.io.setPointerField(this, 35, field_querydata);
        return this;
    }

    @Field(36)
    private Pointer field_chainlistfunc() {
        return this.io.getPointerField(this, 36);
    }

    @Field(36)
    private GstPad field_chainlistfunc(Pointer field_chainlistfunc) {
        this.io.setPointerField(this, 36, field_chainlistfunc);
        return this;
    }

    @Field(37)
    private Pointer<GstPad> field_peer() {
        return this.io.getPointerField(this, 37);
    }

    @Field(37)
    private GstPad field_peer(Pointer<GstPad> field_peer) {
        this.io.setPointerField(this, 37, field_peer);
        return this;
    }

    @Field(38)
    private Pointer field_iterintlinknotify() {
        return this.io.getPointerField(this, 38);
    }

    @Field(38)
    private GstPad field_iterintlinknotify(Pointer field_iterintlinknotify) {
        this.io.setPointerField(this, 38, field_iterintlinknotify);
        return this;
    }

    protected native IntValuedEnum<GstPadLinkReturn> gst_pad_link_full(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad, IntValuedEnum<GstPadLinkCheck> flags);

    public IntValuedEnum<GstPadLinkReturn> link_full(Pointer<GstPad> sinkpad, IntValuedEnum<GstPadLinkCheck> flags) {
        return this.gst_pad_link_full(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(sinkpad), flags);
    }

    @Field(39)
    private GHookList field_probes() {
        return this.io.getNativeObjectField(this, 39);
    }

    @Field(39)
    private GstPad field_probes(GHookList field_probes) {
        this.io.setNativeObjectField(this, 39, field_probes);
        return this;
    }

    @Field(40)
    private Pointer field_linknotify() {
        return this.io.getPointerField(this, 40);
    }

    @Field(40)
    private GstPad field_linknotify(Pointer field_linknotify) {
        this.io.setPointerField(this, 40, field_linknotify);
        return this;
    }

    protected native IntValuedEnum<GstPadLinkReturn> gst_pad_link(
        @Ptr
        long srcpad,
        @Ptr
        long sinkpad);

    public IntValuedEnum<GstPadLinkReturn> link(Pointer<GstPad> sinkpad) {
        return this.gst_pad_link(Pointer.pointerTo(this, GstPad.class).getPeer(), Pointer.getPeer(sinkpad));
    }

    @Field(41)
    private int field_num_blocked() {
        return this.io.getIntField(this, 41);
    }

    @Field(41)
    private GstPad field_num_blocked(int field_num_blocked) {
        this.io.setIntField(this, 41, field_num_blocked);
        return this;
    }

    @Field(42)
    private Pointer field_activatemodenotify() {
        return this.io.getPointerField(this, 42);
    }

    @Field(42)
    private GstPad field_activatemodenotify(Pointer field_activatemodenotify) {
        this.io.setPointerField(this, 42, field_activatemodenotify);
        return this;
    }

    @Field(43)
    private Pointer field_eventfunc() {
        return this.io.getPointerField(this, 43);
    }

    @Field(43)
    private GstPad field_eventfunc(Pointer field_eventfunc) {
        this.io.setPointerField(this, 43, field_eventfunc);
        return this;
    }

    @Field(44)
    private Pointer field_iterintlinkdata() {
        return this.io.getPointerField(this, 44);
    }

    @Field(44)
    private GstPad field_iterintlinkdata(Pointer field_iterintlinkdata) {
        this.io.setPointerField(this, 44, field_iterintlinkdata);
        return this;
    }

}
