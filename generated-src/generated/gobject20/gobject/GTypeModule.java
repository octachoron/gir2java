
package generated.gobject20.gobject;

import generated.glib20.glib.GSList;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeModule
    extends GObject
{


    public GTypeModule() {
        super();
    }

    public GTypeModule(Pointer pointer) {
        super(pointer);
    }

    protected native void g_type_module_add_interface(
        @Ptr
        long module, long instance_type, long interface_type,
        @Ptr
        long interface_info);

    public void add_interface(long instance_type, long interface_type, Pointer<GInterfaceInfo> interface_info) {
        this.g_type_module_add_interface(Pointer.pointerTo(this, GTypeModule.class), instance_type, interface_type, Pointer.getPeer(interface_info));
    }

    protected native long g_type_module_register_enum(
        @Ptr
        long module,
        @Ptr
        long name,
        @Ptr
        long const_static_values);

    public long register_enum(Pointer name, Pointer<GEnumValue> const_static_values) {
        return this.g_type_module_register_enum(Pointer.pointerTo(this, GTypeModule.class), Pointer.getPeer(name), Pointer.getPeer(const_static_values));
    }

    protected native long g_type_module_register_flags(
        @Ptr
        long module,
        @Ptr
        long name,
        @Ptr
        long const_static_values);

    public long register_flags(Pointer name, Pointer<GFlagsValue> const_static_values) {
        return this.g_type_module_register_flags(Pointer.pointerTo(this, GTypeModule.class), Pointer.getPeer(name), Pointer.getPeer(const_static_values));
    }

    protected native long g_type_module_register_type(
        @Ptr
        long module, long parent_type,
        @Ptr
        long type_name,
        @Ptr
        long type_info, Object flags);

    public long register_type(long parent_type, Pointer type_name, Pointer<GTypeInfo> type_info, Object flags) {
        return this.g_type_module_register_type(Pointer.pointerTo(this, GTypeModule.class), parent_type, Pointer.getPeer(type_name), Pointer.getPeer(type_info), flags);
    }

    protected native void g_type_module_set_name(
        @Ptr
        long module,
        @Ptr
        long name);

    public void set_name(Pointer name) {
        this.g_type_module_set_name(Pointer.pointerTo(this, GTypeModule.class), Pointer.getPeer(name));
    }

    protected native void g_type_module_unuse(
        @Ptr
        long module);

    public void unuse() {
        this.g_type_module_unuse(Pointer.pointerTo(this, GTypeModule.class));
    }

    protected native boolean g_type_module_use(
        @Ptr
        long module);

    public boolean use() {
        return this.g_type_module_use(Pointer.pointerTo(this, GTypeModule.class));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTypeModule field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public long field_use_count() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GTypeModule field_use_count(long field_use_count) {
        this.io.setNativeObjectField(this, 1, field_use_count);
        return this;
    }

    @Field(2)
    public Pointer<GSList> field_type_infos() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GTypeModule field_type_infos(Pointer<GSList> field_type_infos) {
        this.io.setPointerField(this, 2, field_type_infos);
        return this;
    }

    @Field(3)
    public Pointer<GSList> field_interface_infos() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GTypeModule field_interface_infos(Pointer<GSList> field_interface_infos) {
        this.io.setPointerField(this, 3, field_interface_infos);
        return this;
    }

    @Field(4)
    public Pointer field_name() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GTypeModule field_name(Pointer field_name) {
        this.io.setPointerField(this, 4, field_name);
        return this;
    }

}
