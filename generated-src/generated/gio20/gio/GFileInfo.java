
package generated.gio20.gio;

import generated.glib20.glib.GDateTime;
import generated.glib20.glib.GTimeVal;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileInfo
    extends GObject
{


    static {
        BridJ.register();
    }

    public GFileInfo() {
        super();
    }

    public GFileInfo(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_file_info_new();

    public static Pointer gfileinfo__new() {
        return Pointer.pointerToAddress(GFileInfo.g_file_info_new());
    }

    protected native void g_file_info_clear_status(
        @Ptr
        long info);

    public void clear_status() {
        this.g_file_info_clear_status(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    protected native void g_file_info_copy_into(
        @Ptr
        long src_info,
        @Ptr
        long dest_info);

    public void copy_into(Pointer dest_info) {
        this.g_file_info_copy_into(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(dest_info));
    }

    @Ptr
    protected native long g_file_info_dup(
        @Ptr
        long other);

    public Pointer dup() {
        return Pointer.pointerToAddress(this.g_file_info_dup(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_file_info_get_attribute_as_string(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public Pointer get_attribute_as_string(Pointer attribute) {
        return Pointer.pointerToAddress(this.g_file_info_get_attribute_as_string(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute)));
    }

    protected native boolean g_file_info_get_attribute_boolean(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public boolean get_attribute_boolean(Pointer attribute) {
        return this.g_file_info_get_attribute_boolean(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    @Ptr
    protected native long g_file_info_get_attribute_byte_string(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public Pointer get_attribute_byte_string(Pointer attribute) {
        return Pointer.pointerToAddress(this.g_file_info_get_attribute_byte_string(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute)));
    }

    protected native boolean g_file_info_get_attribute_data(
        @Ptr
        long info,
        @Ptr
        long attribute,
        @Ptr
        long type,
        @Ptr
        long value_pp,
        @Ptr
        long status);

    public boolean get_attribute_data(Pointer attribute, Pointer<IntValuedEnum<GFileAttributeType>> type, Pointer value_pp, Pointer<IntValuedEnum<GFileAttributeStatus>> status) {
        return this.g_file_info_get_attribute_data(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(type), Pointer.getPeer(value_pp), Pointer.getPeer(status));
    }

    protected native int g_file_info_get_attribute_int32(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public int get_attribute_int32(Pointer attribute) {
        return this.g_file_info_get_attribute_int32(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    protected native long g_file_info_get_attribute_int64(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public long get_attribute_int64(Pointer attribute) {
        return this.g_file_info_get_attribute_int64(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    @Ptr
    protected native long g_file_info_get_attribute_object(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public Pointer<GObject> get_attribute_object(Pointer attribute) {
        return Pointer.pointerToAddress(this.g_file_info_get_attribute_object(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute)), GObject.class);
    }

    protected native IntValuedEnum<GFileAttributeStatus> g_file_info_get_attribute_status(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public IntValuedEnum<GFileAttributeStatus> get_attribute_status(Pointer attribute) {
        return this.g_file_info_get_attribute_status(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    @Ptr
    protected native long g_file_info_get_attribute_string(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public Pointer get_attribute_string(Pointer attribute) {
        return Pointer.pointerToAddress(this.g_file_info_get_attribute_string(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute)));
    }

    @Ptr
    protected native long g_file_info_get_attribute_stringv(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public Pointer get_attribute_stringv(Pointer attribute) {
        return Pointer.pointerToAddress(this.g_file_info_get_attribute_stringv(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute)));
    }

    protected native IntValuedEnum<GFileAttributeType> g_file_info_get_attribute_type(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public IntValuedEnum<GFileAttributeType> get_attribute_type(Pointer attribute) {
        return this.g_file_info_get_attribute_type(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    protected native long g_file_info_get_attribute_uint32(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public long get_attribute_uint32(Pointer attribute) {
        return this.g_file_info_get_attribute_uint32(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    protected native long g_file_info_get_attribute_uint64(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public long get_attribute_uint64(Pointer attribute) {
        return this.g_file_info_get_attribute_uint64(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    @Ptr
    protected native long g_file_info_get_content_type(
        @Ptr
        long info);

    public Pointer get_content_type() {
        return Pointer.pointerToAddress(this.g_file_info_get_content_type(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_file_info_get_deletion_date(
        @Ptr
        long info);

    public Pointer<GDateTime> get_deletion_date() {
        return Pointer.pointerToAddress(this.g_file_info_get_deletion_date(Pointer.pointerTo(this, GFileInfo.class).getPeer()), GDateTime.class);
    }

    @Ptr
    protected native long g_file_info_get_display_name(
        @Ptr
        long info);

    public Pointer get_display_name() {
        return Pointer.pointerToAddress(this.g_file_info_get_display_name(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_file_info_get_edit_name(
        @Ptr
        long info);

    public Pointer get_edit_name() {
        return Pointer.pointerToAddress(this.g_file_info_get_edit_name(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_file_info_get_etag(
        @Ptr
        long info);

    public Pointer get_etag() {
        return Pointer.pointerToAddress(this.g_file_info_get_etag(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_file_info_get_icon(
        @Ptr
        long info);

    public Pointer get_icon() {
        return Pointer.pointerToAddress(this.g_file_info_get_icon(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    protected native boolean g_file_info_get_is_backup(
        @Ptr
        long info);

    public boolean get_is_backup() {
        return this.g_file_info_get_is_backup(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    protected native boolean g_file_info_get_is_hidden(
        @Ptr
        long info);

    public boolean get_is_hidden() {
        return this.g_file_info_get_is_hidden(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    protected native boolean g_file_info_get_is_symlink(
        @Ptr
        long info);

    public boolean get_is_symlink() {
        return this.g_file_info_get_is_symlink(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    protected native void g_file_info_get_modification_time(
        @Ptr
        long info,
        @Ptr
        long result);

    public void get_modification_time(Pointer<GTimeVal> result) {
        this.g_file_info_get_modification_time(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(result));
    }

    @Ptr
    protected native long g_file_info_get_name(
        @Ptr
        long info);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_file_info_get_name(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    protected native long g_file_info_get_size(
        @Ptr
        long info);

    public long get_size() {
        return this.g_file_info_get_size(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    protected native int g_file_info_get_sort_order(
        @Ptr
        long info);

    public int get_sort_order() {
        return this.g_file_info_get_sort_order(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    @Ptr
    protected native long g_file_info_get_symbolic_icon(
        @Ptr
        long info);

    public Pointer get_symbolic_icon() {
        return Pointer.pointerToAddress(this.g_file_info_get_symbolic_icon(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_file_info_get_symlink_target(
        @Ptr
        long info);

    public Pointer get_symlink_target() {
        return Pointer.pointerToAddress(this.g_file_info_get_symlink_target(Pointer.pointerTo(this, GFileInfo.class).getPeer()));
    }

    protected native boolean g_file_info_has_attribute(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public boolean has_attribute(Pointer attribute) {
        return this.g_file_info_has_attribute(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    protected native boolean g_file_info_has_namespace(
        @Ptr
        long info,
        @Ptr
        long name_space);

    public boolean has_namespace(Pointer name_space) {
        return this.g_file_info_has_namespace(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(name_space));
    }

    @Ptr
    protected native long g_file_info_list_attributes(
        @Ptr
        long info,
        @Ptr
        long name_space);

    public Pointer list_attributes(Pointer name_space) {
        return Pointer.pointerToAddress(this.g_file_info_list_attributes(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(name_space)));
    }

    protected native void g_file_info_remove_attribute(
        @Ptr
        long info,
        @Ptr
        long attribute);

    public void remove_attribute(Pointer attribute) {
        this.g_file_info_remove_attribute(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute));
    }

    protected native void g_file_info_set_attribute(
        @Ptr
        long info,
        @Ptr
        long attribute, IntValuedEnum<GFileAttributeType> type,
        @Ptr
        long value_p);

    public void set_attribute(Pointer attribute, IntValuedEnum<GFileAttributeType> type, Pointer value_p) {
        this.g_file_info_set_attribute(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), type, Pointer.getPeer(value_p));
    }

    protected native void g_file_info_set_attribute_boolean(
        @Ptr
        long info,
        @Ptr
        long attribute, boolean attr_value);

    public void set_attribute_boolean(Pointer attribute, boolean attr_value) {
        this.g_file_info_set_attribute_boolean(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), attr_value);
    }

    protected native void g_file_info_set_attribute_byte_string(
        @Ptr
        long info,
        @Ptr
        long attribute,
        @Ptr
        long attr_value);

    public void set_attribute_byte_string(Pointer attribute, Pointer attr_value) {
        this.g_file_info_set_attribute_byte_string(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(attr_value));
    }

    protected native void g_file_info_set_attribute_int32(
        @Ptr
        long info,
        @Ptr
        long attribute, int attr_value);

    public void set_attribute_int32(Pointer attribute, int attr_value) {
        this.g_file_info_set_attribute_int32(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), attr_value);
    }

    protected native void g_file_info_set_attribute_int64(
        @Ptr
        long info,
        @Ptr
        long attribute, long attr_value);

    public void set_attribute_int64(Pointer attribute, long attr_value) {
        this.g_file_info_set_attribute_int64(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), attr_value);
    }

    protected native void g_file_info_set_attribute_mask(
        @Ptr
        long info,
        @Ptr
        long mask);

    public void set_attribute_mask(Pointer<GFileAttributeMatcher> mask) {
        this.g_file_info_set_attribute_mask(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(mask));
    }

    protected native void g_file_info_set_attribute_object(
        @Ptr
        long info,
        @Ptr
        long attribute,
        @Ptr
        long attr_value);

    public void set_attribute_object(Pointer attribute, Pointer<GObject> attr_value) {
        this.g_file_info_set_attribute_object(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(attr_value));
    }

    protected native boolean g_file_info_set_attribute_status(
        @Ptr
        long info,
        @Ptr
        long attribute, IntValuedEnum<GFileAttributeStatus> status);

    public boolean set_attribute_status(Pointer attribute, IntValuedEnum<GFileAttributeStatus> status) {
        return this.g_file_info_set_attribute_status(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), status);
    }

    protected native void g_file_info_set_attribute_string(
        @Ptr
        long info,
        @Ptr
        long attribute,
        @Ptr
        long attr_value);

    public void set_attribute_string(Pointer attribute, Pointer attr_value) {
        this.g_file_info_set_attribute_string(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(attr_value));
    }

    protected native void g_file_info_set_attribute_stringv(
        @Ptr
        long info,
        @Ptr
        long attribute,
        @Ptr
        long attr_value);

    public void set_attribute_stringv(Pointer attribute, Pointer attr_value) {
        this.g_file_info_set_attribute_stringv(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(attr_value));
    }

    protected native void g_file_info_set_attribute_uint32(
        @Ptr
        long info,
        @Ptr
        long attribute, long attr_value);

    public void set_attribute_uint32(Pointer attribute, long attr_value) {
        this.g_file_info_set_attribute_uint32(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), attr_value);
    }

    protected native void g_file_info_set_attribute_uint64(
        @Ptr
        long info,
        @Ptr
        long attribute, long attr_value);

    public void set_attribute_uint64(Pointer attribute, long attr_value) {
        this.g_file_info_set_attribute_uint64(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(attribute), attr_value);
    }

    protected native void g_file_info_set_content_type(
        @Ptr
        long info,
        @Ptr
        long content_type);

    public void set_content_type(Pointer content_type) {
        this.g_file_info_set_content_type(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(content_type));
    }

    protected native void g_file_info_set_display_name(
        @Ptr
        long info,
        @Ptr
        long display_name);

    public void set_display_name(Pointer display_name) {
        this.g_file_info_set_display_name(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(display_name));
    }

    protected native void g_file_info_set_edit_name(
        @Ptr
        long info,
        @Ptr
        long edit_name);

    public void set_edit_name(Pointer edit_name) {
        this.g_file_info_set_edit_name(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(edit_name));
    }

    protected native void g_file_info_set_icon(
        @Ptr
        long info,
        @Ptr
        long icon);

    public void set_icon(Pointer icon) {
        this.g_file_info_set_icon(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(icon));
    }

    protected native void g_file_info_set_is_hidden(
        @Ptr
        long info, boolean is_hidden);

    public void set_is_hidden(boolean is_hidden) {
        this.g_file_info_set_is_hidden(Pointer.pointerTo(this, GFileInfo.class).getPeer(), is_hidden);
    }

    protected native void g_file_info_set_is_symlink(
        @Ptr
        long info, boolean is_symlink);

    public void set_is_symlink(boolean is_symlink) {
        this.g_file_info_set_is_symlink(Pointer.pointerTo(this, GFileInfo.class).getPeer(), is_symlink);
    }

    protected native void g_file_info_set_modification_time(
        @Ptr
        long info,
        @Ptr
        long mtime);

    public void set_modification_time(Pointer<GTimeVal> mtime) {
        this.g_file_info_set_modification_time(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(mtime));
    }

    protected native void g_file_info_set_name(
        @Ptr
        long info,
        @Ptr
        long name);

    public void set_name(Pointer name) {
        this.g_file_info_set_name(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(name));
    }

    protected native void g_file_info_set_size(
        @Ptr
        long info, long size);

    public void set_size(long size) {
        this.g_file_info_set_size(Pointer.pointerTo(this, GFileInfo.class).getPeer(), size);
    }

    protected native void g_file_info_set_sort_order(
        @Ptr
        long info, int sort_order);

    public void set_sort_order(int sort_order) {
        this.g_file_info_set_sort_order(Pointer.pointerTo(this, GFileInfo.class).getPeer(), sort_order);
    }

    protected native void g_file_info_set_symbolic_icon(
        @Ptr
        long info,
        @Ptr
        long icon);

    public void set_symbolic_icon(Pointer icon) {
        this.g_file_info_set_symbolic_icon(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(icon));
    }

    protected native void g_file_info_set_symlink_target(
        @Ptr
        long info,
        @Ptr
        long symlink_target);

    public void set_symlink_target(Pointer symlink_target) {
        this.g_file_info_set_symlink_target(Pointer.pointerTo(this, GFileInfo.class).getPeer(), Pointer.getPeer(symlink_target));
    }

    protected native void g_file_info_unset_attribute_mask(
        @Ptr
        long info);

    public void unset_attribute_mask() {
        this.g_file_info_unset_attribute_mask(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    protected native IntValuedEnum<GFileType> g_file_info_get_file_type(
        @Ptr
        long info);

    public IntValuedEnum<GFileType> get_file_type() {
        return this.g_file_info_get_file_type(Pointer.pointerTo(this, GFileInfo.class).getPeer());
    }

    protected native void g_file_info_set_file_type(
        @Ptr
        long info, IntValuedEnum<GFileType> type);

    public void set_file_type(IntValuedEnum<GFileType> type) {
        this.g_file_info_set_file_type(Pointer.pointerTo(this, GFileInfo.class).getPeer(), type);
    }

}
