
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstMeta
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstMeta() {
        super();
    }

    public GstMeta(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_meta_api_type_get_tags(long api);

    public static Pointer api_type_get_tags(long api) {
        return Pointer.pointerToAddress(GstMeta.gst_meta_api_type_get_tags(api));
    }

    protected static native long gst_meta_api_type_register(
        @Ptr
        long api,
        @Ptr
        long tags);

    public static long api_type_register(Pointer api, Pointer tags) {
        return GstMeta.gst_meta_api_type_register(Pointer.getPeer(api), Pointer.getPeer(tags));
    }

    @Field(0)
    public IntValuedEnum<GstMetaFlags> gstmeta_field_flags() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstMeta gstmeta_field_flags(IntValuedEnum<GstMetaFlags> gstmeta_field_flags) {
        this.io.setEnumField(this, 0, gstmeta_field_flags);
        return this;
    }

    @Ptr
    protected static native long gst_meta_get_info(
        @Ptr
        long impl);

    public static Pointer<GstMetaInfo> get_info(Pointer impl) {
        return Pointer.pointerToAddress(GstMeta.gst_meta_get_info(Pointer.getPeer(impl)), GstMetaInfo.class);
    }

    public static native boolean gst_meta_api_type_has_tag(long api, long tag);

    @Field(1)
    public Pointer<GstMetaInfo> gstmeta_field_info() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstMeta gstmeta_field_info(Pointer<GstMetaInfo> gstmeta_field_info) {
        this.io.setPointerField(this, 1, gstmeta_field_info);
        return this;
    }

    @Ptr
    protected static native long gst_meta_register(long api,
        @Ptr
        long impl, long size,
        @Ptr
        long init_func,
        @Ptr
        long free_func,
        @Ptr
        long transform_func);

    public static Pointer<GstMetaInfo> register(long api, Pointer impl, long size, Pointer init_func, Pointer free_func, Pointer transform_func) {
        return Pointer.pointerToAddress(GstMeta.gst_meta_register(api, Pointer.getPeer(impl), size, Pointer.getPeer(init_func), Pointer.getPeer(free_func), Pointer.getPeer(transform_func)), GstMetaInfo.class);
    }

}
