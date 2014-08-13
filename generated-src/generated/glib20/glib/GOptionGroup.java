
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GOptionGroup
    extends StructObject
{


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
        this.g_option_group_add_entries(Pointer.pointerTo(this, GOptionGroup.class), Pointer.getPeer(entries));
    }

    protected native void g_option_group_free(
        @Ptr
        long group);

    public void free() {
        this.g_option_group_free(Pointer.pointerTo(this, GOptionGroup.class));
    }

    protected native void g_option_group_set_error_hook(
        @Ptr
        long group, Object error_func);

    public void set_error_hook(Object error_func) {
        this.g_option_group_set_error_hook(Pointer.pointerTo(this, GOptionGroup.class), error_func);
    }

    protected native void g_option_group_set_translation_domain(
        @Ptr
        long group,
        @Ptr
        long domain);

    public void set_translation_domain(Pointer domain) {
        this.g_option_group_set_translation_domain(Pointer.pointerTo(this, GOptionGroup.class), Pointer.getPeer(domain));
    }

    @Ptr
    protected native long g_option_group_new(
        @Ptr
        long name,
        @Ptr
        long description,
        @Ptr
        long help_description, Pointer user_data, Object destroy);

    public Pointer _new(Pointer name, Pointer description, Pointer help_description, Pointer user_data, Object destroy) {
        return Pointer.pointerToAddress(this.g_option_group_new(Pointer.getPeer(name), Pointer.getPeer(description), Pointer.getPeer(help_description), user_data, destroy));
    }

    protected native void g_option_group_set_translate_func(
        @Ptr
        long group, Object func, Pointer data, Object destroy_notify);

    public void set_translate_func(Object func, Pointer data, Object destroy_notify) {
        this.g_option_group_set_translate_func(Pointer.pointerTo(this, GOptionGroup.class), func, data, destroy_notify);
    }

    protected native void g_option_group_set_parse_hooks(
        @Ptr
        long group, Object pre_parse_func, Object post_parse_func);

    public void set_parse_hooks(Object pre_parse_func, Object post_parse_func) {
        this.g_option_group_set_parse_hooks(Pointer.pointerTo(this, GOptionGroup.class), pre_parse_func, post_parse_func);
    }

}
