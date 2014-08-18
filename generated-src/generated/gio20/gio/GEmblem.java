
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GEmblem
    extends GObject
{


    static {
        BridJ.register();
    }

    public GEmblem() {
        super();
    }

    public GEmblem(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_emblem_new(
        @Ptr
        long icon);

    public static Pointer gemblem__new(Pointer icon) {
        return Pointer.pointerToAddress(GEmblem.g_emblem_new(Pointer.getPeer(icon)));
    }

    @Ptr
    protected native long g_emblem_get_icon(
        @Ptr
        long emblem);

    public Pointer get_icon() {
        return Pointer.pointerToAddress(this.g_emblem_get_icon(Pointer.pointerTo(this, GEmblem.class).getPeer()));
    }

    protected native IntValuedEnum<GEmblemOrigin> g_emblem_get_origin(
        @Ptr
        long emblem);

    public IntValuedEnum<GEmblemOrigin> get_origin() {
        return this.g_emblem_get_origin(Pointer.pointerTo(this, GEmblem.class).getPeer());
    }

    @Ptr
    protected static native long g_emblem_new_with_origin(
        @Ptr
        long icon, IntValuedEnum<GEmblemOrigin> origin);

    public static Pointer<GEmblem> new_with_origin(Pointer<Object> icon, IntValuedEnum<GEmblemOrigin> origin) {
        return Pointer.pointerToAddress(GEmblem.g_emblem_new_with_origin(Pointer.getPeer(icon), origin), GEmblem.class);
    }

}
