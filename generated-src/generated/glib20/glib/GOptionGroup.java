
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GOptionGroup
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GOptionGroup() {
        super();
    }

    public GOptionGroup(Pointer pointer) {
        super(pointer);
    }

    protected native void g_option_group_add_entries(
        @Ptr
        long group,
        @Ptr
        long entries);

    public void add_entries(Pointer<GOptionEntry> entries) {
        this.g_option_group_add_entries(Pointer.pointerTo(this, GOptionGroup.class).getPeer(), Pointer.getPeer(entries));
    }

    protected native void g_option_group_free(
        @Ptr
        long group);

    public void free() {
        this.g_option_group_free(Pointer.pointerTo(this, GOptionGroup.class).getPeer());
    }

    protected native void g_option_group_set_error_hook(
        @Ptr
        long group,
        @Ptr
        long error_func);

    public void set_error_hook(Pointer error_func) {
        this.g_option_group_set_error_hook(Pointer.pointerTo(this, GOptionGroup.class).getPeer(), Pointer.getPeer(error_func));
    }

    protected native void g_option_group_set_translation_domain(
        @Ptr
        long group,
        @Ptr
        long domain);

    public void set_translation_domain(Pointer domain) {
        this.g_option_group_set_translation_domain(Pointer.pointerTo(this, GOptionGroup.class).getPeer(), Pointer.getPeer(domain));
    }

    @Ptr
    protected static native long g_option_group_new(
        @Ptr
        long name,
        @Ptr
        long description,
        @Ptr
        long help_description,
        @Ptr
        long user_data,
        @Ptr
        long destroy);

    public static Pointer _new(Pointer name, Pointer description, Pointer help_description, Pointer user_data, Pointer destroy) {
        return Pointer.pointerToAddress(GOptionGroup.g_option_group_new(Pointer.getPeer(name), Pointer.getPeer(description), Pointer.getPeer(help_description), Pointer.getPeer(user_data), Pointer.getPeer(destroy)));
    }

    protected native void g_option_group_set_translate_func(
        @Ptr
        long group,
        @Ptr
        long func,
        @Ptr
        long data,
        @Ptr
        long destroy_notify);

    public void set_translate_func(Pointer func, Pointer data, Pointer destroy_notify) {
        this.g_option_group_set_translate_func(Pointer.pointerTo(this, GOptionGroup.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(data), Pointer.getPeer(destroy_notify));
    }

    protected native void g_option_group_set_parse_hooks(
        @Ptr
        long group,
        @Ptr
        long pre_parse_func,
        @Ptr
        long post_parse_func);

    public void set_parse_hooks(Pointer pre_parse_func, Pointer post_parse_func) {
        this.g_option_group_set_parse_hooks(Pointer.pointerTo(this, GOptionGroup.class).getPeer(), Pointer.getPeer(pre_parse_func), Pointer.getPeer(post_parse_func));
    }

}
