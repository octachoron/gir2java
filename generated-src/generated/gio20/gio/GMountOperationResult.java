
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GMountOperationResult
    implements IntValuedEnum<GMountOperationResult>
{

    _MOUNT_OPERATION_RESULT_HANDLED(0L),
    _MOUNT_OPERATION_RESULT_ABORTED(1L),
    _MOUNT_OPERATION_RESULT_UNHANDLED(2L);
    public final long value;

    GMountOperationResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GMountOperationResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GMountOperationResult> fromValue(int value) {
        return FlagSet.fromValue(value, GMountOperationResult.values());
    }

}
