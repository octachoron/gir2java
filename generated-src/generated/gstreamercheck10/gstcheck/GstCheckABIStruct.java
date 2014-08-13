
package generated.gstreamercheck10.gstcheck;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-check-1.0")
public class GstCheckABIStruct
    extends StructObject
{


    public GstCheckABIStruct() {
        super();
    }

    public GstCheckABIStruct(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstCheckABIStruct field_name(Pointer field_name) {
        this.io.setPointerField(this, 0, field_name);
        return this;
    }

    @Field(1)
    public int field_size() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstCheckABIStruct field_size(int field_size) {
        this.io.setNativeObjectField(this, 1, field_size);
        return this;
    }

    @Field(2)
    public int field_abi_size() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstCheckABIStruct field_abi_size(int field_abi_size) {
        this.io.setNativeObjectField(this, 2, field_abi_size);
        return this;
    }

}
