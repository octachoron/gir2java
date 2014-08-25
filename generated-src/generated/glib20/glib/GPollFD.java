
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GPollFD
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GPollFD() {
        super();
    }

    public GPollFD(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gpollfd_field_fd() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GPollFD gpollfd_field_fd(int gpollfd_field_fd) {
        this.io.setIntField(this, 0, gpollfd_field_fd);
        return this;
    }

    @Field(1)
    public int gpollfd_field_events() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GPollFD gpollfd_field_events(int gpollfd_field_events) {
        this.io.setIntField(this, 1, gpollfd_field_events);
        return this;
    }

    @Field(2)
    public int gpollfd_field_revents() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GPollFD gpollfd_field_revents(int gpollfd_field_revents) {
        this.io.setIntField(this, 2, gpollfd_field_revents);
        return this;
    }

}
