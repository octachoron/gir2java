
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimpleActionGroup
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSimpleActionGroup() {
        super();
    }

    public GSimpleActionGroup(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_simple_action_group_new();

    public static Pointer gsimpleactiongroup__new() {
        return Pointer.pointerToAddress(GSimpleActionGroup.g_simple_action_group_new());
    }

    protected native void g_simple_action_group_add_entries(
        @Ptr
        long simple,
        @Ptr
        long entries, int n_entries,
        @Ptr
        long user_data);

    public void add_entries(Pointer<GActionEntry> entries, int n_entries, Pointer user_data) {
        this.g_simple_action_group_add_entries(Pointer.pointerTo(this, GSimpleActionGroup.class).getPeer(), Pointer.getPeer(entries), n_entries, Pointer.getPeer(user_data));
    }

    protected native void g_simple_action_group_insert(
        @Ptr
        long simple,
        @Ptr
        long action);

    public void insert(Pointer<Object> action) {
        this.g_simple_action_group_insert(Pointer.pointerTo(this, GSimpleActionGroup.class).getPeer(), Pointer.getPeer(action));
    }

    @Ptr
    protected native long g_simple_action_group_lookup(
        @Ptr
        long simple,
        @Ptr
        long action_name);

    public Pointer<Object> lookup(Pointer action_name) {
        return Pointer.pointerToAddress(this.g_simple_action_group_lookup(Pointer.pointerTo(this, GSimpleActionGroup.class).getPeer(), Pointer.getPeer(action_name)), Object.class);
    }

    protected native void g_simple_action_group_remove(
        @Ptr
        long simple,
        @Ptr
        long action_name);

    public void remove(Pointer action_name) {
        this.g_simple_action_group_remove(Pointer.pointerTo(this, GSimpleActionGroup.class).getPeer(), Pointer.getPeer(action_name));
    }

    @Field(0)
    private GObject gsimpleactiongroup_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GSimpleActionGroup gsimpleactiongroup_field_parent_instance(GObject gsimpleactiongroup_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gsimpleactiongroup_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gsimpleactiongroup_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GSimpleActionGroup gsimpleactiongroup_field_priv(Pointer gsimpleactiongroup_field_priv) {
        this.io.setPointerField(this, 1, gsimpleactiongroup_field_priv);
        return this;
    }

}
