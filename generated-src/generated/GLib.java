
package generated;

import generated.glib20.glib.GBytes;
import generated.glib20.glib.GChecksumType;
import generated.glib20.glib.GData;
import generated.glib20.glib.GDate;
import generated.glib20.glib.GDateMonth;
import generated.glib20.glib.GDateWeekday;
import generated.glib20.glib.GDebugKey;
import generated.glib20.glib.GError;
import generated.glib20.glib.GFileError;
import generated.glib20.glib.GHashTable;
import generated.glib20.glib.GHook;
import generated.glib20.glib.GHookList;
import generated.glib20.glib.GIConv;
import generated.glib20.glib.GIOChannel;
import generated.glib20.glib.GIOChannelError;
import generated.glib20.glib.GMainContext;
import generated.glib20.glib.GMemVTable;
import generated.glib20.glib.GNormalizeMode;
import generated.glib20.glib.GPatternSpec;
import generated.glib20.glib.GPollFD;
import generated.glib20.glib.GSequenceIter;
import generated.glib20.glib.GSliceConfig;
import generated.glib20.glib.GSource;
import generated.glib20.glib.GSourceFuncs;
import generated.glib20.glib.GString;
import generated.glib20.glib.GTestCase;
import generated.glib20.glib.GTestFileType;
import generated.glib20.glib.GTestLogType;
import generated.glib20.glib.GTestSuite;
import generated.glib20.glib.GThread;
import generated.glib20.glib.GTimeVal;
import generated.glib20.glib.GTrashStack;
import generated.glib20.glib.GUnicodeBreakType;
import generated.glib20.glib.GUnicodeScript;
import generated.glib20.glib.GUnicodeType;
import generated.glib20.glib.GUserDirectory;
import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GLib {


    protected native int g_access(
        @Ptr
        long filename, int mode);

    public int access(Pointer filename, int mode) {
        return this.g_access(Pointer.getPeer(filename), mode);
    }

    public native int g_ascii_digit_value(char c);

    @Ptr
    protected native long g_ascii_dtostr(
        @Ptr
        long buffer, int buf_len, double d);

    public Pointer ascii_dtostr(Pointer buffer, int buf_len, double d) {
        return Pointer.pointerToAddress(this.g_ascii_dtostr(Pointer.getPeer(buffer), buf_len, d));
    }

    @Ptr
    protected native long g_ascii_formatd(
        @Ptr
        long buffer, int buf_len,
        @Ptr
        long format, double d);

    public Pointer ascii_formatd(Pointer buffer, int buf_len, Pointer format, double d) {
        return Pointer.pointerToAddress(this.g_ascii_formatd(Pointer.getPeer(buffer), buf_len, Pointer.getPeer(format), d));
    }

    protected native int g_ascii_strcasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2);

    public int ascii_strcasecmp(Pointer s1, Pointer s2) {
        return this.g_ascii_strcasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2));
    }

    @Ptr
    protected native long g_ascii_strdown(
        @Ptr
        long str, long len);

    public Pointer ascii_strdown(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_ascii_strdown(Pointer.getPeer(str), len));
    }

    protected native int g_ascii_strncasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2, long n);

    public int ascii_strncasecmp(Pointer s1, Pointer s2, long n) {
        return this.g_ascii_strncasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2), n);
    }

    protected native double g_ascii_strtod(
        @Ptr
        long nptr,
        @Ptr
        long endptr);

    public double ascii_strtod(Pointer nptr, Pointer endptr) {
        return this.g_ascii_strtod(Pointer.getPeer(nptr), Pointer.getPeer(endptr));
    }

    protected native long g_ascii_strtoll(
        @Ptr
        long nptr,
        @Ptr
        long endptr, long base);

    public long ascii_strtoll(Pointer nptr, Pointer endptr, long base) {
        return this.g_ascii_strtoll(Pointer.getPeer(nptr), Pointer.getPeer(endptr), base);
    }

    protected native long g_ascii_strtoull(
        @Ptr
        long nptr,
        @Ptr
        long endptr, long base);

    public long ascii_strtoull(Pointer nptr, Pointer endptr, long base) {
        return this.g_ascii_strtoull(Pointer.getPeer(nptr), Pointer.getPeer(endptr), base);
    }

    @Ptr
    protected native long g_ascii_strup(
        @Ptr
        long str, long len);

    public Pointer ascii_strup(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_ascii_strup(Pointer.getPeer(str), len));
    }

    public native char g_ascii_tolower(char c);

    public native char g_ascii_toupper(char c);

    public native int g_ascii_xdigit_value(char c);

    protected native void g_assert_warning(
        @Ptr
        long log_domain,
        @Ptr
        long file, int line,
        @Ptr
        long pretty_function,
        @Ptr
        long expression);

    public void assert_warning(Pointer log_domain, Pointer file, int line, Pointer pretty_function, Pointer expression) {
        this.g_assert_warning(Pointer.getPeer(log_domain), Pointer.getPeer(file), line, Pointer.getPeer(pretty_function), Pointer.getPeer(expression));
    }

    protected native void g_assertion_message(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long message);

    public void assertion_message(Pointer domain, Pointer file, int line, Pointer func, Pointer message) {
        this.g_assertion_message(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(message));
    }

    protected native void g_assertion_message_cmpstr(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long expr,
        @Ptr
        long arg1,
        @Ptr
        long cmp,
        @Ptr
        long arg2);

    public void assertion_message_cmpstr(Pointer domain, Pointer file, int line, Pointer func, Pointer expr, Pointer arg1, Pointer cmp, Pointer arg2) {
        this.g_assertion_message_cmpstr(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(expr), Pointer.getPeer(arg1), Pointer.getPeer(cmp), Pointer.getPeer(arg2));
    }

    protected native void g_assertion_message_error(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long expr,
        @Ptr
        long error, Object error_domain, int error_code);

    public void assertion_message_error(Pointer domain, Pointer file, int line, Pointer func, Pointer expr, Pointer<GError> error, Object error_domain, int error_code) {
        this.g_assertion_message_error(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(expr), Pointer.getPeer(error), error_domain, error_code);
    }

    protected native void g_assertion_message_expr(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long expr);

    public void assertion_message_expr(Pointer domain, Pointer file, int line, Pointer func, Pointer expr) {
        this.g_assertion_message_expr(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(expr));
    }

    public native void g_atexit(Object func);

    protected native int g_atomic_int_add(
        @Ptr
        long atomic, int val);

    public int atomic_int_add(Pointer<Integer> atomic, int val) {
        return this.g_atomic_int_add(Pointer.getPeer(atomic), val);
    }

    protected native long g_atomic_int_and(
        @Ptr
        long atomic, long val);

    public long atomic_int_and(Pointer<Long> atomic, long val) {
        return this.g_atomic_int_and(Pointer.getPeer(atomic), val);
    }

    protected native boolean g_atomic_int_compare_and_exchange(
        @Ptr
        long atomic, int oldval, int newval);

    public boolean atomic_int_compare_and_exchange(Pointer<Integer> atomic, int oldval, int newval) {
        return this.g_atomic_int_compare_and_exchange(Pointer.getPeer(atomic), oldval, newval);
    }

    protected native boolean g_atomic_int_dec_and_test(
        @Ptr
        long atomic);

    public boolean atomic_int_dec_and_test(Pointer<Integer> atomic) {
        return this.g_atomic_int_dec_and_test(Pointer.getPeer(atomic));
    }

    protected native int g_atomic_int_exchange_and_add(
        @Ptr
        long atomic, int val);

    public int atomic_int_exchange_and_add(Pointer<Integer> atomic, int val) {
        return this.g_atomic_int_exchange_and_add(Pointer.getPeer(atomic), val);
    }

    protected native int g_atomic_int_get(
        @Ptr
        long atomic);

    public int atomic_int_get(Pointer<Integer> atomic) {
        return this.g_atomic_int_get(Pointer.getPeer(atomic));
    }

    protected native void g_atomic_int_inc(
        @Ptr
        long atomic);

    public void atomic_int_inc(Pointer<Integer> atomic) {
        this.g_atomic_int_inc(Pointer.getPeer(atomic));
    }

    protected native long g_atomic_int_or(
        @Ptr
        long atomic, long val);

    public long atomic_int_or(Pointer<Long> atomic, long val) {
        return this.g_atomic_int_or(Pointer.getPeer(atomic), val);
    }

    protected native void g_atomic_int_set(
        @Ptr
        long atomic, int newval);

    public void atomic_int_set(Pointer<Integer> atomic, int newval) {
        this.g_atomic_int_set(Pointer.getPeer(atomic), newval);
    }

    protected native long g_atomic_int_xor(
        @Ptr
        long atomic, long val);

    public long atomic_int_xor(Pointer<Long> atomic, long val) {
        return this.g_atomic_int_xor(Pointer.getPeer(atomic), val);
    }

    public native long g_atomic_pointer_add(Pointer atomic, long val);

    public native long g_atomic_pointer_and(Pointer atomic, long val);

    public native boolean g_atomic_pointer_compare_and_exchange(Pointer atomic, Pointer oldval, Pointer newval);

    public native Pointer g_atomic_pointer_get(Pointer atomic);

    public native long g_atomic_pointer_or(Pointer atomic, long val);

    public native void g_atomic_pointer_set(Pointer atomic, Pointer newval);

    public native long g_atomic_pointer_xor(Pointer atomic, long val);

    @Ptr
    protected native long g_base64_decode(
        @Ptr
        long text,
        @Ptr
        long out_len);

    public short base64_decode(Pointer text, Pointer<Long> out_len) {
        return Pointer.pointerToAddress(this.g_base64_decode(Pointer.getPeer(text), Pointer.getPeer(out_len)), Short.class);
    }

    @Ptr
    protected native long g_base64_decode_inplace(
        @Ptr
        long text,
        @Ptr
        long out_len);

    public Pointer<Short> base64_decode_inplace(short text, Pointer<Long> out_len) {
        return Pointer.pointerToAddress(this.g_base64_decode_inplace(Pointer.getPeer(text), Pointer.getPeer(out_len)), Pointer.class);
    }

    protected native long g_base64_decode_step(
        @Ptr
        long in, long len,
        @Ptr
        long out,
        @Ptr
        long state,
        @Ptr
        long save);

    public long base64_decode_step(short in, long len, short out, Pointer<Integer> state, Pointer<Long> save) {
        return this.g_base64_decode_step(Pointer.getPeer(in), len, Pointer.getPeer(out), Pointer.getPeer(state), Pointer.getPeer(save));
    }

    @Ptr
    protected native long g_base64_encode(
        @Ptr
        long data, long len);

    public Pointer base64_encode(short data, long len) {
        return Pointer.pointerToAddress(this.g_base64_encode(Pointer.getPeer(data), len));
    }

    protected native long g_base64_encode_close(boolean break_lines,
        @Ptr
        long out,
        @Ptr
        long state,
        @Ptr
        long save);

    public long base64_encode_close(boolean break_lines, short out, Pointer<Integer> state, Pointer<Integer> save) {
        return this.g_base64_encode_close(break_lines, Pointer.getPeer(out), Pointer.getPeer(state), Pointer.getPeer(save));
    }

    protected native long g_base64_encode_step(
        @Ptr
        long in, long len, boolean break_lines,
        @Ptr
        long out,
        @Ptr
        long state,
        @Ptr
        long save);

    public long base64_encode_step(short in, long len, boolean break_lines, short out, Pointer<Integer> state, Pointer<Integer> save) {
        return this.g_base64_encode_step(Pointer.getPeer(in), len, break_lines, Pointer.getPeer(out), Pointer.getPeer(state), Pointer.getPeer(save));
    }

    @Ptr
    protected native long g_basename(
        @Ptr
        long file_name);

    public Pointer basename(Pointer file_name) {
        return Pointer.pointerToAddress(this.g_basename(Pointer.getPeer(file_name)));
    }

    protected native void g_bit_lock(
        @Ptr
        long address, int lock_bit);

    public void bit_lock(Pointer<Integer> address, int lock_bit) {
        this.g_bit_lock(Pointer.getPeer(address), lock_bit);
    }

    public native int g_bit_nth_lsf(long mask, int nth_bit);

    public native int g_bit_nth_msf(long mask, int nth_bit);

    public native long g_bit_storage(long number);

    protected native boolean g_bit_trylock(
        @Ptr
        long address, int lock_bit);

    public boolean bit_trylock(Pointer<Integer> address, int lock_bit) {
        return this.g_bit_trylock(Pointer.getPeer(address), lock_bit);
    }

    protected native void g_bit_unlock(
        @Ptr
        long address, int lock_bit);

    public void bit_unlock(Pointer<Integer> address, int lock_bit) {
        this.g_bit_unlock(Pointer.getPeer(address), lock_bit);
    }

    public native Object g_bookmark_file_error_quark();

    @Ptr
    protected native long g_build_filename(
        @Ptr
        long first_element, Object... varargs);

    public Pointer build_filename(Pointer first_element, Object... varargs) {
        return Pointer.pointerToAddress(this.g_build_filename(Pointer.getPeer(first_element), varargs));
    }

    @Ptr
    protected native long g_build_filenamev(
        @Ptr
        long args);

    public Pointer build_filenamev(Pointer args) {
        return Pointer.pointerToAddress(this.g_build_filenamev(Pointer.getPeer(args)));
    }

    @Ptr
    protected native long g_build_path(
        @Ptr
        long separator,
        @Ptr
        long first_element, Object... varargs);

    public Pointer build_path(Pointer separator, Pointer first_element, Object... varargs) {
        return Pointer.pointerToAddress(this.g_build_path(Pointer.getPeer(separator), Pointer.getPeer(first_element), varargs));
    }

    @Ptr
    protected native long g_build_pathv(
        @Ptr
        long separator,
        @Ptr
        long args);

    public Pointer build_pathv(Pointer separator, Pointer args) {
        return Pointer.pointerToAddress(this.g_build_pathv(Pointer.getPeer(separator), Pointer.getPeer(args)));
    }

    @Ptr
    protected native long g_byte_array_free(
        @Ptr
        long array, boolean free_segment);

    public Pointer<Short> byte_array_free(short array, boolean free_segment) {
        return Pointer.pointerToAddress(this.g_byte_array_free(Pointer.getPeer(array), free_segment), Pointer.class);
    }

    @Ptr
    protected native long g_byte_array_free_to_bytes(
        @Ptr
        long array);

    public Pointer<GBytes> byte_array_free_to_bytes(short array) {
        return Pointer.pointerToAddress(this.g_byte_array_free_to_bytes(Pointer.getPeer(array)), Pointer.class);
    }

    @Ptr
    protected native long g_byte_array_new();

    public short byte_array_new() {
        return Pointer.pointerToAddress(this.g_byte_array_new(), Short.class);
    }

    @Ptr
    protected native long g_byte_array_new_take(
        @Ptr
        long data, long len);

    public short byte_array_new_take(short data, long len) {
        return Pointer.pointerToAddress(this.g_byte_array_new_take(Pointer.getPeer(data), len), Short.class);
    }

    protected native void g_byte_array_unref(
        @Ptr
        long array);

    public void byte_array_unref(short array) {
        this.g_byte_array_unref(Pointer.getPeer(array));
    }

    protected native int g_chdir(
        @Ptr
        long path);

    public int chdir(Pointer path) {
        return this.g_chdir(Pointer.getPeer(path));
    }

    @Ptr
    protected native long glib_check_version(long required_major, long required_minor, long required_micro);

    public Pointer check_version(long required_major, long required_minor, long required_micro) {
        return Pointer.pointerToAddress(this.glib_check_version(required_major, required_minor, required_micro));
    }

    public native long g_checksum_type_get_length(IntValuedEnum<GChecksumType> checksum_type);

    public native long g_child_watch_add(Object pid, Object function, Pointer data);

    public native long g_child_watch_add_full(int priority, Object pid, Object function, Pointer data, Object notify);

    @Ptr
    protected native long g_child_watch_source_new(Object pid);

    public Pointer<GSource> child_watch_source_new(Object pid) {
        return Pointer.pointerToAddress(this.g_child_watch_source_new(pid), Pointer.class);
    }

    public native void g_clear_error();

    public native void g_clear_pointer(Pointer pp, Object destroy);

    public native boolean g_close(int fd);

    @Ptr
    protected native long g_compute_checksum_for_bytes(IntValuedEnum<GChecksumType> checksum_type,
        @Ptr
        long data);

    public Pointer compute_checksum_for_bytes(IntValuedEnum<GChecksumType> checksum_type, Pointer<GBytes> data) {
        return Pointer.pointerToAddress(this.g_compute_checksum_for_bytes(checksum_type, Pointer.getPeer(data)));
    }

    @Ptr
    protected native long g_compute_checksum_for_data(IntValuedEnum<GChecksumType> checksum_type,
        @Ptr
        long data, long length);

    public Pointer compute_checksum_for_data(IntValuedEnum<GChecksumType> checksum_type, short data, long length) {
        return Pointer.pointerToAddress(this.g_compute_checksum_for_data(checksum_type, Pointer.getPeer(data), length));
    }

    @Ptr
    protected native long g_compute_checksum_for_string(IntValuedEnum<GChecksumType> checksum_type,
        @Ptr
        long str, long length);

    public Pointer compute_checksum_for_string(IntValuedEnum<GChecksumType> checksum_type, Pointer str, long length) {
        return Pointer.pointerToAddress(this.g_compute_checksum_for_string(checksum_type, Pointer.getPeer(str), length));
    }

    @Ptr
    protected native long g_compute_hmac_for_data(IntValuedEnum<GChecksumType> digest_type,
        @Ptr
        long key, long key_len,
        @Ptr
        long data, long length);

    public Pointer compute_hmac_for_data(IntValuedEnum<GChecksumType> digest_type, short key, long key_len, Pointer<Short> data, long length) {
        return Pointer.pointerToAddress(this.g_compute_hmac_for_data(digest_type, Pointer.getPeer(key), key_len, Pointer.getPeer(data), length));
    }

    @Ptr
    protected native long g_compute_hmac_for_string(IntValuedEnum<GChecksumType> digest_type,
        @Ptr
        long key, long key_len,
        @Ptr
        long str, long length);

    public Pointer compute_hmac_for_string(IntValuedEnum<GChecksumType> digest_type, short key, long key_len, Pointer str, long length) {
        return Pointer.pointerToAddress(this.g_compute_hmac_for_string(digest_type, Pointer.getPeer(key), key_len, Pointer.getPeer(str), length));
    }

    @Ptr
    protected native long g_convert(
        @Ptr
        long str, long len,
        @Ptr
        long to_codeset,
        @Ptr
        long from_codeset,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public Pointer convert(Pointer str, long len, Pointer to_codeset, Pointer from_codeset, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(this.g_convert(Pointer.getPeer(str), len, Pointer.getPeer(to_codeset), Pointer.getPeer(from_codeset), Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    public native Object g_convert_error_quark();

    @Ptr
    protected native long g_convert_with_fallback(
        @Ptr
        long str, long len,
        @Ptr
        long to_codeset,
        @Ptr
        long from_codeset,
        @Ptr
        long fallback,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public Pointer convert_with_fallback(Pointer str, long len, Pointer to_codeset, Pointer from_codeset, Pointer fallback, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(this.g_convert_with_fallback(Pointer.getPeer(str), len, Pointer.getPeer(to_codeset), Pointer.getPeer(from_codeset), Pointer.getPeer(fallback), Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    @Ptr
    protected native long g_convert_with_iconv(
        @Ptr
        long str, long len, GIConv converter,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public Pointer convert_with_iconv(Pointer str, long len, GIConv converter, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(this.g_convert_with_iconv(Pointer.getPeer(str), len, converter, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    protected native void g_datalist_clear(
        @Ptr
        long datalist);

    public void datalist_clear(Pointer<Pointer<GData>> datalist) {
        this.g_datalist_clear(Pointer.getPeer(datalist));
    }

    protected native void g_datalist_foreach(
        @Ptr
        long datalist, Object func, Pointer user_data);

    public void datalist_foreach(Pointer<Pointer<GData>> datalist, Object func, Pointer user_data) {
        this.g_datalist_foreach(Pointer.getPeer(datalist), func, user_data);
    }

    protected native Pointer g_datalist_get_data(
        @Ptr
        long datalist,
        @Ptr
        long key);

    public Pointer datalist_get_data(Pointer<Pointer<GData>> datalist, Pointer key) {
        return this.g_datalist_get_data(Pointer.getPeer(datalist), Pointer.getPeer(key));
    }

    protected native long g_datalist_get_flags(
        @Ptr
        long datalist);

    public long datalist_get_flags(Pointer<Pointer<GData>> datalist) {
        return this.g_datalist_get_flags(Pointer.getPeer(datalist));
    }

    protected native Pointer g_datalist_id_dup_data(
        @Ptr
        long datalist, Object key_id, Object dup_func, Pointer user_data);

    public Pointer datalist_id_dup_data(Pointer<Pointer<GData>> datalist, Object key_id, Object dup_func, Pointer user_data) {
        return this.g_datalist_id_dup_data(Pointer.getPeer(datalist), key_id, dup_func, user_data);
    }

    protected native Pointer g_datalist_id_get_data(
        @Ptr
        long datalist, Object key_id);

    public Pointer datalist_id_get_data(Pointer<Pointer<GData>> datalist, Object key_id) {
        return this.g_datalist_id_get_data(Pointer.getPeer(datalist), key_id);
    }

    protected native Pointer g_datalist_id_remove_no_notify(
        @Ptr
        long datalist, Object key_id);

    public Pointer datalist_id_remove_no_notify(Pointer<Pointer<GData>> datalist, Object key_id) {
        return this.g_datalist_id_remove_no_notify(Pointer.getPeer(datalist), key_id);
    }

    protected native boolean g_datalist_id_replace_data(
        @Ptr
        long datalist, Object key_id, Pointer oldval, Pointer newval, Object destroy,
        @Ptr
        long old_destroy);

    public boolean datalist_id_replace_data(Pointer<Pointer<GData>> datalist, Object key_id, Pointer oldval, Pointer newval, Object destroy, Pointer<Object> old_destroy) {
        return this.g_datalist_id_replace_data(Pointer.getPeer(datalist), key_id, oldval, newval, destroy, Pointer.getPeer(old_destroy));
    }

    protected native void g_datalist_id_set_data_full(
        @Ptr
        long datalist, Object key_id, Pointer data, Object destroy_func);

    public void datalist_id_set_data_full(Pointer<Pointer<GData>> datalist, Object key_id, Pointer data, Object destroy_func) {
        this.g_datalist_id_set_data_full(Pointer.getPeer(datalist), key_id, data, destroy_func);
    }

    protected native void g_datalist_init(
        @Ptr
        long datalist);

    public void datalist_init(Pointer<Pointer<GData>> datalist) {
        this.g_datalist_init(Pointer.getPeer(datalist));
    }

    protected native void g_datalist_set_flags(
        @Ptr
        long datalist, long flags);

    public void datalist_set_flags(Pointer<Pointer<GData>> datalist, long flags) {
        this.g_datalist_set_flags(Pointer.getPeer(datalist), flags);
    }

    protected native void g_datalist_unset_flags(
        @Ptr
        long datalist, long flags);

    public void datalist_unset_flags(Pointer<Pointer<GData>> datalist, long flags) {
        this.g_datalist_unset_flags(Pointer.getPeer(datalist), flags);
    }

    public native void g_dataset_destroy(Pointer dataset_location);

    public native void g_dataset_foreach(Pointer dataset_location, Object func, Pointer user_data);

    public native Pointer g_dataset_id_get_data(Pointer dataset_location, Object key_id);

    public native Pointer g_dataset_id_remove_no_notify(Pointer dataset_location, Object key_id);

    public native void g_dataset_id_set_data_full(Pointer dataset_location, Object key_id, Pointer data, Object destroy_func);

    public native short g_date_get_days_in_month(IntValuedEnum<GDateMonth> month, Object year);

    public native short g_date_get_monday_weeks_in_year(Object year);

    public native short g_date_get_sunday_weeks_in_year(Object year);

    public native boolean g_date_is_leap_year(Object year);

    protected native long g_date_strftime(
        @Ptr
        long s, long slen,
        @Ptr
        long format,
        @Ptr
        long date);

    public long date_strftime(Pointer s, long slen, Pointer format, Pointer<GDate> date) {
        return this.g_date_strftime(Pointer.getPeer(s), slen, Pointer.getPeer(format), Pointer.getPeer(date));
    }

    public native int g_date_time_compare(Pointer dt1, Pointer dt2);

    public native boolean g_date_time_equal(Pointer dt1, Pointer dt2);

    public native long g_date_time_hash(Pointer datetime);

    public native boolean g_date_valid_day(Object day);

    public native boolean g_date_valid_dmy(Object day, IntValuedEnum<GDateMonth> month, Object year);

    public native boolean g_date_valid_julian(long julian_date);

    public native boolean g_date_valid_month(IntValuedEnum<GDateMonth> month);

    public native boolean g_date_valid_weekday(IntValuedEnum<GDateWeekday> weekday);

    public native boolean g_date_valid_year(Object year);

    @Ptr
    protected native long g_dcgettext(
        @Ptr
        long domain,
        @Ptr
        long msgid, int category);

    public Pointer dcgettext(Pointer domain, Pointer msgid, int category) {
        return Pointer.pointerToAddress(this.g_dcgettext(Pointer.getPeer(domain), Pointer.getPeer(msgid), category));
    }

    @Ptr
    protected native long g_dgettext(
        @Ptr
        long domain,
        @Ptr
        long msgid);

    public Pointer dgettext(Pointer domain, Pointer msgid) {
        return Pointer.pointerToAddress(this.g_dgettext(Pointer.getPeer(domain), Pointer.getPeer(msgid)));
    }

    @Ptr
    protected native long g_dir_make_tmp(
        @Ptr
        long tmpl);

    public Pointer dir_make_tmp(Pointer tmpl) {
        return Pointer.pointerToAddress(this.g_dir_make_tmp(Pointer.getPeer(tmpl)));
    }

    public native boolean g_direct_equal(Pointer v1, Pointer v2);

    public native long g_direct_hash(Pointer v);

    @Ptr
    protected native long g_dngettext(
        @Ptr
        long domain,
        @Ptr
        long msgid,
        @Ptr
        long msgid_plural, long n);

    public Pointer dngettext(Pointer domain, Pointer msgid, Pointer msgid_plural, long n) {
        return Pointer.pointerToAddress(this.g_dngettext(Pointer.getPeer(domain), Pointer.getPeer(msgid), Pointer.getPeer(msgid_plural), n));
    }

    public native boolean g_double_equal(Pointer v1, Pointer v2);

    public native long g_double_hash(Pointer v);

    @Ptr
    protected native long g_dpgettext(
        @Ptr
        long domain,
        @Ptr
        long msgctxtid, long msgidoffset);

    public Pointer dpgettext(Pointer domain, Pointer msgctxtid, long msgidoffset) {
        return Pointer.pointerToAddress(this.g_dpgettext(Pointer.getPeer(domain), Pointer.getPeer(msgctxtid), msgidoffset));
    }

    @Ptr
    protected native long g_dpgettext2(
        @Ptr
        long domain,
        @Ptr
        long context,
        @Ptr
        long msgid);

    public Pointer dpgettext2(Pointer domain, Pointer context, Pointer msgid) {
        return Pointer.pointerToAddress(this.g_dpgettext2(Pointer.getPeer(domain), Pointer.getPeer(context), Pointer.getPeer(msgid)));
    }

    @Ptr
    protected native long g_environ_getenv(
        @Ptr
        long envp,
        @Ptr
        long variable);

    public Pointer environ_getenv(Pointer envp, Pointer variable) {
        return Pointer.pointerToAddress(this.g_environ_getenv(Pointer.getPeer(envp), Pointer.getPeer(variable)));
    }

    @Ptr
    protected native long g_environ_setenv(
        @Ptr
        long envp,
        @Ptr
        long variable,
        @Ptr
        long value, boolean overwrite);

    public Pointer environ_setenv(Pointer envp, Pointer variable, Pointer value, boolean overwrite) {
        return Pointer.pointerToAddress(this.g_environ_setenv(Pointer.getPeer(envp), Pointer.getPeer(variable), Pointer.getPeer(value), overwrite));
    }

    @Ptr
    protected native long g_environ_unsetenv(
        @Ptr
        long envp,
        @Ptr
        long variable);

    public Pointer environ_unsetenv(Pointer envp, Pointer variable) {
        return Pointer.pointerToAddress(this.g_environ_unsetenv(Pointer.getPeer(envp), Pointer.getPeer(variable)));
    }

    public native IntValuedEnum<GFileError> g_file_error_from_errno(int err_no);

    public native Object g_file_error_quark();

    protected native boolean g_file_get_contents(
        @Ptr
        long filename,
        @Ptr
        long contents,
        @Ptr
        long length);

    public boolean file_get_contents(Pointer filename, short contents, Pointer<Long> length) {
        return this.g_file_get_contents(Pointer.getPeer(filename), Pointer.getPeer(contents), Pointer.getPeer(length));
    }

    protected native int g_file_open_tmp(
        @Ptr
        long tmpl,
        @Ptr
        long name_used);

    public int file_open_tmp(Pointer tmpl, Pointer name_used) {
        return this.g_file_open_tmp(Pointer.getPeer(tmpl), Pointer.getPeer(name_used));
    }

    @Ptr
    protected native long g_file_read_link(
        @Ptr
        long filename);

    public Pointer file_read_link(Pointer filename) {
        return Pointer.pointerToAddress(this.g_file_read_link(Pointer.getPeer(filename)));
    }

    protected native boolean g_file_set_contents(
        @Ptr
        long filename,
        @Ptr
        long contents, long length);

    public boolean file_set_contents(Pointer filename, short contents, long length) {
        return this.g_file_set_contents(Pointer.getPeer(filename), Pointer.getPeer(contents), length);
    }

    protected native boolean g_file_test(
        @Ptr
        long filename, Object test);

    public boolean file_test(Pointer filename, Object test) {
        return this.g_file_test(Pointer.getPeer(filename), test);
    }

    @Ptr
    protected native long g_filename_display_basename(
        @Ptr
        long filename);

    public Pointer filename_display_basename(Pointer filename) {
        return Pointer.pointerToAddress(this.g_filename_display_basename(Pointer.getPeer(filename)));
    }

    @Ptr
    protected native long g_filename_display_name(
        @Ptr
        long filename);

    public Pointer filename_display_name(Pointer filename) {
        return Pointer.pointerToAddress(this.g_filename_display_name(Pointer.getPeer(filename)));
    }

    @Ptr
    protected native long g_filename_from_uri(
        @Ptr
        long uri,
        @Ptr
        long hostname);

    public Pointer filename_from_uri(Pointer uri, Pointer hostname) {
        return Pointer.pointerToAddress(this.g_filename_from_uri(Pointer.getPeer(uri), Pointer.getPeer(hostname)));
    }

    @Ptr
    protected native long g_filename_from_utf8(
        @Ptr
        long utf8string, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public short filename_from_utf8(Pointer utf8string, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(this.g_filename_from_utf8(Pointer.getPeer(utf8string), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)), Short.class);
    }

    @Ptr
    protected native long g_filename_to_uri(
        @Ptr
        long filename,
        @Ptr
        long hostname);

    public Pointer filename_to_uri(Pointer filename, Pointer hostname) {
        return Pointer.pointerToAddress(this.g_filename_to_uri(Pointer.getPeer(filename), Pointer.getPeer(hostname)));
    }

    @Ptr
    protected native long g_filename_to_utf8(
        @Ptr
        long opsysstring, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public Pointer filename_to_utf8(Pointer opsysstring, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(this.g_filename_to_utf8(Pointer.getPeer(opsysstring), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    @Ptr
    protected native long g_find_program_in_path(
        @Ptr
        long program);

    public Pointer find_program_in_path(Pointer program) {
        return Pointer.pointerToAddress(this.g_find_program_in_path(Pointer.getPeer(program)));
    }

    @Ptr
    protected native long g_format_size(long size);

    public Pointer format_size(long size) {
        return Pointer.pointerToAddress(this.g_format_size(size));
    }

    @Ptr
    protected native long g_format_size_for_display(long size);

    public Pointer format_size_for_display(long size) {
        return Pointer.pointerToAddress(this.g_format_size_for_display(size));
    }

    @Ptr
    protected native long g_format_size_full(long size, Object flags);

    public Pointer format_size_full(long size, Object flags) {
        return Pointer.pointerToAddress(this.g_format_size_full(size, flags));
    }

    protected native int g_fprintf(Pointer file,
        @Ptr
        long format, Object... varargs);

    public int fprintf(Pointer file, Pointer format, Object... varargs) {
        return this.g_fprintf(file, Pointer.getPeer(format), varargs);
    }

    public native void g_free(Pointer mem);

    @Ptr
    protected native long g_get_application_name();

    public Pointer get_application_name() {
        return Pointer.pointerToAddress(this.g_get_application_name());
    }

    protected native boolean g_get_charset(
        @Ptr
        long charset);

    public boolean get_charset(Pointer charset) {
        return this.g_get_charset(Pointer.getPeer(charset));
    }

    @Ptr
    protected native long g_get_codeset();

    public Pointer get_codeset() {
        return Pointer.pointerToAddress(this.g_get_codeset());
    }

    @Ptr
    protected native long g_get_current_dir();

    public Pointer get_current_dir() {
        return Pointer.pointerToAddress(this.g_get_current_dir());
    }

    protected native void g_get_current_time(
        @Ptr
        long result);

    public void get_current_time(Pointer<GTimeVal> result) {
        this.g_get_current_time(Pointer.getPeer(result));
    }

    @Ptr
    protected native long g_get_environ();

    public Pointer get_environ() {
        return Pointer.pointerToAddress(this.g_get_environ());
    }

    protected native boolean g_get_filename_charsets(
        @Ptr
        long charsets);

    public boolean get_filename_charsets(Pointer charsets) {
        return this.g_get_filename_charsets(Pointer.getPeer(charsets));
    }

    @Ptr
    protected native long g_get_home_dir();

    public Pointer get_home_dir() {
        return Pointer.pointerToAddress(this.g_get_home_dir());
    }

    @Ptr
    protected native long g_get_host_name();

    public Pointer get_host_name() {
        return Pointer.pointerToAddress(this.g_get_host_name());
    }

    @Ptr
    protected native long g_get_language_names();

    public Pointer get_language_names() {
        return Pointer.pointerToAddress(this.g_get_language_names());
    }

    @Ptr
    protected native long g_get_locale_variants(
        @Ptr
        long locale);

    public Pointer get_locale_variants(Pointer locale) {
        return Pointer.pointerToAddress(this.g_get_locale_variants(Pointer.getPeer(locale)));
    }

    public native long g_get_monotonic_time();

    public native long g_get_num_processors();

    @Ptr
    protected native long g_get_prgname();

    public Pointer get_prgname() {
        return Pointer.pointerToAddress(this.g_get_prgname());
    }

    @Ptr
    protected native long g_get_real_name();

    public Pointer get_real_name() {
        return Pointer.pointerToAddress(this.g_get_real_name());
    }

    public native long g_get_real_time();

    @Ptr
    protected native long g_get_system_config_dirs();

    public Pointer get_system_config_dirs() {
        return Pointer.pointerToAddress(this.g_get_system_config_dirs());
    }

    @Ptr
    protected native long g_get_system_data_dirs();

    public Pointer get_system_data_dirs() {
        return Pointer.pointerToAddress(this.g_get_system_data_dirs());
    }

    @Ptr
    protected native long g_get_tmp_dir();

    public Pointer get_tmp_dir() {
        return Pointer.pointerToAddress(this.g_get_tmp_dir());
    }

    @Ptr
    protected native long g_get_user_cache_dir();

    public Pointer get_user_cache_dir() {
        return Pointer.pointerToAddress(this.g_get_user_cache_dir());
    }

    @Ptr
    protected native long g_get_user_config_dir();

    public Pointer get_user_config_dir() {
        return Pointer.pointerToAddress(this.g_get_user_config_dir());
    }

    @Ptr
    protected native long g_get_user_data_dir();

    public Pointer get_user_data_dir() {
        return Pointer.pointerToAddress(this.g_get_user_data_dir());
    }

    @Ptr
    protected native long g_get_user_name();

    public Pointer get_user_name() {
        return Pointer.pointerToAddress(this.g_get_user_name());
    }

    @Ptr
    protected native long g_get_user_runtime_dir();

    public Pointer get_user_runtime_dir() {
        return Pointer.pointerToAddress(this.g_get_user_runtime_dir());
    }

    @Ptr
    protected native long g_get_user_special_dir(IntValuedEnum<GUserDirectory> directory);

    public Pointer get_user_special_dir(IntValuedEnum<GUserDirectory> directory) {
        return Pointer.pointerToAddress(this.g_get_user_special_dir(directory));
    }

    @Ptr
    protected native long g_getenv(
        @Ptr
        long variable);

    public Pointer getenv(Pointer variable) {
        return Pointer.pointerToAddress(this.g_getenv(Pointer.getPeer(variable)));
    }

    protected native boolean g_hash_table_add(
        @Ptr
        long hash_table, Pointer key);

    public boolean hash_table_add(Pointer<GHashTable> hash_table, Pointer key) {
        return this.g_hash_table_add(Pointer.getPeer(hash_table), key);
    }

    protected native boolean g_hash_table_contains(
        @Ptr
        long hash_table, Pointer key);

    public boolean hash_table_contains(Pointer<GHashTable> hash_table, Pointer key) {
        return this.g_hash_table_contains(Pointer.getPeer(hash_table), key);
    }

    protected native void g_hash_table_destroy(
        @Ptr
        long hash_table);

    public void hash_table_destroy(Pointer<GHashTable> hash_table) {
        this.g_hash_table_destroy(Pointer.getPeer(hash_table));
    }

    protected native boolean g_hash_table_insert(
        @Ptr
        long hash_table, Pointer key, Pointer value);

    public boolean hash_table_insert(Pointer<GHashTable> hash_table, Pointer key, Pointer value) {
        return this.g_hash_table_insert(Pointer.getPeer(hash_table), key, value);
    }

    protected native boolean g_hash_table_lookup_extended(
        @Ptr
        long hash_table, Pointer lookup_key, Pointer orig_key, Pointer value);

    public boolean hash_table_lookup_extended(Pointer<GHashTable> hash_table, Pointer lookup_key, Pointer orig_key, Pointer value) {
        return this.g_hash_table_lookup_extended(Pointer.getPeer(hash_table), lookup_key, orig_key, value);
    }

    protected native boolean g_hash_table_remove(
        @Ptr
        long hash_table, Pointer key);

    public boolean hash_table_remove(Pointer<GHashTable> hash_table, Pointer key) {
        return this.g_hash_table_remove(Pointer.getPeer(hash_table), key);
    }

    protected native void g_hash_table_remove_all(
        @Ptr
        long hash_table);

    public void hash_table_remove_all(Pointer<GHashTable> hash_table) {
        this.g_hash_table_remove_all(Pointer.getPeer(hash_table));
    }

    protected native boolean g_hash_table_replace(
        @Ptr
        long hash_table, Pointer key, Pointer value);

    public boolean hash_table_replace(Pointer<GHashTable> hash_table, Pointer key, Pointer value) {
        return this.g_hash_table_replace(Pointer.getPeer(hash_table), key, value);
    }

    protected native long g_hash_table_size(
        @Ptr
        long hash_table);

    public long hash_table_size(Pointer<GHashTable> hash_table) {
        return this.g_hash_table_size(Pointer.getPeer(hash_table));
    }

    protected native boolean g_hash_table_steal(
        @Ptr
        long hash_table, Pointer key);

    public boolean hash_table_steal(Pointer<GHashTable> hash_table, Pointer key) {
        return this.g_hash_table_steal(Pointer.getPeer(hash_table), key);
    }

    protected native void g_hash_table_steal_all(
        @Ptr
        long hash_table);

    public void hash_table_steal_all(Pointer<GHashTable> hash_table) {
        this.g_hash_table_steal_all(Pointer.getPeer(hash_table));
    }

    protected native void g_hash_table_unref(
        @Ptr
        long hash_table);

    public void hash_table_unref(Pointer<GHashTable> hash_table) {
        this.g_hash_table_unref(Pointer.getPeer(hash_table));
    }

    protected native boolean g_hook_destroy(
        @Ptr
        long hook_list, long hook_id);

    public boolean hook_destroy(Pointer<GHookList> hook_list, long hook_id) {
        return this.g_hook_destroy(Pointer.getPeer(hook_list), hook_id);
    }

    protected native void g_hook_destroy_link(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void hook_destroy_link(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        this.g_hook_destroy_link(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected native void g_hook_free(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void hook_free(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        this.g_hook_free(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected native void g_hook_insert_before(
        @Ptr
        long hook_list,
        @Ptr
        long sibling,
        @Ptr
        long hook);

    public void hook_insert_before(Pointer<GHookList> hook_list, Pointer<GHook> sibling, Pointer<GHook> hook) {
        this.g_hook_insert_before(Pointer.getPeer(hook_list), Pointer.getPeer(sibling), Pointer.getPeer(hook));
    }

    protected native void g_hook_prepend(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void hook_prepend(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        this.g_hook_prepend(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected native void g_hook_unref(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public void hook_unref(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        this.g_hook_unref(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected native boolean g_hostname_is_ascii_encoded(
        @Ptr
        long hostname);

    public boolean hostname_is_ascii_encoded(Pointer hostname) {
        return this.g_hostname_is_ascii_encoded(Pointer.getPeer(hostname));
    }

    protected native boolean g_hostname_is_ip_address(
        @Ptr
        long hostname);

    public boolean hostname_is_ip_address(Pointer hostname) {
        return this.g_hostname_is_ip_address(Pointer.getPeer(hostname));
    }

    protected native boolean g_hostname_is_non_ascii(
        @Ptr
        long hostname);

    public boolean hostname_is_non_ascii(Pointer hostname) {
        return this.g_hostname_is_non_ascii(Pointer.getPeer(hostname));
    }

    @Ptr
    protected native long g_hostname_to_ascii(
        @Ptr
        long hostname);

    public Pointer hostname_to_ascii(Pointer hostname) {
        return Pointer.pointerToAddress(this.g_hostname_to_ascii(Pointer.getPeer(hostname)));
    }

    @Ptr
    protected native long g_hostname_to_unicode(
        @Ptr
        long hostname);

    public Pointer hostname_to_unicode(Pointer hostname) {
        return Pointer.pointerToAddress(this.g_hostname_to_unicode(Pointer.getPeer(hostname)));
    }

    protected native long g_iconv(GIConv converter,
        @Ptr
        long inbuf,
        @Ptr
        long inbytes_left,
        @Ptr
        long outbuf,
        @Ptr
        long outbytes_left);

    public long iconv(GIConv converter, Pointer inbuf, Pointer<Long> inbytes_left, Pointer outbuf, Pointer<Long> outbytes_left) {
        return this.g_iconv(converter, Pointer.getPeer(inbuf), Pointer.getPeer(inbytes_left), Pointer.getPeer(outbuf), Pointer.getPeer(outbytes_left));
    }

    public native long g_idle_add(Object function, Pointer data);

    public native long g_idle_add_full(int priority, Object function, Pointer data, Object notify);

    public native boolean g_idle_remove_by_data(Pointer data);

    @Ptr
    protected native long g_idle_source_new();

    public Pointer<GSource> idle_source_new() {
        return Pointer.pointerToAddress(this.g_idle_source_new(), Pointer.class);
    }

    public native boolean g_int64_equal(Pointer v1, Pointer v2);

    public native long g_int64_hash(Pointer v);

    public native boolean g_int_equal(Pointer v1, Pointer v2);

    public native long g_int_hash(Pointer v);

    @Ptr
    protected native long g_intern_static_string(
        @Ptr
        long string);

    public Pointer intern_static_string(Pointer string) {
        return Pointer.pointerToAddress(this.g_intern_static_string(Pointer.getPeer(string)));
    }

    @Ptr
    protected native long g_intern_string(
        @Ptr
        long string);

    public Pointer intern_string(Pointer string) {
        return Pointer.pointerToAddress(this.g_intern_string(Pointer.getPeer(string)));
    }

    protected native long g_io_add_watch(
        @Ptr
        long channel, Object condition, Object func, Pointer user_data);

    public long io_add_watch(Pointer<GIOChannel> channel, Object condition, Object func, Pointer user_data) {
        return this.g_io_add_watch(Pointer.getPeer(channel), condition, func, user_data);
    }

    protected native long g_io_add_watch_full(
        @Ptr
        long channel, int priority, Object condition, Object func, Pointer user_data, Object notify);

    public long io_add_watch_full(Pointer<GIOChannel> channel, int priority, Object condition, Object func, Pointer user_data, Object notify) {
        return this.g_io_add_watch_full(Pointer.getPeer(channel), priority, condition, func, user_data, notify);
    }

    public native IntValuedEnum<GIOChannelError> g_io_channel_error_from_errno(int en);

    public native Object g_io_channel_error_quark();

    @Ptr
    protected native long g_io_create_watch(
        @Ptr
        long channel, Object condition);

    public Pointer<GSource> io_create_watch(Pointer<GIOChannel> channel, Object condition) {
        return Pointer.pointerToAddress(this.g_io_create_watch(Pointer.getPeer(channel), condition), Pointer.class);
    }

    public native Object g_key_file_error_quark();

    @Ptr
    protected native long g_listenv();

    public Pointer listenv() {
        return Pointer.pointerToAddress(this.g_listenv());
    }

    @Ptr
    protected native long g_locale_from_utf8(
        @Ptr
        long utf8string, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public Pointer locale_from_utf8(Pointer utf8string, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(this.g_locale_from_utf8(Pointer.getPeer(utf8string), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    @Ptr
    protected native long g_locale_to_utf8(
        @Ptr
        long opsysstring, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public Pointer locale_to_utf8(Pointer opsysstring, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(this.g_locale_to_utf8(Pointer.getPeer(opsysstring), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    protected native void g_log(
        @Ptr
        long log_domain, Object log_level,
        @Ptr
        long format, Object... varargs);

    public void log(Pointer log_domain, Object log_level, Pointer format, Object... varargs) {
        this.g_log(Pointer.getPeer(log_domain), log_level, Pointer.getPeer(format), varargs);
    }

    protected native void g_log_default_handler(
        @Ptr
        long log_domain, Object log_level,
        @Ptr
        long message, Pointer unused_data);

    public void log_default_handler(Pointer log_domain, Object log_level, Pointer message, Pointer unused_data) {
        this.g_log_default_handler(Pointer.getPeer(log_domain), log_level, Pointer.getPeer(message), unused_data);
    }

    protected native void g_log_remove_handler(
        @Ptr
        long log_domain, long handler_id);

    public void log_remove_handler(Pointer log_domain, long handler_id) {
        this.g_log_remove_handler(Pointer.getPeer(log_domain), handler_id);
    }

    public native Object g_log_set_always_fatal(Object fatal_mask);

    public native Object g_log_set_default_handler(Object log_func, Pointer user_data);

    protected native Object g_log_set_fatal_mask(
        @Ptr
        long log_domain, Object fatal_mask);

    public Object log_set_fatal_mask(Pointer log_domain, Object fatal_mask) {
        return this.g_log_set_fatal_mask(Pointer.getPeer(log_domain), fatal_mask);
    }

    protected native long g_log_set_handler(
        @Ptr
        long log_domain, Object log_levels, Object log_func, Pointer user_data);

    public long log_set_handler(Pointer log_domain, Object log_levels, Object log_func, Pointer user_data) {
        return this.g_log_set_handler(Pointer.getPeer(log_domain), log_levels, log_func, user_data);
    }

    @Ptr
    protected native long g_main_context_default();

    public Pointer<GMainContext> main_context_default() {
        return Pointer.pointerToAddress(this.g_main_context_default(), Pointer.class);
    }

    @Ptr
    protected native long g_main_context_get_thread_default();

    public Pointer<GMainContext> main_context_get_thread_default() {
        return Pointer.pointerToAddress(this.g_main_context_get_thread_default(), Pointer.class);
    }

    @Ptr
    protected native long g_main_context_ref_thread_default();

    public Pointer<GMainContext> main_context_ref_thread_default() {
        return Pointer.pointerToAddress(this.g_main_context_ref_thread_default(), Pointer.class);
    }

    @Ptr
    protected native long g_main_current_source();

    public Pointer<GSource> main_current_source() {
        return Pointer.pointerToAddress(this.g_main_current_source(), Pointer.class);
    }

    public native int g_main_depth();

    public native Pointer g_malloc(long n_bytes);

    public native Pointer g_malloc0(long n_bytes);

    public native Pointer g_malloc0_n(long n_blocks, long n_block_bytes);

    public native Pointer g_malloc_n(long n_blocks, long n_block_bytes);

    protected native boolean g_markup_collect_attributes(
        @Ptr
        long element_name,
        @Ptr
        long attribute_names,
        @Ptr
        long attribute_values,
        @Ptr
        long error, Object first_type,
        @Ptr
        long first_attr, Object... varargs);

    public boolean markup_collect_attributes(Pointer element_name, Pointer attribute_names, Pointer attribute_values, Pointer<Pointer<GError>> error, Object first_type, Pointer first_attr, Object... varargs) {
        return this.g_markup_collect_attributes(Pointer.getPeer(element_name), Pointer.getPeer(attribute_names), Pointer.getPeer(attribute_values), Pointer.getPeer(error), first_type, Pointer.getPeer(first_attr), varargs);
    }

    public native Object g_markup_error_quark();

    @Ptr
    protected native long g_markup_escape_text(
        @Ptr
        long text, long length);

    public Pointer markup_escape_text(Pointer text, long length) {
        return Pointer.pointerToAddress(this.g_markup_escape_text(Pointer.getPeer(text), length));
    }

    @Ptr
    protected native long g_markup_printf_escaped(
        @Ptr
        long format, Object... varargs);

    public Pointer markup_printf_escaped(Pointer format, Object... varargs) {
        return Pointer.pointerToAddress(this.g_markup_printf_escaped(Pointer.getPeer(format), varargs));
    }

    public native boolean g_mem_is_system_malloc();

    public native void g_mem_profile();

    protected native void g_mem_set_vtable(
        @Ptr
        long vtable);

    public void mem_set_vtable(Pointer<GMemVTable> vtable) {
        this.g_mem_set_vtable(Pointer.getPeer(vtable));
    }

    public native Pointer g_memdup(Pointer mem, long byte_size);

    protected native int g_mkdir_with_parents(
        @Ptr
        long pathname, int mode);

    public int mkdir_with_parents(Pointer pathname, int mode) {
        return this.g_mkdir_with_parents(Pointer.getPeer(pathname), mode);
    }

    @Ptr
    protected native long g_mkdtemp(
        @Ptr
        long tmpl);

    public Pointer mkdtemp(Pointer tmpl) {
        return Pointer.pointerToAddress(this.g_mkdtemp(Pointer.getPeer(tmpl)));
    }

    @Ptr
    protected native long g_mkdtemp_full(
        @Ptr
        long tmpl, int mode);

    public Pointer mkdtemp_full(Pointer tmpl, int mode) {
        return Pointer.pointerToAddress(this.g_mkdtemp_full(Pointer.getPeer(tmpl), mode));
    }

    protected native int g_mkstemp(
        @Ptr
        long tmpl);

    public int mkstemp(Pointer tmpl) {
        return this.g_mkstemp(Pointer.getPeer(tmpl));
    }

    protected native int g_mkstemp_full(
        @Ptr
        long tmpl, int flags, int mode);

    public int mkstemp_full(Pointer tmpl, int flags, int mode) {
        return this.g_mkstemp_full(Pointer.getPeer(tmpl), flags, mode);
    }

    public native void g_nullify_pointer(Pointer nullify_location);

    protected native void g_on_error_query(
        @Ptr
        long prg_name);

    public void on_error_query(Pointer prg_name) {
        this.g_on_error_query(Pointer.getPeer(prg_name));
    }

    protected native void g_on_error_stack_trace(
        @Ptr
        long prg_name);

    public void on_error_stack_trace(Pointer prg_name) {
        this.g_on_error_stack_trace(Pointer.getPeer(prg_name));
    }

    public native boolean g_once_init_enter(Pointer location);

    public native void g_once_init_leave(Pointer location, long result);

    public native Object g_option_error_quark();

    protected native long g_parse_debug_string(
        @Ptr
        long string,
        @Ptr
        long keys, long nkeys);

    public long parse_debug_string(Pointer string, GDebugKey keys, long nkeys) {
        return this.g_parse_debug_string(Pointer.getPeer(string), Pointer.getPeer(keys), nkeys);
    }

    @Ptr
    protected native long g_path_get_basename(
        @Ptr
        long file_name);

    public Pointer path_get_basename(Pointer file_name) {
        return Pointer.pointerToAddress(this.g_path_get_basename(Pointer.getPeer(file_name)));
    }

    @Ptr
    protected native long g_path_get_dirname(
        @Ptr
        long file_name);

    public Pointer path_get_dirname(Pointer file_name) {
        return Pointer.pointerToAddress(this.g_path_get_dirname(Pointer.getPeer(file_name)));
    }

    protected native boolean g_path_is_absolute(
        @Ptr
        long file_name);

    public boolean path_is_absolute(Pointer file_name) {
        return this.g_path_is_absolute(Pointer.getPeer(file_name));
    }

    @Ptr
    protected native long g_path_skip_root(
        @Ptr
        long file_name);

    public Pointer path_skip_root(Pointer file_name) {
        return Pointer.pointerToAddress(this.g_path_skip_root(Pointer.getPeer(file_name)));
    }

    protected native boolean g_pattern_match(
        @Ptr
        long pspec, long string_length,
        @Ptr
        long string,
        @Ptr
        long string_reversed);

    public boolean pattern_match(Pointer<GPatternSpec> pspec, long string_length, Pointer string, Pointer string_reversed) {
        return this.g_pattern_match(Pointer.getPeer(pspec), string_length, Pointer.getPeer(string), Pointer.getPeer(string_reversed));
    }

    protected native boolean g_pattern_match_simple(
        @Ptr
        long pattern,
        @Ptr
        long string);

    public boolean pattern_match_simple(Pointer pattern, Pointer string) {
        return this.g_pattern_match_simple(Pointer.getPeer(pattern), Pointer.getPeer(string));
    }

    protected native boolean g_pattern_match_string(
        @Ptr
        long pspec,
        @Ptr
        long string);

    public boolean pattern_match_string(Pointer<GPatternSpec> pspec, Pointer string) {
        return this.g_pattern_match_string(Pointer.getPeer(pspec), Pointer.getPeer(string));
    }

    public native void g_pointer_bit_lock(Pointer address, int lock_bit);

    public native boolean g_pointer_bit_trylock(Pointer address, int lock_bit);

    public native void g_pointer_bit_unlock(Pointer address, int lock_bit);

    protected native int g_poll(
        @Ptr
        long fds, long nfds, int timeout);

    public int poll(Pointer<GPollFD> fds, long nfds, int timeout) {
        return this.g_poll(Pointer.getPeer(fds), nfds, timeout);
    }

    protected native void g_prefix_error(
        @Ptr
        long err,
        @Ptr
        long format, Object... varargs);

    public void prefix_error(Pointer<Pointer<GError>> err, Pointer format, Object... varargs) {
        this.g_prefix_error(Pointer.getPeer(err), Pointer.getPeer(format), varargs);
    }

    protected native void g_print(
        @Ptr
        long format, Object... varargs);

    public void print(Pointer format, Object... varargs) {
        this.g_print(Pointer.getPeer(format), varargs);
    }

    protected native void g_printerr(
        @Ptr
        long format, Object... varargs);

    public void printerr(Pointer format, Object... varargs) {
        this.g_printerr(Pointer.getPeer(format), varargs);
    }

    protected native int g_printf(
        @Ptr
        long format, Object... varargs);

    public int printf(Pointer format, Object... varargs) {
        return this.g_printf(Pointer.getPeer(format), varargs);
    }

    protected native void g_propagate_error(
        @Ptr
        long dest,
        @Ptr
        long src);

    public void propagate_error(Pointer<Pointer<GError>> dest, Pointer<GError> src) {
        this.g_propagate_error(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected native void g_propagate_prefixed_error(
        @Ptr
        long dest,
        @Ptr
        long src,
        @Ptr
        long format, Object... varargs);

    public void propagate_prefixed_error(Pointer<Pointer<GError>> dest, Pointer<GError> src, Pointer format, Object... varargs) {
        this.g_propagate_prefixed_error(Pointer.getPeer(dest), Pointer.getPeer(src), Pointer.getPeer(format), varargs);
    }

    public native void g_qsort_with_data(Pointer pbase, int total_elems, long size, Object compare_func, Pointer user_data);

    protected native Object g_quark_from_static_string(
        @Ptr
        long string);

    public Object quark_from_static_string(Pointer string) {
        return this.g_quark_from_static_string(Pointer.getPeer(string));
    }

    protected native Object g_quark_from_string(
        @Ptr
        long string);

    public Object quark_from_string(Pointer string) {
        return this.g_quark_from_string(Pointer.getPeer(string));
    }

    @Ptr
    protected native long g_quark_to_string(Object quark);

    public Pointer quark_to_string(Object quark) {
        return Pointer.pointerToAddress(this.g_quark_to_string(quark));
    }

    protected native Object g_quark_try_string(
        @Ptr
        long string);

    public Object quark_try_string(Pointer string) {
        return this.g_quark_try_string(Pointer.getPeer(string));
    }

    public native double g_random_double();

    public native double g_random_double_range(double begin, double end);

    public native long g_random_int();

    public native int g_random_int_range(int begin, int end);

    public native void g_random_set_seed(long seed);

    public native Pointer g_realloc(Pointer mem, long n_bytes);

    public native Pointer g_realloc_n(Pointer mem, long n_blocks, long n_block_bytes);

    protected native boolean g_regex_check_replacement(
        @Ptr
        long replacement,
        @Ptr
        long has_references);

    public boolean regex_check_replacement(Pointer replacement, Pointer<Boolean> has_references) {
        return this.g_regex_check_replacement(Pointer.getPeer(replacement), Pointer.getPeer(has_references));
    }

    public native Object g_regex_error_quark();

    @Ptr
    protected native long g_regex_escape_nul(
        @Ptr
        long string, int length);

    public Pointer regex_escape_nul(Pointer string, int length) {
        return Pointer.pointerToAddress(this.g_regex_escape_nul(Pointer.getPeer(string), length));
    }

    @Ptr
    protected native long g_regex_escape_string(
        @Ptr
        long string, int length);

    public Pointer regex_escape_string(Pointer string, int length) {
        return Pointer.pointerToAddress(this.g_regex_escape_string(Pointer.getPeer(string), length));
    }

    protected native boolean g_regex_match_simple(
        @Ptr
        long pattern,
        @Ptr
        long string, Object compile_options, Object match_options);

    public boolean regex_match_simple(Pointer pattern, Pointer string, Object compile_options, Object match_options) {
        return this.g_regex_match_simple(Pointer.getPeer(pattern), Pointer.getPeer(string), compile_options, match_options);
    }

    @Ptr
    protected native long g_regex_split_simple(
        @Ptr
        long pattern,
        @Ptr
        long string, Object compile_options, Object match_options);

    public Pointer regex_split_simple(Pointer pattern, Pointer string, Object compile_options, Object match_options) {
        return Pointer.pointerToAddress(this.g_regex_split_simple(Pointer.getPeer(pattern), Pointer.getPeer(string), compile_options, match_options));
    }

    public native void g_reload_user_special_dirs_cache();

    protected native void g_return_if_fail_warning(
        @Ptr
        long log_domain,
        @Ptr
        long pretty_function,
        @Ptr
        long expression);

    public void return_if_fail_warning(Pointer log_domain, Pointer pretty_function, Pointer expression) {
        this.g_return_if_fail_warning(Pointer.getPeer(log_domain), Pointer.getPeer(pretty_function), Pointer.getPeer(expression));
    }

    protected native int g_rmdir(
        @Ptr
        long filename);

    public int rmdir(Pointer filename) {
        return this.g_rmdir(Pointer.getPeer(filename));
    }

    protected native void g_sequence_move(
        @Ptr
        long src,
        @Ptr
        long dest);

    public void sequence_move(Pointer<GSequenceIter> src, Pointer<GSequenceIter> dest) {
        this.g_sequence_move(Pointer.getPeer(src), Pointer.getPeer(dest));
    }

    protected native void g_sequence_move_range(
        @Ptr
        long dest,
        @Ptr
        long begin,
        @Ptr
        long end);

    public void sequence_move_range(Pointer<GSequenceIter> dest, Pointer<GSequenceIter> begin, Pointer<GSequenceIter> end) {
        this.g_sequence_move_range(Pointer.getPeer(dest), Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    protected native void g_sequence_remove(
        @Ptr
        long iter);

    public void sequence_remove(Pointer<GSequenceIter> iter) {
        this.g_sequence_remove(Pointer.getPeer(iter));
    }

    protected native void g_sequence_remove_range(
        @Ptr
        long begin,
        @Ptr
        long end);

    public void sequence_remove_range(Pointer<GSequenceIter> begin, Pointer<GSequenceIter> end) {
        this.g_sequence_remove_range(Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    protected native void g_sequence_set(
        @Ptr
        long iter, Pointer data);

    public void sequence_set(Pointer<GSequenceIter> iter, Pointer data) {
        this.g_sequence_set(Pointer.getPeer(iter), data);
    }

    protected native void g_sequence_swap(
        @Ptr
        long a,
        @Ptr
        long b);

    public void sequence_swap(Pointer<GSequenceIter> a, Pointer<GSequenceIter> b) {
        this.g_sequence_swap(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected native void g_set_application_name(
        @Ptr
        long application_name);

    public void set_application_name(Pointer application_name) {
        this.g_set_application_name(Pointer.getPeer(application_name));
    }

    protected native void g_set_error(
        @Ptr
        long err, Object domain, int code,
        @Ptr
        long format, Object... varargs);

    public void set_error(Pointer<Pointer<GError>> err, Object domain, int code, Pointer format, Object... varargs) {
        this.g_set_error(Pointer.getPeer(err), domain, code, Pointer.getPeer(format), varargs);
    }

    protected native void g_set_error_literal(
        @Ptr
        long err, Object domain, int code,
        @Ptr
        long message);

    public void set_error_literal(Pointer<Pointer<GError>> err, Object domain, int code, Pointer message) {
        this.g_set_error_literal(Pointer.getPeer(err), domain, code, Pointer.getPeer(message));
    }

    protected native void g_set_prgname(
        @Ptr
        long prgname);

    public void set_prgname(Pointer prgname) {
        this.g_set_prgname(Pointer.getPeer(prgname));
    }

    public native Object g_set_print_handler(Object func);

    public native Object g_set_printerr_handler(Object func);

    protected native boolean g_setenv(
        @Ptr
        long variable,
        @Ptr
        long value, boolean overwrite);

    public boolean setenv(Pointer variable, Pointer value, boolean overwrite) {
        return this.g_setenv(Pointer.getPeer(variable), Pointer.getPeer(value), overwrite);
    }

    public native Object g_shell_error_quark();

    protected native boolean g_shell_parse_argv(
        @Ptr
        long command_line,
        @Ptr
        long argcp,
        @Ptr
        long argvp);

    public boolean shell_parse_argv(Pointer command_line, Pointer<Integer> argcp, Pointer argvp) {
        return this.g_shell_parse_argv(Pointer.getPeer(command_line), Pointer.getPeer(argcp), Pointer.getPeer(argvp));
    }

    @Ptr
    protected native long g_shell_quote(
        @Ptr
        long unquoted_string);

    public Pointer shell_quote(Pointer unquoted_string) {
        return Pointer.pointerToAddress(this.g_shell_quote(Pointer.getPeer(unquoted_string)));
    }

    @Ptr
    protected native long g_shell_unquote(
        @Ptr
        long quoted_string);

    public Pointer shell_unquote(Pointer quoted_string) {
        return Pointer.pointerToAddress(this.g_shell_unquote(Pointer.getPeer(quoted_string)));
    }

    public native Pointer g_slice_alloc(long block_size);

    public native Pointer g_slice_alloc0(long block_size);

    public native Pointer g_slice_copy(long block_size, Pointer mem_block);

    public native void g_slice_free1(long block_size, Pointer mem_block);

    public native void g_slice_free_chain_with_offset(long block_size, Pointer mem_chain, long next_offset);

    public native long g_slice_get_config(IntValuedEnum<GSliceConfig> ckey);

    @Ptr
    protected native long g_slice_get_config_state(IntValuedEnum<GSliceConfig> ckey, long address,
        @Ptr
        long n_values);

    public Pointer<Long> slice_get_config_state(IntValuedEnum<GSliceConfig> ckey, long address, Pointer<Long> n_values) {
        return Pointer.pointerToAddress(this.g_slice_get_config_state(ckey, address, Pointer.getPeer(n_values)), Pointer.class);
    }

    public native void g_slice_set_config(IntValuedEnum<GSliceConfig> ckey, long value);

    protected native int g_snprintf(
        @Ptr
        long string, long n,
        @Ptr
        long format, Object... varargs);

    public int snprintf(Pointer string, long n, Pointer format, Object... varargs) {
        return this.g_snprintf(Pointer.getPeer(string), n, Pointer.getPeer(format), varargs);
    }

    public native boolean g_source_remove(long tag);

    protected native boolean g_source_remove_by_funcs_user_data(
        @Ptr
        long funcs, Pointer user_data);

    public boolean source_remove_by_funcs_user_data(Pointer<GSourceFuncs> funcs, Pointer user_data) {
        return this.g_source_remove_by_funcs_user_data(Pointer.getPeer(funcs), user_data);
    }

    public native boolean g_source_remove_by_user_data(Pointer user_data);

    protected native void g_source_set_name_by_id(long tag,
        @Ptr
        long name);

    public void source_set_name_by_id(long tag, Pointer name) {
        this.g_source_set_name_by_id(tag, Pointer.getPeer(name));
    }

    public native long g_spaced_primes_closest(long num);

    protected native boolean g_spawn_async(
        @Ptr
        long working_directory,
        @Ptr
        long argv,
        @Ptr
        long envp, Object flags, Object child_setup, Pointer user_data,
        @Ptr
        long child_pid);

    public boolean spawn_async(Pointer working_directory, Pointer argv, Pointer envp, Object flags, Object child_setup, Pointer user_data, Pointer<Object> child_pid) {
        return this.g_spawn_async(Pointer.getPeer(working_directory), Pointer.getPeer(argv), Pointer.getPeer(envp), flags, child_setup, user_data, Pointer.getPeer(child_pid));
    }

    protected native boolean g_spawn_async_with_pipes(
        @Ptr
        long working_directory,
        @Ptr
        long argv,
        @Ptr
        long envp, Object flags, Object child_setup, Pointer user_data,
        @Ptr
        long child_pid,
        @Ptr
        long standard_input,
        @Ptr
        long standard_output,
        @Ptr
        long standard_error);

    public boolean spawn_async_with_pipes(Pointer working_directory, Pointer argv, Pointer envp, Object flags, Object child_setup, Pointer user_data, Pointer<Object> child_pid, Pointer<Integer> standard_input, Pointer<Integer> standard_output, Pointer<Integer> standard_error) {
        return this.g_spawn_async_with_pipes(Pointer.getPeer(working_directory), Pointer.getPeer(argv), Pointer.getPeer(envp), flags, child_setup, user_data, Pointer.getPeer(child_pid), Pointer.getPeer(standard_input), Pointer.getPeer(standard_output), Pointer.getPeer(standard_error));
    }

    public native boolean g_spawn_check_exit_status(int exit_status);

    public native void g_spawn_close_pid(Object pid);

    protected native boolean g_spawn_command_line_async(
        @Ptr
        long command_line);

    public boolean spawn_command_line_async(Pointer command_line) {
        return this.g_spawn_command_line_async(Pointer.getPeer(command_line));
    }

    protected native boolean g_spawn_command_line_sync(
        @Ptr
        long command_line,
        @Ptr
        long standard_output,
        @Ptr
        long standard_error,
        @Ptr
        long exit_status);

    public boolean spawn_command_line_sync(Pointer command_line, short standard_output, short standard_error, Pointer<Integer> exit_status) {
        return this.g_spawn_command_line_sync(Pointer.getPeer(command_line), Pointer.getPeer(standard_output), Pointer.getPeer(standard_error), Pointer.getPeer(exit_status));
    }

    public native Object g_spawn_error_quark();

    public native Object g_spawn_exit_error_quark();

    protected native boolean g_spawn_sync(
        @Ptr
        long working_directory,
        @Ptr
        long argv,
        @Ptr
        long envp, Object flags, Object child_setup, Pointer user_data,
        @Ptr
        long standard_output,
        @Ptr
        long standard_error,
        @Ptr
        long exit_status);

    public boolean spawn_sync(Pointer working_directory, Pointer argv, Pointer envp, Object flags, Object child_setup, Pointer user_data, short standard_output, short standard_error, Pointer<Integer> exit_status) {
        return this.g_spawn_sync(Pointer.getPeer(working_directory), Pointer.getPeer(argv), Pointer.getPeer(envp), flags, child_setup, user_data, Pointer.getPeer(standard_output), Pointer.getPeer(standard_error), Pointer.getPeer(exit_status));
    }

    protected native int g_sprintf(
        @Ptr
        long string,
        @Ptr
        long format, Object... varargs);

    public int sprintf(Pointer string, Pointer format, Object... varargs) {
        return this.g_sprintf(Pointer.getPeer(string), Pointer.getPeer(format), varargs);
    }

    @Ptr
    protected native long g_stpcpy(
        @Ptr
        long dest,
        @Ptr
        long src);

    public Pointer stpcpy(Pointer dest, Pointer src) {
        return Pointer.pointerToAddress(this.g_stpcpy(Pointer.getPeer(dest), Pointer.getPeer(src)));
    }

    public native boolean g_str_equal(Pointer v1, Pointer v2);

    protected native boolean g_str_has_prefix(
        @Ptr
        long str,
        @Ptr
        long prefix);

    public boolean str_has_prefix(Pointer str, Pointer prefix) {
        return this.g_str_has_prefix(Pointer.getPeer(str), Pointer.getPeer(prefix));
    }

    protected native boolean g_str_has_suffix(
        @Ptr
        long str,
        @Ptr
        long suffix);

    public boolean str_has_suffix(Pointer str, Pointer suffix) {
        return this.g_str_has_suffix(Pointer.getPeer(str), Pointer.getPeer(suffix));
    }

    public native long g_str_hash(Pointer v);

    protected native boolean g_str_is_ascii(
        @Ptr
        long str);

    public boolean str_is_ascii(Pointer str) {
        return this.g_str_is_ascii(Pointer.getPeer(str));
    }

    protected native boolean g_str_match_string(
        @Ptr
        long search_term,
        @Ptr
        long potential_hit, boolean accept_alternates);

    public boolean str_match_string(Pointer search_term, Pointer potential_hit, boolean accept_alternates) {
        return this.g_str_match_string(Pointer.getPeer(search_term), Pointer.getPeer(potential_hit), accept_alternates);
    }

    @Ptr
    protected native long g_str_to_ascii(
        @Ptr
        long str,
        @Ptr
        long from_locale);

    public Pointer str_to_ascii(Pointer str, Pointer from_locale) {
        return Pointer.pointerToAddress(this.g_str_to_ascii(Pointer.getPeer(str), Pointer.getPeer(from_locale)));
    }

    @Ptr
    protected native long g_str_tokenize_and_fold(
        @Ptr
        long string,
        @Ptr
        long translit_locale,
        @Ptr
        long ascii_alternates);

    public Pointer str_tokenize_and_fold(Pointer string, Pointer translit_locale, Pointer ascii_alternates) {
        return Pointer.pointerToAddress(this.g_str_tokenize_and_fold(Pointer.getPeer(string), Pointer.getPeer(translit_locale), Pointer.getPeer(ascii_alternates)));
    }

    @Ptr
    protected native long g_strcanon(
        @Ptr
        long string,
        @Ptr
        long valid_chars, char substitutor);

    public Pointer strcanon(Pointer string, Pointer valid_chars, char substitutor) {
        return Pointer.pointerToAddress(this.g_strcanon(Pointer.getPeer(string), Pointer.getPeer(valid_chars), substitutor));
    }

    protected native int g_strcasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2);

    public int strcasecmp(Pointer s1, Pointer s2) {
        return this.g_strcasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2));
    }

    @Ptr
    protected native long g_strchomp(
        @Ptr
        long string);

    public Pointer strchomp(Pointer string) {
        return Pointer.pointerToAddress(this.g_strchomp(Pointer.getPeer(string)));
    }

    @Ptr
    protected native long g_strchug(
        @Ptr
        long string);

    public Pointer strchug(Pointer string) {
        return Pointer.pointerToAddress(this.g_strchug(Pointer.getPeer(string)));
    }

    protected native int g_strcmp0(
        @Ptr
        long str1,
        @Ptr
        long str2);

    public int strcmp0(Pointer str1, Pointer str2) {
        return this.g_strcmp0(Pointer.getPeer(str1), Pointer.getPeer(str2));
    }

    @Ptr
    protected native long g_strcompress(
        @Ptr
        long source);

    public Pointer strcompress(Pointer source) {
        return Pointer.pointerToAddress(this.g_strcompress(Pointer.getPeer(source)));
    }

    @Ptr
    protected native long g_strconcat(
        @Ptr
        long string1, Object... varargs);

    public Pointer strconcat(Pointer string1, Object... varargs) {
        return Pointer.pointerToAddress(this.g_strconcat(Pointer.getPeer(string1), varargs));
    }

    @Ptr
    protected native long g_strdelimit(
        @Ptr
        long string,
        @Ptr
        long delimiters, char new_delimiter);

    public Pointer strdelimit(Pointer string, Pointer delimiters, char new_delimiter) {
        return Pointer.pointerToAddress(this.g_strdelimit(Pointer.getPeer(string), Pointer.getPeer(delimiters), new_delimiter));
    }

    @Ptr
    protected native long g_strdown(
        @Ptr
        long string);

    public Pointer strdown(Pointer string) {
        return Pointer.pointerToAddress(this.g_strdown(Pointer.getPeer(string)));
    }

    @Ptr
    protected native long g_strdup(
        @Ptr
        long str);

    public Pointer strdup(Pointer str) {
        return Pointer.pointerToAddress(this.g_strdup(Pointer.getPeer(str)));
    }

    @Ptr
    protected native long g_strdup_printf(
        @Ptr
        long format, Object... varargs);

    public Pointer strdup_printf(Pointer format, Object... varargs) {
        return Pointer.pointerToAddress(this.g_strdup_printf(Pointer.getPeer(format), varargs));
    }

    @Ptr
    protected native long g_strdupv(
        @Ptr
        long str_array);

    public Pointer strdupv(Pointer str_array) {
        return Pointer.pointerToAddress(this.g_strdupv(Pointer.getPeer(str_array)));
    }

    @Ptr
    protected native long g_strerror(int errnum);

    public Pointer strerror(int errnum) {
        return Pointer.pointerToAddress(this.g_strerror(errnum));
    }

    @Ptr
    protected native long g_strescape(
        @Ptr
        long source,
        @Ptr
        long exceptions);

    public Pointer strescape(Pointer source, Pointer exceptions) {
        return Pointer.pointerToAddress(this.g_strescape(Pointer.getPeer(source), Pointer.getPeer(exceptions)));
    }

    protected native void g_strfreev(
        @Ptr
        long str_array);

    public void strfreev(Pointer str_array) {
        this.g_strfreev(Pointer.getPeer(str_array));
    }

    @Ptr
    protected native long g_string_new(
        @Ptr
        long init);

    public Pointer<GString> string_new(Pointer init) {
        return Pointer.pointerToAddress(this.g_string_new(Pointer.getPeer(init)), Pointer.class);
    }

    @Ptr
    protected native long g_string_new_len(
        @Ptr
        long init, long len);

    public Pointer<GString> string_new_len(Pointer init, long len) {
        return Pointer.pointerToAddress(this.g_string_new_len(Pointer.getPeer(init), len), Pointer.class);
    }

    @Ptr
    protected native long g_string_sized_new(long dfl_size);

    public Pointer<GString> string_sized_new(long dfl_size) {
        return Pointer.pointerToAddress(this.g_string_sized_new(dfl_size), Pointer.class);
    }

    @Ptr
    protected native long g_strip_context(
        @Ptr
        long msgid,
        @Ptr
        long msgval);

    public Pointer strip_context(Pointer msgid, Pointer msgval) {
        return Pointer.pointerToAddress(this.g_strip_context(Pointer.getPeer(msgid), Pointer.getPeer(msgval)));
    }

    @Ptr
    protected native long g_strjoin(
        @Ptr
        long separator, Object... varargs);

    public Pointer strjoin(Pointer separator, Object... varargs) {
        return Pointer.pointerToAddress(this.g_strjoin(Pointer.getPeer(separator), varargs));
    }

    @Ptr
    protected native long g_strjoinv(
        @Ptr
        long separator,
        @Ptr
        long str_array);

    public Pointer strjoinv(Pointer separator, Pointer str_array) {
        return Pointer.pointerToAddress(this.g_strjoinv(Pointer.getPeer(separator), Pointer.getPeer(str_array)));
    }

    protected native long g_strlcat(
        @Ptr
        long dest,
        @Ptr
        long src, long dest_size);

    public long strlcat(Pointer dest, Pointer src, long dest_size) {
        return this.g_strlcat(Pointer.getPeer(dest), Pointer.getPeer(src), dest_size);
    }

    protected native long g_strlcpy(
        @Ptr
        long dest,
        @Ptr
        long src, long dest_size);

    public long strlcpy(Pointer dest, Pointer src, long dest_size) {
        return this.g_strlcpy(Pointer.getPeer(dest), Pointer.getPeer(src), dest_size);
    }

    protected native int g_strncasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2, long n);

    public int strncasecmp(Pointer s1, Pointer s2, long n) {
        return this.g_strncasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2), n);
    }

    @Ptr
    protected native long g_strndup(
        @Ptr
        long str, long n);

    public Pointer strndup(Pointer str, long n) {
        return Pointer.pointerToAddress(this.g_strndup(Pointer.getPeer(str), n));
    }

    @Ptr
    protected native long g_strnfill(long length, char fill_char);

    public Pointer strnfill(long length, char fill_char) {
        return Pointer.pointerToAddress(this.g_strnfill(length, fill_char));
    }

    @Ptr
    protected native long g_strreverse(
        @Ptr
        long string);

    public Pointer strreverse(Pointer string) {
        return Pointer.pointerToAddress(this.g_strreverse(Pointer.getPeer(string)));
    }

    @Ptr
    protected native long g_strrstr(
        @Ptr
        long haystack,
        @Ptr
        long needle);

    public Pointer strrstr(Pointer haystack, Pointer needle) {
        return Pointer.pointerToAddress(this.g_strrstr(Pointer.getPeer(haystack), Pointer.getPeer(needle)));
    }

    @Ptr
    protected native long g_strrstr_len(
        @Ptr
        long haystack, long haystack_len,
        @Ptr
        long needle);

    public Pointer strrstr_len(Pointer haystack, long haystack_len, Pointer needle) {
        return Pointer.pointerToAddress(this.g_strrstr_len(Pointer.getPeer(haystack), haystack_len, Pointer.getPeer(needle)));
    }

    @Ptr
    protected native long g_strsignal(int signum);

    public Pointer strsignal(int signum) {
        return Pointer.pointerToAddress(this.g_strsignal(signum));
    }

    @Ptr
    protected native long g_strsplit(
        @Ptr
        long string,
        @Ptr
        long delimiter, int max_tokens);

    public Pointer strsplit(Pointer string, Pointer delimiter, int max_tokens) {
        return Pointer.pointerToAddress(this.g_strsplit(Pointer.getPeer(string), Pointer.getPeer(delimiter), max_tokens));
    }

    @Ptr
    protected native long g_strsplit_set(
        @Ptr
        long string,
        @Ptr
        long delimiters, int max_tokens);

    public Pointer strsplit_set(Pointer string, Pointer delimiters, int max_tokens) {
        return Pointer.pointerToAddress(this.g_strsplit_set(Pointer.getPeer(string), Pointer.getPeer(delimiters), max_tokens));
    }

    @Ptr
    protected native long g_strstr_len(
        @Ptr
        long haystack, long haystack_len,
        @Ptr
        long needle);

    public Pointer strstr_len(Pointer haystack, long haystack_len, Pointer needle) {
        return Pointer.pointerToAddress(this.g_strstr_len(Pointer.getPeer(haystack), haystack_len, Pointer.getPeer(needle)));
    }

    protected native double g_strtod(
        @Ptr
        long nptr,
        @Ptr
        long endptr);

    public double strtod(Pointer nptr, Pointer endptr) {
        return this.g_strtod(Pointer.getPeer(nptr), Pointer.getPeer(endptr));
    }

    @Ptr
    protected native long g_strup(
        @Ptr
        long string);

    public Pointer strup(Pointer string) {
        return Pointer.pointerToAddress(this.g_strup(Pointer.getPeer(string)));
    }

    public native long g_strv_get_type();

    protected native long g_strv_length(
        @Ptr
        long str_array);

    public long strv_length(Pointer str_array) {
        return this.g_strv_length(Pointer.getPeer(str_array));
    }

    protected native void g_test_add_data_func(
        @Ptr
        long testpath, Pointer test_data, Object test_func);

    public void test_add_data_func(Pointer testpath, Pointer test_data, Object test_func) {
        this.g_test_add_data_func(Pointer.getPeer(testpath), test_data, test_func);
    }

    protected native void g_test_add_data_func_full(
        @Ptr
        long testpath, Pointer test_data, Object test_func, Object data_free_func);

    public void test_add_data_func_full(Pointer testpath, Pointer test_data, Object test_func, Object data_free_func) {
        this.g_test_add_data_func_full(Pointer.getPeer(testpath), test_data, test_func, data_free_func);
    }

    protected native void g_test_add_func(
        @Ptr
        long testpath, Object test_func);

    public void test_add_func(Pointer testpath, Object test_func) {
        this.g_test_add_func(Pointer.getPeer(testpath), test_func);
    }

    protected native void g_test_add_vtable(
        @Ptr
        long testpath, long data_size, Pointer test_data, Object data_setup, Object data_test, Object data_teardown);

    public void test_add_vtable(Pointer testpath, long data_size, Pointer test_data, Object data_setup, Object data_test, Object data_teardown) {
        this.g_test_add_vtable(Pointer.getPeer(testpath), data_size, test_data, data_setup, data_test, data_teardown);
    }

    protected native void g_test_assert_expected_messages_internal(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func);

    public void test_assert_expected_messages_internal(Pointer domain, Pointer file, int line, Pointer func) {
        this.g_test_assert_expected_messages_internal(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func));
    }

    protected native void g_test_bug(
        @Ptr
        long bug_uri_snippet);

    public void test_bug(Pointer bug_uri_snippet) {
        this.g_test_bug(Pointer.getPeer(bug_uri_snippet));
    }

    protected native void g_test_bug_base(
        @Ptr
        long uri_pattern);

    public void test_bug_base(Pointer uri_pattern) {
        this.g_test_bug_base(Pointer.getPeer(uri_pattern));
    }

    @Ptr
    protected native long g_test_build_filename(IntValuedEnum<GTestFileType> file_type,
        @Ptr
        long first_path, Object... varargs);

    public Pointer test_build_filename(IntValuedEnum<GTestFileType> file_type, Pointer first_path, Object... varargs) {
        return Pointer.pointerToAddress(this.g_test_build_filename(file_type, Pointer.getPeer(first_path), varargs));
    }

    @Ptr
    protected native long g_test_create_case(
        @Ptr
        long test_name, long data_size, Pointer test_data, Object data_setup, Object data_test, Object data_teardown);

    public Pointer<GTestCase> test_create_case(Pointer test_name, long data_size, Pointer test_data, Object data_setup, Object data_test, Object data_teardown) {
        return Pointer.pointerToAddress(this.g_test_create_case(Pointer.getPeer(test_name), data_size, test_data, data_setup, data_test, data_teardown), Pointer.class);
    }

    @Ptr
    protected native long g_test_create_suite(
        @Ptr
        long suite_name);

    public Pointer<GTestSuite> test_create_suite(Pointer suite_name) {
        return Pointer.pointerToAddress(this.g_test_create_suite(Pointer.getPeer(suite_name)), Pointer.class);
    }

    protected native void g_test_expect_message(
        @Ptr
        long log_domain, Object log_level,
        @Ptr
        long pattern);

    public void test_expect_message(Pointer log_domain, Object log_level, Pointer pattern) {
        this.g_test_expect_message(Pointer.getPeer(log_domain), log_level, Pointer.getPeer(pattern));
    }

    public native void g_test_fail();

    public native boolean g_test_failed();

    @Ptr
    protected native long g_test_get_dir(IntValuedEnum<GTestFileType> file_type);

    public Pointer test_get_dir(IntValuedEnum<GTestFileType> file_type) {
        return Pointer.pointerToAddress(this.g_test_get_dir(file_type));
    }

    @Ptr
    protected native long g_test_get_filename(IntValuedEnum<GTestFileType> file_type,
        @Ptr
        long first_path, Object... varargs);

    public Pointer test_get_filename(IntValuedEnum<GTestFileType> file_type, Pointer first_path, Object... varargs) {
        return Pointer.pointerToAddress(this.g_test_get_filename(file_type, Pointer.getPeer(first_path), varargs));
    }

    @Ptr
    protected native long g_test_get_root();

    public Pointer<GTestSuite> test_get_root() {
        return Pointer.pointerToAddress(this.g_test_get_root(), Pointer.class);
    }

    protected native void g_test_incomplete(
        @Ptr
        long msg);

    public void test_incomplete(Pointer msg) {
        this.g_test_incomplete(Pointer.getPeer(msg));
    }

    protected native void g_test_init(
        @Ptr
        long argc,
        @Ptr
        long argv, Object... varargs);

    public void test_init(Pointer<Integer> argc, Pointer argv, Object... varargs) {
        this.g_test_init(Pointer.getPeer(argc), Pointer.getPeer(argv), varargs);
    }

    public native void g_test_log_set_fatal_handler(Object log_func, Pointer user_data);

    @Ptr
    protected native long g_test_log_type_name(IntValuedEnum<GTestLogType> log_type);

    public Pointer test_log_type_name(IntValuedEnum<GTestLogType> log_type) {
        return Pointer.pointerToAddress(this.g_test_log_type_name(log_type));
    }

    protected native void g_test_maximized_result(double maximized_quantity,
        @Ptr
        long format, Object... varargs);

    public void test_maximized_result(double maximized_quantity, Pointer format, Object... varargs) {
        this.g_test_maximized_result(maximized_quantity, Pointer.getPeer(format), varargs);
    }

    protected native void g_test_message(
        @Ptr
        long format, Object... varargs);

    public void test_message(Pointer format, Object... varargs) {
        this.g_test_message(Pointer.getPeer(format), varargs);
    }

    protected native void g_test_minimized_result(double minimized_quantity,
        @Ptr
        long format, Object... varargs);

    public void test_minimized_result(double minimized_quantity, Pointer format, Object... varargs) {
        this.g_test_minimized_result(minimized_quantity, Pointer.getPeer(format), varargs);
    }

    public native void g_test_queue_destroy(Object destroy_func, Pointer destroy_data);

    public native void g_test_queue_free(Pointer gfree_pointer);

    public native double g_test_rand_double();

    public native double g_test_rand_double_range(double range_start, double range_end);

    public native int g_test_rand_int();

    public native int g_test_rand_int_range(int begin, int end);

    public native int g_test_run();

    protected native int g_test_run_suite(
        @Ptr
        long suite);

    public int test_run_suite(Pointer<GTestSuite> suite) {
        return this.g_test_run_suite(Pointer.getPeer(suite));
    }

    public native void g_test_set_nonfatal_assertions();

    protected native void g_test_skip(
        @Ptr
        long msg);

    public void test_skip(Pointer msg) {
        this.g_test_skip(Pointer.getPeer(msg));
    }

    public native boolean g_test_subprocess();

    public native double g_test_timer_elapsed();

    public native double g_test_timer_last();

    public native void g_test_timer_start();

    protected native void g_test_trap_assertions(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func, long assertion_flags,
        @Ptr
        long pattern);

    public void test_trap_assertions(Pointer domain, Pointer file, int line, Pointer func, long assertion_flags, Pointer pattern) {
        this.g_test_trap_assertions(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), assertion_flags, Pointer.getPeer(pattern));
    }

    public native boolean g_test_trap_fork(long usec_timeout, Object test_trap_flags);

    public native boolean g_test_trap_has_passed();

    public native boolean g_test_trap_reached_timeout();

    protected native void g_test_trap_subprocess(
        @Ptr
        long test_path, long usec_timeout, Object test_flags);

    public void test_trap_subprocess(Pointer test_path, long usec_timeout, Object test_flags) {
        this.g_test_trap_subprocess(Pointer.getPeer(test_path), usec_timeout, test_flags);
    }

    public native Object g_thread_error_quark();

    public native void g_thread_exit(Pointer retval);

    public native long g_thread_pool_get_max_idle_time();

    public native int g_thread_pool_get_max_unused_threads();

    public native long g_thread_pool_get_num_unused_threads();

    public native void g_thread_pool_set_max_idle_time(long interval);

    public native void g_thread_pool_set_max_unused_threads(int max_threads);

    public native void g_thread_pool_stop_unused_threads();

    @Ptr
    protected native long g_thread_self();

    public Pointer<GThread> thread_self() {
        return Pointer.pointerToAddress(this.g_thread_self(), Pointer.class);
    }

    public native void g_thread_yield();

    protected native boolean g_time_val_from_iso8601(
        @Ptr
        long iso_date,
        @Ptr
        long time_);

    public boolean time_val_from_iso8601(Pointer iso_date, Pointer<GTimeVal> time_) {
        return this.g_time_val_from_iso8601(Pointer.getPeer(iso_date), Pointer.getPeer(time_));
    }

    public native long g_timeout_add(long interval, Object function, Pointer data);

    public native long g_timeout_add_full(int priority, long interval, Object function, Pointer data, Object notify);

    public native long g_timeout_add_seconds(long interval, Object function, Pointer data);

    public native long g_timeout_add_seconds_full(int priority, long interval, Object function, Pointer data, Object notify);

    @Ptr
    protected native long g_timeout_source_new(long interval);

    public Pointer<GSource> timeout_source_new(long interval) {
        return Pointer.pointerToAddress(this.g_timeout_source_new(interval), Pointer.class);
    }

    @Ptr
    protected native long g_timeout_source_new_seconds(long interval);

    public Pointer<GSource> timeout_source_new_seconds(long interval) {
        return Pointer.pointerToAddress(this.g_timeout_source_new_seconds(interval), Pointer.class);
    }

    protected native long g_trash_stack_height(
        @Ptr
        long stack_p);

    public long trash_stack_height(Pointer<Pointer<GTrashStack>> stack_p) {
        return this.g_trash_stack_height(Pointer.getPeer(stack_p));
    }

    protected native void g_trash_stack_push(
        @Ptr
        long stack_p, Pointer data_p);

    public void trash_stack_push(Pointer<Pointer<GTrashStack>> stack_p, Pointer data_p) {
        this.g_trash_stack_push(Pointer.getPeer(stack_p), data_p);
    }

    public native Pointer g_try_malloc(long n_bytes);

    public native Pointer g_try_malloc0(long n_bytes);

    public native Pointer g_try_malloc0_n(long n_blocks, long n_block_bytes);

    public native Pointer g_try_malloc_n(long n_blocks, long n_block_bytes);

    public native Pointer g_try_realloc(Pointer mem, long n_bytes);

    public native Pointer g_try_realloc_n(Pointer mem, long n_blocks, long n_block_bytes);

    @Ptr
    protected native long g_ucs4_to_utf16(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public Pointer<Integer> ucs4_to_utf16(Pointer<Long> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(this.g_ucs4_to_utf16(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Pointer.class);
    }

    @Ptr
    protected native long g_ucs4_to_utf8(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public Pointer ucs4_to_utf8(Pointer<Long> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(this.g_ucs4_to_utf8(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)));
    }

    public native IntValuedEnum<GUnicodeBreakType> g_unichar_break_type(long c);

    public native int g_unichar_combining_class(long uc);

    protected native boolean g_unichar_compose(long a, long b,
        @Ptr
        long ch);

    public boolean unichar_compose(long a, long b, Pointer<Long> ch) {
        return this.g_unichar_compose(a, b, Pointer.getPeer(ch));
    }

    protected native boolean g_unichar_decompose(long ch,
        @Ptr
        long a,
        @Ptr
        long b);

    public boolean unichar_decompose(long ch, Pointer<Long> a, Pointer<Long> b) {
        return this.g_unichar_decompose(ch, Pointer.getPeer(a), Pointer.getPeer(b));
    }

    public native int g_unichar_digit_value(long c);

    protected native long g_unichar_fully_decompose(long ch, boolean compat,
        @Ptr
        long result, long result_len);

    public long unichar_fully_decompose(long ch, boolean compat, Pointer<Long> result, long result_len) {
        return this.g_unichar_fully_decompose(ch, compat, Pointer.getPeer(result), result_len);
    }

    protected native boolean g_unichar_get_mirror_char(long ch,
        @Ptr
        long mirrored_ch);

    public boolean unichar_get_mirror_char(long ch, Pointer<Long> mirrored_ch) {
        return this.g_unichar_get_mirror_char(ch, Pointer.getPeer(mirrored_ch));
    }

    public native IntValuedEnum<GUnicodeScript> g_unichar_get_script(long ch);

    public native boolean g_unichar_isalnum(long c);

    public native boolean g_unichar_isalpha(long c);

    public native boolean g_unichar_iscntrl(long c);

    public native boolean g_unichar_isdefined(long c);

    public native boolean g_unichar_isdigit(long c);

    public native boolean g_unichar_isgraph(long c);

    public native boolean g_unichar_islower(long c);

    public native boolean g_unichar_ismark(long c);

    public native boolean g_unichar_isprint(long c);

    public native boolean g_unichar_ispunct(long c);

    public native boolean g_unichar_isspace(long c);

    public native boolean g_unichar_istitle(long c);

    public native boolean g_unichar_isupper(long c);

    public native boolean g_unichar_iswide(long c);

    public native boolean g_unichar_iswide_cjk(long c);

    public native boolean g_unichar_isxdigit(long c);

    public native boolean g_unichar_iszerowidth(long c);

    protected native int g_unichar_to_utf8(long c,
        @Ptr
        long outbuf);

    public int unichar_to_utf8(long c, Pointer outbuf) {
        return this.g_unichar_to_utf8(c, Pointer.getPeer(outbuf));
    }

    public native long g_unichar_tolower(long c);

    public native long g_unichar_totitle(long c);

    public native long g_unichar_toupper(long c);

    public native IntValuedEnum<GUnicodeType> g_unichar_type(long c);

    public native boolean g_unichar_validate(long ch);

    public native int g_unichar_xdigit_value(long c);

    @Ptr
    protected native long g_unicode_canonical_decomposition(long ch,
        @Ptr
        long result_len);

    public Pointer<Long> unicode_canonical_decomposition(long ch, Pointer<Long> result_len) {
        return Pointer.pointerToAddress(this.g_unicode_canonical_decomposition(ch, Pointer.getPeer(result_len)), Pointer.class);
    }

    protected native void g_unicode_canonical_ordering(
        @Ptr
        long string, long len);

    public void unicode_canonical_ordering(Pointer<Long> string, long len) {
        this.g_unicode_canonical_ordering(Pointer.getPeer(string), len);
    }

    public native IntValuedEnum<GUnicodeScript> g_unicode_script_from_iso15924(long iso15924);

    public native long g_unicode_script_to_iso15924(IntValuedEnum<GUnicodeScript> script);

    public native Object g_unix_error_quark();

    public native long g_unix_fd_add(int fd, Object condition, Object function, Pointer user_data);

    public native long g_unix_fd_add_full(int priority, int fd, Object condition, Object function, Pointer user_data, Object notify);

    @Ptr
    protected native long g_unix_fd_source_new(int fd, Object condition);

    public Pointer<GSource> unix_fd_source_new(int fd, Object condition) {
        return Pointer.pointerToAddress(this.g_unix_fd_source_new(fd, condition), Pointer.class);
    }

    protected native boolean g_unix_open_pipe(
        @Ptr
        long fds, int flags);

    public boolean unix_open_pipe(Pointer<Integer> fds, int flags) {
        return this.g_unix_open_pipe(Pointer.getPeer(fds), flags);
    }

    public native boolean g_unix_set_fd_nonblocking(int fd, boolean nonblock);

    public native long g_unix_signal_add(int signum, Object handler, Pointer user_data);

    public native long g_unix_signal_add_full(int priority, int signum, Object handler, Pointer user_data, Object notify);

    @Ptr
    protected native long g_unix_signal_source_new(int signum);

    public Pointer<GSource> unix_signal_source_new(int signum) {
        return Pointer.pointerToAddress(this.g_unix_signal_source_new(signum), Pointer.class);
    }

    protected native int g_unlink(
        @Ptr
        long filename);

    public int unlink(Pointer filename) {
        return this.g_unlink(Pointer.getPeer(filename));
    }

    protected native void g_unsetenv(
        @Ptr
        long variable);

    public void unsetenv(Pointer variable) {
        this.g_unsetenv(Pointer.getPeer(variable));
    }

    @Ptr
    protected native long g_uri_escape_string(
        @Ptr
        long unescaped,
        @Ptr
        long reserved_chars_allowed, boolean allow_utf8);

    public Pointer uri_escape_string(Pointer unescaped, Pointer reserved_chars_allowed, boolean allow_utf8) {
        return Pointer.pointerToAddress(this.g_uri_escape_string(Pointer.getPeer(unescaped), Pointer.getPeer(reserved_chars_allowed), allow_utf8));
    }

    @Ptr
    protected native long g_uri_list_extract_uris(
        @Ptr
        long uri_list);

    public Pointer uri_list_extract_uris(Pointer uri_list) {
        return Pointer.pointerToAddress(this.g_uri_list_extract_uris(Pointer.getPeer(uri_list)));
    }

    @Ptr
    protected native long g_uri_parse_scheme(
        @Ptr
        long uri);

    public Pointer uri_parse_scheme(Pointer uri) {
        return Pointer.pointerToAddress(this.g_uri_parse_scheme(Pointer.getPeer(uri)));
    }

    @Ptr
    protected native long g_uri_unescape_segment(
        @Ptr
        long escaped_string,
        @Ptr
        long escaped_string_end,
        @Ptr
        long illegal_characters);

    public Pointer uri_unescape_segment(Pointer escaped_string, Pointer escaped_string_end, Pointer illegal_characters) {
        return Pointer.pointerToAddress(this.g_uri_unescape_segment(Pointer.getPeer(escaped_string), Pointer.getPeer(escaped_string_end), Pointer.getPeer(illegal_characters)));
    }

    @Ptr
    protected native long g_uri_unescape_string(
        @Ptr
        long escaped_string,
        @Ptr
        long illegal_characters);

    public Pointer uri_unescape_string(Pointer escaped_string, Pointer illegal_characters) {
        return Pointer.pointerToAddress(this.g_uri_unescape_string(Pointer.getPeer(escaped_string), Pointer.getPeer(illegal_characters)));
    }

    public native void g_usleep(long microseconds);

    @Ptr
    protected native long g_utf16_to_ucs4(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public Pointer<Long> utf16_to_ucs4(Pointer<Integer> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(this.g_utf16_to_ucs4(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Pointer.class);
    }

    @Ptr
    protected native long g_utf16_to_utf8(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public Pointer utf16_to_utf8(Pointer<Integer> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(this.g_utf16_to_utf8(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)));
    }

    @Ptr
    protected native long g_utf8_casefold(
        @Ptr
        long str, long len);

    public Pointer utf8_casefold(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_utf8_casefold(Pointer.getPeer(str), len));
    }

    protected native int g_utf8_collate(
        @Ptr
        long str1,
        @Ptr
        long str2);

    public int utf8_collate(Pointer str1, Pointer str2) {
        return this.g_utf8_collate(Pointer.getPeer(str1), Pointer.getPeer(str2));
    }

    @Ptr
    protected native long g_utf8_collate_key(
        @Ptr
        long str, long len);

    public Pointer utf8_collate_key(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_utf8_collate_key(Pointer.getPeer(str), len));
    }

    @Ptr
    protected native long g_utf8_collate_key_for_filename(
        @Ptr
        long str, long len);

    public Pointer utf8_collate_key_for_filename(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_utf8_collate_key_for_filename(Pointer.getPeer(str), len));
    }

    @Ptr
    protected native long g_utf8_find_next_char(
        @Ptr
        long p,
        @Ptr
        long end);

    public Pointer utf8_find_next_char(Pointer p, Pointer end) {
        return Pointer.pointerToAddress(this.g_utf8_find_next_char(Pointer.getPeer(p), Pointer.getPeer(end)));
    }

    @Ptr
    protected native long g_utf8_find_prev_char(
        @Ptr
        long str,
        @Ptr
        long p);

    public Pointer utf8_find_prev_char(Pointer str, Pointer p) {
        return Pointer.pointerToAddress(this.g_utf8_find_prev_char(Pointer.getPeer(str), Pointer.getPeer(p)));
    }

    protected native long g_utf8_get_char(
        @Ptr
        long p);

    public long utf8_get_char(Pointer p) {
        return this.g_utf8_get_char(Pointer.getPeer(p));
    }

    protected native long g_utf8_get_char_validated(
        @Ptr
        long p, long max_len);

    public long utf8_get_char_validated(Pointer p, long max_len) {
        return this.g_utf8_get_char_validated(Pointer.getPeer(p), max_len);
    }

    @Ptr
    protected native long g_utf8_normalize(
        @Ptr
        long str, long len, IntValuedEnum<GNormalizeMode> mode);

    public Pointer utf8_normalize(Pointer str, long len, IntValuedEnum<GNormalizeMode> mode) {
        return Pointer.pointerToAddress(this.g_utf8_normalize(Pointer.getPeer(str), len, mode));
    }

    @Ptr
    protected native long g_utf8_offset_to_pointer(
        @Ptr
        long str, long offset);

    public Pointer utf8_offset_to_pointer(Pointer str, long offset) {
        return Pointer.pointerToAddress(this.g_utf8_offset_to_pointer(Pointer.getPeer(str), offset));
    }

    protected native long g_utf8_pointer_to_offset(
        @Ptr
        long str,
        @Ptr
        long pos);

    public long utf8_pointer_to_offset(Pointer str, Pointer pos) {
        return this.g_utf8_pointer_to_offset(Pointer.getPeer(str), Pointer.getPeer(pos));
    }

    @Ptr
    protected native long g_utf8_prev_char(
        @Ptr
        long p);

    public Pointer utf8_prev_char(Pointer p) {
        return Pointer.pointerToAddress(this.g_utf8_prev_char(Pointer.getPeer(p)));
    }

    @Ptr
    protected native long g_utf8_strchr(
        @Ptr
        long p, long len, long c);

    public Pointer utf8_strchr(Pointer p, long len, long c) {
        return Pointer.pointerToAddress(this.g_utf8_strchr(Pointer.getPeer(p), len, c));
    }

    @Ptr
    protected native long g_utf8_strdown(
        @Ptr
        long str, long len);

    public Pointer utf8_strdown(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_utf8_strdown(Pointer.getPeer(str), len));
    }

    protected native long g_utf8_strlen(
        @Ptr
        long p, long max);

    public long utf8_strlen(Pointer p, long max) {
        return this.g_utf8_strlen(Pointer.getPeer(p), max);
    }

    @Ptr
    protected native long g_utf8_strncpy(
        @Ptr
        long dest,
        @Ptr
        long src, long n);

    public Pointer utf8_strncpy(Pointer dest, Pointer src, long n) {
        return Pointer.pointerToAddress(this.g_utf8_strncpy(Pointer.getPeer(dest), Pointer.getPeer(src), n));
    }

    @Ptr
    protected native long g_utf8_strrchr(
        @Ptr
        long p, long len, long c);

    public Pointer utf8_strrchr(Pointer p, long len, long c) {
        return Pointer.pointerToAddress(this.g_utf8_strrchr(Pointer.getPeer(p), len, c));
    }

    @Ptr
    protected native long g_utf8_strreverse(
        @Ptr
        long str, long len);

    public Pointer utf8_strreverse(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_utf8_strreverse(Pointer.getPeer(str), len));
    }

    @Ptr
    protected native long g_utf8_strup(
        @Ptr
        long str, long len);

    public Pointer utf8_strup(Pointer str, long len) {
        return Pointer.pointerToAddress(this.g_utf8_strup(Pointer.getPeer(str), len));
    }

    @Ptr
    protected native long g_utf8_substring(
        @Ptr
        long str, long start_pos, long end_pos);

    public Pointer utf8_substring(Pointer str, long start_pos, long end_pos) {
        return Pointer.pointerToAddress(this.g_utf8_substring(Pointer.getPeer(str), start_pos, end_pos));
    }

    @Ptr
    protected native long g_utf8_to_ucs4(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public Pointer<Long> utf8_to_ucs4(Pointer str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(this.g_utf8_to_ucs4(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Pointer.class);
    }

    @Ptr
    protected native long g_utf8_to_ucs4_fast(
        @Ptr
        long str, long len,
        @Ptr
        long items_written);

    public Pointer<Long> utf8_to_ucs4_fast(Pointer str, long len, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(this.g_utf8_to_ucs4_fast(Pointer.getPeer(str), len, Pointer.getPeer(items_written)), Pointer.class);
    }

    @Ptr
    protected native long g_utf8_to_utf16(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public Pointer<Integer> utf8_to_utf16(Pointer str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(this.g_utf8_to_utf16(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Pointer.class);
    }

    protected native boolean g_utf8_validate(
        @Ptr
        long str, long max_len,
        @Ptr
        long end);

    public boolean utf8_validate(short str, long max_len, Pointer end) {
        return this.g_utf8_validate(Pointer.getPeer(str), max_len, Pointer.getPeer(end));
    }

    public native long g_variant_get_gtype();

    protected native boolean g_variant_is_object_path(
        @Ptr
        long string);

    public boolean variant_is_object_path(Pointer string) {
        return this.g_variant_is_object_path(Pointer.getPeer(string));
    }

    protected native boolean g_variant_is_signature(
        @Ptr
        long string);

    public boolean variant_is_signature(Pointer string) {
        return this.g_variant_is_signature(Pointer.getPeer(string));
    }

    @Ptr
    protected native long g_variant_parse(
        @Ptr
        long type,
        @Ptr
        long text,
        @Ptr
        long limit,
        @Ptr
        long endptr);

    public Pointer<GVariant> variant_parse(Pointer<GVariantType> type, Pointer text, Pointer limit, Pointer endptr) {
        return Pointer.pointerToAddress(this.g_variant_parse(Pointer.getPeer(type), Pointer.getPeer(text), Pointer.getPeer(limit), Pointer.getPeer(endptr)), Pointer.class);
    }

    @Ptr
    protected native long g_variant_parse_error_print_context(
        @Ptr
        long error,
        @Ptr
        long source_str);

    public Pointer variant_parse_error_print_context(Pointer<GError> error, Pointer source_str) {
        return Pointer.pointerToAddress(this.g_variant_parse_error_print_context(Pointer.getPeer(error), Pointer.getPeer(source_str)));
    }

    public native Object g_variant_parse_error_quark();

    public native Object g_variant_parser_get_error_quark();

    @Ptr
    protected native long g_variant_type_checked_(
        @Ptr
        long arg0);

    public Pointer<GVariantType> variant_type_checked_(Pointer arg0) {
        return Pointer.pointerToAddress(this.g_variant_type_checked_(Pointer.getPeer(arg0)), Pointer.class);
    }

    protected native boolean g_variant_type_string_is_valid(
        @Ptr
        long type_string);

    public boolean variant_type_string_is_valid(Pointer type_string) {
        return this.g_variant_type_string_is_valid(Pointer.getPeer(type_string));
    }

    protected native boolean g_variant_type_string_scan(
        @Ptr
        long string,
        @Ptr
        long limit,
        @Ptr
        long endptr);

    public boolean variant_type_string_scan(Pointer string, Pointer limit, Pointer endptr) {
        return this.g_variant_type_string_scan(Pointer.getPeer(string), Pointer.getPeer(limit), Pointer.getPeer(endptr));
    }

    protected native void g_warn_message(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long warnexpr);

    public void warn_message(Pointer domain, Pointer file, int line, Pointer func, Pointer warnexpr) {
        this.g_warn_message(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(warnexpr));
    }

}
