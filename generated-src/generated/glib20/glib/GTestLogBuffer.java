
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTestLogBuffer
    extends StructObject
{


    public GTestLogBuffer() {
        super();
    }

    public GTestLogBuffer(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GString> field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTestLogBuffer field_data(Pointer<GString> field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public Pointer<GSList> field_msgs() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTestLogBuffer field_msgs(Pointer<GSList> field_msgs) {
        this.io.setPointerField(this, 1, field_msgs);
        return this;
    }

    protected native void g_test_log_buffer_free(
        @Ptr
        long tbuffer);

    public void free() {
        this.g_test_log_buffer_free(Pointer.pointerTo(this, GTestLogBuffer.class));
    }

    @Ptr
    protected native long g_test_log_buffer_pop(
        @Ptr
        long tbuffer);

    public Pointer pop() {
        return Pointer.pointerToAddress(this.g_test_log_buffer_pop(Pointer.pointerTo(this, GTestLogBuffer.class)));
    }

    protected native void g_test_log_buffer_push(
        @Ptr
        long tbuffer, long n_bytes,
        @Ptr
        long bytes);

    public void push(long n_bytes, Pointer<Short> bytes) {
        this.g_test_log_buffer_push(Pointer.pointerTo(this, GTestLogBuffer.class), n_bytes, Pointer.getPeer(bytes));
    }

    @Ptr
    protected native long g_test_log_buffer_new();

    public Pointer _new() {
        return Pointer.pointerToAddress(this.g_test_log_buffer_new());
    }

}
