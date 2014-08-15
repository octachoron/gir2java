
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GString
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GString() {
        super();
    }

    public GString(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_str() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GString field_str(Pointer field_str) {
        this.io.setPointerField(this, 0, field_str);
        return this;
    }

    @Field(1)
    public long field_len() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GString field_len(long field_len) {
        this.io.setLongField(this, 1, field_len);
        return this;
    }

    @Field(2)
    public long field_allocated_len() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GString field_allocated_len(long field_allocated_len) {
        this.io.setLongField(this, 2, field_allocated_len);
        return this;
    }

    @Ptr
    protected native long g_string_append(
        @Ptr
        long string,
        @Ptr
        long val);

    public Pointer append(Pointer val) {
        return Pointer.pointerToAddress(this.g_string_append(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(val)));
    }

    @Ptr
    protected native long g_string_append_c(
        @Ptr
        long string, char c);

    public Pointer append_c(char c) {
        return Pointer.pointerToAddress(this.g_string_append_c(Pointer.pointerTo(this, GString.class).getPeer(), c));
    }

    @Ptr
    protected native long g_string_append_len(
        @Ptr
        long string,
        @Ptr
        long val, long len);

    public Pointer append_len(Pointer val, long len) {
        return Pointer.pointerToAddress(this.g_string_append_len(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(val), len));
    }

    protected native void g_string_append_printf(
        @Ptr
        long string,
        @Ptr
        long format, Object... varargs);

    public void append_printf(Pointer format, Object... varargs) {
        this.g_string_append_printf(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(format), varargs);
    }

    @Ptr
    protected native long g_string_append_unichar(
        @Ptr
        long string, long wc);

    public Pointer append_unichar(long wc) {
        return Pointer.pointerToAddress(this.g_string_append_unichar(Pointer.pointerTo(this, GString.class).getPeer(), wc));
    }

    @Ptr
    protected native long g_string_append_uri_escaped(
        @Ptr
        long string,
        @Ptr
        long unescaped,
        @Ptr
        long reserved_chars_allowed, boolean allow_utf8);

    public Pointer append_uri_escaped(Pointer unescaped, Pointer reserved_chars_allowed, boolean allow_utf8) {
        return Pointer.pointerToAddress(this.g_string_append_uri_escaped(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(unescaped), Pointer.getPeer(reserved_chars_allowed), allow_utf8));
    }

    @Ptr
    protected native long g_string_ascii_down(
        @Ptr
        long string);

    public Pointer ascii_down() {
        return Pointer.pointerToAddress(this.g_string_ascii_down(Pointer.pointerTo(this, GString.class).getPeer()));
    }

    @Ptr
    protected native long g_string_ascii_up(
        @Ptr
        long string);

    public Pointer ascii_up() {
        return Pointer.pointerToAddress(this.g_string_ascii_up(Pointer.pointerTo(this, GString.class).getPeer()));
    }

    @Ptr
    protected native long g_string_assign(
        @Ptr
        long string,
        @Ptr
        long rval);

    public Pointer assign(Pointer rval) {
        return Pointer.pointerToAddress(this.g_string_assign(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(rval)));
    }

    @Ptr
    protected native long g_string_down(
        @Ptr
        long string);

    public Pointer down() {
        return Pointer.pointerToAddress(this.g_string_down(Pointer.pointerTo(this, GString.class).getPeer()));
    }

    protected native boolean g_string_equal(
        @Ptr
        long v,
        @Ptr
        long v2);

    public boolean equal(Pointer v2) {
        return this.g_string_equal(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(v2));
    }

    @Ptr
    protected native long g_string_erase(
        @Ptr
        long string, long pos, long len);

    public Pointer erase(long pos, long len) {
        return Pointer.pointerToAddress(this.g_string_erase(Pointer.pointerTo(this, GString.class).getPeer(), pos, len));
    }

    @Ptr
    protected native long g_string_free(
        @Ptr
        long string, boolean free_segment);

    public Pointer free(boolean free_segment) {
        return Pointer.pointerToAddress(this.g_string_free(Pointer.pointerTo(this, GString.class).getPeer(), free_segment));
    }

    @Ptr
    protected native long g_string_free_to_bytes(
        @Ptr
        long string);

    public Pointer<GBytes> free_to_bytes() {
        return Pointer.pointerToAddress(this.g_string_free_to_bytes(Pointer.pointerTo(this, GString.class).getPeer()), GBytes.class);
    }

    protected native long g_string_hash(
        @Ptr
        long str);

    public long hash() {
        return this.g_string_hash(Pointer.pointerTo(this, GString.class).getPeer());
    }

    @Ptr
    protected native long g_string_insert(
        @Ptr
        long string, long pos,
        @Ptr
        long val);

    public Pointer insert(long pos, Pointer val) {
        return Pointer.pointerToAddress(this.g_string_insert(Pointer.pointerTo(this, GString.class).getPeer(), pos, Pointer.getPeer(val)));
    }

    @Ptr
    protected native long g_string_insert_c(
        @Ptr
        long string, long pos, char c);

    public Pointer insert_c(long pos, char c) {
        return Pointer.pointerToAddress(this.g_string_insert_c(Pointer.pointerTo(this, GString.class).getPeer(), pos, c));
    }

    @Ptr
    protected native long g_string_insert_len(
        @Ptr
        long string, long pos,
        @Ptr
        long val, long len);

    public Pointer insert_len(long pos, Pointer val, long len) {
        return Pointer.pointerToAddress(this.g_string_insert_len(Pointer.pointerTo(this, GString.class).getPeer(), pos, Pointer.getPeer(val), len));
    }

    @Ptr
    protected native long g_string_insert_unichar(
        @Ptr
        long string, long pos, long wc);

    public Pointer insert_unichar(long pos, long wc) {
        return Pointer.pointerToAddress(this.g_string_insert_unichar(Pointer.pointerTo(this, GString.class).getPeer(), pos, wc));
    }

    @Ptr
    protected native long g_string_overwrite(
        @Ptr
        long string, long pos,
        @Ptr
        long val);

    public Pointer overwrite(long pos, Pointer val) {
        return Pointer.pointerToAddress(this.g_string_overwrite(Pointer.pointerTo(this, GString.class).getPeer(), pos, Pointer.getPeer(val)));
    }

    @Ptr
    protected native long g_string_overwrite_len(
        @Ptr
        long string, long pos,
        @Ptr
        long val, long len);

    public Pointer overwrite_len(long pos, Pointer val, long len) {
        return Pointer.pointerToAddress(this.g_string_overwrite_len(Pointer.pointerTo(this, GString.class).getPeer(), pos, Pointer.getPeer(val), len));
    }

    @Ptr
    protected native long g_string_prepend(
        @Ptr
        long string,
        @Ptr
        long val);

    public Pointer prepend(Pointer val) {
        return Pointer.pointerToAddress(this.g_string_prepend(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(val)));
    }

    @Ptr
    protected native long g_string_prepend_c(
        @Ptr
        long string, char c);

    public Pointer prepend_c(char c) {
        return Pointer.pointerToAddress(this.g_string_prepend_c(Pointer.pointerTo(this, GString.class).getPeer(), c));
    }

    @Ptr
    protected native long g_string_prepend_len(
        @Ptr
        long string,
        @Ptr
        long val, long len);

    public Pointer prepend_len(Pointer val, long len) {
        return Pointer.pointerToAddress(this.g_string_prepend_len(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(val), len));
    }

    @Ptr
    protected native long g_string_prepend_unichar(
        @Ptr
        long string, long wc);

    public Pointer prepend_unichar(long wc) {
        return Pointer.pointerToAddress(this.g_string_prepend_unichar(Pointer.pointerTo(this, GString.class).getPeer(), wc));
    }

    protected native void g_string_printf(
        @Ptr
        long string,
        @Ptr
        long format, Object... varargs);

    public void printf(Pointer format, Object... varargs) {
        this.g_string_printf(Pointer.pointerTo(this, GString.class).getPeer(), Pointer.getPeer(format), varargs);
    }

    @Ptr
    protected native long g_string_set_size(
        @Ptr
        long string, long len);

    public Pointer set_size(long len) {
        return Pointer.pointerToAddress(this.g_string_set_size(Pointer.pointerTo(this, GString.class).getPeer(), len));
    }

    @Ptr
    protected native long g_string_truncate(
        @Ptr
        long string, long len);

    public Pointer truncate(long len) {
        return Pointer.pointerToAddress(this.g_string_truncate(Pointer.pointerTo(this, GString.class).getPeer(), len));
    }

    @Ptr
    protected native long g_string_up(
        @Ptr
        long string);

    public Pointer up() {
        return Pointer.pointerToAddress(this.g_string_up(Pointer.pointerTo(this, GString.class).getPeer()));
    }

}
