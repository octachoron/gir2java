
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSettingsSchema
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSettingsSchema() {
        super();
    }

    public GSettingsSchema(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_settings_schema_get_id(
        @Ptr
        long schema);

    public Pointer get_id() {
        return Pointer.pointerToAddress(this.g_settings_schema_get_id(Pointer.pointerTo(this, GSettingsSchema.class).getPeer()));
    }

    @Ptr
    protected native long g_settings_schema_get_key(
        @Ptr
        long schema,
        @Ptr
        long name);

    public Pointer get_key(Pointer name) {
        return Pointer.pointerToAddress(this.g_settings_schema_get_key(Pointer.pointerTo(this, GSettingsSchema.class).getPeer(), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long g_settings_schema_get_path(
        @Ptr
        long schema);

    public Pointer get_path() {
        return Pointer.pointerToAddress(this.g_settings_schema_get_path(Pointer.pointerTo(this, GSettingsSchema.class).getPeer()));
    }

    protected native boolean g_settings_schema_has_key(
        @Ptr
        long schema,
        @Ptr
        long name);

    public boolean has_key(Pointer name) {
        return this.g_settings_schema_has_key(Pointer.pointerTo(this, GSettingsSchema.class).getPeer(), Pointer.getPeer(name));
    }

    @Ptr
    protected native long g_settings_schema_ref(
        @Ptr
        long schema);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_settings_schema_ref(Pointer.pointerTo(this, GSettingsSchema.class).getPeer()));
    }

    protected native void g_settings_schema_unref(
        @Ptr
        long schema);

    public void unref() {
        this.g_settings_schema_unref(Pointer.pointerTo(this, GSettingsSchema.class).getPeer());
    }

}
