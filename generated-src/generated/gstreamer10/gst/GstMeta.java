
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstMeta
    extends StructObject
{


    public GstMeta() {
        super();
    }

    public GstMeta(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_meta_api_type_get_tags(long api);

    public Pointer api_type_get_tags(long api) {
        return Pointer.pointerToAddress(this.gst_meta_api_type_get_tags(api));
    }

    public native boolean gst_meta_api_type_has_tag(long api, Object tag);

    protected native long gst_meta_api_type_register(
        @Ptr
        long api,
        @Ptr
        long tags);

    public long api_type_register(Pointer api, Pointer tags) {
        return this.gst_meta_api_type_register(Pointer.getPeer(api), Pointer.getPeer(tags));
    }

    @Ptr
    protected native long gst_meta_get_info(
        @Ptr
        long impl);

    public Pointer<GstMetaInfo> get_info(Pointer impl) {
        return Pointer.pointerToAddress(this.gst_meta_get_info(Pointer.getPeer(impl)), Pointer.class);
    }

    @Ptr
    protected native long gst_meta_register(long api,
        @Ptr
        long impl, long size, Object init_func, Object free_func, Object transform_func);

    public Pointer<GstMetaInfo> register(long api, Pointer impl, long size, Object init_func, Object free_func, Object transform_func) {
        return Pointer.pointerToAddress(this.gst_meta_register(api, Pointer.getPeer(impl), size, init_func, free_func, transform_func), Pointer.class);
    }

    @Field(0)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstMeta field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 0, field_flags);
        return this;
    }

    @Field(1)
    public Pointer<GstMetaInfo> field_info() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstMeta field_info(Pointer<GstMetaInfo> field_info) {
        this.io.setPointerField(this, 1, field_info);
        return this;
    }

}
