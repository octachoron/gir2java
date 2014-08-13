
package generated.gio20.gio;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileAttributeInfoList
    extends StructObject
{


    public GFileAttributeInfoList() {
        super();
    }

    public GFileAttributeInfoList(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GFileAttributeInfo> field_infos() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GFileAttributeInfoList field_infos(Pointer<GFileAttributeInfo> field_infos) {
        this.io.setPointerField(this, 0, field_infos);
        return this;
    }

    @Field(1)
    public int field_n_infos() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GFileAttributeInfoList field_n_infos(int field_n_infos) {
        this.io.setNativeObjectField(this, 1, field_n_infos);
        return this;
    }

    @Ptr
    protected native long g_file_attribute_info_list_dup(
        @Ptr
        long list);

    public Pointer dup() {
        return Pointer.pointerToAddress(this.g_file_attribute_info_list_dup(Pointer.pointerTo(this, GFileAttributeInfoList.class)));
    }

    @Ptr
    protected native long g_file_attribute_info_list_lookup(
        @Ptr
        long list,
        @Ptr
        long name);

    public Pointer<GFileAttributeInfo> lookup(Pointer name) {
        return Pointer.pointerToAddress(this.g_file_attribute_info_list_lookup(Pointer.pointerTo(this, GFileAttributeInfoList.class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long g_file_attribute_info_list_ref(
        @Ptr
        long list);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_file_attribute_info_list_ref(Pointer.pointerTo(this, GFileAttributeInfoList.class)));
    }

    protected native void g_file_attribute_info_list_unref(
        @Ptr
        long list);

    public void unref() {
        this.g_file_attribute_info_list_unref(Pointer.pointerTo(this, GFileAttributeInfoList.class));
    }

    protected native void g_file_attribute_info_list_add(
        @Ptr
        long list,
        @Ptr
        long name, IntValuedEnum<GFileAttributeType> type, Object flags);

    public void add(Pointer name, IntValuedEnum<GFileAttributeType> type, Object flags) {
        this.g_file_attribute_info_list_add(Pointer.pointerTo(this, GFileAttributeInfoList.class), Pointer.getPeer(name), type, flags);
    }

}
