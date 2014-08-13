
package generated.gstreamerbase10.gstbase;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstBuffer;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstAdapter
    extends GObject
{


    public GstAdapter() {
        super();
    }

    public GstAdapter(Pointer pointer) {
        super(pointer);
    }

    protected native long gst_adapter_available(
        @Ptr
        long adapter);

    public long available() {
        return this.gst_adapter_available(Pointer.pointerTo(this, GstAdapter.class));
    }

    protected native long gst_adapter_available_fast(
        @Ptr
        long adapter);

    public long available_fast() {
        return this.gst_adapter_available_fast(Pointer.pointerTo(this, GstAdapter.class));
    }

    protected native void gst_adapter_clear(
        @Ptr
        long adapter);

    public void clear() {
        this.gst_adapter_clear(Pointer.pointerTo(this, GstAdapter.class));
    }

    protected native void gst_adapter_copy(
        @Ptr
        long adapter,
        @Ptr
        long dest, long offset, long size);

    public void copy(short dest, long offset, long size) {
        this.gst_adapter_copy(Pointer.pointerTo(this, GstAdapter.class), Pointer.getPeer(dest), offset, size);
    }

    protected native void gst_adapter_flush(
        @Ptr
        long adapter, long flush);

    public void flush(long flush) {
        this.gst_adapter_flush(Pointer.pointerTo(this, GstAdapter.class), flush);
    }

    @Ptr
    protected native long gst_adapter_map(
        @Ptr
        long adapter, long size);

    public short map(long size) {
        return Pointer.pointerToAddress(this.gst_adapter_map(Pointer.pointerTo(this, GstAdapter.class), size), Short.class);
    }

    protected native long gst_adapter_masked_scan_uint32(
        @Ptr
        long adapter, long mask, long pattern, long offset, long size);

    public long masked_scan_uint32(long mask, long pattern, long offset, long size) {
        return this.gst_adapter_masked_scan_uint32(Pointer.pointerTo(this, GstAdapter.class), mask, pattern, offset, size);
    }

    protected native long gst_adapter_masked_scan_uint32_peek(
        @Ptr
        long adapter, long mask, long pattern, long offset, long size,
        @Ptr
        long value);

    public long masked_scan_uint32_peek(long mask, long pattern, long offset, long size, Pointer<Long> value) {
        return this.gst_adapter_masked_scan_uint32_peek(Pointer.pointerTo(this, GstAdapter.class), mask, pattern, offset, size, Pointer.getPeer(value));
    }

    protected native Object gst_adapter_prev_dts(
        @Ptr
        long adapter,
        @Ptr
        long distance);

    public Object prev_dts(Pointer<Long> distance) {
        return this.gst_adapter_prev_dts(Pointer.pointerTo(this, GstAdapter.class), Pointer.getPeer(distance));
    }

    protected native Object gst_adapter_prev_dts_at_offset(
        @Ptr
        long adapter, long offset,
        @Ptr
        long distance);

    public Object prev_dts_at_offset(long offset, Pointer<Long> distance) {
        return this.gst_adapter_prev_dts_at_offset(Pointer.pointerTo(this, GstAdapter.class), offset, Pointer.getPeer(distance));
    }

    protected native Object gst_adapter_prev_pts(
        @Ptr
        long adapter,
        @Ptr
        long distance);

    public Object prev_pts(Pointer<Long> distance) {
        return this.gst_adapter_prev_pts(Pointer.pointerTo(this, GstAdapter.class), Pointer.getPeer(distance));
    }

    protected native Object gst_adapter_prev_pts_at_offset(
        @Ptr
        long adapter, long offset,
        @Ptr
        long distance);

    public Object prev_pts_at_offset(long offset, Pointer<Long> distance) {
        return this.gst_adapter_prev_pts_at_offset(Pointer.pointerTo(this, GstAdapter.class), offset, Pointer.getPeer(distance));
    }

    protected native void gst_adapter_push(
        @Ptr
        long adapter,
        @Ptr
        long buf);

    public void push(Pointer<GstBuffer> buf) {
        this.gst_adapter_push(Pointer.pointerTo(this, GstAdapter.class), Pointer.getPeer(buf));
    }

    @Ptr
    protected native long gst_adapter_take(
        @Ptr
        long adapter, long nbytes);

    public short take(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take(Pointer.pointerTo(this, GstAdapter.class), nbytes), Short.class);
    }

    @Ptr
    protected native long gst_adapter_take_buffer(
        @Ptr
        long adapter, long nbytes);

    public Pointer<GstBuffer> take_buffer(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take_buffer(Pointer.pointerTo(this, GstAdapter.class), nbytes), Pointer.class);
    }

    @Ptr
    protected native long gst_adapter_take_buffer_fast(
        @Ptr
        long adapter, long nbytes);

    public Pointer<GstBuffer> take_buffer_fast(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take_buffer_fast(Pointer.pointerTo(this, GstAdapter.class), nbytes), Pointer.class);
    }

    @Ptr
    protected native long gst_adapter_take_list(
        @Ptr
        long adapter, long nbytes);

    public Pointer<GList> take_list(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take_list(Pointer.pointerTo(this, GstAdapter.class), nbytes), Pointer.class);
    }

    protected native void gst_adapter_unmap(
        @Ptr
        long adapter);

    public void unmap() {
        this.gst_adapter_unmap(Pointer.pointerTo(this, GstAdapter.class));
    }

}
