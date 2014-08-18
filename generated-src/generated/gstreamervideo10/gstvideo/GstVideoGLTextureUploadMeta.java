
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoGLTextureUploadMeta
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoGLTextureUploadMeta() {
        super();
    }

    public GstVideoGLTextureUploadMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoGLTextureUploadMeta field_meta(GstMeta field_meta) {
        this.io.setNativeObjectField(this, 0, field_meta);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstVideoGLTextureOrientation> field_texture_orientation() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstVideoGLTextureUploadMeta field_texture_orientation(IntValuedEnum<GstVideoGLTextureOrientation> field_texture_orientation) {
        this.io.setEnumField(this, 1, field_texture_orientation);
        return this;
    }

    @Field(2)
    public long field_n_textures() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstVideoGLTextureUploadMeta field_n_textures(long field_n_textures) {
        this.io.setLongField(this, 2, field_n_textures);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GstVideoGLTextureType> field_texture_type() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstVideoGLTextureUploadMeta field_texture_type(IntValuedEnum<GstVideoGLTextureType> field_texture_type) {
        this.io.setEnumField(this, 3, field_texture_type);
        return this;
    }

    @Field(4)
    private Pointer<GstBuffer> field_buffer() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstVideoGLTextureUploadMeta field_buffer(Pointer<GstBuffer> field_buffer) {
        this.io.setPointerField(this, 4, field_buffer);
        return this;
    }

    @Field(5)
    private Pointer field_upload() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstVideoGLTextureUploadMeta field_upload(Pointer field_upload) {
        this.io.setPointerField(this, 5, field_upload);
        return this;
    }

    @Field(6)
    private Pointer field_user_data() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstVideoGLTextureUploadMeta field_user_data(Pointer field_user_data) {
        this.io.setPointerField(this, 6, field_user_data);
        return this;
    }

    @Field(7)
    private Pointer field_user_data_copy() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GstVideoGLTextureUploadMeta field_user_data_copy(Pointer field_user_data_copy) {
        this.io.setPointerField(this, 7, field_user_data_copy);
        return this;
    }

    @Field(8)
    private Pointer field_user_data_free() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    private GstVideoGLTextureUploadMeta field_user_data_free(Pointer field_user_data_free) {
        this.io.setPointerField(this, 8, field_user_data_free);
        return this;
    }

    protected native boolean gst_video_gl_texture_upload_meta_upload(
        @Ptr
        long meta, long texture_id);

    public boolean upload(long texture_id) {
        return this.gst_video_gl_texture_upload_meta_upload(Pointer.pointerTo(this, GstVideoGLTextureUploadMeta.class).getPeer(), texture_id);
    }

    @Ptr
    protected static native long gst_video_gl_texture_upload_meta_get_info();

    public static Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(GstVideoGLTextureUploadMeta.gst_video_gl_texture_upload_meta_get_info(), GstMetaInfo.class);
    }

}
