
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTocEntry
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstTocEntry() {
        super();
    }

    public GstTocEntry(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_toc_entry_append_sub_entry(
        @Ptr
        long entry,
        @Ptr
        long subentry);

    public void append_sub_entry(Pointer subentry) {
        this.gst_toc_entry_append_sub_entry(Pointer.pointerTo(this, GstTocEntry.class).getPeer(), Pointer.getPeer(subentry));
    }

    @Ptr
    protected native long gst_toc_entry_get_parent(
        @Ptr
        long entry);

    public Pointer get_parent() {
        return Pointer.pointerToAddress(this.gst_toc_entry_get_parent(Pointer.pointerTo(this, GstTocEntry.class).getPeer()));
    }

    protected native boolean gst_toc_entry_get_start_stop_times(
        @Ptr
        long entry,
        @Ptr
        long start,
        @Ptr
        long stop);

    public boolean get_start_stop_times(Pointer<Long> start, Pointer<Long> stop) {
        return this.gst_toc_entry_get_start_stop_times(Pointer.pointerTo(this, GstTocEntry.class).getPeer(), Pointer.getPeer(start), Pointer.getPeer(stop));
    }

    @Ptr
    protected native long gst_toc_entry_get_sub_entries(
        @Ptr
        long entry);

    public Pointer<GList> get_sub_entries() {
        return Pointer.pointerToAddress(this.gst_toc_entry_get_sub_entries(Pointer.pointerTo(this, GstTocEntry.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long gst_toc_entry_get_tags(
        @Ptr
        long entry);

    public Pointer<GstTagList> get_tags() {
        return Pointer.pointerToAddress(this.gst_toc_entry_get_tags(Pointer.pointerTo(this, GstTocEntry.class).getPeer()), GstTagList.class);
    }

    @Ptr
    protected native long gst_toc_entry_get_toc(
        @Ptr
        long entry);

    public Pointer<GstToc> get_toc() {
        return Pointer.pointerToAddress(this.gst_toc_entry_get_toc(Pointer.pointerTo(this, GstTocEntry.class).getPeer()), GstToc.class);
    }

    @Ptr
    protected native long gst_toc_entry_get_uid(
        @Ptr
        long entry);

    public Pointer get_uid() {
        return Pointer.pointerToAddress(this.gst_toc_entry_get_uid(Pointer.pointerTo(this, GstTocEntry.class).getPeer()));
    }

    protected native boolean gst_toc_entry_is_alternative(
        @Ptr
        long entry);

    public boolean is_alternative() {
        return this.gst_toc_entry_is_alternative(Pointer.pointerTo(this, GstTocEntry.class).getPeer());
    }

    protected native boolean gst_toc_entry_is_sequence(
        @Ptr
        long entry);

    public boolean is_sequence() {
        return this.gst_toc_entry_is_sequence(Pointer.pointerTo(this, GstTocEntry.class).getPeer());
    }

    protected native void gst_toc_entry_merge_tags(
        @Ptr
        long entry,
        @Ptr
        long tags, IntValuedEnum<GstTagMergeMode> mode);

    public void merge_tags(Pointer<GstTagList> tags, IntValuedEnum<GstTagMergeMode> mode) {
        this.gst_toc_entry_merge_tags(Pointer.pointerTo(this, GstTocEntry.class).getPeer(), Pointer.getPeer(tags), mode);
    }

    protected native void gst_toc_entry_set_start_stop_times(
        @Ptr
        long entry, long start, long stop);

    public void set_start_stop_times(long start, long stop) {
        this.gst_toc_entry_set_start_stop_times(Pointer.pointerTo(this, GstTocEntry.class).getPeer(), start, stop);
    }

    protected native void gst_toc_entry_set_tags(
        @Ptr
        long entry,
        @Ptr
        long tags);

    public void set_tags(Pointer<GstTagList> tags) {
        this.gst_toc_entry_set_tags(Pointer.pointerTo(this, GstTocEntry.class).getPeer(), Pointer.getPeer(tags));
    }

    protected native IntValuedEnum<GstTocEntryType> gst_toc_entry_get_entry_type(
        @Ptr
        long entry);

    public IntValuedEnum<GstTocEntryType> get_entry_type() {
        return this.gst_toc_entry_get_entry_type(Pointer.pointerTo(this, GstTocEntry.class).getPeer());
    }

    @Ptr
    protected static native long gst_toc_entry_new(IntValuedEnum<GstTocEntryType> type,
        @Ptr
        long uid);

    public static Pointer<GstTocEntry> _new(IntValuedEnum<GstTocEntryType> type, Pointer uid) {
        return Pointer.pointerToAddress(GstTocEntry.gst_toc_entry_new(type, Pointer.getPeer(uid)), GstTocEntry.class);
    }

}
