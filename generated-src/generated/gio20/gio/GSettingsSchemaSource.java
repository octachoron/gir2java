
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSettingsSchemaSource
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSettingsSchemaSource() {
        super();
    }

    public GSettingsSchemaSource(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_settings_schema_source_new_from_directory(
        @Ptr
        long directory,
        @Ptr
        long parent, boolean trusted);

    public static Pointer new_from_directory(Pointer directory, Pointer parent, boolean trusted) {
        return Pointer.pointerToAddress(GSettingsSchemaSource.g_settings_schema_source_new_from_directory(Pointer.getPeer(directory), Pointer.getPeer(parent), trusted));
    }

    protected native void g_settings_schema_source_list_schemas(
        @Ptr
        long source, boolean recursive,
        @Ptr
        long non_relocatable,
        @Ptr
        long relocatable);

    public void list_schemas(boolean recursive, Pointer non_relocatable, Pointer relocatable) {
        this.g_settings_schema_source_list_schemas(Pointer.pointerTo(this, GSettingsSchemaSource.class).getPeer(), recursive, Pointer.getPeer(non_relocatable), Pointer.getPeer(relocatable));
    }

    @Ptr
    protected native long g_settings_schema_source_lookup(
        @Ptr
        long source,
        @Ptr
        long schema_id, boolean recursive);

    public Pointer<GSettingsSchema> lookup(Pointer schema_id, boolean recursive) {
        return Pointer.pointerToAddress(this.g_settings_schema_source_lookup(Pointer.pointerTo(this, GSettingsSchemaSource.class).getPeer(), Pointer.getPeer(schema_id), recursive), GSettingsSchema.class);
    }

    @Ptr
    protected native long g_settings_schema_source_ref(
        @Ptr
        long source);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_settings_schema_source_ref(Pointer.pointerTo(this, GSettingsSchemaSource.class).getPeer()));
    }

    protected native void g_settings_schema_source_unref(
        @Ptr
        long source);

    public void unref() {
        this.g_settings_schema_source_unref(Pointer.pointerTo(this, GSettingsSchemaSource.class).getPeer());
    }

    @Ptr
    protected static native long g_settings_schema_source_get_default();

    public static Pointer get_default() {
        return Pointer.pointerToAddress(GSettingsSchemaSource.g_settings_schema_source_get_default());
    }

}
