
package generated.gstreamerfft10.gstfft;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-fft-1.0")
public class GstFFTF32Complex
    extends StructObject
{


    public GstFFTF32Complex() {
        super();
    }

    public GstFFTF32Complex(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public float field_r() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstFFTF32Complex field_r(float field_r) {
        this.io.setNativeObjectField(this, 0, field_r);
        return this;
    }

    @Field(1)
    public float field_i() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstFFTF32Complex field_i(float field_i) {
        this.io.setNativeObjectField(this, 1, field_i);
        return this;
    }

}
