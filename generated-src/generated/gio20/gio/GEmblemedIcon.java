
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GEmblemedIcon
    extends GObject
{


    static {
        BridJ.register();
    }

    public GEmblemedIcon() {
        super();
    }

    public GEmblemedIcon(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_emblemed_icon_new(
        @Ptr
        long icon,
        @Ptr
        long emblem);

    public static Pointer gemblemedicon__new(Pointer icon, Pointer<GEmblem> emblem) {
        return Pointer.pointerToAddress(GEmblemedIcon.g_emblemed_icon_new(Pointer.getPeer(icon), Pointer.getPeer(emblem)));
    }

    protected native void g_emblemed_icon_add_emblem(
        @Ptr
        long emblemed,
        @Ptr
        long emblem);

    public void add_emblem(Pointer<GEmblem> emblem) {
        this.g_emblemed_icon_add_emblem(Pointer.pointerTo(this, GEmblemedIcon.class).getPeer(), Pointer.getPeer(emblem));
    }

    protected native void g_emblemed_icon_clear_emblems(
        @Ptr
        long emblemed);

    public void clear_emblems() {
        this.g_emblemed_icon_clear_emblems(Pointer.pointerTo(this, GEmblemedIcon.class).getPeer());
    }

    @Ptr
    protected native long g_emblemed_icon_get_emblems(
        @Ptr
        long emblemed);

    public Pointer<GList> get_emblems() {
        return Pointer.pointerToAddress(this.g_emblemed_icon_get_emblems(Pointer.pointerTo(this, GEmblemedIcon.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long g_emblemed_icon_get_icon(
        @Ptr
        long emblemed);

    public Pointer get_icon() {
        return Pointer.pointerToAddress(this.g_emblemed_icon_get_icon(Pointer.pointerTo(this, GEmblemedIcon.class).getPeer()));
    }

    @Field(0)
    public GObject gemblemedicon_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GEmblemedIcon gemblemedicon_field_parent_instance(GObject gemblemedicon_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gemblemedicon_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gemblemedicon_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GEmblemedIcon gemblemedicon_field_priv(Pointer gemblemedicon_field_priv) {
        this.io.setPointerField(this, 1, gemblemedicon_field_priv);
        return this;
    }

}
