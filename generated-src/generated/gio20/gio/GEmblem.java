
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GEmblem
    extends GObject
{


    public GEmblem() {
        super();
    }

    public GEmblem(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_emblem_get_icon(
        @Ptr
        long emblem);

    public Pointer get_icon() {
        return Pointer.pointerToAddress(this.g_emblem_get_icon(Pointer.pointerTo(this, GEmblem.class)));
    }

    protected native IntValuedEnum<GEmblemOrigin> g_emblem_get_origin(
        @Ptr
        long emblem);

    public IntValuedEnum<GEmblemOrigin> get_origin() {
        return this.g_emblem_get_origin(Pointer.pointerTo(this, GEmblem.class));
    }

}
