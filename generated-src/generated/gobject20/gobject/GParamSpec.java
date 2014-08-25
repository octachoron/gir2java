
package generated.gobject20.gobject;

import generated.glib20.glib.GData;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GParamSpec
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GParamSpec() {
        super();
    }

    public GParamSpec(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_param_spec_ref_sink(
        @Ptr
        long pspec);

    public Pointer<GParamSpec> ref_sink() {
        return Pointer.pointerToAddress(this.g_param_spec_ref_sink(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GParamSpec.class);
    }

    @Ptr
    protected native long g_param_spec_get_name(
        @Ptr
        long pspec);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_param_spec_get_name(Pointer.pointerTo(this, GParamSpec.class).getPeer()));
    }

    @Field(0)
    private long gparamspec_field_ref_count() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GParamSpec gparamspec_field_ref_count(long gparamspec_field_ref_count) {
        this.io.setLongField(this, 0, gparamspec_field_ref_count);
        return this;
    }

    @Field(1)
    private Pointer<GData> gparamspec_field_qdata() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GParamSpec gparamspec_field_qdata(Pointer<GData> gparamspec_field_qdata) {
        this.io.setPointerField(this, 1, gparamspec_field_qdata);
        return this;
    }

    @Field(2)
    public long gparamspec_field_owner_type() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GParamSpec gparamspec_field_owner_type(long gparamspec_field_owner_type) {
        this.io.setLongField(this, 2, gparamspec_field_owner_type);
        return this;
    }

    protected native void g_param_spec_set_qdata(
        @Ptr
        long pspec, long quark,
        @Ptr
        long data);

    public void set_qdata(long quark, Pointer data) {
        this.g_param_spec_set_qdata(Pointer.pointerTo(this, GParamSpec.class).getPeer(), quark, Pointer.getPeer(data));
    }

    @Ptr
    protected native long g_param_spec_get_qdata(
        @Ptr
        long pspec, long quark);

    public Pointer get_qdata(long quark) {
        return Pointer.pointerToAddress(this.g_param_spec_get_qdata(Pointer.pointerTo(this, GParamSpec.class).getPeer(), quark));
    }

    @Field(3)
    public long gparamspec_field_value_type() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GParamSpec gparamspec_field_value_type(long gparamspec_field_value_type) {
        this.io.setLongField(this, 3, gparamspec_field_value_type);
        return this;
    }

    @Field(4)
    public IntValuedEnum<GParamFlags> gparamspec_field_flags() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public GParamSpec gparamspec_field_flags(IntValuedEnum<GParamFlags> gparamspec_field_flags) {
        this.io.setEnumField(this, 4, gparamspec_field_flags);
        return this;
    }

    @Field(5)
    private long gparamspec_field_param_id() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    private GParamSpec gparamspec_field_param_id(long gparamspec_field_param_id) {
        this.io.setLongField(this, 5, gparamspec_field_param_id);
        return this;
    }

    @Field(6)
    private Pointer gparamspec_field__blurb() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GParamSpec gparamspec_field__blurb(Pointer gparamspec_field__blurb) {
        this.io.setPointerField(this, 6, gparamspec_field__blurb);
        return this;
    }

    @Field(7)
    public GTypeInstance gparamspec_field_g_type_instance() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GParamSpec gparamspec_field_g_type_instance(GTypeInstance gparamspec_field_g_type_instance) {
        this.io.setNativeObjectField(this, 7, gparamspec_field_g_type_instance);
        return this;
    }

    @Ptr
    protected native long g_param_spec_get_blurb(
        @Ptr
        long pspec);

    public Pointer get_blurb() {
        return Pointer.pointerToAddress(this.g_param_spec_get_blurb(Pointer.pointerTo(this, GParamSpec.class).getPeer()));
    }

    protected native void g_param_spec_unref(
        @Ptr
        long pspec);

    public void unref() {
        this.g_param_spec_unref(Pointer.pointerTo(this, GParamSpec.class).getPeer());
    }

    @Ptr
    protected static native long g_param_spec_internal(long param_type,
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, IntValuedEnum<GParamFlags> flags);

    public static Pointer internal(long param_type, Pointer name, Pointer nick, Pointer blurb, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GParamSpec.g_param_spec_internal(param_type, Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), flags));
    }

    @Ptr
    protected native long g_param_spec_get_nick(
        @Ptr
        long pspec);

    public Pointer get_nick() {
        return Pointer.pointerToAddress(this.g_param_spec_get_nick(Pointer.pointerTo(this, GParamSpec.class).getPeer()));
    }

    protected native void g_param_spec_sink(
        @Ptr
        long pspec);

    public void sink() {
        this.g_param_spec_sink(Pointer.pointerTo(this, GParamSpec.class).getPeer());
    }

    @Ptr
    protected native long g_param_spec_get_redirect_target(
        @Ptr
        long pspec);

    public Pointer<GParamSpec> get_redirect_target() {
        return Pointer.pointerToAddress(this.g_param_spec_get_redirect_target(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GParamSpec.class);
    }

    @Field(8)
    private Pointer gparamspec_field__nick() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    private GParamSpec gparamspec_field__nick(Pointer gparamspec_field__nick) {
        this.io.setPointerField(this, 8, gparamspec_field__nick);
        return this;
    }

    @Field(9)
    public Pointer gparamspec_field_name() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GParamSpec gparamspec_field_name(Pointer gparamspec_field_name) {
        this.io.setPointerField(this, 9, gparamspec_field_name);
        return this;
    }

    @Ptr
    protected native long g_param_spec_steal_qdata(
        @Ptr
        long pspec, long quark);

    public Pointer steal_qdata(long quark) {
        return Pointer.pointerToAddress(this.g_param_spec_steal_qdata(Pointer.pointerTo(this, GParamSpec.class).getPeer(), quark));
    }

    @Ptr
    protected native long g_param_spec_get_default_value(
        @Ptr
        long param);

    public Pointer<GValue> get_default_value() {
        return Pointer.pointerToAddress(this.g_param_spec_get_default_value(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GValue.class);
    }

    protected native void g_param_spec_set_qdata_full(
        @Ptr
        long pspec, long quark,
        @Ptr
        long data,
        @Ptr
        long destroy);

    public void set_qdata_full(long quark, Pointer data, Pointer destroy) {
        this.g_param_spec_set_qdata_full(Pointer.pointerTo(this, GParamSpec.class).getPeer(), quark, Pointer.getPeer(data), Pointer.getPeer(destroy));
    }

    @Ptr
    protected native long g_param_spec_ref(
        @Ptr
        long pspec);

    public Pointer<GParamSpec> ref() {
        return Pointer.pointerToAddress(this.g_param_spec_ref(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GParamSpec.class);
    }

}
