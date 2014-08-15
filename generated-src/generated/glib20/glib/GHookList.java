
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHookList
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GHookList() {
        super();
    }

    public GHookList(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_seq_id() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GHookList field_seq_id(long field_seq_id) {
        this.io.setLongField(this, 0, field_seq_id);
        return this;
    }

    @Field(1)
    public long field_hook_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GHookList field_hook_size(long field_hook_size) {
        this.io.setLongField(this, 1, field_hook_size);
        return this;
    }

    @Field(2)
    public long field_is_setup() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GHookList field_is_setup(long field_is_setup) {
        this.io.setLongField(this, 2, field_is_setup);
        return this;
    }

    @Field(3)
    public Pointer<GHook> field_hooks() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GHookList field_hooks(Pointer<GHook> field_hooks) {
        this.io.setPointerField(this, 3, field_hooks);
        return this;
    }

    @Field(4)
    public Pointer field_dummy3() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GHookList field_dummy3(Pointer field_dummy3) {
        this.io.setPointerField(this, 4, field_dummy3);
        return this;
    }

    @Field(5)
    public Pointer field_finalize_hook() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GHookList field_finalize_hook(Pointer field_finalize_hook) {
        this.io.setPointerField(this, 5, field_finalize_hook);
        return this;
    }

    @Field(6)
    public Pointer field_dummy() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GHookList field_dummy(Pointer field_dummy) {
        this.io.setPointerField(this, 6, field_dummy);
        return this;
    }

    protected native void g_hook_list_clear(
        @Ptr
        long hook_list);

    public void clear() {
        this.g_hook_list_clear(Pointer.pointerTo(this, GHookList.class).getPeer());
    }

    protected native void g_hook_list_init(
        @Ptr
        long hook_list, long hook_size);

    public void init(long hook_size) {
        this.g_hook_list_init(Pointer.pointerTo(this, GHookList.class).getPeer(), hook_size);
    }

    protected native void g_hook_list_invoke(
        @Ptr
        long hook_list, boolean may_recurse);

    public void invoke(boolean may_recurse) {
        this.g_hook_list_invoke(Pointer.pointerTo(this, GHookList.class).getPeer(), may_recurse);
    }

    protected native void g_hook_list_invoke_check(
        @Ptr
        long hook_list, boolean may_recurse);

    public void invoke_check(boolean may_recurse) {
        this.g_hook_list_invoke_check(Pointer.pointerTo(this, GHookList.class).getPeer(), may_recurse);
    }

    protected native void g_hook_list_marshal_check(
        @Ptr
        long hook_list, boolean may_recurse,
        @Ptr
        long marshaller,
        @Ptr
        long marshal_data);

    public void marshal_check(boolean may_recurse, Pointer marshaller, Pointer marshal_data) {
        this.g_hook_list_marshal_check(Pointer.pointerTo(this, GHookList.class).getPeer(), may_recurse, Pointer.getPeer(marshaller), Pointer.getPeer(marshal_data));
    }

    protected native void g_hook_list_marshal(
        @Ptr
        long hook_list, boolean may_recurse,
        @Ptr
        long marshaller,
        @Ptr
        long marshal_data);

    public void marshal(boolean may_recurse, Pointer marshaller, Pointer marshal_data) {
        this.g_hook_list_marshal(Pointer.pointerTo(this, GHookList.class).getPeer(), may_recurse, Pointer.getPeer(marshaller), Pointer.getPeer(marshal_data));
    }

}
