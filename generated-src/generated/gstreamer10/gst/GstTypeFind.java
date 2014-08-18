
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTypeFind
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstTypeFind() {
        super();
    }

    public GstTypeFind(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstTypeFind field_data(Pointer field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstTypeFind field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

    protected native long gst_type_find_get_length(
        @Ptr
        long find);

    public long get_length() {
        return this.gst_type_find_get_length(Pointer.pointerTo(this, GstTypeFind.class).getPeer());
    }

    @Ptr
    protected native long gst_type_find_peek(
        @Ptr
        long find, long offset, long size);

    public Pointer<Short> peek(long offset, long size) {
        return Pointer.pointerToAddress(this.gst_type_find_peek(Pointer.pointerTo(this, GstTypeFind.class).getPeer(), offset, size), Short.class);
    }

    protected native void gst_type_find_suggest(
        @Ptr
        long find, long probability,
        @Ptr
        long caps);

    public void suggest(long probability, Pointer<GstCaps> caps) {
        this.gst_type_find_suggest(Pointer.pointerTo(this, GstTypeFind.class).getPeer(), probability, Pointer.getPeer(caps));
    }

    protected native void gst_type_find_suggest_simple(
        @Ptr
        long find, long probability,
        @Ptr
        long media_type,
        @Ptr
        long fieldname, Object... varargs);

    public void suggest_simple(long probability, Pointer media_type, Pointer fieldname, Object... varargs) {
        this.gst_type_find_suggest_simple(Pointer.pointerTo(this, GstTypeFind.class).getPeer(), probability, Pointer.getPeer(media_type), Pointer.getPeer(fieldname), varargs);
    }

    protected static native boolean gst_type_find_register(
        @Ptr
        long plugin,
        @Ptr
        long name, long rank,
        @Ptr
        long func,
        @Ptr
        long extensions,
        @Ptr
        long possible_caps,
        @Ptr
        long data,
        @Ptr
        long data_notify);

    public static boolean register(Pointer<GstPlugin> plugin, Pointer name, long rank, Pointer func, Pointer extensions, Pointer<GstCaps> possible_caps, Pointer data, Pointer data_notify) {
        return GstTypeFind.gst_type_find_register(Pointer.getPeer(plugin), Pointer.getPeer(name), rank, Pointer.getPeer(func), Pointer.getPeer(extensions), Pointer.getPeer(possible_caps), Pointer.getPeer(data), Pointer.getPeer(data_notify));
    }

}
