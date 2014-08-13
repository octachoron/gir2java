
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFilenameCompleter
    extends GObject
{


    public GFilenameCompleter() {
        super();
    }

    public GFilenameCompleter(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_filename_completer_get_completion_suffix(
        @Ptr
        long completer,
        @Ptr
        long initial_text);

    public Pointer get_completion_suffix(Pointer initial_text) {
        return Pointer.pointerToAddress(this.g_filename_completer_get_completion_suffix(Pointer.pointerTo(this, GFilenameCompleter.class), Pointer.getPeer(initial_text)));
    }

    @Ptr
    protected native long g_filename_completer_get_completions(
        @Ptr
        long completer,
        @Ptr
        long initial_text);

    public Pointer get_completions(Pointer initial_text) {
        return Pointer.pointerToAddress(this.g_filename_completer_get_completions(Pointer.pointerTo(this, GFilenameCompleter.class), Pointer.getPeer(initial_text)));
    }

    protected native void g_filename_completer_set_dirs_only(
        @Ptr
        long completer, boolean dirs_only);

    public void set_dirs_only(boolean dirs_only) {
        this.g_filename_completer_set_dirs_only(Pointer.pointerTo(this, GFilenameCompleter.class), dirs_only);
    }

}
