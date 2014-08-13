
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstMiniObject;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstDataQueueItem
    extends StructObject
{


    public GstDataQueueItem() {
        super();
    }

    public GstDataQueueItem(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstMiniObject> field_object() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstDataQueueItem field_object(Pointer<GstMiniObject> field_object) {
        this.io.setPointerField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public long field_size() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstDataQueueItem field_size(long field_size) {
        this.io.setNativeObjectField(this, 1, field_size);
        return this;
    }

    @Field(2)
    public long field_duration() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstDataQueueItem field_duration(long field_duration) {
        this.io.setNativeObjectField(this, 2, field_duration);
        return this;
    }

    @Field(3)
    public boolean field_visible() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstDataQueueItem field_visible(boolean field_visible) {
        this.io.setNativeObjectField(this, 3, field_visible);
        return this;
    }

    @Field(4)
    public Object field_destroy() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstDataQueueItem field_destroy(Object field_destroy) {
        this.io.setNativeObjectField(this, 4, field_destroy);
        return this;
    }

    @Field(5)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstDataQueueItem field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 5, field__gst_reserved);
        return this;
    }

}
