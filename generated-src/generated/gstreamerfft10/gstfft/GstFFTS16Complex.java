
package generated.gstreamerfft10.gstfft;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-fft-1.0")
public class GstFFTS16Complex
    extends StructObject
{


    public GstFFTS16Complex() {
        super();
    }

    public GstFFTS16Complex(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public short field_r() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstFFTS16Complex field_r(short field_r) {
        this.io.setNativeObjectField(this, 0, field_r);
        return this;
    }

    @Field(1)
    public short field_i() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstFFTS16Complex field_i(short field_i) {
        this.io.setNativeObjectField(this, 1, field_i);
        return this;
    }

}
