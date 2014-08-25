
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GParamSpec;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstParamSpecFraction
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstParamSpecFraction() {
        super();
    }

    public GstParamSpecFraction(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gstparamspecfraction_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstParamSpecFraction gstparamspecfraction_field_parent_instance(GParamSpec gstparamspecfraction_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gstparamspecfraction_field_parent_instance);
        return this;
    }

    @Field(1)
    public int gstparamspecfraction_field_min_num() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GstParamSpecFraction gstparamspecfraction_field_min_num(int gstparamspecfraction_field_min_num) {
        this.io.setIntField(this, 1, gstparamspecfraction_field_min_num);
        return this;
    }

    @Field(2)
    public int gstparamspecfraction_field_min_den() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstParamSpecFraction gstparamspecfraction_field_min_den(int gstparamspecfraction_field_min_den) {
        this.io.setIntField(this, 2, gstparamspecfraction_field_min_den);
        return this;
    }

    @Field(3)
    public int gstparamspecfraction_field_max_num() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GstParamSpecFraction gstparamspecfraction_field_max_num(int gstparamspecfraction_field_max_num) {
        this.io.setIntField(this, 3, gstparamspecfraction_field_max_num);
        return this;
    }

    @Field(4)
    public int gstparamspecfraction_field_max_den() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public GstParamSpecFraction gstparamspecfraction_field_max_den(int gstparamspecfraction_field_max_den) {
        this.io.setIntField(this, 4, gstparamspecfraction_field_max_den);
        return this;
    }

    @Field(5)
    public int gstparamspecfraction_field_def_num() {
        return this.io.getIntField(this, 5);
    }

    @Field(5)
    public GstParamSpecFraction gstparamspecfraction_field_def_num(int gstparamspecfraction_field_def_num) {
        this.io.setIntField(this, 5, gstparamspecfraction_field_def_num);
        return this;
    }

    @Field(6)
    public int gstparamspecfraction_field_def_den() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public GstParamSpecFraction gstparamspecfraction_field_def_den(int gstparamspecfraction_field_def_den) {
        this.io.setIntField(this, 6, gstparamspecfraction_field_def_den);
        return this;
    }

}
