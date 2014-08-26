
package generated.glib20.glib;

import org.bridj.BridJ;
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


    static {
        BridJ.register();
    }

    public GTestLogMsg() {
        super();
    }

    public GTestLogMsg(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GTestLogType> gtestlogmsg_field_log_type() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GTestLogMsg gtestlogmsg_field_log_type(IntValuedEnum<GTestLogType> gtestlogmsg_field_log_type) {
        this.io.setEnumField(this, 0, gtestlogmsg_field_log_type);
        return this;
    }

    @Field(1)
    public Pointer<Long> gtestlogmsg_field_nums() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTestLogMsg gtestlogmsg_field_nums(Pointer<Long> gtestlogmsg_field_nums) {
        this.io.setPointerField(this, 1, gtestlogmsg_field_nums);
        return this;
    }

    protected native void g_test_log_msg_free(
        @Ptr
        long tmsg);

    public void free() {
        this.g_test_log_msg_free(Pointer.pointerTo(this, GTestLogMsg.class).getPeer());
    }

    @Field(2)
    public Pointer gtestlogmsg_field_strings() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GTestLogMsg gtestlogmsg_field_strings(Pointer gtestlogmsg_field_strings) {
        this.io.setPointerField(this, 2, gtestlogmsg_field_strings);
        return this;
    }

    @Field(3)
    public long gtestlogmsg_field_n_nums() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GTestLogMsg gtestlogmsg_field_n_nums(long gtestlogmsg_field_n_nums) {
        this.io.setLongField(this, 3, gtestlogmsg_field_n_nums);
        return this;
    }

    @Field(4)
    public long gtestlogmsg_field_n_strings() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GTestLogMsg gtestlogmsg_field_n_strings(long gtestlogmsg_field_n_strings) {
        this.io.setLongField(this, 4, gtestlogmsg_field_n_strings);
        return this;
    }

}
