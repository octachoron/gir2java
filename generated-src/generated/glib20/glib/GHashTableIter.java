
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GHashTableIter
    extends StructObject
{


    public GHashTableIter() {
        super();
    }

    public GHashTableIter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_dummy1() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GHashTableIter field_dummy1(Pointer field_dummy1) {
        this.io.setNativeObjectField(this, 0, field_dummy1);
        return this;
    }

    @Field(1)
    public Pointer field_dummy2() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GHashTableIter field_dummy2(Pointer field_dummy2) {
        this.io.setNativeObjectField(this, 1, field_dummy2);
        return this;
    }

    @Field(2)
    public Pointer field_dummy3() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GHashTableIter field_dummy3(Pointer field_dummy3) {
        this.io.setNativeObjectField(this, 2, field_dummy3);
        return this;
    }

    @Field(3)
    public int field_dummy4() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GHashTableIter field_dummy4(int field_dummy4) {
        this.io.setNativeObjectField(this, 3, field_dummy4);
        return this;
    }

    @Field(4)
    public boolean field_dummy5() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GHashTableIter field_dummy5(boolean field_dummy5) {
        this.io.setNativeObjectField(this, 4, field_dummy5);
        return this;
    }

    @Field(5)
    public Pointer field_dummy6() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GHashTableIter field_dummy6(Pointer field_dummy6) {
        this.io.setNativeObjectField(this, 5, field_dummy6);
        return this;
    }

    @Ptr
    protected native long g_hash_table_iter_get_hash_table(
        @Ptr
        long iter);

    public Pointer<GHashTable> get_hash_table() {
        return Pointer.pointerToAddress(this.g_hash_table_iter_get_hash_table(Pointer.pointerTo(this, GHashTableIter.class)), Pointer.class);
    }

    protected native void g_hash_table_iter_init(
        @Ptr
        long iter,
        @Ptr
        long hash_table);

    public void init(Pointer<GHashTable> hash_table) {
        this.g_hash_table_iter_init(Pointer.pointerTo(this, GHashTableIter.class), Pointer.getPeer(hash_table));
    }

    protected native boolean g_hash_table_iter_next(
        @Ptr
        long iter, Pointer key, Pointer value);

    public boolean next(Pointer key, Pointer value) {
        return this.g_hash_table_iter_next(Pointer.pointerTo(this, GHashTableIter.class), key, value);
    }

    protected native void g_hash_table_iter_remove(
        @Ptr
        long iter);

    public void remove() {
        this.g_hash_table_iter_remove(Pointer.pointerTo(this, GHashTableIter.class));
    }

    protected native void g_hash_table_iter_replace(
        @Ptr
        long iter, Pointer value);

    public void replace(Pointer value) {
        this.g_hash_table_iter_replace(Pointer.pointerTo(this, GHashTableIter.class), value);
    }

    protected native void g_hash_table_iter_steal(
        @Ptr
        long iter);

    public void steal() {
        this.g_hash_table_iter_steal(Pointer.pointerTo(this, GHashTableIter.class));
    }

}
