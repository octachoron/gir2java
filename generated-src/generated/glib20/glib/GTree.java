
package generated.glib20.glib;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTree
    extends StructObject
{


    public GTree() {
        super();
    }

    public GTree(Pointer pointer) {
        super(pointer);
    }

    protected native void g_tree_destroy(
        @Ptr
        long tree);

    public void destroy() {
        this.g_tree_destroy(Pointer.pointerTo(this, GTree.class));
    }

    protected native void g_tree_foreach(
        @Ptr
        long tree, Object func, Pointer user_data);

    public void foreach(Object func, Pointer user_data) {
        this.g_tree_foreach(Pointer.pointerTo(this, GTree.class), func, user_data);
    }

    protected native int g_tree_height(
        @Ptr
        long tree);

    public int height() {
        return this.g_tree_height(Pointer.pointerTo(this, GTree.class));
    }

    protected native void g_tree_insert(
        @Ptr
        long tree, Pointer key, Pointer value);

    public void insert(Pointer key, Pointer value) {
        this.g_tree_insert(Pointer.pointerTo(this, GTree.class), key, value);
    }

    protected native Pointer g_tree_lookup(
        @Ptr
        long tree, Pointer key);

    public Pointer lookup(Pointer key) {
        return this.g_tree_lookup(Pointer.pointerTo(this, GTree.class), key);
    }

    protected native boolean g_tree_lookup_extended(
        @Ptr
        long tree, Pointer lookup_key, Pointer orig_key, Pointer value);

    public boolean lookup_extended(Pointer lookup_key, Pointer orig_key, Pointer value) {
        return this.g_tree_lookup_extended(Pointer.pointerTo(this, GTree.class), lookup_key, orig_key, value);
    }

    protected native int g_tree_nnodes(
        @Ptr
        long tree);

    public int nnodes() {
        return this.g_tree_nnodes(Pointer.pointerTo(this, GTree.class));
    }

    @Ptr
    protected native long g_tree_ref(
        @Ptr
        long tree);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_tree_ref(Pointer.pointerTo(this, GTree.class)));
    }

    protected native boolean g_tree_remove(
        @Ptr
        long tree, Pointer key);

    public boolean remove(Pointer key) {
        return this.g_tree_remove(Pointer.pointerTo(this, GTree.class), key);
    }

    protected native void g_tree_replace(
        @Ptr
        long tree, Pointer key, Pointer value);

    public void replace(Pointer key, Pointer value) {
        this.g_tree_replace(Pointer.pointerTo(this, GTree.class), key, value);
    }

    protected native Pointer g_tree_search(
        @Ptr
        long tree, Object search_func, Pointer user_data);

    public Pointer search(Object search_func, Pointer user_data) {
        return this.g_tree_search(Pointer.pointerTo(this, GTree.class), search_func, user_data);
    }

    protected native boolean g_tree_steal(
        @Ptr
        long tree, Pointer key);

    public boolean steal(Pointer key) {
        return this.g_tree_steal(Pointer.pointerTo(this, GTree.class), key);
    }

    protected native void g_tree_traverse(
        @Ptr
        long tree, Object traverse_func, IntValuedEnum<GTraverseType> traverse_type, Pointer user_data);

    public void traverse(Object traverse_func, IntValuedEnum<GTraverseType> traverse_type, Pointer user_data) {
        this.g_tree_traverse(Pointer.pointerTo(this, GTree.class), traverse_func, traverse_type, user_data);
    }

    protected native void g_tree_unref(
        @Ptr
        long tree);

    public void unref() {
        this.g_tree_unref(Pointer.pointerTo(this, GTree.class));
    }

    @Ptr
    protected native long g_tree_new(Object key_compare_func);

    public Pointer _new(Object key_compare_func) {
        return Pointer.pointerToAddress(this.g_tree_new(key_compare_func));
    }

    @Ptr
    protected native long g_tree_new_full(Object key_compare_func, Pointer key_compare_data, Object key_destroy_func, Object value_destroy_func);

    public Pointer new_full(Object key_compare_func, Pointer key_compare_data, Object key_destroy_func, Object value_destroy_func) {
        return Pointer.pointerToAddress(this.g_tree_new_full(key_compare_func, key_compare_data, key_destroy_func, value_destroy_func));
    }

    @Ptr
    protected native long g_tree_new_with_data(Object key_compare_func, Pointer key_compare_data);

    public Pointer new_with_data(Object key_compare_func, Pointer key_compare_data) {
        return Pointer.pointerToAddress(this.g_tree_new_with_data(key_compare_func, key_compare_data));
    }

}
