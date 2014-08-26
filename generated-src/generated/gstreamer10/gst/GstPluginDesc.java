
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstPluginDesc
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPluginDesc() {
        super();
    }

    public GstPluginDesc(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gstplugindesc_field_major_version() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GstPluginDesc gstplugindesc_field_major_version(int gstplugindesc_field_major_version) {
        this.io.setIntField(this, 0, gstplugindesc_field_major_version);
        return this;
    }

    @Field(1)
    public int gstplugindesc_field_minor_version() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GstPluginDesc gstplugindesc_field_minor_version(int gstplugindesc_field_minor_version) {
        this.io.setIntField(this, 1, gstplugindesc_field_minor_version);
        return this;
    }

    @Field(2)
    public Pointer gstplugindesc_field_name() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstPluginDesc gstplugindesc_field_name(Pointer gstplugindesc_field_name) {
        this.io.setPointerField(this, 2, gstplugindesc_field_name);
        return this;
    }

    @Field(3)
    public Pointer gstplugindesc_field_description() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstPluginDesc gstplugindesc_field_description(Pointer gstplugindesc_field_description) {
        this.io.setPointerField(this, 3, gstplugindesc_field_description);
        return this;
    }

    @Field(4)
    private Pointer gstplugindesc_field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstPluginDesc gstplugindesc_field__gst_reserved(Pointer gstplugindesc_field__gst_reserved) {
        this.io.setPointerField(this, 4, gstplugindesc_field__gst_reserved);
        return this;
    }

    @Field(5)
    public Pointer gstplugindesc_field_plugin_init() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstPluginDesc gstplugindesc_field_plugin_init(Pointer gstplugindesc_field_plugin_init) {
        this.io.setPointerField(this, 5, gstplugindesc_field_plugin_init);
        return this;
    }

    @Field(6)
    public Pointer gstplugindesc_field_package() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstPluginDesc gstplugindesc_field_package(Pointer gstplugindesc_field_package) {
        this.io.setPointerField(this, 6, gstplugindesc_field_package);
        return this;
    }

    @Field(7)
    public Pointer gstplugindesc_field_origin() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstPluginDesc gstplugindesc_field_origin(Pointer gstplugindesc_field_origin) {
        this.io.setPointerField(this, 7, gstplugindesc_field_origin);
        return this;
    }

    @Field(8)
    public Pointer gstplugindesc_field_source() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstPluginDesc gstplugindesc_field_source(Pointer gstplugindesc_field_source) {
        this.io.setPointerField(this, 8, gstplugindesc_field_source);
        return this;
    }

    @Field(9)
    public Pointer gstplugindesc_field_version() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstPluginDesc gstplugindesc_field_version(Pointer gstplugindesc_field_version) {
        this.io.setPointerField(this, 9, gstplugindesc_field_version);
        return this;
    }

    @Field(10)
    public Pointer gstplugindesc_field_release_datetime() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstPluginDesc gstplugindesc_field_release_datetime(Pointer gstplugindesc_field_release_datetime) {
        this.io.setPointerField(this, 10, gstplugindesc_field_release_datetime);
        return this;
    }

    @Field(11)
    public Pointer gstplugindesc_field_license() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public GstPluginDesc gstplugindesc_field_license(Pointer gstplugindesc_field_license) {
        this.io.setPointerField(this, 11, gstplugindesc_field_license);
        return this;
    }

}
