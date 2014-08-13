
package generated.gstreamerbase10.gstbase;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstDataQueueSize
    extends StructObject
{


    public GstDataQueueSize() {
        super();
    }

    public GstDataQueueSize(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_visible() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstDataQueueSize field_visible(long field_visible) {
        this.io.setNativeObjectField(this, 0, field_visible);
        return this;
    }

    @Field(1)
    public long field_bytes() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstDataQueueSize field_bytes(long field_bytes) {
        this.io.setNativeObjectField(this, 1, field_bytes);
        return this;
    }

    @Field(2)
    public long field_time() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstDataQueueSize field_time(long field_time) {
        this.io.setNativeObjectField(this, 2, field_time);
        return this;
    }

}
