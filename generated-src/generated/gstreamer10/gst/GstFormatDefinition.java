
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstFormatDefinition
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstFormatDefinition() {
        super();
    }

    public GstFormatDefinition(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstFormat> gstformatdefinition_field_value() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstFormatDefinition gstformatdefinition_field_value(IntValuedEnum<GstFormat> gstformatdefinition_field_value) {
        this.io.setEnumField(this, 0, gstformatdefinition_field_value);
        return this;
    }

    @Field(1)
    public Pointer gstformatdefinition_field_nick() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstFormatDefinition gstformatdefinition_field_nick(Pointer gstformatdefinition_field_nick) {
        this.io.setPointerField(this, 1, gstformatdefinition_field_nick);
        return this;
    }

    @Field(2)
    public Pointer gstformatdefinition_field_description() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstFormatDefinition gstformatdefinition_field_description(Pointer gstformatdefinition_field_description) {
        this.io.setPointerField(this, 2, gstformatdefinition_field_description);
        return this;
    }

    @Field(3)
    public long gstformatdefinition_field_quark() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstFormatDefinition gstformatdefinition_field_quark(long gstformatdefinition_field_quark) {
        this.io.setLongField(this, 3, gstformatdefinition_field_quark);
        return this;
    }

}
