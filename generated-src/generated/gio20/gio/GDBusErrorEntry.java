
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusErrorEntry
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusErrorEntry() {
        super();
    }

    public GDBusErrorEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gdbuserrorentry_field_error_code() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GDBusErrorEntry gdbuserrorentry_field_error_code(int gdbuserrorentry_field_error_code) {
        this.io.setIntField(this, 0, gdbuserrorentry_field_error_code);
        return this;
    }

    @Field(1)
    public Pointer gdbuserrorentry_field_dbus_error_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusErrorEntry gdbuserrorentry_field_dbus_error_name(Pointer gdbuserrorentry_field_dbus_error_name) {
        this.io.setPointerField(this, 1, gdbuserrorentry_field_dbus_error_name);
        return this;
    }

}
