
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusErrorEntry
    extends StructObject
{


    public GDBusErrorEntry() {
        super();
    }

    public GDBusErrorEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_error_code() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusErrorEntry field_error_code(int field_error_code) {
        this.io.setNativeObjectField(this, 0, field_error_code);
        return this;
    }

    @Field(1)
    public Pointer field_dbus_error_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusErrorEntry field_dbus_error_name(Pointer field_dbus_error_name) {
        this.io.setPointerField(this, 1, field_dbus_error_name);
        return this;
    }

}
