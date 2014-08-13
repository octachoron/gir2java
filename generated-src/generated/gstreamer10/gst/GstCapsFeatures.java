
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstCapsFeatures
    extends StructObject
{


    public GstCapsFeatures() {
        super();
    }

    public GstCapsFeatures(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_caps_features_add(
        @Ptr
        long features,
        @Ptr
        long feature);

    public void add(Pointer feature) {
        this.gst_caps_features_add(Pointer.pointerTo(this, GstCapsFeatures.class), Pointer.getPeer(feature));
    }

    protected native void gst_caps_features_add_id(
        @Ptr
        long features, Object feature);

    public void add_id(Object feature) {
        this.gst_caps_features_add_id(Pointer.pointerTo(this, GstCapsFeatures.class), feature);
    }

    protected native boolean gst_caps_features_contains(
        @Ptr
        long features,
        @Ptr
        long feature);

    public boolean contains(Pointer feature) {
        return this.gst_caps_features_contains(Pointer.pointerTo(this, GstCapsFeatures.class), Pointer.getPeer(feature));
    }

    protected native boolean gst_caps_features_contains_id(
        @Ptr
        long features, Object feature);

    public boolean contains_id(Object feature) {
        return this.gst_caps_features_contains_id(Pointer.pointerTo(this, GstCapsFeatures.class), feature);
    }

    @Ptr
    protected native long gst_caps_features_copy(
        @Ptr
        long features);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_caps_features_copy(Pointer.pointerTo(this, GstCapsFeatures.class)));
    }

    protected native void gst_caps_features_free(
        @Ptr
        long features);

    public void free() {
        this.gst_caps_features_free(Pointer.pointerTo(this, GstCapsFeatures.class));
    }

    @Ptr
    protected native long gst_caps_features_get_nth(
        @Ptr
        long features, long i);

    public Pointer get_nth(long i) {
        return Pointer.pointerToAddress(this.gst_caps_features_get_nth(Pointer.pointerTo(this, GstCapsFeatures.class), i));
    }

    protected native Object gst_caps_features_get_nth_id(
        @Ptr
        long features, long i);

    public Object get_nth_id(long i) {
        return this.gst_caps_features_get_nth_id(Pointer.pointerTo(this, GstCapsFeatures.class), i);
    }

    protected native long gst_caps_features_get_size(
        @Ptr
        long features);

    public long get_size() {
        return this.gst_caps_features_get_size(Pointer.pointerTo(this, GstCapsFeatures.class));
    }

    protected native boolean gst_caps_features_is_any(
        @Ptr
        long features);

    public boolean is_any() {
        return this.gst_caps_features_is_any(Pointer.pointerTo(this, GstCapsFeatures.class));
    }

    protected native boolean gst_caps_features_is_equal(
        @Ptr
        long features1,
        @Ptr
        long features2);

    public boolean is_equal(Pointer features2) {
        return this.gst_caps_features_is_equal(Pointer.pointerTo(this, GstCapsFeatures.class), Pointer.getPeer(features2));
    }

    protected native void gst_caps_features_remove(
        @Ptr
        long features,
        @Ptr
        long feature);

    public void remove(Pointer feature) {
        this.gst_caps_features_remove(Pointer.pointerTo(this, GstCapsFeatures.class), Pointer.getPeer(feature));
    }

    protected native void gst_caps_features_remove_id(
        @Ptr
        long features, Object feature);

    public void remove_id(Object feature) {
        this.gst_caps_features_remove_id(Pointer.pointerTo(this, GstCapsFeatures.class), feature);
    }

    protected native boolean gst_caps_features_set_parent_refcount(
        @Ptr
        long features,
        @Ptr
        long refcount);

    public boolean set_parent_refcount(Pointer<Integer> refcount) {
        return this.gst_caps_features_set_parent_refcount(Pointer.pointerTo(this, GstCapsFeatures.class), Pointer.getPeer(refcount));
    }

    @Ptr
    protected native long gst_caps_features_to_string(
        @Ptr
        long features);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.gst_caps_features_to_string(Pointer.pointerTo(this, GstCapsFeatures.class)));
    }

    @Ptr
    protected native long gst_caps_features_from_string(
        @Ptr
        long features);

    public Pointer from_string(Pointer features) {
        return Pointer.pointerToAddress(this.gst_caps_features_from_string(Pointer.getPeer(features)));
    }

}
