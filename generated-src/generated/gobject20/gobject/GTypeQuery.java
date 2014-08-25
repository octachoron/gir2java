
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
    public long gtypequery_field_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GTypeQuery gtypequery_field_type(long gtypequery_field_type) {
        this.io.setLongField(this, 0, gtypequery_field_type);
        return this;
    }

    @Field(1)
    public Pointer gtypequery_field_type_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTypeQuery gtypequery_field_type_name(Pointer gtypequery_field_type_name) {
        this.io.setPointerField(this, 1, gtypequery_field_type_name);
        return this;
    }

    @Field(2)
    public long gtypequery_field_instance_size() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GTypeQuery gtypequery_field_instance_size(long gtypequery_field_instance_size) {
        this.io.setLongField(this, 2, gtypequery_field_instance_size);
        return this;
    }

    @Field(3)
    public long gtypequery_field_class_size() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GTypeQuery gtypequery_field_class_size(long gtypequery_field_class_size) {
        this.io.setLongField(this, 3, gtypequery_field_class_size);
        return this;
    }

}
