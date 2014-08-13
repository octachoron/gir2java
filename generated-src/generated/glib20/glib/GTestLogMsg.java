
package generated.glib20.glib;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTestLogMsg
    extends StructObject
{


    public GTestLogMsg() {
        super();
    }

    public GTestLogMsg(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<Long> field_nums() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTestLogMsg field_nums(Pointer<Long> field_nums) {
        this.io.setPointerField(this, 0, field_nums);
        return this;
    }

    @Field(1)
    public long field_n_strings() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GTestLogMsg field_n_strings(long field_n_strings) {
        this.io.setNativeObjectField(this, 1, field_n_strings);
        return this;
    }

    @Field(2)
    public Pointer field_strings() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GTestLogMsg field_strings(Pointer field_strings) {
        this.io.setPointerField(this, 2, field_strings);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GTestLogType> field_log_type() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GTestLogMsg field_log_type(IntValuedEnum<GTestLogType> field_log_type) {
        this.io.setEnumField(this, 3, field_log_type);
        return this;
    }

    @Field(4)
    public long field_n_nums() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GTestLogMsg field_n_nums(long field_n_nums) {
        this.io.setNativeObjectField(this, 4, field_n_nums);
        return this;
    }

    protected native void g_test_log_msg_free(
        @Ptr
        long tmsg);

    public void free() {
        this.g_test_log_msg_free(Pointer.pointerTo(this, GTestLogMsg.class));
    }

}