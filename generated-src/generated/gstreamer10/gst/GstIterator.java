
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GValue;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstIterator
    extends StructObject
{


    public GstIterator() {
        super();
    }

    public GstIterator(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_iterator_find_custom(
        @Ptr
        long it, Object func,
        @Ptr
        long elem, Pointer user_data);

    public boolean find_custom(Object func, Pointer<GValue> elem, Pointer user_data) {
        return this.gst_iterator_find_custom(Pointer.pointerTo(this, GstIterator.class), func, Pointer.getPeer(elem), user_data);
    }

    @Field(0)
    public Object field_copy() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstIterator field_copy(Object field_copy) {
        this.io.setNativeObjectField(this, 0, field_copy);
        return this;
    }

    protected native IntValuedEnum<GstIteratorResult> gst_iterator_next(
        @Ptr
        long it,
        @Ptr
        long elem);

    public IntValuedEnum<GstIteratorResult> next(Pointer<GValue> elem) {
        return this.gst_iterator_next(Pointer.pointerTo(this, GstIterator.class), Pointer.getPeer(elem));
    }

    @Field(1)
    public Object field_resync() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstIterator field_resync(Object field_resync) {
        this.io.setNativeObjectField(this, 1, field_resync);
        return this;
    }

    @Ptr
    protected native long gst_iterator_filter(
        @Ptr
        long it, Object func,
        @Ptr
        long user_data);

    public Pointer<GstIterator> filter(Object func, Pointer<GValue> user_data) {
        return Pointer.pointerToAddress(this.gst_iterator_filter(Pointer.pointerTo(this, GstIterator.class), func, Pointer.getPeer(user_data)), Pointer.class);
    }

    @Field(2)
    public Pointer<Long> field_master_cookie() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstIterator field_master_cookie(Pointer<Long> field_master_cookie) {
        this.io.setPointerField(this, 2, field_master_cookie);
        return this;
    }

    @Field(3)
    public Object field_item() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstIterator field_item(Object field_item) {
        this.io.setNativeObjectField(this, 3, field_item);
        return this;
    }

    @Field(4)
    public Pointer<GstIterator> field_pushed() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstIterator field_pushed(Pointer<GstIterator> field_pushed) {
        this.io.setPointerField(this, 4, field_pushed);
        return this;
    }

    protected native void gst_iterator_resync(
        @Ptr
        long it);

    public void resync() {
        this.gst_iterator_resync(Pointer.pointerTo(this, GstIterator.class));
    }

    @Field(5)
    public long field_size() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstIterator field_size(long field_size) {
        this.io.setNativeObjectField(this, 5, field_size);
        return this;
    }

    @Field(6)
    public long field_type() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstIterator field_type(long field_type) {
        this.io.setNativeObjectField(this, 6, field_type);
        return this;
    }

    @Field(7)
    public long field_cookie() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstIterator field_cookie(long field_cookie) {
        this.io.setNativeObjectField(this, 7, field_cookie);
        return this;
    }

    @Field(8)
    public Pointer<Object> field_lock() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstIterator field_lock(Pointer<Object> field_lock) {
        this.io.setPointerField(this, 8, field_lock);
        return this;
    }

    @Field(9)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstIterator field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 9, field__gst_reserved);
        return this;
    }

    @Ptr
    protected native long gst_iterator_copy(
        @Ptr
        long it);

    public Pointer<GstIterator> copy() {
        return Pointer.pointerToAddress(this.gst_iterator_copy(Pointer.pointerTo(this, GstIterator.class)), Pointer.class);
    }

    protected native IntValuedEnum<GstIteratorResult> gst_iterator_foreach(
        @Ptr
        long it, Object func, Pointer user_data);

    public IntValuedEnum<GstIteratorResult> foreach(Object func, Pointer user_data) {
        return this.gst_iterator_foreach(Pointer.pointerTo(this, GstIterator.class), func, user_data);
    }

    protected native IntValuedEnum<GstIteratorResult> gst_iterator_fold(
        @Ptr
        long it, Object func,
        @Ptr
        long ret, Pointer user_data);

    public IntValuedEnum<GstIteratorResult> fold(Object func, Pointer<GValue> ret, Pointer user_data) {
        return this.gst_iterator_fold(Pointer.pointerTo(this, GstIterator.class), func, Pointer.getPeer(ret), user_data);
    }

    protected native void gst_iterator_free(
        @Ptr
        long it);

    public void free() {
        this.gst_iterator_free(Pointer.pointerTo(this, GstIterator.class));
    }

    @Field(10)
    public Object field_next() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstIterator field_next(Object field_next) {
        this.io.setNativeObjectField(this, 10, field_next);
        return this;
    }

    protected native void gst_iterator_push(
        @Ptr
        long it,
        @Ptr
        long other);

    public void push(Pointer<GstIterator> other) {
        this.gst_iterator_push(Pointer.pointerTo(this, GstIterator.class), Pointer.getPeer(other));
    }

    @Field(11)
    public Object field_free() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstIterator field_free(Object field_free) {
        this.io.setNativeObjectField(this, 11, field_free);
        return this;
    }

}
