
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTrashStack
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTrashStack() {
        super();
    }

    public GTrashStack(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_next() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTrashStack field_next(Pointer field_next) {
        this.io.setPointerField(this, 0, field_next);
        return this;
    }

    protected static native long g_trash_stack_height(
        @Ptr
        long stack_p);

    public static long height(Pointer stack_p) {
        return GTrashStack.g_trash_stack_height(Pointer.getPeer(stack_p));
    }

    @Ptr
    protected static native long g_trash_stack_peek(
        @Ptr
        long stack_p);

    public static Pointer peek(Pointer stack_p) {
        return Pointer.pointerToAddress(GTrashStack.g_trash_stack_peek(Pointer.getPeer(stack_p)));
    }

    @Ptr
    protected static native long g_trash_stack_pop(
        @Ptr
        long stack_p);

    public static Pointer pop(Pointer stack_p) {
        return Pointer.pointerToAddress(GTrashStack.g_trash_stack_pop(Pointer.getPeer(stack_p)));
    }

    protected static native void g_trash_stack_push(
        @Ptr
        long stack_p,
        @Ptr
        long data_p);

    public static void push(Pointer stack_p, Pointer data_p) {
        GTrashStack.g_trash_stack_push(Pointer.getPeer(stack_p), Pointer.getPeer(data_p));
    }

}
