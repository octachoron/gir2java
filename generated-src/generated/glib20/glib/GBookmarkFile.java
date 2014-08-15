
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GBookmarkFile
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GBookmarkFile() {
        super();
    }

    public GBookmarkFile(Pointer pointer) {
        super(pointer);
    }

    protected native void g_bookmark_file_add_application(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long name,
        @Ptr
        long exec);

    public void add_application(Pointer uri, Pointer name, Pointer exec) {
        this.g_bookmark_file_add_application(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(name), Pointer.getPeer(exec));
    }

    protected native void g_bookmark_file_add_group(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long group);

    public void add_group(Pointer uri, Pointer group) {
        this.g_bookmark_file_add_group(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(group));
    }

    protected native void g_bookmark_file_free(
        @Ptr
        long bookmark);

    public void free() {
        this.g_bookmark_file_free(Pointer.pointerTo(this, GBookmarkFile.class).getPeer());
    }

    protected native long g_bookmark_file_get_added(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public long get_added(Pointer uri) {
        return this.g_bookmark_file_get_added(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native boolean g_bookmark_file_get_app_info(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long name,
        @Ptr
        long exec,
        @Ptr
        long count,
        @Ptr
        long stamp);

    public boolean get_app_info(Pointer uri, Pointer name, Pointer exec, Pointer<Long> count, Pointer<Long> stamp) {
        return this.g_bookmark_file_get_app_info(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(name), Pointer.getPeer(exec), Pointer.getPeer(count), Pointer.getPeer(stamp));
    }

    @Ptr
    protected native long g_bookmark_file_get_applications(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long length);

    public Pointer get_applications(Pointer uri, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_bookmark_file_get_applications(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_bookmark_file_get_description(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public Pointer get_description(Pointer uri) {
        return Pointer.pointerToAddress(this.g_bookmark_file_get_description(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri)));
    }

    @Ptr
    protected native long g_bookmark_file_get_groups(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long length);

    public Pointer get_groups(Pointer uri, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_bookmark_file_get_groups(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(length)));
    }

    protected native boolean g_bookmark_file_get_icon(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long href,
        @Ptr
        long mime_type);

    public boolean get_icon(Pointer uri, Pointer href, Pointer mime_type) {
        return this.g_bookmark_file_get_icon(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(href), Pointer.getPeer(mime_type));
    }

    protected native boolean g_bookmark_file_get_is_private(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public boolean get_is_private(Pointer uri) {
        return this.g_bookmark_file_get_is_private(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri));
    }

    @Ptr
    protected native long g_bookmark_file_get_mime_type(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public Pointer get_mime_type(Pointer uri) {
        return Pointer.pointerToAddress(this.g_bookmark_file_get_mime_type(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri)));
    }

    protected native long g_bookmark_file_get_modified(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public long get_modified(Pointer uri) {
        return this.g_bookmark_file_get_modified(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native int g_bookmark_file_get_size(
        @Ptr
        long bookmark);

    public int get_size() {
        return this.g_bookmark_file_get_size(Pointer.pointerTo(this, GBookmarkFile.class).getPeer());
    }

    @Ptr
    protected native long g_bookmark_file_get_title(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public Pointer get_title(Pointer uri) {
        return Pointer.pointerToAddress(this.g_bookmark_file_get_title(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri)));
    }

    @Ptr
    protected native long g_bookmark_file_get_uris(
        @Ptr
        long bookmark,
        @Ptr
        long length);

    public Pointer get_uris(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_bookmark_file_get_uris(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(length)));
    }

    protected native long g_bookmark_file_get_visited(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public long get_visited(Pointer uri) {
        return this.g_bookmark_file_get_visited(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native boolean g_bookmark_file_has_application(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long name);

    public boolean has_application(Pointer uri, Pointer name) {
        return this.g_bookmark_file_has_application(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(name));
    }

    protected native boolean g_bookmark_file_has_group(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long group);

    public boolean has_group(Pointer uri, Pointer group) {
        return this.g_bookmark_file_has_group(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(group));
    }

    protected native boolean g_bookmark_file_has_item(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public boolean has_item(Pointer uri) {
        return this.g_bookmark_file_has_item(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native boolean g_bookmark_file_load_from_data(
        @Ptr
        long bookmark,
        @Ptr
        long data, long length);

    public boolean load_from_data(Pointer data, long length) {
        return this.g_bookmark_file_load_from_data(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(data), length);
    }

    protected native boolean g_bookmark_file_load_from_data_dirs(
        @Ptr
        long bookmark,
        @Ptr
        long file,
        @Ptr
        long full_path);

    public boolean load_from_data_dirs(Pointer file, Pointer full_path) {
        return this.g_bookmark_file_load_from_data_dirs(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(file), Pointer.getPeer(full_path));
    }

    protected native boolean g_bookmark_file_load_from_file(
        @Ptr
        long bookmark,
        @Ptr
        long filename);

    public boolean load_from_file(Pointer filename) {
        return this.g_bookmark_file_load_from_file(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(filename));
    }

    protected native boolean g_bookmark_file_move_item(
        @Ptr
        long bookmark,
        @Ptr
        long old_uri,
        @Ptr
        long new_uri);

    public boolean move_item(Pointer old_uri, Pointer new_uri) {
        return this.g_bookmark_file_move_item(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(old_uri), Pointer.getPeer(new_uri));
    }

    protected native boolean g_bookmark_file_remove_application(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long name);

    public boolean remove_application(Pointer uri, Pointer name) {
        return this.g_bookmark_file_remove_application(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(name));
    }

    protected native boolean g_bookmark_file_remove_group(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long group);

    public boolean remove_group(Pointer uri, Pointer group) {
        return this.g_bookmark_file_remove_group(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(group));
    }

    protected native boolean g_bookmark_file_remove_item(
        @Ptr
        long bookmark,
        @Ptr
        long uri);

    public boolean remove_item(Pointer uri) {
        return this.g_bookmark_file_remove_item(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri));
    }

    protected native void g_bookmark_file_set_added(
        @Ptr
        long bookmark,
        @Ptr
        long uri, long added);

    public void set_added(Pointer uri, long added) {
        this.g_bookmark_file_set_added(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), added);
    }

    protected native boolean g_bookmark_file_set_app_info(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long name,
        @Ptr
        long exec, int count, long stamp);

    public boolean set_app_info(Pointer uri, Pointer name, Pointer exec, int count, long stamp) {
        return this.g_bookmark_file_set_app_info(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(name), Pointer.getPeer(exec), count, stamp);
    }

    protected native void g_bookmark_file_set_description(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long description);

    public void set_description(Pointer uri, Pointer description) {
        this.g_bookmark_file_set_description(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(description));
    }

    protected native void g_bookmark_file_set_groups(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long groups, long length);

    public void set_groups(Pointer uri, Pointer groups, long length) {
        this.g_bookmark_file_set_groups(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(groups), length);
    }

    protected native void g_bookmark_file_set_icon(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long href,
        @Ptr
        long mime_type);

    public void set_icon(Pointer uri, Pointer href, Pointer mime_type) {
        this.g_bookmark_file_set_icon(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(href), Pointer.getPeer(mime_type));
    }

    protected native void g_bookmark_file_set_is_private(
        @Ptr
        long bookmark,
        @Ptr
        long uri, boolean is_private);

    public void set_is_private(Pointer uri, boolean is_private) {
        this.g_bookmark_file_set_is_private(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), is_private);
    }

    protected native void g_bookmark_file_set_mime_type(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long mime_type);

    public void set_mime_type(Pointer uri, Pointer mime_type) {
        this.g_bookmark_file_set_mime_type(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(mime_type));
    }

    protected native void g_bookmark_file_set_modified(
        @Ptr
        long bookmark,
        @Ptr
        long uri, long modified);

    public void set_modified(Pointer uri, long modified) {
        this.g_bookmark_file_set_modified(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), modified);
    }

    protected native void g_bookmark_file_set_title(
        @Ptr
        long bookmark,
        @Ptr
        long uri,
        @Ptr
        long title);

    public void set_title(Pointer uri, Pointer title) {
        this.g_bookmark_file_set_title(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), Pointer.getPeer(title));
    }

    protected native void g_bookmark_file_set_visited(
        @Ptr
        long bookmark,
        @Ptr
        long uri, long visited);

    public void set_visited(Pointer uri, long visited) {
        this.g_bookmark_file_set_visited(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(uri), visited);
    }

    @Ptr
    protected native long g_bookmark_file_to_data(
        @Ptr
        long bookmark,
        @Ptr
        long length);

    public Pointer to_data(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_bookmark_file_to_data(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(length)));
    }

    protected native boolean g_bookmark_file_to_file(
        @Ptr
        long bookmark,
        @Ptr
        long filename);

    public boolean to_file(Pointer filename) {
        return this.g_bookmark_file_to_file(Pointer.pointerTo(this, GBookmarkFile.class).getPeer(), Pointer.getPeer(filename));
    }

    public static native long g_bookmark_file_error_quark();

    @Ptr
    protected static native long g_bookmark_file_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GBookmarkFile.g_bookmark_file_new());
    }

}
