
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHashTableIter
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GHashTableIter() {
        super();
    }

    public GHashTableIter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer ghashtableiter_field_dummy1() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GHashTableIter ghashtableiter_field_dummy1(Pointer ghashtableiter_field_dummy1) {
        this.io.setPointerField(this, 0, ghashtableiter_field_dummy1);
        return this;
    }

    @Field(1)
    private Pointer ghashtableiter_field_dummy2() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GHashTableIter ghashtableiter_field_dummy2(Pointer ghashtableiter_field_dummy2) {
        this.io.setPointerField(this, 1, ghashtableiter_field_dummy2);
        return this;
    }

    @Field(2)
    private Pointer ghashtableiter_field_dummy3() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GHashTableIter ghashtableiter_field_dummy3(Pointer ghashtableiter_field_dummy3) {
        this.io.setPointerField(this, 2, ghashtableiter_field_dummy3);
        return this;
    }

    @Field(3)
    private int ghashtableiter_field_dummy4() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    private GHashTableIter ghashtableiter_field_dummy4(int ghashtableiter_field_dummy4) {
        this.io.setIntField(this, 3, ghashtableiter_field_dummy4);
        return this;
    }

    @Field(4)
    private boolean ghashtableiter_field_dummy5() {
        return this.io.getBooleanField(this, 4);
    }

    @Field(4)
    private GHashTableIter ghashtableiter_field_dummy5(boolean ghashtableiter_field_dummy5) {
        this.io.setBooleanField(this, 4, ghashtableiter_field_dummy5);
        return this;
    }

    @Field(5)
    private Pointer ghashtableiter_field_dummy6() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GHashTableIter ghashtableiter_field_dummy6(Pointer ghashtableiter_field_dummy6) {
        this.io.setPointerField(this, 5, ghashtableiter_field_dummy6);
        return this;
    }

    @Ptr
    protected native long g_hash_table_iter_get_hash_table(
        @Ptr
        long iter);

    public Pointer<GHashTable> get_hash_table() {
        return Pointer.pointerToAddress(this.g_hash_table_iter_get_hash_table(Pointer.pointerTo(this, GHashTableIter.class).getPeer()), GHashTable.class);
    }

    protected native void g_hash_table_iter_init(
        @Ptr
        long iter,
        @Ptr
        long hash_table);

    public void init(Pointer<GHashTable> hash_table) {
        this.g_hash_table_iter_init(Pointer.pointerTo(this, GHashTableIter.class).getPeer(), Pointer.getPeer(hash_table));
    }

    protected native boolean g_hash_table_iter_next(
        @Ptr
        long iter,
        @Ptr
        long key,
        @Ptr
        long value);

    public boolean next(Pointer key, Pointer value) {
        return this.g_hash_table_iter_next(Pointer.pointerTo(this, GHashTableIter.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected native void g_hash_table_iter_remove(
        @Ptr
        long iter);

    public void remove() {
        this.g_hash_table_iter_remove(Pointer.pointerTo(this, GHashTableIter.class).getPeer());
    }

    protected native void g_hash_table_iter_replace(
        @Ptr
        long iter,
        @Ptr
        long value);

    public void replace(Pointer value) {
        this.g_hash_table_iter_replace(Pointer.pointerTo(this, GHashTableIter.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_hash_table_iter_steal(
        @Ptr
        long iter);

    public void steal() {
        this.g_hash_table_iter_steal(Pointer.pointerTo(this, GHashTableIter.class).getPeer());
    }

}
