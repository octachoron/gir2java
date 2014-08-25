
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GActionEntry
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GActionEntry() {
        super();
    }

    public GActionEntry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gactionentry_field_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GActionEntry gactionentry_field_name(Pointer gactionentry_field_name) {
        this.io.setPointerField(this, 0, gactionentry_field_name);
        return this;
    }

    @Field(1)
    public Pointer gactionentry_field_parameter_type() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GActionEntry gactionentry_field_parameter_type(Pointer gactionentry_field_parameter_type) {
        this.io.setPointerField(this, 1, gactionentry_field_parameter_type);
        return this;
    }

    @Field(2)
    public Pointer gactionentry_field_state() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GActionEntry gactionentry_field_state(Pointer gactionentry_field_state) {
        this.io.setPointerField(this, 2, gactionentry_field_state);
        return this;
    }

    @Field(3)
    private long gactionentry_field_padding() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    private GActionEntry gactionentry_field_padding(long gactionentry_field_padding) {
        this.io.setLongField(this, 3, gactionentry_field_padding);
        return this;
    }

}
