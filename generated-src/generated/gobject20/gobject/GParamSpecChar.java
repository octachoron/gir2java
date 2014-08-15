
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecChar
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecChar() {
        super();
    }

    public GParamSpecChar(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecChar field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public char field_default_value() {
        return this.io.getCharField(this, 1);
    }

    @Field(1)
    public GParamSpecChar field_default_value(char field_default_value) {
        this.io.setCharField(this, 1, field_default_value);
        return this;
    }

    @Field(2)
    public char field_minimum() {
        return this.io.getCharField(this, 2);
    }

    @Field(2)
    public GParamSpecChar field_minimum(char field_minimum) {
        this.io.setCharField(this, 2, field_minimum);
        return this;
    }

    @Field(3)
    public char field_maximum() {
        return this.io.getCharField(this, 3);
    }

    @Field(3)
    public GParamSpecChar field_maximum(char field_maximum) {
        this.io.setCharField(this, 3, field_maximum);
        return this;
    }

}
