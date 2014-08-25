
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTestLogBuffer
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTestLogBuffer() {
        super();
    }

    public GTestLogBuffer(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer<GString> gtestlogbuffer_field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GTestLogBuffer gtestlogbuffer_field_data(Pointer<GString> gtestlogbuffer_field_data) {
        this.io.setPointerField(this, 0, gtestlogbuffer_field_data);
        return this;
    }

    @Field(1)
    private Pointer<GSList> gtestlogbuffer_field_msgs() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTestLogBuffer gtestlogbuffer_field_msgs(Pointer<GSList> gtestlogbuffer_field_msgs) {
        this.io.setPointerField(this, 1, gtestlogbuffer_field_msgs);
        return this;
    }

    protected native void g_test_log_buffer_free(
        @Ptr
        long tbuffer);

    public void free() {
        this.g_test_log_buffer_free(Pointer.pointerTo(this, GTestLogBuffer.class).getPeer());
    }

    @Ptr
    protected native long g_test_log_buffer_pop(
        @Ptr
        long tbuffer);

    public Pointer pop() {
        return Pointer.pointerToAddress(this.g_test_log_buffer_pop(Pointer.pointerTo(this, GTestLogBuffer.class).getPeer()));
    }

    protected native void g_test_log_buffer_push(
        @Ptr
        long tbuffer, long n_bytes,
        @Ptr
        long bytes);

    public void push(long n_bytes, Pointer<Short> bytes) {
        this.g_test_log_buffer_push(Pointer.pointerTo(this, GTestLogBuffer.class).getPeer(), n_bytes, Pointer.getPeer(bytes));
    }

    @Ptr
    protected static native long g_test_log_buffer_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GTestLogBuffer.g_test_log_buffer_new());
    }

}
