
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMenuLinkIter
    extends GObject
{


    static {
        BridJ.register();
    }

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
        return Pointer.pointerToAddress(this.g_menu_link_iter_get_name(Pointer.pointerTo(this, GMenuLinkIter.class).getPeer()));
    }

    protected native boolean g_menu_link_iter_get_next(
        @Ptr
        long iter,
        @Ptr
        long out_link,
        @Ptr
        long value);

    public boolean get_next(Pointer out_link, Pointer value) {
        return this.g_menu_link_iter_get_next(Pointer.pointerTo(this, GMenuLinkIter.class).getPeer(), Pointer.getPeer(out_link), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_menu_link_iter_get_value(
        @Ptr
        long iter);

    public Pointer get_value() {
        return Pointer.pointerToAddress(this.g_menu_link_iter_get_value(Pointer.pointerTo(this, GMenuLinkIter.class).getPeer()));
    }

    protected native boolean g_menu_link_iter_next(
        @Ptr
        long iter);

    public boolean next() {
        return this.g_menu_link_iter_next(Pointer.pointerTo(this, GMenuLinkIter.class).getPeer());
    }

    @Field(0)
    public GObject gmenulinkiter_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMenuLinkIter gmenulinkiter_field_parent_instance(GObject gmenulinkiter_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gmenulinkiter_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gmenulinkiter_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GMenuLinkIter gmenulinkiter_field_priv(Pointer gmenulinkiter_field_priv) {
        this.io.setPointerField(this, 1, gmenulinkiter_field_priv);
        return this;
    }

}
