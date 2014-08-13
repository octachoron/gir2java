
package generated.gobject20.gobject;

import generated.glib20.glib.GSList;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GObjectClass
    extends StructObject
{


    public GObjectClass() {
        super();
    }

    public GObjectClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GSList> field_construct_properties() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GObjectClass field_construct_properties(Pointer<GSList> field_construct_properties) {
        this.io.setPointerField(this, 0, field_construct_properties);
        return this;
    }

    @Ptr
    protected native long g_object_class_list_properties(
        @Ptr
        long oclass,
        @Ptr
        long n_properties);

    public Pointer<GParamSpec> list_properties(Pointer<Long> n_properties) {
        return Pointer.pointerToAddress(this.g_object_class_list_properties(Pointer.pointerTo(this, GObjectClass.class), Pointer.getPeer(n_properties)), Pointer.class);
    }

    protected native void g_object_class_install_property(
        @Ptr
        long oclass, long property_id,
        @Ptr
        long pspec);

    public void install_property(long property_id, Pointer<GParamSpec> pspec) {
        this.g_object_class_install_property(Pointer.pointerTo(this, GObjectClass.class), property_id, Pointer.getPeer(pspec));
    }

    protected native void g_object_class_install_properties(
        @Ptr
        long oclass, long n_pspecs,
        @Ptr
        long pspecs);

    public void install_properties(long n_pspecs, Pointer<GParamSpec> pspecs) {
        this.g_object_class_install_properties(Pointer.pointerTo(this, GObjectClass.class), n_pspecs, Pointer.getPeer(pspecs));
    }

    @Ptr
    protected native long g_object_class_find_property(
        @Ptr
        long oclass,
        @Ptr
        long property_name);

    public Pointer<GParamSpec> find_property(Pointer property_name) {
        return Pointer.pointerToAddress(this.g_object_class_find_property(Pointer.pointerTo(this, GObjectClass.class), Pointer.getPeer(property_name)), Pointer.class);
    }

    @Field(1)
    public long field_flags() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GObjectClass field_flags(long field_flags) {
        this.io.setNativeObjectField(this, 1, field_flags);
        return this;
    }

    @Field(2)
    public GTypeClass field_g_type_class() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GObjectClass field_g_type_class(GTypeClass field_g_type_class) {
        this.io.setNativeObjectField(this, 2, field_g_type_class);
        return this;
    }

    protected native void g_object_class_override_property(
        @Ptr
        long oclass, long property_id,
        @Ptr
        long name);

    public void override_property(long property_id, Pointer name) {
        this.g_object_class_override_property(Pointer.pointerTo(this, GObjectClass.class), property_id, Pointer.getPeer(name));
    }

    @Field(3)
    public Pointer field_pdummy() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GObjectClass field_pdummy(Pointer field_pdummy) {
        this.io.setPointerField(this, 3, field_pdummy);
        return this;
    }

}
