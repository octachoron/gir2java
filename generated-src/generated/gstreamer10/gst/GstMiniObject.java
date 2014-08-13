
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstMiniObject
    extends StructObject
{


    public GstMiniObject() {
        super();
    }

    public GstMiniObject(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstMiniObject field_type(long field_type) {
        this.io.setNativeObjectField(this, 0, field_type);
        return this;
    }

    @Field(1)
    public int field_refcount() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstMiniObject field_refcount(int field_refcount) {
        this.io.setNativeObjectField(this, 1, field_refcount);
        return this;
    }

    @Field(2)
    public int field_lockstate() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstMiniObject field_lockstate(int field_lockstate) {
        this.io.setNativeObjectField(this, 2, field_lockstate);
        return this;
    }

    @Field(3)
    public long field_flags() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstMiniObject field_flags(long field_flags) {
        this.io.setNativeObjectField(this, 3, field_flags);
        return this;
    }

    @Ptr
    protected native long gst_mini_object_copy(
        @Ptr
        long mini_object);

    public Pointer<GstMiniObject> copy() {
        return Pointer.pointerToAddress(this.gst_mini_object_copy(Pointer.pointerTo(this, GstMiniObject.class)), Pointer.class);
    }

    @Field(4)
    public Object field_free() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstMiniObject field_free(Object field_free) {
        this.io.setNativeObjectField(this, 4, field_free);
        return this;
    }

    protected native boolean gst_mini_object_replace(
        @Ptr
        long olddata,
        @Ptr
        long newdata);

    public boolean replace(Pointer<Pointer<GstMiniObject>> olddata, Pointer<GstMiniObject> newdata) {
        return this.gst_mini_object_replace(Pointer.getPeer(olddata), Pointer.getPeer(newdata));
    }

    protected native void gst_mini_object_unlock(
        @Ptr
        long object, Object flags);

    public void unlock(Object flags) {
        this.gst_mini_object_unlock(Pointer.pointerTo(this, GstMiniObject.class), flags);
    }

    @Field(5)
    public Object field_dispose() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstMiniObject field_dispose(Object field_dispose) {
        this.io.setNativeObjectField(this, 5, field_dispose);
        return this;
    }

    @Field(6)
    public Object field_copy() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstMiniObject field_copy(Object field_copy) {
        this.io.setNativeObjectField(this, 6, field_copy);
        return this;
    }

    @Ptr
    protected native long gst_mini_object_ref(
        @Ptr
        long mini_object);

    public Pointer<GstMiniObject> ref() {
        return Pointer.pointerToAddress(this.gst_mini_object_ref(Pointer.pointerTo(this, GstMiniObject.class)), Pointer.class);
    }

    protected native void gst_mini_object_unref(
        @Ptr
        long mini_object);

    public void unref() {
        this.gst_mini_object_unref(Pointer.pointerTo(this, GstMiniObject.class));
    }

    protected native boolean gst_mini_object_is_writable(
        @Ptr
        long mini_object);

    public boolean is_writable() {
        return this.gst_mini_object_is_writable(Pointer.pointerTo(this, GstMiniObject.class));
    }

    protected native Pointer gst_mini_object_get_qdata(
        @Ptr
        long object, Object quark);

    public Pointer get_qdata(Object quark) {
        return this.gst_mini_object_get_qdata(Pointer.pointerTo(this, GstMiniObject.class), quark);
    }

    protected native Pointer gst_mini_object_steal_qdata(
        @Ptr
        long object, Object quark);

    public Pointer steal_qdata(Object quark) {
        return this.gst_mini_object_steal_qdata(Pointer.pointerTo(this, GstMiniObject.class), quark);
    }

    protected native boolean gst_mini_object_take(
        @Ptr
        long olddata,
        @Ptr
        long newdata);

    public boolean take(Pointer<Pointer<GstMiniObject>> olddata, Pointer<GstMiniObject> newdata) {
        return this.gst_mini_object_take(Pointer.getPeer(olddata), Pointer.getPeer(newdata));
    }

    protected native void gst_mini_object_init(
        @Ptr
        long mini_object, long flags, long type, Object copy_func, Object dispose_func, Object free_func);

    public void init(long flags, long type, Object copy_func, Object dispose_func, Object free_func) {
        this.gst_mini_object_init(Pointer.pointerTo(this, GstMiniObject.class), flags, type, copy_func, dispose_func, free_func);
    }

    @Ptr
    protected native long gst_mini_object_steal(
        @Ptr
        long olddata);

    public Pointer<GstMiniObject> steal(Pointer<Pointer<GstMiniObject>> olddata) {
        return Pointer.pointerToAddress(this.gst_mini_object_steal(Pointer.getPeer(olddata)), Pointer.class);
    }

    @Field(7)
    public Pointer field_qdata() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstMiniObject field_qdata(Pointer field_qdata) {
        this.io.setNativeObjectField(this, 7, field_qdata);
        return this;
    }

    @Field(8)
    public long field_n_qdata() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstMiniObject field_n_qdata(long field_n_qdata) {
        this.io.setNativeObjectField(this, 8, field_n_qdata);
        return this;
    }

    @Ptr
    protected native long gst_mini_object_make_writable(
        @Ptr
        long mini_object);

    public Pointer<GstMiniObject> make_writable() {
        return Pointer.pointerToAddress(this.gst_mini_object_make_writable(Pointer.pointerTo(this, GstMiniObject.class)), Pointer.class);
    }

    protected native boolean gst_mini_object_lock(
        @Ptr
        long object, Object flags);

    public boolean lock(Object flags) {
        return this.gst_mini_object_lock(Pointer.pointerTo(this, GstMiniObject.class), flags);
    }

    protected native void gst_mini_object_weak_ref(
        @Ptr
        long object, Object notify, Pointer data);

    public void weak_ref(Object notify, Pointer data) {
        this.gst_mini_object_weak_ref(Pointer.pointerTo(this, GstMiniObject.class), notify, data);
    }

    protected native void gst_mini_object_weak_unref(
        @Ptr
        long object, Object notify, Pointer data);

    public void weak_unref(Object notify, Pointer data) {
        this.gst_mini_object_weak_unref(Pointer.pointerTo(this, GstMiniObject.class), notify, data);
    }

    protected native void gst_mini_object_set_qdata(
        @Ptr
        long object, Object quark, Pointer data, Object destroy);

    public void set_qdata(Object quark, Pointer data, Object destroy) {
        this.gst_mini_object_set_qdata(Pointer.pointerTo(this, GstMiniObject.class), quark, data, destroy);
    }

}
