
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileEnumerator
    extends GObject
{


    public GFileEnumerator() {
        super();
    }

    public GFileEnumerator(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_file_enumerator_close(
        @Ptr
        long enumerator,
        @Ptr
        long cancellable);

    public boolean close(Pointer<GCancellable> cancellable) {
        return this.g_file_enumerator_close(Pointer.pointerTo(this, GFileEnumerator.class), Pointer.getPeer(cancellable));
    }

    protected native void g_file_enumerator_close_async(
        @Ptr
        long enumerator, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void close_async(int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_file_enumerator_close_async(Pointer.pointerTo(this, GFileEnumerator.class), io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_file_enumerator_close_finish(
        @Ptr
        long enumerator,
        @Ptr
        long result);

    public boolean close_finish(Pointer<Object> result) {
        return this.g_file_enumerator_close_finish(Pointer.pointerTo(this, GFileEnumerator.class), Pointer.getPeer(result));
    }

    @Ptr
    protected native long g_file_enumerator_get_child(
        @Ptr
        long enumerator,
        @Ptr
        long info);

    public Pointer<Object> get_child(Pointer info) {
        return Pointer.pointerToAddress(this.g_file_enumerator_get_child(Pointer.pointerTo(this, GFileEnumerator.class), Pointer.getPeer(info)), Pointer.class);
    }

    @Ptr
    protected native long g_file_enumerator_get_container(
        @Ptr
        long enumerator);

    public Pointer<Object> get_container() {
        return Pointer.pointerToAddress(this.g_file_enumerator_get_container(Pointer.pointerTo(this, GFileEnumerator.class)), Pointer.class);
    }

    protected native boolean g_file_enumerator_has_pending(
        @Ptr
        long enumerator);

    public boolean has_pending() {
        return this.g_file_enumerator_has_pending(Pointer.pointerTo(this, GFileEnumerator.class));
    }

    protected native boolean g_file_enumerator_is_closed(
        @Ptr
        long enumerator);

    public boolean is_closed() {
        return this.g_file_enumerator_is_closed(Pointer.pointerTo(this, GFileEnumerator.class));
    }

    @Ptr
    protected native long g_file_enumerator_next_file(
        @Ptr
        long enumerator,
        @Ptr
        long cancellable);

    public Pointer next_file(Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_file_enumerator_next_file(Pointer.pointerTo(this, GFileEnumerator.class), Pointer.getPeer(cancellable)));
    }

    protected native void g_file_enumerator_next_files_async(
        @Ptr
        long enumerator, int num_files, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void next_files_async(int num_files, int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_file_enumerator_next_files_async(Pointer.pointerTo(this, GFileEnumerator.class), num_files, io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_file_enumerator_next_files_finish(
        @Ptr
        long enumerator,
        @Ptr
        long result);

    public Pointer<GList> next_files_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_file_enumerator_next_files_finish(Pointer.pointerTo(this, GFileEnumerator.class), Pointer.getPeer(result)), Pointer.class);
    }

    protected native void g_file_enumerator_set_pending(
        @Ptr
        long enumerator, boolean pending);

    public void set_pending(boolean pending) {
        this.g_file_enumerator_set_pending(Pointer.pointerTo(this, GFileEnumerator.class), pending);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileEnumerator field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GFileEnumerator field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
