
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GUserDirectory
    implements IntValuedEnum<GUserDirectory>
{

    _USER_DIRECTORY_DIRECTORY_DESKTOP(0L),
    _USER_DIRECTORY_DIRECTORY_DOCUMENTS(1L),
    _USER_DIRECTORY_DIRECTORY_DOWNLOAD(2L),
    _USER_DIRECTORY_DIRECTORY_MUSIC(3L),
    _USER_DIRECTORY_DIRECTORY_PICTURES(4L),
    _USER_DIRECTORY_DIRECTORY_PUBLIC_SHARE(5L),
    _USER_DIRECTORY_DIRECTORY_TEMPLATES(6L),
    _USER_DIRECTORY_DIRECTORY_VIDEOS(7L),
    _USER_DIRECTORY_N_DIRECTORIES(8L);
    public final long value;

    GUserDirectory(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GUserDirectory> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GUserDirectory> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
