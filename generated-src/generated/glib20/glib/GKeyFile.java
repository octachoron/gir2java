
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GKeyFile
    extends StructObject
{


    public GKeyFile() {
        super();
    }

    public GKeyFile(Pointer pointer) {
        super(pointer);
    }

    protected native void g_key_file_free(
        @Ptr
        long key_file);

    public void free() {
        this.g_key_file_free(Pointer.pointerTo(this, GKeyFile.class));
    }

    protected native boolean g_key_file_get_boolean(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public boolean get_boolean(Pointer group_name, Pointer key) {
        return this.g_key_file_get_boolean(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_key_file_get_boolean_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long length);

    public boolean get_boolean_list(Pointer group_name, Pointer key, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_get_boolean_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(length)), Boolean.class);
    }

    @Ptr
    protected native long g_key_file_get_comment(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public Pointer get_comment(Pointer group_name, Pointer key) {
        return Pointer.pointerToAddress(this.g_key_file_get_comment(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key)));
    }

    protected native double g_key_file_get_double(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public double get_double(Pointer group_name, Pointer key) {
        return this.g_key_file_get_double(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_key_file_get_double_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long length);

    public double get_double_list(Pointer group_name, Pointer key, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_get_double_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(length)), Double.class);
    }

    @Ptr
    protected native long g_key_file_get_groups(
        @Ptr
        long key_file,
        @Ptr
        long length);

    public Pointer get_groups(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_get_groups(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(length)));
    }

    protected native long g_key_file_get_int64(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public long get_int64(Pointer group_name, Pointer key) {
        return this.g_key_file_get_int64(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    protected native int g_key_file_get_integer(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public int get_integer(Pointer group_name, Pointer key) {
        return this.g_key_file_get_integer(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_key_file_get_integer_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long length);

    public int get_integer_list(Pointer group_name, Pointer key, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_get_integer_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(length)), Integer.class);
    }

    @Ptr
    protected native long g_key_file_get_keys(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long length);

    public Pointer get_keys(Pointer group_name, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_get_keys(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_key_file_get_locale_string(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long locale);

    public Pointer get_locale_string(Pointer group_name, Pointer key, Pointer locale) {
        return Pointer.pointerToAddress(this.g_key_file_get_locale_string(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(locale)));
    }

    @Ptr
    protected native long g_key_file_get_locale_string_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long locale,
        @Ptr
        long length);

    public Pointer get_locale_string_list(Pointer group_name, Pointer key, Pointer locale, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_get_locale_string_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(locale), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_key_file_get_start_group(
        @Ptr
        long key_file);

    public Pointer get_start_group() {
        return Pointer.pointerToAddress(this.g_key_file_get_start_group(Pointer.pointerTo(this, GKeyFile.class)));
    }

    @Ptr
    protected native long g_key_file_get_string(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public Pointer get_string(Pointer group_name, Pointer key) {
        return Pointer.pointerToAddress(this.g_key_file_get_string(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key)));
    }

    @Ptr
    protected native long g_key_file_get_string_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long length);

    public Pointer get_string_list(Pointer group_name, Pointer key, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_get_string_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(length)));
    }

    protected native long g_key_file_get_uint64(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public long get_uint64(Pointer group_name, Pointer key) {
        return this.g_key_file_get_uint64(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_key_file_get_value(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public Pointer get_value(Pointer group_name, Pointer key) {
        return Pointer.pointerToAddress(this.g_key_file_get_value(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key)));
    }

    protected native boolean g_key_file_has_group(
        @Ptr
        long key_file,
        @Ptr
        long group_name);

    public boolean has_group(Pointer group_name) {
        return this.g_key_file_has_group(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name));
    }

    protected native boolean g_key_file_has_key(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public boolean has_key(Pointer group_name, Pointer key) {
        return this.g_key_file_has_key(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_key_file_ref(
        @Ptr
        long key_file);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_key_file_ref(Pointer.pointerTo(this, GKeyFile.class)));
    }

    protected native boolean g_key_file_remove_comment(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public boolean remove_comment(Pointer group_name, Pointer key) {
        return this.g_key_file_remove_comment(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    protected native boolean g_key_file_remove_group(
        @Ptr
        long key_file,
        @Ptr
        long group_name);

    public boolean remove_group(Pointer group_name) {
        return this.g_key_file_remove_group(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name));
    }

    protected native boolean g_key_file_remove_key(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key);

    public boolean remove_key(Pointer group_name, Pointer key) {
        return this.g_key_file_remove_key(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key));
    }

    protected native boolean g_key_file_save_to_file(
        @Ptr
        long key_file,
        @Ptr
        long filename);

    public boolean save_to_file(Pointer filename) {
        return this.g_key_file_save_to_file(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(filename));
    }

    protected native void g_key_file_set_boolean(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key, boolean value);

    public void set_boolean(Pointer group_name, Pointer key, boolean value) {
        this.g_key_file_set_boolean(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), value);
    }

    protected native void g_key_file_set_boolean_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long list, long length);

    public void set_boolean_list(Pointer group_name, Pointer key, boolean list, long length) {
        this.g_key_file_set_boolean_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(list), length);
    }

    protected native boolean g_key_file_set_comment(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long comment);

    public boolean set_comment(Pointer group_name, Pointer key, Pointer comment) {
        return this.g_key_file_set_comment(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(comment));
    }

    protected native void g_key_file_set_double(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key, double value);

    public void set_double(Pointer group_name, Pointer key, double value) {
        this.g_key_file_set_double(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), value);
    }

    protected native void g_key_file_set_double_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long list, long length);

    public void set_double_list(Pointer group_name, Pointer key, double list, long length) {
        this.g_key_file_set_double_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(list), length);
    }

    protected native void g_key_file_set_int64(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key, long value);

    public void set_int64(Pointer group_name, Pointer key, long value) {
        this.g_key_file_set_int64(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), value);
    }

    protected native void g_key_file_set_integer(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key, int value);

    public void set_integer(Pointer group_name, Pointer key, int value) {
        this.g_key_file_set_integer(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), value);
    }

    protected native void g_key_file_set_integer_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long list, long length);

    public void set_integer_list(Pointer group_name, Pointer key, int list, long length) {
        this.g_key_file_set_integer_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(list), length);
    }

    protected native void g_key_file_set_list_separator(
        @Ptr
        long key_file, char separator);

    public void set_list_separator(char separator) {
        this.g_key_file_set_list_separator(Pointer.pointerTo(this, GKeyFile.class), separator);
    }

    protected native void g_key_file_set_locale_string(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long locale,
        @Ptr
        long string);

    public void set_locale_string(Pointer group_name, Pointer key, Pointer locale, Pointer string) {
        this.g_key_file_set_locale_string(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(locale), Pointer.getPeer(string));
    }

    protected native void g_key_file_set_locale_string_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long locale,
        @Ptr
        long list, long length);

    public void set_locale_string_list(Pointer group_name, Pointer key, Pointer locale, Pointer list, long length) {
        this.g_key_file_set_locale_string_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(locale), Pointer.getPeer(list), length);
    }

    protected native void g_key_file_set_string(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long string);

    public void set_string(Pointer group_name, Pointer key, Pointer string) {
        this.g_key_file_set_string(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(string));
    }

    protected native void g_key_file_set_string_list(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long list, long length);

    public void set_string_list(Pointer group_name, Pointer key, Pointer list, long length) {
        this.g_key_file_set_string_list(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(list), length);
    }

    protected native void g_key_file_set_uint64(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key, long value);

    public void set_uint64(Pointer group_name, Pointer key, long value) {
        this.g_key_file_set_uint64(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), value);
    }

    protected native void g_key_file_set_value(
        @Ptr
        long key_file,
        @Ptr
        long group_name,
        @Ptr
        long key,
        @Ptr
        long value);

    public void set_value(Pointer group_name, Pointer key, Pointer value) {
        this.g_key_file_set_value(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(group_name), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_key_file_to_data(
        @Ptr
        long key_file,
        @Ptr
        long length);

    public Pointer to_data(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_key_file_to_data(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(length)));
    }

    protected native void g_key_file_unref(
        @Ptr
        long key_file);

    public void unref() {
        this.g_key_file_unref(Pointer.pointerTo(this, GKeyFile.class));
    }

    public native Object g_key_file_error_quark();

    protected native boolean g_key_file_load_from_file(
        @Ptr
        long key_file,
        @Ptr
        long file, Object flags);

    public boolean load_from_file(Pointer file, Object flags) {
        return this.g_key_file_load_from_file(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(file), flags);
    }

    protected native boolean g_key_file_load_from_data(
        @Ptr
        long key_file,
        @Ptr
        long data, long length, Object flags);

    public boolean load_from_data(Pointer data, long length, Object flags) {
        return this.g_key_file_load_from_data(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(data), length, flags);
    }

    protected native boolean g_key_file_load_from_data_dirs(
        @Ptr
        long key_file,
        @Ptr
        long file,
        @Ptr
        long full_path, Object flags);

    public boolean load_from_data_dirs(Pointer file, Pointer full_path, Object flags) {
        return this.g_key_file_load_from_data_dirs(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(file), Pointer.getPeer(full_path), flags);
    }

    protected native boolean g_key_file_load_from_dirs(
        @Ptr
        long key_file,
        @Ptr
        long file,
        @Ptr
        long search_dirs,
        @Ptr
        long full_path, Object flags);

    public boolean load_from_dirs(Pointer file, Pointer search_dirs, Pointer full_path, Object flags) {
        return this.g_key_file_load_from_dirs(Pointer.pointerTo(this, GKeyFile.class), Pointer.getPeer(file), Pointer.getPeer(search_dirs), Pointer.getPeer(full_path), flags);
    }

}
