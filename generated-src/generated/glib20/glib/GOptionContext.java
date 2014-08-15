
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GOptionContext
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GOptionContext() {
        super();
    }

    public GOptionContext(Pointer pointer) {
        super(pointer);
    }

    protected native void g_option_context_add_group(
        @Ptr
        long context,
        @Ptr
        long group);

    public void add_group(Pointer group) {
        this.g_option_context_add_group(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(group));
    }

    protected native void g_option_context_add_main_entries(
        @Ptr
        long context,
        @Ptr
        long entries,
        @Ptr
        long translation_domain);

    public void add_main_entries(Pointer entries, Pointer translation_domain) {
        this.g_option_context_add_main_entries(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(entries), Pointer.getPeer(translation_domain));
    }

    protected native void g_option_context_free(
        @Ptr
        long context);

    public void free() {
        this.g_option_context_free(Pointer.pointerTo(this, GOptionContext.class).getPeer());
    }

    @Ptr
    protected native long g_option_context_get_description(
        @Ptr
        long context);

    public Pointer get_description() {
        return Pointer.pointerToAddress(this.g_option_context_get_description(Pointer.pointerTo(this, GOptionContext.class).getPeer()));
    }

    @Ptr
    protected native long g_option_context_get_help(
        @Ptr
        long context, boolean main_help,
        @Ptr
        long group);

    public Pointer get_help(boolean main_help, Pointer group) {
        return Pointer.pointerToAddress(this.g_option_context_get_help(Pointer.pointerTo(this, GOptionContext.class).getPeer(), main_help, Pointer.getPeer(group)));
    }

    protected native boolean g_option_context_get_help_enabled(
        @Ptr
        long context);

    public boolean get_help_enabled() {
        return this.g_option_context_get_help_enabled(Pointer.pointerTo(this, GOptionContext.class).getPeer());
    }

    protected native boolean g_option_context_get_ignore_unknown_options(
        @Ptr
        long context);

    public boolean get_ignore_unknown_options() {
        return this.g_option_context_get_ignore_unknown_options(Pointer.pointerTo(this, GOptionContext.class).getPeer());
    }

    @Ptr
    protected native long g_option_context_get_main_group(
        @Ptr
        long context);

    public Pointer get_main_group() {
        return Pointer.pointerToAddress(this.g_option_context_get_main_group(Pointer.pointerTo(this, GOptionContext.class).getPeer()));
    }

    @Ptr
    protected native long g_option_context_get_summary(
        @Ptr
        long context);

    public Pointer get_summary() {
        return Pointer.pointerToAddress(this.g_option_context_get_summary(Pointer.pointerTo(this, GOptionContext.class).getPeer()));
    }

    protected native boolean g_option_context_parse(
        @Ptr
        long context,
        @Ptr
        long argc,
        @Ptr
        long argv);

    public boolean parse(Pointer<Integer> argc, Pointer argv) {
        return this.g_option_context_parse(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(argc), Pointer.getPeer(argv));
    }

    protected native boolean g_option_context_parse_strv(
        @Ptr
        long context,
        @Ptr
        long arguments);

    public boolean parse_strv(Pointer arguments) {
        return this.g_option_context_parse_strv(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(arguments));
    }

    protected native void g_option_context_set_description(
        @Ptr
        long context,
        @Ptr
        long description);

    public void set_description(Pointer description) {
        this.g_option_context_set_description(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(description));
    }

    protected native void g_option_context_set_help_enabled(
        @Ptr
        long context, boolean help_enabled);

    public void set_help_enabled(boolean help_enabled) {
        this.g_option_context_set_help_enabled(Pointer.pointerTo(this, GOptionContext.class).getPeer(), help_enabled);
    }

    protected native void g_option_context_set_ignore_unknown_options(
        @Ptr
        long context, boolean ignore_unknown);

    public void set_ignore_unknown_options(boolean ignore_unknown) {
        this.g_option_context_set_ignore_unknown_options(Pointer.pointerTo(this, GOptionContext.class).getPeer(), ignore_unknown);
    }

    protected native void g_option_context_set_main_group(
        @Ptr
        long context,
        @Ptr
        long group);

    public void set_main_group(Pointer group) {
        this.g_option_context_set_main_group(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(group));
    }

    protected native void g_option_context_set_summary(
        @Ptr
        long context,
        @Ptr
        long summary);

    public void set_summary(Pointer summary) {
        this.g_option_context_set_summary(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(summary));
    }

    protected native void g_option_context_set_translation_domain(
        @Ptr
        long context,
        @Ptr
        long domain);

    public void set_translation_domain(Pointer domain) {
        this.g_option_context_set_translation_domain(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(domain));
    }

    @Ptr
    protected static native long g_option_context_new(
        @Ptr
        long parameter_string);

    public static Pointer _new(Pointer parameter_string) {
        return Pointer.pointerToAddress(GOptionContext.g_option_context_new(Pointer.getPeer(parameter_string)));
    }

    protected native void g_option_context_set_translate_func(
        @Ptr
        long context,
        @Ptr
        long func,
        @Ptr
        long data,
        @Ptr
        long destroy_notify);

    public void set_translate_func(Pointer func, Pointer data, Pointer destroy_notify) {
        this.g_option_context_set_translate_func(Pointer.pointerTo(this, GOptionContext.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(data), Pointer.getPeer(destroy_notify));
    }

}
