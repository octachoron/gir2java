
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSettings
    extends GObject
{


    public GSettings() {
        super();
    }

    public GSettings(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_settings_list_relocatable_schemas();

    public Pointer list_relocatable_schemas() {
        return Pointer.pointerToAddress(this.g_settings_list_relocatable_schemas());
    }

    @Ptr
    protected native long g_settings_list_schemas();

    public Pointer list_schemas() {
        return Pointer.pointerToAddress(this.g_settings_list_schemas());
    }

    public native void g_settings_sync();

    protected native void g_settings_unbind(Pointer object,
        @Ptr
        long property);

    public void unbind(Pointer object, Pointer property) {
        this.g_settings_unbind(object, Pointer.getPeer(property));
    }

    protected native void g_settings_apply(
        @Ptr
        long settings);

    public void apply() {
        this.g_settings_apply(Pointer.pointerTo(this, GSettings.class));
    }

    protected native void g_settings_bind_writable(
        @Ptr
        long settings,
        @Ptr
        long key, GObject object,
        @Ptr
        long property, boolean inverted);

    public void bind_writable(Pointer key, GObject object, Pointer property, boolean inverted) {
        this.g_settings_bind_writable(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), object, Pointer.getPeer(property), inverted);
    }

    @Ptr
    protected native long g_settings_create_action(
        @Ptr
        long settings,
        @Ptr
        long key);

    public Pointer<Object> create_action(Pointer key) {
        return Pointer.pointerToAddress(this.g_settings_create_action(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key)), Pointer.class);
    }

    protected native void g_settings_delay(
        @Ptr
        long settings);

    public void delay() {
        this.g_settings_delay(Pointer.pointerTo(this, GSettings.class));
    }

    protected native void g_settings_get(
        @Ptr
        long settings,
        @Ptr
        long key,
        @Ptr
        long format, Object... varargs);

    public void get(Pointer key, Pointer format, Object... varargs) {
        this.g_settings_get(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), Pointer.getPeer(format), varargs);
    }

    protected native boolean g_settings_get_boolean(
        @Ptr
        long settings,
        @Ptr
        long key);

    public boolean get_boolean(Pointer key) {
        return this.g_settings_get_boolean(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_settings_get_child(
        @Ptr
        long settings,
        @Ptr
        long name);

    public Pointer get_child(Pointer name) {
        return Pointer.pointerToAddress(this.g_settings_get_child(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long g_settings_get_default_value(
        @Ptr
        long settings,
        @Ptr
        long key);

    public Pointer<GVariant> get_default_value(Pointer key) {
        return Pointer.pointerToAddress(this.g_settings_get_default_value(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key)), Pointer.class);
    }

    protected native double g_settings_get_double(
        @Ptr
        long settings,
        @Ptr
        long key);

    public double get_double(Pointer key) {
        return this.g_settings_get_double(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key));
    }

    protected native int g_settings_get_enum(
        @Ptr
        long settings,
        @Ptr
        long key);

    public int get_enum(Pointer key) {
        return this.g_settings_get_enum(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key));
    }

    protected native long g_settings_get_flags(
        @Ptr
        long settings,
        @Ptr
        long key);

    public long get_flags(Pointer key) {
        return this.g_settings_get_flags(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key));
    }

    protected native boolean g_settings_get_has_unapplied(
        @Ptr
        long settings);

    public boolean get_has_unapplied() {
        return this.g_settings_get_has_unapplied(Pointer.pointerTo(this, GSettings.class));
    }

    protected native int g_settings_get_int(
        @Ptr
        long settings,
        @Ptr
        long key);

    public int get_int(Pointer key) {
        return this.g_settings_get_int(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_settings_get_range(
        @Ptr
        long settings,
        @Ptr
        long key);

    public Pointer<GVariant> get_range(Pointer key) {
        return Pointer.pointerToAddress(this.g_settings_get_range(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key)), Pointer.class);
    }

    @Ptr
    protected native long g_settings_get_string(
        @Ptr
        long settings,
        @Ptr
        long key);

    public Pointer get_string(Pointer key) {
        return Pointer.pointerToAddress(this.g_settings_get_string(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key)));
    }

    @Ptr
    protected native long g_settings_get_strv(
        @Ptr
        long settings,
        @Ptr
        long key);

    public Pointer get_strv(Pointer key) {
        return Pointer.pointerToAddress(this.g_settings_get_strv(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key)));
    }

    protected native long g_settings_get_uint(
        @Ptr
        long settings,
        @Ptr
        long key);

    public long get_uint(Pointer key) {
        return this.g_settings_get_uint(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_settings_get_user_value(
        @Ptr
        long settings,
        @Ptr
        long key);

    public Pointer<GVariant> get_user_value(Pointer key) {
        return Pointer.pointerToAddress(this.g_settings_get_user_value(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key)), Pointer.class);
    }

    @Ptr
    protected native long g_settings_get_value(
        @Ptr
        long settings,
        @Ptr
        long key);

    public Pointer<GVariant> get_value(Pointer key) {
        return Pointer.pointerToAddress(this.g_settings_get_value(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key)), Pointer.class);
    }

    protected native boolean g_settings_is_writable(
        @Ptr
        long settings,
        @Ptr
        long name);

    public boolean is_writable(Pointer name) {
        return this.g_settings_is_writable(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(name));
    }

    @Ptr
    protected native long g_settings_list_children(
        @Ptr
        long settings);

    public Pointer list_children() {
        return Pointer.pointerToAddress(this.g_settings_list_children(Pointer.pointerTo(this, GSettings.class)));
    }

    @Ptr
    protected native long g_settings_list_keys(
        @Ptr
        long settings);

    public Pointer list_keys() {
        return Pointer.pointerToAddress(this.g_settings_list_keys(Pointer.pointerTo(this, GSettings.class)));
    }

    protected native boolean g_settings_range_check(
        @Ptr
        long settings,
        @Ptr
        long key,
        @Ptr
        long value);

    public boolean range_check(Pointer key, Pointer<GVariant> value) {
        return this.g_settings_range_check(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected native void g_settings_reset(
        @Ptr
        long settings,
        @Ptr
        long key);

    public void reset(Pointer key) {
        this.g_settings_reset(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key));
    }

    protected native void g_settings_revert(
        @Ptr
        long settings);

    public void revert() {
        this.g_settings_revert(Pointer.pointerTo(this, GSettings.class));
    }

    protected native boolean g_settings_set(
        @Ptr
        long settings,
        @Ptr
        long key,
        @Ptr
        long format, Object... varargs);

    public boolean set(Pointer key, Pointer format, Object... varargs) {
        return this.g_settings_set(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), Pointer.getPeer(format), varargs);
    }

    protected native boolean g_settings_set_boolean(
        @Ptr
        long settings,
        @Ptr
        long key, boolean value);

    public boolean set_boolean(Pointer key, boolean value) {
        return this.g_settings_set_boolean(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), value);
    }

    protected native boolean g_settings_set_double(
        @Ptr
        long settings,
        @Ptr
        long key, double value);

    public boolean set_double(Pointer key, double value) {
        return this.g_settings_set_double(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), value);
    }

    protected native boolean g_settings_set_enum(
        @Ptr
        long settings,
        @Ptr
        long key, int value);

    public boolean set_enum(Pointer key, int value) {
        return this.g_settings_set_enum(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), value);
    }

    protected native boolean g_settings_set_flags(
        @Ptr
        long settings,
        @Ptr
        long key, long value);

    public boolean set_flags(Pointer key, long value) {
        return this.g_settings_set_flags(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), value);
    }

    protected native boolean g_settings_set_int(
        @Ptr
        long settings,
        @Ptr
        long key, int value);

    public boolean set_int(Pointer key, int value) {
        return this.g_settings_set_int(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), value);
    }

    protected native boolean g_settings_set_string(
        @Ptr
        long settings,
        @Ptr
        long key,
        @Ptr
        long value);

    public boolean set_string(Pointer key, Pointer value) {
        return this.g_settings_set_string(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected native boolean g_settings_set_strv(
        @Ptr
        long settings,
        @Ptr
        long key,
        @Ptr
        long value);

    public boolean set_strv(Pointer key, Pointer value) {
        return this.g_settings_set_strv(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected native boolean g_settings_set_uint(
        @Ptr
        long settings,
        @Ptr
        long key, long value);

    public boolean set_uint(Pointer key, long value) {
        return this.g_settings_set_uint(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), value);
    }

    protected native boolean g_settings_set_value(
        @Ptr
        long settings,
        @Ptr
        long key,
        @Ptr
        long value);

    public boolean set_value(Pointer key, Pointer<GVariant> value) {
        return this.g_settings_set_value(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSettings field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSettings field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native void g_settings_bind_with_mapping(
        @Ptr
        long settings,
        @Ptr
        long key, GObject object,
        @Ptr
        long property, Object flags, Object get_mapping, Object set_mapping, Pointer user_data, Object destroy);

    public void bind_with_mapping(Pointer key, GObject object, Pointer property, Object flags, Object get_mapping, Object set_mapping, Pointer user_data, Object destroy) {
        this.g_settings_bind_with_mapping(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), object, Pointer.getPeer(property), flags, get_mapping, set_mapping, user_data, destroy);
    }

    protected native Pointer g_settings_get_mapped(
        @Ptr
        long settings,
        @Ptr
        long key, Object mapping, Pointer user_data);

    public Pointer get_mapped(Pointer key, Object mapping, Pointer user_data) {
        return this.g_settings_get_mapped(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), mapping, user_data);
    }

    protected native void g_settings_bind(
        @Ptr
        long settings,
        @Ptr
        long key, GObject object,
        @Ptr
        long property, Object flags);

    public void bind(Pointer key, GObject object, Pointer property, Object flags) {
        this.g_settings_bind(Pointer.pointerTo(this, GSettings.class), Pointer.getPeer(key), object, Pointer.getPeer(property), flags);
    }

}