
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHashTable
    extends StructObject
{


    public GHashTable() {
        super();
    }

    public GHashTable(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_hash_table_add(
        @Ptr
        long hash_table, Pointer key);

    public boolean add(Pointer hash_table, Pointer key) {
        return this.g_hash_table_add(Pointer.getPeer(hash_table), key);
    }

    protected native boolean g_hash_table_contains(
        @Ptr
        long hash_table, Pointer key);

    public boolean contains(Pointer hash_table, Pointer key) {
        return this.g_hash_table_contains(Pointer.getPeer(hash_table), key);
    }

    protected native void g_hash_table_destroy(
        @Ptr
        long hash_table);

    public void destroy(Pointer hash_table) {
        this.g_hash_table_destroy(Pointer.getPeer(hash_table));
    }

    protected native Pointer g_hash_table_find(
        @Ptr
        long hash_table, Object predicate, Pointer user_data);

    public Pointer find(Pointer hash_table, Object predicate, Pointer user_data) {
        return this.g_hash_table_find(Pointer.getPeer(hash_table), predicate, user_data);
    }

    protected native void g_hash_table_foreach(
        @Ptr
        long hash_table, Object func, Pointer user_data);

    public void foreach(Pointer hash_table, Object func, Pointer user_data) {
        this.g_hash_table_foreach(Pointer.getPeer(hash_table), func, user_data);
    }

    protected native long g_hash_table_foreach_remove(
        @Ptr
        long hash_table, Object func, Pointer user_data);

    public long foreach_remove(Pointer hash_table, Object func, Pointer user_data) {
        return this.g_hash_table_foreach_remove(Pointer.getPeer(hash_table), func, user_data);
    }

    protected native long g_hash_table_foreach_steal(
        @Ptr
        long hash_table, Object func, Pointer user_data);

    public long foreach_steal(Pointer hash_table, Object func, Pointer user_data) {
        return this.g_hash_table_foreach_steal(Pointer.getPeer(hash_table), func, user_data);
    }

    @Ptr
    protected native long g_hash_table_get_keys(
        @Ptr
        long hash_table);

    public Pointer get_keys(Pointer hash_table) {
        return Pointer.pointerToAddress(this.g_hash_table_get_keys(Pointer.getPeer(hash_table)));
    }

    @Ptr
    protected native long g_hash_table_get_keys_as_array(
        @Ptr
        long hash_table,
        @Ptr
        long length);

    public Pointer get_keys_as_array(Pointer hash_table, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_hash_table_get_keys_as_array(Pointer.getPeer(hash_table), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_hash_table_get_values(
        @Ptr
        long hash_table);

    public Pointer get_values(Pointer hash_table) {
        return Pointer.pointerToAddress(this.g_hash_table_get_values(Pointer.getPeer(hash_table)));
    }

    protected native boolean g_hash_table_insert(
        @Ptr
        long hash_table, Pointer key, Pointer value);

    public boolean insert(Pointer hash_table, Pointer key, Pointer value) {
        return this.g_hash_table_insert(Pointer.getPeer(hash_table), key, value);
    }

    protected native Pointer g_hash_table_lookup(
        @Ptr
        long hash_table, Pointer key);

    public Pointer lookup(Pointer hash_table, Pointer key) {
        return this.g_hash_table_lookup(Pointer.getPeer(hash_table), key);
    }

    protected native boolean g_hash_table_lookup_extended(
        @Ptr
        long hash_table, Pointer lookup_key, Pointer orig_key, Pointer value);

    public boolean lookup_extended(Pointer hash_table, Pointer lookup_key, Pointer orig_key, Pointer value) {
        return this.g_hash_table_lookup_extended(Pointer.getPeer(hash_table), lookup_key, orig_key, value);
    }

    @Ptr
    protected native long g_hash_table_new(Object hash_func, Object key_equal_func);

    public Pointer _new(Object hash_func, Object key_equal_func) {
        return Pointer.pointerToAddress(this.g_hash_table_new(hash_func, key_equal_func));
    }

    @Ptr
    protected native long g_hash_table_new_full(Object hash_func, Object key_equal_func, Object key_destroy_func, Object value_destroy_func);

    public Pointer new_full(Object hash_func, Object key_equal_func, Object key_destroy_func, Object value_destroy_func) {
        return Pointer.pointerToAddress(this.g_hash_table_new_full(hash_func, key_equal_func, key_destroy_func, value_destroy_func));
    }

    @Ptr
    protected native long g_hash_table_ref(
        @Ptr
        long hash_table);

    public Pointer ref(Pointer hash_table) {
        return Pointer.pointerToAddress(this.g_hash_table_ref(Pointer.getPeer(hash_table)));
    }

    protected native boolean g_hash_table_remove(
        @Ptr
        long hash_table, Pointer key);

    public boolean remove(Pointer hash_table, Pointer key) {
        return this.g_hash_table_remove(Pointer.getPeer(hash_table), key);
    }

    protected native void g_hash_table_remove_all(
        @Ptr
        long hash_table);

    public void remove_all(Pointer hash_table) {
        this.g_hash_table_remove_all(Pointer.getPeer(hash_table));
    }

    protected native boolean g_hash_table_replace(
        @Ptr
        long hash_table, Pointer key, Pointer value);

    public boolean replace(Pointer hash_table, Pointer key, Pointer value) {
        return this.g_hash_table_replace(Pointer.getPeer(hash_table), key, value);
    }

    protected native long g_hash_table_size(
        @Ptr
        long hash_table);

    public long size(Pointer hash_table) {
        return this.g_hash_table_size(Pointer.getPeer(hash_table));
    }

    protected native boolean g_hash_table_steal(
        @Ptr
        long hash_table, Pointer key);

    public boolean steal(Pointer hash_table, Pointer key) {
        return this.g_hash_table_steal(Pointer.getPeer(hash_table), key);
    }

    protected native void g_hash_table_steal_all(
        @Ptr
        long hash_table);

    public void steal_all(Pointer hash_table) {
        this.g_hash_table_steal_all(Pointer.getPeer(hash_table));
    }

    protected native void g_hash_table_unref(
        @Ptr
        long hash_table);

    public void unref(Pointer hash_table) {
        this.g_hash_table_unref(Pointer.getPeer(hash_table));
    }

}
