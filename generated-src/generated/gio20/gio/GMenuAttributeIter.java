
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMenuAttributeIter
    extends GObject
{


    static {
        BridJ.register();
    }

    public GMenuAttributeIter() {
        super();
    }

    public GMenuAttributeIter(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_menu_attribute_iter_get_name(
        @Ptr
        long iter);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_menu_attribute_iter_get_name(Pointer.pointerTo(this, GMenuAttributeIter.class).getPeer()));
    }

    protected native boolean g_menu_attribute_iter_get_next(
        @Ptr
        long iter,
        @Ptr
        long out_name,
        @Ptr
        long value);

    public boolean get_next(Pointer out_name, Pointer<Pointer<GVariant>> value) {
        return this.g_menu_attribute_iter_get_next(Pointer.pointerTo(this, GMenuAttributeIter.class).getPeer(), Pointer.getPeer(out_name), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_menu_attribute_iter_get_value(
        @Ptr
        long iter);

    public Pointer<GVariant> get_value() {
        return Pointer.pointerToAddress(this.g_menu_attribute_iter_get_value(Pointer.pointerTo(this, GMenuAttributeIter.class).getPeer()), GVariant.class);
    }

    protected native boolean g_menu_attribute_iter_next(
        @Ptr
        long iter);

    public boolean next() {
        return this.g_menu_attribute_iter_next(Pointer.pointerTo(this, GMenuAttributeIter.class).getPeer());
    }

    @Field(0)
    public GObject gmenuattributeiter_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMenuAttributeIter gmenuattributeiter_field_parent_instance(GObject gmenuattributeiter_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gmenuattributeiter_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gmenuattributeiter_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GMenuAttributeIter gmenuattributeiter_field_priv(Pointer gmenuattributeiter_field_priv) {
        this.io.setPointerField(this, 1, gmenuattributeiter_field_priv);
        return this;
    }

}
