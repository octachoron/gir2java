
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstMetaInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstMetaInfo() {
        super();
    }

    public GstMetaInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_api() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstMetaInfo field_api(long field_api) {
        this.io.setLongField(this, 0, field_api);
        return this;
    }

    @Field(1)
    public long field_type() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstMetaInfo field_type(long field_type) {
        this.io.setLongField(this, 1, field_type);
        return this;
    }

    @Field(2)
    public long field_size() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstMetaInfo field_size(long field_size) {
        this.io.setLongField(this, 2, field_size);
        return this;
    }

    @Field(3)
    public Pointer field_init_func() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstMetaInfo field_init_func(Pointer field_init_func) {
        this.io.setPointerField(this, 3, field_init_func);
        return this;
    }

    @Field(4)
    public Pointer field_transform_func() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstMetaInfo field_transform_func(Pointer field_transform_func) {
        this.io.setPointerField(this, 4, field_transform_func);
        return this;
    }

    @Field(5)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstMetaInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 5, field__gst_reserved);
        return this;
    }

    @Field(6)
    public Pointer field_free_func() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstMetaInfo field_free_func(Pointer field_free_func) {
        this.io.setPointerField(this, 6, field_free_func);
        return this;
    }

}
