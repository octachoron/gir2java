
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMenuLinkIter
    extends GObject
{


    public GMenuLinkIter() {
        super();
    }

    public GMenuLinkIter(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_menu_link_iter_get_name(
        @Ptr
        long iter);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_menu_link_iter_get_name(Pointer.pointerTo(this, GMenuLinkIter.class)));
    }

    protected native boolean g_menu_link_iter_get_next(
        @Ptr
        long iter,
        @Ptr
        long out_link,
        @Ptr
        long value);

    public boolean get_next(Pointer out_link, Pointer value) {
        return this.g_menu_link_iter_get_next(Pointer.pointerTo(this, GMenuLinkIter.class), Pointer.getPeer(out_link), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_menu_link_iter_get_value(
        @Ptr
        long iter);

    public Pointer get_value() {
        return Pointer.pointerToAddress(this.g_menu_link_iter_get_value(Pointer.pointerTo(this, GMenuLinkIter.class)));
    }

    protected native boolean g_menu_link_iter_next(
        @Ptr
        long iter);

    public boolean next() {
        return this.g_menu_link_iter_next(Pointer.pointerTo(this, GMenuLinkIter.class));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMenuLinkIter field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GMenuLinkIter field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
