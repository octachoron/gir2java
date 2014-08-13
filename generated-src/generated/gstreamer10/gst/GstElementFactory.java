
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstElementFactory
    extends StructObject
{


    public GstElementFactory() {
        super();
    }

    public GstElementFactory(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_element_factory_find(
        @Ptr
        long name);

    public Pointer find(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_factory_find(Pointer.getPeer(name)));
    }

    @Ptr
    protected native long gst_element_factory_make(
        @Ptr
        long factoryname,
        @Ptr
        long name);

    public Pointer<GstElement> make(Pointer factoryname, Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_factory_make(Pointer.getPeer(factoryname), Pointer.getPeer(name)), Pointer.class);
    }

    protected native boolean gst_element_factory_can_sink_all_caps(
        @Ptr
        long factory,
        @Ptr
        long caps);

    public boolean can_sink_all_caps(Pointer<GstCaps> caps) {
        return this.gst_element_factory_can_sink_all_caps(Pointer.pointerTo(this, GstElementFactory.class), Pointer.getPeer(caps));
    }

    protected native boolean gst_element_factory_can_sink_any_caps(
        @Ptr
        long factory,
        @Ptr
        long caps);

    public boolean can_sink_any_caps(Pointer<GstCaps> caps) {
        return this.gst_element_factory_can_sink_any_caps(Pointer.pointerTo(this, GstElementFactory.class), Pointer.getPeer(caps));
    }

    protected native boolean gst_element_factory_can_src_all_caps(
        @Ptr
        long factory,
        @Ptr
        long caps);

    public boolean can_src_all_caps(Pointer<GstCaps> caps) {
        return this.gst_element_factory_can_src_all_caps(Pointer.pointerTo(this, GstElementFactory.class), Pointer.getPeer(caps));
    }

    protected native boolean gst_element_factory_can_src_any_caps(
        @Ptr
        long factory,
        @Ptr
        long caps);

    public boolean can_src_any_caps(Pointer<GstCaps> caps) {
        return this.gst_element_factory_can_src_any_caps(Pointer.pointerTo(this, GstElementFactory.class), Pointer.getPeer(caps));
    }

    @Ptr
    protected native long gst_element_factory_create(
        @Ptr
        long factory,
        @Ptr
        long name);

    public Pointer<GstElement> create(Pointer name) {
        return Pointer.pointerToAddress(this.gst_element_factory_create(Pointer.pointerTo(this, GstElementFactory.class), Pointer.getPeer(name)), Pointer.class);
    }

    protected native long gst_element_factory_get_element_type(
        @Ptr
        long factory);

    public long get_element_type() {
        return this.gst_element_factory_get_element_type(Pointer.pointerTo(this, GstElementFactory.class));
    }

    @Ptr
    protected native long gst_element_factory_get_metadata(
        @Ptr
        long factory,
        @Ptr
        long key);

    public Pointer get_metadata(Pointer key) {
        return Pointer.pointerToAddress(this.gst_element_factory_get_metadata(Pointer.pointerTo(this, GstElementFactory.class), Pointer.getPeer(key)));
    }

    @Ptr
    protected native long gst_element_factory_get_metadata_keys(
        @Ptr
        long factory);

    public Pointer get_metadata_keys() {
        return Pointer.pointerToAddress(this.gst_element_factory_get_metadata_keys(Pointer.pointerTo(this, GstElementFactory.class)));
    }

    protected native long gst_element_factory_get_num_pad_templates(
        @Ptr
        long factory);

    public long get_num_pad_templates() {
        return this.gst_element_factory_get_num_pad_templates(Pointer.pointerTo(this, GstElementFactory.class));
    }

    @Ptr
    protected native long gst_element_factory_get_static_pad_templates(
        @Ptr
        long factory);

    public Pointer<GList> get_static_pad_templates() {
        return Pointer.pointerToAddress(this.gst_element_factory_get_static_pad_templates(Pointer.pointerTo(this, GstElementFactory.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_element_factory_get_uri_protocols(
        @Ptr
        long factory);

    public Pointer get_uri_protocols() {
        return Pointer.pointerToAddress(this.gst_element_factory_get_uri_protocols(Pointer.pointerTo(this, GstElementFactory.class)));
    }

    protected native boolean gst_element_factory_has_interface(
        @Ptr
        long factory,
        @Ptr
        long interfacename);

    public boolean has_interface(Pointer interfacename) {
        return this.gst_element_factory_has_interface(Pointer.pointerTo(this, GstElementFactory.class), Pointer.getPeer(interfacename));
    }

    protected native boolean gst_element_factory_list_is_type(
        @Ptr
        long factory, Object type);

    public boolean list_is_type(Object type) {
        return this.gst_element_factory_list_is_type(Pointer.pointerTo(this, GstElementFactory.class), type);
    }

    @Ptr
    protected native long gst_element_factory_list_filter(
        @Ptr
        long list,
        @Ptr
        long caps, IntValuedEnum<GstPadDirection> direction, boolean subsetonly);

    public Pointer<GList> list_filter(Pointer<GList> list, Pointer<GstCaps> caps, IntValuedEnum<GstPadDirection> direction, boolean subsetonly) {
        return Pointer.pointerToAddress(this.gst_element_factory_list_filter(Pointer.getPeer(list), Pointer.getPeer(caps), direction, subsetonly), Pointer.class);
    }

    protected native IntValuedEnum<GstURIType> gst_element_factory_get_uri_type(
        @Ptr
        long factory);

    public IntValuedEnum<GstURIType> get_uri_type() {
        return this.gst_element_factory_get_uri_type(Pointer.pointerTo(this, GstElementFactory.class));
    }

    @Ptr
    protected native long gst_element_factory_list_get_elements(Object type, IntValuedEnum<GstRank> minrank);

    public Pointer<GList> list_get_elements(Object type, IntValuedEnum<GstRank> minrank) {
        return Pointer.pointerToAddress(this.gst_element_factory_list_get_elements(type, minrank), Pointer.class);
    }

}
