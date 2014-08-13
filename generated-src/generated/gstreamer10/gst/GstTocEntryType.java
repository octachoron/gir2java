
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstTocEntryType
    implements IntValuedEnum<GstTocEntryType>
{

    GST_TOC_ENTRY_TYPE_ANGLE(-3L),
    GST_TOC_ENTRY_TYPE_VERSION(-2L),
    GST_TOC_ENTRY_TYPE_EDITION(-1L),
    GST_TOC_ENTRY_TYPE_INVALID(0L),
    GST_TOC_ENTRY_TYPE_TITLE(1L),
    GST_TOC_ENTRY_TYPE_TRACK(2L),
    GST_TOC_ENTRY_TYPE_CHAPTER(3L);
    public final long value;

    GstTocEntryType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTocEntryType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTocEntryType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    @Ptr
    protected native long gst_toc_entry_type_get_nick(IntValuedEnum<GstTocEntryType> type);

    public Pointer get_nick(IntValuedEnum<GstTocEntryType> type) {
        return Pointer.pointerToAddress(this.gst_toc_entry_type_get_nick(type));
    }

}
