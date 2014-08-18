
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPadTemplate
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstPadTemplate() {
        super();
    }

    public GstPadTemplate(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_pad_template_new(
        @Ptr
        long name_template, IntValuedEnum<GstPadDirection> direction, IntValuedEnum<GstPadPresence> presence,
        @Ptr
        long caps);

    public static Pointer gstpadtemplate__new(Pointer name_template, IntValuedEnum<GstPadDirection> direction, IntValuedEnum<GstPadPresence> presence, Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(GstPadTemplate.gst_pad_template_new(Pointer.getPeer(name_template), direction, presence, Pointer.getPeer(caps)));
    }

    @Ptr
    protected native long gst_pad_template_get_caps(
        @Ptr
        long templ);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_pad_template_get_caps(Pointer.pointerTo(this, GstPadTemplate.class).getPeer()), GstCaps.class);
    }

    protected native void gst_pad_template_pad_created(
        @Ptr
        long templ,
        @Ptr
        long pad);

    public void pad_created(Pointer<GstPad> pad) {
        this.gst_pad_template_pad_created(Pointer.pointerTo(this, GstPadTemplate.class).getPeer(), Pointer.getPeer(pad));
    }

    @Field(0)
    public GstObject gstpadtemplate_field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPadTemplate gstpadtemplate_field_object(GstObject gstpadtemplate_field_object) {
        this.io.setNativeObjectField(this, 0, gstpadtemplate_field_object);
        return this;
    }

    @Field(1)
    public Pointer field_name_template() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstPadTemplate field_name_template(Pointer field_name_template) {
        this.io.setPointerField(this, 1, field_name_template);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstPadDirection> field_direction() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstPadTemplate field_direction(IntValuedEnum<GstPadDirection> field_direction) {
        this.io.setEnumField(this, 2, field_direction);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GstPadPresence> field_presence() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstPadTemplate field_presence(IntValuedEnum<GstPadPresence> field_presence) {
        this.io.setEnumField(this, 3, field_presence);
        return this;
    }

    @Field(4)
    public Pointer<GstCaps> field_caps() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstPadTemplate field_caps(Pointer<GstCaps> field_caps) {
        this.io.setPointerField(this, 4, field_caps);
        return this;
    }

    @Field(5)
    private Pointer gstpadtemplate_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstPadTemplate gstpadtemplate_field__gst_reserved(Pointer gstpadtemplate_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstpadtemplate_field__gst_reserved);
        return this;
    }

}
