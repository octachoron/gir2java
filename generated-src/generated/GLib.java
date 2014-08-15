
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
import generated.glib20.glib.GFileTest;
import generated.glib20.glib.GFormatSizeFlags;
import generated.glib20.glib.GHashTable;
import generated.glib20.glib.GHook;
import generated.glib20.glib.GHookList;
import generated.glib20.glib.GIOChannel;
import generated.glib20.glib.GIOChannelError;
import generated.glib20.glib.GIOCondition;
import generated.glib20.glib.GLogLevelFlags;
import generated.glib20.glib.GMainContext;
import generated.glib20.glib.GMarkupCollectType;
import generated.glib20.glib.GMemVTable;
import generated.glib20.glib.GNormalizeMode;
import generated.glib20.glib.GPatternSpec;
import generated.glib20.glib.GPollFD;
import generated.glib20.glib.GRegexCompileFlags;
import generated.glib20.glib.GRegexMatchFlags;
import generated.glib20.glib.GSequenceIter;
import generated.glib20.glib.GSliceConfig;
import generated.glib20.glib.GSource;
import generated.glib20.glib.GSourceFuncs;
import generated.glib20.glib.GSpawnFlags;
import generated.glib20.glib.GString;
import generated.glib20.glib.GTestCase;
import generated.glib20.glib.GTestFileType;
import generated.glib20.glib.GTestLogType;
import generated.glib20.glib.GTestSubprocessFlags;
import generated.glib20.glib.GTestSuite;
import generated.glib20.glib.GTestTrapFlags;
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


    protected static native int g_access(
        @Ptr
        long filename, int mode);

    public static int access(Pointer filename, int mode) {
        return GLib.g_access(Pointer.getPeer(filename), mode);
    }

    public static native int g_ascii_digit_value(char c);

    @Ptr
    protected static native long g_ascii_dtostr(
        @Ptr
        long buffer, int buf_len, double d);

    public static Pointer ascii_dtostr(Pointer buffer, int buf_len, double d) {
        return Pointer.pointerToAddress(GLib.g_ascii_dtostr(Pointer.getPeer(buffer), buf_len, d));
    }

    @Ptr
    protected static native long g_ascii_formatd(
        @Ptr
        long buffer, int buf_len,
        @Ptr
        long format, double d);

    public static Pointer ascii_formatd(Pointer buffer, int buf_len, Pointer format, double d) {
        return Pointer.pointerToAddress(GLib.g_ascii_formatd(Pointer.getPeer(buffer), buf_len, Pointer.getPeer(format), d));
    }

    protected static native int g_ascii_strcasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2);

    public static int ascii_strcasecmp(Pointer s1, Pointer s2) {
        return GLib.g_ascii_strcasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2));
    }

    @Ptr
    protected static native long g_ascii_strdown(
        @Ptr
        long str, long len);

    public static Pointer ascii_strdown(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_ascii_strdown(Pointer.getPeer(str), len));
    }

    protected static native int g_ascii_strncasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2, long n);

    public static int ascii_strncasecmp(Pointer s1, Pointer s2, long n) {
        return GLib.g_ascii_strncasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2), n);
    }

    protected static native double g_ascii_strtod(
        @Ptr
        long nptr,
        @Ptr
        long endptr);

    public static double ascii_strtod(Pointer nptr, Pointer endptr) {
        return GLib.g_ascii_strtod(Pointer.getPeer(nptr), Pointer.getPeer(endptr));
    }

    protected static native long g_ascii_strtoll(
        @Ptr
        long nptr,
        @Ptr
        long endptr, long base);

    public static long ascii_strtoll(Pointer nptr, Pointer endptr, long base) {
        return GLib.g_ascii_strtoll(Pointer.getPeer(nptr), Pointer.getPeer(endptr), base);
    }

    protected static native long g_ascii_strtoull(
        @Ptr
        long nptr,
        @Ptr
        long endptr, long base);

    public static long ascii_strtoull(Pointer nptr, Pointer endptr, long base) {
        return GLib.g_ascii_strtoull(Pointer.getPeer(nptr), Pointer.getPeer(endptr), base);
    }

    @Ptr
    protected static native long g_ascii_strup(
        @Ptr
        long str, long len);

    public static Pointer ascii_strup(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_ascii_strup(Pointer.getPeer(str), len));
    }

    public static native char g_ascii_tolower(char c);

    public static native char g_ascii_toupper(char c);

    public static native int g_ascii_xdigit_value(char c);

    protected static native void g_assert_warning(
        @Ptr
        long log_domain,
        @Ptr
        long file, int line,
        @Ptr
        long pretty_function,
        @Ptr
        long expression);

    public static void assert_warning(Pointer log_domain, Pointer file, int line, Pointer pretty_function, Pointer expression) {
        GLib.g_assert_warning(Pointer.getPeer(log_domain), Pointer.getPeer(file), line, Pointer.getPeer(pretty_function), Pointer.getPeer(expression));
    }

    protected static native void g_assertion_message(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long message);

    public static void assertion_message(Pointer domain, Pointer file, int line, Pointer func, Pointer message) {
        GLib.g_assertion_message(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(message));
    }

    protected static native void g_assertion_message_cmpstr(
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

    public static void assertion_message_cmpstr(Pointer domain, Pointer file, int line, Pointer func, Pointer expr, Pointer arg1, Pointer cmp, Pointer arg2) {
        GLib.g_assertion_message_cmpstr(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(expr), Pointer.getPeer(arg1), Pointer.getPeer(cmp), Pointer.getPeer(arg2));
    }

    protected static native void g_assertion_message_error(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long expr,
        @Ptr
        long error, long error_domain, int error_code);

    public static void assertion_message_error(Pointer domain, Pointer file, int line, Pointer func, Pointer expr, Pointer<GError> error, long error_domain, int error_code) {
        GLib.g_assertion_message_error(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(expr), Pointer.getPeer(error), error_domain, error_code);
    }

    protected static native void g_assertion_message_expr(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long expr);

    public static void assertion_message_expr(Pointer domain, Pointer file, int line, Pointer func, Pointer expr) {
        GLib.g_assertion_message_expr(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(expr));
    }

    protected static native void g_atexit(
        @Ptr
        long func);

    public static void atexit(Pointer func) {
        GLib.g_atexit(Pointer.getPeer(func));
    }

    protected static native int g_atomic_int_add(
        @Ptr
        long atomic, int val);

    public static int atomic_int_add(Pointer<Integer> atomic, int val) {
        return GLib.g_atomic_int_add(Pointer.getPeer(atomic), val);
    }

    protected static native long g_atomic_int_and(
        @Ptr
        long atomic, long val);

    public static long atomic_int_and(Pointer<Long> atomic, long val) {
        return GLib.g_atomic_int_and(Pointer.getPeer(atomic), val);
    }

    protected static native boolean g_atomic_int_compare_and_exchange(
        @Ptr
        long atomic, int oldval, int newval);

    public static boolean atomic_int_compare_and_exchange(Pointer<Integer> atomic, int oldval, int newval) {
        return GLib.g_atomic_int_compare_and_exchange(Pointer.getPeer(atomic), oldval, newval);
    }

    protected static native boolean g_atomic_int_dec_and_test(
        @Ptr
        long atomic);

    public static boolean atomic_int_dec_and_test(Pointer<Integer> atomic) {
        return GLib.g_atomic_int_dec_and_test(Pointer.getPeer(atomic));
    }

    protected static native int g_atomic_int_exchange_and_add(
        @Ptr
        long atomic, int val);

    public static int atomic_int_exchange_and_add(Pointer<Integer> atomic, int val) {
        return GLib.g_atomic_int_exchange_and_add(Pointer.getPeer(atomic), val);
    }

    protected static native int g_atomic_int_get(
        @Ptr
        long atomic);

    public static int atomic_int_get(Pointer<Integer> atomic) {
        return GLib.g_atomic_int_get(Pointer.getPeer(atomic));
    }

    protected static native void g_atomic_int_inc(
        @Ptr
        long atomic);

    public static void atomic_int_inc(Pointer<Integer> atomic) {
        GLib.g_atomic_int_inc(Pointer.getPeer(atomic));
    }

    protected static native long g_atomic_int_or(
        @Ptr
        long atomic, long val);

    public static long atomic_int_or(Pointer<Long> atomic, long val) {
        return GLib.g_atomic_int_or(Pointer.getPeer(atomic), val);
    }

    protected static native void g_atomic_int_set(
        @Ptr
        long atomic, int newval);

    public static void atomic_int_set(Pointer<Integer> atomic, int newval) {
        GLib.g_atomic_int_set(Pointer.getPeer(atomic), newval);
    }

    protected static native long g_atomic_int_xor(
        @Ptr
        long atomic, long val);

    public static long atomic_int_xor(Pointer<Long> atomic, long val) {
        return GLib.g_atomic_int_xor(Pointer.getPeer(atomic), val);
    }

    protected static native long g_atomic_pointer_add(
        @Ptr
        long atomic, long val);

    public static long atomic_pointer_add(Pointer atomic, long val) {
        return GLib.g_atomic_pointer_add(Pointer.getPeer(atomic), val);
    }

    protected static native long g_atomic_pointer_and(
        @Ptr
        long atomic, long val);

    public static long atomic_pointer_and(Pointer atomic, long val) {
        return GLib.g_atomic_pointer_and(Pointer.getPeer(atomic), val);
    }

    protected static native boolean g_atomic_pointer_compare_and_exchange(
        @Ptr
        long atomic,
        @Ptr
        long oldval,
        @Ptr
        long newval);

    public static boolean atomic_pointer_compare_and_exchange(Pointer atomic, Pointer oldval, Pointer newval) {
        return GLib.g_atomic_pointer_compare_and_exchange(Pointer.getPeer(atomic), Pointer.getPeer(oldval), Pointer.getPeer(newval));
    }

    @Ptr
    protected static native long g_atomic_pointer_get(
        @Ptr
        long atomic);

    public static Pointer atomic_pointer_get(Pointer atomic) {
        return Pointer.pointerToAddress(GLib.g_atomic_pointer_get(Pointer.getPeer(atomic)));
    }

    protected static native long g_atomic_pointer_or(
        @Ptr
        long atomic, long val);

    public static long atomic_pointer_or(Pointer atomic, long val) {
        return GLib.g_atomic_pointer_or(Pointer.getPeer(atomic), val);
    }

    protected static native void g_atomic_pointer_set(
        @Ptr
        long atomic,
        @Ptr
        long newval);

    public static void atomic_pointer_set(Pointer atomic, Pointer newval) {
        GLib.g_atomic_pointer_set(Pointer.getPeer(atomic), Pointer.getPeer(newval));
    }

    protected static native long g_atomic_pointer_xor(
        @Ptr
        long atomic, long val);

    public static long atomic_pointer_xor(Pointer atomic, long val) {
        return GLib.g_atomic_pointer_xor(Pointer.getPeer(atomic), val);
    }

    @Ptr
    protected static native long g_base64_decode(
        @Ptr
        long text,
        @Ptr
        long out_len);

    public static Pointer<Short> base64_decode(Pointer text, Pointer<Long> out_len) {
        return Pointer.pointerToAddress(GLib.g_base64_decode(Pointer.getPeer(text), Pointer.getPeer(out_len)), Short.class);
    }

    @Ptr
    protected static native long g_base64_decode_inplace(
        @Ptr
        long text,
        @Ptr
        long out_len);

    public static Pointer<Short> base64_decode_inplace(Pointer<Short> text, Pointer<Long> out_len) {
        return Pointer.pointerToAddress(GLib.g_base64_decode_inplace(Pointer.getPeer(text), Pointer.getPeer(out_len)), Short.class);
    }

    protected static native long g_base64_decode_step(
        @Ptr
        long in, long len,
        @Ptr
        long out,
        @Ptr
        long state,
        @Ptr
        long save);

    public static long base64_decode_step(Pointer<Short> in, long len, Pointer<Short> out, Pointer<Integer> state, Pointer<Long> save) {
        return GLib.g_base64_decode_step(Pointer.getPeer(in), len, Pointer.getPeer(out), Pointer.getPeer(state), Pointer.getPeer(save));
    }

    @Ptr
    protected static native long g_base64_encode(
        @Ptr
        long data, long len);

    public static Pointer base64_encode(Pointer<Short> data, long len) {
        return Pointer.pointerToAddress(GLib.g_base64_encode(Pointer.getPeer(data), len));
    }

    protected static native long g_base64_encode_close(boolean break_lines,
        @Ptr
        long out,
        @Ptr
        long state,
        @Ptr
        long save);

    public static long base64_encode_close(boolean break_lines, Pointer<Short> out, Pointer<Integer> state, Pointer<Integer> save) {
        return GLib.g_base64_encode_close(break_lines, Pointer.getPeer(out), Pointer.getPeer(state), Pointer.getPeer(save));
    }

    protected static native long g_base64_encode_step(
        @Ptr
        long in, long len, boolean break_lines,
        @Ptr
        long out,
        @Ptr
        long state,
        @Ptr
        long save);

    public static long base64_encode_step(Pointer<Short> in, long len, boolean break_lines, Pointer<Short> out, Pointer<Integer> state, Pointer<Integer> save) {
        return GLib.g_base64_encode_step(Pointer.getPeer(in), len, break_lines, Pointer.getPeer(out), Pointer.getPeer(state), Pointer.getPeer(save));
    }

    @Ptr
    protected static native long g_basename(
        @Ptr
        long file_name);

    public static Pointer basename(Pointer file_name) {
        return Pointer.pointerToAddress(GLib.g_basename(Pointer.getPeer(file_name)));
    }

    protected static native void g_bit_lock(
        @Ptr
        long address, int lock_bit);

    public static void bit_lock(Pointer<Integer> address, int lock_bit) {
        GLib.g_bit_lock(Pointer.getPeer(address), lock_bit);
    }

    public static native int g_bit_nth_lsf(long mask, int nth_bit);

    public static native int g_bit_nth_msf(long mask, int nth_bit);

    public static native long g_bit_storage(long number);

    protected static native boolean g_bit_trylock(
        @Ptr
        long address, int lock_bit);

    public static boolean bit_trylock(Pointer<Integer> address, int lock_bit) {
        return GLib.g_bit_trylock(Pointer.getPeer(address), lock_bit);
    }

    protected static native void g_bit_unlock(
        @Ptr
        long address, int lock_bit);

    public static void bit_unlock(Pointer<Integer> address, int lock_bit) {
        GLib.g_bit_unlock(Pointer.getPeer(address), lock_bit);
    }

    public static native long g_bookmark_file_error_quark();

    @Ptr
    protected static native long g_build_filename(
        @Ptr
        long first_element, Object... varargs);

    public static Pointer build_filename(Pointer first_element, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_build_filename(Pointer.getPeer(first_element), varargs));
    }

    @Ptr
    protected static native long g_build_filenamev(
        @Ptr
        long args);

    public static Pointer build_filenamev(Pointer args) {
        return Pointer.pointerToAddress(GLib.g_build_filenamev(Pointer.getPeer(args)));
    }

    @Ptr
    protected static native long g_build_path(
        @Ptr
        long separator,
        @Ptr
        long first_element, Object... varargs);

    public static Pointer build_path(Pointer separator, Pointer first_element, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_build_path(Pointer.getPeer(separator), Pointer.getPeer(first_element), varargs));
    }

    @Ptr
    protected static native long g_build_pathv(
        @Ptr
        long separator,
        @Ptr
        long args);

    public static Pointer build_pathv(Pointer separator, Pointer args) {
        return Pointer.pointerToAddress(GLib.g_build_pathv(Pointer.getPeer(separator), Pointer.getPeer(args)));
    }

    @Ptr
    protected static native long g_byte_array_free(
        @Ptr
        long array, boolean free_segment);

    public static Pointer<Short> byte_array_free(Pointer<Short> array, boolean free_segment) {
        return Pointer.pointerToAddress(GLib.g_byte_array_free(Pointer.getPeer(array), free_segment), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_free_to_bytes(
        @Ptr
        long array);

    public static Pointer<GBytes> byte_array_free_to_bytes(Pointer<Short> array) {
        return Pointer.pointerToAddress(GLib.g_byte_array_free_to_bytes(Pointer.getPeer(array)), GBytes.class);
    }

    @Ptr
    protected static native long g_byte_array_new();

    public static Pointer<Short> byte_array_new() {
        return Pointer.pointerToAddress(GLib.g_byte_array_new(), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_new_take(
        @Ptr
        long data, long len);

    public static Pointer<Short> byte_array_new_take(Pointer<Short> data, long len) {
        return Pointer.pointerToAddress(GLib.g_byte_array_new_take(Pointer.getPeer(data), len), Short.class);
    }

    protected static native void g_byte_array_unref(
        @Ptr
        long array);

    public static void byte_array_unref(Pointer<Short> array) {
        GLib.g_byte_array_unref(Pointer.getPeer(array));
    }

    protected static native int g_chdir(
        @Ptr
        long path);

    public static int chdir(Pointer path) {
        return GLib.g_chdir(Pointer.getPeer(path));
    }

    @Ptr
    protected static native long glib_check_version(long required_major, long required_minor, long required_micro);

    public static Pointer check_version(long required_major, long required_minor, long required_micro) {
        return Pointer.pointerToAddress(GLib.glib_check_version(required_major, required_minor, required_micro));
    }

    public static native long g_checksum_type_get_length(IntValuedEnum<GChecksumType> checksum_type);

    protected static native long g_child_watch_add(int pid,
        @Ptr
        long function,
        @Ptr
        long data);

    public static long child_watch_add(int pid, Pointer function, Pointer data) {
        return GLib.g_child_watch_add(pid, Pointer.getPeer(function), Pointer.getPeer(data));
    }

    protected static native long g_child_watch_add_full(int priority, int pid,
        @Ptr
        long function,
        @Ptr
        long data,
        @Ptr
        long notify);

    public static long child_watch_add_full(int priority, int pid, Pointer function, Pointer data, Pointer notify) {
        return GLib.g_child_watch_add_full(priority, pid, Pointer.getPeer(function), Pointer.getPeer(data), Pointer.getPeer(notify));
    }

    @Ptr
    protected static native long g_child_watch_source_new(int pid);

    public static Pointer<GSource> child_watch_source_new(int pid) {
        return Pointer.pointerToAddress(GLib.g_child_watch_source_new(pid), GSource.class);
    }

    public static native void g_clear_error();

    protected static native void g_clear_pointer(
        @Ptr
        long pp,
        @Ptr
        long destroy);

    public static void clear_pointer(Pointer pp, Pointer destroy) {
        GLib.g_clear_pointer(Pointer.getPeer(pp), Pointer.getPeer(destroy));
    }

    public static native boolean g_close(int fd);

    @Ptr
    protected static native long g_compute_checksum_for_bytes(IntValuedEnum<GChecksumType> checksum_type,
        @Ptr
        long data);

    public static Pointer compute_checksum_for_bytes(IntValuedEnum<GChecksumType> checksum_type, Pointer<GBytes> data) {
        return Pointer.pointerToAddress(GLib.g_compute_checksum_for_bytes(checksum_type, Pointer.getPeer(data)));
    }

    @Ptr
    protected static native long g_compute_checksum_for_data(IntValuedEnum<GChecksumType> checksum_type,
        @Ptr
        long data, long length);

    public static Pointer compute_checksum_for_data(IntValuedEnum<GChecksumType> checksum_type, Pointer<Short> data, long length) {
        return Pointer.pointerToAddress(GLib.g_compute_checksum_for_data(checksum_type, Pointer.getPeer(data), length));
    }

    @Ptr
    protected static native long g_compute_checksum_for_string(IntValuedEnum<GChecksumType> checksum_type,
        @Ptr
        long str, long length);

    public static Pointer compute_checksum_for_string(IntValuedEnum<GChecksumType> checksum_type, Pointer str, long length) {
        return Pointer.pointerToAddress(GLib.g_compute_checksum_for_string(checksum_type, Pointer.getPeer(str), length));
    }

    @Ptr
    protected static native long g_compute_hmac_for_data(IntValuedEnum<GChecksumType> digest_type,
        @Ptr
        long key, long key_len,
        @Ptr
        long data, long length);

    public static Pointer compute_hmac_for_data(IntValuedEnum<GChecksumType> digest_type, Pointer<Short> key, long key_len, Pointer<Short> data, long length) {
        return Pointer.pointerToAddress(GLib.g_compute_hmac_for_data(digest_type, Pointer.getPeer(key), key_len, Pointer.getPeer(data), length));
    }

    @Ptr
    protected static native long g_compute_hmac_for_string(IntValuedEnum<GChecksumType> digest_type,
        @Ptr
        long key, long key_len,
        @Ptr
        long str, long length);

    public static Pointer compute_hmac_for_string(IntValuedEnum<GChecksumType> digest_type, Pointer<Short> key, long key_len, Pointer str, long length) {
        return Pointer.pointerToAddress(GLib.g_compute_hmac_for_string(digest_type, Pointer.getPeer(key), key_len, Pointer.getPeer(str), length));
    }

    @Ptr
    protected static native long g_convert(
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

    public static Pointer convert(Pointer str, long len, Pointer to_codeset, Pointer from_codeset, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(GLib.g_convert(Pointer.getPeer(str), len, Pointer.getPeer(to_codeset), Pointer.getPeer(from_codeset), Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    public static native long g_convert_error_quark();

    @Ptr
    protected static native long g_convert_with_fallback(
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

    public static Pointer convert_with_fallback(Pointer str, long len, Pointer to_codeset, Pointer from_codeset, Pointer fallback, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(GLib.g_convert_with_fallback(Pointer.getPeer(str), len, Pointer.getPeer(to_codeset), Pointer.getPeer(from_codeset), Pointer.getPeer(fallback), Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    protected static native void g_datalist_clear(
        @Ptr
        long datalist);

    public static void datalist_clear(Pointer<Pointer<GData>> datalist) {
        GLib.g_datalist_clear(Pointer.getPeer(datalist));
    }

    protected static native void g_datalist_foreach(
        @Ptr
        long datalist,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static void datalist_foreach(Pointer<Pointer<GData>> datalist, Pointer func, Pointer user_data) {
        GLib.g_datalist_foreach(Pointer.getPeer(datalist), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_datalist_get_data(
        @Ptr
        long datalist,
        @Ptr
        long key);

    public static Pointer datalist_get_data(Pointer<Pointer<GData>> datalist, Pointer key) {
        return Pointer.pointerToAddress(GLib.g_datalist_get_data(Pointer.getPeer(datalist), Pointer.getPeer(key)));
    }

    protected static native long g_datalist_get_flags(
        @Ptr
        long datalist);

    public static long datalist_get_flags(Pointer<Pointer<GData>> datalist) {
        return GLib.g_datalist_get_flags(Pointer.getPeer(datalist));
    }

    @Ptr
    protected static native long g_datalist_id_dup_data(
        @Ptr
        long datalist, long key_id,
        @Ptr
        long dup_func,
        @Ptr
        long user_data);

    public static Pointer datalist_id_dup_data(Pointer<Pointer<GData>> datalist, long key_id, Pointer dup_func, Pointer user_data) {
        return Pointer.pointerToAddress(GLib.g_datalist_id_dup_data(Pointer.getPeer(datalist), key_id, Pointer.getPeer(dup_func), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected static native long g_datalist_id_get_data(
        @Ptr
        long datalist, long key_id);

    public static Pointer datalist_id_get_data(Pointer<Pointer<GData>> datalist, long key_id) {
        return Pointer.pointerToAddress(GLib.g_datalist_id_get_data(Pointer.getPeer(datalist), key_id));
    }

    @Ptr
    protected static native long g_datalist_id_remove_no_notify(
        @Ptr
        long datalist, long key_id);

    public static Pointer datalist_id_remove_no_notify(Pointer<Pointer<GData>> datalist, long key_id) {
        return Pointer.pointerToAddress(GLib.g_datalist_id_remove_no_notify(Pointer.getPeer(datalist), key_id));
    }

    protected static native boolean g_datalist_id_replace_data(
        @Ptr
        long datalist, long key_id,
        @Ptr
        long oldval,
        @Ptr
        long newval,
        @Ptr
        long destroy,
        @Ptr
        long old_destroy);

    public static boolean datalist_id_replace_data(Pointer<Pointer<GData>> datalist, long key_id, Pointer oldval, Pointer newval, Pointer destroy, Pointer old_destroy) {
        return GLib.g_datalist_id_replace_data(Pointer.getPeer(datalist), key_id, Pointer.getPeer(oldval), Pointer.getPeer(newval), Pointer.getPeer(destroy), Pointer.getPeer(old_destroy));
    }

    protected static native void g_datalist_id_set_data_full(
        @Ptr
        long datalist, long key_id,
        @Ptr
        long data,
        @Ptr
        long destroy_func);

    public static void datalist_id_set_data_full(Pointer<Pointer<GData>> datalist, long key_id, Pointer data, Pointer destroy_func) {
        GLib.g_datalist_id_set_data_full(Pointer.getPeer(datalist), key_id, Pointer.getPeer(data), Pointer.getPeer(destroy_func));
    }

    protected static native void g_datalist_init(
        @Ptr
        long datalist);

    public static void datalist_init(Pointer<Pointer<GData>> datalist) {
        GLib.g_datalist_init(Pointer.getPeer(datalist));
    }

    protected static native void g_datalist_set_flags(
        @Ptr
        long datalist, long flags);

    public static void datalist_set_flags(Pointer<Pointer<GData>> datalist, long flags) {
        GLib.g_datalist_set_flags(Pointer.getPeer(datalist), flags);
    }

    protected static native void g_datalist_unset_flags(
        @Ptr
        long datalist, long flags);

    public static void datalist_unset_flags(Pointer<Pointer<GData>> datalist, long flags) {
        GLib.g_datalist_unset_flags(Pointer.getPeer(datalist), flags);
    }

    protected static native void g_dataset_destroy(
        @Ptr
        long dataset_location);

    public static void dataset_destroy(Pointer dataset_location) {
        GLib.g_dataset_destroy(Pointer.getPeer(dataset_location));
    }

    protected static native void g_dataset_foreach(
        @Ptr
        long dataset_location,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static void dataset_foreach(Pointer dataset_location, Pointer func, Pointer user_data) {
        GLib.g_dataset_foreach(Pointer.getPeer(dataset_location), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_dataset_id_get_data(
        @Ptr
        long dataset_location, long key_id);

    public static Pointer dataset_id_get_data(Pointer dataset_location, long key_id) {
        return Pointer.pointerToAddress(GLib.g_dataset_id_get_data(Pointer.getPeer(dataset_location), key_id));
    }

    @Ptr
    protected static native long g_dataset_id_remove_no_notify(
        @Ptr
        long dataset_location, long key_id);

    public static Pointer dataset_id_remove_no_notify(Pointer dataset_location, long key_id) {
        return Pointer.pointerToAddress(GLib.g_dataset_id_remove_no_notify(Pointer.getPeer(dataset_location), key_id));
    }

    protected static native void g_dataset_id_set_data_full(
        @Ptr
        long dataset_location, long key_id,
        @Ptr
        long data,
        @Ptr
        long destroy_func);

    public static void dataset_id_set_data_full(Pointer dataset_location, long key_id, Pointer data, Pointer destroy_func) {
        GLib.g_dataset_id_set_data_full(Pointer.getPeer(dataset_location), key_id, Pointer.getPeer(data), Pointer.getPeer(destroy_func));
    }

    public static native short g_date_get_days_in_month(IntValuedEnum<GDateMonth> month, int year);

    public static native short g_date_get_monday_weeks_in_year(int year);

    public static native short g_date_get_sunday_weeks_in_year(int year);

    public static native boolean g_date_is_leap_year(int year);

    protected static native long g_date_strftime(
        @Ptr
        long s, long slen,
        @Ptr
        long format,
        @Ptr
        long date);

    public static long date_strftime(Pointer s, long slen, Pointer format, Pointer<GDate> date) {
        return GLib.g_date_strftime(Pointer.getPeer(s), slen, Pointer.getPeer(format), Pointer.getPeer(date));
    }

    protected static native int g_date_time_compare(
        @Ptr
        long dt1,
        @Ptr
        long dt2);

    public static int date_time_compare(Pointer dt1, Pointer dt2) {
        return GLib.g_date_time_compare(Pointer.getPeer(dt1), Pointer.getPeer(dt2));
    }

    protected static native boolean g_date_time_equal(
        @Ptr
        long dt1,
        @Ptr
        long dt2);

    public static boolean date_time_equal(Pointer dt1, Pointer dt2) {
        return GLib.g_date_time_equal(Pointer.getPeer(dt1), Pointer.getPeer(dt2));
    }

    protected static native long g_date_time_hash(
        @Ptr
        long datetime);

    public static long date_time_hash(Pointer datetime) {
        return GLib.g_date_time_hash(Pointer.getPeer(datetime));
    }

    public static native boolean g_date_valid_day(short day);

    public static native boolean g_date_valid_dmy(short day, IntValuedEnum<GDateMonth> month, int year);

    public static native boolean g_date_valid_julian(long julian_date);

    public static native boolean g_date_valid_month(IntValuedEnum<GDateMonth> month);

    public static native boolean g_date_valid_weekday(IntValuedEnum<GDateWeekday> weekday);

    public static native boolean g_date_valid_year(int year);

    @Ptr
    protected static native long g_dcgettext(
        @Ptr
        long domain,
        @Ptr
        long msgid, int category);

    public static Pointer dcgettext(Pointer domain, Pointer msgid, int category) {
        return Pointer.pointerToAddress(GLib.g_dcgettext(Pointer.getPeer(domain), Pointer.getPeer(msgid), category));
    }

    @Ptr
    protected static native long g_dgettext(
        @Ptr
        long domain,
        @Ptr
        long msgid);

    public static Pointer dgettext(Pointer domain, Pointer msgid) {
        return Pointer.pointerToAddress(GLib.g_dgettext(Pointer.getPeer(domain), Pointer.getPeer(msgid)));
    }

    @Ptr
    protected static native long g_dir_make_tmp(
        @Ptr
        long tmpl);

    public static Pointer dir_make_tmp(Pointer tmpl) {
        return Pointer.pointerToAddress(GLib.g_dir_make_tmp(Pointer.getPeer(tmpl)));
    }

    protected static native boolean g_direct_equal(
        @Ptr
        long v1,
        @Ptr
        long v2);

    public static boolean direct_equal(Pointer v1, Pointer v2) {
        return GLib.g_direct_equal(Pointer.getPeer(v1), Pointer.getPeer(v2));
    }

    protected static native long g_direct_hash(
        @Ptr
        long v);

    public static long direct_hash(Pointer v) {
        return GLib.g_direct_hash(Pointer.getPeer(v));
    }

    @Ptr
    protected static native long g_dngettext(
        @Ptr
        long domain,
        @Ptr
        long msgid,
        @Ptr
        long msgid_plural, long n);

    public static Pointer dngettext(Pointer domain, Pointer msgid, Pointer msgid_plural, long n) {
        return Pointer.pointerToAddress(GLib.g_dngettext(Pointer.getPeer(domain), Pointer.getPeer(msgid), Pointer.getPeer(msgid_plural), n));
    }

    protected static native boolean g_double_equal(
        @Ptr
        long v1,
        @Ptr
        long v2);

    public static boolean double_equal(Pointer v1, Pointer v2) {
        return GLib.g_double_equal(Pointer.getPeer(v1), Pointer.getPeer(v2));
    }

    protected static native long g_double_hash(
        @Ptr
        long v);

    public static long double_hash(Pointer v) {
        return GLib.g_double_hash(Pointer.getPeer(v));
    }

    @Ptr
    protected static native long g_dpgettext(
        @Ptr
        long domain,
        @Ptr
        long msgctxtid, long msgidoffset);

    public static Pointer dpgettext(Pointer domain, Pointer msgctxtid, long msgidoffset) {
        return Pointer.pointerToAddress(GLib.g_dpgettext(Pointer.getPeer(domain), Pointer.getPeer(msgctxtid), msgidoffset));
    }

    @Ptr
    protected static native long g_dpgettext2(
        @Ptr
        long domain,
        @Ptr
        long context,
        @Ptr
        long msgid);

    public static Pointer dpgettext2(Pointer domain, Pointer context, Pointer msgid) {
        return Pointer.pointerToAddress(GLib.g_dpgettext2(Pointer.getPeer(domain), Pointer.getPeer(context), Pointer.getPeer(msgid)));
    }

    @Ptr
    protected static native long g_environ_getenv(
        @Ptr
        long envp,
        @Ptr
        long variable);

    public static Pointer environ_getenv(Pointer envp, Pointer variable) {
        return Pointer.pointerToAddress(GLib.g_environ_getenv(Pointer.getPeer(envp), Pointer.getPeer(variable)));
    }

    @Ptr
    protected static native long g_environ_setenv(
        @Ptr
        long envp,
        @Ptr
        long variable,
        @Ptr
        long value, boolean overwrite);

    public static Pointer environ_setenv(Pointer envp, Pointer variable, Pointer value, boolean overwrite) {
        return Pointer.pointerToAddress(GLib.g_environ_setenv(Pointer.getPeer(envp), Pointer.getPeer(variable), Pointer.getPeer(value), overwrite));
    }

    @Ptr
    protected static native long g_environ_unsetenv(
        @Ptr
        long envp,
        @Ptr
        long variable);

    public static Pointer environ_unsetenv(Pointer envp, Pointer variable) {
        return Pointer.pointerToAddress(GLib.g_environ_unsetenv(Pointer.getPeer(envp), Pointer.getPeer(variable)));
    }

    public static native IntValuedEnum<GFileError> g_file_error_from_errno(int err_no);

    public static native long g_file_error_quark();

    protected static native boolean g_file_get_contents(
        @Ptr
        long filename,
        @Ptr
        long contents,
        @Ptr
        long length);

    public static boolean file_get_contents(Pointer filename, Pointer<Pointer<Short>> contents, Pointer<Long> length) {
        return GLib.g_file_get_contents(Pointer.getPeer(filename), Pointer.getPeer(contents), Pointer.getPeer(length));
    }

    protected static native int g_file_open_tmp(
        @Ptr
        long tmpl,
        @Ptr
        long name_used);

    public static int file_open_tmp(Pointer tmpl, Pointer name_used) {
        return GLib.g_file_open_tmp(Pointer.getPeer(tmpl), Pointer.getPeer(name_used));
    }

    @Ptr
    protected static native long g_file_read_link(
        @Ptr
        long filename);

    public static Pointer file_read_link(Pointer filename) {
        return Pointer.pointerToAddress(GLib.g_file_read_link(Pointer.getPeer(filename)));
    }

    protected static native boolean g_file_set_contents(
        @Ptr
        long filename,
        @Ptr
        long contents, long length);

    public static boolean file_set_contents(Pointer filename, Pointer<Short> contents, long length) {
        return GLib.g_file_set_contents(Pointer.getPeer(filename), Pointer.getPeer(contents), length);
    }

    protected static native boolean g_file_test(
        @Ptr
        long filename, IntValuedEnum<GFileTest> test);

    public static boolean file_test(Pointer filename, IntValuedEnum<GFileTest> test) {
        return GLib.g_file_test(Pointer.getPeer(filename), test);
    }

    @Ptr
    protected static native long g_filename_display_basename(
        @Ptr
        long filename);

    public static Pointer filename_display_basename(Pointer filename) {
        return Pointer.pointerToAddress(GLib.g_filename_display_basename(Pointer.getPeer(filename)));
    }

    @Ptr
    protected static native long g_filename_display_name(
        @Ptr
        long filename);

    public static Pointer filename_display_name(Pointer filename) {
        return Pointer.pointerToAddress(GLib.g_filename_display_name(Pointer.getPeer(filename)));
    }

    @Ptr
    protected static native long g_filename_from_uri(
        @Ptr
        long uri,
        @Ptr
        long hostname);

    public static Pointer filename_from_uri(Pointer uri, Pointer hostname) {
        return Pointer.pointerToAddress(GLib.g_filename_from_uri(Pointer.getPeer(uri), Pointer.getPeer(hostname)));
    }

    @Ptr
    protected static native long g_filename_from_utf8(
        @Ptr
        long utf8string, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public static Pointer<Short> filename_from_utf8(Pointer utf8string, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(GLib.g_filename_from_utf8(Pointer.getPeer(utf8string), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)), Short.class);
    }

    @Ptr
    protected static native long g_filename_to_uri(
        @Ptr
        long filename,
        @Ptr
        long hostname);

    public static Pointer filename_to_uri(Pointer filename, Pointer hostname) {
        return Pointer.pointerToAddress(GLib.g_filename_to_uri(Pointer.getPeer(filename), Pointer.getPeer(hostname)));
    }

    @Ptr
    protected static native long g_filename_to_utf8(
        @Ptr
        long opsysstring, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public static Pointer filename_to_utf8(Pointer opsysstring, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(GLib.g_filename_to_utf8(Pointer.getPeer(opsysstring), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    @Ptr
    protected static native long g_find_program_in_path(
        @Ptr
        long program);

    public static Pointer find_program_in_path(Pointer program) {
        return Pointer.pointerToAddress(GLib.g_find_program_in_path(Pointer.getPeer(program)));
    }

    @Ptr
    protected static native long g_format_size(long size);

    public static Pointer format_size(long size) {
        return Pointer.pointerToAddress(GLib.g_format_size(size));
    }

    @Ptr
    protected static native long g_format_size_for_display(long size);

    public static Pointer format_size_for_display(long size) {
        return Pointer.pointerToAddress(GLib.g_format_size_for_display(size));
    }

    @Ptr
    protected static native long g_format_size_full(long size, IntValuedEnum<GFormatSizeFlags> flags);

    public static Pointer format_size_full(long size, IntValuedEnum<GFormatSizeFlags> flags) {
        return Pointer.pointerToAddress(GLib.g_format_size_full(size, flags));
    }

    protected static native int g_fprintf(
        @Ptr
        long file,
        @Ptr
        long format, Object... varargs);

    public static int fprintf(Pointer file, Pointer format, Object... varargs) {
        return GLib.g_fprintf(Pointer.getPeer(file), Pointer.getPeer(format), varargs);
    }

    protected static native void g_free(
        @Ptr
        long mem);

    public static void free(Pointer mem) {
        GLib.g_free(Pointer.getPeer(mem));
    }

    @Ptr
    protected static native long g_get_application_name();

    public static Pointer get_application_name() {
        return Pointer.pointerToAddress(GLib.g_get_application_name());
    }

    protected static native boolean g_get_charset(
        @Ptr
        long charset);

    public static boolean get_charset(Pointer charset) {
        return GLib.g_get_charset(Pointer.getPeer(charset));
    }

    @Ptr
    protected static native long g_get_codeset();

    public static Pointer get_codeset() {
        return Pointer.pointerToAddress(GLib.g_get_codeset());
    }

    @Ptr
    protected static native long g_get_current_dir();

    public static Pointer get_current_dir() {
        return Pointer.pointerToAddress(GLib.g_get_current_dir());
    }

    protected static native void g_get_current_time(
        @Ptr
        long result);

    public static void get_current_time(Pointer<GTimeVal> result) {
        GLib.g_get_current_time(Pointer.getPeer(result));
    }

    @Ptr
    protected static native long g_get_environ();

    public static Pointer get_environ() {
        return Pointer.pointerToAddress(GLib.g_get_environ());
    }

    protected static native boolean g_get_filename_charsets(
        @Ptr
        long charsets);

    public static boolean get_filename_charsets(Pointer charsets) {
        return GLib.g_get_filename_charsets(Pointer.getPeer(charsets));
    }

    @Ptr
    protected static native long g_get_home_dir();

    public static Pointer get_home_dir() {
        return Pointer.pointerToAddress(GLib.g_get_home_dir());
    }

    @Ptr
    protected static native long g_get_host_name();

    public static Pointer get_host_name() {
        return Pointer.pointerToAddress(GLib.g_get_host_name());
    }

    @Ptr
    protected static native long g_get_language_names();

    public static Pointer get_language_names() {
        return Pointer.pointerToAddress(GLib.g_get_language_names());
    }

    @Ptr
    protected static native long g_get_locale_variants(
        @Ptr
        long locale);

    public static Pointer get_locale_variants(Pointer locale) {
        return Pointer.pointerToAddress(GLib.g_get_locale_variants(Pointer.getPeer(locale)));
    }

    public static native long g_get_monotonic_time();

    public static native long g_get_num_processors();

    @Ptr
    protected static native long g_get_prgname();

    public static Pointer get_prgname() {
        return Pointer.pointerToAddress(GLib.g_get_prgname());
    }

    @Ptr
    protected static native long g_get_real_name();

    public static Pointer get_real_name() {
        return Pointer.pointerToAddress(GLib.g_get_real_name());
    }

    public static native long g_get_real_time();

    @Ptr
    protected static native long g_get_system_config_dirs();

    public static Pointer get_system_config_dirs() {
        return Pointer.pointerToAddress(GLib.g_get_system_config_dirs());
    }

    @Ptr
    protected static native long g_get_system_data_dirs();

    public static Pointer get_system_data_dirs() {
        return Pointer.pointerToAddress(GLib.g_get_system_data_dirs());
    }

    @Ptr
    protected static native long g_get_tmp_dir();

    public static Pointer get_tmp_dir() {
        return Pointer.pointerToAddress(GLib.g_get_tmp_dir());
    }

    @Ptr
    protected static native long g_get_user_cache_dir();

    public static Pointer get_user_cache_dir() {
        return Pointer.pointerToAddress(GLib.g_get_user_cache_dir());
    }

    @Ptr
    protected static native long g_get_user_config_dir();

    public static Pointer get_user_config_dir() {
        return Pointer.pointerToAddress(GLib.g_get_user_config_dir());
    }

    @Ptr
    protected static native long g_get_user_data_dir();

    public static Pointer get_user_data_dir() {
        return Pointer.pointerToAddress(GLib.g_get_user_data_dir());
    }

    @Ptr
    protected static native long g_get_user_name();

    public static Pointer get_user_name() {
        return Pointer.pointerToAddress(GLib.g_get_user_name());
    }

    @Ptr
    protected static native long g_get_user_runtime_dir();

    public static Pointer get_user_runtime_dir() {
        return Pointer.pointerToAddress(GLib.g_get_user_runtime_dir());
    }

    @Ptr
    protected static native long g_get_user_special_dir(IntValuedEnum<GUserDirectory> directory);

    public static Pointer get_user_special_dir(IntValuedEnum<GUserDirectory> directory) {
        return Pointer.pointerToAddress(GLib.g_get_user_special_dir(directory));
    }

    @Ptr
    protected static native long g_getenv(
        @Ptr
        long variable);

    public static Pointer getenv(Pointer variable) {
        return Pointer.pointerToAddress(GLib.g_getenv(Pointer.getPeer(variable)));
    }

    protected static native boolean g_hash_table_add(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean hash_table_add(Pointer<GHashTable> hash_table, Pointer key) {
        return GLib.g_hash_table_add(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native boolean g_hash_table_contains(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean hash_table_contains(Pointer<GHashTable> hash_table, Pointer key) {
        return GLib.g_hash_table_contains(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native void g_hash_table_destroy(
        @Ptr
        long hash_table);

    public static void hash_table_destroy(Pointer<GHashTable> hash_table) {
        GLib.g_hash_table_destroy(Pointer.getPeer(hash_table));
    }

    protected static native boolean g_hash_table_insert(
        @Ptr
        long hash_table,
        @Ptr
        long key,
        @Ptr
        long value);

    public static boolean hash_table_insert(Pointer<GHashTable> hash_table, Pointer key, Pointer value) {
        return GLib.g_hash_table_insert(Pointer.getPeer(hash_table), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected static native boolean g_hash_table_lookup_extended(
        @Ptr
        long hash_table,
        @Ptr
        long lookup_key,
        @Ptr
        long orig_key,
        @Ptr
        long value);

    public static boolean hash_table_lookup_extended(Pointer<GHashTable> hash_table, Pointer lookup_key, Pointer orig_key, Pointer value) {
        return GLib.g_hash_table_lookup_extended(Pointer.getPeer(hash_table), Pointer.getPeer(lookup_key), Pointer.getPeer(orig_key), Pointer.getPeer(value));
    }

    protected static native boolean g_hash_table_remove(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean hash_table_remove(Pointer<GHashTable> hash_table, Pointer key) {
        return GLib.g_hash_table_remove(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native void g_hash_table_remove_all(
        @Ptr
        long hash_table);

    public static void hash_table_remove_all(Pointer<GHashTable> hash_table) {
        GLib.g_hash_table_remove_all(Pointer.getPeer(hash_table));
    }

    protected static native boolean g_hash_table_replace(
        @Ptr
        long hash_table,
        @Ptr
        long key,
        @Ptr
        long value);

    public static boolean hash_table_replace(Pointer<GHashTable> hash_table, Pointer key, Pointer value) {
        return GLib.g_hash_table_replace(Pointer.getPeer(hash_table), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected static native long g_hash_table_size(
        @Ptr
        long hash_table);

    public static long hash_table_size(Pointer<GHashTable> hash_table) {
        return GLib.g_hash_table_size(Pointer.getPeer(hash_table));
    }

    protected static native boolean g_hash_table_steal(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean hash_table_steal(Pointer<GHashTable> hash_table, Pointer key) {
        return GLib.g_hash_table_steal(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native void g_hash_table_steal_all(
        @Ptr
        long hash_table);

    public static void hash_table_steal_all(Pointer<GHashTable> hash_table) {
        GLib.g_hash_table_steal_all(Pointer.getPeer(hash_table));
    }

    protected static native void g_hash_table_unref(
        @Ptr
        long hash_table);

    public static void hash_table_unref(Pointer<GHashTable> hash_table) {
        GLib.g_hash_table_unref(Pointer.getPeer(hash_table));
    }

    protected static native boolean g_hook_destroy(
        @Ptr
        long hook_list, long hook_id);

    public static boolean hook_destroy(Pointer<GHookList> hook_list, long hook_id) {
        return GLib.g_hook_destroy(Pointer.getPeer(hook_list), hook_id);
    }

    protected static native void g_hook_destroy_link(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void hook_destroy_link(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        GLib.g_hook_destroy_link(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected static native void g_hook_free(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void hook_free(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        GLib.g_hook_free(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected static native void g_hook_insert_before(
        @Ptr
        long hook_list,
        @Ptr
        long sibling,
        @Ptr
        long hook);

    public static void hook_insert_before(Pointer<GHookList> hook_list, Pointer<GHook> sibling, Pointer<GHook> hook) {
        GLib.g_hook_insert_before(Pointer.getPeer(hook_list), Pointer.getPeer(sibling), Pointer.getPeer(hook));
    }

    protected static native void g_hook_prepend(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void hook_prepend(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        GLib.g_hook_prepend(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected static native void g_hook_unref(
        @Ptr
        long hook_list,
        @Ptr
        long hook);

    public static void hook_unref(Pointer<GHookList> hook_list, Pointer<GHook> hook) {
        GLib.g_hook_unref(Pointer.getPeer(hook_list), Pointer.getPeer(hook));
    }

    protected static native boolean g_hostname_is_ascii_encoded(
        @Ptr
        long hostname);

    public static boolean hostname_is_ascii_encoded(Pointer hostname) {
        return GLib.g_hostname_is_ascii_encoded(Pointer.getPeer(hostname));
    }

    protected static native boolean g_hostname_is_ip_address(
        @Ptr
        long hostname);

    public static boolean hostname_is_ip_address(Pointer hostname) {
        return GLib.g_hostname_is_ip_address(Pointer.getPeer(hostname));
    }

    protected static native boolean g_hostname_is_non_ascii(
        @Ptr
        long hostname);

    public static boolean hostname_is_non_ascii(Pointer hostname) {
        return GLib.g_hostname_is_non_ascii(Pointer.getPeer(hostname));
    }

    @Ptr
    protected static native long g_hostname_to_ascii(
        @Ptr
        long hostname);

    public static Pointer hostname_to_ascii(Pointer hostname) {
        return Pointer.pointerToAddress(GLib.g_hostname_to_ascii(Pointer.getPeer(hostname)));
    }

    @Ptr
    protected static native long g_hostname_to_unicode(
        @Ptr
        long hostname);

    public static Pointer hostname_to_unicode(Pointer hostname) {
        return Pointer.pointerToAddress(GLib.g_hostname_to_unicode(Pointer.getPeer(hostname)));
    }

    protected static native long g_idle_add(
        @Ptr
        long function,
        @Ptr
        long data);

    public static long idle_add(Pointer function, Pointer data) {
        return GLib.g_idle_add(Pointer.getPeer(function), Pointer.getPeer(data));
    }

    protected static native long g_idle_add_full(int priority,
        @Ptr
        long function,
        @Ptr
        long data,
        @Ptr
        long notify);

    public static long idle_add_full(int priority, Pointer function, Pointer data, Pointer notify) {
        return GLib.g_idle_add_full(priority, Pointer.getPeer(function), Pointer.getPeer(data), Pointer.getPeer(notify));
    }

    protected static native boolean g_idle_remove_by_data(
        @Ptr
        long data);

    public static boolean idle_remove_by_data(Pointer data) {
        return GLib.g_idle_remove_by_data(Pointer.getPeer(data));
    }

    @Ptr
    protected static native long g_idle_source_new();

    public static Pointer<GSource> idle_source_new() {
        return Pointer.pointerToAddress(GLib.g_idle_source_new(), GSource.class);
    }

    protected static native boolean g_int64_equal(
        @Ptr
        long v1,
        @Ptr
        long v2);

    public static boolean int64_equal(Pointer v1, Pointer v2) {
        return GLib.g_int64_equal(Pointer.getPeer(v1), Pointer.getPeer(v2));
    }

    protected static native long g_int64_hash(
        @Ptr
        long v);

    public static long int64_hash(Pointer v) {
        return GLib.g_int64_hash(Pointer.getPeer(v));
    }

    protected static native boolean g_int_equal(
        @Ptr
        long v1,
        @Ptr
        long v2);

    public static boolean int_equal(Pointer v1, Pointer v2) {
        return GLib.g_int_equal(Pointer.getPeer(v1), Pointer.getPeer(v2));
    }

    protected static native long g_int_hash(
        @Ptr
        long v);

    public static long int_hash(Pointer v) {
        return GLib.g_int_hash(Pointer.getPeer(v));
    }

    @Ptr
    protected static native long g_intern_static_string(
        @Ptr
        long string);

    public static Pointer intern_static_string(Pointer string) {
        return Pointer.pointerToAddress(GLib.g_intern_static_string(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_intern_string(
        @Ptr
        long string);

    public static Pointer intern_string(Pointer string) {
        return Pointer.pointerToAddress(GLib.g_intern_string(Pointer.getPeer(string)));
    }

    protected static native long g_io_add_watch(
        @Ptr
        long channel, IntValuedEnum<GIOCondition> condition,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static long io_add_watch(Pointer<GIOChannel> channel, IntValuedEnum<GIOCondition> condition, Pointer func, Pointer user_data) {
        return GLib.g_io_add_watch(Pointer.getPeer(channel), condition, Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected static native long g_io_add_watch_full(
        @Ptr
        long channel, int priority, IntValuedEnum<GIOCondition> condition,
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public static long io_add_watch_full(Pointer<GIOChannel> channel, int priority, IntValuedEnum<GIOCondition> condition, Pointer func, Pointer user_data, Pointer notify) {
        return GLib.g_io_add_watch_full(Pointer.getPeer(channel), priority, condition, Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    public static native IntValuedEnum<GIOChannelError> g_io_channel_error_from_errno(int en);

    public static native long g_io_channel_error_quark();

    @Ptr
    protected static native long g_io_create_watch(
        @Ptr
        long channel, IntValuedEnum<GIOCondition> condition);

    public static Pointer<GSource> io_create_watch(Pointer<GIOChannel> channel, IntValuedEnum<GIOCondition> condition) {
        return Pointer.pointerToAddress(GLib.g_io_create_watch(Pointer.getPeer(channel), condition), GSource.class);
    }

    public static native long g_key_file_error_quark();

    @Ptr
    protected static native long g_listenv();

    public static Pointer listenv() {
        return Pointer.pointerToAddress(GLib.g_listenv());
    }

    @Ptr
    protected static native long g_locale_from_utf8(
        @Ptr
        long utf8string, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public static Pointer locale_from_utf8(Pointer utf8string, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(GLib.g_locale_from_utf8(Pointer.getPeer(utf8string), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    @Ptr
    protected static native long g_locale_to_utf8(
        @Ptr
        long opsysstring, long len,
        @Ptr
        long bytes_read,
        @Ptr
        long bytes_written);

    public static Pointer locale_to_utf8(Pointer opsysstring, long len, Pointer<Long> bytes_read, Pointer<Long> bytes_written) {
        return Pointer.pointerToAddress(GLib.g_locale_to_utf8(Pointer.getPeer(opsysstring), len, Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written)));
    }

    protected static native void g_log(
        @Ptr
        long log_domain, IntValuedEnum<GLogLevelFlags> log_level,
        @Ptr
        long format, Object... varargs);

    public static void log(Pointer log_domain, IntValuedEnum<GLogLevelFlags> log_level, Pointer format, Object... varargs) {
        GLib.g_log(Pointer.getPeer(log_domain), log_level, Pointer.getPeer(format), varargs);
    }

    protected static native void g_log_default_handler(
        @Ptr
        long log_domain, IntValuedEnum<GLogLevelFlags> log_level,
        @Ptr
        long message,
        @Ptr
        long unused_data);

    public static void log_default_handler(Pointer log_domain, IntValuedEnum<GLogLevelFlags> log_level, Pointer message, Pointer unused_data) {
        GLib.g_log_default_handler(Pointer.getPeer(log_domain), log_level, Pointer.getPeer(message), Pointer.getPeer(unused_data));
    }

    protected static native void g_log_remove_handler(
        @Ptr
        long log_domain, long handler_id);

    public static void log_remove_handler(Pointer log_domain, long handler_id) {
        GLib.g_log_remove_handler(Pointer.getPeer(log_domain), handler_id);
    }

    public static native IntValuedEnum<GLogLevelFlags> g_log_set_always_fatal(IntValuedEnum<GLogLevelFlags> fatal_mask);

    @Ptr
    protected static native long g_log_set_default_handler(
        @Ptr
        long log_func,
        @Ptr
        long user_data);

    public static Pointer log_set_default_handler(Pointer log_func, Pointer user_data) {
        return Pointer.pointerToAddress(GLib.g_log_set_default_handler(Pointer.getPeer(log_func), Pointer.getPeer(user_data)));
    }

    protected static native IntValuedEnum<GLogLevelFlags> g_log_set_fatal_mask(
        @Ptr
        long log_domain, IntValuedEnum<GLogLevelFlags> fatal_mask);

    public static IntValuedEnum<GLogLevelFlags> log_set_fatal_mask(Pointer log_domain, IntValuedEnum<GLogLevelFlags> fatal_mask) {
        return GLib.g_log_set_fatal_mask(Pointer.getPeer(log_domain), fatal_mask);
    }

    protected static native long g_log_set_handler(
        @Ptr
        long log_domain, IntValuedEnum<GLogLevelFlags> log_levels,
        @Ptr
        long log_func,
        @Ptr
        long user_data);

    public static long log_set_handler(Pointer log_domain, IntValuedEnum<GLogLevelFlags> log_levels, Pointer log_func, Pointer user_data) {
        return GLib.g_log_set_handler(Pointer.getPeer(log_domain), log_levels, Pointer.getPeer(log_func), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_main_context_default();

    public static Pointer<GMainContext> main_context_default() {
        return Pointer.pointerToAddress(GLib.g_main_context_default(), GMainContext.class);
    }

    @Ptr
    protected static native long g_main_context_get_thread_default();

    public static Pointer<GMainContext> main_context_get_thread_default() {
        return Pointer.pointerToAddress(GLib.g_main_context_get_thread_default(), GMainContext.class);
    }

    @Ptr
    protected static native long g_main_context_ref_thread_default();

    public static Pointer<GMainContext> main_context_ref_thread_default() {
        return Pointer.pointerToAddress(GLib.g_main_context_ref_thread_default(), GMainContext.class);
    }

    @Ptr
    protected static native long g_main_current_source();

    public static Pointer<GSource> main_current_source() {
        return Pointer.pointerToAddress(GLib.g_main_current_source(), GSource.class);
    }

    public static native int g_main_depth();

    @Ptr
    protected static native long g_malloc(long n_bytes);

    public static Pointer malloc(long n_bytes) {
        return Pointer.pointerToAddress(GLib.g_malloc(n_bytes));
    }

    @Ptr
    protected static native long g_malloc0(long n_bytes);

    public static Pointer malloc0(long n_bytes) {
        return Pointer.pointerToAddress(GLib.g_malloc0(n_bytes));
    }

    @Ptr
    protected static native long g_malloc0_n(long n_blocks, long n_block_bytes);

    public static Pointer malloc0_n(long n_blocks, long n_block_bytes) {
        return Pointer.pointerToAddress(GLib.g_malloc0_n(n_blocks, n_block_bytes));
    }

    @Ptr
    protected static native long g_malloc_n(long n_blocks, long n_block_bytes);

    public static Pointer malloc_n(long n_blocks, long n_block_bytes) {
        return Pointer.pointerToAddress(GLib.g_malloc_n(n_blocks, n_block_bytes));
    }

    protected static native boolean g_markup_collect_attributes(
        @Ptr
        long element_name,
        @Ptr
        long attribute_names,
        @Ptr
        long attribute_values,
        @Ptr
        long error, IntValuedEnum<GMarkupCollectType> first_type,
        @Ptr
        long first_attr, Object... varargs);

    public static boolean markup_collect_attributes(Pointer element_name, Pointer attribute_names, Pointer attribute_values, Pointer<Pointer<GError>> error, IntValuedEnum<GMarkupCollectType> first_type, Pointer first_attr, Object... varargs) {
        return GLib.g_markup_collect_attributes(Pointer.getPeer(element_name), Pointer.getPeer(attribute_names), Pointer.getPeer(attribute_values), Pointer.getPeer(error), first_type, Pointer.getPeer(first_attr), varargs);
    }

    public static native long g_markup_error_quark();

    @Ptr
    protected static native long g_markup_escape_text(
        @Ptr
        long text, long length);

    public static Pointer markup_escape_text(Pointer text, long length) {
        return Pointer.pointerToAddress(GLib.g_markup_escape_text(Pointer.getPeer(text), length));
    }

    @Ptr
    protected static native long g_markup_printf_escaped(
        @Ptr
        long format, Object... varargs);

    public static Pointer markup_printf_escaped(Pointer format, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_markup_printf_escaped(Pointer.getPeer(format), varargs));
    }

    public static native boolean g_mem_is_system_malloc();

    public static native void g_mem_profile();

    protected static native void g_mem_set_vtable(
        @Ptr
        long vtable);

    public static void mem_set_vtable(Pointer<GMemVTable> vtable) {
        GLib.g_mem_set_vtable(Pointer.getPeer(vtable));
    }

    @Ptr
    protected static native long g_memdup(
        @Ptr
        long mem, long byte_size);

    public static Pointer memdup(Pointer mem, long byte_size) {
        return Pointer.pointerToAddress(GLib.g_memdup(Pointer.getPeer(mem), byte_size));
    }

    protected static native int g_mkdir_with_parents(
        @Ptr
        long pathname, int mode);

    public static int mkdir_with_parents(Pointer pathname, int mode) {
        return GLib.g_mkdir_with_parents(Pointer.getPeer(pathname), mode);
    }

    @Ptr
    protected static native long g_mkdtemp(
        @Ptr
        long tmpl);

    public static Pointer mkdtemp(Pointer tmpl) {
        return Pointer.pointerToAddress(GLib.g_mkdtemp(Pointer.getPeer(tmpl)));
    }

    @Ptr
    protected static native long g_mkdtemp_full(
        @Ptr
        long tmpl, int mode);

    public static Pointer mkdtemp_full(Pointer tmpl, int mode) {
        return Pointer.pointerToAddress(GLib.g_mkdtemp_full(Pointer.getPeer(tmpl), mode));
    }

    protected static native int g_mkstemp(
        @Ptr
        long tmpl);

    public static int mkstemp(Pointer tmpl) {
        return GLib.g_mkstemp(Pointer.getPeer(tmpl));
    }

    protected static native int g_mkstemp_full(
        @Ptr
        long tmpl, int flags, int mode);

    public static int mkstemp_full(Pointer tmpl, int flags, int mode) {
        return GLib.g_mkstemp_full(Pointer.getPeer(tmpl), flags, mode);
    }

    protected static native void g_nullify_pointer(
        @Ptr
        long nullify_location);

    public static void nullify_pointer(Pointer nullify_location) {
        GLib.g_nullify_pointer(Pointer.getPeer(nullify_location));
    }

    protected static native void g_on_error_query(
        @Ptr
        long prg_name);

    public static void on_error_query(Pointer prg_name) {
        GLib.g_on_error_query(Pointer.getPeer(prg_name));
    }

    protected static native void g_on_error_stack_trace(
        @Ptr
        long prg_name);

    public static void on_error_stack_trace(Pointer prg_name) {
        GLib.g_on_error_stack_trace(Pointer.getPeer(prg_name));
    }

    protected static native boolean g_once_init_enter(
        @Ptr
        long location);

    public static boolean once_init_enter(Pointer location) {
        return GLib.g_once_init_enter(Pointer.getPeer(location));
    }

    protected static native void g_once_init_leave(
        @Ptr
        long location, long result);

    public static void once_init_leave(Pointer location, long result) {
        GLib.g_once_init_leave(Pointer.getPeer(location), result);
    }

    public static native long g_option_error_quark();

    protected static native long g_parse_debug_string(
        @Ptr
        long string,
        @Ptr
        long keys, long nkeys);

    public static long parse_debug_string(Pointer string, Pointer<GDebugKey> keys, long nkeys) {
        return GLib.g_parse_debug_string(Pointer.getPeer(string), Pointer.getPeer(keys), nkeys);
    }

    @Ptr
    protected static native long g_path_get_basename(
        @Ptr
        long file_name);

    public static Pointer path_get_basename(Pointer file_name) {
        return Pointer.pointerToAddress(GLib.g_path_get_basename(Pointer.getPeer(file_name)));
    }

    @Ptr
    protected static native long g_path_get_dirname(
        @Ptr
        long file_name);

    public static Pointer path_get_dirname(Pointer file_name) {
        return Pointer.pointerToAddress(GLib.g_path_get_dirname(Pointer.getPeer(file_name)));
    }

    protected static native boolean g_path_is_absolute(
        @Ptr
        long file_name);

    public static boolean path_is_absolute(Pointer file_name) {
        return GLib.g_path_is_absolute(Pointer.getPeer(file_name));
    }

    @Ptr
    protected static native long g_path_skip_root(
        @Ptr
        long file_name);

    public static Pointer path_skip_root(Pointer file_name) {
        return Pointer.pointerToAddress(GLib.g_path_skip_root(Pointer.getPeer(file_name)));
    }

    protected static native boolean g_pattern_match(
        @Ptr
        long pspec, long string_length,
        @Ptr
        long string,
        @Ptr
        long string_reversed);

    public static boolean pattern_match(Pointer<GPatternSpec> pspec, long string_length, Pointer string, Pointer string_reversed) {
        return GLib.g_pattern_match(Pointer.getPeer(pspec), string_length, Pointer.getPeer(string), Pointer.getPeer(string_reversed));
    }

    protected static native boolean g_pattern_match_simple(
        @Ptr
        long pattern,
        @Ptr
        long string);

    public static boolean pattern_match_simple(Pointer pattern, Pointer string) {
        return GLib.g_pattern_match_simple(Pointer.getPeer(pattern), Pointer.getPeer(string));
    }

    protected static native boolean g_pattern_match_string(
        @Ptr
        long pspec,
        @Ptr
        long string);

    public static boolean pattern_match_string(Pointer<GPatternSpec> pspec, Pointer string) {
        return GLib.g_pattern_match_string(Pointer.getPeer(pspec), Pointer.getPeer(string));
    }

    protected static native void g_pointer_bit_lock(
        @Ptr
        long address, int lock_bit);

    public static void pointer_bit_lock(Pointer address, int lock_bit) {
        GLib.g_pointer_bit_lock(Pointer.getPeer(address), lock_bit);
    }

    protected static native boolean g_pointer_bit_trylock(
        @Ptr
        long address, int lock_bit);

    public static boolean pointer_bit_trylock(Pointer address, int lock_bit) {
        return GLib.g_pointer_bit_trylock(Pointer.getPeer(address), lock_bit);
    }

    protected static native void g_pointer_bit_unlock(
        @Ptr
        long address, int lock_bit);

    public static void pointer_bit_unlock(Pointer address, int lock_bit) {
        GLib.g_pointer_bit_unlock(Pointer.getPeer(address), lock_bit);
    }

    protected static native int g_poll(
        @Ptr
        long fds, long nfds, int timeout);

    public static int poll(Pointer<GPollFD> fds, long nfds, int timeout) {
        return GLib.g_poll(Pointer.getPeer(fds), nfds, timeout);
    }

    protected static native void g_prefix_error(
        @Ptr
        long err,
        @Ptr
        long format, Object... varargs);

    public static void prefix_error(Pointer<Pointer<GError>> err, Pointer format, Object... varargs) {
        GLib.g_prefix_error(Pointer.getPeer(err), Pointer.getPeer(format), varargs);
    }

    protected static native void g_print(
        @Ptr
        long format, Object... varargs);

    public static void print(Pointer format, Object... varargs) {
        GLib.g_print(Pointer.getPeer(format), varargs);
    }

    protected static native void g_printerr(
        @Ptr
        long format, Object... varargs);

    public static void printerr(Pointer format, Object... varargs) {
        GLib.g_printerr(Pointer.getPeer(format), varargs);
    }

    protected static native int g_printf(
        @Ptr
        long format, Object... varargs);

    public static int printf(Pointer format, Object... varargs) {
        return GLib.g_printf(Pointer.getPeer(format), varargs);
    }

    protected static native void g_propagate_error(
        @Ptr
        long dest,
        @Ptr
        long src);

    public static void propagate_error(Pointer<Pointer<GError>> dest, Pointer<GError> src) {
        GLib.g_propagate_error(Pointer.getPeer(dest), Pointer.getPeer(src));
    }

    protected static native void g_propagate_prefixed_error(
        @Ptr
        long dest,
        @Ptr
        long src,
        @Ptr
        long format, Object... varargs);

    public static void propagate_prefixed_error(Pointer<Pointer<GError>> dest, Pointer<GError> src, Pointer format, Object... varargs) {
        GLib.g_propagate_prefixed_error(Pointer.getPeer(dest), Pointer.getPeer(src), Pointer.getPeer(format), varargs);
    }

    protected static native void g_qsort_with_data(
        @Ptr
        long pbase, int total_elems, long size,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public static void qsort_with_data(Pointer pbase, int total_elems, long size, Pointer compare_func, Pointer user_data) {
        GLib.g_qsort_with_data(Pointer.getPeer(pbase), total_elems, size, Pointer.getPeer(compare_func), Pointer.getPeer(user_data));
    }

    protected static native long g_quark_from_static_string(
        @Ptr
        long string);

    public static long quark_from_static_string(Pointer string) {
        return GLib.g_quark_from_static_string(Pointer.getPeer(string));
    }

    protected static native long g_quark_from_string(
        @Ptr
        long string);

    public static long quark_from_string(Pointer string) {
        return GLib.g_quark_from_string(Pointer.getPeer(string));
    }

    @Ptr
    protected static native long g_quark_to_string(long quark);

    public static Pointer quark_to_string(long quark) {
        return Pointer.pointerToAddress(GLib.g_quark_to_string(quark));
    }

    protected static native long g_quark_try_string(
        @Ptr
        long string);

    public static long quark_try_string(Pointer string) {
        return GLib.g_quark_try_string(Pointer.getPeer(string));
    }

    public static native double g_random_double();

    public static native double g_random_double_range(double begin, double end);

    public static native long g_random_int();

    public static native int g_random_int_range(int begin, int end);

    public static native void g_random_set_seed(long seed);

    @Ptr
    protected static native long g_realloc(
        @Ptr
        long mem, long n_bytes);

    public static Pointer realloc(Pointer mem, long n_bytes) {
        return Pointer.pointerToAddress(GLib.g_realloc(Pointer.getPeer(mem), n_bytes));
    }

    @Ptr
    protected static native long g_realloc_n(
        @Ptr
        long mem, long n_blocks, long n_block_bytes);

    public static Pointer realloc_n(Pointer mem, long n_blocks, long n_block_bytes) {
        return Pointer.pointerToAddress(GLib.g_realloc_n(Pointer.getPeer(mem), n_blocks, n_block_bytes));
    }

    protected static native boolean g_regex_check_replacement(
        @Ptr
        long replacement,
        @Ptr
        long has_references);

    public static boolean regex_check_replacement(Pointer replacement, Pointer<Boolean> has_references) {
        return GLib.g_regex_check_replacement(Pointer.getPeer(replacement), Pointer.getPeer(has_references));
    }

    public static native long g_regex_error_quark();

    @Ptr
    protected static native long g_regex_escape_nul(
        @Ptr
        long string, int length);

    public static Pointer regex_escape_nul(Pointer string, int length) {
        return Pointer.pointerToAddress(GLib.g_regex_escape_nul(Pointer.getPeer(string), length));
    }

    @Ptr
    protected static native long g_regex_escape_string(
        @Ptr
        long string, int length);

    public static Pointer regex_escape_string(Pointer string, int length) {
        return Pointer.pointerToAddress(GLib.g_regex_escape_string(Pointer.getPeer(string), length));
    }

    protected static native boolean g_regex_match_simple(
        @Ptr
        long pattern,
        @Ptr
        long string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options);

    public static boolean regex_match_simple(Pointer pattern, Pointer string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options) {
        return GLib.g_regex_match_simple(Pointer.getPeer(pattern), Pointer.getPeer(string), compile_options, match_options);
    }

    @Ptr
    protected static native long g_regex_split_simple(
        @Ptr
        long pattern,
        @Ptr
        long string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options);

    public static Pointer regex_split_simple(Pointer pattern, Pointer string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options) {
        return Pointer.pointerToAddress(GLib.g_regex_split_simple(Pointer.getPeer(pattern), Pointer.getPeer(string), compile_options, match_options));
    }

    public static native void g_reload_user_special_dirs_cache();

    protected static native void g_return_if_fail_warning(
        @Ptr
        long log_domain,
        @Ptr
        long pretty_function,
        @Ptr
        long expression);

    public static void return_if_fail_warning(Pointer log_domain, Pointer pretty_function, Pointer expression) {
        GLib.g_return_if_fail_warning(Pointer.getPeer(log_domain), Pointer.getPeer(pretty_function), Pointer.getPeer(expression));
    }

    protected static native int g_rmdir(
        @Ptr
        long filename);

    public static int rmdir(Pointer filename) {
        return GLib.g_rmdir(Pointer.getPeer(filename));
    }

    protected static native void g_sequence_move(
        @Ptr
        long src,
        @Ptr
        long dest);

    public static void sequence_move(Pointer<GSequenceIter> src, Pointer<GSequenceIter> dest) {
        GLib.g_sequence_move(Pointer.getPeer(src), Pointer.getPeer(dest));
    }

    protected static native void g_sequence_move_range(
        @Ptr
        long dest,
        @Ptr
        long begin,
        @Ptr
        long end);

    public static void sequence_move_range(Pointer<GSequenceIter> dest, Pointer<GSequenceIter> begin, Pointer<GSequenceIter> end) {
        GLib.g_sequence_move_range(Pointer.getPeer(dest), Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    protected static native void g_sequence_remove(
        @Ptr
        long iter);

    public static void sequence_remove(Pointer<GSequenceIter> iter) {
        GLib.g_sequence_remove(Pointer.getPeer(iter));
    }

    protected static native void g_sequence_remove_range(
        @Ptr
        long begin,
        @Ptr
        long end);

    public static void sequence_remove_range(Pointer<GSequenceIter> begin, Pointer<GSequenceIter> end) {
        GLib.g_sequence_remove_range(Pointer.getPeer(begin), Pointer.getPeer(end));
    }

    protected static native void g_sequence_set(
        @Ptr
        long iter,
        @Ptr
        long data);

    public static void sequence_set(Pointer<GSequenceIter> iter, Pointer data) {
        GLib.g_sequence_set(Pointer.getPeer(iter), Pointer.getPeer(data));
    }

    protected static native void g_sequence_swap(
        @Ptr
        long a,
        @Ptr
        long b);

    public static void sequence_swap(Pointer<GSequenceIter> a, Pointer<GSequenceIter> b) {
        GLib.g_sequence_swap(Pointer.getPeer(a), Pointer.getPeer(b));
    }

    protected static native void g_set_application_name(
        @Ptr
        long application_name);

    public static void set_application_name(Pointer application_name) {
        GLib.g_set_application_name(Pointer.getPeer(application_name));
    }

    protected static native void g_set_error(
        @Ptr
        long err, long domain, int code,
        @Ptr
        long format, Object... varargs);

    public static void set_error(Pointer<Pointer<GError>> err, long domain, int code, Pointer format, Object... varargs) {
        GLib.g_set_error(Pointer.getPeer(err), domain, code, Pointer.getPeer(format), varargs);
    }

    protected static native void g_set_error_literal(
        @Ptr
        long err, long domain, int code,
        @Ptr
        long message);

    public static void set_error_literal(Pointer<Pointer<GError>> err, long domain, int code, Pointer message) {
        GLib.g_set_error_literal(Pointer.getPeer(err), domain, code, Pointer.getPeer(message));
    }

    protected static native void g_set_prgname(
        @Ptr
        long prgname);

    public static void set_prgname(Pointer prgname) {
        GLib.g_set_prgname(Pointer.getPeer(prgname));
    }

    @Ptr
    protected static native long g_set_print_handler(
        @Ptr
        long func);

    public static Pointer set_print_handler(Pointer func) {
        return Pointer.pointerToAddress(GLib.g_set_print_handler(Pointer.getPeer(func)));
    }

    @Ptr
    protected static native long g_set_printerr_handler(
        @Ptr
        long func);

    public static Pointer set_printerr_handler(Pointer func) {
        return Pointer.pointerToAddress(GLib.g_set_printerr_handler(Pointer.getPeer(func)));
    }

    protected static native boolean g_setenv(
        @Ptr
        long variable,
        @Ptr
        long value, boolean overwrite);

    public static boolean setenv(Pointer variable, Pointer value, boolean overwrite) {
        return GLib.g_setenv(Pointer.getPeer(variable), Pointer.getPeer(value), overwrite);
    }

    public static native long g_shell_error_quark();

    protected static native boolean g_shell_parse_argv(
        @Ptr
        long command_line,
        @Ptr
        long argcp,
        @Ptr
        long argvp);

    public static boolean shell_parse_argv(Pointer command_line, Pointer<Integer> argcp, Pointer argvp) {
        return GLib.g_shell_parse_argv(Pointer.getPeer(command_line), Pointer.getPeer(argcp), Pointer.getPeer(argvp));
    }

    @Ptr
    protected static native long g_shell_quote(
        @Ptr
        long unquoted_string);

    public static Pointer shell_quote(Pointer unquoted_string) {
        return Pointer.pointerToAddress(GLib.g_shell_quote(Pointer.getPeer(unquoted_string)));
    }

    @Ptr
    protected static native long g_shell_unquote(
        @Ptr
        long quoted_string);

    public static Pointer shell_unquote(Pointer quoted_string) {
        return Pointer.pointerToAddress(GLib.g_shell_unquote(Pointer.getPeer(quoted_string)));
    }

    @Ptr
    protected static native long g_slice_alloc(long block_size);

    public static Pointer slice_alloc(long block_size) {
        return Pointer.pointerToAddress(GLib.g_slice_alloc(block_size));
    }

    @Ptr
    protected static native long g_slice_alloc0(long block_size);

    public static Pointer slice_alloc0(long block_size) {
        return Pointer.pointerToAddress(GLib.g_slice_alloc0(block_size));
    }

    @Ptr
    protected static native long g_slice_copy(long block_size,
        @Ptr
        long mem_block);

    public static Pointer slice_copy(long block_size, Pointer mem_block) {
        return Pointer.pointerToAddress(GLib.g_slice_copy(block_size, Pointer.getPeer(mem_block)));
    }

    protected static native void g_slice_free1(long block_size,
        @Ptr
        long mem_block);

    public static void slice_free1(long block_size, Pointer mem_block) {
        GLib.g_slice_free1(block_size, Pointer.getPeer(mem_block));
    }

    protected static native void g_slice_free_chain_with_offset(long block_size,
        @Ptr
        long mem_chain, long next_offset);

    public static void slice_free_chain_with_offset(long block_size, Pointer mem_chain, long next_offset) {
        GLib.g_slice_free_chain_with_offset(block_size, Pointer.getPeer(mem_chain), next_offset);
    }

    public static native long g_slice_get_config(IntValuedEnum<GSliceConfig> ckey);

    @Ptr
    protected static native long g_slice_get_config_state(IntValuedEnum<GSliceConfig> ckey, long address,
        @Ptr
        long n_values);

    public static Pointer<Long> slice_get_config_state(IntValuedEnum<GSliceConfig> ckey, long address, Pointer<Long> n_values) {
        return Pointer.pointerToAddress(GLib.g_slice_get_config_state(ckey, address, Pointer.getPeer(n_values)), Long.class);
    }

    public static native void g_slice_set_config(IntValuedEnum<GSliceConfig> ckey, long value);

    protected static native int g_snprintf(
        @Ptr
        long string, long n,
        @Ptr
        long format, Object... varargs);

    public static int snprintf(Pointer string, long n, Pointer format, Object... varargs) {
        return GLib.g_snprintf(Pointer.getPeer(string), n, Pointer.getPeer(format), varargs);
    }

    public static native boolean g_source_remove(long tag);

    protected static native boolean g_source_remove_by_funcs_user_data(
        @Ptr
        long funcs,
        @Ptr
        long user_data);

    public static boolean source_remove_by_funcs_user_data(Pointer<GSourceFuncs> funcs, Pointer user_data) {
        return GLib.g_source_remove_by_funcs_user_data(Pointer.getPeer(funcs), Pointer.getPeer(user_data));
    }

    protected static native boolean g_source_remove_by_user_data(
        @Ptr
        long user_data);

    public static boolean source_remove_by_user_data(Pointer user_data) {
        return GLib.g_source_remove_by_user_data(Pointer.getPeer(user_data));
    }

    protected static native void g_source_set_name_by_id(long tag,
        @Ptr
        long name);

    public static void source_set_name_by_id(long tag, Pointer name) {
        GLib.g_source_set_name_by_id(tag, Pointer.getPeer(name));
    }

    public static native long g_spaced_primes_closest(long num);

    protected static native boolean g_spawn_async(
        @Ptr
        long working_directory,
        @Ptr
        long argv,
        @Ptr
        long envp, IntValuedEnum<GSpawnFlags> flags,
        @Ptr
        long child_setup,
        @Ptr
        long user_data,
        @Ptr
        long child_pid);

    public static boolean spawn_async(Pointer working_directory, Pointer argv, Pointer envp, IntValuedEnum<GSpawnFlags> flags, Pointer child_setup, Pointer user_data, Pointer<Integer> child_pid) {
        return GLib.g_spawn_async(Pointer.getPeer(working_directory), Pointer.getPeer(argv), Pointer.getPeer(envp), flags, Pointer.getPeer(child_setup), Pointer.getPeer(user_data), Pointer.getPeer(child_pid));
    }

    protected static native boolean g_spawn_async_with_pipes(
        @Ptr
        long working_directory,
        @Ptr
        long argv,
        @Ptr
        long envp, IntValuedEnum<GSpawnFlags> flags,
        @Ptr
        long child_setup,
        @Ptr
        long user_data,
        @Ptr
        long child_pid,
        @Ptr
        long standard_input,
        @Ptr
        long standard_output,
        @Ptr
        long standard_error);

    public static boolean spawn_async_with_pipes(Pointer working_directory, Pointer argv, Pointer envp, IntValuedEnum<GSpawnFlags> flags, Pointer child_setup, Pointer user_data, Pointer<Integer> child_pid, Pointer<Integer> standard_input, Pointer<Integer> standard_output, Pointer<Integer> standard_error) {
        return GLib.g_spawn_async_with_pipes(Pointer.getPeer(working_directory), Pointer.getPeer(argv), Pointer.getPeer(envp), flags, Pointer.getPeer(child_setup), Pointer.getPeer(user_data), Pointer.getPeer(child_pid), Pointer.getPeer(standard_input), Pointer.getPeer(standard_output), Pointer.getPeer(standard_error));
    }

    public static native boolean g_spawn_check_exit_status(int exit_status);

    public static native void g_spawn_close_pid(int pid);

    protected static native boolean g_spawn_command_line_async(
        @Ptr
        long command_line);

    public static boolean spawn_command_line_async(Pointer command_line) {
        return GLib.g_spawn_command_line_async(Pointer.getPeer(command_line));
    }

    protected static native boolean g_spawn_command_line_sync(
        @Ptr
        long command_line,
        @Ptr
        long standard_output,
        @Ptr
        long standard_error,
        @Ptr
        long exit_status);

    public static boolean spawn_command_line_sync(Pointer command_line, Pointer<Pointer<Short>> standard_output, Pointer<Pointer<Short>> standard_error, Pointer<Integer> exit_status) {
        return GLib.g_spawn_command_line_sync(Pointer.getPeer(command_line), Pointer.getPeer(standard_output), Pointer.getPeer(standard_error), Pointer.getPeer(exit_status));
    }

    public static native long g_spawn_error_quark();

    public static native long g_spawn_exit_error_quark();

    protected static native boolean g_spawn_sync(
        @Ptr
        long working_directory,
        @Ptr
        long argv,
        @Ptr
        long envp, IntValuedEnum<GSpawnFlags> flags,
        @Ptr
        long child_setup,
        @Ptr
        long user_data,
        @Ptr
        long standard_output,
        @Ptr
        long standard_error,
        @Ptr
        long exit_status);

    public static boolean spawn_sync(Pointer working_directory, Pointer argv, Pointer envp, IntValuedEnum<GSpawnFlags> flags, Pointer child_setup, Pointer user_data, Pointer<Pointer<Short>> standard_output, Pointer<Pointer<Short>> standard_error, Pointer<Integer> exit_status) {
        return GLib.g_spawn_sync(Pointer.getPeer(working_directory), Pointer.getPeer(argv), Pointer.getPeer(envp), flags, Pointer.getPeer(child_setup), Pointer.getPeer(user_data), Pointer.getPeer(standard_output), Pointer.getPeer(standard_error), Pointer.getPeer(exit_status));
    }

    protected static native int g_sprintf(
        @Ptr
        long string,
        @Ptr
        long format, Object... varargs);

    public static int sprintf(Pointer string, Pointer format, Object... varargs) {
        return GLib.g_sprintf(Pointer.getPeer(string), Pointer.getPeer(format), varargs);
    }

    @Ptr
    protected static native long g_stpcpy(
        @Ptr
        long dest,
        @Ptr
        long src);

    public static Pointer stpcpy(Pointer dest, Pointer src) {
        return Pointer.pointerToAddress(GLib.g_stpcpy(Pointer.getPeer(dest), Pointer.getPeer(src)));
    }

    protected static native boolean g_str_equal(
        @Ptr
        long v1,
        @Ptr
        long v2);

    public static boolean str_equal(Pointer v1, Pointer v2) {
        return GLib.g_str_equal(Pointer.getPeer(v1), Pointer.getPeer(v2));
    }

    protected static native boolean g_str_has_prefix(
        @Ptr
        long str,
        @Ptr
        long prefix);

    public static boolean str_has_prefix(Pointer str, Pointer prefix) {
        return GLib.g_str_has_prefix(Pointer.getPeer(str), Pointer.getPeer(prefix));
    }

    protected static native boolean g_str_has_suffix(
        @Ptr
        long str,
        @Ptr
        long suffix);

    public static boolean str_has_suffix(Pointer str, Pointer suffix) {
        return GLib.g_str_has_suffix(Pointer.getPeer(str), Pointer.getPeer(suffix));
    }

    protected static native long g_str_hash(
        @Ptr
        long v);

    public static long str_hash(Pointer v) {
        return GLib.g_str_hash(Pointer.getPeer(v));
    }

    protected static native boolean g_str_is_ascii(
        @Ptr
        long str);

    public static boolean str_is_ascii(Pointer str) {
        return GLib.g_str_is_ascii(Pointer.getPeer(str));
    }

    protected static native boolean g_str_match_string(
        @Ptr
        long search_term,
        @Ptr
        long potential_hit, boolean accept_alternates);

    public static boolean str_match_string(Pointer search_term, Pointer potential_hit, boolean accept_alternates) {
        return GLib.g_str_match_string(Pointer.getPeer(search_term), Pointer.getPeer(potential_hit), accept_alternates);
    }

    @Ptr
    protected static native long g_str_to_ascii(
        @Ptr
        long str,
        @Ptr
        long from_locale);

    public static Pointer str_to_ascii(Pointer str, Pointer from_locale) {
        return Pointer.pointerToAddress(GLib.g_str_to_ascii(Pointer.getPeer(str), Pointer.getPeer(from_locale)));
    }

    @Ptr
    protected static native long g_str_tokenize_and_fold(
        @Ptr
        long string,
        @Ptr
        long translit_locale,
        @Ptr
        long ascii_alternates);

    public static Pointer str_tokenize_and_fold(Pointer string, Pointer translit_locale, Pointer ascii_alternates) {
        return Pointer.pointerToAddress(GLib.g_str_tokenize_and_fold(Pointer.getPeer(string), Pointer.getPeer(translit_locale), Pointer.getPeer(ascii_alternates)));
    }

    @Ptr
    protected static native long g_strcanon(
        @Ptr
        long string,
        @Ptr
        long valid_chars, char substitutor);

    public static Pointer strcanon(Pointer string, Pointer valid_chars, char substitutor) {
        return Pointer.pointerToAddress(GLib.g_strcanon(Pointer.getPeer(string), Pointer.getPeer(valid_chars), substitutor));
    }

    protected static native int g_strcasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2);

    public static int strcasecmp(Pointer s1, Pointer s2) {
        return GLib.g_strcasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2));
    }

    @Ptr
    protected static native long g_strchomp(
        @Ptr
        long string);

    public static Pointer strchomp(Pointer string) {
        return Pointer.pointerToAddress(GLib.g_strchomp(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_strchug(
        @Ptr
        long string);

    public static Pointer strchug(Pointer string) {
        return Pointer.pointerToAddress(GLib.g_strchug(Pointer.getPeer(string)));
    }

    protected static native int g_strcmp0(
        @Ptr
        long str1,
        @Ptr
        long str2);

    public static int strcmp0(Pointer str1, Pointer str2) {
        return GLib.g_strcmp0(Pointer.getPeer(str1), Pointer.getPeer(str2));
    }

    @Ptr
    protected static native long g_strcompress(
        @Ptr
        long source);

    public static Pointer strcompress(Pointer source) {
        return Pointer.pointerToAddress(GLib.g_strcompress(Pointer.getPeer(source)));
    }

    @Ptr
    protected static native long g_strconcat(
        @Ptr
        long string1, Object... varargs);

    public static Pointer strconcat(Pointer string1, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_strconcat(Pointer.getPeer(string1), varargs));
    }

    @Ptr
    protected static native long g_strdelimit(
        @Ptr
        long string,
        @Ptr
        long delimiters, char new_delimiter);

    public static Pointer strdelimit(Pointer string, Pointer delimiters, char new_delimiter) {
        return Pointer.pointerToAddress(GLib.g_strdelimit(Pointer.getPeer(string), Pointer.getPeer(delimiters), new_delimiter));
    }

    @Ptr
    protected static native long g_strdown(
        @Ptr
        long string);

    public static Pointer strdown(Pointer string) {
        return Pointer.pointerToAddress(GLib.g_strdown(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_strdup(
        @Ptr
        long str);

    public static Pointer strdup(Pointer str) {
        return Pointer.pointerToAddress(GLib.g_strdup(Pointer.getPeer(str)));
    }

    @Ptr
    protected static native long g_strdup_printf(
        @Ptr
        long format, Object... varargs);

    public static Pointer strdup_printf(Pointer format, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_strdup_printf(Pointer.getPeer(format), varargs));
    }

    @Ptr
    protected static native long g_strdupv(
        @Ptr
        long str_array);

    public static Pointer strdupv(Pointer str_array) {
        return Pointer.pointerToAddress(GLib.g_strdupv(Pointer.getPeer(str_array)));
    }

    @Ptr
    protected static native long g_strerror(int errnum);

    public static Pointer strerror(int errnum) {
        return Pointer.pointerToAddress(GLib.g_strerror(errnum));
    }

    @Ptr
    protected static native long g_strescape(
        @Ptr
        long source,
        @Ptr
        long exceptions);

    public static Pointer strescape(Pointer source, Pointer exceptions) {
        return Pointer.pointerToAddress(GLib.g_strescape(Pointer.getPeer(source), Pointer.getPeer(exceptions)));
    }

    protected static native void g_strfreev(
        @Ptr
        long str_array);

    public static void strfreev(Pointer str_array) {
        GLib.g_strfreev(Pointer.getPeer(str_array));
    }

    @Ptr
    protected static native long g_string_new(
        @Ptr
        long init);

    public static Pointer<GString> string_new(Pointer init) {
        return Pointer.pointerToAddress(GLib.g_string_new(Pointer.getPeer(init)), GString.class);
    }

    @Ptr
    protected static native long g_string_new_len(
        @Ptr
        long init, long len);

    public static Pointer<GString> string_new_len(Pointer init, long len) {
        return Pointer.pointerToAddress(GLib.g_string_new_len(Pointer.getPeer(init), len), GString.class);
    }

    @Ptr
    protected static native long g_string_sized_new(long dfl_size);

    public static Pointer<GString> string_sized_new(long dfl_size) {
        return Pointer.pointerToAddress(GLib.g_string_sized_new(dfl_size), GString.class);
    }

    @Ptr
    protected static native long g_strip_context(
        @Ptr
        long msgid,
        @Ptr
        long msgval);

    public static Pointer strip_context(Pointer msgid, Pointer msgval) {
        return Pointer.pointerToAddress(GLib.g_strip_context(Pointer.getPeer(msgid), Pointer.getPeer(msgval)));
    }

    @Ptr
    protected static native long g_strjoin(
        @Ptr
        long separator, Object... varargs);

    public static Pointer strjoin(Pointer separator, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_strjoin(Pointer.getPeer(separator), varargs));
    }

    @Ptr
    protected static native long g_strjoinv(
        @Ptr
        long separator,
        @Ptr
        long str_array);

    public static Pointer strjoinv(Pointer separator, Pointer str_array) {
        return Pointer.pointerToAddress(GLib.g_strjoinv(Pointer.getPeer(separator), Pointer.getPeer(str_array)));
    }

    protected static native long g_strlcat(
        @Ptr
        long dest,
        @Ptr
        long src, long dest_size);

    public static long strlcat(Pointer dest, Pointer src, long dest_size) {
        return GLib.g_strlcat(Pointer.getPeer(dest), Pointer.getPeer(src), dest_size);
    }

    protected static native long g_strlcpy(
        @Ptr
        long dest,
        @Ptr
        long src, long dest_size);

    public static long strlcpy(Pointer dest, Pointer src, long dest_size) {
        return GLib.g_strlcpy(Pointer.getPeer(dest), Pointer.getPeer(src), dest_size);
    }

    protected static native int g_strncasecmp(
        @Ptr
        long s1,
        @Ptr
        long s2, long n);

    public static int strncasecmp(Pointer s1, Pointer s2, long n) {
        return GLib.g_strncasecmp(Pointer.getPeer(s1), Pointer.getPeer(s2), n);
    }

    @Ptr
    protected static native long g_strndup(
        @Ptr
        long str, long n);

    public static Pointer strndup(Pointer str, long n) {
        return Pointer.pointerToAddress(GLib.g_strndup(Pointer.getPeer(str), n));
    }

    @Ptr
    protected static native long g_strnfill(long length, char fill_char);

    public static Pointer strnfill(long length, char fill_char) {
        return Pointer.pointerToAddress(GLib.g_strnfill(length, fill_char));
    }

    @Ptr
    protected static native long g_strreverse(
        @Ptr
        long string);

    public static Pointer strreverse(Pointer string) {
        return Pointer.pointerToAddress(GLib.g_strreverse(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_strrstr(
        @Ptr
        long haystack,
        @Ptr
        long needle);

    public static Pointer strrstr(Pointer haystack, Pointer needle) {
        return Pointer.pointerToAddress(GLib.g_strrstr(Pointer.getPeer(haystack), Pointer.getPeer(needle)));
    }

    @Ptr
    protected static native long g_strrstr_len(
        @Ptr
        long haystack, long haystack_len,
        @Ptr
        long needle);

    public static Pointer strrstr_len(Pointer haystack, long haystack_len, Pointer needle) {
        return Pointer.pointerToAddress(GLib.g_strrstr_len(Pointer.getPeer(haystack), haystack_len, Pointer.getPeer(needle)));
    }

    @Ptr
    protected static native long g_strsignal(int signum);

    public static Pointer strsignal(int signum) {
        return Pointer.pointerToAddress(GLib.g_strsignal(signum));
    }

    @Ptr
    protected static native long g_strsplit(
        @Ptr
        long string,
        @Ptr
        long delimiter, int max_tokens);

    public static Pointer strsplit(Pointer string, Pointer delimiter, int max_tokens) {
        return Pointer.pointerToAddress(GLib.g_strsplit(Pointer.getPeer(string), Pointer.getPeer(delimiter), max_tokens));
    }

    @Ptr
    protected static native long g_strsplit_set(
        @Ptr
        long string,
        @Ptr
        long delimiters, int max_tokens);

    public static Pointer strsplit_set(Pointer string, Pointer delimiters, int max_tokens) {
        return Pointer.pointerToAddress(GLib.g_strsplit_set(Pointer.getPeer(string), Pointer.getPeer(delimiters), max_tokens));
    }

    @Ptr
    protected static native long g_strstr_len(
        @Ptr
        long haystack, long haystack_len,
        @Ptr
        long needle);

    public static Pointer strstr_len(Pointer haystack, long haystack_len, Pointer needle) {
        return Pointer.pointerToAddress(GLib.g_strstr_len(Pointer.getPeer(haystack), haystack_len, Pointer.getPeer(needle)));
    }

    protected static native double g_strtod(
        @Ptr
        long nptr,
        @Ptr
        long endptr);

    public static double strtod(Pointer nptr, Pointer endptr) {
        return GLib.g_strtod(Pointer.getPeer(nptr), Pointer.getPeer(endptr));
    }

    @Ptr
    protected static native long g_strup(
        @Ptr
        long string);

    public static Pointer strup(Pointer string) {
        return Pointer.pointerToAddress(GLib.g_strup(Pointer.getPeer(string)));
    }

    public static native long g_strv_get_type();

    protected static native long g_strv_length(
        @Ptr
        long str_array);

    public static long strv_length(Pointer str_array) {
        return GLib.g_strv_length(Pointer.getPeer(str_array));
    }

    protected static native void g_test_add_data_func(
        @Ptr
        long testpath,
        @Ptr
        long test_data,
        @Ptr
        long test_func);

    public static void test_add_data_func(Pointer testpath, Pointer test_data, Pointer test_func) {
        GLib.g_test_add_data_func(Pointer.getPeer(testpath), Pointer.getPeer(test_data), Pointer.getPeer(test_func));
    }

    protected static native void g_test_add_data_func_full(
        @Ptr
        long testpath,
        @Ptr
        long test_data,
        @Ptr
        long test_func,
        @Ptr
        long data_free_func);

    public static void test_add_data_func_full(Pointer testpath, Pointer test_data, Pointer test_func, Pointer data_free_func) {
        GLib.g_test_add_data_func_full(Pointer.getPeer(testpath), Pointer.getPeer(test_data), Pointer.getPeer(test_func), Pointer.getPeer(data_free_func));
    }

    protected static native void g_test_add_func(
        @Ptr
        long testpath,
        @Ptr
        long test_func);

    public static void test_add_func(Pointer testpath, Pointer test_func) {
        GLib.g_test_add_func(Pointer.getPeer(testpath), Pointer.getPeer(test_func));
    }

    protected static native void g_test_add_vtable(
        @Ptr
        long testpath, long data_size,
        @Ptr
        long test_data,
        @Ptr
        long data_setup,
        @Ptr
        long data_test,
        @Ptr
        long data_teardown);

    public static void test_add_vtable(Pointer testpath, long data_size, Pointer test_data, Pointer data_setup, Pointer data_test, Pointer data_teardown) {
        GLib.g_test_add_vtable(Pointer.getPeer(testpath), data_size, Pointer.getPeer(test_data), Pointer.getPeer(data_setup), Pointer.getPeer(data_test), Pointer.getPeer(data_teardown));
    }

    protected static native void g_test_assert_expected_messages_internal(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func);

    public static void test_assert_expected_messages_internal(Pointer domain, Pointer file, int line, Pointer func) {
        GLib.g_test_assert_expected_messages_internal(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func));
    }

    protected static native void g_test_bug(
        @Ptr
        long bug_uri_snippet);

    public static void test_bug(Pointer bug_uri_snippet) {
        GLib.g_test_bug(Pointer.getPeer(bug_uri_snippet));
    }

    protected static native void g_test_bug_base(
        @Ptr
        long uri_pattern);

    public static void test_bug_base(Pointer uri_pattern) {
        GLib.g_test_bug_base(Pointer.getPeer(uri_pattern));
    }

    @Ptr
    protected static native long g_test_build_filename(IntValuedEnum<GTestFileType> file_type,
        @Ptr
        long first_path, Object... varargs);

    public static Pointer test_build_filename(IntValuedEnum<GTestFileType> file_type, Pointer first_path, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_test_build_filename(file_type, Pointer.getPeer(first_path), varargs));
    }

    @Ptr
    protected static native long g_test_create_case(
        @Ptr
        long test_name, long data_size,
        @Ptr
        long test_data,
        @Ptr
        long data_setup,
        @Ptr
        long data_test,
        @Ptr
        long data_teardown);

    public static Pointer<GTestCase> test_create_case(Pointer test_name, long data_size, Pointer test_data, Pointer data_setup, Pointer data_test, Pointer data_teardown) {
        return Pointer.pointerToAddress(GLib.g_test_create_case(Pointer.getPeer(test_name), data_size, Pointer.getPeer(test_data), Pointer.getPeer(data_setup), Pointer.getPeer(data_test), Pointer.getPeer(data_teardown)), GTestCase.class);
    }

    @Ptr
    protected static native long g_test_create_suite(
        @Ptr
        long suite_name);

    public static Pointer<GTestSuite> test_create_suite(Pointer suite_name) {
        return Pointer.pointerToAddress(GLib.g_test_create_suite(Pointer.getPeer(suite_name)), GTestSuite.class);
    }

    protected static native void g_test_expect_message(
        @Ptr
        long log_domain, IntValuedEnum<GLogLevelFlags> log_level,
        @Ptr
        long pattern);

    public static void test_expect_message(Pointer log_domain, IntValuedEnum<GLogLevelFlags> log_level, Pointer pattern) {
        GLib.g_test_expect_message(Pointer.getPeer(log_domain), log_level, Pointer.getPeer(pattern));
    }

    public static native void g_test_fail();

    public static native boolean g_test_failed();

    @Ptr
    protected static native long g_test_get_dir(IntValuedEnum<GTestFileType> file_type);

    public static Pointer test_get_dir(IntValuedEnum<GTestFileType> file_type) {
        return Pointer.pointerToAddress(GLib.g_test_get_dir(file_type));
    }

    @Ptr
    protected static native long g_test_get_filename(IntValuedEnum<GTestFileType> file_type,
        @Ptr
        long first_path, Object... varargs);

    public static Pointer test_get_filename(IntValuedEnum<GTestFileType> file_type, Pointer first_path, Object... varargs) {
        return Pointer.pointerToAddress(GLib.g_test_get_filename(file_type, Pointer.getPeer(first_path), varargs));
    }

    @Ptr
    protected static native long g_test_get_root();

    public static Pointer<GTestSuite> test_get_root() {
        return Pointer.pointerToAddress(GLib.g_test_get_root(), GTestSuite.class);
    }

    protected static native void g_test_incomplete(
        @Ptr
        long msg);

    public static void test_incomplete(Pointer msg) {
        GLib.g_test_incomplete(Pointer.getPeer(msg));
    }

    protected static native void g_test_init(
        @Ptr
        long argc,
        @Ptr
        long argv, Object... varargs);

    public static void test_init(Pointer<Integer> argc, Pointer argv, Object... varargs) {
        GLib.g_test_init(Pointer.getPeer(argc), Pointer.getPeer(argv), varargs);
    }

    protected static native void g_test_log_set_fatal_handler(
        @Ptr
        long log_func,
        @Ptr
        long user_data);

    public static void test_log_set_fatal_handler(Pointer log_func, Pointer user_data) {
        GLib.g_test_log_set_fatal_handler(Pointer.getPeer(log_func), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_test_log_type_name(IntValuedEnum<GTestLogType> log_type);

    public static Pointer test_log_type_name(IntValuedEnum<GTestLogType> log_type) {
        return Pointer.pointerToAddress(GLib.g_test_log_type_name(log_type));
    }

    protected static native void g_test_maximized_result(double maximized_quantity,
        @Ptr
        long format, Object... varargs);

    public static void test_maximized_result(double maximized_quantity, Pointer format, Object... varargs) {
        GLib.g_test_maximized_result(maximized_quantity, Pointer.getPeer(format), varargs);
    }

    protected static native void g_test_message(
        @Ptr
        long format, Object... varargs);

    public static void test_message(Pointer format, Object... varargs) {
        GLib.g_test_message(Pointer.getPeer(format), varargs);
    }

    protected static native void g_test_minimized_result(double minimized_quantity,
        @Ptr
        long format, Object... varargs);

    public static void test_minimized_result(double minimized_quantity, Pointer format, Object... varargs) {
        GLib.g_test_minimized_result(minimized_quantity, Pointer.getPeer(format), varargs);
    }

    protected static native void g_test_queue_destroy(
        @Ptr
        long destroy_func,
        @Ptr
        long destroy_data);

    public static void test_queue_destroy(Pointer destroy_func, Pointer destroy_data) {
        GLib.g_test_queue_destroy(Pointer.getPeer(destroy_func), Pointer.getPeer(destroy_data));
    }

    protected static native void g_test_queue_free(
        @Ptr
        long gfree_pointer);

    public static void test_queue_free(Pointer gfree_pointer) {
        GLib.g_test_queue_free(Pointer.getPeer(gfree_pointer));
    }

    public static native double g_test_rand_double();

    public static native double g_test_rand_double_range(double range_start, double range_end);

    public static native int g_test_rand_int();

    public static native int g_test_rand_int_range(int begin, int end);

    public static native int g_test_run();

    protected static native int g_test_run_suite(
        @Ptr
        long suite);

    public static int test_run_suite(Pointer<GTestSuite> suite) {
        return GLib.g_test_run_suite(Pointer.getPeer(suite));
    }

    public static native void g_test_set_nonfatal_assertions();

    protected static native void g_test_skip(
        @Ptr
        long msg);

    public static void test_skip(Pointer msg) {
        GLib.g_test_skip(Pointer.getPeer(msg));
    }

    public static native boolean g_test_subprocess();

    public static native double g_test_timer_elapsed();

    public static native double g_test_timer_last();

    public static native void g_test_timer_start();

    protected static native void g_test_trap_assertions(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func, long assertion_flags,
        @Ptr
        long pattern);

    public static void test_trap_assertions(Pointer domain, Pointer file, int line, Pointer func, long assertion_flags, Pointer pattern) {
        GLib.g_test_trap_assertions(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), assertion_flags, Pointer.getPeer(pattern));
    }

    public static native boolean g_test_trap_fork(long usec_timeout, IntValuedEnum<GTestTrapFlags> test_trap_flags);

    public static native boolean g_test_trap_has_passed();

    public static native boolean g_test_trap_reached_timeout();

    protected static native void g_test_trap_subprocess(
        @Ptr
        long test_path, long usec_timeout, IntValuedEnum<GTestSubprocessFlags> test_flags);

    public static void test_trap_subprocess(Pointer test_path, long usec_timeout, IntValuedEnum<GTestSubprocessFlags> test_flags) {
        GLib.g_test_trap_subprocess(Pointer.getPeer(test_path), usec_timeout, test_flags);
    }

    public static native long g_thread_error_quark();

    protected static native void g_thread_exit(
        @Ptr
        long retval);

    public static void thread_exit(Pointer retval) {
        GLib.g_thread_exit(Pointer.getPeer(retval));
    }

    public static native long g_thread_pool_get_max_idle_time();

    public static native int g_thread_pool_get_max_unused_threads();

    public static native long g_thread_pool_get_num_unused_threads();

    public static native void g_thread_pool_set_max_idle_time(long interval);

    public static native void g_thread_pool_set_max_unused_threads(int max_threads);

    public static native void g_thread_pool_stop_unused_threads();

    @Ptr
    protected static native long g_thread_self();

    public static Pointer<GThread> thread_self() {
        return Pointer.pointerToAddress(GLib.g_thread_self(), GThread.class);
    }

    public static native void g_thread_yield();

    protected static native boolean g_time_val_from_iso8601(
        @Ptr
        long iso_date,
        @Ptr
        long time_);

    public static boolean time_val_from_iso8601(Pointer iso_date, Pointer<GTimeVal> time_) {
        return GLib.g_time_val_from_iso8601(Pointer.getPeer(iso_date), Pointer.getPeer(time_));
    }

    protected static native long g_timeout_add(long interval,
        @Ptr
        long function,
        @Ptr
        long data);

    public static long timeout_add(long interval, Pointer function, Pointer data) {
        return GLib.g_timeout_add(interval, Pointer.getPeer(function), Pointer.getPeer(data));
    }

    protected static native long g_timeout_add_full(int priority, long interval,
        @Ptr
        long function,
        @Ptr
        long data,
        @Ptr
        long notify);

    public static long timeout_add_full(int priority, long interval, Pointer function, Pointer data, Pointer notify) {
        return GLib.g_timeout_add_full(priority, interval, Pointer.getPeer(function), Pointer.getPeer(data), Pointer.getPeer(notify));
    }

    protected static native long g_timeout_add_seconds(long interval,
        @Ptr
        long function,
        @Ptr
        long data);

    public static long timeout_add_seconds(long interval, Pointer function, Pointer data) {
        return GLib.g_timeout_add_seconds(interval, Pointer.getPeer(function), Pointer.getPeer(data));
    }

    protected static native long g_timeout_add_seconds_full(int priority, long interval,
        @Ptr
        long function,
        @Ptr
        long data,
        @Ptr
        long notify);

    public static long timeout_add_seconds_full(int priority, long interval, Pointer function, Pointer data, Pointer notify) {
        return GLib.g_timeout_add_seconds_full(priority, interval, Pointer.getPeer(function), Pointer.getPeer(data), Pointer.getPeer(notify));
    }

    @Ptr
    protected static native long g_timeout_source_new(long interval);

    public static Pointer<GSource> timeout_source_new(long interval) {
        return Pointer.pointerToAddress(GLib.g_timeout_source_new(interval), GSource.class);
    }

    @Ptr
    protected static native long g_timeout_source_new_seconds(long interval);

    public static Pointer<GSource> timeout_source_new_seconds(long interval) {
        return Pointer.pointerToAddress(GLib.g_timeout_source_new_seconds(interval), GSource.class);
    }

    protected static native long g_trash_stack_height(
        @Ptr
        long stack_p);

    public static long trash_stack_height(Pointer<Pointer<GTrashStack>> stack_p) {
        return GLib.g_trash_stack_height(Pointer.getPeer(stack_p));
    }

    protected static native void g_trash_stack_push(
        @Ptr
        long stack_p,
        @Ptr
        long data_p);

    public static void trash_stack_push(Pointer<Pointer<GTrashStack>> stack_p, Pointer data_p) {
        GLib.g_trash_stack_push(Pointer.getPeer(stack_p), Pointer.getPeer(data_p));
    }

    @Ptr
    protected static native long g_try_malloc(long n_bytes);

    public static Pointer try_malloc(long n_bytes) {
        return Pointer.pointerToAddress(GLib.g_try_malloc(n_bytes));
    }

    @Ptr
    protected static native long g_try_malloc0(long n_bytes);

    public static Pointer try_malloc0(long n_bytes) {
        return Pointer.pointerToAddress(GLib.g_try_malloc0(n_bytes));
    }

    @Ptr
    protected static native long g_try_malloc0_n(long n_blocks, long n_block_bytes);

    public static Pointer try_malloc0_n(long n_blocks, long n_block_bytes) {
        return Pointer.pointerToAddress(GLib.g_try_malloc0_n(n_blocks, n_block_bytes));
    }

    @Ptr
    protected static native long g_try_malloc_n(long n_blocks, long n_block_bytes);

    public static Pointer try_malloc_n(long n_blocks, long n_block_bytes) {
        return Pointer.pointerToAddress(GLib.g_try_malloc_n(n_blocks, n_block_bytes));
    }

    @Ptr
    protected static native long g_try_realloc(
        @Ptr
        long mem, long n_bytes);

    public static Pointer try_realloc(Pointer mem, long n_bytes) {
        return Pointer.pointerToAddress(GLib.g_try_realloc(Pointer.getPeer(mem), n_bytes));
    }

    @Ptr
    protected static native long g_try_realloc_n(
        @Ptr
        long mem, long n_blocks, long n_block_bytes);

    public static Pointer try_realloc_n(Pointer mem, long n_blocks, long n_block_bytes) {
        return Pointer.pointerToAddress(GLib.g_try_realloc_n(Pointer.getPeer(mem), n_blocks, n_block_bytes));
    }

    @Ptr
    protected static native long g_ucs4_to_utf16(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public static Pointer<Integer> ucs4_to_utf16(Pointer<Long> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(GLib.g_ucs4_to_utf16(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Integer.class);
    }

    @Ptr
    protected static native long g_ucs4_to_utf8(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public static Pointer ucs4_to_utf8(Pointer<Long> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(GLib.g_ucs4_to_utf8(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)));
    }

    public static native IntValuedEnum<GUnicodeBreakType> g_unichar_break_type(long c);

    public static native int g_unichar_combining_class(long uc);

    protected static native boolean g_unichar_compose(long a, long b,
        @Ptr
        long ch);

    public static boolean unichar_compose(long a, long b, Pointer<Long> ch) {
        return GLib.g_unichar_compose(a, b, Pointer.getPeer(ch));
    }

    protected static native boolean g_unichar_decompose(long ch,
        @Ptr
        long a,
        @Ptr
        long b);

    public static boolean unichar_decompose(long ch, Pointer<Long> a, Pointer<Long> b) {
        return GLib.g_unichar_decompose(ch, Pointer.getPeer(a), Pointer.getPeer(b));
    }

    public static native int g_unichar_digit_value(long c);

    protected static native long g_unichar_fully_decompose(long ch, boolean compat,
        @Ptr
        long result, long result_len);

    public static long unichar_fully_decompose(long ch, boolean compat, Pointer<Long> result, long result_len) {
        return GLib.g_unichar_fully_decompose(ch, compat, Pointer.getPeer(result), result_len);
    }

    protected static native boolean g_unichar_get_mirror_char(long ch,
        @Ptr
        long mirrored_ch);

    public static boolean unichar_get_mirror_char(long ch, Pointer<Long> mirrored_ch) {
        return GLib.g_unichar_get_mirror_char(ch, Pointer.getPeer(mirrored_ch));
    }

    public static native IntValuedEnum<GUnicodeScript> g_unichar_get_script(long ch);

    public static native boolean g_unichar_isalnum(long c);

    public static native boolean g_unichar_isalpha(long c);

    public static native boolean g_unichar_iscntrl(long c);

    public static native boolean g_unichar_isdefined(long c);

    public static native boolean g_unichar_isdigit(long c);

    public static native boolean g_unichar_isgraph(long c);

    public static native boolean g_unichar_islower(long c);

    public static native boolean g_unichar_ismark(long c);

    public static native boolean g_unichar_isprint(long c);

    public static native boolean g_unichar_ispunct(long c);

    public static native boolean g_unichar_isspace(long c);

    public static native boolean g_unichar_istitle(long c);

    public static native boolean g_unichar_isupper(long c);

    public static native boolean g_unichar_iswide(long c);

    public static native boolean g_unichar_iswide_cjk(long c);

    public static native boolean g_unichar_isxdigit(long c);

    public static native boolean g_unichar_iszerowidth(long c);

    protected static native int g_unichar_to_utf8(long c,
        @Ptr
        long outbuf);

    public static int unichar_to_utf8(long c, Pointer outbuf) {
        return GLib.g_unichar_to_utf8(c, Pointer.getPeer(outbuf));
    }

    public static native long g_unichar_tolower(long c);

    public static native long g_unichar_totitle(long c);

    public static native long g_unichar_toupper(long c);

    public static native IntValuedEnum<GUnicodeType> g_unichar_type(long c);

    public static native boolean g_unichar_validate(long ch);

    public static native int g_unichar_xdigit_value(long c);

    @Ptr
    protected static native long g_unicode_canonical_decomposition(long ch,
        @Ptr
        long result_len);

    public static Pointer<Long> unicode_canonical_decomposition(long ch, Pointer<Long> result_len) {
        return Pointer.pointerToAddress(GLib.g_unicode_canonical_decomposition(ch, Pointer.getPeer(result_len)), Long.class);
    }

    protected static native void g_unicode_canonical_ordering(
        @Ptr
        long string, long len);

    public static void unicode_canonical_ordering(Pointer<Long> string, long len) {
        GLib.g_unicode_canonical_ordering(Pointer.getPeer(string), len);
    }

    public static native IntValuedEnum<GUnicodeScript> g_unicode_script_from_iso15924(long iso15924);

    public static native long g_unicode_script_to_iso15924(IntValuedEnum<GUnicodeScript> script);

    public static native long g_unix_error_quark();

    protected static native long g_unix_fd_add(int fd, IntValuedEnum<GIOCondition> condition,
        @Ptr
        long function,
        @Ptr
        long user_data);

    public static long unix_fd_add(int fd, IntValuedEnum<GIOCondition> condition, Pointer function, Pointer user_data) {
        return GLib.g_unix_fd_add(fd, condition, Pointer.getPeer(function), Pointer.getPeer(user_data));
    }

    protected static native long g_unix_fd_add_full(int priority, int fd, IntValuedEnum<GIOCondition> condition,
        @Ptr
        long function,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public static long unix_fd_add_full(int priority, int fd, IntValuedEnum<GIOCondition> condition, Pointer function, Pointer user_data, Pointer notify) {
        return GLib.g_unix_fd_add_full(priority, fd, condition, Pointer.getPeer(function), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Ptr
    protected static native long g_unix_fd_source_new(int fd, IntValuedEnum<GIOCondition> condition);

    public static Pointer<GSource> unix_fd_source_new(int fd, IntValuedEnum<GIOCondition> condition) {
        return Pointer.pointerToAddress(GLib.g_unix_fd_source_new(fd, condition), GSource.class);
    }

    protected static native boolean g_unix_open_pipe(
        @Ptr
        long fds, int flags);

    public static boolean unix_open_pipe(Pointer<Integer> fds, int flags) {
        return GLib.g_unix_open_pipe(Pointer.getPeer(fds), flags);
    }

    public static native boolean g_unix_set_fd_nonblocking(int fd, boolean nonblock);

    protected static native long g_unix_signal_add(int signum,
        @Ptr
        long handler,
        @Ptr
        long user_data);

    public static long unix_signal_add(int signum, Pointer handler, Pointer user_data) {
        return GLib.g_unix_signal_add(signum, Pointer.getPeer(handler), Pointer.getPeer(user_data));
    }

    protected static native long g_unix_signal_add_full(int priority, int signum,
        @Ptr
        long handler,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public static long unix_signal_add_full(int priority, int signum, Pointer handler, Pointer user_data, Pointer notify) {
        return GLib.g_unix_signal_add_full(priority, signum, Pointer.getPeer(handler), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    @Ptr
    protected static native long g_unix_signal_source_new(int signum);

    public static Pointer<GSource> unix_signal_source_new(int signum) {
        return Pointer.pointerToAddress(GLib.g_unix_signal_source_new(signum), GSource.class);
    }

    protected static native int g_unlink(
        @Ptr
        long filename);

    public static int unlink(Pointer filename) {
        return GLib.g_unlink(Pointer.getPeer(filename));
    }

    protected static native void g_unsetenv(
        @Ptr
        long variable);

    public static void unsetenv(Pointer variable) {
        GLib.g_unsetenv(Pointer.getPeer(variable));
    }

    @Ptr
    protected static native long g_uri_escape_string(
        @Ptr
        long unescaped,
        @Ptr
        long reserved_chars_allowed, boolean allow_utf8);

    public static Pointer uri_escape_string(Pointer unescaped, Pointer reserved_chars_allowed, boolean allow_utf8) {
        return Pointer.pointerToAddress(GLib.g_uri_escape_string(Pointer.getPeer(unescaped), Pointer.getPeer(reserved_chars_allowed), allow_utf8));
    }

    @Ptr
    protected static native long g_uri_list_extract_uris(
        @Ptr
        long uri_list);

    public static Pointer uri_list_extract_uris(Pointer uri_list) {
        return Pointer.pointerToAddress(GLib.g_uri_list_extract_uris(Pointer.getPeer(uri_list)));
    }

    @Ptr
    protected static native long g_uri_parse_scheme(
        @Ptr
        long uri);

    public static Pointer uri_parse_scheme(Pointer uri) {
        return Pointer.pointerToAddress(GLib.g_uri_parse_scheme(Pointer.getPeer(uri)));
    }

    @Ptr
    protected static native long g_uri_unescape_segment(
        @Ptr
        long escaped_string,
        @Ptr
        long escaped_string_end,
        @Ptr
        long illegal_characters);

    public static Pointer uri_unescape_segment(Pointer escaped_string, Pointer escaped_string_end, Pointer illegal_characters) {
        return Pointer.pointerToAddress(GLib.g_uri_unescape_segment(Pointer.getPeer(escaped_string), Pointer.getPeer(escaped_string_end), Pointer.getPeer(illegal_characters)));
    }

    @Ptr
    protected static native long g_uri_unescape_string(
        @Ptr
        long escaped_string,
        @Ptr
        long illegal_characters);

    public static Pointer uri_unescape_string(Pointer escaped_string, Pointer illegal_characters) {
        return Pointer.pointerToAddress(GLib.g_uri_unescape_string(Pointer.getPeer(escaped_string), Pointer.getPeer(illegal_characters)));
    }

    public static native void g_usleep(long microseconds);

    @Ptr
    protected static native long g_utf16_to_ucs4(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public static Pointer<Long> utf16_to_ucs4(Pointer<Integer> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(GLib.g_utf16_to_ucs4(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Long.class);
    }

    @Ptr
    protected static native long g_utf16_to_utf8(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public static Pointer utf16_to_utf8(Pointer<Integer> str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(GLib.g_utf16_to_utf8(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)));
    }

    @Ptr
    protected static native long g_utf8_casefold(
        @Ptr
        long str, long len);

    public static Pointer utf8_casefold(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_utf8_casefold(Pointer.getPeer(str), len));
    }

    protected static native int g_utf8_collate(
        @Ptr
        long str1,
        @Ptr
        long str2);

    public static int utf8_collate(Pointer str1, Pointer str2) {
        return GLib.g_utf8_collate(Pointer.getPeer(str1), Pointer.getPeer(str2));
    }

    @Ptr
    protected static native long g_utf8_collate_key(
        @Ptr
        long str, long len);

    public static Pointer utf8_collate_key(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_utf8_collate_key(Pointer.getPeer(str), len));
    }

    @Ptr
    protected static native long g_utf8_collate_key_for_filename(
        @Ptr
        long str, long len);

    public static Pointer utf8_collate_key_for_filename(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_utf8_collate_key_for_filename(Pointer.getPeer(str), len));
    }

    @Ptr
    protected static native long g_utf8_find_next_char(
        @Ptr
        long p,
        @Ptr
        long end);

    public static Pointer utf8_find_next_char(Pointer p, Pointer end) {
        return Pointer.pointerToAddress(GLib.g_utf8_find_next_char(Pointer.getPeer(p), Pointer.getPeer(end)));
    }

    @Ptr
    protected static native long g_utf8_find_prev_char(
        @Ptr
        long str,
        @Ptr
        long p);

    public static Pointer utf8_find_prev_char(Pointer str, Pointer p) {
        return Pointer.pointerToAddress(GLib.g_utf8_find_prev_char(Pointer.getPeer(str), Pointer.getPeer(p)));
    }

    protected static native long g_utf8_get_char(
        @Ptr
        long p);

    public static long utf8_get_char(Pointer p) {
        return GLib.g_utf8_get_char(Pointer.getPeer(p));
    }

    protected static native long g_utf8_get_char_validated(
        @Ptr
        long p, long max_len);

    public static long utf8_get_char_validated(Pointer p, long max_len) {
        return GLib.g_utf8_get_char_validated(Pointer.getPeer(p), max_len);
    }

    @Ptr
    protected static native long g_utf8_normalize(
        @Ptr
        long str, long len, IntValuedEnum<GNormalizeMode> mode);

    public static Pointer utf8_normalize(Pointer str, long len, IntValuedEnum<GNormalizeMode> mode) {
        return Pointer.pointerToAddress(GLib.g_utf8_normalize(Pointer.getPeer(str), len, mode));
    }

    @Ptr
    protected static native long g_utf8_offset_to_pointer(
        @Ptr
        long str, long offset);

    public static Pointer utf8_offset_to_pointer(Pointer str, long offset) {
        return Pointer.pointerToAddress(GLib.g_utf8_offset_to_pointer(Pointer.getPeer(str), offset));
    }

    protected static native long g_utf8_pointer_to_offset(
        @Ptr
        long str,
        @Ptr
        long pos);

    public static long utf8_pointer_to_offset(Pointer str, Pointer pos) {
        return GLib.g_utf8_pointer_to_offset(Pointer.getPeer(str), Pointer.getPeer(pos));
    }

    @Ptr
    protected static native long g_utf8_prev_char(
        @Ptr
        long p);

    public static Pointer utf8_prev_char(Pointer p) {
        return Pointer.pointerToAddress(GLib.g_utf8_prev_char(Pointer.getPeer(p)));
    }

    @Ptr
    protected static native long g_utf8_strchr(
        @Ptr
        long p, long len, long c);

    public static Pointer utf8_strchr(Pointer p, long len, long c) {
        return Pointer.pointerToAddress(GLib.g_utf8_strchr(Pointer.getPeer(p), len, c));
    }

    @Ptr
    protected static native long g_utf8_strdown(
        @Ptr
        long str, long len);

    public static Pointer utf8_strdown(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_utf8_strdown(Pointer.getPeer(str), len));
    }

    protected static native long g_utf8_strlen(
        @Ptr
        long p, long max);

    public static long utf8_strlen(Pointer p, long max) {
        return GLib.g_utf8_strlen(Pointer.getPeer(p), max);
    }

    @Ptr
    protected static native long g_utf8_strncpy(
        @Ptr
        long dest,
        @Ptr
        long src, long n);

    public static Pointer utf8_strncpy(Pointer dest, Pointer src, long n) {
        return Pointer.pointerToAddress(GLib.g_utf8_strncpy(Pointer.getPeer(dest), Pointer.getPeer(src), n));
    }

    @Ptr
    protected static native long g_utf8_strrchr(
        @Ptr
        long p, long len, long c);

    public static Pointer utf8_strrchr(Pointer p, long len, long c) {
        return Pointer.pointerToAddress(GLib.g_utf8_strrchr(Pointer.getPeer(p), len, c));
    }

    @Ptr
    protected static native long g_utf8_strreverse(
        @Ptr
        long str, long len);

    public static Pointer utf8_strreverse(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_utf8_strreverse(Pointer.getPeer(str), len));
    }

    @Ptr
    protected static native long g_utf8_strup(
        @Ptr
        long str, long len);

    public static Pointer utf8_strup(Pointer str, long len) {
        return Pointer.pointerToAddress(GLib.g_utf8_strup(Pointer.getPeer(str), len));
    }

    @Ptr
    protected static native long g_utf8_substring(
        @Ptr
        long str, long start_pos, long end_pos);

    public static Pointer utf8_substring(Pointer str, long start_pos, long end_pos) {
        return Pointer.pointerToAddress(GLib.g_utf8_substring(Pointer.getPeer(str), start_pos, end_pos));
    }

    @Ptr
    protected static native long g_utf8_to_ucs4(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public static Pointer<Long> utf8_to_ucs4(Pointer str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(GLib.g_utf8_to_ucs4(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Long.class);
    }

    @Ptr
    protected static native long g_utf8_to_ucs4_fast(
        @Ptr
        long str, long len,
        @Ptr
        long items_written);

    public static Pointer<Long> utf8_to_ucs4_fast(Pointer str, long len, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(GLib.g_utf8_to_ucs4_fast(Pointer.getPeer(str), len, Pointer.getPeer(items_written)), Long.class);
    }

    @Ptr
    protected static native long g_utf8_to_utf16(
        @Ptr
        long str, long len,
        @Ptr
        long items_read,
        @Ptr
        long items_written);

    public static Pointer<Integer> utf8_to_utf16(Pointer str, long len, Pointer<Long> items_read, Pointer<Long> items_written) {
        return Pointer.pointerToAddress(GLib.g_utf8_to_utf16(Pointer.getPeer(str), len, Pointer.getPeer(items_read), Pointer.getPeer(items_written)), Integer.class);
    }

    protected static native boolean g_utf8_validate(
        @Ptr
        long str, long max_len,
        @Ptr
        long end);

    public static boolean utf8_validate(Pointer<Short> str, long max_len, Pointer end) {
        return GLib.g_utf8_validate(Pointer.getPeer(str), max_len, Pointer.getPeer(end));
    }

    public static native long g_variant_get_gtype();

    protected static native boolean g_variant_is_object_path(
        @Ptr
        long string);

    public static boolean variant_is_object_path(Pointer string) {
        return GLib.g_variant_is_object_path(Pointer.getPeer(string));
    }

    protected static native boolean g_variant_is_signature(
        @Ptr
        long string);

    public static boolean variant_is_signature(Pointer string) {
        return GLib.g_variant_is_signature(Pointer.getPeer(string));
    }

    @Ptr
    protected static native long g_variant_parse(
        @Ptr
        long type,
        @Ptr
        long text,
        @Ptr
        long limit,
        @Ptr
        long endptr);

    public static Pointer<GVariant> variant_parse(Pointer<GVariantType> type, Pointer text, Pointer limit, Pointer endptr) {
        return Pointer.pointerToAddress(GLib.g_variant_parse(Pointer.getPeer(type), Pointer.getPeer(text), Pointer.getPeer(limit), Pointer.getPeer(endptr)), GVariant.class);
    }

    @Ptr
    protected static native long g_variant_parse_error_print_context(
        @Ptr
        long error,
        @Ptr
        long source_str);

    public static Pointer variant_parse_error_print_context(Pointer<GError> error, Pointer source_str) {
        return Pointer.pointerToAddress(GLib.g_variant_parse_error_print_context(Pointer.getPeer(error), Pointer.getPeer(source_str)));
    }

    public static native long g_variant_parse_error_quark();

    public static native long g_variant_parser_get_error_quark();

    @Ptr
    protected static native long g_variant_type_checked_(
        @Ptr
        long arg0);

    public static Pointer<GVariantType> variant_type_checked_(Pointer arg0) {
        return Pointer.pointerToAddress(GLib.g_variant_type_checked_(Pointer.getPeer(arg0)), GVariantType.class);
    }

    protected static native boolean g_variant_type_string_is_valid(
        @Ptr
        long type_string);

    public static boolean variant_type_string_is_valid(Pointer type_string) {
        return GLib.g_variant_type_string_is_valid(Pointer.getPeer(type_string));
    }

    protected static native boolean g_variant_type_string_scan(
        @Ptr
        long string,
        @Ptr
        long limit,
        @Ptr
        long endptr);

    public static boolean variant_type_string_scan(Pointer string, Pointer limit, Pointer endptr) {
        return GLib.g_variant_type_string_scan(Pointer.getPeer(string), Pointer.getPeer(limit), Pointer.getPeer(endptr));
    }

    protected static native void g_warn_message(
        @Ptr
        long domain,
        @Ptr
        long file, int line,
        @Ptr
        long func,
        @Ptr
        long warnexpr);

    public static void warn_message(Pointer domain, Pointer file, int line, Pointer func, Pointer warnexpr) {
        GLib.g_warn_message(Pointer.getPeer(domain), Pointer.getPeer(file), line, Pointer.getPeer(func), Pointer.getPeer(warnexpr));
    }

}
