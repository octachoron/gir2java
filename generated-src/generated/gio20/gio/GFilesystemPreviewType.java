
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFilesystemPreviewType
    implements IntValuedEnum<GFilesystemPreviewType>
{

    _FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS(0L),
    _FILESYSTEM_PREVIEW_TYPE_IF_LOCAL(1L),
    _FILESYSTEM_PREVIEW_TYPE_NEVER(2L);
    public final long value;

    GFilesystemPreviewType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFilesystemPreviewType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFilesystemPreviewType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
