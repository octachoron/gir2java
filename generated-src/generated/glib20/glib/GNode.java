
package generated.glib20.glib;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GNode
    extends StructObject
{


    public GNode() {
        super();
    }

    public GNode(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNode field_data(Pointer field_data) {
        this.io.setNativeObjectField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public Pointer field_next() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GNode field_next(Pointer field_next) {
        this.io.setPointerField(this, 1, field_next);
        return this;
    }

    @Field(2)
    public Pointer field_prev() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GNode field_prev(Pointer field_prev) {
        this.io.setPointerField(this, 2, field_prev);
        return this;
    }

    @Field(3)
    public Pointer field_parent() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GNode field_parent(Pointer field_parent) {
        this.io.setPointerField(this, 3, field_parent);
        return this;
    }

    @Field(4)
    public Pointer field_children() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GNode field_children(Pointer field_children) {
        this.io.setPointerField(this, 4, field_children);
        return this;
    }

    protected native int g_node_child_index(
        @Ptr
        long node, Pointer data);

    public int child_index(Pointer data) {
        return this.g_node_child_index(Pointer.pointerTo(this, GNode.class), data);
    }

    protected native int g_node_child_position(
        @Ptr
        long node,
        @Ptr
        long child);

    public int child_position(Pointer child) {
        return this.g_node_child_position(Pointer.pointerTo(this, GNode.class), Pointer.getPeer(child));
    }

    @Ptr
    protected native long g_node_copy(
        @Ptr
        long node);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_node_copy(Pointer.pointerTo(this, GNode.class)));
    }

    @Ptr
    protected native long g_node_copy_deep(
        @Ptr
        long node, Object copy_func, Pointer data);

    public Pointer copy_deep(Object copy_func, Pointer data) {
        return Pointer.pointerToAddress(this.g_node_copy_deep(Pointer.pointerTo(this, GNode.class), copy_func, data));
    }

    protected native long g_node_depth(
        @Ptr
        long node);

    public long depth() {
        return this.g_node_depth(Pointer.pointerTo(this, GNode.class));
    }

    protected native void g_node_destroy(
        @Ptr
        long root);

    public void destroy() {
        this.g_node_destroy(Pointer.pointerTo(this, GNode.class));
    }

    @Ptr
    protected native long g_node_first_sibling(
        @Ptr
        long node);

    public Pointer first_sibling() {
        return Pointer.pointerToAddress(this.g_node_first_sibling(Pointer.pointerTo(this, GNode.class)));
    }

    @Ptr
    protected native long g_node_get_root(
        @Ptr
        long node);

    public Pointer get_root() {
        return Pointer.pointerToAddress(this.g_node_get_root(Pointer.pointerTo(this, GNode.class)));
    }

    @Ptr
    protected native long g_node_insert(
        @Ptr
        long parent, int position,
        @Ptr
        long node);

    public Pointer insert(int position, Pointer node) {
        return Pointer.pointerToAddress(this.g_node_insert(Pointer.pointerTo(this, GNode.class), position, Pointer.getPeer(node)));
    }

    @Ptr
    protected native long g_node_insert_after(
        @Ptr
        long parent,
        @Ptr
        long sibling,
        @Ptr
        long node);

    public Pointer insert_after(Pointer sibling, Pointer node) {
        return Pointer.pointerToAddress(this.g_node_insert_after(Pointer.pointerTo(this, GNode.class), Pointer.getPeer(sibling), Pointer.getPeer(node)));
    }

    @Ptr
    protected native long g_node_insert_before(
        @Ptr
        long parent,
        @Ptr
        long sibling,
        @Ptr
        long node);

    public Pointer insert_before(Pointer sibling, Pointer node) {
        return Pointer.pointerToAddress(this.g_node_insert_before(Pointer.pointerTo(this, GNode.class), Pointer.getPeer(sibling), Pointer.getPeer(node)));
    }

    protected native boolean g_node_is_ancestor(
        @Ptr
        long node,
        @Ptr
        long descendant);

    public boolean is_ancestor(Pointer descendant) {
        return this.g_node_is_ancestor(Pointer.pointerTo(this, GNode.class), Pointer.getPeer(descendant));
    }

    @Ptr
    protected native long g_node_last_child(
        @Ptr
        long node);

    public Pointer last_child() {
        return Pointer.pointerToAddress(this.g_node_last_child(Pointer.pointerTo(this, GNode.class)));
    }

    @Ptr
    protected native long g_node_last_sibling(
        @Ptr
        long node);

    public Pointer last_sibling() {
        return Pointer.pointerToAddress(this.g_node_last_sibling(Pointer.pointerTo(this, GNode.class)));
    }

    protected native long g_node_max_height(
        @Ptr
        long root);

    public long max_height() {
        return this.g_node_max_height(Pointer.pointerTo(this, GNode.class));
    }

    protected native long g_node_n_children(
        @Ptr
        long node);

    public long n_children() {
        return this.g_node_n_children(Pointer.pointerTo(this, GNode.class));
    }

    @Ptr
    protected native long g_node_nth_child(
        @Ptr
        long node, long n);

    public Pointer nth_child(long n) {
        return Pointer.pointerToAddress(this.g_node_nth_child(Pointer.pointerTo(this, GNode.class), n));
    }

    @Ptr
    protected native long g_node_prepend(
        @Ptr
        long parent,
        @Ptr
        long node);

    public Pointer prepend(Pointer node) {
        return Pointer.pointerToAddress(this.g_node_prepend(Pointer.pointerTo(this, GNode.class), Pointer.getPeer(node)));
    }

    protected native void g_node_reverse_children(
        @Ptr
        long node);

    public void reverse_children() {
        this.g_node_reverse_children(Pointer.pointerTo(this, GNode.class));
    }

    protected native void g_node_unlink(
        @Ptr
        long node);

    public void unlink() {
        this.g_node_unlink(Pointer.pointerTo(this, GNode.class));
    }

    @Ptr
    protected native long g_node_new(Pointer data);

    public Pointer _new(Pointer data) {
        return Pointer.pointerToAddress(this.g_node_new(data));
    }

    protected native void g_node_traverse(
        @Ptr
        long root, IntValuedEnum<GTraverseType> order, Object flags, int max_depth, Object func, Pointer data);

    public void traverse(IntValuedEnum<GTraverseType> order, Object flags, int max_depth, Object func, Pointer data) {
        this.g_node_traverse(Pointer.pointerTo(this, GNode.class), order, flags, max_depth, func, data);
    }

    protected native long g_node_n_nodes(
        @Ptr
        long root, Object flags);

    public long n_nodes(Object flags) {
        return this.g_node_n_nodes(Pointer.pointerTo(this, GNode.class), flags);
    }

    protected native void g_node_children_foreach(
        @Ptr
        long node, Object flags, Object func, Pointer data);

    public void children_foreach(Object flags, Object func, Pointer data) {
        this.g_node_children_foreach(Pointer.pointerTo(this, GNode.class), flags, func, data);
    }

    @Ptr
    protected native long g_node_find(
        @Ptr
        long root, IntValuedEnum<GTraverseType> order, Object flags, Pointer data);

    public Pointer<GNode> find(IntValuedEnum<GTraverseType> order, Object flags, Pointer data) {
        return Pointer.pointerToAddress(this.g_node_find(Pointer.pointerTo(this, GNode.class), order, flags, data), Pointer.class);
    }

    @Ptr
    protected native long g_node_find_child(
        @Ptr
        long node, Object flags, Pointer data);

    public Pointer<GNode> find_child(Object flags, Pointer data) {
        return Pointer.pointerToAddress(this.g_node_find_child(Pointer.pointerTo(this, GNode.class), flags, data), Pointer.class);
    }

}
