
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSettingsSchemaSource
    extends StructObject
{


    public GSettingsSchemaSource() {
        super();
    }

    public GSettingsSchemaSource(Pointer pointer) {
        super(pointer);
    }

    protected native void g_settings_schema_source_list_schemas(
        @Ptr
        long source, boolean recursive,
        @Ptr
        long non_relocatable,
        @Ptr
        long relocatable);

    public void list_schemas(boolean recursive, Pointer non_relocatable, Pointer relocatable) {
        this.g_settings_schema_source_list_schemas(Pointer.pointerTo(this, GSettingsSchemaSource.class), recursive, Pointer.getPeer(non_relocatable), Pointer.getPeer(relocatable));
    }

    @Ptr
    protected native long g_settings_schema_source_lookup(
        @Ptr
        long source,
        @Ptr
        long schema_id, boolean recursive);

    public Pointer<GSettingsSchema> lookup(Pointer schema_id, boolean recursive) {
        return Pointer.pointerToAddress(this.g_settings_schema_source_lookup(Pointer.pointerTo(this, GSettingsSchemaSource.class), Pointer.getPeer(schema_id), recursive), Pointer.class);
    }

    @Ptr
    protected native long g_settings_schema_source_ref(
        @Ptr
        long source);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_settings_schema_source_ref(Pointer.pointerTo(this, GSettingsSchemaSource.class)));
    }

    protected native void g_settings_schema_source_unref(
        @Ptr
        long source);

    public void unref() {
        this.g_settings_schema_source_unref(Pointer.pointerTo(this, GSettingsSchemaSource.class));
    }

    @Ptr
    protected native long g_settings_schema_source_get_default();

    public Pointer get_default() {
        return Pointer.pointerToAddress(this.g_settings_schema_source_get_default());
    }

}
