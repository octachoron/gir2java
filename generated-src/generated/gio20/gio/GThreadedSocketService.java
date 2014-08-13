
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GThreadedSocketService
    extends GSocketService
{


    public GThreadedSocketService() {
        super();
    }

    public GThreadedSocketService(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketService field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GThreadedSocketService field_parent_instance(GSocketService field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GThreadedSocketService field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
