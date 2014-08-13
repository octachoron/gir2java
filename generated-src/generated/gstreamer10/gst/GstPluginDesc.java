
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstPluginDesc
    extends StructObject
{


    public GstPluginDesc() {
        super();
    }

    public GstPluginDesc(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_major_version() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPluginDesc field_major_version(int field_major_version) {
        this.io.setNativeObjectField(this, 0, field_major_version);
        return this;
    }

    @Field(1)
    public int field_minor_version() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstPluginDesc field_minor_version(int field_minor_version) {
        this.io.setNativeObjectField(this, 1, field_minor_version);
        return this;
    }

    @Field(2)
    public Pointer field_name() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstPluginDesc field_name(Pointer field_name) {
        this.io.setPointerField(this, 2, field_name);
        return this;
    }

    @Field(3)
    public Pointer field_description() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstPluginDesc field_description(Pointer field_description) {
        this.io.setPointerField(this, 3, field_description);
        return this;
    }

    @Field(4)
    public Object field_plugin_init() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstPluginDesc field_plugin_init(Object field_plugin_init) {
        this.io.setNativeObjectField(this, 4, field_plugin_init);
        return this;
    }

    @Field(5)
    public Pointer field_origin() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstPluginDesc field_origin(Pointer field_origin) {
        this.io.setPointerField(this, 5, field_origin);
        return this;
    }

    @Field(6)
    public Pointer field_version() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstPluginDesc field_version(Pointer field_version) {
        this.io.setPointerField(this, 6, field_version);
        return this;
    }

    @Field(7)
    public Pointer field_package() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstPluginDesc field_package(Pointer field_package) {
        this.io.setPointerField(this, 7, field_package);
        return this;
    }

    @Field(8)
    public Pointer field_source() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstPluginDesc field_source(Pointer field_source) {
        this.io.setPointerField(this, 8, field_source);
        return this;
    }

    @Field(9)
    public Pointer field_release_datetime() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstPluginDesc field_release_datetime(Pointer field_release_datetime) {
        this.io.setPointerField(this, 9, field_release_datetime);
        return this;
    }

    @Field(10)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstPluginDesc field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 10, field__gst_reserved);
        return this;
    }

    @Field(11)
    public Pointer field_license() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public GstPluginDesc field_license(Pointer field_license) {
        this.io.setPointerField(this, 11, field_license);
        return this;
    }

}
