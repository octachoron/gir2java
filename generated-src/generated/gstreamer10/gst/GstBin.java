
package generated.gstreamer10.gst;

import generated.glib20.glib.GList;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBin
    extends GstElement
{


    static {
        BridJ.register();
    }

    public GstBin() {
        super();
    }

    public GstBin(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_bin_new(
        @Ptr
        long name);

    public static Pointer _new(Pointer name) {
        return Pointer.pointerToAddress(GstBin.gst_bin_new(Pointer.getPeer(name)));
    }

    protected native boolean gst_bin_add(
        @Ptr
        long bin,
        @Ptr
        long element);

    public boolean add(Pointer element) {
        return this.gst_bin_add(Pointer.pointerTo(this, GstBin.class).getPeer(), Pointer.getPeer(element));
    }

    protected native void gst_bin_add_many(
        @Ptr
        long bin,
        @Ptr
        long element_1, Object... varargs);

    public void add_many(Pointer element_1, Object... varargs) {
        this.gst_bin_add_many(Pointer.pointerTo(this, GstBin.class).getPeer(), Pointer.getPeer(element_1), varargs);
    }

    @Ptr
    protected native long gst_bin_get_by_interface(
        @Ptr
        long bin, long iface);

    public Pointer get_by_interface(long iface) {
        return Pointer.pointerToAddress(this.gst_bin_get_by_interface(Pointer.pointerTo(this, GstBin.class).getPeer(), iface));
    }

    @Ptr
    protected native long gst_bin_get_by_name(
        @Ptr
        long bin,
        @Ptr
        long name);

    public Pointer get_by_name(Pointer name) {
        return Pointer.pointerToAddress(this.gst_bin_get_by_name(Pointer.pointerTo(this, GstBin.class).getPeer(), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long gst_bin_get_by_name_recurse_up(
        @Ptr
        long bin,
        @Ptr
        long name);

    public Pointer get_by_name_recurse_up(Pointer name) {
        return Pointer.pointerToAddress(this.gst_bin_get_by_name_recurse_up(Pointer.pointerTo(this, GstBin.class).getPeer(), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long gst_bin_iterate_all_by_interface(
        @Ptr
        long bin, long iface);

    public Pointer iterate_all_by_interface(long iface) {
        return Pointer.pointerToAddress(this.gst_bin_iterate_all_by_interface(Pointer.pointerTo(this, GstBin.class).getPeer(), iface));
    }

    @Ptr
    protected native long gst_bin_iterate_elements(
        @Ptr
        long bin);

    public Pointer iterate_elements() {
        return Pointer.pointerToAddress(this.gst_bin_iterate_elements(Pointer.pointerTo(this, GstBin.class).getPeer()));
    }

    @Ptr
    protected native long gst_bin_iterate_recurse(
        @Ptr
        long bin);

    public Pointer iterate_recurse() {
        return Pointer.pointerToAddress(this.gst_bin_iterate_recurse(Pointer.pointerTo(this, GstBin.class).getPeer()));
    }

    @Ptr
    protected native long gst_bin_iterate_sinks(
        @Ptr
        long bin);

    public Pointer iterate_sinks() {
        return Pointer.pointerToAddress(this.gst_bin_iterate_sinks(Pointer.pointerTo(this, GstBin.class).getPeer()));
    }

    @Ptr
    protected native long gst_bin_iterate_sorted(
        @Ptr
        long bin);

    public Pointer iterate_sorted() {
        return Pointer.pointerToAddress(this.gst_bin_iterate_sorted(Pointer.pointerTo(this, GstBin.class).getPeer()));
    }

    @Ptr
    protected native long gst_bin_iterate_sources(
        @Ptr
        long bin);

    public Pointer iterate_sources() {
        return Pointer.pointerToAddress(this.gst_bin_iterate_sources(Pointer.pointerTo(this, GstBin.class).getPeer()));
    }

    protected native boolean gst_bin_recalculate_latency(
        @Ptr
        long bin);

    public boolean recalculate_latency() {
        return this.gst_bin_recalculate_latency(Pointer.pointerTo(this, GstBin.class).getPeer());
    }

    protected native boolean gst_bin_remove(
        @Ptr
        long bin,
        @Ptr
        long element);

    public boolean remove(Pointer element) {
        return this.gst_bin_remove(Pointer.pointerTo(this, GstBin.class).getPeer(), Pointer.getPeer(element));
    }

    protected native void gst_bin_remove_many(
        @Ptr
        long bin,
        @Ptr
        long element_1, Object... varargs);

    public void remove_many(Pointer element_1, Object... varargs) {
        this.gst_bin_remove_many(Pointer.pointerTo(this, GstBin.class).getPeer(), Pointer.getPeer(element_1), varargs);
    }

    @Field(0)
    public Pointer<GstElement> gstbin_field_clock_provider() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstBin gstbin_field_clock_provider(Pointer<GstElement> gstbin_field_clock_provider) {
        this.io.setPointerField(this, 0, gstbin_field_clock_provider);
        return this;
    }

    @Field(1)
    public Pointer<GstBus> gstbin_field_child_bus() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBin gstbin_field_child_bus(Pointer<GstBus> gstbin_field_child_bus) {
        this.io.setPointerField(this, 1, gstbin_field_child_bus);
        return this;
    }

    @Field(2)
    public int gstbin_field_numchildren() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstBin gstbin_field_numchildren(int gstbin_field_numchildren) {
        this.io.setIntField(this, 2, gstbin_field_numchildren);
        return this;
    }

    @Field(3)
    private Pointer gstbin_field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstBin gstbin_field__gst_reserved(Pointer gstbin_field__gst_reserved) {
        this.io.setPointerField(this, 3, gstbin_field__gst_reserved);
        return this;
    }

    @Field(4)
    public boolean gstbin_field_clock_dirty() {
        return this.io.getBooleanField(this, 4);
    }

    @Field(4)
    public GstBin gstbin_field_clock_dirty(boolean gstbin_field_clock_dirty) {
        this.io.setBooleanField(this, 4, gstbin_field_clock_dirty);
        return this;
    }

    @Field(5)
    public GstElement gstbin_field_element() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstBin gstbin_field_element(GstElement gstbin_field_element) {
        this.io.setNativeObjectField(this, 5, gstbin_field_element);
        return this;
    }

    @Field(6)
    public long gstbin_field_children_cookie() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GstBin gstbin_field_children_cookie(long gstbin_field_children_cookie) {
        this.io.setLongField(this, 6, gstbin_field_children_cookie);
        return this;
    }

    @Ptr
    protected native long gst_bin_find_unlinked_pad(
        @Ptr
        long bin, IntValuedEnum<GstPadDirection> direction);

    public Pointer<GstPad> find_unlinked_pad(IntValuedEnum<GstPadDirection> direction) {
        return Pointer.pointerToAddress(this.gst_bin_find_unlinked_pad(Pointer.pointerTo(this, GstBin.class).getPeer(), direction), GstPad.class);
    }

    @Field(7)
    public boolean gstbin_field_state_dirty() {
        return this.io.getBooleanField(this, 7);
    }

    @Field(7)
    public GstBin gstbin_field_state_dirty(boolean gstbin_field_state_dirty) {
        this.io.setBooleanField(this, 7, gstbin_field_state_dirty);
        return this;
    }

    @Field(8)
    public boolean gstbin_field_polling() {
        return this.io.getBooleanField(this, 8);
    }

    @Field(8)
    public GstBin gstbin_field_polling(boolean gstbin_field_polling) {
        this.io.setBooleanField(this, 8, gstbin_field_polling);
        return this;
    }

    @Field(9)
    public Pointer<GList> gstbin_field_messages() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GstBin gstbin_field_messages(Pointer<GList> gstbin_field_messages) {
        this.io.setPointerField(this, 9, gstbin_field_messages);
        return this;
    }

    @Field(10)
    public Pointer<GstClock> gstbin_field_provided_clock() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstBin gstbin_field_provided_clock(Pointer<GstClock> gstbin_field_provided_clock) {
        this.io.setPointerField(this, 10, gstbin_field_provided_clock);
        return this;
    }

    @Field(11)
    private Pointer<GstBinPrivate> gstbin_field_priv() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    private GstBin gstbin_field_priv(Pointer<GstBinPrivate> gstbin_field_priv) {
        this.io.setPointerField(this, 11, gstbin_field_priv);
        return this;
    }

    @Field(12)
    public Pointer<GList> gstbin_field_children() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public GstBin gstbin_field_children(Pointer<GList> gstbin_field_children) {
        this.io.setPointerField(this, 12, gstbin_field_children);
        return this;
    }

}
