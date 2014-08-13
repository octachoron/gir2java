
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstStaticPadTemplate
    extends StructObject
{


    public GstStaticPadTemplate() {
        super();
    }

    public GstStaticPadTemplate(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_name_template() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstStaticPadTemplate field_name_template(Pointer field_name_template) {
        this.io.setPointerField(this, 0, field_name_template);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstPadDirection> field_direction() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstStaticPadTemplate field_direction(IntValuedEnum<GstPadDirection> field_direction) {
        this.io.setEnumField(this, 1, field_direction);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstPadPresence> field_presence() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstStaticPadTemplate field_presence(IntValuedEnum<GstPadPresence> field_presence) {
        this.io.setEnumField(this, 2, field_presence);
        return this;
    }

    @Field(3)
    public GstStaticCaps field_static_caps() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstStaticPadTemplate field_static_caps(GstStaticCaps field_static_caps) {
        this.io.setNativeObjectField(this, 3, field_static_caps);
        return this;
    }

    @Ptr
    protected native long gst_static_pad_template_get(
        @Ptr
        long pad_template);

    public Pointer<GstPadTemplate> get() {
        return Pointer.pointerToAddress(this.gst_static_pad_template_get(Pointer.pointerTo(this, GstStaticPadTemplate.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_static_pad_template_get_caps(
        @Ptr
        long templ);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_static_pad_template_get_caps(Pointer.pointerTo(this, GstStaticPadTemplate.class)), Pointer.class);
    }

}
