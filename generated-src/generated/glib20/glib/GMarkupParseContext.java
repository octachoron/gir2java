
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GMarkupParseContext
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMarkupParseContext() {
        super();
    }

    public GMarkupParseContext(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_markup_parse_context_end_parse(
        @Ptr
        long context);

    public boolean end_parse() {
        return this.g_markup_parse_context_end_parse(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer());
    }

    protected native void g_markup_parse_context_free(
        @Ptr
        long context);

    public void free() {
        this.g_markup_parse_context_free(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer());
    }

    @Ptr
    protected native long g_markup_parse_context_get_element(
        @Ptr
        long context);

    public Pointer get_element() {
        return Pointer.pointerToAddress(this.g_markup_parse_context_get_element(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer()));
    }

    @Ptr
    protected native long g_markup_parse_context_get_element_stack(
        @Ptr
        long context);

    public Pointer get_element_stack() {
        return Pointer.pointerToAddress(this.g_markup_parse_context_get_element_stack(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer()));
    }

    protected native void g_markup_parse_context_get_position(
        @Ptr
        long context,
        @Ptr
        long line_number,
        @Ptr
        long char_number);

    public void get_position(Pointer<Integer> line_number, Pointer<Integer> char_number) {
        this.g_markup_parse_context_get_position(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer(), Pointer.getPeer(line_number), Pointer.getPeer(char_number));
    }

    @Ptr
    protected native long g_markup_parse_context_get_user_data(
        @Ptr
        long context);

    public Pointer get_user_data() {
        return Pointer.pointerToAddress(this.g_markup_parse_context_get_user_data(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer()));
    }

    protected native boolean g_markup_parse_context_parse(
        @Ptr
        long context,
        @Ptr
        long text, long text_len);

    public boolean parse(Pointer text, long text_len) {
        return this.g_markup_parse_context_parse(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer(), Pointer.getPeer(text), text_len);
    }

    @Ptr
    protected native long g_markup_parse_context_pop(
        @Ptr
        long context);

    public Pointer pop() {
        return Pointer.pointerToAddress(this.g_markup_parse_context_pop(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer()));
    }

    protected native void g_markup_parse_context_push(
        @Ptr
        long context,
        @Ptr
        long parser,
        @Ptr
        long user_data);

    public void push(Pointer parser, Pointer user_data) {
        this.g_markup_parse_context_push(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer(), Pointer.getPeer(parser), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_markup_parse_context_ref(
        @Ptr
        long context);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_markup_parse_context_ref(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer()));
    }

    protected native void g_markup_parse_context_unref(
        @Ptr
        long context);

    public void unref() {
        this.g_markup_parse_context_unref(Pointer.pointerTo(this, GMarkupParseContext.class).getPeer());
    }

}
