
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileAttributeMatcher
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFileAttributeMatcher() {
        super();
    }

    public GFileAttributeMatcher(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_file_attribute_matcher_new(
        @Ptr
        long attributes);

    public static Pointer _new(Pointer attributes) {
        return Pointer.pointerToAddress(GFileAttributeMatcher.g_file_attribute_matcher_new(Pointer.getPeer(attributes)));
    }

    protected native boolean g_file_attribute_matcher_enumerate_namespace(
        @Ptr
        long matcher,
        @Ptr
        long ns);

    public boolean enumerate_namespace(Pointer ns) {
        return this.g_file_attribute_matcher_enumerate_namespace(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer(), Pointer.getPeer(ns));
    }

    @Ptr
    protected native long g_file_attribute_matcher_enumerate_next(
        @Ptr
        long matcher);

    public Pointer enumerate_next() {
        return Pointer.pointerToAddress(this.g_file_attribute_matcher_enumerate_next(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer()));
    }

    protected native boolean g_file_attribute_matcher_matches(
        @Ptr
        long matcher,
        @Ptr
        long attribute);

    public boolean matches(Pointer attribute) {
        return this.g_file_attribute_matcher_matches(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer(), Pointer.getPeer(attribute));
    }

    protected native boolean g_file_attribute_matcher_matches_only(
        @Ptr
        long matcher,
        @Ptr
        long attribute);

    public boolean matches_only(Pointer attribute) {
        return this.g_file_attribute_matcher_matches_only(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer(), Pointer.getPeer(attribute));
    }

    @Ptr
    protected native long g_file_attribute_matcher_ref(
        @Ptr
        long matcher);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_file_attribute_matcher_ref(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer()));
    }

    @Ptr
    protected native long g_file_attribute_matcher_subtract(
        @Ptr
        long matcher,
        @Ptr
        long subtract);

    public Pointer subtract(Pointer subtract) {
        return Pointer.pointerToAddress(this.g_file_attribute_matcher_subtract(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer(), Pointer.getPeer(subtract)));
    }

    @Ptr
    protected native long g_file_attribute_matcher_to_string(
        @Ptr
        long matcher);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.g_file_attribute_matcher_to_string(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer()));
    }

    protected native void g_file_attribute_matcher_unref(
        @Ptr
        long matcher);

    public void unref() {
        this.g_file_attribute_matcher_unref(Pointer.pointerTo(this, GFileAttributeMatcher.class).getPeer());
    }

}
