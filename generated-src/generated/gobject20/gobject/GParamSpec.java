
package generated.gobject20.gobject;

import generated.glib20.glib.GData;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GParamSpec
    extends StructObject
{


    public GParamSpec() {
        super();
    }

    public GParamSpec(Pointer pointer) {
        super(pointer);
    }

    protected native Pointer g_param_spec_internal(long param_type,
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, Object flags);

    public Pointer internal(long param_type, Pointer name, Pointer nick, Pointer blurb, Object flags) {
        return this.g_param_spec_internal(param_type, Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), flags);
    }

    @Ptr
    protected native long g_param_spec_get_blurb(
        @Ptr
        long pspec);

    public Pointer get_blurb() {
        return Pointer.pointerToAddress(this.g_param_spec_get_blurb(Pointer.pointerTo(this, GParamSpec.class)));
    }

    @Ptr
    protected native long g_param_spec_get_default_value(
        @Ptr
        long param);

    public Pointer get_default_value() {
        return Pointer.pointerToAddress(this.g_param_spec_get_default_value(Pointer.pointerTo(this, GParamSpec.class)));
    }

    @Ptr
    protected native long g_param_spec_get_name(
        @Ptr
        long pspec);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_param_spec_get_name(Pointer.pointerTo(this, GParamSpec.class)));
    }

    @Ptr
    protected native long g_param_spec_get_nick(
        @Ptr
        long pspec);

    public Pointer get_nick() {
        return Pointer.pointerToAddress(this.g_param_spec_get_nick(Pointer.pointerTo(this, GParamSpec.class)));
    }

    protected native Pointer g_param_spec_get_qdata(
        @Ptr
        long pspec, Object quark);

    public Pointer get_qdata(Object quark) {
        return this.g_param_spec_get_qdata(Pointer.pointerTo(this, GParamSpec.class), quark);
    }

    @Ptr
    protected native long g_param_spec_get_redirect_target(
        @Ptr
        long pspec);

    public Pointer get_redirect_target() {
        return Pointer.pointerToAddress(this.g_param_spec_get_redirect_target(Pointer.pointerTo(this, GParamSpec.class)));
    }

    @Ptr
    protected native long g_param_spec_ref(
        @Ptr
        long pspec);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_param_spec_ref(Pointer.pointerTo(this, GParamSpec.class)));
    }

    @Ptr
    protected native long g_param_spec_ref_sink(
        @Ptr
        long pspec);

    public Pointer ref_sink() {
        return Pointer.pointerToAddress(this.g_param_spec_ref_sink(Pointer.pointerTo(this, GParamSpec.class)));
    }

    protected native void g_param_spec_set_qdata(
        @Ptr
        long pspec, Object quark, Pointer data);

    public void set_qdata(Object quark, Pointer data) {
        this.g_param_spec_set_qdata(Pointer.pointerTo(this, GParamSpec.class), quark, data);
    }

    protected native void g_param_spec_set_qdata_full(
        @Ptr
        long pspec, Object quark, Pointer data, Object destroy);

    public void set_qdata_full(Object quark, Pointer data, Object destroy) {
        this.g_param_spec_set_qdata_full(Pointer.pointerTo(this, GParamSpec.class), quark, data, destroy);
    }

    protected native void g_param_spec_sink(
        @Ptr
        long pspec);

    public void sink() {
        this.g_param_spec_sink(Pointer.pointerTo(this, GParamSpec.class));
    }

    protected native Pointer g_param_spec_steal_qdata(
        @Ptr
        long pspec, Object quark);

    public Pointer steal_qdata(Object quark) {
        return this.g_param_spec_steal_qdata(Pointer.pointerTo(this, GParamSpec.class), quark);
    }

    protected native void g_param_spec_unref(
        @Ptr
        long pspec);

    public void unref() {
        this.g_param_spec_unref(Pointer.pointerTo(this, GParamSpec.class));
    }

    @Field(0)
    public long field_value_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpec field_value_type(long field_value_type) {
        this.io.setNativeObjectField(this, 0, field_value_type);
        return this;
    }

    @Field(1)
    public long field_param_id() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpec field_param_id(long field_param_id) {
        this.io.setNativeObjectField(this, 1, field_param_id);
        return this;
    }

    @Field(2)
    public long field_owner_type() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpec field_owner_type(long field_owner_type) {
        this.io.setNativeObjectField(this, 2, field_owner_type);
        return this;
    }

    @Field(3)
    public Pointer<GData> field_qdata() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GParamSpec field_qdata(Pointer<GData> field_qdata) {
        this.io.setPointerField(this, 3, field_qdata);
        return this;
    }

    @Field(4)
    public GTypeInstance field_g_type_instance() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GParamSpec field_g_type_instance(GTypeInstance field_g_type_instance) {
        this.io.setNativeObjectField(this, 4, field_g_type_instance);
        return this;
    }

    @Field(5)
    public Pointer field__nick() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GParamSpec field__nick(Pointer field__nick) {
        this.io.setPointerField(this, 5, field__nick);
        return this;
    }

    @Field(6)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GParamSpec field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 6, field_flags);
        return this;
    }

    @Field(7)
    public long field_ref_count() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GParamSpec field_ref_count(long field_ref_count) {
        this.io.setNativeObjectField(this, 7, field_ref_count);
        return this;
    }

    @Field(8)
    public Pointer field_name() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GParamSpec field_name(Pointer field_name) {
        this.io.setPointerField(this, 8, field_name);
        return this;
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
