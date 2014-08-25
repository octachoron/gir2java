
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GStaticResource
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GStaticResource() {
        super();
    }

    public GStaticResource(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<Short> gstaticresource_field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GStaticResource gstaticresource_field_data(Pointer<Short> gstaticresource_field_data) {
        this.io.setPointerField(this, 0, gstaticresource_field_data);
        return this;
    }

    @Field(1)
    public long gstaticresource_field_data_len() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GStaticResource gstaticresource_field_data_len(long gstaticresource_field_data_len) {
        this.io.setLongField(this, 1, gstaticresource_field_data_len);
        return this;
    }

    @Field(2)
    public Pointer<GResource> gstaticresource_field_resource() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GStaticResource gstaticresource_field_resource(Pointer<GResource> gstaticresource_field_resource) {
        this.io.setPointerField(this, 2, gstaticresource_field_resource);
        return this;
    }

    @Field(3)
    public Pointer gstaticresource_field_next() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GStaticResource gstaticresource_field_next(Pointer gstaticresource_field_next) {
        this.io.setPointerField(this, 3, gstaticresource_field_next);
        return this;
    }

    @Field(4)
    public Pointer gstaticresource_field_padding() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GStaticResource gstaticresource_field_padding(Pointer gstaticresource_field_padding) {
        this.io.setPointerField(this, 4, gstaticresource_field_padding);
        return this;
    }

    protected native void g_static_resource_fini(
        @Ptr
        long static_resource);

    public void fini() {
        this.g_static_resource_fini(Pointer.pointerTo(this, GStaticResource.class).getPeer());
    }

    @Ptr
    protected native long g_static_resource_get_resource(
        @Ptr
        long static_resource);

    public Pointer<GResource> get_resource() {
        return Pointer.pointerToAddress(this.g_static_resource_get_resource(Pointer.pointerTo(this, GStaticResource.class).getPeer()), GResource.class);
    }

    protected native void g_static_resource_init(
        @Ptr
        long static_resource);

    public void init() {
        this.g_static_resource_init(Pointer.pointerTo(this, GStaticResource.class).getPeer());
    }

}
