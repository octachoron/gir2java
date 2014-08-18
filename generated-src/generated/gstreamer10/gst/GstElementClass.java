
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

    protected native void gst_element_class_add_pad_template(
        @Ptr
        long klass,
        @Ptr
        long templ);

    public void add_pad_template(Pointer<GstPadTemplate> templ) {
        this.gst_element_class_add_pad_template(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(templ));
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

    @Field(0)
    public Pointer<GstElementFactory> field_elementfactory() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstElementClass field_elementfactory(Pointer<GstElementFactory> field_elementfactory) {
        this.io.setPointerField(this, 0, field_elementfactory);
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
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstElementClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
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

    @Ptr
    protected native long gst_element_class_get_pad_template(
        @Ptr
        long element_class,
        @Ptr
        long name);

    public Pointer<GstPadTemplate> get_pad_template(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_class_get_pad_template(Pointer.pointerTo(this, GstElementClass.class).getPeer(), Pointer.getPeer(name)), GstPadTemplate.class);
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

    @Field(2)
    public long field_pad_templ_cookie() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstElementClass field_pad_templ_cookie(long field_pad_templ_cookie) {
        this.io.setLongField(this, 2, field_pad_templ_cookie);
        return this;
    }

    @Field(3)
    public Pointer field_metadata() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstElementClass field_metadata(Pointer field_metadata) {
        this.io.setPointerField(this, 3, field_metadata);
        return this;
    }

    @Field(4)
    public GstObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstElementClass field_parent_class(GstObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 4, field_parent_class);
        return this;
    }

    @Field(5)
    public Pointer<GList> field_padtemplates() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstElementClass field_padtemplates(Pointer<GList> field_padtemplates) {
        this.io.setPointerField(this, 5, field_padtemplates);
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

    @Ptr
    protected native long gst_element_class_get_pad_template_list(
        @Ptr
        long element_class);

    public Pointer<GList> get_pad_template_list() {
        return Pointer.pointerToAddress(this.gst_element_class_get_pad_template_list(Pointer.pointerTo(this, GstElementClass.class).getPeer()), GList.class);
    }

    @Field(6)
    public int field_numpadtemplates() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public GstElementClass field_numpadtemplates(int field_numpadtemplates) {
        this.io.setIntField(this, 6, field_numpadtemplates);
        return this;
    }

}
