
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstFormatDefinition
    extends StructObject
{


    public GstFormatDefinition() {
        super();
    }

    public GstFormatDefinition(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstFormat> field_value() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstFormatDefinition field_value(IntValuedEnum<GstFormat> field_value) {
        this.io.setEnumField(this, 0, field_value);
        return this;
    }

    @Field(1)
    public Pointer field_nick() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstFormatDefinition field_nick(Pointer field_nick) {
        this.io.setPointerField(this, 1, field_nick);
        return this;
    }

    @Field(2)
    public Pointer field_description() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstFormatDefinition field_description(Pointer field_description) {
        this.io.setPointerField(this, 2, field_description);
        return this;
    }

    @Field(3)
    public Object field_quark() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstFormatDefinition field_quark(Object field_quark) {
        this.io.setNativeObjectField(this, 3, field_quark);
        return this;
    }

}
