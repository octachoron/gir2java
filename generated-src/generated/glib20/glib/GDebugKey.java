
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GDebugKey
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDebugKey() {
        super();
    }

    public GDebugKey(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gdebugkey_field_key() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GDebugKey gdebugkey_field_key(Pointer gdebugkey_field_key) {
        this.io.setPointerField(this, 0, gdebugkey_field_key);
        return this;
    }

    @Field(1)
    public long gdebugkey_field_value() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GDebugKey gdebugkey_field_value(long gdebugkey_field_value) {
        this.io.setLongField(this, 1, gdebugkey_field_value);
        return this;
    }

}
