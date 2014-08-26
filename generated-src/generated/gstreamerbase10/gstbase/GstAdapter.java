
package generated.gstreamerbase10.gstbase;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import generated.gstreamer10.gst.GstBuffer;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstAdapter
    extends GObject
{


    static {
        BridJ.register();
    }

    public GstAdapter() {
        super();
    }

    public GstAdapter(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_adapter_new();

    public static Pointer gstadapter__new() {
        return Pointer.pointerToAddress(GstAdapter.gst_adapter_new());
    }

    protected native long gst_adapter_available(
        @Ptr
        long adapter);

    public long available() {
        return this.gst_adapter_available(Pointer.pointerTo(this, GstAdapter.class).getPeer());
    }

    protected native long gst_adapter_available_fast(
        @Ptr
        long adapter);

    public long available_fast() {
        return this.gst_adapter_available_fast(Pointer.pointerTo(this, GstAdapter.class).getPeer());
    }

    protected native void gst_adapter_clear(
        @Ptr
        long adapter);

    public void clear() {
        this.gst_adapter_clear(Pointer.pointerTo(this, GstAdapter.class).getPeer());
    }

    protected native void gst_adapter_copy(
        @Ptr
        long adapter,
        @Ptr
        long dest, long offset, long size);

    public void copy(Pointer<Short> dest, long offset, long size) {
        this.gst_adapter_copy(Pointer.pointerTo(this, GstAdapter.class).getPeer(), Pointer.getPeer(dest), offset, size);
    }

    protected native void gst_adapter_flush(
        @Ptr
        long adapter, long flush);

    public void flush(long flush) {
        this.gst_adapter_flush(Pointer.pointerTo(this, GstAdapter.class).getPeer(), flush);
    }

    protected native short gst_adapter_map(
        @Ptr
        long adapter, long size);

    public short map(long size) {
        return this.gst_adapter_map(Pointer.pointerTo(this, GstAdapter.class).getPeer(), size);
    }

    protected native long gst_adapter_masked_scan_uint32(
        @Ptr
        long adapter, long mask, long pattern, long offset, long size);

    public long masked_scan_uint32(long mask, long pattern, long offset, long size) {
        return this.gst_adapter_masked_scan_uint32(Pointer.pointerTo(this, GstAdapter.class).getPeer(), mask, pattern, offset, size);
    }

    protected native long gst_adapter_masked_scan_uint32_peek(
        @Ptr
        long adapter, long mask, long pattern, long offset, long size,
        @Ptr
        long value);

    public long masked_scan_uint32_peek(long mask, long pattern, long offset, long size, Pointer<Long> value) {
        return this.gst_adapter_masked_scan_uint32_peek(Pointer.pointerTo(this, GstAdapter.class).getPeer(), mask, pattern, offset, size, Pointer.getPeer(value));
    }

    protected native long gst_adapter_prev_dts(
        @Ptr
        long adapter,
        @Ptr
        long distance);

    public long prev_dts(Pointer<Long> distance) {
        return this.gst_adapter_prev_dts(Pointer.pointerTo(this, GstAdapter.class).getPeer(), Pointer.getPeer(distance));
    }

    protected native long gst_adapter_prev_dts_at_offset(
        @Ptr
        long adapter, long offset,
        @Ptr
        long distance);

    public long prev_dts_at_offset(long offset, Pointer<Long> distance) {
        return this.gst_adapter_prev_dts_at_offset(Pointer.pointerTo(this, GstAdapter.class).getPeer(), offset, Pointer.getPeer(distance));
    }

    protected native long gst_adapter_prev_pts(
        @Ptr
        long adapter,
        @Ptr
        long distance);

    public long prev_pts(Pointer<Long> distance) {
        return this.gst_adapter_prev_pts(Pointer.pointerTo(this, GstAdapter.class).getPeer(), Pointer.getPeer(distance));
    }

    protected native long gst_adapter_prev_pts_at_offset(
        @Ptr
        long adapter, long offset,
        @Ptr
        long distance);

    public long prev_pts_at_offset(long offset, Pointer<Long> distance) {
        return this.gst_adapter_prev_pts_at_offset(Pointer.pointerTo(this, GstAdapter.class).getPeer(), offset, Pointer.getPeer(distance));
    }

    protected native void gst_adapter_push(
        @Ptr
        long adapter,
        @Ptr
        long buf);

    public void push(Pointer<GstBuffer> buf) {
        this.gst_adapter_push(Pointer.pointerTo(this, GstAdapter.class).getPeer(), Pointer.getPeer(buf));
    }

    @Ptr
    protected native long gst_adapter_take(
        @Ptr
        long adapter, long nbytes);

    public Pointer<Short> take(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take(Pointer.pointerTo(this, GstAdapter.class).getPeer(), nbytes), Short.class);
    }

    @Ptr
    protected native long gst_adapter_take_buffer(
        @Ptr
        long adapter, long nbytes);

    public Pointer<GstBuffer> take_buffer(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take_buffer(Pointer.pointerTo(this, GstAdapter.class).getPeer(), nbytes), GstBuffer.class);
    }

    @Ptr
    protected native long gst_adapter_take_buffer_fast(
        @Ptr
        long adapter, long nbytes);

    public Pointer<GstBuffer> take_buffer_fast(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take_buffer_fast(Pointer.pointerTo(this, GstAdapter.class).getPeer(), nbytes), GstBuffer.class);
    }

    @Ptr
    protected native long gst_adapter_take_list(
        @Ptr
        long adapter, long nbytes);

    public Pointer<GList> take_list(long nbytes) {
        return Pointer.pointerToAddress(this.gst_adapter_take_list(Pointer.pointerTo(this, GstAdapter.class).getPeer(), nbytes), GList.class);
    }

    protected native void gst_adapter_unmap(
        @Ptr
        long adapter);

    public void unmap() {
        this.gst_adapter_unmap(Pointer.pointerTo(this, GstAdapter.class).getPeer());
    }

}
