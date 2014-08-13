
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GParamSpec;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstParamSpecFraction
    extends StructObject
{


    public GstParamSpecFraction() {
        super();
    }

    public GstParamSpecFraction(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstParamSpecFraction field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public int field_min_num() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstParamSpecFraction field_min_num(int field_min_num) {
        this.io.setNativeObjectField(this, 1, field_min_num);
        return this;
    }

    @Field(2)
    public int field_min_den() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstParamSpecFraction field_min_den(int field_min_den) {
        this.io.setNativeObjectField(this, 2, field_min_den);
        return this;
    }

    @Field(3)
    public int field_max_num() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstParamSpecFraction field_max_num(int field_max_num) {
        this.io.setNativeObjectField(this, 3, field_max_num);
        return this;
    }

    @Field(4)
    public int field_max_den() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstParamSpecFraction field_max_den(int field_max_den) {
        this.io.setNativeObjectField(this, 4, field_max_den);
        return this;
    }

    @Field(5)
    public int field_def_num() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstParamSpecFraction field_def_num(int field_def_num) {
        this.io.setNativeObjectField(this, 5, field_def_num);
        return this;
    }

    @Field(6)
    public int field_def_den() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstParamSpecFraction field_def_den(int field_def_den) {
        this.io.setNativeObjectField(this, 6, field_def_den);
        return this;
    }

}
