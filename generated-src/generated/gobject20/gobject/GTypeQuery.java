
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypeQuery
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeQuery() {
        super();
    }

    public GTypeQuery(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GTypeQuery field_type(long field_type) {
        this.io.setLongField(this, 0, field_type);
        return this;
    }

    @Field(1)
    public Pointer field_type_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTypeQuery field_type_name(Pointer field_type_name) {
        this.io.setPointerField(this, 1, field_type_name);
        return this;
    }

    @Field(2)
    public long field_class_size() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GTypeQuery field_class_size(long field_class_size) {
        this.io.setLongField(this, 2, field_class_size);
        return this;
    }

    @Field(3)
    public long field_instance_size() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GTypeQuery field_instance_size(long field_instance_size) {
        this.io.setLongField(this, 3, field_instance_size);
        return this;
    }

}
