
package generated.gstreamer10.gst;

import org.bridj.BridJ;
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


    static {
        BridJ.register();
    }

    public GstStaticPadTemplate() {
        super();
    }

    public GstStaticPadTemplate(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gststaticpadtemplate_field_name_template() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstStaticPadTemplate gststaticpadtemplate_field_name_template(Pointer gststaticpadtemplate_field_name_template) {
        this.io.setPointerField(this, 0, gststaticpadtemplate_field_name_template);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstPadDirection> gststaticpadtemplate_field_direction() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstStaticPadTemplate gststaticpadtemplate_field_direction(IntValuedEnum<GstPadDirection> gststaticpadtemplate_field_direction) {
        this.io.setEnumField(this, 1, gststaticpadtemplate_field_direction);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstPadPresence> gststaticpadtemplate_field_presence() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstStaticPadTemplate gststaticpadtemplate_field_presence(IntValuedEnum<GstPadPresence> gststaticpadtemplate_field_presence) {
        this.io.setEnumField(this, 2, gststaticpadtemplate_field_presence);
        return this;
    }

    @Field(3)
    public GstStaticCaps gststaticpadtemplate_field_static_caps() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstStaticPadTemplate gststaticpadtemplate_field_static_caps(GstStaticCaps gststaticpadtemplate_field_static_caps) {
        this.io.setNativeObjectField(this, 3, gststaticpadtemplate_field_static_caps);
        return this;
    }

    @Ptr
    protected native long gst_static_pad_template_get(
        @Ptr
        long pad_template);

    public Pointer<GstPadTemplate> get() {
        return Pointer.pointerToAddress(this.gst_static_pad_template_get(Pointer.pointerTo(this, GstStaticPadTemplate.class).getPeer()), GstPadTemplate.class);
    }

    @Ptr
    protected native long gst_static_pad_template_get_caps(
        @Ptr
        long templ);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_static_pad_template_get_caps(Pointer.pointerTo(this, GstStaticPadTemplate.class).getPeer()), GstCaps.class);
    }

}
