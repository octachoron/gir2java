
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstDebugCategory
    extends StructObject
{


    public GstDebugCategory() {
        super();
    }

    public GstDebugCategory(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_threshold() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstDebugCategory field_threshold(int field_threshold) {
        this.io.setNativeObjectField(this, 0, field_threshold);
        return this;
    }

    @Field(1)
    public long field_color() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstDebugCategory field_color(long field_color) {
        this.io.setNativeObjectField(this, 1, field_color);
        return this;
    }

    @Field(2)
    public Pointer field_name() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstDebugCategory field_name(Pointer field_name) {
        this.io.setPointerField(this, 2, field_name);
        return this;
    }

    @Field(3)
    public Pointer field_description() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstDebugCategory field_description(Pointer field_description) {
        this.io.setPointerField(this, 3, field_description);
        return this;
    }

    protected native void gst_debug_category_free(
        @Ptr
        long category);

    public void free() {
        this.gst_debug_category_free(Pointer.pointerTo(this, GstDebugCategory.class));
    }

    protected native long gst_debug_category_get_color(
        @Ptr
        long category);

    public long get_color() {
        return this.gst_debug_category_get_color(Pointer.pointerTo(this, GstDebugCategory.class));
    }

    @Ptr
    protected native long gst_debug_category_get_description(
        @Ptr
        long category);

    public Pointer get_description() {
        return Pointer.pointerToAddress(this.gst_debug_category_get_description(Pointer.pointerTo(this, GstDebugCategory.class)));
    }

    @Ptr
    protected native long gst_debug_category_get_name(
        @Ptr
        long category);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.gst_debug_category_get_name(Pointer.pointerTo(this, GstDebugCategory.class)));
    }

    protected native void gst_debug_category_reset_threshold(
        @Ptr
        long category);

    public void reset_threshold() {
        this.gst_debug_category_reset_threshold(Pointer.pointerTo(this, GstDebugCategory.class));
    }

    protected native IntValuedEnum<GstDebugLevel> gst_debug_category_get_threshold(
        @Ptr
        long category);

    public IntValuedEnum<GstDebugLevel> get_threshold() {
        return this.gst_debug_category_get_threshold(Pointer.pointerTo(this, GstDebugCategory.class));
    }

    protected native void gst_debug_category_set_threshold(
        @Ptr
        long category, IntValuedEnum<GstDebugLevel> level);

    public void set_threshold(IntValuedEnum<GstDebugLevel> level) {
        this.gst_debug_category_set_threshold(Pointer.pointerTo(this, GstDebugCategory.class), level);
    }

}
