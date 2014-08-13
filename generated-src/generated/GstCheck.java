
package generated;

import generated.glib20.glib.GList;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstFormat;
import generated.gstreamer10.gst.GstMessage;
import generated.gstreamer10.gst.GstObject;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstStaticPadTemplate;
import generated.gstreamercheck10.gstcheck.GstCheckABIStruct;
import generated.gstreamercheck10.gstcheck.GstStreamConsistency;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstCheck {


    @Ptr
    protected native long gst_buffer_straw_get_buffer(
        @Ptr
        long bin,
        @Ptr
        long pad);

    public Pointer<GstBuffer> buffer_straw_get_buffer(Pointer<GstElement> bin, Pointer<GstPad> pad) {
        return Pointer.pointerToAddress(this.gst_buffer_straw_get_buffer(Pointer.getPeer(bin), Pointer.getPeer(pad)), Pointer.class);
    }

    protected native void gst_buffer_straw_start_pipeline(
        @Ptr
        long bin,
        @Ptr
        long pad);

    public void buffer_straw_start_pipeline(Pointer<GstElement> bin, Pointer<GstPad> pad) {
        this.gst_buffer_straw_start_pipeline(Pointer.getPeer(bin), Pointer.getPeer(pad));
    }

    protected native void gst_buffer_straw_stop_pipeline(
        @Ptr
        long bin,
        @Ptr
        long pad);

    public void buffer_straw_stop_pipeline(Pointer<GstElement> bin, Pointer<GstPad> pad) {
        this.gst_buffer_straw_stop_pipeline(Pointer.getPeer(bin), Pointer.getPeer(pad));
    }

    public native void gst_check_abi_list(GstCheckABIStruct list, boolean have_abi_sizes);

    protected native void gst_check_buffer_data(
        @Ptr
        long buffer, Pointer data, long size);

    public void check_buffer_data(Pointer<GstBuffer> buffer, Pointer data, long size) {
        this.gst_check_buffer_data(Pointer.getPeer(buffer), data, size);
    }

    protected native void gst_check_caps_equal(
        @Ptr
        long caps1,
        @Ptr
        long caps2);

    public void check_caps_equal(Pointer<GstCaps> caps1, Pointer<GstCaps> caps2) {
        this.gst_check_caps_equal(Pointer.getPeer(caps1), Pointer.getPeer(caps2));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_check_chain_func(
        @Ptr
        long pad,
        @Ptr
        long parent,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> check_chain_func(Pointer<GstPad> pad, Pointer<GstObject> parent, Pointer<GstBuffer> buffer) {
        return this.gst_check_chain_func(Pointer.getPeer(pad), Pointer.getPeer(parent), Pointer.getPeer(buffer));
    }

    public native void gst_check_drop_buffers();

    protected native void gst_check_element_push_buffer(
        @Ptr
        long element_name,
        @Ptr
        long buffer_in,
        @Ptr
        long caps_in,
        @Ptr
        long buffer_out,
        @Ptr
        long caps_out);

    public void check_element_push_buffer(Pointer element_name, Pointer<GstBuffer> buffer_in, Pointer<GstCaps> caps_in, Pointer<GstBuffer> buffer_out, Pointer<GstCaps> caps_out) {
        this.gst_check_element_push_buffer(Pointer.getPeer(element_name), Pointer.getPeer(buffer_in), Pointer.getPeer(caps_in), Pointer.getPeer(buffer_out), Pointer.getPeer(caps_out));
    }

    protected native void gst_check_element_push_buffer_list(
        @Ptr
        long element_name,
        @Ptr
        long buffer_in,
        @Ptr
        long caps_in,
        @Ptr
        long buffer_out,
        @Ptr
        long caps_out, IntValuedEnum<GstFlowReturn> last_flow_return);

    public void check_element_push_buffer_list(Pointer element_name, Pointer<GList> buffer_in, Pointer<GstCaps> caps_in, Pointer<GList> buffer_out, Pointer<GstCaps> caps_out, IntValuedEnum<GstFlowReturn> last_flow_return) {
        this.gst_check_element_push_buffer_list(Pointer.getPeer(element_name), Pointer.getPeer(buffer_in), Pointer.getPeer(caps_in), Pointer.getPeer(buffer_out), Pointer.getPeer(caps_out), last_flow_return);
    }

    protected native void gst_check_init(
        @Ptr
        long argc,
        @Ptr
        long argv);

    public void check_init(Pointer<Integer> argc, Pointer argv) {
        this.gst_check_init(Pointer.getPeer(argc), Pointer.getPeer(argv));
    }

    protected native void gst_check_message_error(
        @Ptr
        long message, Object type, Object domain, int code);

    public void check_message_error(Pointer<GstMessage> message, Object type, Object domain, int code) {
        this.gst_check_message_error(Pointer.getPeer(message), type, domain, code);
    }

    protected native int gst_check_run_suite(
        @Ptr
        long name,
        @Ptr
        long fname, Object... varargs);

    public int check_run_suite(Pointer name, Pointer fname, Object... varargs) {
        return this.gst_check_run_suite(varargs, Pointer.getPeer(name), Pointer.getPeer(fname));
    }

    @Ptr
    protected native long gst_check_setup_element(
        @Ptr
        long factory);

    public Pointer<GstElement> check_setup_element(Pointer factory) {
        return Pointer.pointerToAddress(this.gst_check_setup_element(Pointer.getPeer(factory)), Pointer.class);
    }

    protected native void gst_check_setup_events(
        @Ptr
        long srcpad,
        @Ptr
        long element,
        @Ptr
        long caps, IntValuedEnum<GstFormat> format);

    public void check_setup_events(Pointer<GstPad> srcpad, Pointer<GstElement> element, Pointer<GstCaps> caps, IntValuedEnum<GstFormat> format) {
        this.gst_check_setup_events(Pointer.getPeer(srcpad), Pointer.getPeer(element), Pointer.getPeer(caps), format);
    }

    protected native void gst_check_setup_events_with_stream_id(
        @Ptr
        long srcpad,
        @Ptr
        long element,
        @Ptr
        long caps, IntValuedEnum<GstFormat> format,
        @Ptr
        long stream_id);

    public void check_setup_events_with_stream_id(Pointer<GstPad> srcpad, Pointer<GstElement> element, Pointer<GstCaps> caps, IntValuedEnum<GstFormat> format, Pointer stream_id) {
        this.gst_check_setup_events_with_stream_id(Pointer.getPeer(srcpad), Pointer.getPeer(element), Pointer.getPeer(caps), format, Pointer.getPeer(stream_id));
    }

    @Ptr
    protected native long gst_check_setup_sink_pad(
        @Ptr
        long element,
        @Ptr
        long tmpl);

    public Pointer<GstPad> check_setup_sink_pad(Pointer<GstElement> element, Pointer<GstStaticPadTemplate> tmpl) {
        return Pointer.pointerToAddress(this.gst_check_setup_sink_pad(Pointer.getPeer(element), Pointer.getPeer(tmpl)), Pointer.class);
    }

    @Ptr
    protected native long gst_check_setup_sink_pad_by_name(
        @Ptr
        long element,
        @Ptr
        long tmpl,
        @Ptr
        long name);

    public Pointer<GstPad> check_setup_sink_pad_by_name(Pointer<GstElement> element, Pointer<GstStaticPadTemplate> tmpl, Pointer name) {
        return Pointer.pointerToAddress(this.gst_check_setup_sink_pad_by_name(Pointer.getPeer(element), Pointer.getPeer(tmpl), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long gst_check_setup_src_pad(
        @Ptr
        long element,
        @Ptr
        long tmpl);

    public Pointer<GstPad> check_setup_src_pad(Pointer<GstElement> element, Pointer<GstStaticPadTemplate> tmpl) {
        return Pointer.pointerToAddress(this.gst_check_setup_src_pad(Pointer.getPeer(element), Pointer.getPeer(tmpl)), Pointer.class);
    }

    @Ptr
    protected native long gst_check_setup_src_pad_by_name(
        @Ptr
        long element,
        @Ptr
        long tmpl,
        @Ptr
        long name);

    public Pointer<GstPad> check_setup_src_pad_by_name(Pointer<GstElement> element, Pointer<GstStaticPadTemplate> tmpl, Pointer name) {
        return Pointer.pointerToAddress(this.gst_check_setup_src_pad_by_name(Pointer.getPeer(element), Pointer.getPeer(tmpl), Pointer.getPeer(name)), Pointer.class);
    }

    protected native void gst_check_teardown_element(
        @Ptr
        long element);

    public void check_teardown_element(Pointer<GstElement> element) {
        this.gst_check_teardown_element(Pointer.getPeer(element));
    }

    protected native void gst_check_teardown_pad_by_name(
        @Ptr
        long element,
        @Ptr
        long name);

    public void check_teardown_pad_by_name(Pointer<GstElement> element, Pointer name) {
        this.gst_check_teardown_pad_by_name(Pointer.getPeer(element), Pointer.getPeer(name));
    }

    protected native void gst_check_teardown_sink_pad(
        @Ptr
        long element);

    public void check_teardown_sink_pad(Pointer<GstElement> element) {
        this.gst_check_teardown_sink_pad(Pointer.getPeer(element));
    }

    protected native void gst_check_teardown_src_pad(
        @Ptr
        long element);

    public void check_teardown_src_pad(Pointer<GstElement> element) {
        this.gst_check_teardown_src_pad(Pointer.getPeer(element));
    }

    protected native boolean gst_consistency_checker_add_pad(
        @Ptr
        long consist,
        @Ptr
        long pad);

    public boolean consistency_checker_add_pad(Pointer<GstStreamConsistency> consist, Pointer<GstPad> pad) {
        return this.gst_consistency_checker_add_pad(Pointer.getPeer(consist), Pointer.getPeer(pad));
    }

    protected native void gst_consistency_checker_free(
        @Ptr
        long consist);

    public void consistency_checker_free(Pointer<GstStreamConsistency> consist) {
        this.gst_consistency_checker_free(Pointer.getPeer(consist));
    }

    @Ptr
    protected native long gst_consistency_checker_new(
        @Ptr
        long pad);

    public Pointer<GstStreamConsistency> consistency_checker_new(Pointer<GstPad> pad) {
        return Pointer.pointerToAddress(this.gst_consistency_checker_new(Pointer.getPeer(pad)), Pointer.class);
    }

    protected native void gst_consistency_checker_reset(
        @Ptr
        long consist);

    public void consistency_checker_reset(Pointer<GstStreamConsistency> consist) {
        this.gst_consistency_checker_reset(Pointer.getPeer(consist));
    }

}
