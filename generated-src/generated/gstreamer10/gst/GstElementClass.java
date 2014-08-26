
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstElementClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstElementClass() {
        super();
    }

    public GstElementClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstElementFactory> gstelementclass_field_elementfactory() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstElementClass gstelementclass_field_elementfactory(Pointer<GstElementFactory> gstelementclass_field_elementfactory) {
        this.io.setPointerField(this, 0, gstelementclass_field_elementfactory);
        return this;
    }

    @Ptr
    protected native long gst_element_class_get_metadata(
        @Ptr
        long klass,
        @Ptr
        long key);

    public Pointer get_metadata(Pointer key) {
        return Pointer.pointerToAddress(this.gst_element_class_get_metadata(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(key)));
    }

    @Field(1)
    public long gstelementclass_field_pad_templ_cookie() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstElementClass gstelementclass_field_pad_templ_cookie(long gstelementclass_field_pad_templ_cookie) {
        this.io.setLongField(this, 1, gstelementclass_field_pad_templ_cookie);
        return this;
    }

    @Field(2)
    public GstObjectClass gstelementclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstElementClass gstelementclass_field_parent_class(GstObjectClass gstelementclass_field_parent_class) {
        this.io.setNativeObjectField(this, 2, gstelementclass_field_parent_class);
        return this;
    }

    protected native void gst_element_class_add_metadata(
        @Ptr
        long klass,
        @Ptr
        long key,
        @Ptr
        long value);

    public void add_metadata(Pointer key, Pointer value) {
        this.gst_element_class_add_metadata(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    @Field(3)
    public int gstelementclass_field_numpadtemplates() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GstElementClass gstelementclass_field_numpadtemplates(int gstelementclass_field_numpadtemplates) {
        this.io.setIntField(this, 3, gstelementclass_field_numpadtemplates);
        return this;
    }

    @Field(4)
    public Pointer<GList> gstelementclass_field_padtemplates() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstElementClass gstelementclass_field_padtemplates(Pointer<GList> gstelementclass_field_padtemplates) {
        this.io.setPointerField(this, 4, gstelementclass_field_padtemplates);
        return this;
    }

    protected native void gst_element_class_set_metadata(
        @Ptr
        long klass,
        @Ptr
        long longname,
        @Ptr
        long classification,
        @Ptr
        long description,
        @Ptr
        long author);

    public void set_metadata(Pointer longname, Pointer classification, Pointer description, Pointer author) {
        this.gst_element_class_set_metadata(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(longname), Pointer.getPeer(classification), Pointer.getPeer(description), Pointer.getPeer(author));
    }

    protected native void gst_element_class_add_static_metadata(
        @Ptr
        long klass,
        @Ptr
        long key,
        @Ptr
        long value);

    public void add_static_metadata(Pointer key, Pointer value) {
        this.gst_element_class_add_static_metadata(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(value));
    }

    protected native void gst_element_class_add_pad_template(
        @Ptr
        long klass,
        @Ptr
        long templ);

    public void add_pad_template(Pointer<GstPadTemplate> templ) {
        this.gst_element_class_add_pad_template(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(templ));
    }

    @Ptr
    protected native long gst_element_class_get_pad_template(
        @Ptr
        long element_class,
        @Ptr
        long name);

    public Pointer<GstPadTemplate> get_pad_template(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_class_get_pad_template(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(name)), GstPadTemplate.class);
    }

    @Field(5)
    private Pointer gstelementclass_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstElementClass gstelementclass_field__gst_reserved(Pointer gstelementclass_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstelementclass_field__gst_reserved);
        return this;
    }

    protected native void gst_element_class_set_static_metadata(
        @Ptr
        long klass,
        @Ptr
        long longname,
        @Ptr
        long classification,
        @Ptr
        long description,
        @Ptr
        long author);

    public void set_static_metadata(Pointer longname, Pointer classification, Pointer description, Pointer author) {
        this.gst_element_class_set_static_metadata(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(longname), Pointer.getPeer(classification), Pointer.getPeer(description), Pointer.getPeer(author));
    }

    @Field(6)
    public Pointer gstelementclass_field_metadata() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstElementClass gstelementclass_field_metadata(Pointer gstelementclass_field_metadata) {
        this.io.setPointerField(this, 6, gstelementclass_field_metadata);
        return this;
    }

    @Ptr
    protected native long gst_element_class_get_pad_template_list(
        @Ptr
        long element_class);

    public Pointer<GList> get_pad_template_list() {
        return Pointer.pointerToAddress(this.gst_element_class_get_pad_template_list(Pointer.pointerTo(this, GstElementClass.class).getPeer()), GList.class);
    }

}
