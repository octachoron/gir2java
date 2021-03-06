
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstMiniObject
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstMiniObject() {
        super();
    }

    public GstMiniObject(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gstminiobject_field_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstMiniObject gstminiobject_field_type(long gstminiobject_field_type) {
        this.io.setLongField(this, 0, gstminiobject_field_type);
        return this;
    }

    @Field(1)
    public int gstminiobject_field_refcount() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GstMiniObject gstminiobject_field_refcount(int gstminiobject_field_refcount) {
        this.io.setIntField(this, 1, gstminiobject_field_refcount);
        return this;
    }

    @Field(2)
    public int gstminiobject_field_lockstate() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstMiniObject gstminiobject_field_lockstate(int gstminiobject_field_lockstate) {
        this.io.setIntField(this, 2, gstminiobject_field_lockstate);
        return this;
    }

    @Field(3)
    public long gstminiobject_field_flags() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstMiniObject gstminiobject_field_flags(long gstminiobject_field_flags) {
        this.io.setLongField(this, 3, gstminiobject_field_flags);
        return this;
    }

    @Ptr
    protected native long gst_mini_object_make_writable(
        @Ptr
        long mini_object);

    public Pointer<GstMiniObject> make_writable() {
        return Pointer.pointerToAddress(this.gst_mini_object_make_writable(Pointer.pointerTo(this, GstMiniObject.class).getPeer()), GstMiniObject.class);
    }

    protected native void gst_mini_object_weak_unref(
        @Ptr
        long object,
        @Ptr
        long notify,
        @Ptr
        long data);

    public void weak_unref(Pointer notify, Pointer data) {
        this.gst_mini_object_weak_unref(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), Pointer.getPeer(notify), Pointer.getPeer(data));
    }

    @Field(4)
    public Pointer gstminiobject_field_free() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstMiniObject gstminiobject_field_free(Pointer gstminiobject_field_free) {
        this.io.setPointerField(this, 4, gstminiobject_field_free);
        return this;
    }

    protected native void gst_mini_object_set_qdata(
        @Ptr
        long object, long quark,
        @Ptr
        long data,
        @Ptr
        long destroy);

    public void set_qdata(long quark, Pointer data, Pointer destroy) {
        this.gst_mini_object_set_qdata(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), quark, Pointer.getPeer(data), Pointer.getPeer(destroy));
    }

    @Ptr
    protected native long gst_mini_object_steal_qdata(
        @Ptr
        long object, long quark);

    public Pointer steal_qdata(long quark) {
        return Pointer.pointerToAddress(this.gst_mini_object_steal_qdata(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), quark));
    }

    @Ptr
    protected native long gst_mini_object_get_qdata(
        @Ptr
        long object, long quark);

    public Pointer get_qdata(long quark) {
        return Pointer.pointerToAddress(this.gst_mini_object_get_qdata(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), quark));
    }

    @Field(5)
    private Pointer gstminiobject_field_qdata() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstMiniObject gstminiobject_field_qdata(Pointer gstminiobject_field_qdata) {
        this.io.setPointerField(this, 5, gstminiobject_field_qdata);
        return this;
    }

    protected static native boolean gst_mini_object_take(
        @Ptr
        long olddata,
        @Ptr
        long newdata);

    public static boolean take(Pointer<Pointer<GstMiniObject>> olddata, Pointer<GstMiniObject> newdata) {
        return GstMiniObject.gst_mini_object_take(Pointer.getPeer(olddata), Pointer.getPeer(newdata));
    }

    protected native void gst_mini_object_weak_ref(
        @Ptr
        long object,
        @Ptr
        long notify,
        @Ptr
        long data);

    public void weak_ref(Pointer notify, Pointer data) {
        this.gst_mini_object_weak_ref(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), Pointer.getPeer(notify), Pointer.getPeer(data));
    }

    @Field(6)
    private long gstminiobject_field_n_qdata() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    private GstMiniObject gstminiobject_field_n_qdata(long gstminiobject_field_n_qdata) {
        this.io.setLongField(this, 6, gstminiobject_field_n_qdata);
        return this;
    }

    protected static native boolean gst_mini_object_replace(
        @Ptr
        long olddata,
        @Ptr
        long newdata);

    public static boolean replace(Pointer<Pointer<GstMiniObject>> olddata, Pointer<GstMiniObject> newdata) {
        return GstMiniObject.gst_mini_object_replace(Pointer.getPeer(olddata), Pointer.getPeer(newdata));
    }

    protected native void gst_mini_object_unlock(
        @Ptr
        long object, IntValuedEnum<GstLockFlags> flags);

    public void unlock(IntValuedEnum<GstLockFlags> flags) {
        this.gst_mini_object_unlock(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), flags);
    }

    protected native boolean gst_mini_object_lock(
        @Ptr
        long object, IntValuedEnum<GstLockFlags> flags);

    public boolean lock(IntValuedEnum<GstLockFlags> flags) {
        return this.gst_mini_object_lock(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), flags);
    }

    @Ptr
    protected native long gst_mini_object_ref(
        @Ptr
        long mini_object);

    public Pointer<GstMiniObject> ref() {
        return Pointer.pointerToAddress(this.gst_mini_object_ref(Pointer.pointerTo(this, GstMiniObject.class).getPeer()), GstMiniObject.class);
    }

    protected native void gst_mini_object_unref(
        @Ptr
        long mini_object);

    public void unref() {
        this.gst_mini_object_unref(Pointer.pointerTo(this, GstMiniObject.class).getPeer());
    }

    protected native void gst_mini_object_init(
        @Ptr
        long mini_object, long flags, long type,
        @Ptr
        long copy_func,
        @Ptr
        long dispose_func,
        @Ptr
        long free_func);

    public void init(long flags, long type, Pointer copy_func, Pointer dispose_func, Pointer free_func) {
        this.gst_mini_object_init(Pointer.pointerTo(this, GstMiniObject.class).getPeer(), flags, type, Pointer.getPeer(copy_func), Pointer.getPeer(dispose_func), Pointer.getPeer(free_func));
    }

    protected native boolean gst_mini_object_is_writable(
        @Ptr
        long mini_object);

    public boolean is_writable() {
        return this.gst_mini_object_is_writable(Pointer.pointerTo(this, GstMiniObject.class).getPeer());
    }

    @Field(7)
    public Pointer gstminiobject_field_dispose() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstMiniObject gstminiobject_field_dispose(Pointer gstminiobject_field_dispose) {
        this.io.setPointerField(this, 7, gstminiobject_field_dispose);
        return this;
    }

    @Ptr
    protected static native long gst_mini_object_steal(
        @Ptr
        long olddata);

    public static Pointer<GstMiniObject> steal(Pointer<Pointer<GstMiniObject>> olddata) {
        return Pointer.pointerToAddress(GstMiniObject.gst_mini_object_steal(Pointer.getPeer(olddata)), GstMiniObject.class);
    }

    @Field(8)
    public Pointer gstminiobject_field_copy() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstMiniObject gstminiobject_field_copy(Pointer gstminiobject_field_copy) {
        this.io.setPointerField(this, 8, gstminiobject_field_copy);
        return this;
    }

    @Ptr
    protected native long gst_mini_object_copy(
        @Ptr
        long mini_object);

    public Pointer<GstMiniObject> copy() {
        return Pointer.pointerToAddress(this.gst_mini_object_copy(Pointer.pointerTo(this, GstMiniObject.class).getPeer()), GstMiniObject.class);
    }

}
