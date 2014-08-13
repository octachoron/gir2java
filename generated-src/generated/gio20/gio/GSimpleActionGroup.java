
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimpleActionGroup
    extends GObject
{


    public GSimpleActionGroup() {
        super();
    }

    public GSimpleActionGroup(Pointer pointer) {
        super(pointer);
    }

    protected native void g_simple_action_group_add_entries(
        @Ptr
        long simple,
        @Ptr
        long entries, int n_entries, Pointer user_data);

    public void add_entries(GActionEntry entries, int n_entries, Pointer user_data) {
        this.g_simple_action_group_add_entries(Pointer.pointerTo(this, GSimpleActionGroup.class), Pointer.getPeer(entries), n_entries, user_data);
    }

    protected native void g_simple_action_group_insert(
        @Ptr
        long simple,
        @Ptr
        long action);

    public void insert(Pointer<Object> action) {
        this.g_simple_action_group_insert(Pointer.pointerTo(this, GSimpleActionGroup.class), Pointer.getPeer(action));
    }

    @Ptr
    protected native long g_simple_action_group_lookup(
        @Ptr
        long simple,
        @Ptr
        long action_name);

    public Pointer<Object> lookup(Pointer action_name) {
        return Pointer.pointerToAddress(this.g_simple_action_group_lookup(Pointer.pointerTo(this, GSimpleActionGroup.class), Pointer.getPeer(action_name)), Pointer.class);
    }

    protected native void g_simple_action_group_remove(
        @Ptr
        long simple,
        @Ptr
        long action_name);

    public void remove(Pointer action_name) {
        this.g_simple_action_group_remove(Pointer.pointerTo(this, GSimpleActionGroup.class), Pointer.getPeer(action_name));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSimpleActionGroup field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSimpleActionGroup field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
