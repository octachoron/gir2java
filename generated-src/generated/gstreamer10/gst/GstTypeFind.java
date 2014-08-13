
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstTypeFind
    extends StructObject
{


    public GstTypeFind() {
        super();
    }

    public GstTypeFind(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTypeFind field_data(Pointer field_data) {
        this.io.setNativeObjectField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTypeFind field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

    protected native long gst_type_find_get_length(
        @Ptr
        long find);

    public long get_length() {
        return this.gst_type_find_get_length(Pointer.pointerTo(this, GstTypeFind.class));
    }

    @Ptr
    protected native long gst_type_find_peek(
        @Ptr
        long find, long offset, long size);

    public short peek(long offset, long size) {
        return Pointer.pointerToAddress(this.gst_type_find_peek(Pointer.pointerTo(this, GstTypeFind.class), offset, size), Short.class);
    }

    protected native void gst_type_find_suggest(
        @Ptr
        long find, long probability,
        @Ptr
        long caps);

    public void suggest(long probability, Pointer<GstCaps> caps) {
        this.gst_type_find_suggest(Pointer.pointerTo(this, GstTypeFind.class), probability, Pointer.getPeer(caps));
    }

    protected native void gst_type_find_suggest_simple(
        @Ptr
        long find, long probability,
        @Ptr
        long media_type,
        @Ptr
        long fieldname, Object... varargs);

    public void suggest_simple(long probability, Pointer media_type, Pointer fieldname, Object... varargs) {
        this.gst_type_find_suggest_simple(Pointer.pointerTo(this, GstTypeFind.class), probability, Pointer.getPeer(media_type), Pointer.getPeer(fieldname), varargs);
    }

    protected native boolean gst_type_find_register(
        @Ptr
        long plugin,
        @Ptr
        long name, long rank, Object func,
        @Ptr
        long extensions,
        @Ptr
        long possible_caps, Pointer data, Object data_notify);

    public boolean register(Pointer<GstPlugin> plugin, Pointer name, long rank, Object func, Pointer extensions, Pointer<GstCaps> possible_caps, Pointer data, Object data_notify) {
        return this.gst_type_find_register(Pointer.getPeer(plugin), Pointer.getPeer(name), rank, func, Pointer.getPeer(extensions), Pointer.getPeer(possible_caps), data, data_notify);
    }

}
