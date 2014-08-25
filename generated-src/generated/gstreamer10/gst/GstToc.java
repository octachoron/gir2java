
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstToc
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstToc() {
        super();
    }

    public GstToc(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_toc_append_entry(
        @Ptr
        long toc,
        @Ptr
        long entry);

    public void append_entry(Pointer entry) {
        this.gst_toc_append_entry(Pointer.pointerTo(this, GstToc.class).getPeer(), Pointer.getPeer(entry));
    }

    protected native void gst_toc_dump(
        @Ptr
        long toc);

    public void dump() {
        this.gst_toc_dump(Pointer.pointerTo(this, GstToc.class).getPeer());
    }

    @Ptr
    protected native long gst_toc_find_entry(
        @Ptr
        long toc,
        @Ptr
        long uid);

    public Pointer find_entry(Pointer uid) {
        return Pointer.pointerToAddress(this.gst_toc_find_entry(Pointer.pointerTo(this, GstToc.class).getPeer(), Pointer.getPeer(uid)));
    }

    @Ptr
    protected native long gst_toc_get_entries(
        @Ptr
        long toc);

    public Pointer<GList> get_entries() {
        return Pointer.pointerToAddress(this.gst_toc_get_entries(Pointer.pointerTo(this, GstToc.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long gst_toc_get_tags(
        @Ptr
        long toc);

    public Pointer<GstTagList> get_tags() {
        return Pointer.pointerToAddress(this.gst_toc_get_tags(Pointer.pointerTo(this, GstToc.class).getPeer()), GstTagList.class);
    }

    protected native void gst_toc_merge_tags(
        @Ptr
        long toc,
        @Ptr
        long tags, IntValuedEnum<GstTagMergeMode> mode);

    public void merge_tags(Pointer<GstTagList> tags, IntValuedEnum<GstTagMergeMode> mode) {
        this.gst_toc_merge_tags(Pointer.pointerTo(this, GstToc.class).getPeer(), Pointer.getPeer(tags), mode);
    }

    protected native void gst_toc_set_tags(
        @Ptr
        long toc,
        @Ptr
        long tags);

    public void set_tags(Pointer<GstTagList> tags) {
        this.gst_toc_set_tags(Pointer.pointerTo(this, GstToc.class).getPeer(), Pointer.getPeer(tags));
    }

    @Ptr
    protected static native long gst_toc_new(IntValuedEnum<GstTocScope> scope);

    public static Pointer<GstToc> _new(IntValuedEnum<GstTocScope> scope) {
        return Pointer.pointerToAddress(GstToc.gst_toc_new(scope), GstToc.class);
    }

    protected native IntValuedEnum<GstTocScope> gst_toc_get_scope(
        @Ptr
        long toc);

    public IntValuedEnum<GstTocScope> get_scope() {
        return this.gst_toc_get_scope(Pointer.pointerTo(this, GstToc.class).getPeer());
    }

}
