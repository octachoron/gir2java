
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GMatchInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMatchInfo() {
        super();
    }

    public GMatchInfo(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_match_info_expand_references(
        @Ptr
        long match_info,
        @Ptr
        long string_to_expand);

    public Pointer expand_references(Pointer string_to_expand) {
        return Pointer.pointerToAddress(this.g_match_info_expand_references(Pointer.pointerTo(this, GMatchInfo.class).getPeer(), Pointer.getPeer(string_to_expand)));
    }

    @Ptr
    protected native long g_match_info_fetch(
        @Ptr
        long match_info, int match_num);

    public Pointer fetch(int match_num) {
        return Pointer.pointerToAddress(this.g_match_info_fetch(Pointer.pointerTo(this, GMatchInfo.class).getPeer(), match_num));
    }

    @Ptr
    protected native long g_match_info_fetch_all(
        @Ptr
        long match_info);

    public Pointer fetch_all() {
        return Pointer.pointerToAddress(this.g_match_info_fetch_all(Pointer.pointerTo(this, GMatchInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_match_info_fetch_named(
        @Ptr
        long match_info,
        @Ptr
        long name);

    public Pointer fetch_named(Pointer name) {
        return Pointer.pointerToAddress(this.g_match_info_fetch_named(Pointer.pointerTo(this, GMatchInfo.class).getPeer(), Pointer.getPeer(name)));
    }

    protected native boolean g_match_info_fetch_named_pos(
        @Ptr
        long match_info,
        @Ptr
        long name,
        @Ptr
        long start_pos,
        @Ptr
        long end_pos);

    public boolean fetch_named_pos(Pointer name, Pointer<Integer> start_pos, Pointer<Integer> end_pos) {
        return this.g_match_info_fetch_named_pos(Pointer.pointerTo(this, GMatchInfo.class).getPeer(), Pointer.getPeer(name), Pointer.getPeer(start_pos), Pointer.getPeer(end_pos));
    }

    protected native boolean g_match_info_fetch_pos(
        @Ptr
        long match_info, int match_num,
        @Ptr
        long start_pos,
        @Ptr
        long end_pos);

    public boolean fetch_pos(int match_num, Pointer<Integer> start_pos, Pointer<Integer> end_pos) {
        return this.g_match_info_fetch_pos(Pointer.pointerTo(this, GMatchInfo.class).getPeer(), match_num, Pointer.getPeer(start_pos), Pointer.getPeer(end_pos));
    }

    protected native void g_match_info_free(
        @Ptr
        long match_info);

    public void free() {
        this.g_match_info_free(Pointer.pointerTo(this, GMatchInfo.class).getPeer());
    }

    protected native int g_match_info_get_match_count(
        @Ptr
        long match_info);

    public int get_match_count() {
        return this.g_match_info_get_match_count(Pointer.pointerTo(this, GMatchInfo.class).getPeer());
    }

    @Ptr
    protected native long g_match_info_get_regex(
        @Ptr
        long match_info);

    public Pointer get_regex() {
        return Pointer.pointerToAddress(this.g_match_info_get_regex(Pointer.pointerTo(this, GMatchInfo.class).getPeer()));
    }

    @Ptr
    protected native long g_match_info_get_string(
        @Ptr
        long match_info);

    public Pointer get_string() {
        return Pointer.pointerToAddress(this.g_match_info_get_string(Pointer.pointerTo(this, GMatchInfo.class).getPeer()));
    }

    protected native boolean g_match_info_is_partial_match(
        @Ptr
        long match_info);

    public boolean is_partial_match() {
        return this.g_match_info_is_partial_match(Pointer.pointerTo(this, GMatchInfo.class).getPeer());
    }

    protected native boolean g_match_info_matches(
        @Ptr
        long match_info);

    public boolean matches() {
        return this.g_match_info_matches(Pointer.pointerTo(this, GMatchInfo.class).getPeer());
    }

    protected native boolean g_match_info_next(
        @Ptr
        long match_info);

    public boolean next() {
        return this.g_match_info_next(Pointer.pointerTo(this, GMatchInfo.class).getPeer());
    }

    @Ptr
    protected native long g_match_info_ref(
        @Ptr
        long match_info);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_match_info_ref(Pointer.pointerTo(this, GMatchInfo.class).getPeer()));
    }

    protected native void g_match_info_unref(
        @Ptr
        long match_info);

    public void unref() {
        this.g_match_info_unref(Pointer.pointerTo(this, GMatchInfo.class).getPeer());
    }

}
