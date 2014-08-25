
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileEnumerator
    extends GObject
{


    static {
        BridJ.register();
    }

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
        return this.g_file_enumerator_close(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native void g_file_enumerator_close_async(
        @Ptr
        long enumerator, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void close_async(int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_file_enumerator_close_async(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native boolean g_file_enumerator_close_finish(
        @Ptr
        long enumerator,
        @Ptr
        long result);

    public boolean close_finish(Pointer<Object> result) {
        return this.g_file_enumerator_close_finish(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), Pointer.getPeer(result));
    }

    @Ptr
    protected native long g_file_enumerator_get_child(
        @Ptr
        long enumerator,
        @Ptr
        long info);

    public Pointer<Object> get_child(Pointer info) {
        return Pointer.pointerToAddress(this.g_file_enumerator_get_child(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), Pointer.getPeer(info)), Object.class);
    }

    @Ptr
    protected native long g_file_enumerator_get_container(
        @Ptr
        long enumerator);

    public Pointer<Object> get_container() {
        return Pointer.pointerToAddress(this.g_file_enumerator_get_container(Pointer.pointerTo(this, GFileEnumerator.class).getPeer()), Object.class);
    }

    protected native boolean g_file_enumerator_has_pending(
        @Ptr
        long enumerator);

    public boolean has_pending() {
        return this.g_file_enumerator_has_pending(Pointer.pointerTo(this, GFileEnumerator.class).getPeer());
    }

    protected native boolean g_file_enumerator_is_closed(
        @Ptr
        long enumerator);

    public boolean is_closed() {
        return this.g_file_enumerator_is_closed(Pointer.pointerTo(this, GFileEnumerator.class).getPeer());
    }

    @Ptr
    protected native long g_file_enumerator_next_file(
        @Ptr
        long enumerator,
        @Ptr
        long cancellable);

    public Pointer next_file(Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_file_enumerator_next_file(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), Pointer.getPeer(cancellable)));
    }

    protected native void g_file_enumerator_next_files_async(
        @Ptr
        long enumerator, int num_files, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void next_files_async(int num_files, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_file_enumerator_next_files_async(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), num_files, io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_file_enumerator_next_files_finish(
        @Ptr
        long enumerator,
        @Ptr
        long result);

    public Pointer<GList> next_files_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_file_enumerator_next_files_finish(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), Pointer.getPeer(result)), GList.class);
    }

    protected native void g_file_enumerator_set_pending(
        @Ptr
        long enumerator, boolean pending);

    public void set_pending(boolean pending) {
        this.g_file_enumerator_set_pending(Pointer.pointerTo(this, GFileEnumerator.class).getPeer(), pending);
    }

    @Field(0)
    public GObject gfileenumerator_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileEnumerator gfileenumerator_field_parent_instance(GObject gfileenumerator_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gfileenumerator_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gfileenumerator_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GFileEnumerator gfileenumerator_field_priv(Pointer gfileenumerator_field_priv) {
        this.io.setPointerField(this, 1, gfileenumerator_field_priv);
        return this;
    }

}
