
package generated.gio20.gio;

import org.bridj.BridJ;
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


    static {
        BridJ.register();
    }

    public GFileAttributeInfoList() {
        super();
    }

    public GFileAttributeInfoList(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GFileAttributeInfo> gfileattributeinfolist_field_infos() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GFileAttributeInfoList gfileattributeinfolist_field_infos(Pointer<GFileAttributeInfo> gfileattributeinfolist_field_infos) {
        this.io.setPointerField(this, 0, gfileattributeinfolist_field_infos);
        return this;
    }

    @Field(1)
    public int gfileattributeinfolist_field_n_infos() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GFileAttributeInfoList gfileattributeinfolist_field_n_infos(int gfileattributeinfolist_field_n_infos) {
        this.io.setIntField(this, 1, gfileattributeinfolist_field_n_infos);
        return this;
    }

    @Ptr
    protected static native long g_file_attribute_info_list_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GFileAttributeInfoList.g_file_attribute_info_list_new());
    }

    @Ptr
    protected native long g_file_attribute_info_list_dup(
        @Ptr
        long list);

    public Pointer dup() {
        return Pointer.pointerToAddress(this.g_file_attribute_info_list_dup(Pointer.pointerTo(this, GFileAttributeInfoList.class).getPeer()));
    }

    @Ptr
    protected native long g_file_attribute_info_list_lookup(
        @Ptr
        long list,
        @Ptr
        long name);

    public Pointer<GFileAttributeInfo> lookup(Pointer name) {
        return Pointer.pointerToAddress(this.g_file_attribute_info_list_lookup(Pointer.pointerTo(this, GFileAttributeInfoList.class).getPeer(), Pointer.getPeer(name)), GFileAttributeInfo.class);
    }

    @Ptr
    protected native long g_file_attribute_info_list_ref(
        @Ptr
        long list);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_file_attribute_info_list_ref(Pointer.pointerTo(this, GFileAttributeInfoList.class).getPeer()));
    }

    protected native void g_file_attribute_info_list_unref(
        @Ptr
        long list);

    public void unref() {
        this.g_file_attribute_info_list_unref(Pointer.pointerTo(this, GFileAttributeInfoList.class).getPeer());
    }

    protected native void g_file_attribute_info_list_add(
        @Ptr
        long list,
        @Ptr
        long name, IntValuedEnum<GFileAttributeType> type, IntValuedEnum<GFileAttributeInfoFlags> flags);

    public void add(Pointer name, IntValuedEnum<GFileAttributeType> type, IntValuedEnum<GFileAttributeInfoFlags> flags) {
        this.g_file_attribute_info_list_add(Pointer.pointerTo(this, GFileAttributeInfoList.class).getPeer(), Pointer.getPeer(name), type, flags);
    }

}
