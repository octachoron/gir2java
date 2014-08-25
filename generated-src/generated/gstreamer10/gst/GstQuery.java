
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstQuery
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstQuery() {
        super();
    }

    public GstQuery(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMiniObject gstquery_field_mini_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstQuery gstquery_field_mini_object(GstMiniObject gstquery_field_mini_object) {
        this.io.setNativeObjectField(this, 0, gstquery_field_mini_object);
        return this;
    }

    protected native void gst_query_parse_nth_format(
        @Ptr
        long query, long nth,
        @Ptr
        long format);

    public void parse_nth_format(long nth, Pointer<IntValuedEnum<GstFormat>> format) {
        this.gst_query_parse_nth_format(Pointer.pointerTo(this, GstQuery.class).getPeer(), nth, Pointer.getPeer(format));
    }

    protected native void gst_query_parse_uri_redirection(
        @Ptr
        long query,
        @Ptr
        long uri);

    public void parse_uri_redirection(Pointer uri) {
        this.gst_query_parse_uri_redirection(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native void gst_query_set_latency(
        @Ptr
        long query, boolean live, long min_latency, long max_latency);

    public void set_latency(boolean live, long min_latency, long max_latency) {
        this.gst_query_set_latency(Pointer.pointerTo(this, GstQuery.class).getPeer(), live, min_latency, max_latency);
    }

    protected native void gst_query_set_duration(
        @Ptr
        long query, IntValuedEnum<GstFormat> format, long duration);

    public void set_duration(IntValuedEnum<GstFormat> format, long duration) {
        this.gst_query_set_duration(Pointer.pointerTo(this, GstQuery.class).getPeer(), format, duration);
    }

    protected native void gst_query_set_formats(
        @Ptr
        long query, int n_formats, Object... varargs);

    public void set_formats(int n_formats, Object... varargs) {
        this.gst_query_set_formats(Pointer.pointerTo(this, GstQuery.class).getPeer(), n_formats, varargs);
    }

    protected native void gst_query_parse_buffering_percent(
        @Ptr
        long query,
        @Ptr
        long busy,
        @Ptr
        long percent);

    public void parse_buffering_percent(Pointer<Boolean> busy, Pointer<Integer> percent) {
        this.gst_query_parse_buffering_percent(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(busy), Pointer.getPeer(percent));
    }

    @Ptr
    protected static native long gst_query_new_allocation(
        @Ptr
        long caps, boolean need_pool);

    public static Pointer<GstQuery> new_allocation(Pointer<GstCaps> caps, boolean need_pool) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_allocation(Pointer.getPeer(caps), need_pool), GstQuery.class);
    }

    protected native boolean gst_query_add_buffering_range(
        @Ptr
        long query, long start, long stop);

    public boolean add_buffering_range(long start, long stop) {
        return this.gst_query_add_buffering_range(Pointer.pointerTo(this, GstQuery.class).getPeer(), start, stop);
    }

    protected native void gst_query_set_nth_allocation_param(
        @Ptr
        long query, long index,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void set_nth_allocation_param(long index, Pointer<GstAllocator> allocator, Pointer<GstAllocationParams> params) {
        this.gst_query_set_nth_allocation_param(Pointer.pointerTo(this, GstQuery.class).getPeer(), index, Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    protected native void gst_query_parse_context(
        @Ptr
        long query,
        @Ptr
        long context);

    public void parse_context(Pointer<Pointer<GstContext>> context) {
        this.gst_query_parse_context(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(context));
    }

    protected native void gst_query_parse_latency(
        @Ptr
        long query,
        @Ptr
        long live,
        @Ptr
        long min_latency,
        @Ptr
        long max_latency);

    public void parse_latency(Pointer<Boolean> live, Pointer<Long> min_latency, Pointer<Long> max_latency) {
        this.gst_query_parse_latency(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(live), Pointer.getPeer(min_latency), Pointer.getPeer(max_latency));
    }

    protected native long gst_query_get_n_scheduling_modes(
        @Ptr
        long query);

    public long get_n_scheduling_modes() {
        return this.gst_query_get_n_scheduling_modes(Pointer.pointerTo(this, GstQuery.class).getPeer());
    }

    @Ptr
    protected static native long gst_query_new_formats();

    public static Pointer<GstQuery> new_formats() {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_formats(), GstQuery.class);
    }

    protected native void gst_query_parse_accept_caps(
        @Ptr
        long query,
        @Ptr
        long caps);

    public void parse_accept_caps(Pointer<Pointer<GstCaps>> caps) {
        this.gst_query_parse_accept_caps(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(caps));
    }

    protected native void gst_query_parse_accept_caps_result(
        @Ptr
        long query,
        @Ptr
        long result);

    public void parse_accept_caps_result(Pointer<Boolean> result) {
        this.gst_query_parse_accept_caps_result(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(result));
    }

    protected native boolean gst_query_has_scheduling_mode_with_flags(
        @Ptr
        long query, IntValuedEnum<GstPadMode> mode, IntValuedEnum<GstSchedulingFlags> flags);

    public boolean has_scheduling_mode_with_flags(IntValuedEnum<GstPadMode> mode, IntValuedEnum<GstSchedulingFlags> flags) {
        return this.gst_query_has_scheduling_mode_with_flags(Pointer.pointerTo(this, GstQuery.class).getPeer(), mode, flags);
    }

    protected native void gst_query_set_buffering_percent(
        @Ptr
        long query, boolean busy, int percent);

    public void set_buffering_percent(boolean busy, int percent) {
        this.gst_query_set_buffering_percent(Pointer.pointerTo(this, GstQuery.class).getPeer(), busy, percent);
    }

    @Ptr
    protected static native long gst_query_new_convert(IntValuedEnum<GstFormat> src_format, long value, IntValuedEnum<GstFormat> dest_format);

    public static Pointer<GstQuery> new_convert(IntValuedEnum<GstFormat> src_format, long value, IntValuedEnum<GstFormat> dest_format) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_convert(src_format, value, dest_format), GstQuery.class);
    }

    protected native void gst_query_parse_convert(
        @Ptr
        long query,
        @Ptr
        long src_format,
        @Ptr
        long src_value,
        @Ptr
        long dest_format,
        @Ptr
        long dest_value);

    public void parse_convert(Pointer<IntValuedEnum<GstFormat>> src_format, Pointer<Long> src_value, Pointer<IntValuedEnum<GstFormat>> dest_format, Pointer<Long> dest_value) {
        this.gst_query_parse_convert(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(src_format), Pointer.getPeer(src_value), Pointer.getPeer(dest_format), Pointer.getPeer(dest_value));
    }

    protected native void gst_query_set_uri_redirection(
        @Ptr
        long query,
        @Ptr
        long uri);

    public void set_uri_redirection(Pointer uri) {
        this.gst_query_set_uri_redirection(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native void gst_query_parse_segment(
        @Ptr
        long query,
        @Ptr
        long rate,
        @Ptr
        long format,
        @Ptr
        long start_value,
        @Ptr
        long stop_value);

    public void parse_segment(Pointer<Double> rate, Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> start_value, Pointer<Long> stop_value) {
        this.gst_query_parse_segment(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(rate), Pointer.getPeer(format), Pointer.getPeer(start_value), Pointer.getPeer(stop_value));
    }

    protected native IntValuedEnum<GstPadMode> gst_query_parse_nth_scheduling_mode(
        @Ptr
        long query, long index);

    public IntValuedEnum<GstPadMode> parse_nth_scheduling_mode(long index) {
        return this.gst_query_parse_nth_scheduling_mode(Pointer.pointerTo(this, GstQuery.class).getPeer(), index);
    }

    protected native void gst_query_set_seeking(
        @Ptr
        long query, IntValuedEnum<GstFormat> format, boolean seekable, long segment_start, long segment_end);

    public void set_seeking(IntValuedEnum<GstFormat> format, boolean seekable, long segment_start, long segment_end) {
        this.gst_query_set_seeking(Pointer.pointerTo(this, GstQuery.class).getPeer(), format, seekable, segment_start, segment_end);
    }

    protected native void gst_query_add_allocation_pool(
        @Ptr
        long query,
        @Ptr
        long pool, long size, long min_buffers, long max_buffers);

    public void add_allocation_pool(Pointer<GstBufferPool> pool, long size, long min_buffers, long max_buffers) {
        this.gst_query_add_allocation_pool(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(pool), size, min_buffers, max_buffers);
    }

    protected native void gst_query_parse_seeking(
        @Ptr
        long query,
        @Ptr
        long format,
        @Ptr
        long seekable,
        @Ptr
        long segment_start,
        @Ptr
        long segment_end);

    public void parse_seeking(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Boolean> seekable, Pointer<Long> segment_start, Pointer<Long> segment_end) {
        this.gst_query_parse_seeking(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(seekable), Pointer.getPeer(segment_start), Pointer.getPeer(segment_end));
    }

    protected native void gst_query_set_buffering_range(
        @Ptr
        long query, IntValuedEnum<GstFormat> format, long start, long stop, long estimated_total);

    public void set_buffering_range(IntValuedEnum<GstFormat> format, long start, long stop, long estimated_total) {
        this.gst_query_set_buffering_range(Pointer.pointerTo(this, GstQuery.class).getPeer(), format, start, stop, estimated_total);
    }

    protected native void gst_query_parse_position(
        @Ptr
        long query,
        @Ptr
        long format,
        @Ptr
        long cur);

    public void parse_position(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> cur) {
        this.gst_query_parse_position(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(cur));
    }

    protected native void gst_query_parse_buffering_stats(
        @Ptr
        long query,
        @Ptr
        long mode,
        @Ptr
        long avg_in,
        @Ptr
        long avg_out,
        @Ptr
        long buffering_left);

    public void parse_buffering_stats(Pointer<IntValuedEnum<GstBufferingMode>> mode, Pointer<Integer> avg_in, Pointer<Integer> avg_out, Pointer<Long> buffering_left) {
        this.gst_query_parse_buffering_stats(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(mode), Pointer.getPeer(avg_in), Pointer.getPeer(avg_out), Pointer.getPeer(buffering_left));
    }

    @Ptr
    protected static native long gst_query_new_segment(IntValuedEnum<GstFormat> format);

    public static Pointer<GstQuery> new_segment(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_segment(format), GstQuery.class);
    }

    @Ptr
    protected static native long gst_query_new_caps(
        @Ptr
        long filter);

    public static Pointer<GstQuery> new_caps(Pointer<GstCaps> filter) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_caps(Pointer.getPeer(filter)), GstQuery.class);
    }

    protected native void gst_query_set_nth_allocation_pool(
        @Ptr
        long query, long index,
        @Ptr
        long pool, long size, long min_buffers, long max_buffers);

    public void set_nth_allocation_pool(long index, Pointer<GstBufferPool> pool, long size, long min_buffers, long max_buffers) {
        this.gst_query_set_nth_allocation_pool(Pointer.pointerTo(this, GstQuery.class).getPeer(), index, Pointer.getPeer(pool), size, min_buffers, max_buffers);
    }

    protected native void gst_query_set_formatsv(
        @Ptr
        long query, int n_formats,
        @Ptr
        long formats);

    public void set_formatsv(int n_formats, Pointer<IntValuedEnum<GstFormat>> formats) {
        this.gst_query_set_formatsv(Pointer.pointerTo(this, GstQuery.class).getPeer(), n_formats, Pointer.getPeer(formats));
    }

    protected native void gst_query_set_scheduling(
        @Ptr
        long query, IntValuedEnum<GstSchedulingFlags> flags, int minsize, int maxsize, int align);

    public void set_scheduling(IntValuedEnum<GstSchedulingFlags> flags, int minsize, int maxsize, int align) {
        this.gst_query_set_scheduling(Pointer.pointerTo(this, GstQuery.class).getPeer(), flags, minsize, maxsize, align);
    }

    protected native long gst_query_get_n_buffering_ranges(
        @Ptr
        long query);

    public long get_n_buffering_ranges() {
        return this.gst_query_get_n_buffering_ranges(Pointer.pointerTo(this, GstQuery.class).getPeer());
    }

    protected native void gst_query_set_accept_caps_result(
        @Ptr
        long query, boolean result);

    public void set_accept_caps_result(boolean result) {
        this.gst_query_set_accept_caps_result(Pointer.pointerTo(this, GstQuery.class).getPeer(), result);
    }

    protected native long gst_query_get_n_allocation_pools(
        @Ptr
        long query);

    public long get_n_allocation_pools() {
        return this.gst_query_get_n_allocation_pools(Pointer.pointerTo(this, GstQuery.class).getPeer());
    }

    @Ptr
    protected static native long gst_query_new_duration(IntValuedEnum<GstFormat> format);

    public static Pointer<GstQuery> new_duration(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_duration(format), GstQuery.class);
    }

    @Ptr
    protected native long gst_query_writable_structure(
        @Ptr
        long query);

    public Pointer<GstStructure> writable_structure() {
        return Pointer.pointerToAddress(this.gst_query_writable_structure(Pointer.pointerTo(this, GstQuery.class).getPeer()), GstStructure.class);
    }

    protected native void gst_query_parse_duration(
        @Ptr
        long query,
        @Ptr
        long format,
        @Ptr
        long duration);

    public void parse_duration(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> duration) {
        this.gst_query_parse_duration(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(duration));
    }

    @Ptr
    protected static native long gst_query_new_uri();

    public static Pointer<GstQuery> new_uri() {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_uri(), GstQuery.class);
    }

    protected native boolean gst_query_parse_context_type(
        @Ptr
        long query,
        @Ptr
        long context_type);

    public boolean parse_context_type(Pointer context_type) {
        return this.gst_query_parse_context_type(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(context_type));
    }

    protected native void gst_query_set_uri(
        @Ptr
        long query,
        @Ptr
        long uri);

    public void set_uri(Pointer uri) {
        this.gst_query_set_uri(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native void gst_query_remove_nth_allocation_pool(
        @Ptr
        long query, long index);

    public void remove_nth_allocation_pool(long index) {
        this.gst_query_remove_nth_allocation_pool(Pointer.pointerTo(this, GstQuery.class).getPeer(), index);
    }

    @Ptr
    protected static native long gst_query_new_context(
        @Ptr
        long context_type);

    public static Pointer<GstQuery> new_context(Pointer context_type) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_context(Pointer.getPeer(context_type)), GstQuery.class);
    }

    protected native void gst_query_add_allocation_meta(
        @Ptr
        long query, long api,
        @Ptr
        long params);

    public void add_allocation_meta(long api, Pointer<GstStructure> params) {
        this.gst_query_add_allocation_meta(Pointer.pointerTo(this, GstQuery.class).getPeer(), api, Pointer.getPeer(params));
    }

    protected native void gst_query_set_context(
        @Ptr
        long query,
        @Ptr
        long context);

    public void set_context(Pointer<GstContext> context) {
        this.gst_query_set_context(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(context));
    }

    protected native void gst_query_parse_caps(
        @Ptr
        long query,
        @Ptr
        long filter);

    public void parse_caps(Pointer<Pointer<GstCaps>> filter) {
        this.gst_query_parse_caps(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(filter));
    }

    @Ptr
    protected native long gst_query_get_structure(
        @Ptr
        long query);

    public Pointer<GstStructure> get_structure() {
        return Pointer.pointerToAddress(this.gst_query_get_structure(Pointer.pointerTo(this, GstQuery.class).getPeer()), GstStructure.class);
    }

    protected native long gst_query_parse_nth_allocation_meta(
        @Ptr
        long query, long index,
        @Ptr
        long params);

    public long parse_nth_allocation_meta(long index, Pointer<Pointer<GstStructure>> params) {
        return this.gst_query_parse_nth_allocation_meta(Pointer.pointerTo(this, GstQuery.class).getPeer(), index, Pointer.getPeer(params));
    }

    protected native void gst_query_parse_nth_allocation_pool(
        @Ptr
        long query, long index,
        @Ptr
        long pool,
        @Ptr
        long size,
        @Ptr
        long min_buffers,
        @Ptr
        long max_buffers);

    public void parse_nth_allocation_pool(long index, Pointer<Pointer<GstBufferPool>> pool, Pointer<Long> size, Pointer<Long> min_buffers, Pointer<Long> max_buffers) {
        this.gst_query_parse_nth_allocation_pool(Pointer.pointerTo(this, GstQuery.class).getPeer(), index, Pointer.getPeer(pool), Pointer.getPeer(size), Pointer.getPeer(min_buffers), Pointer.getPeer(max_buffers));
    }

    protected native void gst_query_parse_scheduling(
        @Ptr
        long query,
        @Ptr
        long flags,
        @Ptr
        long minsize,
        @Ptr
        long maxsize,
        @Ptr
        long align);

    public void parse_scheduling(Pointer<IntValuedEnum<GstSchedulingFlags>> flags, Pointer<Integer> minsize, Pointer<Integer> maxsize, Pointer<Integer> align) {
        this.gst_query_parse_scheduling(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(flags), Pointer.getPeer(minsize), Pointer.getPeer(maxsize), Pointer.getPeer(align));
    }

    protected native long gst_query_get_n_allocation_metas(
        @Ptr
        long query);

    public long get_n_allocation_metas() {
        return this.gst_query_get_n_allocation_metas(Pointer.pointerTo(this, GstQuery.class).getPeer());
    }

    protected native void gst_query_set_caps_result(
        @Ptr
        long query,
        @Ptr
        long caps);

    public void set_caps_result(Pointer<GstCaps> caps) {
        this.gst_query_set_caps_result(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(caps));
    }

    protected native void gst_query_remove_nth_allocation_meta(
        @Ptr
        long query, long index);

    public void remove_nth_allocation_meta(long index) {
        this.gst_query_remove_nth_allocation_meta(Pointer.pointerTo(this, GstQuery.class).getPeer(), index);
    }

    protected native void gst_query_set_segment(
        @Ptr
        long query, double rate, IntValuedEnum<GstFormat> format, long start_value, long stop_value);

    public void set_segment(double rate, IntValuedEnum<GstFormat> format, long start_value, long stop_value) {
        this.gst_query_set_segment(Pointer.pointerTo(this, GstQuery.class).getPeer(), rate, format, start_value, stop_value);
    }

    @Ptr
    protected static native long gst_query_new_accept_caps(
        @Ptr
        long caps);

    public static Pointer<GstQuery> new_accept_caps(Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_accept_caps(Pointer.getPeer(caps)), GstQuery.class);
    }

    @Ptr
    protected static native long gst_query_new_latency();

    public static Pointer<GstQuery> new_latency() {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_latency(), GstQuery.class);
    }

    protected native void gst_query_set_position(
        @Ptr
        long query, IntValuedEnum<GstFormat> format, long cur);

    public void set_position(IntValuedEnum<GstFormat> format, long cur) {
        this.gst_query_set_position(Pointer.pointerTo(this, GstQuery.class).getPeer(), format, cur);
    }

    @Ptr
    protected static native long gst_query_new_buffering(IntValuedEnum<GstFormat> format);

    public static Pointer<GstQuery> new_buffering(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_buffering(format), GstQuery.class);
    }

    @Ptr
    protected static native long gst_query_new_drain();

    public static Pointer<GstQuery> new_drain() {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_drain(), GstQuery.class);
    }

    @Ptr
    protected static native long gst_query_new_seeking(IntValuedEnum<GstFormat> format);

    public static Pointer<GstQuery> new_seeking(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_seeking(format), GstQuery.class);
    }

    protected native void gst_query_parse_allocation(
        @Ptr
        long query,
        @Ptr
        long caps,
        @Ptr
        long need_pool);

    public void parse_allocation(Pointer<Pointer<GstCaps>> caps, Pointer<Boolean> need_pool) {
        this.gst_query_parse_allocation(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(caps), Pointer.getPeer(need_pool));
    }

    protected native void gst_query_parse_uri(
        @Ptr
        long query,
        @Ptr
        long uri);

    public void parse_uri(Pointer uri) {
        this.gst_query_parse_uri(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native boolean gst_query_has_scheduling_mode(
        @Ptr
        long query, IntValuedEnum<GstPadMode> mode);

    public boolean has_scheduling_mode(IntValuedEnum<GstPadMode> mode) {
        return this.gst_query_has_scheduling_mode(Pointer.pointerTo(this, GstQuery.class).getPeer(), mode);
    }

    @Ptr
    protected static native long gst_query_new_position(IntValuedEnum<GstFormat> format);

    public static Pointer<GstQuery> new_position(IntValuedEnum<GstFormat> format) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_position(format), GstQuery.class);
    }

    protected native void gst_query_add_allocation_param(
        @Ptr
        long query,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void add_allocation_param(Pointer<GstAllocator> allocator, Pointer<GstAllocationParams> params) {
        this.gst_query_add_allocation_param(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    @Ptr
    protected static native long gst_query_new_custom(IntValuedEnum<GstQueryType> type,
        @Ptr
        long structure);

    public static Pointer<GstQuery> new_custom(IntValuedEnum<GstQueryType> type, Pointer<GstStructure> structure) {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_custom(type, Pointer.getPeer(structure)), GstQuery.class);
    }

    protected native void gst_query_set_convert(
        @Ptr
        long query, IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format, long dest_value);

    public void set_convert(IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format, long dest_value) {
        this.gst_query_set_convert(Pointer.pointerTo(this, GstQuery.class).getPeer(), src_format, src_value, dest_format, dest_value);
    }

    protected native void gst_query_set_buffering_stats(
        @Ptr
        long query, IntValuedEnum<GstBufferingMode> mode, int avg_in, int avg_out, long buffering_left);

    public void set_buffering_stats(IntValuedEnum<GstBufferingMode> mode, int avg_in, int avg_out, long buffering_left) {
        this.gst_query_set_buffering_stats(Pointer.pointerTo(this, GstQuery.class).getPeer(), mode, avg_in, avg_out, buffering_left);
    }

    protected native boolean gst_query_find_allocation_meta(
        @Ptr
        long query, long api,
        @Ptr
        long index);

    public boolean find_allocation_meta(long api, Pointer<Long> index) {
        return this.gst_query_find_allocation_meta(Pointer.pointerTo(this, GstQuery.class).getPeer(), api, Pointer.getPeer(index));
    }

    protected native void gst_query_parse_n_formats(
        @Ptr
        long query,
        @Ptr
        long n_formats);

    public void parse_n_formats(Pointer<Long> n_formats) {
        this.gst_query_parse_n_formats(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(n_formats));
    }

    @Field(1)
    public IntValuedEnum<GstQueryType> gstquery_field_type() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstQuery gstquery_field_type(IntValuedEnum<GstQueryType> gstquery_field_type) {
        this.io.setEnumField(this, 1, gstquery_field_type);
        return this;
    }

    protected native long gst_query_get_n_allocation_params(
        @Ptr
        long query);

    public long get_n_allocation_params() {
        return this.gst_query_get_n_allocation_params(Pointer.pointerTo(this, GstQuery.class).getPeer());
    }

    protected native void gst_query_parse_buffering_range(
        @Ptr
        long query,
        @Ptr
        long format,
        @Ptr
        long start,
        @Ptr
        long stop,
        @Ptr
        long estimated_total);

    public void parse_buffering_range(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> start, Pointer<Long> stop, Pointer<Long> estimated_total) {
        this.gst_query_parse_buffering_range(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(start), Pointer.getPeer(stop), Pointer.getPeer(estimated_total));
    }

    protected native void gst_query_remove_nth_allocation_param(
        @Ptr
        long query, long index);

    public void remove_nth_allocation_param(long index) {
        this.gst_query_remove_nth_allocation_param(Pointer.pointerTo(this, GstQuery.class).getPeer(), index);
    }

    @Ptr
    protected static native long gst_query_new_scheduling();

    public static Pointer<GstQuery> new_scheduling() {
        return Pointer.pointerToAddress(GstQuery.gst_query_new_scheduling(), GstQuery.class);
    }

    protected native void gst_query_add_scheduling_mode(
        @Ptr
        long query, IntValuedEnum<GstPadMode> mode);

    public void add_scheduling_mode(IntValuedEnum<GstPadMode> mode) {
        this.gst_query_add_scheduling_mode(Pointer.pointerTo(this, GstQuery.class).getPeer(), mode);
    }

    protected native void gst_query_parse_caps_result(
        @Ptr
        long query,
        @Ptr
        long caps);

    public void parse_caps_result(Pointer<Pointer<GstCaps>> caps) {
        this.gst_query_parse_caps_result(Pointer.pointerTo(this, GstQuery.class).getPeer(), Pointer.getPeer(caps));
    }

    protected native boolean gst_query_parse_nth_buffering_range(
        @Ptr
        long query, long index,
        @Ptr
        long start,
        @Ptr
        long stop);

    public boolean parse_nth_buffering_range(long index, Pointer<Long> start, Pointer<Long> stop) {
        return this.gst_query_parse_nth_buffering_range(Pointer.pointerTo(this, GstQuery.class).getPeer(), index, Pointer.getPeer(start), Pointer.getPeer(stop));
    }

    protected native void gst_query_parse_nth_allocation_param(
        @Ptr
        long query, long index,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void parse_nth_allocation_param(long index, Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        this.gst_query_parse_nth_allocation_param(Pointer.pointerTo(this, GstQuery.class).getPeer(), index, Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

}
