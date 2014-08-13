
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GActionEntry
    extends StructObject
{


    public GActionEntry() {
        super();
    }

    public GActionEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GActionEntry field_name(Pointer field_name) {
        this.io.setPointerField(this, 0, field_name);
        return this;
    }

    @Field(1)
    public Pointer field_parameter_type() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GActionEntry field_parameter_type(Pointer field_parameter_type) {
        this.io.setPointerField(this, 1, field_parameter_type);
        return this;
    }

    @Field(2)
    public Pointer field_state() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GActionEntry field_state(Pointer field_state) {
        this.io.setPointerField(this, 2, field_state);
        return this;
    }

    @Field(3)
    public long field_padding() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GActionEntry field_padding(long field_padding) {
        this.io.setPointerField(this, 3, field_padding);
        return this;
    }

}
