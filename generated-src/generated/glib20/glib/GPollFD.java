
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GPollFD
    extends StructObject
{


    public GPollFD() {
        super();
    }

    public GPollFD(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_fd() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GPollFD field_fd(int field_fd) {
        this.io.setNativeObjectField(this, 0, field_fd);
        return this;
    }

    @Field(1)
    public int field_events() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GPollFD field_events(int field_events) {
        this.io.setNativeObjectField(this, 1, field_events);
        return this;
    }

    @Field(2)
    public int field_revents() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GPollFD field_revents(int field_revents) {
        this.io.setNativeObjectField(this, 2, field_revents);
        return this;
    }

}
