
package generated;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstTagList;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstRiff {


    @Ptr
    protected native long gst_riff_create_audio_caps(int codec_id, Object... varargs);

    @Ptr
    protected native long gst_riff_create_audio_template_caps();

    public Pointer<GstCaps> riff_create_audio_template_caps() {
        return Pointer.pointerToAddress(this.gst_riff_create_audio_template_caps(), Pointer.class);
    }

    @Ptr
    protected native long gst_riff_create_iavs_caps(long codec_fcc, Object... varargs);

    @Ptr
    protected native long gst_riff_create_iavs_template_caps();

    public Pointer<GstCaps> riff_create_iavs_template_caps() {
        return Pointer.pointerToAddress(this.gst_riff_create_iavs_template_caps(), Pointer.class);
    }

    @Ptr
    protected native long gst_riff_create_video_caps(long codec_fcc, Object... varargs);

    @Ptr
    protected native long gst_riff_create_video_template_caps();

    public Pointer<GstCaps> riff_create_video_template_caps() {
        return Pointer.pointerToAddress(this.gst_riff_create_video_template_caps(), Pointer.class);
    }

    public native void gst_riff_init();

    protected native boolean gst_riff_parse_chunk(
        @Ptr
        long element,
        @Ptr
        long buf,
        @Ptr
        long offset,
        @Ptr
        long fourcc,
        @Ptr
        long chunk_data);

    public boolean riff_parse_chunk(Pointer<GstElement> element, Pointer<GstBuffer> buf, Pointer<Long> offset, Pointer<Long> fourcc, Pointer<Pointer<GstBuffer>> chunk_data) {
        return this.gst_riff_parse_chunk(Pointer.getPeer(element), Pointer.getPeer(buf), Pointer.getPeer(offset), Pointer.getPeer(fourcc), Pointer.getPeer(chunk_data));
    }

    protected native boolean gst_riff_parse_file_header(
        @Ptr
        long element,
        @Ptr
        long buf,
        @Ptr
        long doctype);

    public boolean riff_parse_file_header(Pointer<GstElement> element, Pointer<GstBuffer> buf, Pointer<Long> doctype) {
        return this.gst_riff_parse_file_header(Pointer.getPeer(element), Pointer.getPeer(buf), Pointer.getPeer(doctype));
    }

    protected native void gst_riff_parse_info(
        @Ptr
        long element,
        @Ptr
        long buf,
        @Ptr
        long taglist);

    public void riff_parse_info(Pointer<GstElement> element, Pointer<GstBuffer> buf, Pointer<Pointer<GstTagList>> taglist) {
        this.gst_riff_parse_info(Pointer.getPeer(element), Pointer.getPeer(buf), Pointer.getPeer(taglist));
    }

    protected native boolean gst_riff_parse_strf_auds(
        @Ptr
        long element,
        @Ptr
        long buf,
        @Ptr
        long data, Object... varargs);

    public boolean riff_parse_strf_auds(Pointer<GstElement> element, Pointer<GstBuffer> buf, Pointer<Pointer<GstBuffer>> data, Object... varargs) {
        return this.gst_riff_parse_strf_auds(Pointer.getPeer(element), Pointer.getPeer(buf), varargs, Pointer.getPeer(data));
    }

    protected native boolean gst_riff_parse_strf_iavs(
        @Ptr
        long element,
        @Ptr
        long buf,
        @Ptr
        long data, Object... varargs);

    public boolean riff_parse_strf_iavs(Pointer<GstElement> element, Pointer<GstBuffer> buf, Pointer<Pointer<GstBuffer>> data, Object... varargs) {
        return this.gst_riff_parse_strf_iavs(Pointer.getPeer(element), Pointer.getPeer(buf), varargs, Pointer.getPeer(data));
    }

    protected native boolean gst_riff_parse_strf_vids(
        @Ptr
        long element,
        @Ptr
        long buf,
        @Ptr
        long data, Object... varargs);

    public boolean riff_parse_strf_vids(Pointer<GstElement> element, Pointer<GstBuffer> buf, Pointer<Pointer<GstBuffer>> data, Object... varargs) {
        return this.gst_riff_parse_strf_vids(Pointer.getPeer(element), Pointer.getPeer(buf), varargs, Pointer.getPeer(data));
    }

    protected native boolean gst_riff_parse_strh(
        @Ptr
        long element,
        @Ptr
        long buf, Object... varargs);

    public boolean riff_parse_strh(Pointer<GstElement> element, Pointer<GstBuffer> buf, Object... varargs) {
        return this.gst_riff_parse_strh(Pointer.getPeer(element), Pointer.getPeer(buf), varargs);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_riff_read_chunk(
        @Ptr
        long element,
        @Ptr
        long pad,
        @Ptr
        long offset,
        @Ptr
        long tag,
        @Ptr
        long chunk_data);

    public IntValuedEnum<GstFlowReturn> riff_read_chunk(Pointer<GstElement> element, Pointer<GstPad> pad, Pointer<Long> offset, Pointer<Long> tag, Pointer<Pointer<GstBuffer>> chunk_data) {
        return this.gst_riff_read_chunk(Pointer.getPeer(element), Pointer.getPeer(pad), Pointer.getPeer(offset), Pointer.getPeer(tag), Pointer.getPeer(chunk_data));
    }

}
