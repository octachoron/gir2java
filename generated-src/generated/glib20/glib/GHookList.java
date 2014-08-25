
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
    public long ghooklist_field_seq_id() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GHookList ghooklist_field_seq_id(long ghooklist_field_seq_id) {
        this.io.setLongField(this, 0, ghooklist_field_seq_id);
        return this;
    }

    @Field(1)
    public long ghooklist_field_hook_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GHookList ghooklist_field_hook_size(long ghooklist_field_hook_size) {
        this.io.setLongField(this, 1, ghooklist_field_hook_size);
        return this;
    }

    @Field(2)
    public long ghooklist_field_is_setup() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GHookList ghooklist_field_is_setup(long ghooklist_field_is_setup) {
        this.io.setLongField(this, 2, ghooklist_field_is_setup);
        return this;
    }

    @Field(3)
    public Pointer<GHook> ghooklist_field_hooks() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GHookList ghooklist_field_hooks(Pointer<GHook> ghooklist_field_hooks) {
        this.io.setPointerField(this, 3, ghooklist_field_hooks);
        return this;
    }

    @Field(4)
    public Pointer ghooklist_field_dummy3() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GHookList ghooklist_field_dummy3(Pointer ghooklist_field_dummy3) {
        this.io.setPointerField(this, 4, ghooklist_field_dummy3);
        return this;
    }

    @Field(5)
    public Pointer ghooklist_field_finalize_hook() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GHookList ghooklist_field_finalize_hook(Pointer ghooklist_field_finalize_hook) {
        this.io.setPointerField(this, 5, ghooklist_field_finalize_hook);
        return this;
    }

    @Field(6)
    public Pointer ghooklist_field_dummy() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GHookList ghooklist_field_dummy(Pointer ghooklist_field_dummy) {
        this.io.setPointerField(this, 6, ghooklist_field_dummy);
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
