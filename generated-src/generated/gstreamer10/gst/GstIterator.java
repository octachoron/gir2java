
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import generated.glib20.glib.GMutex;
import generated.gobject20.gobject.GObject;
import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
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


    static {
        BridJ.register();
    }

    public GstIterator() {
        super();
    }

    public GstIterator(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer gstiterator_field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GstIterator gstiterator_field__gst_reserved(Pointer gstiterator_field__gst_reserved) {
        this.io.setPointerField(this, 0, gstiterator_field__gst_reserved);
        return this;
    }

    @Ptr
    protected static native long gst_iterator_new_single(long type,
        @Ptr
        long object);

    public static Pointer<GstIterator> new_single(long type, Pointer<GValue> object) {
        return Pointer.pointerToAddress(GstIterator.gst_iterator_new_single(type, Pointer.getPeer(object)), GstIterator.class);
    }

    protected native void gst_iterator_free(
        @Ptr
        long it);

    public void free() {
        this.gst_iterator_free(Pointer.pointerTo(this, GstIterator.class).getPeer());
    }

    @Field(1)
    public Pointer gstiterator_field_copy() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstIterator gstiterator_field_copy(Pointer gstiterator_field_copy) {
        this.io.setPointerField(this, 1, gstiterator_field_copy);
        return this;
    }

    @Field(2)
    public long gstiterator_field_cookie() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstIterator gstiterator_field_cookie(long gstiterator_field_cookie) {
        this.io.setLongField(this, 2, gstiterator_field_cookie);
        return this;
    }

    @Field(3)
    public Pointer<GMutex> gstiterator_field_lock() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstIterator gstiterator_field_lock(Pointer<GMutex> gstiterator_field_lock) {
        this.io.setPointerField(this, 3, gstiterator_field_lock);
        return this;
    }

    @Ptr
    protected static native long gst_iterator_new_list(long type,
        @Ptr
        long lock,
        @Ptr
        long master_cookie,
        @Ptr
        long list,
        @Ptr
        long owner,
        @Ptr
        long item);

    public static Pointer<GstIterator> new_list(long type, Pointer<GMutex> lock, Pointer<Long> master_cookie, Pointer<Pointer<GList>> list, Pointer<GObject> owner, Pointer item) {
        return Pointer.pointerToAddress(GstIterator.gst_iterator_new_list(type, Pointer.getPeer(lock), Pointer.getPeer(master_cookie), Pointer.getPeer(list), Pointer.getPeer(owner), Pointer.getPeer(item)), GstIterator.class);
    }

    @Field(4)
    public Pointer gstiterator_field_next() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstIterator gstiterator_field_next(Pointer gstiterator_field_next) {
        this.io.setPointerField(this, 4, gstiterator_field_next);
        return this;
    }

    protected native IntValuedEnum<GstIteratorResult> gst_iterator_next(
        @Ptr
        long it,
        @Ptr
        long elem);

    public IntValuedEnum<GstIteratorResult> next(Pointer<GValue> elem) {
        return this.gst_iterator_next(Pointer.pointerTo(this, GstIterator.class).getPeer(), Pointer.getPeer(elem));
    }

    protected native boolean gst_iterator_find_custom(
        @Ptr
        long it,
        @Ptr
        long func,
        @Ptr
        long elem,
        @Ptr
        long user_data);

    public boolean find_custom(Pointer func, Pointer<GValue> elem, Pointer user_data) {
        return this.gst_iterator_find_custom(Pointer.pointerTo(this, GstIterator.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(elem), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long gst_iterator_new(long size, long type,
        @Ptr
        long lock,
        @Ptr
        long master_cookie,
        @Ptr
        long copy,
        @Ptr
        long next,
        @Ptr
        long item,
        @Ptr
        long resync,
        @Ptr
        long free);

    public static Pointer<GstIterator> _new(long size, long type, Pointer<GMutex> lock, Pointer<Long> master_cookie, Pointer copy, Pointer next, Pointer item, Pointer resync, Pointer free) {
        return Pointer.pointerToAddress(GstIterator.gst_iterator_new(size, type, Pointer.getPeer(lock), Pointer.getPeer(master_cookie), Pointer.getPeer(copy), Pointer.getPeer(next), Pointer.getPeer(item), Pointer.getPeer(resync), Pointer.getPeer(free)), GstIterator.class);
    }

    @Field(5)
    public long gstiterator_field_type() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstIterator gstiterator_field_type(long gstiterator_field_type) {
        this.io.setLongField(this, 5, gstiterator_field_type);
        return this;
    }

    protected native void gst_iterator_resync(
        @Ptr
        long it);

    public void resync() {
        this.gst_iterator_resync(Pointer.pointerTo(this, GstIterator.class).getPeer());
    }

    @Ptr
    protected native long gst_iterator_filter(
        @Ptr
        long it,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public Pointer<GstIterator> filter(Pointer func, Pointer<GValue> user_data) {
        return Pointer.pointerToAddress(this.gst_iterator_filter(Pointer.pointerTo(this, GstIterator.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data)), GstIterator.class);
    }

    @Ptr
    protected native long gst_iterator_copy(
        @Ptr
        long it);

    public Pointer<GstIterator> copy() {
        return Pointer.pointerToAddress(this.gst_iterator_copy(Pointer.pointerTo(this, GstIterator.class).getPeer()), GstIterator.class);
    }

    @Field(6)
    public Pointer gstiterator_field_item() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstIterator gstiterator_field_item(Pointer gstiterator_field_item) {
        this.io.setPointerField(this, 6, gstiterator_field_item);
        return this;
    }

    @Field(7)
    public Pointer<Long> gstiterator_field_master_cookie() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstIterator gstiterator_field_master_cookie(Pointer<Long> gstiterator_field_master_cookie) {
        this.io.setPointerField(this, 7, gstiterator_field_master_cookie);
        return this;
    }

    @Field(8)
    public Pointer gstiterator_field_free() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstIterator gstiterator_field_free(Pointer gstiterator_field_free) {
        this.io.setPointerField(this, 8, gstiterator_field_free);
        return this;
    }

    @Field(9)
    public Pointer<GstIterator> gstiterator_field_pushed() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstIterator gstiterator_field_pushed(Pointer<GstIterator> gstiterator_field_pushed) {
        this.io.setPointerField(this, 9, gstiterator_field_pushed);
        return this;
    }

    @Field(10)
    public Pointer gstiterator_field_resync() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstIterator gstiterator_field_resync(Pointer gstiterator_field_resync) {
        this.io.setPointerField(this, 10, gstiterator_field_resync);
        return this;
    }

    protected native void gst_iterator_push(
        @Ptr
        long it,
        @Ptr
        long other);

    public void push(Pointer<GstIterator> other) {
        this.gst_iterator_push(Pointer.pointerTo(this, GstIterator.class).getPeer(), Pointer.getPeer(other));
    }

    @Field(11)
    public long gstiterator_field_size() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GstIterator gstiterator_field_size(long gstiterator_field_size) {
        this.io.setLongField(this, 11, gstiterator_field_size);
        return this;
    }

    protected native IntValuedEnum<GstIteratorResult> gst_iterator_foreach(
        @Ptr
        long it,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public IntValuedEnum<GstIteratorResult> foreach(Pointer func, Pointer user_data) {
        return this.gst_iterator_foreach(Pointer.pointerTo(this, GstIterator.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native IntValuedEnum<GstIteratorResult> gst_iterator_fold(
        @Ptr
        long it,
        @Ptr
        long func,
        @Ptr
        long ret,
        @Ptr
        long user_data);

    public IntValuedEnum<GstIteratorResult> fold(Pointer func, Pointer<GValue> ret, Pointer user_data) {
        return this.gst_iterator_fold(Pointer.pointerTo(this, GstIterator.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(ret), Pointer.getPeer(user_data));
    }

}
