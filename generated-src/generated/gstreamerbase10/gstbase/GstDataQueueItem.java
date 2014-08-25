
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstMiniObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstDataQueueItem
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstDataQueueItem() {
        super();
    }

    public GstDataQueueItem(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstMiniObject> gstdataqueueitem_field_object() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstDataQueueItem gstdataqueueitem_field_object(Pointer<GstMiniObject> gstdataqueueitem_field_object) {
        this.io.setPointerField(this, 0, gstdataqueueitem_field_object);
        return this;
    }

    @Field(1)
    public long gstdataqueueitem_field_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstDataQueueItem gstdataqueueitem_field_size(long gstdataqueueitem_field_size) {
        this.io.setLongField(this, 1, gstdataqueueitem_field_size);
        return this;
    }

    @Field(2)
    public long gstdataqueueitem_field_duration() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstDataQueueItem gstdataqueueitem_field_duration(long gstdataqueueitem_field_duration) {
        this.io.setLongField(this, 2, gstdataqueueitem_field_duration);
        return this;
    }

    @Field(3)
    public boolean gstdataqueueitem_field_visible() {
        return this.io.getBooleanField(this, 3);
    }

    @Field(3)
    public GstDataQueueItem gstdataqueueitem_field_visible(boolean gstdataqueueitem_field_visible) {
        this.io.setBooleanField(this, 3, gstdataqueueitem_field_visible);
        return this;
    }

    @Field(4)
    public Pointer gstdataqueueitem_field_destroy() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstDataQueueItem gstdataqueueitem_field_destroy(Pointer gstdataqueueitem_field_destroy) {
        this.io.setPointerField(this, 4, gstdataqueueitem_field_destroy);
        return this;
    }

    @Field(5)
    private Pointer gstdataqueueitem_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstDataQueueItem gstdataqueueitem_field__gst_reserved(Pointer gstdataqueueitem_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstdataqueueitem_field__gst_reserved);
        return this;
    }

}
