
package generated.gstreamervideo10.gstvideo;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoRectangle
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoRectangle() {
        super();
    }

    public GstVideoRectangle(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int gstvideorectangle_field_x() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GstVideoRectangle gstvideorectangle_field_x(int gstvideorectangle_field_x) {
        this.io.setIntField(this, 0, gstvideorectangle_field_x);
        return this;
    }

    @Field(1)
    public int gstvideorectangle_field_y() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GstVideoRectangle gstvideorectangle_field_y(int gstvideorectangle_field_y) {
        this.io.setIntField(this, 1, gstvideorectangle_field_y);
        return this;
    }

    @Field(2)
    public int gstvideorectangle_field_w() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstVideoRectangle gstvideorectangle_field_w(int gstvideorectangle_field_w) {
        this.io.setIntField(this, 2, gstvideorectangle_field_w);
        return this;
    }

    @Field(3)
    public int gstvideorectangle_field_h() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GstVideoRectangle gstvideorectangle_field_h(int gstvideorectangle_field_h) {
        this.io.setIntField(this, 3, gstvideorectangle_field_h);
        return this;
    }

}
