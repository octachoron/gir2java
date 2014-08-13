
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMenuAttributeIter
    extends GObject
{


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
        return Pointer.pointerToAddress(this.g_menu_attribute_iter_get_name(Pointer.pointerTo(this, GMenuAttributeIter.class)));
    }

    protected native boolean g_menu_attribute_iter_get_next(
        @Ptr
        long iter,
        @Ptr
        long out_name,
        @Ptr
        long value);

    public boolean get_next(Pointer out_name, Pointer<Pointer<GVariant>> value) {
        return this.g_menu_attribute_iter_get_next(Pointer.pointerTo(this, GMenuAttributeIter.class), Pointer.getPeer(out_name), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_menu_attribute_iter_get_value(
        @Ptr
        long iter);

    public Pointer<GVariant> get_value() {
        return Pointer.pointerToAddress(this.g_menu_attribute_iter_get_value(Pointer.pointerTo(this, GMenuAttributeIter.class)), Pointer.class);
    }

    protected native boolean g_menu_attribute_iter_next(
        @Ptr
        long iter);

    public boolean next() {
        return this.g_menu_attribute_iter_next(Pointer.pointerTo(this, GMenuAttributeIter.class));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMenuAttributeIter field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GMenuAttributeIter field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
