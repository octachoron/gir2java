
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstCapsFeatures
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstCapsFeatures() {
        super();
    }

    public GstCapsFeatures(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_caps_features_new(
        @Ptr
        long feature1, Object... varargs);

    public static Pointer _new(Pointer feature1, Object... varargs) {
        return Pointer.pointerToAddress(GstCapsFeatures.gst_caps_features_new(Pointer.getPeer(feature1), varargs));
    }

    @Ptr
    protected static native long gst_caps_features_new_any();

    public static Pointer new_any() {
        return Pointer.pointerToAddress(GstCapsFeatures.gst_caps_features_new_any());
    }

    @Ptr
    protected static native long gst_caps_features_new_empty();

    public static Pointer new_empty() {
        return Pointer.pointerToAddress(GstCapsFeatures.gst_caps_features_new_empty());
    }

    @Ptr
    protected static native long gst_caps_features_new_id(long feature1, Object... varargs);

    public static Pointer new_id(long feature1, Object... varargs) {
        return Pointer.pointerToAddress(GstCapsFeatures.gst_caps_features_new_id(feature1, varargs));
    }

    protected native void gst_caps_features_add(
        @Ptr
        long features,
        @Ptr
        long feature);

    public void add(Pointer feature) {
        this.gst_caps_features_add(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), Pointer.getPeer(feature));
    }

    protected native void gst_caps_features_add_id(
        @Ptr
        long features, long feature);

    public void add_id(long feature) {
        this.gst_caps_features_add_id(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), feature);
    }

    protected native boolean gst_caps_features_contains(
        @Ptr
        long features,
        @Ptr
        long feature);

    public boolean contains(Pointer feature) {
        return this.gst_caps_features_contains(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), Pointer.getPeer(feature));
    }

    protected native boolean gst_caps_features_contains_id(
        @Ptr
        long features, long feature);

    public boolean contains_id(long feature) {
        return this.gst_caps_features_contains_id(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), feature);
    }

    @Ptr
    protected native long gst_caps_features_copy(
        @Ptr
        long features);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_caps_features_copy(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer()));
    }

    protected native void gst_caps_features_free(
        @Ptr
        long features);

    public void free() {
        this.gst_caps_features_free(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer());
    }

    @Ptr
    protected native long gst_caps_features_get_nth(
        @Ptr
        long features, long i);

    public Pointer get_nth(long i) {
        return Pointer.pointerToAddress(this.gst_caps_features_get_nth(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), i));
    }

    protected native long gst_caps_features_get_nth_id(
        @Ptr
        long features, long i);

    public long get_nth_id(long i) {
        return this.gst_caps_features_get_nth_id(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), i);
    }

    protected native long gst_caps_features_get_size(
        @Ptr
        long features);

    public long get_size() {
        return this.gst_caps_features_get_size(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer());
    }

    protected native boolean gst_caps_features_is_any(
        @Ptr
        long features);

    public boolean is_any() {
        return this.gst_caps_features_is_any(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer());
    }

    protected native boolean gst_caps_features_is_equal(
        @Ptr
        long features1,
        @Ptr
        long features2);

    public boolean is_equal(Pointer features2) {
        return this.gst_caps_features_is_equal(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), Pointer.getPeer(features2));
    }

    protected native void gst_caps_features_remove(
        @Ptr
        long features,
        @Ptr
        long feature);

    public void remove(Pointer feature) {
        this.gst_caps_features_remove(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), Pointer.getPeer(feature));
    }

    protected native void gst_caps_features_remove_id(
        @Ptr
        long features, long feature);

    public void remove_id(long feature) {
        this.gst_caps_features_remove_id(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), feature);
    }

    protected native boolean gst_caps_features_set_parent_refcount(
        @Ptr
        long features,
        @Ptr
        long refcount);

    public boolean set_parent_refcount(Pointer<Integer> refcount) {
        return this.gst_caps_features_set_parent_refcount(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer(), Pointer.getPeer(refcount));
    }

    @Ptr
    protected native long gst_caps_features_to_string(
        @Ptr
        long features);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.gst_caps_features_to_string(Pointer.pointerTo(this, GstCapsFeatures.class).getPeer()));
    }

    @Ptr
    protected static native long gst_caps_features_from_string(
        @Ptr
        long features);

    public static Pointer from_string(Pointer features) {
        return Pointer.pointerToAddress(GstCapsFeatures.gst_caps_features_from_string(Pointer.getPeer(features)));
    }

}
