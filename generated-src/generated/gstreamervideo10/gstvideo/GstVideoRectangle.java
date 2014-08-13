
package generated.gstreamervideo10.gstvideo;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoRectangle
    extends StructObject
{


    public GstVideoRectangle() {
        super();
    }

    public GstVideoRectangle(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_x() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoRectangle field_x(int field_x) {
        this.io.setNativeObjectField(this, 0, field_x);
        return this;
    }

    @Field(1)
    public int field_y() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstVideoRectangle field_y(int field_y) {
        this.io.setNativeObjectField(this, 1, field_y);
        return this;
    }

    @Field(2)
    public int field_w() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoRectangle field_w(int field_w) {
        this.io.setNativeObjectField(this, 2, field_w);
        return this;
    }

    @Field(3)
    public int field_h() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstVideoRectangle field_h(int field_h) {
        this.io.setNativeObjectField(this, 3, field_h);
        return this;
    }

}
