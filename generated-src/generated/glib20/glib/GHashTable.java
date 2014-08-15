
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHashTable
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GHashTable() {
        super();
    }

    public GHashTable(Pointer pointer) {
        super(pointer);
    }

    protected static native boolean g_hash_table_add(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean add(Pointer hash_table, Pointer key) {
        return GHashTable.g_hash_table_add(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native boolean g_hash_table_contains(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean contains(Pointer hash_table, Pointer key) {
        return GHashTable.g_hash_table_contains(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native void g_hash_table_destroy(
        @Ptr
        long hash_table);

    public static void destroy(Pointer hash_table) {
        GHashTable.g_hash_table_destroy(Pointer.getPeer(hash_table));
    }

    @Ptr
    protected static native long g_hash_table_find(
        @Ptr
        long hash_table,
        @Ptr
        long predicate,
        @Ptr
        long user_data);

    public static Pointer find(Pointer hash_table, Pointer predicate, Pointer user_data) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_find(Pointer.getPeer(hash_table), Pointer.getPeer(predicate), Pointer.getPeer(user_data)));
    }

    protected static native void g_hash_table_foreach(
        @Ptr
        long hash_table,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static void foreach(Pointer hash_table, Pointer func, Pointer user_data) {
        GHashTable.g_hash_table_foreach(Pointer.getPeer(hash_table), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected static native long g_hash_table_foreach_remove(
        @Ptr
        long hash_table,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static long foreach_remove(Pointer hash_table, Pointer func, Pointer user_data) {
        return GHashTable.g_hash_table_foreach_remove(Pointer.getPeer(hash_table), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected static native long g_hash_table_foreach_steal(
        @Ptr
        long hash_table,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static long foreach_steal(Pointer hash_table, Pointer func, Pointer user_data) {
        return GHashTable.g_hash_table_foreach_steal(Pointer.getPeer(hash_table), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_hash_table_get_keys(
        @Ptr
        long hash_table);

    public static Pointer get_keys(Pointer hash_table) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_get_keys(Pointer.getPeer(hash_table)));
    }

    @Ptr
    protected static native long g_hash_table_get_keys_as_array(
        @Ptr
        long hash_table,
        @Ptr
        long length);

    public static Pointer get_keys_as_array(Pointer hash_table, Pointer<Long> length) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_get_keys_as_array(Pointer.getPeer(hash_table), Pointer.getPeer(length)));
    }

    @Ptr
    protected static native long g_hash_table_get_values(
        @Ptr
        long hash_table);

    public static Pointer get_values(Pointer hash_table) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_get_values(Pointer.getPeer(hash_table)));
    }

    protected static native boolean g_hash_table_insert(
        @Ptr
        long hash_table,
        @Ptr
        long key,
        @Ptr
        long value);

    public static boolean insert(Pointer hash_table, Pointer key, Pointer value) {
        return GHashTable.g_hash_table_insert(Pointer.getPeer(hash_table), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    @Ptr
    protected static native long g_hash_table_lookup(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static Pointer lookup(Pointer hash_table, Pointer key) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_lookup(Pointer.getPeer(hash_table), Pointer.getPeer(key)));
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

    public static boolean lookup_extended(Pointer hash_table, Pointer lookup_key, Pointer orig_key, Pointer value) {
        return GHashTable.g_hash_table_lookup_extended(Pointer.getPeer(hash_table), Pointer.getPeer(lookup_key), Pointer.getPeer(orig_key), Pointer.getPeer(value));
    }

    @Ptr
    protected static native long g_hash_table_new(
        @Ptr
        long hash_func,
        @Ptr
        long key_equal_func);

    public static Pointer _new(Pointer hash_func, Pointer key_equal_func) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_new(Pointer.getPeer(hash_func), Pointer.getPeer(key_equal_func)));
    }

    @Ptr
    protected static native long g_hash_table_new_full(
        @Ptr
        long hash_func,
        @Ptr
        long key_equal_func,
        @Ptr
        long key_destroy_func,
        @Ptr
        long value_destroy_func);

    public static Pointer new_full(Pointer hash_func, Pointer key_equal_func, Pointer key_destroy_func, Pointer value_destroy_func) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_new_full(Pointer.getPeer(hash_func), Pointer.getPeer(key_equal_func), Pointer.getPeer(key_destroy_func), Pointer.getPeer(value_destroy_func)));
    }

    @Ptr
    protected static native long g_hash_table_ref(
        @Ptr
        long hash_table);

    public static Pointer ref(Pointer hash_table) {
        return Pointer.pointerToAddress(GHashTable.g_hash_table_ref(Pointer.getPeer(hash_table)));
    }

    protected static native boolean g_hash_table_remove(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean remove(Pointer hash_table, Pointer key) {
        return GHashTable.g_hash_table_remove(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native void g_hash_table_remove_all(
        @Ptr
        long hash_table);

    public static void remove_all(Pointer hash_table) {
        GHashTable.g_hash_table_remove_all(Pointer.getPeer(hash_table));
    }

    protected static native boolean g_hash_table_replace(
        @Ptr
        long hash_table,
        @Ptr
        long key,
        @Ptr
        long value);

    public static boolean replace(Pointer hash_table, Pointer key, Pointer value) {
        return GHashTable.g_hash_table_replace(Pointer.getPeer(hash_table), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected static native long g_hash_table_size(
        @Ptr
        long hash_table);

    public static long size(Pointer hash_table) {
        return GHashTable.g_hash_table_size(Pointer.getPeer(hash_table));
    }

    protected static native boolean g_hash_table_steal(
        @Ptr
        long hash_table,
        @Ptr
        long key);

    public static boolean steal(Pointer hash_table, Pointer key) {
        return GHashTable.g_hash_table_steal(Pointer.getPeer(hash_table), Pointer.getPeer(key));
    }

    protected static native void g_hash_table_steal_all(
        @Ptr
        long hash_table);

    public static void steal_all(Pointer hash_table) {
        GHashTable.g_hash_table_steal_all(Pointer.getPeer(hash_table));
    }

    protected static native void g_hash_table_unref(
        @Ptr
        long hash_table);

    public static void unref(Pointer hash_table) {
        GHashTable.g_hash_table_unref(Pointer.getPeer(hash_table));
    }

}
