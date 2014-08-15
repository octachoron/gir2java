
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTree
    extends StructObject
{


    static {
        BridJ.register();
    }

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
        this.g_tree_destroy(Pointer.pointerTo(this, GTree.class).getPeer());
    }

    protected native void g_tree_foreach(
        @Ptr
        long tree,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void foreach(Pointer func, Pointer user_data) {
        this.g_tree_foreach(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native int g_tree_height(
        @Ptr
        long tree);

    public int height() {
        return this.g_tree_height(Pointer.pointerTo(this, GTree.class).getPeer());
    }

    protected native void g_tree_insert(
        @Ptr
        long tree,
        @Ptr
        long key,
        @Ptr
        long value);

    public void insert(Pointer key, Pointer value) {
        this.g_tree_insert(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_tree_lookup(
        @Ptr
        long tree,
        @Ptr
        long key);

    public Pointer lookup(Pointer key) {
        return Pointer.pointerToAddress(this.g_tree_lookup(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(key)));
    }

    protected native boolean g_tree_lookup_extended(
        @Ptr
        long tree,
        @Ptr
        long lookup_key,
        @Ptr
        long orig_key,
        @Ptr
        long value);

    public boolean lookup_extended(Pointer lookup_key, Pointer orig_key, Pointer value) {
        return this.g_tree_lookup_extended(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(lookup_key), Pointer.getPeer(orig_key), Pointer.getPeer(value));
    }

    protected native int g_tree_nnodes(
        @Ptr
        long tree);

    public int nnodes() {
        return this.g_tree_nnodes(Pointer.pointerTo(this, GTree.class).getPeer());
    }

    @Ptr
    protected native long g_tree_ref(
        @Ptr
        long tree);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_tree_ref(Pointer.pointerTo(this, GTree.class).getPeer()));
    }

    protected native boolean g_tree_remove(
        @Ptr
        long tree,
        @Ptr
        long key);

    public boolean remove(Pointer key) {
        return this.g_tree_remove(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(key));
    }

    protected native void g_tree_replace(
        @Ptr
        long tree,
        @Ptr
        long key,
        @Ptr
        long value);

    public void replace(Pointer key, Pointer value) {
        this.g_tree_replace(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_tree_search(
        @Ptr
        long tree,
        @Ptr
        long search_func,
        @Ptr
        long user_data);

    public Pointer search(Pointer search_func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_tree_search(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(search_func), Pointer.getPeer(user_data)));
    }

    protected native boolean g_tree_steal(
        @Ptr
        long tree,
        @Ptr
        long key);

    public boolean steal(Pointer key) {
        return this.g_tree_steal(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(key));
    }

    protected native void g_tree_traverse(
        @Ptr
        long tree,
        @Ptr
        long traverse_func, IntValuedEnum<GTraverseType> traverse_type,
        @Ptr
        long user_data);

    public void traverse(Pointer traverse_func, IntValuedEnum<GTraverseType> traverse_type, Pointer user_data) {
        this.g_tree_traverse(Pointer.pointerTo(this, GTree.class).getPeer(), Pointer.getPeer(traverse_func), traverse_type, Pointer.getPeer(user_data));
    }

    protected native void g_tree_unref(
        @Ptr
        long tree);

    public void unref() {
        this.g_tree_unref(Pointer.pointerTo(this, GTree.class).getPeer());
    }

    @Ptr
    protected static native long g_tree_new(
        @Ptr
        long key_compare_func);

    public static Pointer _new(Pointer key_compare_func) {
        return Pointer.pointerToAddress(GTree.g_tree_new(Pointer.getPeer(key_compare_func)));
    }

    @Ptr
    protected static native long g_tree_new_full(
        @Ptr
        long key_compare_func,
        @Ptr
        long key_compare_data,
        @Ptr
        long key_destroy_func,
        @Ptr
        long value_destroy_func);

    public static Pointer new_full(Pointer key_compare_func, Pointer key_compare_data, Pointer key_destroy_func, Pointer value_destroy_func) {
        return Pointer.pointerToAddress(GTree.g_tree_new_full(Pointer.getPeer(key_compare_func), Pointer.getPeer(key_compare_data), Pointer.getPeer(key_destroy_func), Pointer.getPeer(value_destroy_func)));
    }

    @Ptr
    protected static native long g_tree_new_with_data(
        @Ptr
        long key_compare_func,
        @Ptr
        long key_compare_data);

    public static Pointer new_with_data(Pointer key_compare_func, Pointer key_compare_data) {
        return Pointer.pointerToAddress(GTree.g_tree_new_with_data(Pointer.getPeer(key_compare_func), Pointer.getPeer(key_compare_data)));
    }

}
