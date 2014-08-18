
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GAppLaunchContext
    extends GObject
{


    static {
        BridJ.register();
    }

    public GAppLaunchContext() {
        super();
    }

    public GAppLaunchContext(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_app_launch_context_new();

    public static Pointer gapplaunchcontext__new() {
        return Pointer.pointerToAddress(GAppLaunchContext.g_app_launch_context_new());
    }

    @Ptr
    protected native long g_app_launch_context_get_display(
        @Ptr
        long context,
        @Ptr
        long info,
        @Ptr
        long files);

    public Pointer get_display(Pointer<Object> info, Pointer<GList> files) {
        return Pointer.pointerToAddress(this.g_app_launch_context_get_display(Pointer.pointerTo(this, GAppLaunchContext.class).getPeer(), Pointer.getPeer(info), Pointer.getPeer(files)));
    }

    @Ptr
    protected native long g_app_launch_context_get_environment(
        @Ptr
        long context);

    public Pointer get_environment() {
        return Pointer.pointerToAddress(this.g_app_launch_context_get_environment(Pointer.pointerTo(this, GAppLaunchContext.class).getPeer()));
    }

    @Ptr
    protected native long g_app_launch_context_get_startup_notify_id(
        @Ptr
        long context,
        @Ptr
        long info,
        @Ptr
        long files);

    public Pointer get_startup_notify_id(Pointer<Object> info, Pointer<GList> files) {
        return Pointer.pointerToAddress(this.g_app_launch_context_get_startup_notify_id(Pointer.pointerTo(this, GAppLaunchContext.class).getPeer(), Pointer.getPeer(info), Pointer.getPeer(files)));
    }

    protected native void g_app_launch_context_launch_failed(
        @Ptr
        long context,
        @Ptr
        long startup_notify_id);

    public void launch_failed(Pointer startup_notify_id) {
        this.g_app_launch_context_launch_failed(Pointer.pointerTo(this, GAppLaunchContext.class).getPeer(), Pointer.getPeer(startup_notify_id));
    }

    protected native void g_app_launch_context_setenv(
        @Ptr
        long context,
        @Ptr
        long variable,
        @Ptr
        long value);

    public void setenv(Pointer variable, Pointer value) {
        this.g_app_launch_context_setenv(Pointer.pointerTo(this, GAppLaunchContext.class).getPeer(), Pointer.getPeer(variable), Pointer.getPeer(value));
    }

    protected native void g_app_launch_context_unsetenv(
        @Ptr
        long context,
        @Ptr
        long variable);

    public void unsetenv(Pointer variable) {
        this.g_app_launch_context_unsetenv(Pointer.pointerTo(this, GAppLaunchContext.class).getPeer(), Pointer.getPeer(variable));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GAppLaunchContext field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GAppLaunchContext field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
