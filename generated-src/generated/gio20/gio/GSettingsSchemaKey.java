
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSettingsSchemaKey
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSettingsSchemaKey() {
        super();
    }

    public GSettingsSchemaKey(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_settings_schema_key_get_default_value(
        @Ptr
        long key);

    public Pointer<GVariant> get_default_value() {
        return Pointer.pointerToAddress(this.g_settings_schema_key_get_default_value(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer()), GVariant.class);
    }

    @Ptr
    protected native long g_settings_schema_key_get_description(
        @Ptr
        long key);

    public Pointer get_description() {
        return Pointer.pointerToAddress(this.g_settings_schema_key_get_description(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer()));
    }

    @Ptr
    protected native long g_settings_schema_key_get_range(
        @Ptr
        long key);

    public Pointer<GVariant> get_range() {
        return Pointer.pointerToAddress(this.g_settings_schema_key_get_range(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer()), GVariant.class);
    }

    @Ptr
    protected native long g_settings_schema_key_get_summary(
        @Ptr
        long key);

    public Pointer get_summary() {
        return Pointer.pointerToAddress(this.g_settings_schema_key_get_summary(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer()));
    }

    @Ptr
    protected native long g_settings_schema_key_get_value_type(
        @Ptr
        long key);

    public Pointer<GVariantType> get_value_type() {
        return Pointer.pointerToAddress(this.g_settings_schema_key_get_value_type(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer()), GVariantType.class);
    }

    protected native boolean g_settings_schema_key_range_check(
        @Ptr
        long key,
        @Ptr
        long value);

    public boolean range_check(Pointer<GVariant> value) {
        return this.g_settings_schema_key_range_check(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer(), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_settings_schema_key_ref(
        @Ptr
        long key);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_settings_schema_key_ref(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer()));
    }

    protected native void g_settings_schema_key_unref(
        @Ptr
        long key);

    public void unref() {
        this.g_settings_schema_key_unref(Pointer.pointerTo(this, GSettingsSchemaKey.class).getPeer());
    }

}
