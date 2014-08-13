
package generated.gstreamertag10.gsttag;

import generated.gstreamer10.gst.GstElementClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-tag-1.0")
public class GstTagDemuxClass
    extends StructObject
{


    public GstTagDemuxClass() {
        super();
    }

    public GstTagDemuxClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstElementClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTagDemuxClass field_parent_class(GstElementClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public long field_min_start_size() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstTagDemuxClass field_min_start_size(long field_min_start_size) {
        this.io.setNativeObjectField(this, 1, field_min_start_size);
        return this;
    }

    @Field(2)
    public long field_min_end_size() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstTagDemuxClass field_min_end_size(long field_min_end_size) {
        this.io.setNativeObjectField(this, 2, field_min_end_size);
        return this;
    }

    @Field(3)
    public Pointer field_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstTagDemuxClass field_reserved(Pointer field_reserved) {
        this.io.setPointerField(this, 3, field_reserved);
        return this;
    }

}
