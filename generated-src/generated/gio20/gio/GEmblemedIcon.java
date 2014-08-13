
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GEmblemedIcon
    extends GObject
{


    public GEmblemedIcon() {
        super();
    }

    public GEmblemedIcon(Pointer pointer) {
        super(pointer);
    }

    protected native void g_emblemed_icon_add_emblem(
        @Ptr
        long emblemed,
        @Ptr
        long emblem);

    public void add_emblem(Pointer<GEmblem> emblem) {
        this.g_emblemed_icon_add_emblem(Pointer.pointerTo(this, GEmblemedIcon.class), Pointer.getPeer(emblem));
    }

    protected native void g_emblemed_icon_clear_emblems(
        @Ptr
        long emblemed);

    public void clear_emblems() {
        this.g_emblemed_icon_clear_emblems(Pointer.pointerTo(this, GEmblemedIcon.class));
    }

    @Ptr
    protected native long g_emblemed_icon_get_emblems(
        @Ptr
        long emblemed);

    public Pointer<GList> get_emblems() {
        return Pointer.pointerToAddress(this.g_emblemed_icon_get_emblems(Pointer.pointerTo(this, GEmblemedIcon.class)), Pointer.class);
    }

    @Ptr
    protected native long g_emblemed_icon_get_icon(
        @Ptr
        long emblemed);

    public Pointer get_icon() {
        return Pointer.pointerToAddress(this.g_emblemed_icon_get_icon(Pointer.pointerTo(this, GEmblemedIcon.class)));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GEmblemedIcon field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GEmblemedIcon field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
