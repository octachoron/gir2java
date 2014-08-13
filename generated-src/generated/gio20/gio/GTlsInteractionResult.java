
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsInteractionResult
    implements IntValuedEnum<GTlsInteractionResult>
{

    _TLS_INTERACTION_RESULT_UNHANDLED(0L),
    _TLS_INTERACTION_RESULT_HANDLED(1L),
    _TLS_INTERACTION_RESULT_FAILED(2L);
    public final long value;

    GTlsInteractionResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsInteractionResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsInteractionResult> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
