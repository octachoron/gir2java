
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMenuModel
    extends GObject
{


    static {
        BridJ.register();
    }

    public GMenuModel() {
        super();
    }

    public GMenuModel(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_menu_model_get_item_attribute(
        @Ptr
        long model, int item_index,
        @Ptr
        long attribute,
        @Ptr
        long format_string, Object... varargs);

    public boolean get_item_attribute(int item_index, Pointer attribute, Pointer format_string, Object... varargs) {
        return this.g_menu_model_get_item_attribute(Pointer.pointerTo(this, GMenuModel.class).getPeer(), item_index, Pointer.getPeer(attribute), Pointer.getPeer(format_string), varargs);
    }

    @Ptr
    protected native long g_menu_model_get_item_attribute_value(
        @Ptr
        long model, int item_index,
        @Ptr
        long attribute,
        @Ptr
        long expected_type);

    public Pointer<GVariant> get_item_attribute_value(int item_index, Pointer attribute, Pointer<GVariantType> expected_type) {
        return Pointer.pointerToAddress(this.g_menu_model_get_item_attribute_value(Pointer.pointerTo(this, GMenuModel.class).getPeer(), item_index, Pointer.getPeer(attribute), Pointer.getPeer(expected_type)), GVariant.class);
    }

    @Ptr
    protected native long g_menu_model_get_item_link(
        @Ptr
        long model, int item_index,
        @Ptr
        long link);

    public Pointer get_item_link(int item_index, Pointer link) {
        return Pointer.pointerToAddress(this.g_menu_model_get_item_link(Pointer.pointerTo(this, GMenuModel.class).getPeer(), item_index, Pointer.getPeer(link)));
    }

    protected native int g_menu_model_get_n_items(
        @Ptr
        long model);

    public int get_n_items() {
        return this.g_menu_model_get_n_items(Pointer.pointerTo(this, GMenuModel.class).getPeer());
    }

    protected native boolean g_menu_model_is_mutable(
        @Ptr
        long model);

    public boolean is_mutable() {
        return this.g_menu_model_is_mutable(Pointer.pointerTo(this, GMenuModel.class).getPeer());
    }

    protected native void g_menu_model_items_changed(
        @Ptr
        long model, int position, int removed, int added);

    public void items_changed(int position, int removed, int added) {
        this.g_menu_model_items_changed(Pointer.pointerTo(this, GMenuModel.class).getPeer(), position, removed, added);
    }

    @Ptr
    protected native long g_menu_model_iterate_item_attributes(
        @Ptr
        long model, int item_index);

    public Pointer<GMenuAttributeIter> iterate_item_attributes(int item_index) {
        return Pointer.pointerToAddress(this.g_menu_model_iterate_item_attributes(Pointer.pointerTo(this, GMenuModel.class).getPeer(), item_index), GMenuAttributeIter.class);
    }

    @Ptr
    protected native long g_menu_model_iterate_item_links(
        @Ptr
        long model, int item_index);

    public Pointer<GMenuLinkIter> iterate_item_links(int item_index) {
        return Pointer.pointerToAddress(this.g_menu_model_iterate_item_links(Pointer.pointerTo(this, GMenuModel.class).getPeer(), item_index), GMenuLinkIter.class);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMenuModel field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GMenuModel field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
