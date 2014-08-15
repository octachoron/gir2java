
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
    public Pointer field_key() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GDebugKey field_key(Pointer field_key) {
        this.io.setPointerField(this, 0, field_key);
        return this;
    }

    @Field(1)
    public long field_value() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GDebugKey field_value(long field_value) {
        this.io.setLongField(this, 1, field_value);
        return this;
    }

}
