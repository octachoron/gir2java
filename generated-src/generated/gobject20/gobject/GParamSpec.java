
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

    protected native void g_param_spec_unref(
        @Ptr
        long pspec);

    public void unref() {
        this.g_param_spec_unref(Pointer.pointerTo(this, GParamSpec.class).getPeer());
    }

    @Field(0)
    public long field_owner_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpec field_owner_type(long field_owner_type) {
        this.io.setLongField(this, 0, field_owner_type);
        return this;
    }

    @Ptr
    protected native long g_param_spec_get_blurb(
        @Ptr
        long pspec);

    public Pointer get_blurb() {
        return Pointer.pointerToAddress(this.g_param_spec_get_blurb(Pointer.pointerTo(this, GParamSpec.class).getPeer()));
    }

    @Ptr
    protected native long g_param_spec_steal_qdata(
        @Ptr
        long pspec, long quark);

    public Pointer steal_qdata(long quark) {
        return Pointer.pointerToAddress(this.g_param_spec_steal_qdata(Pointer.pointerTo(this, GParamSpec.class).getPeer(), quark));
    }

    @Ptr
    protected native long g_param_spec_ref(
        @Ptr
        long pspec);

    public Pointer<GParamSpec> ref() {
        return Pointer.pointerToAddress(this.g_param_spec_ref(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GParamSpec.class);
    }

    @Field(1)
    public IntValuedEnum<GParamFlags> field_flags() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GParamSpec field_flags(IntValuedEnum<GParamFlags> field_flags) {
        this.io.setEnumField(this, 1, field_flags);
        return this;
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
    protected native long g_param_spec_get_name(
        @Ptr
        long pspec);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_param_spec_get_name(Pointer.pointerTo(this, GParamSpec.class).getPeer()));
    }

    protected native void g_param_spec_set_qdata(
        @Ptr
        long pspec, long quark,
        @Ptr
        long data);

    public void set_qdata(long quark, Pointer data) {
        this.g_param_spec_set_qdata(Pointer.pointerTo(this, GParamSpec.class).getPeer(), quark, Pointer.getPeer(data));
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

    @Field(2)
    public Pointer field__nick() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpec field__nick(Pointer field__nick) {
        this.io.setPointerField(this, 2, field__nick);
        return this;
    }

    @Field(3)
    public long field_value_type() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GParamSpec field_value_type(long field_value_type) {
        this.io.setLongField(this, 3, field_value_type);
        return this;
    }

    @Field(4)
    public Pointer field_name() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GParamSpec field_name(Pointer field_name) {
        this.io.setPointerField(this, 4, field_name);
        return this;
    }

    @Ptr
    protected native long g_param_spec_get_redirect_target(
        @Ptr
        long pspec);

    public Pointer<GParamSpec> get_redirect_target() {
        return Pointer.pointerToAddress(this.g_param_spec_get_redirect_target(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GParamSpec.class);
    }

    @Field(5)
    public long field_param_id() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GParamSpec field_param_id(long field_param_id) {
        this.io.setLongField(this, 5, field_param_id);
        return this;
    }

    @Ptr
    protected native long g_param_spec_get_qdata(
        @Ptr
        long pspec, long quark);

    public Pointer get_qdata(long quark) {
        return Pointer.pointerToAddress(this.g_param_spec_get_qdata(Pointer.pointerTo(this, GParamSpec.class).getPeer(), quark));
    }

    @Field(6)
    public GTypeInstance field_g_type_instance() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GParamSpec field_g_type_instance(GTypeInstance field_g_type_instance) {
        this.io.setNativeObjectField(this, 6, field_g_type_instance);
        return this;
    }

    @Field(7)
    public Pointer<GData> field_qdata() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GParamSpec field_qdata(Pointer<GData> field_qdata) {
        this.io.setPointerField(this, 7, field_qdata);
        return this;
    }

    @Ptr
    protected native long g_param_spec_ref_sink(
        @Ptr
        long pspec);

    public Pointer<GParamSpec> ref_sink() {
        return Pointer.pointerToAddress(this.g_param_spec_ref_sink(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GParamSpec.class);
    }

    @Ptr
    protected native long g_param_spec_get_default_value(
        @Ptr
        long param);

    public Pointer<GValue> get_default_value() {
        return Pointer.pointerToAddress(this.g_param_spec_get_default_value(Pointer.pointerTo(this, GParamSpec.class).getPeer()), GValue.class);
    }

    @Field(8)
    public long field_ref_count() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public GParamSpec field_ref_count(long field_ref_count) {
        this.io.setLongField(this, 8, field_ref_count);
        return this;
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

    @Field(9)
    public Pointer field__blurb() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GParamSpec field__blurb(Pointer field__blurb) {
        this.io.setPointerField(this, 9, field__blurb);
        return this;
    }

}
